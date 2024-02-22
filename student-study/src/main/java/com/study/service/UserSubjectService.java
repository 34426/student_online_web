package com.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.entity.UserSubjectEntity;
import com.study.vo.UserSubjectVo;

import java.util.Map;

/**
 * 
 *
 * @author ${author}
 * @email ${email}
 * @date 2022-02-15 21:39:15
 */
public interface UserSubjectService extends IService<UserSubjectEntity> {

    Map<String, Object> queryPage(UserSubjectVo userSubjectVo);
}

