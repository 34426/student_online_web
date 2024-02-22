package com.study.service.impl;

import com.study.vo.KnowledgePointVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;



import com.study.dao.KnowledgePointDao;
import com.study.entity.KnowledgePointEntity;
import com.study.service.KnowledgePointService;


@Service("knowledgePointService")
public class KnowledgePointServiceImpl extends ServiceImpl<KnowledgePointDao, KnowledgePointEntity> implements KnowledgePointService {

    @Autowired
    private KnowledgePointDao knowledgePointDao;

    @Override
    public Map<String, Object> queryPage(KnowledgePointVo knowledgePointVo) {
        Integer total = knowledgePointDao.queryCount(knowledgePointVo);
        List<HashMap> data = knowledgePointDao.queryData(knowledgePointVo);
        Map<String, Object> result = new HashMap<>();
        result.put("total",total);
        result.put("data",data);
        return result;
    }
}