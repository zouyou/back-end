package com.zoushiyou.service.base;

import com.zoushiyou.model.dto.ResultVo;

public interface IBaseService<T> {
    public Boolean insertOne(T model);
    public ResultVo<T> findOne(String pkId);
}
