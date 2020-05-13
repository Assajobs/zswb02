package com.example.zswb02.dao;

import com.example.zswb02.bean.UserVo;

public interface UserVoMapper {
    UserVo selectUser(UserVo userVo);
    int updatePassword(String email, String password);
}
