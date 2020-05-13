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
}