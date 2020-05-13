package com.example.zswb02.bean;

import java.io.Serializable;

public class Identification implements Serializable {
    /**
     * 认证编号 自增、主键
     */
    private Integer identityId;

    /**
     * 身份证号 非空
     */
    private String identityCard;

    /**
     * 所属人 非空
     */
    private Integer identityPerson;


    public Integer getIdentityId() {
        return identityId;
    }

    public void setIdentityId(Integer identityId) {
        this.identityId = identityId;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public Integer getIdentityPerson() {
        return identityPerson;
    }

    public void setIdentityPerson(Integer identityPerson) {
        this.identityPerson = identityPerson;
    }
}