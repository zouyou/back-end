package com.zoushiyou.web.core;


import com.zoushiyou.model.core.SysLogs;
import com.zoushiyou.service.impl.SysLogService;
import com.zoushiyou.web.base.WebController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/syslog")
public class SysLogController extends WebController<SysLogService,SysLogs> {
}
