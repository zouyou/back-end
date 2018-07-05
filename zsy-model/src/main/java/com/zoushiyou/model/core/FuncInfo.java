package com.zoushiyou.model.core;

import com.zoushiyou.model.base.BaseModel;

/**
 * 功能表信息
 * Author QQ:511570155
 * Date 2018-6-27
 */
public class FuncInfo extends BaseModel {
    /**
     * 路由地址
     */
    private String routePath;
    /**
     * 样式名称
     */
    private String styleName;
    /**
     * 级别（层次）
     */
    private Integer levelVal;

    public String getRoutePath() {
        return routePath;
    }

    public void setRoutePath(String routePath) {
        this.routePath = routePath;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public Integer getLevelVal() {
        return levelVal;
    }

    public void setLevelVal(Integer levelVal) {
        this.levelVal = levelVal;
    }
}
