package com.zoushiyou.service.impl;

import com.zoushiyou.dao.core.RoleInfoDao;
import com.zoushiyou.model.core.RoleInfo;
import com.zoushiyou.service.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * 角色信息服务
 */
@Service("roleInfoService")
public class RoleInfoService extends BaseService<RoleInfoDao,RoleInfo> {
}
