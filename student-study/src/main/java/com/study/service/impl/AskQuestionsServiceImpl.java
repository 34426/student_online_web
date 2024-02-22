package com.study.service.impl;

import com.study.vo.AskQuestionsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;



import com.study.dao.AskQuestionsDao;
import com.study.entity.AskQuestionsEntity;
import com.study.service.AskQuestionsService;


@Service("askQuestionsService")
public class AskQuestionsServiceImpl extends ServiceImpl<AskQuestionsDao, AskQuestionsEntity> implements AskQuestionsService {

    @Autowired
    private AskQuestionsDao askQuestionsDao;


    @Override
    public Map<String, Object> queryPage(AskQuestionsVo askQuestionsVo) {
        Integer total = askQuestionsDao.queryCount(askQuestionsVo);
        List<HashMap> data = askQuestionsDao.queryData(askQuestionsVo);
        Map<String, Object> result = new HashMap<>();
        result.put("total",total);
        result.put("data",data);
        return result;
    }
}