package com.zoushiyou.service.impl;

import com.zoushiyou.dao.core.QuartzJobDao;
import com.zoushiyou.model.core.QuartzJob;
import com.zoushiyou.service.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * 定时任务
 */
@Service("quartzJobService")
public class QuartzJobService  extends BaseService<QuartzJobDao,QuartzJob> {
}
