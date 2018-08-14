package com.zoushiyou.service.impl;

import com.zoushiyou.dao.core.FuncInfoDao;
import com.zoushiyou.model.core.FuncInfo;
import com.zoushiyou.service.base.BaseService;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 功能服务
 */
@Service
public class FuncInfoService extends BaseService<FuncInfoDao,FuncInfo> {
    public List<FuncInfo> findByRoleId(long roleId){
        return modelDao.findByRoleId(roleId);
    }
}
