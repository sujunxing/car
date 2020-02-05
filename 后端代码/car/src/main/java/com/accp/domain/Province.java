package com.accp.domain;

import java.util.List;

/**
 * 省
 * @author 小朱
 *
 */
public class Province {
	
	/**
	 * 省id
	 */
    private Integer provinceid;

    /**
     * 省名
     */
    private String provincename;
    
    /**
     * 市集合
     */
    private List<City> citys;
    
    public void setCitys(List<City> citys) {
		this.citys = citys;
	}
    
    public List<City> getCitys() {
		return citys;
	}

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }
}