package com.zoushiyou.model.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zoushiyou.model.base.BaseModel;

/**
 * 用户信息
 * QQ:511570155
 * zsy 2018-6-27
 */
public class UserInfo extends BaseModel {
    /**
     * 密码
     */
    @JsonIgnore
    private String passWord;
    /**
     * md5密码盐
     */
    @JsonIgnore
    private String salt;

    /**
     * 性别 1：男 0：女
     */
    private boolean isMale;
    /**
     * 手机号码
     */
    private String phoneNum;
    /**
     * 用户角色Id
     */
    private String roleId;
    /**
     * 部门Id
     */
    private String deptId;
    /**
     * 标识
     */
    private String token;

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
