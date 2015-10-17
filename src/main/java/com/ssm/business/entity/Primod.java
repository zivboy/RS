package com.ssm.business.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public class Primod {
    private Integer modId;

    private String modName;

    private String modState;

    private Integer modWidth;

    private Integer modHeight;

    private String url;

    //private MultipartFile file;

    private String filePath;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
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

    public String getModState() {
        return modState;
    }

    public void setModState(String modState) {
        this.modState = modState;
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

    /*public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }*/

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Date getStateTime() {
        return stateTime;
    }

    public void setStateTime(Date stateTime) {
        this.stateTime = stateTime;
    }
}