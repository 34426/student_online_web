package com.study.vo;


import java.io.File;

/**
 * 
 * 
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:24:20
 */

public class VideosVo {

	/**
	 * 视频总体id
	 */
	private Integer id;
	/**
	 * 视频总和ID
	 */
	private Integer videoTotalId;
	/**
	 * 视频名称
	 */
	private String topic;
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

	/**
	 * 当前页
	 */
	private Integer page;

	/**
	 * 每页条数
	 */
	private Integer pageSize;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

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
