package com.study.controller;

import java.sql.Wrapper;
import java.util.*;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.study.common.Result;
import com.study.entity.UserClassEntity;
import com.study.entity.UserDoHomeworkEntity;
import com.study.service.UserClassService;
import com.study.service.UserDoHomeworkService;
import com.study.vo.HomeworkVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.entity.HomeworkEntity;
import com.study.service.HomeworkService;


/**
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:24:20
 */
@RestController
@RequestMapping("study/homework")
public class HomeworkController {

    @Autowired
    private UserClassService userClassService;

    @Autowired
    private UserDoHomeworkService userDoHomeworkService;

    @Autowired
    private HomeworkService homeworkService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestBody HomeworkVo homeworkVo) {
        homeworkVo.setPage((homeworkVo.getPage() - 1) * homeworkVo.getPageSize());
        Map<String, Object> page = homeworkService.queryPage(homeworkVo);
        return Result.success(page);
    }


    /**
     * 查询未做作业列表
     */
    @RequestMapping("/findNotDoHomework")
    public Result findNotDoHomework(@RequestBody HomeworkVo homeworkVo) {
        homeworkVo.setPage((homeworkVo.getPage() - 1) * homeworkVo.getPageSize());
        Map<String, Object> page = homeworkService.findNotDoHomework(homeworkVo);
        return Result.success(page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Integer id) {
        HomeworkEntity homework = homeworkService.getById(id);

        return Result.success(homework);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody HomeworkEntity homework) {
        boolean save;
        if (homework.getId()!=null){
            save = homeworkService.updateById(homework);
            if (homework.getUserId()!=null && homework.getUserId()!=""){
                 userDoHomeworkService.updateModeByUserId(homework.getUserId(),homework.getId()+"",homework.getScore(),homework.getRemark());
            }

        }else {
            save = homeworkService.save(homework);
        }

        if (save) {
            return Result.successCode();
        }
        return Result.failureCode();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody HomeworkEntity homework) {
        boolean b = homeworkService.updateById(homework);
        if (b) {
            return Result.successCode();
        }
        return Result.failureCode();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody HomeworkEntity homework) {
        boolean b = homeworkService.removeById(homework.getId());
        if (b){
            QueryWrapper<UserDoHomeworkEntity> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("homework_id",homework.getId());
            boolean remove = userDoHomeworkService.remove(queryWrapper);
            return Result.successCode();
        }
        return Result.failureCode();
    }

}
