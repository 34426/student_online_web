package com.study.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.study.entity.UserDoHomeworkEntity;
import com.study.vo.UserDoHomeworkVo;

import java.util.Map;

/**
 * 
 *
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:24:20
 */
public interface UserDoHomeworkService extends IService<UserDoHomeworkEntity> {


    Map<String, Object> queryPage(UserDoHomeworkVo userDoHomeworkVo);

    Boolean updateModeByUserId(String userId, String homeworkId,String score,String remark);

}

