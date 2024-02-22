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
 * @date 2022-02-12 00:24:21
 */
@TableName("ask_questions")
public class AskQuestionsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 问题ID
	 */
	@TableId(type = IdType.AUTO)
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
	 * 时间
	 */
	private Date createTime;


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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
}
