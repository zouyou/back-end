package com.zoushiyou.service.impl;

import com.zoushiyou.dao.core.UserInfoDao;
import com.zoushiyou.model.core.UserInfo;
import com.zoushiyou.service.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * 用户信息服务类
 */
@Service
public class UserInfoService extends BaseService<UserInfoDao,UserInfo> {
    public  UserInfo findByUserName(String username){
      return modelDao.findByUserName(username.trim());
    }
}
