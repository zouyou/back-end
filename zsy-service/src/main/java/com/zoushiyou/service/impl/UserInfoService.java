package com.zoushiyou.service.impl;

import com.zoushiyou.dao.core.UserInfoDao;
import com.zoushiyou.model.core.DeptInfo;
import com.zoushiyou.model.core.FuncInfo;
import com.zoushiyou.model.core.RoleInfo;
import com.zoushiyou.model.core.UserInfo;
import com.zoushiyou.model.dto.CommonDto;
import com.zoushiyou.model.dto.FuncInfoDto;
import com.zoushiyou.model.dto.UserInfoDto;
import com.zoushiyou.model.dto.UserLoginInfoDto;
import com.zoushiyou.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户信息服务类
 */
@Service
public class UserInfoService extends BaseService<UserInfoDao,UserInfo> {
    @Autowired
    RoleInfoService roleInfoService;
    @Autowired
    DeptInfoService deptInfoService;
    @Autowired
    FuncInfoService funcInfoService;

    public  UserInfo findByUserName(String username){
      return modelDao.findByUserName(username.trim());
    }

    /**
     * 绑定登录数据
     *
     * @param userInfo
     * @return
     */
    public UserLoginInfoDto buildLoginData(UserInfo userInfo, String token) {
        UserLoginInfoDto userLoginInfoDto = new UserLoginInfoDto();
        userLoginInfoDto.userInfoDto = new UserInfoDto(userInfo); //设置用户信息
        userLoginInfoDto.userInfoDto.setToken(token);             //设置token
        RoleInfo roleInfo = roleInfoService.findOne(userInfo.getRoleId());
        userLoginInfoDto.roleInfoDto = new CommonDto(roleInfo);   //设置角色
        DeptInfo deptInfo = deptInfoService.findOne(userInfo.getDeptId());
        userLoginInfoDto.deptInfoDto = new CommonDto(deptInfo);   //设置部门
        List<FuncInfo> listFuncInfo = funcInfoService.findByRoleId(userInfo.getRoleId());
        List<FuncInfoDto> lstFunc = new ArrayList<FuncInfoDto>();
        if (listFuncInfo != null) {
            for (FuncInfo funcInfo : listFuncInfo) {
                if (funcInfo.getParentId() == 0L) {
                    FuncInfoDto itemDto = new FuncInfoDto(funcInfo);
                    lstFunc.add(itemDto);
                }
            }
            for (FuncInfoDto itemDto : lstFunc) {
                for (FuncInfo funcInfo : listFuncInfo) {
                    if (itemDto.getId() == funcInfo.getParentId()) {
                        if (itemDto.getSubItem() == null) {
                            List<FuncInfoDto> sublstFunc = new ArrayList<FuncInfoDto>();
                            sublstFunc.add(new FuncInfoDto(funcInfo));
                            itemDto.setSubItem(sublstFunc);
                        } else {
                            List<FuncInfoDto> sublstFunc = itemDto.getSubItem();
                            sublstFunc.add(new FuncInfoDto(funcInfo));
                        }
                    }
                }
            }
        }
        userLoginInfoDto.listfuncInfoDto = lstFunc;
        return userLoginInfoDto;
    }
}
