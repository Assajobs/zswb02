package com.example.zswb02.service;

import com.example.zswb02.bean.Identification;
public interface IdentificationService{


    int deleteByPrimaryKey(Integer identityId);

    int insert(Identification record);

    int insertSelective(Identification record);

    Identification selectByPrimaryKey(Integer identityId);

    int updateByPrimaryKeySelective(Identification record);

    int updateByPrimaryKey(Identification record);

}
