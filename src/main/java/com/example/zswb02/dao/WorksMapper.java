package com.example.zswb02.dao;

import com.example.zswb02.bean.Works;

public interface WorksMapper {
    int deleteByPrimaryKey(Integer worksId);

    int insert(Works record);

    int insertSelective(Works record);

    Works selectByPrimaryKey(Integer worksId);

    int updateByPrimaryKeySelective(Works record);

    int updateByPrimaryKey(Works record);
}