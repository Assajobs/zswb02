package com.example.zswb02.dao;

import com.example.zswb02.bean.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    //根据邮箱查询
    String selectByEmail(String userEmail);
}