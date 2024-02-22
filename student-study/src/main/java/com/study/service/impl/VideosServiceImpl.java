package com.study.service.impl;

import com.study.vo.VideosVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;



import com.study.dao.VideosDao;
import com.study.entity.VideosEntity;
import com.study.service.VideosService;


@Service("videosService")
public class VideosServiceImpl extends ServiceImpl<VideosDao, VideosEntity> implements VideosService {

    @Autowired
    private VideosDao videosDao;

    @Override
    public Map<String, Object> queryPage(VideosVo videosVo) {
        Integer total = videosDao.queryCount(videosVo);
        List<HashMap> data = videosDao.queryData(videosVo);
        Map<String, Object> result = new HashMap<>();
        result.put("total",total);
        result.put("data",data);
        return result;
    }
}