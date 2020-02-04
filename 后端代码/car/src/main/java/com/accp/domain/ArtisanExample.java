package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ArtisanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArtisanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andArnidIsNull() {
            addCriterion("arnid is null");
            return (Criteria) this;
        }

        public Criteria andArnidIsNotNull() {
            addCriterion("arnid is not null");
            return (Criteria) this;
        }

        public Criteria andArnidEqualTo(String value) {
            addCriterion("arnid =", value, "arnid");
            return (Criteria) this;
        }

        public Criteria andArnidNotEqualTo(String value) {
            addCriterion("arnid <>", value, "arnid");
            return (Criteria) this;
        }

        public Criteria andArnidGreaterThan(String value) {
            addCriterion("arnid >", value, "arnid");
            return (Criteria) this;
        }

        public Criteria andArnidGreaterThanOrEqualTo(String value) {
            addCriterion("arnid >=", value, "arnid");
            return (Criteria) this;
        }

        public Criteria andArnidLessThan(String value) {
            addCriterion("arnid <", value, "arnid");
            return (Criteria) this;
        }

        public Criteria andArnidLessThanOrEqualTo(String value) {
            addCriterion("arnid <=", value, "arnid");
            return (Criteria) this;
        }

        public Criteria andArnidLike(String value) {
            addCriterion("arnid like", value, "arnid");
            return (Criteria) this;
        }

        public Criteria andArnidNotLike(String value) {
            addCriterion("arnid not like", value, "arnid");
            return (Criteria) this;
        }

        public Criteria andArnidIn(List<String> values) {
            addCriterion("arnid in", values, "arnid");
            return (Criteria) this;
        }

        public Criteria andArnidNotIn(List<String> values) {
            addCriterion("arnid not in", values, "arnid");
            return (Criteria) this;
        }

        public Criteria andArnidBetween(String value1, String value2) {
            addCriterion("arnid between", value1, value2, "arnid");
            return (Criteria) this;
        }

        public Criteria andArnidNotBetween(String value1, String value2) {
            addCriterion("arnid not between", value1, value2, "arnid");
            return (Criteria) this;
        }

        public Criteria andArnnameIsNull() {
            addCriterion("arnname is null");
            return (Criteria) this;
        }

        public Criteria andArnnameIsNotNull() {
            addCriterion("arnname is not null");
            return (Criteria) this;
        }

        public Criteria andArnnameEqualTo(String value) {
            addCriterion("arnname =", value, "arnname");
            return (Criteria) this;
        }

        public Criteria andArnnameNotEqualTo(String value) {
            addCriterion("arnname <>", value, "arnname");
            return (Criteria) this;
        }

        public Criteria andArnnameGreaterThan(String value) {
            addCriterion("arnname >", value, "arnname");
            return (Criteria) this;
        }

        public Criteria andArnnameGreaterThanOrEqualTo(String value) {
            addCriterion("arnname >=", value, "arnname");
            return (Criteria) this;
        }

        public Criteria andArnnameLessThan(String value) {
            addCriterion("arnname <", value, "arnname");
            return (Criteria) this;
        }

        public Criteria andArnnameLessThanOrEqualTo(String value) {
            addCriterion("arnname <=", value, "arnname");
            return (Criteria) this;
        }

        public Criteria andArnnameLike(String value) {
            addCriterion("arnname like", value, "arnname");
            return (Criteria) this;
        }

        public Criteria andArnnameNotLike(String value) {
            addCriterion("arnname not like", value, "arnname");
            return (Criteria) this;
        }

        public Criteria andArnnameIn(List<String> values) {
            addCriterion("arnname in", values, "arnname");
            return (Criteria) this;
        }

        public Criteria andArnnameNotIn(List<String> values) {
            addCriterion("arnname not in", values, "arnname");
            return (Criteria) this;
        }

        public Criteria andArnnameBetween(String value1, String value2) {
            addCriterion("arnname between", value1, value2, "arnname");
            return (Criteria) this;
        }

        public Criteria andArnnameNotBetween(String value1, String value2) {
            addCriterion("arnname not between", value1, value2, "arnname");
            return (Criteria) this;
        }

        public Criteria andArnsexIsNull() {
            addCriterion("arnsex is null");
            return (Criteria) this;
        }

        public Criteria andArnsexIsNotNull() {
            addCriterion("arnsex is not null");
            return (Criteria) this;
        }

        public Criteria andArnsexEqualTo(String value) {
            addCriterion("arnsex =", value, "arnsex");
            return (Criteria) this;
        }

        public Criteria andArnsexNotEqualTo(String value) {
            addCriterion("arnsex <>", value, "arnsex");
            return (Criteria) this;
        }

        public Criteria andArnsexGreaterThan(String value) {
            addCriterion("arnsex >", value, "arnsex");
            return (Criteria) this;
        }

        public Criteria andArnsexGreaterThanOrEqualTo(String value) {
            addCriterion("arnsex >=", value, "arnsex");
            return (Criteria) this;
        }

        public Criteria andArnsexLessThan(String value) {
            addCriterion("arnsex <", value, "arnsex");
            return (Criteria) this;
        }

        public Criteria andArnsexLessThanOrEqualTo(String value) {
            addCriterion("arnsex <=", value, "arnsex");
            return (Criteria) this;
        }

        public Criteria andArnsexLike(String value) {
            addCriterion("arnsex like", value, "arnsex");
            return (Criteria) this;
        }

        public Criteria andArnsexNotLike(String value) {
            addCriterion("arnsex not like", value, "arnsex");
            return (Criteria) this;
        }

        public Criteria andArnsexIn(List<String> values) {
            addCriterion("arnsex in", values, "arnsex");
            return (Criteria) this;
        }

        public Criteria andArnsexNotIn(List<String> values) {
            addCriterion("arnsex not in", values, "arnsex");
            return (Criteria) this;
        }

        public Criteria andArnsexBetween(String value1, String value2) {
            addCriterion("arnsex between", value1, value2, "arnsex");
            return (Criteria) this;
        }

        public Criteria andArnsexNotBetween(String value1, String value2) {
            addCriterion("arnsex not between", value1, value2, "arnsex");
            return (Criteria) this;
        }

        public Criteria andArnfalgIsNull() {
            addCriterion("arnfalg is null");
            return (Criteria) this;
        }

        public Criteria andArnfalgIsNotNull() {
            addCriterion("arnfalg is not null");
            return (Criteria) this;
        }

        public Criteria andArnfalgEqualTo(Integer value) {
            addCriterion("arnfalg =", value, "arnfalg");
            return (Criteria) this;
        }

        public Criteria andArnfalgNotEqualTo(Integer value) {
            addCriterion("arnfalg <>", value, "arnfalg");
            return (Criteria) this;
        }

        public Criteria andArnfalgGreaterThan(Integer value) {
            addCriterion("arnfalg >", value, "arnfalg");
            return (Criteria) this;
        }

        public Criteria andArnfalgGreaterThanOrEqualTo(Integer value) {
            addCriterion("arnfalg >=", value, "arnfalg");
            return (Criteria) this;
        }

        public Criteria andArnfalgLessThan(Integer value) {
            addCriterion("arnfalg <", value, "arnfalg");
            return (Criteria) this;
        }

        public Criteria andArnfalgLessThanOrEqualTo(Integer value) {
            addCriterion("arnfalg <=", value, "arnfalg");
            return (Criteria) this;
        }

        public Criteria andArnfalgIn(List<Integer> values) {
            addCriterion("arnfalg in", values, "arnfalg");
            return (Criteria) this;
        }

        public Criteria andArnfalgNotIn(List<Integer> values) {
            addCriterion("arnfalg not in", values, "arnfalg");
            return (Criteria) this;
        }

        public Criteria andArnfalgBetween(Integer value1, Integer value2) {
            addCriterion("arnfalg between", value1, value2, "arnfalg");
            return (Criteria) this;
        }

        public Criteria andArnfalgNotBetween(Integer value1, Integer value2) {
            addCriterion("arnfalg not between", value1, value2, "arnfalg");
            return (Criteria) this;
        }

        public Criteria andTemidIsNull() {
            addCriterion("temid is null");
            return (Criteria) this;
        }

        public Criteria andTemidIsNotNull() {
            addCriterion("temid is not null");
            return (Criteria) this;
        }

        public Criteria andTemidEqualTo(String value) {
            addCriterion("temid =", value, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidNotEqualTo(String value) {
            addCriterion("temid <>", value, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidGreaterThan(String value) {
            addCriterion("temid >", value, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidGreaterThanOrEqualTo(String value) {
            addCriterion("temid >=", value, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidLessThan(String value) {
            addCriterion("temid <", value, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidLessThanOrEqualTo(String value) {
            addCriterion("temid <=", value, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidLike(String value) {
            addCriterion("temid like", value, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidNotLike(String value) {
            addCriterion("temid not like", value, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidIn(List<String> values) {
            addCriterion("temid in", values, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidNotIn(List<String> values) {
            addCriterion("temid not in", values, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidBetween(String value1, String value2) {
            addCriterion("temid between", value1, value2, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidNotBetween(String value1, String value2) {
            addCriterion("temid not between", value1, value2, "temid");
            return (Criteria) this;
        }

        public Criteria andArnphoneIsNull() {
            addCriterion("arnphone is null");
            return (Criteria) this;
        }

        public Criteria andArnphoneIsNotNull() {
            addCriterion("arnphone is not null");
            return (Criteria) this;
        }

        public Criteria andArnphoneEqualTo(String value) {
            addCriterion("arnphone =", value, "arnphone");
            return (Criteria) this;
        }

        public Criteria andArnphoneNotEqualTo(String value) {
            addCriterion("arnphone <>", value, "arnphone");
            return (Criteria) this;
        }

        public Criteria andArnphoneGreaterThan(String value) {
            addCriterion("arnphone >", value, "arnphone");
            return (Criteria) this;
        }

        public Criteria andArnphoneGreaterThanOrEqualTo(String value) {
            addCriterion("arnphone >=", value, "arnphone");
            return (Criteria) this;
        }

        public Criteria andArnphoneLessThan(String value) {
            addCriterion("arnphone <", value, "arnphone");
            return (Criteria) this;
        }

        public Criteria andArnphoneLessThanOrEqualTo(String value) {
            addCriterion("arnphone <=", value, "arnphone");
            return (Criteria) this;
        }

        public Criteria andArnphoneLike(String value) {
            addCriterion("arnphone like", value, "arnphone");
            return (Criteria) this;
        }

        public Criteria andArnphoneNotLike(String value) {
            addCriterion("arnphone not like", value, "arnphone");
            return (Criteria) this;
        }

        public Criteria andArnphoneIn(List<String> values) {
            addCriterion("arnphone in", values, "arnphone");
            return (Criteria) this;
        }

        public Criteria andArnphoneNotIn(List<String> values) {
            addCriterion("arnphone not in", values, "arnphone");
            return (Criteria) this;
        }

        public Criteria andArnphoneBetween(String value1, String value2) {
            addCriterion("arnphone between", value1, value2, "arnphone");
            return (Criteria) this;
        }

        public Criteria andArnphoneNotBetween(String value1, String value2) {
            addCriterion("arnphone not between", value1, value2, "arnphone");
            return (Criteria) this;
        }

        public Criteria andArnusernameIsNull() {
            addCriterion("arnusername is null");
            return (Criteria) this;
        }

        public Criteria andArnusernameIsNotNull() {
            addCriterion("arnusername is not null");
            return (Criteria) this;
        }

        public Criteria andArnusernameEqualTo(String value) {
            addCriterion("arnusername =", value, "arnusername");
            return (Criteria) this;
        }

        public Criteria andArnusernameNotEqualTo(String value) {
            addCriterion("arnusername <>", value, "arnusername");
            return (Criteria) this;
        }

        public Criteria andArnusernameGreaterThan(String value) {
            addCriterion("arnusername >", value, "arnusername");
            return (Criteria) this;
        }

        public Criteria andArnusernameGreaterThanOrEqualTo(String value) {
            addCriterion("arnusername >=", value, "arnusername");
            return (Criteria) this;
        }

        public Criteria andArnusernameLessThan(String value) {
            addCriterion("arnusername <", value, "arnusername");
            return (Criteria) this;
        }

        public Criteria andArnusernameLessThanOrEqualTo(String value) {
            addCriterion("arnusername <=", value, "arnusername");
            return (Criteria) this;
        }

        public Criteria andArnusernameLike(String value) {
            addCriterion("arnusername like", value, "arnusername");
            return (Criteria) this;
        }

        public Criteria andArnusernameNotLike(String value) {
            addCriterion("arnusername not like", value, "arnusername");
            return (Criteria) this;
        }

        public Criteria andArnusernameIn(List<String> values) {
            addCriterion("arnusername in", values, "arnusername");
            return (Criteria) this;
        }

        public Criteria andArnusernameNotIn(List<String> values) {
            addCriterion("arnusername not in", values, "arnusername");
            return (Criteria) this;
        }

        public Criteria andArnusernameBetween(String value1, String value2) {
            addCriterion("arnusername between", value1, value2, "arnusername");
            return (Criteria) this;
        }

        public Criteria andArnusernameNotBetween(String value1, String value2) {
            addCriterion("arnusername not between", value1, value2, "arnusername");
            return (Criteria) this;
        }

        public Criteria andArnaddressIsNull() {
            addCriterion("arnaddress is null");
            return (Criteria) this;
        }

        public Criteria andArnaddressIsNotNull() {
            addCriterion("arnaddress is not null");
            return (Criteria) this;
        }

        public Criteria andArnaddressEqualTo(String value) {
            addCriterion("arnaddress =", value, "arnaddress");
            return (Criteria) this;
        }

        public Criteria andArnaddressNotEqualTo(String value) {
            addCriterion("arnaddress <>", value, "arnaddress");
            return (Criteria) this;
        }

        public Criteria andArnaddressGreaterThan(String value) {
            addCriterion("arnaddress >", value, "arnaddress");
            return (Criteria) this;
        }

        public Criteria andArnaddressGreaterThanOrEqualTo(String value) {
            addCriterion("arnaddress >=", value, "arnaddress");
            return (Criteria) this;
        }

        public Criteria andArnaddressLessThan(String value) {
            addCriterion("arnaddress <", value, "arnaddress");
            return (Criteria) this;
        }

        public Criteria andArnaddressLessThanOrEqualTo(String value) {
            addCriterion("arnaddress <=", value, "arnaddress");
            return (Criteria) this;
        }

        public Criteria andArnaddressLike(String value) {
            addCriterion("arnaddress like", value, "arnaddress");
            return (Criteria) this;
        }

        public Criteria andArnaddressNotLike(String value) {
            addCriterion("arnaddress not like", value, "arnaddress");
            return (Criteria) this;
        }

        public Criteria andArnaddressIn(List<String> values) {
            addCriterion("arnaddress in", values, "arnaddress");
            return (Criteria) this;
        }

        public Criteria andArnaddressNotIn(List<String> values) {
            addCriterion("arnaddress not in", values, "arnaddress");
            return (Criteria) this;
        }

        public Criteria andArnaddressBetween(String value1, String value2) {
            addCriterion("arnaddress between", value1, value2, "arnaddress");
            return (Criteria) this;
        }

        public Criteria andArnaddressNotBetween(String value1, String value2) {
            addCriterion("arnaddress not between", value1, value2, "arnaddress");
            return (Criteria) this;
        }

        public Criteria andArndateIsNull() {
            addCriterion("arndate is null");
            return (Criteria) this;
        }

        public Criteria andArndateIsNotNull() {
            addCriterion("arndate is not null");
            return (Criteria) this;
        }

        public Criteria andArndateEqualTo(String value) {
            addCriterion("arndate =", value, "arndate");
            return (Criteria) this;
        }

        public Criteria andArndateNotEqualTo(String value) {
            addCriterion("arndate <>", value, "arndate");
            return (Criteria) this;
        }

        public Criteria andArndateGreaterThan(String value) {
            addCriterion("arndate >", value, "arndate");
            return (Criteria) this;
        }

        public Criteria andArndateGreaterThanOrEqualTo(String value) {
            addCriterion("arndate >=", value, "arndate");
            return (Criteria) this;
        }

        public Criteria andArndateLessThan(String value) {
            addCriterion("arndate <", value, "arndate");
            return (Criteria) this;
        }

        public Criteria andArndateLessThanOrEqualTo(String value) {
            addCriterion("arndate <=", value, "arndate");
            return (Criteria) this;
        }

        public Criteria andArndateLike(String value) {
            addCriterion("arndate like", value, "arndate");
            return (Criteria) this;
        }

        public Criteria andArndateNotLike(String value) {
            addCriterion("arndate not like", value, "arndate");
            return (Criteria) this;
        }

        public Criteria andArndateIn(List<String> values) {
            addCriterion("arndate in", values, "arndate");
            return (Criteria) this;
        }

        public Criteria andArndateNotIn(List<String> values) {
            addCriterion("arndate not in", values, "arndate");
            return (Criteria) this;
        }

        public Criteria andArndateBetween(String value1, String value2) {
            addCriterion("arndate between", value1, value2, "arndate");
            return (Criteria) this;
        }

        public Criteria andArndateNotBetween(String value1, String value2) {
            addCriterion("arndate not between", value1, value2, "arndate");
            return (Criteria) this;
        }

        public Criteria andArnwechatIsNull() {
            addCriterion("arnwechat is null");
            return (Criteria) this;
        }

        public Criteria andArnwechatIsNotNull() {
            addCriterion("arnwechat is not null");
            return (Criteria) this;
        }

        public Criteria andArnwechatEqualTo(String value) {
            addCriterion("arnwechat =", value, "arnwechat");
            return (Criteria) this;
        }

        public Criteria andArnwechatNotEqualTo(String value) {
            addCriterion("arnwechat <>", value, "arnwechat");
            return (Criteria) this;
        }

        public Criteria andArnwechatGreaterThan(String value) {
            addCriterion("arnwechat >", value, "arnwechat");
            return (Criteria) this;
        }

        public Criteria andArnwechatGreaterThanOrEqualTo(String value) {
            addCriterion("arnwechat >=", value, "arnwechat");
            return (Criteria) this;
        }

        public Criteria andArnwechatLessThan(String value) {
            addCriterion("arnwechat <", value, "arnwechat");
            return (Criteria) this;
        }

        public Criteria andArnwechatLessThanOrEqualTo(String value) {
            addCriterion("arnwechat <=", value, "arnwechat");
            return (Criteria) this;
        }

        public Criteria andArnwechatLike(String value) {
            addCriterion("arnwechat like", value, "arnwechat");
            return (Criteria) this;
        }

        public Criteria andArnwechatNotLike(String value) {
            addCriterion("arnwechat not like", value, "arnwechat");
            return (Criteria) this;
        }

        public Criteria andArnwechatIn(List<String> values) {
            addCriterion("arnwechat in", values, "arnwechat");
            return (Criteria) this;
        }

        public Criteria andArnwechatNotIn(List<String> values) {
            addCriterion("arnwechat not in", values, "arnwechat");
            return (Criteria) this;
        }

        public Criteria andArnwechatBetween(String value1, String value2) {
            addCriterion("arnwechat between", value1, value2, "arnwechat");
            return (Criteria) this;
        }

        public Criteria andArnwechatNotBetween(String value1, String value2) {
            addCriterion("arnwechat not between", value1, value2, "arnwechat");
            return (Criteria) this;
        }

        public Criteria andArncardIsNull() {
            addCriterion("arncard is null");
            return (Criteria) this;
        }

        public Criteria andArncardIsNotNull() {
            addCriterion("arncard is not null");
            return (Criteria) this;
        }

        public Criteria andArncardEqualTo(String value) {
            addCriterion("arncard =", value, "arncard");
            return (Criteria) this;
        }

        public Criteria andArncardNotEqualTo(String value) {
            addCriterion("arncard <>", value, "arncard");
            return (Criteria) this;
        }

        public Criteria andArncardGreaterThan(String value) {
            addCriterion("arncard >", value, "arncard");
            return (Criteria) this;
        }

        public Criteria andArncardGreaterThanOrEqualTo(String value) {
            addCriterion("arncard >=", value, "arncard");
            return (Criteria) this;
        }

        public Criteria andArncardLessThan(String value) {
            addCriterion("arncard <", value, "arncard");
            return (Criteria) this;
        }

        public Criteria andArncardLessThanOrEqualTo(String value) {
            addCriterion("arncard <=", value, "arncard");
            return (Criteria) this;
        }

        public Criteria andArncardLike(String value) {
            addCriterion("arncard like", value, "arncard");
            return (Criteria) this;
        }

        public Criteria andArncardNotLike(String value) {
            addCriterion("arncard not like", value, "arncard");
            return (Criteria) this;
        }

        public Criteria andArncardIn(List<String> values) {
            addCriterion("arncard in", values, "arncard");
            return (Criteria) this;
        }

        public Criteria andArncardNotIn(List<String> values) {
            addCriterion("arncard not in", values, "arncard");
            return (Criteria) this;
        }

        public Criteria andArncardBetween(String value1, String value2) {
            addCriterion("arncard between", value1, value2, "arncard");
            return (Criteria) this;
        }

        public Criteria andArncardNotBetween(String value1, String value2) {
            addCriterion("arncard not between", value1, value2, "arncard");
            return (Criteria) this;
        }

        public Criteria andArncardaddressIsNull() {
            addCriterion("arncardaddress is null");
            return (Criteria) this;
        }

        public Criteria andArncardaddressIsNotNull() {
            addCriterion("arncardaddress is not null");
            return (Criteria) this;
        }

        public Criteria andArncardaddressEqualTo(String value) {
            addCriterion("arncardaddress =", value, "arncardaddress");
            return (Criteria) this;
        }

        public Criteria andArncardaddressNotEqualTo(String value) {
            addCriterion("arncardaddress <>", value, "arncardaddress");
            return (Criteria) this;
        }

        public Criteria andArncardaddressGreaterThan(String value) {
            addCriterion("arncardaddress >", value, "arncardaddress");
            return (Criteria) this;
        }

        public Criteria andArncardaddressGreaterThanOrEqualTo(String value) {
            addCriterion("arncardaddress >=", value, "arncardaddress");
            return (Criteria) this;
        }

        public Criteria andArncardaddressLessThan(String value) {
            addCriterion("arncardaddress <", value, "arncardaddress");
            return (Criteria) this;
        }

        public Criteria andArncardaddressLessThanOrEqualTo(String value) {
            addCriterion("arncardaddress <=", value, "arncardaddress");
            return (Criteria) this;
        }

        public Criteria andArncardaddressLike(String value) {
            addCriterion("arncardaddress like", value, "arncardaddress");
            return (Criteria) this;
        }

        public Criteria andArncardaddressNotLike(String value) {
            addCriterion("arncardaddress not like", value, "arncardaddress");
            return (Criteria) this;
        }

        public Criteria andArncardaddressIn(List<String> values) {
            addCriterion("arncardaddress in", values, "arncardaddress");
            return (Criteria) this;
        }

        public Criteria andArncardaddressNotIn(List<String> values) {
            addCriterion("arncardaddress not in", values, "arncardaddress");
            return (Criteria) this;
        }

        public Criteria andArncardaddressBetween(String value1, String value2) {
            addCriterion("arncardaddress between", value1, value2, "arncardaddress");
            return (Criteria) this;
        }

        public Criteria andArncardaddressNotBetween(String value1, String value2) {
            addCriterion("arncardaddress not between", value1, value2, "arncardaddress");
            return (Criteria) this;
        }

        public Criteria andArnbankIsNull() {
            addCriterion("arnbank is null");
            return (Criteria) this;
        }

        public Criteria andArnbankIsNotNull() {
            addCriterion("arnbank is not null");
            return (Criteria) this;
        }

        public Criteria andArnbankEqualTo(String value) {
            addCriterion("arnbank =", value, "arnbank");
            return (Criteria) this;
        }

        public Criteria andArnbankNotEqualTo(String value) {
            addCriterion("arnbank <>", value, "arnbank");
            return (Criteria) this;
        }

        public Criteria andArnbankGreaterThan(String value) {
            addCriterion("arnbank >", value, "arnbank");
            return (Criteria) this;
        }

        public Criteria andArnbankGreaterThanOrEqualTo(String value) {
            addCriterion("arnbank >=", value, "arnbank");
            return (Criteria) this;
        }

        public Criteria andArnbankLessThan(String value) {
            addCriterion("arnbank <", value, "arnbank");
            return (Criteria) this;
        }

        public Criteria andArnbankLessThanOrEqualTo(String value) {
            addCriterion("arnbank <=", value, "arnbank");
            return (Criteria) this;
        }

        public Criteria andArnbankLike(String value) {
            addCriterion("arnbank like", value, "arnbank");
            return (Criteria) this;
        }

        public Criteria andArnbankNotLike(String value) {
            addCriterion("arnbank not like", value, "arnbank");
            return (Criteria) this;
        }

        public Criteria andArnbankIn(List<String> values) {
            addCriterion("arnbank in", values, "arnbank");
            return (Criteria) this;
        }

        public Criteria andArnbankNotIn(List<String> values) {
            addCriterion("arnbank not in", values, "arnbank");
            return (Criteria) this;
        }

        public Criteria andArnbankBetween(String value1, String value2) {
            addCriterion("arnbank between", value1, value2, "arnbank");
            return (Criteria) this;
        }

        public Criteria andArnbankNotBetween(String value1, String value2) {
            addCriterion("arnbank not between", value1, value2, "arnbank");
            return (Criteria) this;
        }

        public Criteria andArnbanknumberIsNull() {
            addCriterion("arnbanknumber is null");
            return (Criteria) this;
        }

        public Criteria andArnbanknumberIsNotNull() {
            addCriterion("arnbanknumber is not null");
            return (Criteria) this;
        }

        public Criteria andArnbanknumberEqualTo(String value) {
            addCriterion("arnbanknumber =", value, "arnbanknumber");
            return (Criteria) this;
        }

        public Criteria andArnbanknumberNotEqualTo(String value) {
            addCriterion("arnbanknumber <>", value, "arnbanknumber");
            return (Criteria) this;
        }

        public Criteria andArnbanknumberGreaterThan(String value) {
            addCriterion("arnbanknumber >", value, "arnbanknumber");
            return (Criteria) this;
        }

        public Criteria andArnbanknumberGreaterThanOrEqualTo(String value) {
            addCriterion("arnbanknumber >=", value, "arnbanknumber");
            return (Criteria) this;
        }

        public Criteria andArnbanknumberLessThan(String value) {
            addCriterion("arnbanknumber <", value, "arnbanknumber");
            return (Criteria) this;
        }

        public Criteria andArnbanknumberLessThanOrEqualTo(String value) {
            addCriterion("arnbanknumber <=", value, "arnbanknumber");
            return (Criteria) this;
        }

        public Criteria andArnbanknumberLike(String value) {
            addCriterion("arnbanknumber like", value, "arnbanknumber");
            return (Criteria) this;
        }

        public Criteria andArnbanknumberNotLike(String value) {
            addCriterion("arnbanknumber not like", value, "arnbanknumber");
            return (Criteria) this;
        }

        public Criteria andArnbanknumberIn(List<String> values) {
            addCriterion("arnbanknumber in", values, "arnbanknumber");
            return (Criteria) this;
        }

        public Criteria andArnbanknumberNotIn(List<String> values) {
            addCriterion("arnbanknumber not in", values, "arnbanknumber");
            return (Criteria) this;
        }

        public Criteria andArnbanknumberBetween(String value1, String value2) {
            addCriterion("arnbanknumber between", value1, value2, "arnbanknumber");
            return (Criteria) this;
        }

        public Criteria andArnbanknumberNotBetween(String value1, String value2) {
            addCriterion("arnbanknumber not between", value1, value2, "arnbanknumber");
            return (Criteria) this;
        }

        public Criteria andArngradeIsNull() {
            addCriterion("arngrade is null");
            return (Criteria) this;
        }

        public Criteria andArngradeIsNotNull() {
            addCriterion("arngrade is not null");
            return (Criteria) this;
        }

        public Criteria andArngradeEqualTo(String value) {
            addCriterion("arngrade =", value, "arngrade");
            return (Criteria) this;
        }

        public Criteria andArngradeNotEqualTo(String value) {
            addCriterion("arngrade <>", value, "arngrade");
            return (Criteria) this;
        }

        public Criteria andArngradeGreaterThan(String value) {
            addCriterion("arngrade >", value, "arngrade");
            return (Criteria) this;
        }

        public Criteria andArngradeGreaterThanOrEqualTo(String value) {
            addCriterion("arngrade >=", value, "arngrade");
            return (Criteria) this;
        }

        public Criteria andArngradeLessThan(String value) {
            addCriterion("arngrade <", value, "arngrade");
            return (Criteria) this;
        }

        public Criteria andArngradeLessThanOrEqualTo(String value) {
            addCriterion("arngrade <=", value, "arngrade");
            return (Criteria) this;
        }

        public Criteria andArngradeLike(String value) {
            addCriterion("arngrade like", value, "arngrade");
            return (Criteria) this;
        }

        public Criteria andArngradeNotLike(String value) {
            addCriterion("arngrade not like", value, "arngrade");
            return (Criteria) this;
        }

        public Criteria andArngradeIn(List<String> values) {
            addCriterion("arngrade in", values, "arngrade");
            return (Criteria) this;
        }

        public Criteria andArngradeNotIn(List<String> values) {
            addCriterion("arngrade not in", values, "arngrade");
            return (Criteria) this;
        }

        public Criteria andArngradeBetween(String value1, String value2) {
            addCriterion("arngrade between", value1, value2, "arngrade");
            return (Criteria) this;
        }

        public Criteria andArngradeNotBetween(String value1, String value2) {
            addCriterion("arngrade not between", value1, value2, "arngrade");
            return (Criteria) this;
        }

        public Criteria andArntypeIsNull() {
            addCriterion("arntype is null");
            return (Criteria) this;
        }

        public Criteria andArntypeIsNotNull() {
            addCriterion("arntype is not null");
            return (Criteria) this;
        }

        public Criteria andArntypeEqualTo(String value) {
            addCriterion("arntype =", value, "arntype");
            return (Criteria) this;
        }

        public Criteria andArntypeNotEqualTo(String value) {
            addCriterion("arntype <>", value, "arntype");
            return (Criteria) this;
        }

        public Criteria andArntypeGreaterThan(String value) {
            addCriterion("arntype >", value, "arntype");
            return (Criteria) this;
        }

        public Criteria andArntypeGreaterThanOrEqualTo(String value) {
            addCriterion("arntype >=", value, "arntype");
            return (Criteria) this;
        }

        public Criteria andArntypeLessThan(String value) {
            addCriterion("arntype <", value, "arntype");
            return (Criteria) this;
        }

        public Criteria andArntypeLessThanOrEqualTo(String value) {
            addCriterion("arntype <=", value, "arntype");
            return (Criteria) this;
        }

        public Criteria andArntypeLike(String value) {
            addCriterion("arntype like", value, "arntype");
            return (Criteria) this;
        }

        public Criteria andArntypeNotLike(String value) {
            addCriterion("arntype not like", value, "arntype");
            return (Criteria) this;
        }

        public Criteria andArntypeIn(List<String> values) {
            addCriterion("arntype in", values, "arntype");
            return (Criteria) this;
        }

        public Criteria andArntypeNotIn(List<String> values) {
            addCriterion("arntype not in", values, "arntype");
            return (Criteria) this;
        }

        public Criteria andArntypeBetween(String value1, String value2) {
            addCriterion("arntype between", value1, value2, "arntype");
            return (Criteria) this;
        }

        public Criteria andArntypeNotBetween(String value1, String value2) {
            addCriterion("arntype not between", value1, value2, "arntype");
            return (Criteria) this;
        }

        public Criteria andArnbrandIsNull() {
            addCriterion("arnbrand is null");
            return (Criteria) this;
        }

        public Criteria andArnbrandIsNotNull() {
            addCriterion("arnbrand is not null");
            return (Criteria) this;
        }

        public Criteria andArnbrandEqualTo(String value) {
            addCriterion("arnbrand =", value, "arnbrand");
            return (Criteria) this;
        }

        public Criteria andArnbrandNotEqualTo(String value) {
            addCriterion("arnbrand <>", value, "arnbrand");
            return (Criteria) this;
        }

        public Criteria andArnbrandGreaterThan(String value) {
            addCriterion("arnbrand >", value, "arnbrand");
            return (Criteria) this;
        }

        public Criteria andArnbrandGreaterThanOrEqualTo(String value) {
            addCriterion("arnbrand >=", value, "arnbrand");
            return (Criteria) this;
        }

        public Criteria andArnbrandLessThan(String value) {
            addCriterion("arnbrand <", value, "arnbrand");
            return (Criteria) this;
        }

        public Criteria andArnbrandLessThanOrEqualTo(String value) {
            addCriterion("arnbrand <=", value, "arnbrand");
            return (Criteria) this;
        }

        public Criteria andArnbrandLike(String value) {
            addCriterion("arnbrand like", value, "arnbrand");
            return (Criteria) this;
        }

        public Criteria andArnbrandNotLike(String value) {
            addCriterion("arnbrand not like", value, "arnbrand");
            return (Criteria) this;
        }

        public Criteria andArnbrandIn(List<String> values) {
            addCriterion("arnbrand in", values, "arnbrand");
            return (Criteria) this;
        }

        public Criteria andArnbrandNotIn(List<String> values) {
            addCriterion("arnbrand not in", values, "arnbrand");
            return (Criteria) this;
        }

        public Criteria andArnbrandBetween(String value1, String value2) {
            addCriterion("arnbrand between", value1, value2, "arnbrand");
            return (Criteria) this;
        }

        public Criteria andArnbrandNotBetween(String value1, String value2) {
            addCriterion("arnbrand not between", value1, value2, "arnbrand");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}