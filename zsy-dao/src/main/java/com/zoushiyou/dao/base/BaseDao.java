package com.zoushiyou.dao.base;

import java.util.List;

/**
 * 基础接口类
 * @param <T>
 */
public interface BaseDao<T> {
    public Boolean insertOne(T model);
    public T findOne(String pkId);
}
