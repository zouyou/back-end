package com.zoushiyou.service.base;

import com.zoushiyou.model.base.BaseModel;
import java.util.List;

/**
 * 服务基础接口
 * Author zsy QQ:511570155
 * Date 2018-6-27
 *
 * @param <TModel>
 */
public interface IBaseService<TModel extends BaseModel> {
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

    /**
     * 分页数据
     * @return
     */
    List<TModel> findAll();
}
