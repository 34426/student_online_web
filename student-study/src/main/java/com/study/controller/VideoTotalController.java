package com.study.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.study.common.Result;
import com.study.entity.UserEntity;
import com.study.entity.VideosEntity;
import com.study.service.VideosService;
import com.study.tool.FileUtil;
import com.study.vo.LoginVo;
import com.study.vo.VideoTotalVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import com.study.entity.VideoTotalEntity;
import com.study.service.VideoTotalService;
import org.springframework.web.multipart.MultipartFile;


/**
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:24:20
 */
@RestController
@RequestMapping("study/videoTotal")
public class VideoTotalController {

    @Value("${file.imagePath}")
    private String imagePath;

    @Autowired
    private VideoTotalService videoTotalService;

    @Autowired
    private VideosService videosService;

    /**
     * 分页查询
     */
    @RequestMapping("/list")
    public Result list(@RequestBody VideoTotalVo videoTotalVo) {

        videoTotalVo.setPage((videoTotalVo.getPage() - 1) * videoTotalVo.getPageSize());
        Map<String, Object> page = videoTotalService.queryPage(videoTotalVo);
        return Result.success(page);
    }


    @RequestMapping("/pageVideo")
    public Result pageVideo(@RequestBody VideoTotalVo videoTotalVo) {

        Page<VideoTotalEntity> result= videoTotalService.pageVideoTotal(videoTotalVo);
        return Result.success(result);
    }



    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Integer id) {
        VideoTotalEntity videoTotal = videoTotalService.getById(id);
        return Result.success(videoTotal);
    }

    /**
     * 保存
     */
    @CrossOrigin
    @RequestMapping("/save")
    public Result save(@RequestParam Integer userId,
                       @RequestParam String topic,
                       MultipartFile file) throws UnknownHostException {
        VideoTotalEntity videoTotalEntity = new VideoTotalEntity();
        videoTotalEntity.setTopic(topic);
        videoTotalEntity.setUserId(userId);
        videoTotalEntity.setPath(imagePath + file.getOriginalFilename());

        videoTotalEntity.setCoverUrl("http://localhost:8000/file/imageFile/" + file.getOriginalFilename());

        boolean save = videoTotalService.save(videoTotalEntity);
        if (save) {
            try {
                FileUtil.uploadFile(file.getBytes(), imagePath, file.getOriginalFilename());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Result.successCode();
        }
        return Result.failureCode();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody VideoTotalEntity videoTotal) {
        boolean b = videoTotalService.updateById(videoTotal);
        if (b) {
            return Result.successCode();
        }
        return Result.failureCode();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody VideoTotalVo videoTotalVo) {
        VideoTotalEntity byId = videoTotalService.getById(videoTotalVo.getId());
        boolean b1 = FileUtil.deleteFile(byId.getPath());
        if (b1) {
            boolean remove = videoTotalService.removeById(videoTotalVo.getId());
            if (remove) {
                QueryWrapper<VideosEntity> queryWrapper = new QueryWrapper<>();
                queryWrapper.eq("video_total_id", videoTotalVo.getId());
                List<VideosEntity> list = videosService.list(queryWrapper);
                for (VideosEntity videosEntity : list) {
                    boolean b = FileUtil.deleteFile(videosEntity.getPath());
                    if (b) {
                        videosService.remove(queryWrapper);
                    }
                }
            }
        }
        return Result.successCode();
    }


}
