package com.study;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.study.entity.VideoTotalEntity;
import com.study.service.impl.VideoTotalServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentStudyApplicationTests {
     @Autowired
    private VideoTotalServiceImpl videoTotalService;
    @Test
    void contextLoads() {

        System.out.println("");
    }

}
