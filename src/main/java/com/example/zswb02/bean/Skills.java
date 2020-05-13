package com.example.zswb02.bean;

public class Skills {
    /**
     * 技能编号 自增、主键
     */
    private Integer skillId;

    /**
     * 经验自评 非空
     */
    private String skillEvaluate;

    /**
     * 所属人 非空
     */
    private Integer skillPerson;

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public String getSkillEvaluate() {
        return skillEvaluate;
    }

    public void setSkillEvaluate(String skillEvaluate) {
        this.skillEvaluate = skillEvaluate;
    }

    public Integer getSkillPerson() {
        return skillPerson;
    }

    public void setSkillPerson(Integer skillPerson) {
        this.skillPerson = skillPerson;
    }
}