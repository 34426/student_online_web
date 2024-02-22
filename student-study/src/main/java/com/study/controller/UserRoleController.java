package com.study.controller;

import java.util.Arrays;
import java.util.Map;


import com.study.common.Result;
import com.study.vo.UserRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.entity.UserRoleEntity;
import com.study.service.UserRoleService;


/**
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:22:45
 */
@RestController
@RequestMapping("study/userrole")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestBody  UserRoleVo userRoleVo) {
        userRoleVo.setPage((userRoleVo.getPage() - 1) * userRoleVo.getPageSize());
        Map<String, Object> page = userRoleService.queryPage(userRoleVo);
        return Result.success(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Integer id) {
        UserRoleEntity userRole = userRoleService.getById(id);

        return Result.success(userRole);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody UserRoleEntity userRole) {
        boolean save = userRoleService.save(userRole);
        if (save){
            return Result.successCode();
        }
        return Result.failureCode();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody UserRoleEntity userRole) {
        boolean b = userRoleService.updateById(userRole);
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
        userRoleService.removeByIds(Arrays.asList(ids));

        return Result.successCode();
    }

}
