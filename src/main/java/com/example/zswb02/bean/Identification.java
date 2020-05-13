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
public class Identification {
    /**
     * 认证编号 自增、主键
     */
    private Integer identityId;

    /**
     * 身份证号 非空
     */
    private String identityCard;

    /**
     * 所属人 非空
     */
    private Integer identityPerson;
}