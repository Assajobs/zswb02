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
public class Project {
    /**
     * 项目编号 自增，主键
     */
    private Integer projectId;

    /**
     * 项目名称 非空
     */
    private String projectName;

    /**
     * 项目预算 非空
     */
    private Double projectBudget;

    /**
     * 项目介绍 非空
     */
    private String projectIntroduce;

    /**
     * 项目文档 非空
     */
    private String projectFile;

    /**
     * 项目发布者 非空
     */
    private Integer projectPublisher;
}