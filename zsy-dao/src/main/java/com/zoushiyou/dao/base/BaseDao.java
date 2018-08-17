package com.zoushiyou.dao.base;

import com.zoushiyou.model.base.BaseModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
    Boolean deleteOne(Long pkId);
    /**
     * 查询一条数据
     * @param pkId
     * @return
     */
    TModel findOne(Long pkId);

    /**
     * 分页数据
     * @return
     */
    List<TModel> findAll(@Param("params")String params);
}
