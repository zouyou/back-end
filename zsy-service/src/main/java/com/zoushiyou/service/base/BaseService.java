package com.zoushiyou.service.base;

import com.zoushiyou.dao.base.BaseDao;
import com.zoushiyou.model.base.BaseModel;
import com.zoushiyou.model.dto.BaseDto;
import com.zoushiyou.model.dto.CommonDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseService<TBaseDao extends BaseDao, TModel extends BaseModel> implements IBaseService<TModel> {
    @Autowired
    protected TBaseDao modelDao;

    public Boolean insertOne(TModel model) {
        return modelDao.insertOne(model);
    }

    public Boolean updateOne(TModel model) {
        return modelDao.insertOne(model);
    }

    public Boolean deleteOne(long pkId) {
        return modelDao.deleteOne(pkId);
    }

    public TModel findOne(long pkId) { return (TModel) modelDao.findOne(pkId); }

    public List<TModel> findAll(){
        return modelDao.findAll();
    }

}
