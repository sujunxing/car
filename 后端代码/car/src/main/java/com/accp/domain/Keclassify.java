package com.accp.domain;

import java.util.List;

/**
 * 客户分类类
 * @author 小朱
 *
 */
public class Keclassify {
	/**
	 * 分类编号
	 */
    private String keyid;

    /**
     * 客户类型别名
     */
    private String keyketype;

    /**
     * 价格类型
     */
    private String keypricetype;

    /**
     * 有效期
     */
    private String keyyxq;

    /**
     * 会费
     */
    private Integer keyhf;

    /**
     * 类别
     */
    private String keytype;

    private String bei1;

    private String bei2;

    private String bei3;

    private String bei4;

    private Integer bei5;
    
    /**
     * 客户集合
     */
    private List<Client> clients;

    public void setClients(List<Client> clients) {
		this.clients = clients;
	}
    
    public List<Client> getClients() {
		return clients;
	}
    
    public String getKeyid() {
        return keyid;
    }

    public void setKeyid(String keyid) {
        this.keyid = keyid;
    }

    public String getKeyketype() {
        return keyketype;
    }

    public void setKeyketype(String keyketype) {
        this.keyketype = keyketype;
    }

    public String getKeypricetype() {
        return keypricetype;
    }

    public void setKeypricetype(String keypricetype) {
        this.keypricetype = keypricetype;
    }

    public String getKeyyxq() {
        return keyyxq;
    }

    public void setKeyyxq(String keyyxq) {
        this.keyyxq = keyyxq;
    }

    public Integer getKeyhf() {
        return keyhf;
    }

    public void setKeyhf(Integer keyhf) {
        this.keyhf = keyhf;
    }

    public String getKeytype() {
        return keytype;
    }

    public void setKeytype(String keytype) {
        this.keytype = keytype;
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