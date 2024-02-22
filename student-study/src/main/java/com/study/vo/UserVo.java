package com.study.vo;

import com.study.entity.UserEntity;

import java.util.Date;


/**
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:24:20
 */

public class UserVo {

    /**
     * 用户ID
     */
    private Integer id;
    /**
     * 账号
     */
    private String account;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 新密码
     */
    private String newPassword;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 电话
     */
    private String phone;
    /**
     * 性别（1：男；2：女）
     */
    private Integer sex;
    /**
     * 个人介绍
     */
    private String description;

    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 班级ID
     */
    private Integer classId;

    /**
     * 科目ID
     */
    private Integer subjectId;

    /**
     * 当前页
     */
    private Integer page;

    /**
     * 每页条数
     */
    private Integer pageSize;

    /**
     * 用户实体
     */
    private UserEntity userEntity;

    /**
     * 练习题ID
     */
    private Integer exerciseId;

    /**
     * 作业ID
     */
    private Integer homeworkId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(Integer exerciseId) {
        this.exerciseId = exerciseId;
    }

    public Integer getHomeworkId() {
        return homeworkId;
    }

    public void setHomeworkId(Integer homeworkId) {
        this.homeworkId = homeworkId;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
