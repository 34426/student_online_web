package com.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.entity.ApplicantEntity;
import com.study.vo.ApplicantVo;

import java.util.Map;

/**
 * 
 *
 * @author ${author}
 * @email ${email}
 * @date 2022-02-13 00:22:11
 */
public interface ApplicantService extends IService<ApplicantEntity> {

    Map<String, Object> queryPage(ApplicantVo applicantVo);
}

