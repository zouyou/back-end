package com.zoushiyou.service.impl;

import com.zoushiyou.dao.user.UserInfoDao;
import com.zoushiyou.model.user.UserInfo;
import com.zoushiyou.service.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * 用户信息服务类
 */
@Service
public class UserInfoService extends BaseService<UserInfoDao,UserInfo> {
}
