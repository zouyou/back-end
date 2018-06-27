package com.zoushiyou.service.base;

import com.zoushiyou.dao.base.BaseDao;
import com.zoushiyou.model.dto.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<BaseModel> implements IBaseService<BaseModel> {
    @Autowired
    protected BaseDao<BaseModel> modelDao;

    public Boolean insertOne(BaseModel model) {
        return modelDao.insertOne(model);
    }

    public ResultVo<BaseModel> findOne(String pkId) {
        ResultVo<BaseModel> vo=new ResultVo<BaseModel>();
        BaseModel data=modelDao.findOne(pkId);
        vo.setData(data);
        return vo;
    }
}
