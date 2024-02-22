package com.study.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.study.entity.UserEntity;
import com.study.vo.LoginVo;
import com.study.vo.UserVo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:24:20
 */
public interface UserService extends IService<UserEntity> {


    Map<String, Object> queryPage(UserVo userVo);

    List<HashMap> login(LoginVo loginVo);

    Map<String, Object> findNotDoWork(UserVo userVo);

    Map<String, Object> findNotDoHomework(UserVo userVo);

    List<HashMap> findList(UserVo userVo);
}

