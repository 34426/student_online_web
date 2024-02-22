package com.study.controller;

import java.util.Arrays;
import java.util.Map;

import com.study.common.Result;
import com.study.vo.RoleVo;
import com.study.vo.UserSubjectVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.entity.UserSubjectEntity;
import com.study.service.UserSubjectService;



/**
 * 
 *
 * @author ${author}
 * @email ${email}
 * @date 2022-02-15 21:39:15
 */
@RestController
@RequestMapping("study/userSubject")
public class UserSubjectController {
    @Autowired
    private UserSubjectService userSubjectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestBody UserSubjectVo userSubjectVo){
        userSubjectVo.setPage((userSubjectVo.getPage() - 1) * userSubjectVo.getPageSize());
        Map<String, Object> page = userSubjectService.queryPage(userSubjectVo);
        return Result.success(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Integer id){
		UserSubjectEntity userSubject = userSubjectService.getById(id);
        return Result.success(userSubject);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody UserSubjectEntity userSubject){
        boolean save = userSubjectService.save(userSubject);
        if (save) {
            return Result.successCode();
        }
        return Result.failureCode();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody UserSubjectEntity userSubject){
        boolean update = userSubjectService.updateById(userSubject);
        if (update) {
            return Result.successCode();
        }
        return Result.failureCode();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Integer[] ids){
        boolean b = userSubjectService.removeByIds(Arrays.asList(ids));
        if (b) {
            return Result.successCode();
        }
        return Result.failureCode();
    }

}
