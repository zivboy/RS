package com.ssm.business.entity;

import java.util.Date;

public class Primod {
    private Integer modId;

    private String modName;

    private Integer modWidth;

    private Integer modHeight;

    private String url;

    private Date stateTime;

    public Integer getModId() {
        return modId;
    }

    public void setModId(Integer modId) {
        this.modId = modId;
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName == null ? null : modName.trim();
    }

    public Integer getModWidth() {
        return modWidth;
    }

    public void setModWidth(Integer modWidth) {
        this.modWidth = modWidth;
    }

    public Integer getModHeight() {
        return modHeight;
    }

    public void setModHeight(Integer modHeight) {
        this.modHeight = modHeight;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getStateTime() {
        return stateTime;
    }

    public void setStateTime(Date stateTime) {
        this.stateTime = stateTime;
    }
}