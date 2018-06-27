package com.zoushiyou.service.base;

import com.zoushiyou.dao.base.BaseDao;
import com.zoushiyou.model.base.BaseModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ModelService<BaseModel> implements BaseService<BaseModel> {
    @Resource
    protected BaseDao<BaseModel> modelDao;
    public Boolean insertOne(BaseModel model) {
        return modelDao.insertOne(model);
    }

    public BaseModel findOne(String pkId) {
        return modelDao.findOne(pkId);
    }
}
