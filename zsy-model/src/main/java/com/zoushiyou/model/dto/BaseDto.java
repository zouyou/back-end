package com.zoushiyou.model.dto;

import com.zoushiyou.model.base.BaseModel;

/**
 * 基础DTO
 */
public abstract class BaseDto {

    public BaseDto(BaseModel model) {
        if (model != null) {
            this.id = model.getId();
            this.parentId = model.getParentId();
            this.code = model.getCode();
            this.name = model.getName();
        }
    }

    protected Long id;
    protected Long parentId;
    protected String code;
    protected String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
