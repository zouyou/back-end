package com.zoushiyou.model.user;

import com.zoushiyou.model.base.BaseModel;

/**
 * Author :QQ:511570155
 */
public class Student extends BaseModel {
    private String name;//姓名
    private Boolean sex;//性别
    private String address;//地址

    public String getName() {
        return name;
    }

    public Boolean getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}


