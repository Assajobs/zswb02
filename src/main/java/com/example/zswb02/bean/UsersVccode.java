package com.example.zswb02.bean;

import java.io.Serializable;

public class UsersVccode  implements Serializable {

    private String yzm;
    /**
     * 用户编号 自增，主键
     */
    private Integer userId;

    /**
     * 用户昵称 非空
     */
    private String userName;

    /**
     * 用户邮箱 非空，唯一
     */
    private String userEmail;

    /**
     * 用户密码 非空
     */
    private String userPassword;

    /**
     * 用户角色 非空（0代表项目发布者，1代表项目接单者）
     */
    private Integer userRole;

    public String getYzm() {
        return yzm;
    }

    public void setYzm(String yzm) {
        this.yzm = yzm;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }



    public UsersVccode( String userName, String userEmail, String userPassword, Integer userRole) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "UsersVccode{" +
                "yzm=" + yzm +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userRole=" + userRole +
                '}';
    }
}
