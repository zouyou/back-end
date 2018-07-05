package com.zoushiyou.model.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zoushiyou.model.base.BaseModel;

/**
 * 附件信息
 * Author QQ:511570155
 * Date 2018-7-5 16:06
 */
public class Attachments extends BaseModel {
    /**
     * 外键类型
     */
    private Integer fkType;
    /**
     * 外键Id
     */
    private String fkPkId;
    /**
     * 扩展名
     */
    private String suffix;
    /**
     * 文件流
     */
    @JsonIgnore
    private byte[] streamData;

    public Integer getFkType() {
        return fkType;
    }

    public void setFkType(Integer fkType) {
        this.fkType = fkType;
    }

    public String getFkPkId() {
        return fkPkId;
    }

    public void setFkPkId(String fkPkId) {
        this.fkPkId = fkPkId;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public byte[] getStreamData() {
        return streamData;
    }

    public void setStreamData(byte[] streamData) {
        this.streamData = streamData;
    }
}
