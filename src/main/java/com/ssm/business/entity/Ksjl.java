package com.ssm.business.entity;

import java.util.Date;

public class Ksjl {
    private Long id;

    private String ksh;

    private Date qsrq;

    private Date zjrq;

    private String jl;

    private String rhzw;

    private String zmr;

    private String sf;

    private String pc;

    private Integer ny;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKsh() {
        return ksh;
    }

    public void setKsh(String ksh) {
        this.ksh = ksh == null ? null : ksh.trim();
    }

    public Date getQsrq() {
        return qsrq;
    }

    public void setQsrq(Date qsrq) {
        this.qsrq = qsrq;
    }

    public Date getZjrq() {
        return zjrq;
    }

    public void setZjrq(Date zjrq) {
        this.zjrq = zjrq;
    }

    public String getJl() {
        return jl;
    }

    public void setJl(String jl) {
        this.jl = jl == null ? null : jl.trim();
    }

    public String getRhzw() {
        return rhzw;
    }

    public void setRhzw(String rhzw) {
        this.rhzw = rhzw == null ? null : rhzw.trim();
    }

    public String getZmr() {
        return zmr;
    }

    public void setZmr(String zmr) {
        this.zmr = zmr == null ? null : zmr.trim();
    }

    public String getSf() {
        return sf;
    }

    public void setSf(String sf) {
        this.sf = sf == null ? null : sf.trim();
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc == null ? null : pc.trim();
    }

    public Integer getNy() {
        return ny;
    }

    public void setNy(Integer ny) {
        this.ny = ny;
    }
}