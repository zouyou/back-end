package com.zoushiyou.web.core;

import com.zoushiyou.model.core.RoleInfo;
import com.zoushiyou.service.impl.RoleInfoService;
import com.zoushiyou.web.base.WebController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 角色权限
 * QQ:511570155
 */
@RestController
@RequestMapping(value = "/v1/role-func")
public class RoleFuncController extends WebController<RoleInfoService,RoleInfo> {
}
