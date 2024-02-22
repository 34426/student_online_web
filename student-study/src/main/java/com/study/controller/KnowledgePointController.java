package com.study.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.study.common.Result;
import com.study.vo.KnowledgePointVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.entity.KnowledgePointEntity;
import com.study.service.KnowledgePointService;


/**
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:24:20
 */
@RestController
@RequestMapping("study/knowledgePoint")
public class KnowledgePointController {
    @Autowired
    private KnowledgePointService knowledgePointService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestBody  KnowledgePointVo knowledgePointVo) {
        knowledgePointVo.setPage((knowledgePointVo.getPage() - 1) * knowledgePointVo.getPageSize());
        Map<String, Object> page = knowledgePointService.queryPage(knowledgePointVo);
        return Result.success(page);
    }

    @RequestMapping("/stuPointList")
    public Result stuPointList(@RequestParam("classId") String classId) {
        QueryWrapper<KnowledgePointEntity> queryWrapper= new QueryWrapper<>();
        QueryWrapper<KnowledgePointEntity> eq= queryWrapper.eq("class_id",classId);
        List<KnowledgePointEntity> resultData=knowledgePointService.list(eq);
        return Result.success(resultData);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Integer id) {
        KnowledgePointEntity knowledgePoint = knowledgePointService.getById(id);

        return Result.success(knowledgePoint);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody KnowledgePointEntity knowledgePoint) {
        boolean save = knowledgePointService.save(knowledgePoint);
        if (save){
            return Result.successCode();
        }
        return Result.failureCode();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody KnowledgePointVo knowledgePointVo) {
        KnowledgePointEntity knowledgePointEntity = new KnowledgePointEntity();
        knowledgePointEntity.setId(knowledgePointVo.getId());
        knowledgePointEntity.setClassId(knowledgePointVo.getClassId());
        knowledgePointEntity.setTitle(knowledgePointVo.getTitle());
        knowledgePointEntity.setContent(knowledgePointVo.getContent());
        boolean b = knowledgePointService.updateById(knowledgePointEntity);
        if (b){
            return Result.successCode();
        }
        return Result.failureCode();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody KnowledgePointEntity knowledgePoint) {
        boolean remove = knowledgePointService.removeById(knowledgePoint.getId());
        if (remove){
            return Result.successCode();
        }
        return Result.failureCode();
    }

}
