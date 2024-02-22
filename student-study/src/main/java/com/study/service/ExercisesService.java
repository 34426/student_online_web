package com.study.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.study.entity.ExercisesEntity;
import com.study.vo.ExercisesVo;

import java.util.Map;

/**
 * 
 *
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:24:20
 */
public interface ExercisesService extends IService<ExercisesEntity> {


    Map<String, Object> queryPage(ExercisesVo exercisesVo);

    Map<String, Object> findNotDoExercises(ExercisesVo exercisesVo);
}

