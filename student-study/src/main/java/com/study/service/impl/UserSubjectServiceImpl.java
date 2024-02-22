package com.study.service.impl;

import com.study.vo.UserSubjectVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.study.dao.UserSubjectDao;
import com.study.entity.UserSubjectEntity;
import com.study.service.UserSubjectService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service("userSubjectService")
public class UserSubjectServiceImpl extends ServiceImpl<UserSubjectDao, UserSubjectEntity> implements UserSubjectService {

    @Autowired
    private UserSubjectDao userSubjectDao;
    @Override
    public Map<String, Object> queryPage(UserSubjectVo userSubjectVo) {
        Integer total = userSubjectDao.queryCount(userSubjectVo);
        List<HashMap> data = userSubjectDao.queryData(userSubjectVo);
        Map<String, Object> result = new HashMap<>();
        result.put("total",total);
        result.put("data",data);
        return result;
    }
}