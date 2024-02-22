package com.study.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.study.common.Result;
import com.study.entity.UserClassEntity;
import com.study.service.UserClassService;
import com.study.vo.ClassVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.entity.ClassEntity;
import com.study.service.ClassService;


/**
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:22:45
 */
@RestController
@RequestMapping("study/class")
public class ClassController {
    @Autowired
    private ClassService classService;

    @Autowired
    private UserClassService userClassService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestBody ClassVo classVo) {
        classVo.setPage((classVo.getPage() - 1) * classVo.getPageSize());
        Map<String, Object> page = classService.queryPage(classVo);
        return Result.success(page);
    }

    /**
     * 列表
     */
    @RequestMapping("/findList")
    public Result findList(@RequestBody ClassVo classVo) {
        List<HashMap> page = classService.findList(classVo);
        return Result.success(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Integer id) {
        ClassEntity classEntity = classService.getById(id);
        return Result.success(classEntity);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody ClassEntity classEntity) {
        boolean save = classService.save(classEntity);
        if (save){
            return Result.successCode();
        }
        return Result.failureCode();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody ClassEntity classEntity) {
        boolean b = classService.updateById(classEntity);
        if (b){
            return Result.successCode();
        }
        return Result.failureCode();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody ClassEntity classEntity) {
        classService.removeById(classEntity.getId());

        //删除对应班级的所有人员
        QueryWrapper<UserClassEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("class_id",classEntity.getId());
        userClassService.remove(queryWrapper);

        return Result.successCode();
    }

}
