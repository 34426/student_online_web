package com.study.vo;

import java.util.Date;


/**
 * 
 * 
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:24:21
 */
public class AskQuestionsVo {

	/**
	 * 问题ID
	 */
	private Integer id;
	/**
	 * 发送人ID
	 */
	private Integer sender;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 接收人ID
	 */
	private Integer recipient;
	/**
	 * 问题来源
	 */
	private Integer videoId;
	/**
	 * 回复
	 */
	private String restore;
	/**
	 * 状态（1：已回复；2：未回复）
	 */
	private Integer status;

	/**
	 * 当前页
	 */
	private Integer page;

	/**
	 * 每页条数
	 */
	private Integer pageSize;
	/**
	 * 登陆人ID
	 */
	private Integer userId;


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

	public Integer getSender() {
		return sender;
	}

	public void setSender(Integer sender) {
		this.sender = sender;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getRecipient() {
		return recipient;
	}

	public void setRecipient(Integer recipient) {
		this.recipient = recipient;
	}

	public Integer getVideoId() {
		return videoId;
	}

	public void setVideoId(Integer videoId) {
		this.videoId = videoId;
	}

	public String getRestore() {
		return restore;
	}

	public void setRestore(String restore) {
		this.restore = restore;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
