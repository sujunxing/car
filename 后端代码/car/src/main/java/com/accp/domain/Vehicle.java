package com.accp.domain;

/**
 * 车辆类
 * @author 小朱
 *
 */
public class Vehicle {
	/**
	 * 车辆号码
	 */
    private String veeid;

    /**
     * 车型品牌
     */
    private String veebrand;

    /**
     * 车辆型号
     */
    private String veetype;

    /**
     * 驾驶员
     */
    private String veedriver;

    /**
     * 驾驶员电话
     */
    private String veedriverphone;

    /**
     * 出生日期
     */
    private String veedate;

    /**
     * 车辆归属
     */
    private String veeaffiliation;

    /**
     * 驾证到期
     */
    private String veeexpires;

    /**
     * 车架号
     */
    private String veeframe;

    /**
     * 发动机号
     */
    private String veeengine;

    /**
     * 车辆年款
     */
    private String veeyear;

    /**
     * 里程
     */
    private String veemileage;

    /**
     * 发动机品牌
     */
    private String endid;

    /**
     * 载重
     */
    private Integer veeload;

    /**
     * 购买日期
     */
    private String veepurchase;

    /**
     * 上牌日期
     */
    private String veeregistered;

    /**
     * 车检日期
     */
    private String veevehicle;

    /**
     * 燃油类别
     */
    private String veecategory;

    /**
     * 车系
     */
    private String veeseries;

    /**
     * 交强保险公司
     */
    private String veeinsurance;

    /**
     * 交强保险到期
     */
    private String veeexpire;

    /**
     * 在我投保车
     */
    private String veeflag;

    /**
     * 商业保险公司
     */
    private String veebusiness;

    /**
     * 商业险到期
     */
    private String veebusexp;

    /**
     * 下次保养里程
     */
    private String veeupkeep;

    /**
     * 下次保养日期
     */
    private String veeupdate;

    /**
     * 客户id
     */
    private String cltid;

    private String bei1;

    private String bei2;

    private String bei3;

    private String bei4;

    private Integer bei5;
    
    /**
     * 车型品牌对象
     */
    private Trademark trademark;
    
    /**
     * 客户对象
     */
    private Client client;
    
    /**
     * 发动机品牌对象
     */
    private Enginebrand enginebrand;

    public Trademark getTrademark() {
		return trademark;
	}

	public void setTrademark(Trademark trademark) {
		this.trademark = trademark;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Enginebrand getEnginebrand() {
		return enginebrand;
	}

	public void setEnginebrand(Enginebrand enginebrand) {
		this.enginebrand = enginebrand;
	}

	public String getVeeid() {
        return veeid;
    }

    public void setVeeid(String veeid) {
        this.veeid = veeid;
    }

    public String getVeebrand() {
        return veebrand;
    }

    public void setVeebrand(String veebrand) {
        this.veebrand = veebrand;
    }

    public String getVeetype() {
        return veetype;
    }

    public void setVeetype(String veetype) {
        this.veetype = veetype;
    }

    public String getVeedriver() {
        return veedriver;
    }

    public void setVeedriver(String veedriver) {
        this.veedriver = veedriver;
    }

    public String getVeedriverphone() {
        return veedriverphone;
    }

    public void setVeedriverphone(String veedriverphone) {
        this.veedriverphone = veedriverphone;
    }

    public String getVeedate() {
        return veedate;
    }

    public void setVeedate(String veedate) {
        this.veedate = veedate;
    }

    public String getVeeaffiliation() {
        return veeaffiliation;
    }

    public void setVeeaffiliation(String veeaffiliation) {
        this.veeaffiliation = veeaffiliation;
    }

    public String getVeeexpires() {
        return veeexpires;
    }

    public void setVeeexpires(String veeexpires) {
        this.veeexpires = veeexpires;
    }

    public String getVeeframe() {
        return veeframe;
    }

    public void setVeeframe(String veeframe) {
        this.veeframe = veeframe;
    }

    public String getVeeengine() {
        return veeengine;
    }

    public void setVeeengine(String veeengine) {
        this.veeengine = veeengine;
    }

    public String getVeeyear() {
        return veeyear;
    }

    public void setVeeyear(String veeyear) {
        this.veeyear = veeyear;
    }

    public String getVeemileage() {
        return veemileage;
    }

    public void setVeemileage(String veemileage) {
        this.veemileage = veemileage;
    }

    public String getEndid() {
        return endid;
    }

    public void setEndid(String endid) {
        this.endid = endid;
    }

    public Integer getVeeload() {
        return veeload;
    }

    public void setVeeload(Integer veeload) {
        this.veeload = veeload;
    }

    public String getVeepurchase() {
        return veepurchase;
    }

    public void setVeepurchase(String veepurchase) {
        this.veepurchase = veepurchase;
    }

    public String getVeeregistered() {
        return veeregistered;
    }

    public void setVeeregistered(String veeregistered) {
        this.veeregistered = veeregistered;
    }

    public String getVeevehicle() {
        return veevehicle;
    }

    public void setVeevehicle(String veevehicle) {
        this.veevehicle = veevehicle;
    }

    public String getVeecategory() {
        return veecategory;
    }

    public void setVeecategory(String veecategory) {
        this.veecategory = veecategory;
    }

    public String getVeeseries() {
        return veeseries;
    }

    public void setVeeseries(String veeseries) {
        this.veeseries = veeseries;
    }

    public String getVeeinsurance() {
        return veeinsurance;
    }

    public void setVeeinsurance(String veeinsurance) {
        this.veeinsurance = veeinsurance;
    }

    public String getVeeexpire() {
        return veeexpire;
    }

    public void setVeeexpire(String veeexpire) {
        this.veeexpire = veeexpire;
    }

    public String getVeeflag() {
        return veeflag;
    }

    public void setVeeflag(String veeflag) {
        this.veeflag = veeflag;
    }

    public String getVeebusiness() {
        return veebusiness;
    }

    public void setVeebusiness(String veebusiness) {
        this.veebusiness = veebusiness;
    }

    public String getVeebusexp() {
        return veebusexp;
    }

    public void setVeebusexp(String veebusexp) {
        this.veebusexp = veebusexp;
    }

    public String getVeeupkeep() {
        return veeupkeep;
    }

    public void setVeeupkeep(String veeupkeep) {
        this.veeupkeep = veeupkeep;
    }

    public String getVeeupdate() {
        return veeupdate;
    }

    public void setVeeupdate(String veeupdate) {
        this.veeupdate = veeupdate;
    }

    public String getCltid() {
        return cltid;
    }

    public void setCltid(String cltid) {
        this.cltid = cltid;
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