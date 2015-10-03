package com.ssm.business.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public class Item implements Serializable {
    private Integer itemId;

    private Integer modelId;

    private String sourceTabel;

    private String sourceField;

    private String targetTable;

    private String targetField;

    private Integer state;

    private List<Item> list;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getSourceTabel() {
        return sourceTabel;
    }

    public void setSourceTabel(String sourceTabel) {
        this.sourceTabel = sourceTabel == null ? null : sourceTabel.trim();
    }

    public String getSourceField() {
        return sourceField;
    }

    public void setSourceField(String sourceField) {
        this.sourceField = sourceField == null ? null : sourceField.trim();
    }

    public String getTargetTable() {
        return targetTable;
    }

    public void setTargetTable(String targetTable) {
        this.targetTable = targetTable == null ? null : targetTable.trim();
    }

    public String getTargetField() {
        return targetField;
    }

    public void setTargetField(String targetField) {
        this.targetField = targetField == null ? null : targetField.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public List<Item> getList() {
        return list;
    }

    public void setList(List<Item> list) {
        this.list = list;
    }
}