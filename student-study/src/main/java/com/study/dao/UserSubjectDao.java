package com.study.dao;

import com.study.entity.UserSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.vo.UserSubjectVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * 
 * 
 * @author ${author}
 * @email ${email}
 * @date 2022-02-15 21:39:15
 */
@Mapper
public interface UserSubjectDao extends BaseMapper<UserSubjectEntity> {

    Integer queryCount(UserSubjectVo userSubjectVo);

    List<HashMap> queryData(UserSubjectVo userSubjectVo);
}
