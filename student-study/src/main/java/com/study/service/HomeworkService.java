package com.study.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.study.entity.HomeworkEntity;
import com.study.vo.HomeworkVo;

import java.util.Map;

/**
 * 
 *
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:24:20
 */
public interface HomeworkService extends IService<HomeworkEntity> {


    Map<String, Object> queryPage(HomeworkVo homeworkVo);

    Map<String, Object> findNotDoHomework(HomeworkVo homeworkVo);

}

