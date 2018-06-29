package com.zoushiyou.web.base;

import com.zoushiyou.model.base.BaseModel;
import com.zoushiyou.model.dto.ResultVo;
import com.zoushiyou.service.base.BaseService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.UUID;

/**
 * Webcontroller
 * @param <TService>
 * @param <TModel>
 */
public abstract class WebController<TService extends BaseService,TModel extends BaseModel>
        extends BaseController<TService> {

    @RequestMapping(value = "/insertOne", method = RequestMethod.POST)
    public ResultVo insertOne(@RequestBody TModel model) throws Exception {
        ResultVo vo=new ResultVo();
        model.setId(UUID.randomUUID().toString());
        Boolean isRow = modelService.insertOne(model);
        if (!isRow)
            throw new Exception("新增数据对象失败！");
        vo.setData(model);
        vo.setTotalNum(1);
        return vo;
    }

    @RequestMapping(value = "/updateOne", method = RequestMethod.POST)
    public ResultVo updateOne(@RequestBody TModel model) throws Exception {
        ResultVo vo=new ResultVo();
        Boolean isRow = modelService.updateOne(model);
        if (!isRow)
            throw new Exception("修改数据对象失败！");
        vo.setData(model);
        vo.setTotalNum(1);
        return vo;
    }
}
