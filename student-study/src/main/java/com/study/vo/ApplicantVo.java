package com.study.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author ${author}
 * @email ${email}
 * @date 2022-02-13 00:22:11
 */
public class ApplicantVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 学生申请加入班级表
	 */
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
	 * 角色id
	 */
	private Integer roleId;
	/**
	 * 状态（1：待审核；2：成功；3：失败）
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

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
}
