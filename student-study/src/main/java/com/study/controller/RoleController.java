package com.study.controller;

import java.util.Arrays;
import java.util.Map;


import com.study.common.Result;
import com.study.vo.RoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.entity.RoleEntity;
import com.study.service.RoleService;


/**
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:22:45
 */
@RestController
@RequestMapping("study/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestBody  RoleVo roleVo) {
        roleVo.setPage((roleVo.getPage() - 1) * roleVo.getPageSize());
        Map<String, Object> page = roleService.queryPage(roleVo);
        return Result.success(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Integer id) {
        RoleEntity role = roleService.getById(id);

        return Result.success(role);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody RoleEntity role) {
        boolean save = roleService.save(role);
        if (save){
            return Result.successCode();
        }
        return Result.failureCode();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody RoleEntity role) {
        boolean b = roleService.updateById(role);
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
        roleService.removeByIds(Arrays.asList(ids));

        return Result.successCode();
    }

}
