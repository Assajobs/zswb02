package com.example.zswb02.service;

import com.example.zswb02.bean.JobInformation;
public interface JobInformationService{


    int deleteByPrimaryKey(Integer jobId);

    int insert(JobInformation record);

    int insertSelective(JobInformation record);

    JobInformation selectByPrimaryKey(Integer jobId);

    int updateByPrimaryKeySelective(JobInformation record);

    int updateByPrimaryKey(JobInformation record);

}
