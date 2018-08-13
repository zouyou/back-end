package com.zoushiyou.web.core;

import com.zoushiyou.model.core.FuncInfo;
import com.zoushiyou.service.impl.FuncInfoService;
import com.zoushiyou.web.base.WebController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/funcInfo")
public class FuncInfoController extends WebController<FuncInfoService,FuncInfo> {
}
