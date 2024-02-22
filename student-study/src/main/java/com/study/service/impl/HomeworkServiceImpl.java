package com.study.service.impl;

import com.study.vo.HomeworkVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;



import com.study.dao.HomeworkDao;
import com.study.entity.HomeworkEntity;
import com.study.service.HomeworkService;


@Service("homeworkService")
public class HomeworkServiceImpl extends ServiceImpl<HomeworkDao, HomeworkEntity> implements HomeworkService {

    @Autowired
    private HomeworkDao homeworkDao;

    @Override
    public Map<String, Object> queryPage(HomeworkVo homeworkVo) {
        Integer total = homeworkDao.queryCount(homeworkVo);
        List<HashMap> data = homeworkDao.queryData(homeworkVo);
        Map<String, Object> result = new HashMap<>();
        result.put("total",total);
        result.put("data",data);
        return result;
    }

    @Override
    public Map<String, Object> findNotDoHomework(HomeworkVo homeworkVo) {
        Integer total = homeworkDao.findNotDoHomeworkCount(homeworkVo);
        List<HashMap> data = homeworkDao.findNotDoHomeworkData(homeworkVo);
        Map<String, Object> result = new HashMap<>();
        result.put("total",total);
        result.put("data",data);
        return result;
    }
}