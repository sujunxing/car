package com.accp.domain;

public class Department {
    private Integer detid;

    private String detname;

    private String detclassify;

    private Integer shpid;

    public Integer getDetid() {
        return detid;
    }

    public void setDetid(Integer detid) {
        this.detid = detid;
    }

    public String getDetname() {
        return detname;
    }

    public void setDetname(String detname) {
        this.detname = detname;
    }

    public String getDetclassify() {
        return detclassify;
    }

    public void setDetclassify(String detclassify) {
        this.detclassify = detclassify;
    }

    public Integer getShpid() {
        return shpid;
    }

    public void setShpid(Integer shpid) {
        this.shpid = shpid;
    }
}