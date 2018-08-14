package com.zoushiyou.model.dto;

import com.zoushiyou.model.core.FuncInfo;

import java.util.List;

public class FuncInfoDto extends BaseDto {
    public FuncInfoDto(FuncInfo model) {
        super(model);
        this.routePath = model.getRoutePath();
        this.styleName = model.getStyleName();
        this.levelVal = model.getLevelVal();
    }

    private String routePath;
    private String styleName;
    private Integer levelVal;
    private List<FuncInfoDto> subItem;

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

    public List<FuncInfoDto> getSubItem() {
        return subItem;
    }

    public void setSubItem(List<FuncInfoDto> subItem) {
        this.subItem = subItem;
    }
}
