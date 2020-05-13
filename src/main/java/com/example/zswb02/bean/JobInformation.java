package com.example.zswb02.bean;

import java.util.Date;

public class JobInformation {
    /**
    * 工作信息编号 自增、非空
    */
    private Integer jobId;

    /**
    * 工作日时间 非空
    */
    private Date jobTime;

    /**
    * 非工作日时间 非空
    */
    private Date jobUntime;

    /**
    * 可工作地址 非空
    */
    private String jobAddress;

    /**
    * 周工作时长 非空
    */
    private Integer jobHours;

    /**
    * 日薪 非空
    */
    private Double jobDaysal;

    /**
    * 工作形式 非空
    */
    private String jobPattern;

    /**
    * 所属人 非空
    */
    private Integer jobPerson;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Date getJobTime() {
        return jobTime;
    }

    public void setJobTime(Date jobTime) {
        this.jobTime = jobTime;
    }

    public Date getJobUntime() {
        return jobUntime;
    }

    public void setJobUntime(Date jobUntime) {
        this.jobUntime = jobUntime;
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress;
    }

    public Integer getJobHours() {
        return jobHours;
    }

    public void setJobHours(Integer jobHours) {
        this.jobHours = jobHours;
    }

    public Double getJobDaysal() {
        return jobDaysal;
    }

    public void setJobDaysal(Double jobDaysal) {
        this.jobDaysal = jobDaysal;
    }

    public String getJobPattern() {
        return jobPattern;
    }

    public void setJobPattern(String jobPattern) {
        this.jobPattern = jobPattern;
    }

    public Integer getJobPerson() {
        return jobPerson;
    }

    public void setJobPerson(Integer jobPerson) {
        this.jobPerson = jobPerson;
    }
}