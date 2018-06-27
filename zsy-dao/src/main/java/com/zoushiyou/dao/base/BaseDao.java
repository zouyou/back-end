package com.zoushiyou.dao.base;

import com.zoushiyou.model.base.BaseModel;

/**
 * 基础接口类
 * @param <T>
 */
public interface BaseDao<T extends BaseModel> {
    public Boolean insertOne(T model);
    public T findOne(String pkId);
}
