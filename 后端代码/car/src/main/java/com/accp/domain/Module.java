package com.accp.domain;

import java.util.List;

/**
 * 模块表
 * @author 小朱
 *
 */
public class Module {
	/**
	 * 模块id
	 */
    private Integer moeid;

    /**
     * 模块名称
     */
    private String moename;

    /**
     * 模块父级id
     */
    private Integer monid;

    /**
     * 状态
     */
    private Integer moetype;

    /**
     * 路径
     */
    private String path;
    
    /**
     * 子功能集合
     */
    private List<Module> modules;
    
    public void setModules(List<Module> modules) {
		this.modules = modules;
	}
    
    public List<Module> getModules() {
		return modules;
	}

    public Integer getMoeid() {
        return moeid;
    }

    public void setMoeid(Integer moeid) {
        this.moeid = moeid;
    }

    public String getMoename() {
        return moename;
    }

    public void setMoename(String moename) {
        this.moename = moename;
    }

    public Integer getMonid() {
        return monid;
    }

    public void setMonid(Integer monid) {
        this.monid = monid;
    }

    public Integer getMoetype() {
        return moetype;
    }

    public void setMoetype(Integer moetype) {
        this.moetype = moetype;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}