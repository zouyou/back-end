package com.zoushiyou.service.impl;

import com.zoushiyou.dao.core.SysLogsDao;
import com.zoushiyou.model.core.SysLogs;
import com.zoushiyou.service.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * 日志服务
 */
@Service("sysLogService")
public class SysLogService extends BaseService<SysLogsDao,SysLogs> {
}
