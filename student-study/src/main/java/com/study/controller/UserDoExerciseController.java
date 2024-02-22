package com.study.controller;

import java.util.Arrays;
import java.util.Map;


import com.study.common.Result;
import com.study.vo.UserDoExerciseVo;
import com.study.vo.UserDoHomeworkVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.entity.UserDoExerciseEntity;
import com.study.service.UserDoExerciseService;


/**
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:24:20
 */
@RestController
@RequestMapping("study/userDoExercise")
public class UserDoExerciseController {
    @Autowired
    private UserDoExerciseService userDoExerciseService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestBody  UserDoExerciseVo userDoExerciseVo) {
        userDoExerciseVo.setPage((userDoExerciseVo.getPage() - 1) * userDoExerciseVo.getPageSize());
        Map<String, Object> page = userDoExerciseService.queryPage(userDoExerciseVo);
        return Result.success(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Integer id) {
        UserDoExerciseEntity userDoExercise = userDoExerciseService.getById(id);

        return Result.success(userDoExercise);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody UserDoExerciseVo userDoExerciseVo) {
        UserDoExerciseEntity userDoExerciseEntity = new UserDoExerciseEntity();
        userDoExerciseEntity.setExerciseId(userDoExerciseVo.getExerciseId());
        userDoExerciseEntity.setReply(userDoExerciseVo.getContent());
        userDoExerciseEntity.setUserId(userDoExerciseVo.getUserId());
        boolean save = userDoExerciseService.save(userDoExerciseEntity);
        if (save){
            return Result.successCode();
        }
        return Result.failureCode();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody UserDoExerciseEntity userDoExercise) {
        boolean b = userDoExerciseService.updateById(userDoExercise);
        if (b){
            return Result.successCode();
        }
        return Result.failureCode();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Integer[] ids) {
        userDoExerciseService.removeByIds(Arrays.asList(ids));

        return Result.successCode();
    }

}
