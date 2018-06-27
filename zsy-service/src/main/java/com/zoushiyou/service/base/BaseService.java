package com.zoushiyou.service.base;

import com.zoushiyou.dao.base.BaseDao;
import com.zoushiyou.model.base.BaseModel;
import com.zoushiyou.model.dto.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseService<TModel extends BaseModel> implements IBaseService<TModel> {
    @Autowired
    protected BaseDao<TModel> modelDao;

    public Boolean insertOne(TModel model) {
        return modelDao.insertOne(model);
    }

    public Boolean updateOne(TModel model) {
        return modelDao.insertOne(model);
    }

    public ResultVo findOne(String pkId) {
        ResultVo<TModel> vo=new ResultVo<TModel>();
        TModel data=modelDao.findOne(pkId);
        vo.setData(data);
        return vo;
    }
}
