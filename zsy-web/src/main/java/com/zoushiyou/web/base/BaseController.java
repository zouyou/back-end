package com.zoushiyou.web.base;

import com.zoushiyou.model.dto.ResultVo;
import com.zoushiyou.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author QQ:511570155
 * 父类接口
 * @param <TService>
 */
public abstract class BaseController<TService extends StudentService> {
    @Autowired
    protected TService modelService;

    @RequestMapping(value = "/findOne",method = RequestMethod.GET)
    @ResponseBody
    public ResultVo findOne(@RequestParam("id") String id) {
        return modelService.findOne(id);
    }
}
