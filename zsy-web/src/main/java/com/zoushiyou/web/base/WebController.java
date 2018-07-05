package com.zoushiyou.web.base;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zoushiyou.model.base.BaseModel;
import com.zoushiyou.model.dto.ResultVo;
import com.zoushiyou.service.base.BaseService;
import com.zoushiyou.web.util.Helper;
import com.zoushiyou.web.util.JWTUtil;
import com.zoushiyou.web.util.ZsyauthorizedException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.swing.table.TableModel;
import java.util.Date;
import java.util.List;

/**
 * Webcontroller
 * @param <TService>
 * @param <TModel>
 */
public abstract class WebController<TService extends BaseService,TModel extends BaseModel>
        extends BaseController<TService> {

    @RequestMapping(value = "/insertOne", method = RequestMethod.POST)
    public synchronized ResultVo insertOne(HttpServletRequest request, @RequestBody TModel model) throws Exception {
        ResultVo vo=new ResultVo();
        String authorization = request.getHeader("Authorization");
        if (authorization == null)
            throw new ZsyauthorizedException("没有登录信息！");
        String userId = JWTUtil.getUserId(authorization);
        if (userId == null)
            throw new ZsyauthorizedException("用户信息错误！");
        model.setId(Helper.GetUUID());
        model.setVersion(1);
        model.setOwnerId(userId);
        model.setCreateId(userId);
        model.setCreateTime(new Date());
        Boolean isRow = modelService.insertOne(model);
        if (!isRow)
            throw new Exception("新增数据对象失败！");
        vo.setData(model);
        vo.setTotalNum(1);
        return vo;
    }

    @RequestMapping(value = "/updateOne", method = RequestMethod.POST)
    public synchronized ResultVo updateOne(HttpServletRequest request, @RequestBody TModel model) throws Exception {
        ResultVo vo=new ResultVo();
        String authorization = request.getHeader("Authorization");
        if (authorization == null)
            throw new ZsyauthorizedException("没有登录信息！");
        String userId = JWTUtil.getUserId(authorization);
        if (userId == null)
            throw new ZsyauthorizedException("用户信息错误！");
        model.setUpdateId(userId);
        model.setUpdateTime(new Date());
        Boolean isRow = modelService.updateOne(model);
        if (!isRow)
            throw new Exception("修改数据对象失败！");
        vo.setData(model);
        vo.setTotalNum(1);
        return vo;
    }
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public ResultVo findAll(@RequestParam("pIndex") Integer pIndex,
                            @RequestParam("pSize") Integer pSize) throws Exception {
        ResultVo vo=new ResultVo();
        PageHelper.startPage(pIndex, pSize);
        List<TModel> lstData= modelService.findAll();
        PageInfo<TModel> pageData=new PageInfo<>(lstData);
        vo.setData(pageData.getList());
        vo.setTotalNum((int) pageData.getTotal());
        return vo;
    }
}
