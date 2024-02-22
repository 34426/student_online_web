package com.study.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.study.entity.ClassEntity;
import com.study.vo.ClassVo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:22:45
 */
public interface ClassService extends IService<ClassEntity> {

    Map<String, Object> queryPage(ClassVo classVo);

    List<HashMap> findList(ClassVo classVo);
}

