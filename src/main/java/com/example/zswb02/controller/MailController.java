package com.example.zswb02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class MailController {
    @Autowired
    private JavaMailSender mailSender;

    @GetMapping("/sendMail")
    @ResponseBody
    public String sendMail(){
        //创建一封邮件
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setFrom("316545010@qq.com");
        mail.setSubject("主题");
        mail.setText("内容");
        mail.setSentDate(new Date());
        mail.setTo("nqjack@aliyun.com", "958430327@qq.com");

        //发送
        mailSender.send(mail);
        return "success";

    }
}
