package com.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.entity.RoleEntity;
import com.study.vo.RoleVo;

import java.util.Map;

/**
 * 
 *
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:22:45
 */
public interface RoleService extends IService<RoleEntity> {


    Map<String, Object> queryPage(RoleVo roleVo);
}

