package com.study.dao;

import com.study.entity.AskQuestionsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.vo.AskQuestionsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * 
 * 
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:24:21
 */
@Mapper
public interface AskQuestionsDao extends BaseMapper<AskQuestionsEntity> {

    Integer queryCount(AskQuestionsVo askQuestionsVo);

    List<HashMap> queryData(AskQuestionsVo askQuestionsVo);
	
}
