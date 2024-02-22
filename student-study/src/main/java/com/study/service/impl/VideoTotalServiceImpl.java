package com.study.service.impl;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.study.entity.VideosEntity;
import com.study.vo.LoginVo;
import com.study.vo.VideoTotalVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;



import com.study.dao.VideoTotalDao;
import com.study.entity.VideoTotalEntity;
import com.study.service.VideoTotalService;


@Service("videoTotalService")
public class VideoTotalServiceImpl extends ServiceImpl<VideoTotalDao, VideoTotalEntity> implements VideoTotalService {

    @Autowired
    private VideoTotalDao videoTotalDao;

    @Override
    public Map<String, Object> queryPage(VideoTotalVo videoTotalVo) {
        Integer total = videoTotalDao.queryCount(videoTotalVo);
        List<HashMap> data = videoTotalDao.queryData(videoTotalVo);
        Map<String, Object> result = new HashMap<>();
        result.put("total",total);
        result.put("data",data);
        return result;
    }

    @Override
    public Page<VideoTotalEntity> pageVideoTotal(VideoTotalVo videoTotalVo) {
        Page<VideoTotalEntity> page=new Page<>(videoTotalVo.getPage(),videoTotalVo.getPageSize());
        Page<VideoTotalEntity> resultPage=videoTotalDao.selectPage(page,null);
        return  resultPage;
    }




}