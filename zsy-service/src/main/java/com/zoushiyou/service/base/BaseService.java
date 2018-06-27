package com.zoushiyou.service.base;

public interface BaseService<T> {
    public Boolean insertOne(T model);
    public T findOne(String pkId);
}
