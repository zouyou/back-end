package com.zoushiyou.web.core;

import com.zoushiyou.model.core.QuartzJob;
import com.zoushiyou.service.impl.QuartzJobService;
import com.zoushiyou.web.base.WebController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 定时任务
 * QQ:511570155
 * Date:2018-8-24 23:50
 */
@RestController
@RequestMapping(value = "/v1/quartz")
public class QuartzJobController extends WebController<QuartzJobService,QuartzJob> {
}
