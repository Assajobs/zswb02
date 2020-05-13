package com.example.zswb02.service;

import com.example.zswb02.bean.Education;
public interface EducationService{


    int deleteByPrimaryKey(Integer educationId);

    int insert(Education record);

    int insertSelective(Education record);

    Education selectByPrimaryKey(Integer educationId);

    int updateByPrimaryKeySelective(Education record);

    int updateByPrimaryKey(Education record);

}
