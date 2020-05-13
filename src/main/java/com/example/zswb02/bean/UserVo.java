package com.example.zswb02.bean;

import java.io.Serializable;
public class UserVo implements Serializable {
    /*
    * 用户邮箱 非空/唯一
    * */
    private String userEmail;
    /*
    * 用户密码 非空
    * */
    private String userPassword;

    public UserVo(String userEmail, String userPassword) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
