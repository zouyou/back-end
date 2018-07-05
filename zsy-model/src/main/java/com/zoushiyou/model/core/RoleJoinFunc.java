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
    private String roleId;
    /**
     * 功能Id
     */
    private String funcId;
    /**
     * 级别值域（1.功能权限 2.数据权限）
     */
    private Integer levelVal;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getFuncId() {
        return funcId;
    }

    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    public Integer getLevelVal() {
        return levelVal;
    }

    public void setLevelVal(Integer levelVal) {
        this.levelVal = levelVal;
    }
}
