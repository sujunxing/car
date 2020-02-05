package com.accp.domain;

/**
 * 区类
 * @author 小朱
 *
 */
public class District {
	/**
	 * 区id
	 */
    private Integer districtid;

    /**
     * 区名
     */
    private String districtname;

    /**
     * 所属城市
     */
    private Integer cityid;

    public Integer getDistrictid() {
        return districtid;
    }

    public void setDistrictid(Integer districtid) {
        this.districtid = districtid;
    }

    public String getDistrictname() {
        return districtname;
    }

    public void setDistrictname(String districtname) {
        this.districtname = districtname;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }
}