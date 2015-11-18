package com.ssm.business.entity;

public class CodeManage {
    private Integer id;

    private String dmType;

    private String dm;

    private String mc;

    private Float zgf;

    private String xdx;

    private Integer nf;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDmType() {
        return dmType;
    }

    public void setDmType(String dmType) {
        this.dmType = dmType == null ? null : dmType.trim();
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm == null ? null : dm.trim();
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc == null ? null : mc.trim();
    }

    public Float getZgf() {
        return zgf;
    }

    public void setZgf(Float zgf) {
        this.zgf = zgf;
    }

    public String getXdx() {
        return xdx;
    }

    public void setXdx(String xdx) {
        this.xdx = xdx == null ? null : xdx.trim();
    }

    public Integer getNf() {
        return nf;
    }

    public void setNf(Integer nf) {
        this.nf = nf;
    }
}