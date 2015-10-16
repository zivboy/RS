package com.ssm.entity;

public class ColumnsWithBLOBs extends Columns {
    private String columnDefault;

    private String columnType;

    public String getColumnDefault() {
        return columnDefault;
    }

    public void setColumnDefault(String columnDefault) {
        this.columnDefault = columnDefault == null ? null : columnDefault.trim();
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType == null ? null : columnType.trim();
    }
}