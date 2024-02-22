package com.study.dao;

import com.study.entity.ExercisesEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.vo.ExercisesVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * 
 * 
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:24:20
 */
@Mapper
public interface ExercisesDao extends BaseMapper<ExercisesEntity> {

    Integer queryCount(ExercisesVo exercisesVo);

    List<HashMap> queryData(ExercisesVo exercisesVo);

    Integer findNotDoExercisesCount(ExercisesVo exercisesVo);

    List<HashMap> findNotDoExercisesData(ExercisesVo exercisesVo);
}
