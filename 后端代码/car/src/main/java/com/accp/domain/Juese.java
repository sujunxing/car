package com.accp.domain;

import java.util.List;

/**
 * 角色类
 * @author asus
 *
 */
public class Juese {
	/**
	 * 角色id
	 */
    private Integer jueid;

    /**
     * 角色名称
     */
    private String juename;

    /**
     * 单据id
     */
    private Integer resid;

    /**
     * 数据id
     */
    private Integer daxid;

    /**
     * 仓库id
     */
    private Integer waeid;
    
    /**
     * 拥有权限集合
     */
    private List<Moduledetails> moduledetails;
    
    public void setModuledetails(List<Moduledetails> moduledetails) {
		this.moduledetails = moduledetails;
	}
    
    public List<Moduledetails> getModuledetails() {
		return moduledetails;
	}

    public Integer getJueid() {
        return jueid;
    }

    public void setJueid(Integer jueid) {
        this.jueid = jueid;
    }

    public String getJuename() {
        return juename;
    }

    public void setJuename(String juename) {
        this.juename = juename;
    }

    public Integer getResid() {
        return resid;
    }

    public void setResid(Integer resid) {
        this.resid = resid;
    }

    public Integer getDaxid() {
        return daxid;
    }

    public void setDaxid(Integer daxid) {
        this.daxid = daxid;
    }

    public Integer getWaeid() {
        return waeid;
    }

    public void setWaeid(Integer waeid) {
        this.waeid = waeid;
    }
}