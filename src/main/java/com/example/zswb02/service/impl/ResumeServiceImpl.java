package com.example.zswb02.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.zswb02.bean.Resume;
import com.example.zswb02.dao.ResumeMapper;
import com.example.zswb02.service.ResumeService;
@Service
public class ResumeServiceImpl implements ResumeService{

    @Resource
    private ResumeMapper resumeMapper;

    @Override
    public int deleteByPrimaryKey(Integer rusumeId) {
        return resumeMapper.deleteByPrimaryKey(rusumeId);
    }

    @Override
    public int insert(Resume record) {
        return resumeMapper.insert(record);
    }

    @Override
    public int insertSelective(Resume record) {
        return resumeMapper.insertSelective(record);
    }

    @Override
    public Resume selectByPrimaryKey(Integer rusumeId) {
        return resumeMapper.selectByPrimaryKey(rusumeId);
    }

    @Override
    public int updateByPrimaryKeySelective(Resume record) {
        return resumeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Resume record) {
        return resumeMapper.updateByPrimaryKey(record);
    }

}
