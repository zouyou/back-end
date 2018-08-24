package com.zoushiyou.dao.core;

import com.zoushiyou.dao.base.BaseDao;
import com.zoushiyou.model.core.QuartzJob;
import org.springframework.stereotype.Repository;

/**
 * 定时任务
 * Author QQ:511570155
 * Date 2018-8-24 23:39 zsy
 */
@Repository
public interface QuartzJobDao extends BaseDao<QuartzJob> {
}
