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
}