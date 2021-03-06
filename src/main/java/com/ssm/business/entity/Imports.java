package com.ssm.business.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ssm.entity.Columns;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class Imports implements Serializable {

    private Integer importId;

    private String title;

    private Integer modelId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date actionTime;

    private Integer rowSum;

    private String filePath;

    private Integer state;

    private String message;

    private int fieldCount;

    private int pc;

    private String sf;

    private String sfdm;

    private String xq;

    private String xqdm;

    private boolean modelFlag;

    private List<Item> ItemList;

    private List<Columns> column;

    private List<String> fieldHtml;

    private List<String> columnHtml;

    public String getSfdm() {
        return sfdm;
    }

    public void setSfdm(String sfdm) {
        this.sfdm = sfdm;
    }

    public String getXqdm() {
        return xqdm;
    }

    public void setXqdm(String xqdm) {
        this.xqdm = xqdm;
    }

    public String getSf() {
        return sf;
    }

    public void setSf(String sf) {
        this.sf = sf;
    }

    public String getXq() {
        return xq;
    }

    public void setXq(String xq) {
        this.xq = xq;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public Integer getImportId() {
        return importId;
    }

    public void setImportId(Integer importId) {
        this.importId = importId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public Date getActionTime() {
        return actionTime;
    }

    public void setActionTime(Date actionTime) {
        this.actionTime = actionTime;
    }

    public Integer getRowSum() {
        return rowSum;
    }

    public void setRowSum(Integer rowSum) {
        this.rowSum = rowSum;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public int getFieldCount() {
        return fieldCount;
    }

    public void setFieldCount(int fieldCount) {
        this.fieldCount = fieldCount;
    }

    public List<Item> getItemList() {
        return ItemList;
    }

    public void setItemList(List<Item> itemList) {
        ItemList = itemList;
    }

    public List<Columns> getColumn() {
        return column;
    }

    public void setColumn(List<Columns> column) {
        this.column = column;
    }

    public boolean isModelFlag() {
        return modelFlag;
    }

    public void setModelFlag(boolean modelFlag) {
        this.modelFlag = modelFlag;
    }

    public List<String> getFieldHtml() {
        return fieldHtml;
    }

    public void setFieldHtml(List<String> fieldHtml) {
        this.fieldHtml = fieldHtml;
    }

    public List<String> getColumnHtml() {
        return columnHtml;
    }

    public void setColumnHtml(List<String> columnHtml) {
        this.columnHtml = columnHtml;
    }
}