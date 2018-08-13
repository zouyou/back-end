package com.zoushiyou.web.core;

import com.zoushiyou.model.core.UserInfo;
import com.zoushiyou.model.dto.ResultVo;
import com.zoushiyou.service.impl.RoleInfoService;
import com.zoushiyou.service.impl.UserInfoService;
import com.zoushiyou.web.base.WebController;
import com.zoushiyou.web.util.Helper;
import com.zoushiyou.web.util.JWTUtil;
import com.zoushiyou.web.util.ZsyauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

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
        UserInfo user = modelService.findByUserName(username.trim());
        if (user == null) {
            throw new ZsyauthorizedException("账号输入错误!");
        }
        String encodedPassword = Helper.GetMd5Str(password, username.trim() + user.getSalt());
        if (!user.getPassWord().equals(encodedPassword)) {
            throw new ZsyauthorizedException("密码输入错误!");
        }
        String token= JWTUtil.sign(user.getId(), encodedPassword);
        user.setToken(token);
        vo.setData(user);
        return vo;
    }

    /**
     * 是否包含用户名
     * @param username
     * @return
     */
    @RequestMapping(value = "/hasUserName",method = RequestMethod.GET)
    public ResultVo hasUserName(@RequestParam("username") String username) {
        ResultVo vo=new ResultVo();
        UserInfo fInfo = modelService.findByUserName(username.trim());
        if (fInfo != null) {
            throw new ZsyauthorizedException("用户名已添加，请重新输入！");
        }
        return vo;
    }

    @RequestMapping(value = "/insertOne", method = RequestMethod.POST)
    public ResultVo insertOne(HttpServletRequest request, @RequestBody UserInfo model) throws Exception {
        UserInfo fInfo = modelService.findByUserName(model.getCode());
        if (fInfo != null) {
            throw new ZsyauthorizedException("用户名已添加，请重新输入！");
        }
        String defaultPwd = "123456";
        model.setSalt(Helper.GetUUID());
        model.setPassWord(Helper.GetMd5Str(defaultPwd, model.getCode() + model.getSalt()));
        ResultVo vo = super.insertOne(request, model);
        return vo;
    }

}
