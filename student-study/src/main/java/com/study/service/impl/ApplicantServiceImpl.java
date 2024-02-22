package com.study.service.impl;

import com.study.vo.ApplicantVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.study.dao.ApplicantDao;
import com.study.entity.ApplicantEntity;
import com.study.service.ApplicantService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service("applicantService")
public class ApplicantServiceImpl extends ServiceImpl<ApplicantDao, ApplicantEntity> implements ApplicantService {

    @Autowired
    private ApplicantDao applicantDao;

    @Override
    public Map<String, Object> queryPage(ApplicantVo applicantVo) {
        Integer total = applicantDao.queryCount(applicantVo);
        List<HashMap> data = applicantDao.queryData(applicantVo);
        Map<String, Object> result = new HashMap<>();
        result.put("total",total);
        result.put("data",data);
        return result;
    }
}