package com.study.service.impl;

import com.study.vo.UserClassVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;



import com.study.dao.UserClassDao;
import com.study.entity.UserClassEntity;
import com.study.service.UserClassService;


@Service("userClassService")
public class UserClassServiceImpl extends ServiceImpl<UserClassDao, UserClassEntity> implements UserClassService {

    @Autowired
    private UserClassDao userClassDao;

    @Override
    public Map<String, Object> queryPage(UserClassVo userClassVo) {
        Integer total = userClassDao.queryCount(userClassVo);
        List<HashMap> data = userClassDao.queryData(userClassVo);
        Map<String, Object> result = new HashMap<>();
        result.put("total",total);
        result.put("data",data);
        return result;
    }

    @Override
    public List<UserClassEntity> selectByClassId(Integer classId) {
        List<UserClassEntity> lists = userClassDao.selectByClassId(classId);
        return lists;
    }

    @Override
    public List<HashMap> findList(UserClassVo userClassVo) {
        List<HashMap> lists = userClassDao.findList(userClassVo);
        return lists;
    }
}