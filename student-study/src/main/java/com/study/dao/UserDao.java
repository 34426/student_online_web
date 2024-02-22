package com.study.dao;

import com.study.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.vo.LoginVo;
import com.study.vo.UserVo;
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
public interface UserDao extends BaseMapper<UserEntity> {

    Integer queryCount(UserVo userVo);

    List<HashMap> queryData(UserVo userVo);

    List<HashMap> login(LoginVo loginVo);

    Integer findNotDoWorkCount(UserVo userVo);

    List<HashMap> findNotDoWorkData(UserVo userVo);

    Integer findNotDoHomeworkCount(UserVo userVo);

    List<HashMap> findNotDoHomeworkData(UserVo userVo);

    List<HashMap> findList(UserVo userVo);
}
