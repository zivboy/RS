package com.ssm.business.entity;

public class Student {
    private Integer studentId;

    private String examineeNumber;

    private String candidateNumber;

    private Integer studentType;

    private String name;

    private String college;

    private String noticeNumber;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getExamineeNumber() {
        return examineeNumber;
    }

    public void setExamineeNumber(String examineeNumber) {
        this.examineeNumber = examineeNumber == null ? null : examineeNumber.trim();
    }

    public String getCandidateNumber() {
        return candidateNumber;
    }

    public void setCandidateNumber(String candidateNumber) {
        this.candidateNumber = candidateNumber == null ? null : candidateNumber.trim();
    }

    public Integer getStudentType() {
        return studentType;
    }

    public void setStudentType(Integer studentType) {
        this.studentType = studentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    public String getNoticeNumber() {
        return noticeNumber;
    }

    public void setNoticeNumber(String noticeNumber) {
        this.noticeNumber = noticeNumber == null ? null : noticeNumber.trim();
    }
}