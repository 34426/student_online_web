package com.study.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.study.common.Result;
import com.study.vo.UserClassVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.entity.UserClassEntity;
import com.study.service.UserClassService;


/**
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:24:21
 */
@RestController
@RequestMapping("study/userClass")
public class UserClassController {
    @Autowired
    private UserClassService userClassService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestBody  UserClassVo userClassVo) {
        userClassVo.setPage((userClassVo.getPage() - 1) * userClassVo.getPageSize());
        Map<String, Object> page = userClassService.queryPage(userClassVo);
        return Result.success(page);
    }

    /**
     * 列表
     */
    @RequestMapping("/findList")
    public Result findList(@RequestBody  UserClassVo userClassVo) {
        List<HashMap> data = userClassService.findList(userClassVo);
        return Result.success(data);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Integer id) {
        UserClassEntity userClass = userClassService.getById(id);

        return Result.success(userClass);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody UserClassEntity userClass) {
        boolean save = userClassService.save(userClass);
        if (save){
            return Result.successCode();
        }
        return Result.failureCode();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody UserClassEntity userClass) {
        boolean b = userClassService.updateById(userClass);
        if (b){
            return Result.successCode();
        }
        return Result.failureCode();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody UserClassEntity userClass) {
        QueryWrapper<UserClassEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id",userClass.getUserId());
        boolean remove = userClassService.remove(queryWrapper);
        if (remove){
            return Result.successCode();
        }
        return Result.failureCode();
    }

}
