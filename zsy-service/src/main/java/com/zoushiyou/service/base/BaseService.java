package com.zoushiyou.service.base;

import com.zoushiyou.dao.base.BaseDao;
import com.zoushiyou.model.base.BaseModel;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.UUID;

public abstract class BaseService<TBaseDao extends BaseDao, TModel extends BaseModel> implements IBaseService<TModel> {
    @Autowired
    protected TBaseDao modelDao;

    public Boolean insertOne(TModel model) {
        model.setId(UUID.randomUUID().toString());
        return modelDao.insertOne(model);
    }

    public Boolean updateOne(TModel model) {
        return modelDao.insertOne(model);
    }

    public Boolean deleteOne(String pkId) {
        return modelDao.deleteOne(pkId);
    }

    public TModel findOne(String pkId) {
        TModel vo=(TModel) modelDao.findOne(pkId);
        return vo;
    }
}
