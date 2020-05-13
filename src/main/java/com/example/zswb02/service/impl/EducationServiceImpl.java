package com.example.zswb02.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.zswb02.bean.Education;
import com.example.zswb02.dao.EducationMapper;
import com.example.zswb02.service.EducationService;
@Service
public class EducationServiceImpl implements EducationService{

    @Resource
    private EducationMapper educationMapper;

    @Override
    public int deleteByPrimaryKey(Integer educationId) {
        return educationMapper.deleteByPrimaryKey(educationId);
    }

    @Override
    public int insert(Education record) {
        return educationMapper.insert(record);
    }

    @Override
    public int insertSelective(Education record) {
        return educationMapper.insertSelective(record);
    }

    @Override
    public Education selectByPrimaryKey(Integer educationId) {
        return educationMapper.selectByPrimaryKey(educationId);
    }

    @Override
    public int updateByPrimaryKeySelective(Education record) {
        return educationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Education record) {
        return educationMapper.updateByPrimaryKey(record);
    }

}
