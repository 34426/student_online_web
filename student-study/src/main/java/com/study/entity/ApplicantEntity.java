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
 * @date 2022-02-13 00:22:11
 */
@TableName("applicant")
public class ApplicantEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 学生申请加入班级表
	 */
	@TableId(type = IdType.AUTO)
	private Integer id;
	/**
	 * 学生id
	 */
	private Integer userId;
	/**
	 * 班级id
	 */
	private Integer classId;
	/**
	 * 状态（1：待审核；2：成功；3：失败）
	 */
	private Integer status;
	/**
	 * 申请时间
	 */
	private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
