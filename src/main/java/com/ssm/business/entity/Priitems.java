package com.ssm.business.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Priitems {
    private Integer priId;

    private Integer modId;

    private String priCode;

    private String priValue;

    private Integer priLeft;

    private Integer priTop;

    private Integer priWidth;

    private Integer priHeight;

    private String modName;

    private String priName;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date stateTime;

    public Integer getPriId() {
        return priId;
    }

    public void setPriId(Integer priId) {
        this.priId = priId;
    }

    public Integer getModId() {
        return modId;
    }

    public void setModId(Integer modId) {
        this.modId = modId;
    }

    public String getPriCode() {
        return priCode;
    }

    public void setPriCode(String priCode) {
        this.priCode = priCode == null ? null : priCode.trim();
    }

    public String getPriValue() {
        return priValue;
    }

    public void setPriValue(String priValue) {
        this.priValue = priValue == null ? null : priValue.trim();
    }

    public Integer getPriLeft() {
        return priLeft;
    }

    public void setPriLeft(Integer priLeft) {
        this.priLeft = priLeft;
    }

    public Integer getPriTop() {
        return priTop;
    }

    public void setPriTop(Integer priTop) {
        this.priTop = priTop;
    }

    public Integer getPriWidth() {
        return priWidth;
    }

    public void setPriWidth(Integer priWidth) {
        this.priWidth = priWidth;
    }

    public Integer getPriHeight() {
        return priHeight;
    }

    public void setPriHeight(Integer priHeight) {
        this.priHeight = priHeight;
    }

    public Date getStateTime() {
        return stateTime;
    }

    public void setStateTime(Date stateTime) {
        this.stateTime = stateTime;
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName;
    }

    public String getPriName() {
        return priName;
    }

    public void setPriName(String priName) {
        this.priName = priName == null ? null : priName.trim();
    }
}