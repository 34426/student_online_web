package com.study.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.study.entity.AskQuestionsEntity;
import com.study.vo.AskQuestionsVo;

import java.util.Map;

/**
 * 
 *
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:24:21
 */
public interface AskQuestionsService extends IService<AskQuestionsEntity> {

    Map<String, Object> queryPage(AskQuestionsVo askQuestionsVo);
}

