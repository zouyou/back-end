package com.zoushiyou.service.base;

import com.zoushiyou.model.base.BaseModel;
import com.zoushiyou.model.dto.ResultVo;

/**
 * 服务基础接口
 * Author zsy QQ:511570155
 * Date 2018-6-27
 *
 * @param <TModel>
 */
public interface IBaseService<TModel extends BaseModel> {
    /**
     * 插入一条
     * @param model
     * @return
     */
    Boolean insertOne(TModel model);

    /**
     * 修改一条
     * @param model
     * @return
     */
    Boolean updateOne(TModel model);

    /**
     * 查询一条数据
     * @param pkId
     * @return
     */
    ResultVo<TModel> findOne(String pkId);
}
