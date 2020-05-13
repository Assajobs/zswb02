package com.example.zswb02.bean;

public class Resume {
    /**
     * 简历编号 自增、主键
     */
    private Integer rusumeId;

    /**
     * 工作状态 非空
     */
    private String resumeWorkstatus;

    /**
     * 职业方向 非空
     */
    private String resumeWorkdirection;

    /**
     * 具体工作 非空
     */
    private String resumeSpecificwork;

    /**
     * 技能 非空
     */
    private Integer resumeSkill;

    /**
     * 个人作品 非空
     */
    private Integer resumeWroks;

    /**
     * 个人介绍 非空
     */
    private String resumeIntroduce;

    /**
     * 所属人 非空
     */
    private Integer resumePerson;

    public Integer getRusumeId() {
        return rusumeId;
    }

    public void setRusumeId(Integer rusumeId) {
        this.rusumeId = rusumeId;
    }

    public String getResumeWorkstatus() {
        return resumeWorkstatus;
    }

    public void setResumeWorkstatus(String resumeWorkstatus) {
        this.resumeWorkstatus = resumeWorkstatus;
    }

    public String getResumeWorkdirection() {
        return resumeWorkdirection;
    }

    public void setResumeWorkdirection(String resumeWorkdirection) {
        this.resumeWorkdirection = resumeWorkdirection;
    }

    public String getResumeSpecificwork() {
        return resumeSpecificwork;
    }

    public void setResumeSpecificwork(String resumeSpecificwork) {
        this.resumeSpecificwork = resumeSpecificwork;
    }

    public Integer getResumeSkill() {
        return resumeSkill;
    }

    public void setResumeSkill(Integer resumeSkill) {
        this.resumeSkill = resumeSkill;
    }

    public Integer getResumeWroks() {
        return resumeWroks;
    }

    public void setResumeWroks(Integer resumeWroks) {
        this.resumeWroks = resumeWroks;
    }

    public String getResumeIntroduce() {
        return resumeIntroduce;
    }

    public void setResumeIntroduce(String resumeIntroduce) {
        this.resumeIntroduce = resumeIntroduce;
    }

    public Integer getResumePerson() {
        return resumePerson;
    }

    public void setResumePerson(Integer resumePerson) {
        this.resumePerson = resumePerson;
    }
}