package com.zoushiyou.web.job;

import com.zoushiyou.model.core.QuartzJob;
import com.zoushiyou.service.impl.QuartzJobService;
import com.zoushiyou.web.util.SpringContextUtil;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 系统初始读取配置
 */
@Component
public class InitServlet implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        QuartzJobService userInfoService = (QuartzJobService) SpringContextUtil.getBean("quartzJobService");
        List<QuartzJob> lst = userInfoService.findAll(null);
        for (QuartzJob userInfo : lst) {
            System.out.println(userInfo.getId());
        }
    }
}
