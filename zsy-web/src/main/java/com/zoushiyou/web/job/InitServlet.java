package com.zoushiyou.web.job;

import com.zoushiyou.model.core.UserInfo;
import com.zoushiyou.service.impl.UserInfoService;
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
        UserInfoService userInfoService = (UserInfoService) SpringContextUtil.getBean("userInfoService");
        List<UserInfo> lst = userInfoService.findAll(null);
        for (UserInfo userInfo : lst) {
            System.out.println(userInfo.getId());
        }
    }
}
