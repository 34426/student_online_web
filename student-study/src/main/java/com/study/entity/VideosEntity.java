package com.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:24:20
 */

@TableName("videos")
public class VideosEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 视频总体id
	 */
	@TableId(type = IdType.AUTO)
	private Integer id;
	/**
	 * 视频名称
	 */
	private String topic;
	/**
	 * 视频总和ID
	 */
	private Integer videoTotalId;
	/**
	 * 视频访问路径
	 */
	private String videoUrl;
	/**
	 * 视频存储路径
	 */
	private String path;
	/**
	 * 排序（可用第几集排序）
	 */
	private Integer sort;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getVideoTotalId() {
		return videoTotalId;
	}

	public void setVideoTotalId(Integer videoTotalId) {
		this.videoTotalId = videoTotalId;
	}
}
