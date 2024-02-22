package com.study.service.impl;

import com.study.vo.UserDoExerciseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;



import com.study.dao.UserDoExerciseDao;
import com.study.entity.UserDoExerciseEntity;
import com.study.service.UserDoExerciseService;


@Service("userDoExerciseService")
public class UserDoExerciseServiceImpl extends ServiceImpl<UserDoExerciseDao, UserDoExerciseEntity> implements UserDoExerciseService {

    @Autowired
    private UserDoExerciseDao userDoExerciseDao;

    @Override
    public Map<String, Object> queryPage(UserDoExerciseVo userDoExerciseVo) {
        Integer total = userDoExerciseDao.queryCount(userDoExerciseVo);
        List<HashMap> data = userDoExerciseDao.queryData(userDoExerciseVo);
        Map<String, Object> result = new HashMap<>();
        result.put("total",total);
        result.put("data",data);
        return result;
    }
}