package com.example.zswb02.bean;

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

    public Integer getWorksId() {
        return worksId;
    }

    public void setWorksId(Integer worksId) {
        this.worksId = worksId;
    }

    public String getWorksName() {
        return worksName;
    }

    public void setWorksName(String worksName) {
        this.worksName = worksName;
    }

    public String getWorksTrade() {
        return worksTrade;
    }

    public void setWorksTrade(String worksTrade) {
        this.worksTrade = worksTrade;
    }

    public String getWorksKeyword() {
        return worksKeyword;
    }

    public void setWorksKeyword(String worksKeyword) {
        this.worksKeyword = worksKeyword;
    }

    public Integer getWorksHref() {
        return worksHref;
    }

    public void setWorksHref(Integer worksHref) {
        this.worksHref = worksHref;
    }

    public String getWorksDuty() {
        return worksDuty;
    }

    public void setWorksDuty(String worksDuty) {
        this.worksDuty = worksDuty;
    }

    public String getWorksImage() {
        return worksImage;
    }

    public void setWorksImage(String worksImage) {
        this.worksImage = worksImage;
    }

    public Integer getWorksPerson() {
        return worksPerson;
    }

    public void setWorksPerson(Integer worksPerson) {
        this.worksPerson = worksPerson;
    }
}