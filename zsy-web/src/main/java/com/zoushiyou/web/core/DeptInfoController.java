package com.zoushiyou.web.core;

import com.zoushiyou.model.core.DeptInfo;
import com.zoushiyou.service.impl.DeptInfoService;
import com.zoushiyou.web.base.WebController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/deptInfo")
public class DeptInfoController extends WebController<DeptInfoService,DeptInfo> {
}
