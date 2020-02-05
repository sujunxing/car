package com.accp.domain;
/**
 * 车辆归属类
 * @author 小朱
 *
 */
public class Ownership {
	
	/**
	 * 车辆归属id
	 */
    private Integer ownershipid;

    /**
     * 车辆归属名称
     */
    private String ownershipname;

    public Integer getOwnershipid() {
        return ownershipid;
    }

    public void setOwnershipid(Integer ownershipid) {
        this.ownershipid = ownershipid;
    }

    public String getOwnershipname() {
        return ownershipname;
    }

    public void setOwnershipname(String ownershipname) {
        this.ownershipname = ownershipname;
    }
}