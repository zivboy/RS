package com.ssm.business.entity;

public class Batch {
    private Integer id;

    private Integer batchYear;

    private String batchName;

    private String batchScores;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBatchYear() {
        return batchYear;
    }

    public void setBatchYear(Integer batchYear) {
        this.batchYear = batchYear;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName == null ? null : batchName.trim();
    }

    public String getBatchScores() {
        return batchScores;
    }

    public void setBatchScores(String batchScores) {
        this.batchScores = batchScores == null ? null : batchScores.trim();
    }
}