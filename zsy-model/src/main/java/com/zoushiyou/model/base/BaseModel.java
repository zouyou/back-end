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
    protected String id;
    /**
     * 父级主键标识
     */
    protected String parentId;
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
    protected boolean isEnable;
    /**
     * 是否删除 1：删除，0：正常
     */
    protected boolean isDelete;
    /**
     * 拥有人Id
     */
    protected String ownerId;
    /**
     * 创建者Id
     */
    protected String createId;
    /**
     * 修改者Id
     */
    protected String updateId;
    /**
     * 创建时间
     */
    protected Date createTime;
    /**
     * 修改时间
     */
    protected Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
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

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
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
