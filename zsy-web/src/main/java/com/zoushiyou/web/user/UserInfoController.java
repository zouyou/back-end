package com.zoushiyou.web.user;

import com.zoushiyou.model.dto.ResultVo;
import com.zoushiyou.service.impl.RoleInfoService;
import com.zoushiyou.service.impl.UserInfoService;
import com.zoushiyou.web.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户信息接口
 */
@RestController
@RequestMapping(value = "/v1/user")
public class UserInfoController extends BaseController<UserInfoService> {
    @Autowired
    RoleInfoService roleInfoService;

    /**
     * 登录系统
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ResultVo login(@RequestParam("username") String username, @RequestParam("password") String password) {
        ResultVo vo = new ResultVo();
        //ResultVo rVo=roleInfoService.findOne("1");
        return vo;
    }
}
