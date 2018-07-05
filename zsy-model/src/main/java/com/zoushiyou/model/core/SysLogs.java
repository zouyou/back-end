package com.zoushiyou.model.core;

import com.zoushiyou.model.base.BaseModel;

/**
 * 操作日志
 * Author zsy:511570155
 * Date 2018-6-27
 */
public class SysLogs extends BaseModel {
    /**
     * 操作类型
     */
    private Integer opererType;
    /**
     * 操作内容
     */
    private String opererContent;

    public Integer getOpererType() {
        return opererType;
    }

    public void setOpererType(Integer opererType) {
        this.opererType = opererType;
    }

    public String getOpererContent() {
        return opererContent;
    }

    public void setOpererContent(String opererContent) {
        this.opererContent = opererContent;
    }
}
