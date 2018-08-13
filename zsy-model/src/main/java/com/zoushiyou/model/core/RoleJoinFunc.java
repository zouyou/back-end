package com.zoushiyou.model.core;

import com.zoushiyou.model.base.BaseModel;

/**
 * 角色功能关系表
 * Author zsyQQ511570155
 * Date 2018-6-27
 */
public class RoleJoinFunc extends BaseModel {
    /**
     * 角色Id
     */
    private long roleId;
    /**
     * 功能Id
     */
    private long funcId;
    /**
     * 级别值域（1.功能权限 2.数据权限）
     */
    private Integer levelVal;

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public long getFuncId() {
        return funcId;
    }

    public void setFuncId(long funcId) {
        this.funcId = funcId;
    }

    public Integer getLevelVal() {
        return levelVal;
    }

    public void setLevelVal(Integer levelVal) {
        this.levelVal = levelVal;
    }
}
