package com.zoushiyou.model.base;

import java.util.Date;

/***
 * 基础抽象类
 * Author QQ:511570155
 */
public abstract class BaseModel {
    /**
     * 主键标识
     */
    protected Long id;
    /**
     * 父级主键标识
     */
    protected Long parentId;
    /**
     * 版本
     */
    protected Integer version;
    /**
     * 编码
     */
    protected String code;
    /**
     * 名称
     */
    protected String name;
    /**
     * 备注
     */
    protected String remarks;
    /**
     * 排序数字
     */
    protected Integer sortNum;
    /**
     * 是否可用 1:可用，0:禁用
     */
    protected boolean is_Enable;
    /**
     * 是否删除 1：删除，0：正常
     */
    protected boolean is_Delete;
    /**
     * 拥有人Id
     */
    protected Long ownerId;
    /**
     * 创建者Id
     */
    protected Long createId;
    /**
     * 修改者Id
     */
    protected Long updateId;
    /**
     * 创建时间
     */
    protected Date createTime;
    /**
     * 修改时间
     */
    protected Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public boolean isIs_Enable() {
        return is_Enable;
    }

    public void setIs_Enable(boolean is_Enable) {
        this.is_Enable = is_Enable;
    }

    public boolean isIs_Delete() {
        return is_Delete;
    }

    public void setIs_Delete(boolean is_Delete) {
        this.is_Delete = is_Delete;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
