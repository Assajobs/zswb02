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
}