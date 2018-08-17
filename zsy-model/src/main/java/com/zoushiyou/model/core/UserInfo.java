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
    private Integer is_Male = 1;
    /**
     * 手机号码
     */
    private String phoneNum;
    /**
     * 用户角色Id
     */
    private long roleId;
    /**
     * 部门Id
     */
    private long deptId;

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

    public Integer getIs_Male() {
        return is_Male;
    }

    public void setIs_Male(Integer is_Male) {
        this.is_Male = is_Male;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }
}
