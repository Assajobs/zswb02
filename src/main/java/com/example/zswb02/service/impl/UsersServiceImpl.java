package com.example.zswb02.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.zswb02.dao.UsersMapper;
import com.example.zswb02.bean.Users;
import com.example.zswb02.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService{

    @Resource
    private UsersMapper usersMapper;

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return usersMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(Users record) {
        return usersMapper.insert(record);
    }

    @Override
    public int insertSelective(Users record) {
        return usersMapper.insertSelective(record);
    }

    @Override
    public Users selectByPrimaryKey(Integer userId) {
        return usersMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(Users record) {
        return usersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Users record) {
        return usersMapper.updateByPrimaryKey(record);
    }

}
