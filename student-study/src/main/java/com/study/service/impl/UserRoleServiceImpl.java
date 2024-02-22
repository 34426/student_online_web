package com.study.service.impl;

import com.study.vo.UserRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;



import com.study.dao.UserRoleDao;
import com.study.entity.UserRoleEntity;
import com.study.service.UserRoleService;


@Service("userRoleService")
public class UserRoleServiceImpl extends ServiceImpl<UserRoleDao, UserRoleEntity> implements UserRoleService {

    @Autowired
    private UserRoleDao userRoleDao;

    @Override
    public Map<String, Object> queryPage(UserRoleVo userRoleVo) {
        Integer total = userRoleDao.queryCount(userRoleVo);
        List<HashMap> data = userRoleDao.queryData(userRoleVo);
        Map<String, Object> result = new HashMap<>();
        result.put("total",total);
        result.put("data",data);
        return result;
    }
}