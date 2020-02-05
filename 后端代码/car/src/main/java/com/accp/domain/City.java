package com.accp.domain;

import java.util.List;

/**
 * 市类
 * @author 小朱
 *
 */
public class City {
	/**
	 * 市id
	 */
    private Integer cityid;

    /**
     * 市名称
     */
    private String cityname;

    /**
     * 省id
     */
    private Integer provinceid;
    
    
	/**
	 * 区集合
	 */
    private List<District> districts;
    
    public void setDistricts(List<District> districts) {
		this.districts = districts;
	}
    
    public List<District> getDistricts() {
		return districts;
	}
    
    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }
}