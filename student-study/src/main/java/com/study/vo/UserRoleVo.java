package com.study.vo;

/**
 * @author ${author}
 * @email ${email}
 * @date 2022-02-12 00:22:45
 */

public class UserRoleVo {
    /**
     * 用户与角色中间表id
     */
    private Integer id;
    /**
     * 角色id
     */
    private Integer roleId;
    /**
     * 用户id
     */
    private Integer userId;

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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
