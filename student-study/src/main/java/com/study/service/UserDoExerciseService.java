package com.study.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.study.entity.UserDoExerciseEntity;
import com.study.vo.UserDoExerciseVo;

import java.util.Map;

/**
 * 
 *
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:24:20
 */
public interface UserDoExerciseService extends IService<UserDoExerciseEntity> {


    Map<String, Object> queryPage(UserDoExerciseVo userDoExerciseVo);
}

