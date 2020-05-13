package com.example.zswb02.bean;

import java.util.Date;

public class Education {
    /**
     * 编号 自增、主键
     */
    private Integer educationId;

    /**
     * 开始时间 非空
     */
    private Date educationStart;

    /**
     * 结束时间 非空
     */
    private Date educationEnd;

    /**
     * 学校名称 非空
     */
    private String schoolName;

    /**
     * 专业 非空
     */
    private String profession;

    /**
     * 学历层次 非空
     */
    private String educationLevel;

    /**
     * 所属人 非空
     */
    private Integer educationPerson;

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public Date getEducationStart() {
        return educationStart;
    }

    public void setEducationStart(Date educationStart) {
        this.educationStart = educationStart;
    }

    public Date getEducationEnd() {
        return educationEnd;
    }

    public void setEducationEnd(Date educationEnd) {
        this.educationEnd = educationEnd;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public Integer getEducationPerson() {
        return educationPerson;
    }

    public void setEducationPerson(Integer educationPerson) {
        this.educationPerson = educationPerson;
    }
}