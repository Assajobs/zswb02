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
public class Works {
    /**
     * 作品编号 自增、主键
     */
    private Integer worksId;

    /**
     * 作品名称 非空、唯一
     */
    private String worksName;

    /**
     * 所属行业 非空
     */
    private String worksTrade;

    /**
     * 关键词 非空
     */
    private String worksKeyword;

    /**
     * 作品链接 非空
     */
    private Integer worksHref;

    /**
     * 作品职责 非空
     */
    private String worksDuty;

    /**
     * 作品截图 非空
     */
    private String worksImage;

    /**
     * 所属人 非空
     */
    private Integer worksPerson;
}