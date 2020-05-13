package com.example.zswb02.bean;

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

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Double getProjectBudget() {
        return projectBudget;
    }

    public void setProjectBudget(Double projectBudget) {
        this.projectBudget = projectBudget;
    }

    public String getProjectIntroduce() {
        return projectIntroduce;
    }

    public void setProjectIntroduce(String projectIntroduce) {
        this.projectIntroduce = projectIntroduce;
    }

    public String getProjectFile() {
        return projectFile;
    }

    public void setProjectFile(String projectFile) {
        this.projectFile = projectFile;
    }

    public Integer getProjectPublisher() {
        return projectPublisher;
    }

    public void setProjectPublisher(Integer projectPublisher) {
        this.projectPublisher = projectPublisher;
    }
}