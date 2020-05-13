package com.example.zswb02.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Users {
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
}