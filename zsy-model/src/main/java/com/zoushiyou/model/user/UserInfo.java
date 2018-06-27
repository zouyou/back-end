package com.zoushiyou.model.user;

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
    private String passWord;

    /**
     * 性别 1：男 0：女
     */
    private Boolean IsMale;
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

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Boolean getMale() {
        return IsMale;
    }

    public void setMale(Boolean male) {
        IsMale = male;
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
}
