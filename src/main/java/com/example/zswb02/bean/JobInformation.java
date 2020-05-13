package com.example.zswb02.bean;

import java.util.Date;
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
}