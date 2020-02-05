package com.accp.domain;

import java.util.List;

/**
 * 客户表
 * @author asus
 *
 */
public class Client {
	/**
	 * 客户id
	 */
    private String cltid;

    /**
     * 客户名称
     */
    private String cltname;

    /**
     * 联系人
     */
    private String cltlinkman;

    /**
     * 手机号码
     */
    private String cltphone;

    /**
     * 客户地址
     */
    private String cltaddress;

    /**
     * 客户生日
     */
    private String cltbirthday;

    /**
     * 账期
     */
    private String cltpayment;

    /**
     * 挂账额度
     */
    private Integer cltlimit;

    /**
     * 专属顾问
     */
    private String cltcounselor;

    /**
     * 顾问电话
     */
    private String cltcouphone;

    /**
     * 省
     */
    private Integer provinceid;

    /**
     * 市
     */
    private Integer cityid;

    /**
     * 区
     */
    private Integer districtid;

    /**
     * 备注
     */
    private String cltremake;

    /**
     * 纳税人识别号
     */
    private String cltdiscern;

    /**
     * 注册电话
     */
    private String cltregister;

    /**
     * 开户银行
     */
    private String cltaccount;

    /**
     * 银行账号
     */
    private String cltregistered;

    /**
     * 注册地址
     */
    private String cltconaddress;

    /**
     * 其一
     */
    private String cltelse;

    /**
     * 其二
     */
    private String cltelses;

    /**
     * 其三
     */
    private String cltelsess;

    /**
     * 其四
     */
    private String cltelsesss;

    /**
     * 会员卡号
     */
    private Integer me2berid;

    /**
     * 客户分类
     */
    private String keyid;

    private String bei1;

    private String bei2;

    private String bei3;

    private String bei4;

    private Integer bei5;
    
    /**
     * 省对象
     */
    private Province province;//
    
    /**
     * 市对象
     */
    private City city;//
    
    /**
     * 区对象
     */
    private District district;
    
    /**
     * 客户分类对象
     */
    private Keclassify keclassify;
    
    /**
     * 车集合
     */
    private List<Vehicle> vehicles;

    public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public Keclassify getKeclassify() {
		return keclassify;
	}

	public void setKeclassify(Keclassify keclassify) {
		this.keclassify = keclassify;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public String getCltid() {
        return cltid;
    }

    public void setCltid(String cltid) {
        this.cltid = cltid;
    }

    public String getCltname() {
        return cltname;
    }

    public void setCltname(String cltname) {
        this.cltname = cltname;
    }

    public String getCltlinkman() {
        return cltlinkman;
    }

    public void setCltlinkman(String cltlinkman) {
        this.cltlinkman = cltlinkman;
    }

    public String getCltphone() {
        return cltphone;
    }

    public void setCltphone(String cltphone) {
        this.cltphone = cltphone;
    }

    public String getCltaddress() {
        return cltaddress;
    }

    public void setCltaddress(String cltaddress) {
        this.cltaddress = cltaddress;
    }

    public String getCltbirthday() {
        return cltbirthday;
    }

    public void setCltbirthday(String cltbirthday) {
        this.cltbirthday = cltbirthday;
    }

    public String getCltpayment() {
        return cltpayment;
    }

    public void setCltpayment(String cltpayment) {
        this.cltpayment = cltpayment;
    }

    public Integer getCltlimit() {
        return cltlimit;
    }

    public void setCltlimit(Integer cltlimit) {
        this.cltlimit = cltlimit;
    }

    public String getCltcounselor() {
        return cltcounselor;
    }

    public void setCltcounselor(String cltcounselor) {
        this.cltcounselor = cltcounselor;
    }

    public String getCltcouphone() {
        return cltcouphone;
    }

    public void setCltcouphone(String cltcouphone) {
        this.cltcouphone = cltcouphone;
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public Integer getDistrictid() {
        return districtid;
    }

    public void setDistrictid(Integer districtid) {
        this.districtid = districtid;
    }

    public String getCltremake() {
        return cltremake;
    }

    public void setCltremake(String cltremake) {
        this.cltremake = cltremake;
    }

    public String getCltdiscern() {
        return cltdiscern;
    }

    public void setCltdiscern(String cltdiscern) {
        this.cltdiscern = cltdiscern;
    }

    public String getCltregister() {
        return cltregister;
    }

    public void setCltregister(String cltregister) {
        this.cltregister = cltregister;
    }

    public String getCltaccount() {
        return cltaccount;
    }

    public void setCltaccount(String cltaccount) {
        this.cltaccount = cltaccount;
    }

    public String getCltregistered() {
        return cltregistered;
    }

    public void setCltregistered(String cltregistered) {
        this.cltregistered = cltregistered;
    }

    public String getCltconaddress() {
        return cltconaddress;
    }

    public void setCltconaddress(String cltconaddress) {
        this.cltconaddress = cltconaddress;
    }

    public String getCltelse() {
        return cltelse;
    }

    public void setCltelse(String cltelse) {
        this.cltelse = cltelse;
    }

    public String getCltelses() {
        return cltelses;
    }

    public void setCltelses(String cltelses) {
        this.cltelses = cltelses;
    }

    public String getCltelsess() {
        return cltelsess;
    }

    public void setCltelsess(String cltelsess) {
        this.cltelsess = cltelsess;
    }

    public String getCltelsesss() {
        return cltelsesss;
    }

    public void setCltelsesss(String cltelsesss) {
        this.cltelsesss = cltelsesss;
    }

    public Integer getMe2berid() {
        return me2berid;
    }

    public void setMe2berid(Integer me2berid) {
        this.me2berid = me2berid;
    }

    public String getKeyid() {
        return keyid;
    }

    public void setKeyid(String keyid) {
        this.keyid = keyid;
    }

    public String getBei1() {
        return bei1;
    }

    public void setBei1(String bei1) {
        this.bei1 = bei1;
    }

    public String getBei2() {
        return bei2;
    }

    public void setBei2(String bei2) {
        this.bei2 = bei2;
    }

    public String getBei3() {
        return bei3;
    }

    public void setBei3(String bei3) {
        this.bei3 = bei3;
    }

    public String getBei4() {
        return bei4;
    }

    public void setBei4(String bei4) {
        this.bei4 = bei4;
    }

    public Integer getBei5() {
        return bei5;
    }

    public void setBei5(Integer bei5) {
        this.bei5 = bei5;
    }
}