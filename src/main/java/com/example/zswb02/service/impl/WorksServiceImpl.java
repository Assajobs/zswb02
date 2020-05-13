package com.example.zswb02.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.zswb02.bean.Works;
import com.example.zswb02.dao.WorksMapper;
import com.example.zswb02.service.WorksService;
@Service
public class WorksServiceImpl implements WorksService{

    @Resource
    private WorksMapper worksMapper;

    @Override
    public int deleteByPrimaryKey(Integer worksId) {
        return worksMapper.deleteByPrimaryKey(worksId);
    }

    @Override
    public int insert(Works record) {
        return worksMapper.insert(record);
    }

    @Override
    public int insertSelective(Works record) {
        return worksMapper.insertSelective(record);
    }

    @Override
    public Works selectByPrimaryKey(Integer worksId) {
        return worksMapper.selectByPrimaryKey(worksId);
    }

    @Override
    public int updateByPrimaryKeySelective(Works record) {
        return worksMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Works record) {
        return worksMapper.updateByPrimaryKey(record);
    }

}
