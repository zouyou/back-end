package com.zoushiyou.web.job;

import com.zoushiyou.model.core.UserInfo;
import com.zoushiyou.service.impl.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 后台定时任务
 * Author QQ:511570155
 * Date 2018-7-16
 */
public class BackJob {
    @Autowired
    UserInfoService userInfoService;

    public void execute() {
        try {
            System.out.println("后台定时任务：" + System.currentTimeMillis());
            List<UserInfo> lst = userInfoService.findAll();
            for(UserInfo userInfo:lst){
                System.out.println(userInfo.getId());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
