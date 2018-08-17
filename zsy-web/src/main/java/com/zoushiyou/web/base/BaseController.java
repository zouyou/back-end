package com.zoushiyou.web.base;

import com.zoushiyou.model.base.BaseModel;
import com.zoushiyou.model.dto.ResultVo;
import com.zoushiyou.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Author QQ:511570155
 * 父类接口
 * @param <TService>
 */
@CrossOrigin(origins = "*", maxAge = 3600)
public abstract class BaseController<TService extends BaseService> {
    @Autowired
    protected TService modelService;

    @RequestMapping(value = "/findOne", method = RequestMethod.GET)
    public ResultVo findOne(@RequestParam("id") long id) throws Exception {
        ResultVo vo=new ResultVo();
        BaseModel model = modelService.findOne(id);
        if (model == null)
            throw new Exception("没有查询到数据对象！");
        vo.setData(model);
        vo.setTotalNum(1);
        return vo;
    }

    @RequestMapping(value = "/deleteOne", method = RequestMethod.POST)
    public ResultVo deleteOne(@RequestParam("id") long id) throws Exception {
        ResultVo vo=new ResultVo();
        Boolean isRow = modelService.deleteOne(id);
        if (!isRow)
            throw new Exception("删除数据对象失败！");
        vo.setData(isRow);
        vo.setTotalNum(1);
        return vo;
    }

    /**
     * 全局输出异常
     *
     * @param request
     * @param ex
     * @return
     */
    @ExceptionHandler
    public ResultVo writeException(HttpServletRequest request, Exception ex) {
        ResultVo vo = new ResultVo();
        vo.setStatus(500);
        System.out.println("捕捉错误，请求路径：" + request.getServletPath() + ",请求参数:" + request.getQueryString());
        vo.setMessage(ex.getMessage());
        return vo;
    }
}
