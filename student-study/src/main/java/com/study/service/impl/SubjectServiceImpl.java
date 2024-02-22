package com.study.service.impl;

import com.study.vo.SubjectVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.study.dao.SubjectDao;
import com.study.entity.SubjectEntity;
import com.study.service.SubjectService;


@Service("subjectService")
public class SubjectServiceImpl extends ServiceImpl<SubjectDao, SubjectEntity> implements SubjectService {

    @Autowired
    private SubjectDao subjectDao;

    @Override
    public Map<String, Object> queryPage(SubjectVo subjectVo) {
        Integer total = subjectDao.queryCount(subjectVo);
        List<HashMap> data = subjectDao.queryData(subjectVo);
        Map<String, Object> result = new HashMap<>();
        result.put("total",total);
        result.put("data",data);
        return result;
    }

    @Override
    public List<HashMap> queryList(SubjectVo subjectVo) {
        List<HashMap> data = subjectDao.queryList(subjectVo);
        return data;
    }

    @Override
    public Map<String, Object> findPage(SubjectVo subjectVo) {
        Integer total = subjectDao.findPageCount(subjectVo);
        List<HashMap> data = subjectDao.findPageData(subjectVo);
        Map<String, Object> result = new HashMap<>();
        result.put("total",total);
        result.put("data",data);
        return result;
    }
}