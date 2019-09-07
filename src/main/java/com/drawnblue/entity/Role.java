package com.drawnblue.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "au_role")
public class Role {
    /**
     * 主键ID
     */
    @Id
    private Long id;

    /**
     * 角色编码
     */
    @Column(name = "roleCode")
    private String rolecode;

    /**
     * 角色名称
     */
    @Column(name = "roleName")
    private String rolename;

    /**
     * 创建日期
     */
    @Column(name = "createDate")
    private Date createdate;

    /**
     * 是否启用（0、未启用1、启用）
     */
    @Column(name = "isStart")
    private Integer isstart;

    /**
     * 创建者
     */
    @Column(name = "createdBy")
    private String createdby;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取角色编码
     *
     * @return roleCode - 角色编码
     */
    public String getRolecode() {
        return rolecode;
    }

    /**
     * 设置角色编码
     *
     * @param rolecode 角色编码
     */
    public void setRolecode(String rolecode) {
        this.rolecode = rolecode;
    }

    /**
     * 获取角色名称
     *
     * @return roleName - 角色名称
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * 设置角色名称
     *
     * @param rolename 角色名称
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    /**
     * 获取创建日期
     *
     * @return createDate - 创建日期
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * 设置创建日期
     *
     * @param createdate 创建日期
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * 获取是否启用（0、未启用1、启用）
     *
     * @return isStart - 是否启用（0、未启用1、启用）
     */
    public Integer getIsstart() {
        return isstart;
    }

    /**
     * 设置是否启用（0、未启用1、启用）
     *
     * @param isstart 是否启用（0、未启用1、启用）
     */
    public void setIsstart(Integer isstart) {
        this.isstart = isstart;
    }

    /**
     * 获取创建者
     *
     * @return createdBy - 创建者
     */
    public String getCreatedby() {
        return createdby;
    }

    /**
     * 设置创建者
     *
     * @param createdby 创建者
     */
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }
}