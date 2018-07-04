package com.zoushiyou.web.user;

import com.zoushiyou.model.dto.ResultVo;
import com.zoushiyou.model.user.UserInfo;
import com.zoushiyou.service.impl.RoleInfoService;
import com.zoushiyou.service.impl.UserInfoService;
import com.zoushiyou.web.base.WebController;
import com.zoushiyou.web.util.JWTUtil;
import com.zoushiyou.web.util.ZsyauthorizedException;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户信息接口
 */
@RestController
@RequestMapping(value = "/v1/user")
public class UserInfoController extends WebController<UserInfoService,UserInfo> {
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
        UserInfo user = modelService.findByUserName(username);
        if(user==null)
            throw  new ZsyauthorizedException("用户名或者密码错误！");
        String encodedPassword = new Md5Hash(password, username + user.getSalt()).toString();
        if (!user.getPassWord().equals(encodedPassword)) {
            throw new ZsyauthorizedException("用户名或者密码错误！");
        }
        String token= JWTUtil.sign(user.getId(), encodedPassword);
        user.setToken(token);
        vo.setData(user);
        return vo;
    }
}
