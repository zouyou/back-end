package com.zoushiyou.model.dto;

import java.util.List;

/**
 * 用户登录后返回的Dto
 */
public class UserLoginInfoDto {
    /**
     * 用户信息
     */
    public UserInfoDto userInfoDto;
    /**
     * 角色信息
     */
    public CommonDto roleInfoDto;
    /**
     * 部门信息
     */
    public CommonDto deptInfoDto;
    /**
     * 功能权限
     */
    public List<FuncInfoDto> listfuncInfoDto;

    public UserInfoDto getUserInfoDto() {
        return userInfoDto;
    }

    public void setUserInfoDto(UserInfoDto userInfoDto) {
        this.userInfoDto = userInfoDto;
    }

    public CommonDto getRoleInfoDto() {
        return roleInfoDto;
    }

    public void setRoleInfoDto(CommonDto roleInfoDto) {
        this.roleInfoDto = roleInfoDto;
    }

    public CommonDto getDeptInfoDto() {
        return deptInfoDto;
    }

    public void setDeptInfoDto(CommonDto deptInfoDto) {
        this.deptInfoDto = deptInfoDto;
    }

    public List<FuncInfoDto> getListfuncInfoDto() {
        return listfuncInfoDto;
    }

    public void setListfuncInfoDto(List<FuncInfoDto> listfuncInfoDto) {
        this.listfuncInfoDto = listfuncInfoDto;
    }
}
