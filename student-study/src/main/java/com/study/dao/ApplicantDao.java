package com.study.dao;

import com.study.entity.ApplicantEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.vo.ApplicantVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * 
 * 
 * @author ${author}
 * @email ${email}
 * @date 2022-02-13 00:22:11
 */
@Mapper
public interface ApplicantDao extends BaseMapper<ApplicantEntity> {

    Integer queryCount(ApplicantVo applicantVo);

    List<HashMap> queryData(ApplicantVo applicantVo);
}
