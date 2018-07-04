package com.zoushiyou.model.dto;

/**
 * 返回前端的数据对象
 * @param <T> 对象
 */
public class ResultVo<T> {
    private Integer totalNum = 0;
    private Integer status = 200;
    private String message = "";
    private T data = null;

    public ResultVo() {
    }

    public ResultVo(Integer totalNum, Integer status, String message, T data) {
        this.totalNum = totalNum;
        this.status = status;
        this.message = message;
        this.data = data;
    }

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
