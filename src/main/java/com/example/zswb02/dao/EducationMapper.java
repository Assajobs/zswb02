package com.example.zswb02.dao;

import com.example.zswb02.bean.Education;

public interface EducationMapper {
    int deleteByPrimaryKey(Integer educationId);

    int insert(Education record);

    int insertSelective(Education record);

    Education selectByPrimaryKey(Integer educationId);

    int updateByPrimaryKeySelective(Education record);

    int updateByPrimaryKey(Education record);
}