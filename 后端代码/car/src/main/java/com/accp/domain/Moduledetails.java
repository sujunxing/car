package com.accp.domain;

/**
 * 模块详情
 * @author 小朱
 *
 */
public class Moduledetails {
	/**
	 * 主键自增
	 */
    private Integer mosid;

    /**
     * 角色id
     */
    private Integer jueid;

    /**
     * 模块id
     */
    private Integer moeid;

    public Integer getMosid() {
        return mosid;
    }

    public void setMosid(Integer mosid) {
        this.mosid = mosid;
    }

    public Integer getJueid() {
        return jueid;
    }

    public void setJueid(Integer jueid) {
        this.jueid = jueid;
    }

    public Integer getMoeid() {
        return moeid;
    }

    public void setMoeid(Integer moeid) {
        this.moeid = moeid;
    }
}