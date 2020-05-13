package com.example.zswb02.controller;

import com.example.zswb02.bean.UserVo;
import com.example.zswb02.bean.Users;
import com.example.zswb02.bean.UsersVccode;
import com.example.zswb02.dao.UserVoMapper;
import com.example.zswb02.dao.UsersMapper;
import com.example.zswb02.util.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/user")
@Api(value = "用户模块")
public class UserController {
    @Autowired
    UsersMapper usersMapper;
    @Autowired
    UserVoMapper userVoMapper;
    //邮件发送
    @Autowired
    JavaMailSenderImpl mailSender;
    //redis连接
    @Autowired
    private RedisTemplate redisTemplate;

    @PostMapping("/login")
    @ApiOperation("用户登录")
    public R login(@RequestBody UserVo vo, HttpSession session) {
        //获取输入的值
        String userEmail = vo.getUserEmail();
        String userPassword = vo.getUserPassword();
        //密码加密
        byte[] bytes = userPassword.getBytes();
        String s = DigestUtils.md5DigestAsHex(bytes);
        //验证是否正确
        if (!StringUtils.isEmpty(userEmail) && !StringUtils.isEmpty(s)) {
            UserVo userVo = new UserVo(userEmail, s);
            UserVo userVo1 = userVoMapper.selectUser(userVo);
            if (userVo1 != null) {
                String s1 = usersMapper.selectByEmail(userEmail);
                //将用户信息存入session中
                session.setAttribute("uid",s1);
                System.out.println("登陆成功===="+s1);
                return R.ok().data("msg", "登录成功");
            } else {
                return R.error().data("msg", "用户名或密码错误");
            }
        }
        return R.error().data("msg", "用户名或密码不能为空");
    }

    @PostMapping("/sendEmail")
    @ApiOperation("发送邮箱")
    public R send(@RequestBody UserVo vo) {

        String userEmail = vo.getUserEmail();
        //验证码发送
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("验证码");
        String s1 = String.valueOf((int) (Math.random() * 10));
        String s2 = String.valueOf((int) (Math.random() * 10));
        String s3 = String.valueOf((int) (Math.random() * 10));
        String s4 = String.valueOf((int) (Math.random() * 10));
        String s5 = String.valueOf((int) (Math.random() * 10));
        String s6 = String.valueOf((int) (Math.random() * 10));
        String mssage =s1+s2+s3+s4+s5+s6;
        message.setText("您的验证码是" + mssage + "此验证码5分钟内有效");
        message.setTo(userEmail);
        message.setFrom("779766816@qq.com");
        try {
            mailSender.send(message);
            //将生成的验证码存入redis中
            redisTemplate.opsForValue().set("ee", mssage,5, TimeUnit.MINUTES);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error().data("msg", "邮箱有误");
        }
        return R.ok().data("yzm", message);
    }


    @PostMapping("/cEmain")
    @ApiOperation("检查邮箱是否已经被注册")
    public R checkEmain(@RequestBody  UserVo vo) {
        String userEmail = vo.getUserEmail();
        //根据邮箱查询是否有这个id
        String userName=usersMapper.selectByEmail(userEmail);
        System.out.println("========检查邮箱========"+userName);
        if (userName==null) {
            return R.ok().data("msg", "邮箱没有被注册，可以使用");
        } else {
            return R.error().data("msg", "邮箱已经被注册");
        }

    }

    @PostMapping("/register")
    @ApiOperation("用户注册")
    public R register(@RequestBody UsersVccode u) {
        System.out.println(u);
        //从redis中取出的验证码
        String s = (String) redisTemplate.opsForValue().get("ee");
        System.out.println(s);

        //判断验证码是否正确
        if (s.equals(u.getYzm())) {
            //对密码加密
            byte[] bytes = u.getUserPassword().getBytes();
            String s1 = DigestUtils.md5DigestAsHex(bytes);
            Users users = new Users(u.getUserName(), u.getUserEmail(), s1,u.getUserRole());
            //将用户信息存入数据库中
            usersMapper.insert(users);
            return R.ok().data("msg", "注册成功");
        } else {
            return R.error().data("msg", "验证码输入有误");
        }

    }

    @PostMapping("/ftpassword")
    @ApiOperation("忘记密码")
    public R ftpassword(@RequestBody UserVo vo) {

        String userPassword = vo.getUserPassword();
        String userEmail = vo.getUserEmail();
        byte[] bytes = userPassword.getBytes();
        String s1 = DigestUtils.md5DigestAsHex(bytes);

        int b=userVoMapper.updatePassword(userEmail, s1);
        if (b == 1) {
            return   R.ok().data("msg", "修改成功");
        }else {
            return  R.error().data("msg", "修改失败");
        }
    }



}
