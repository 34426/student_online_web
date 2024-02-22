package com.study.service.impl;

import com.study.vo.RoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.study.dao.RoleDao;
import com.study.entity.RoleEntity;
import com.study.service.RoleService;


@Service("roleService")
public class RoleServiceImpl extends ServiceImpl<RoleDao, RoleEntity> implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Map<String, Object> queryPage(RoleVo roleVo) {
        Integer total = roleDao.queryCount(roleVo);
        List<HashMap> data = roleDao.queryData(roleVo);
        Map<String, Object> result = new HashMap<>();
        result.put("total",total);
        result.put("data",data);
        return result;
    }
}