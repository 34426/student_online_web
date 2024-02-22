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
@TableName("knowledge_point")
public class KnowledgePointEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 知识点ID
	 */
	@TableId(type = IdType.AUTO)
	private Integer id;
	/**
	 * 知识点标题
	 */
	private String title;
	/**
	 * 知识点内容
	 */
	private String content;
	/**
	 * 创建人
	 */
	private Integer creator;
	/**
	 * 所属班级ID
	 */
	private Integer classId;
	/**
	 * 创建时间
	 */
	private Date createTime;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getCreator() {
		return creator;
	}

	public void setCreator(Integer creator) {
		this.creator = creator;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
