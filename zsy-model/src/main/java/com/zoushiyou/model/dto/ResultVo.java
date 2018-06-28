package com.zoushiyou.model.dto;

import com.zoushiyou.model.base.BaseModel;

/**
 * 返回前端的数据对象
 * @param <T> 对象
 */
public class ResultVo<T> {
    private Integer totalNum = 0;
    private Integer status = 200;
    private String message = "";
    private T data = null;

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
