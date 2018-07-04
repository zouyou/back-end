package com.zoushiyou.dao.base;

import com.zoushiyou.model.base.BaseModel;

/**
 * 基础接口类
 * @param <TModel>
 */
//@NoRepositoryBean
public interface BaseDao<TModel extends BaseModel> {
    /**
     * 插入一条数据
     * @param model
     * @return
     */
    Boolean insertOne(TModel model);
    /**
     * 修改一条数据
     * @param model
     * @return
     */
    Boolean updateOne(TModel model);
    /**
     * 删除一条数据
     * @param pkId
     * @return
     */
    Boolean deleteOne(String pkId);
    /**
     * 查询一条数据
     * @param pkId
     * @return
     */
    TModel findOne(String pkId);

}
