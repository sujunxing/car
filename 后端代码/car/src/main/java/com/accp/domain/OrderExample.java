package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrridIsNull() {
            addCriterion("orrid is null");
            return (Criteria) this;
        }

        public Criteria andOrridIsNotNull() {
            addCriterion("orrid is not null");
            return (Criteria) this;
        }

        public Criteria andOrridEqualTo(String value) {
            addCriterion("orrid =", value, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridNotEqualTo(String value) {
            addCriterion("orrid <>", value, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridGreaterThan(String value) {
            addCriterion("orrid >", value, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridGreaterThanOrEqualTo(String value) {
            addCriterion("orrid >=", value, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridLessThan(String value) {
            addCriterion("orrid <", value, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridLessThanOrEqualTo(String value) {
            addCriterion("orrid <=", value, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridLike(String value) {
            addCriterion("orrid like", value, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridNotLike(String value) {
            addCriterion("orrid not like", value, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridIn(List<String> values) {
            addCriterion("orrid in", values, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridNotIn(List<String> values) {
            addCriterion("orrid not in", values, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridBetween(String value1, String value2) {
            addCriterion("orrid between", value1, value2, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridNotBetween(String value1, String value2) {
            addCriterion("orrid not between", value1, value2, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrrplateIsNull() {
            addCriterion("orrplate is null");
            return (Criteria) this;
        }

        public Criteria andOrrplateIsNotNull() {
            addCriterion("orrplate is not null");
            return (Criteria) this;
        }

        public Criteria andOrrplateEqualTo(String value) {
            addCriterion("orrplate =", value, "orrplate");
            return (Criteria) this;
        }

        public Criteria andOrrplateNotEqualTo(String value) {
            addCriterion("orrplate <>", value, "orrplate");
            return (Criteria) this;
        }

        public Criteria andOrrplateGreaterThan(String value) {
            addCriterion("orrplate >", value, "orrplate");
            return (Criteria) this;
        }

        public Criteria andOrrplateGreaterThanOrEqualTo(String value) {
            addCriterion("orrplate >=", value, "orrplate");
            return (Criteria) this;
        }

        public Criteria andOrrplateLessThan(String value) {
            addCriterion("orrplate <", value, "orrplate");
            return (Criteria) this;
        }

        public Criteria andOrrplateLessThanOrEqualTo(String value) {
            addCriterion("orrplate <=", value, "orrplate");
            return (Criteria) this;
        }

        public Criteria andOrrplateLike(String value) {
            addCriterion("orrplate like", value, "orrplate");
            return (Criteria) this;
        }

        public Criteria andOrrplateNotLike(String value) {
            addCriterion("orrplate not like", value, "orrplate");
            return (Criteria) this;
        }

        public Criteria andOrrplateIn(List<String> values) {
            addCriterion("orrplate in", values, "orrplate");
            return (Criteria) this;
        }

        public Criteria andOrrplateNotIn(List<String> values) {
            addCriterion("orrplate not in", values, "orrplate");
            return (Criteria) this;
        }

        public Criteria andOrrplateBetween(String value1, String value2) {
            addCriterion("orrplate between", value1, value2, "orrplate");
            return (Criteria) this;
        }

        public Criteria andOrrplateNotBetween(String value1, String value2) {
            addCriterion("orrplate not between", value1, value2, "orrplate");
            return (Criteria) this;
        }

        public Criteria andOrrframeIsNull() {
            addCriterion("orrframe is null");
            return (Criteria) this;
        }

        public Criteria andOrrframeIsNotNull() {
            addCriterion("orrframe is not null");
            return (Criteria) this;
        }

        public Criteria andOrrframeEqualTo(String value) {
            addCriterion("orrframe =", value, "orrframe");
            return (Criteria) this;
        }

        public Criteria andOrrframeNotEqualTo(String value) {
            addCriterion("orrframe <>", value, "orrframe");
            return (Criteria) this;
        }

        public Criteria andOrrframeGreaterThan(String value) {
            addCriterion("orrframe >", value, "orrframe");
            return (Criteria) this;
        }

        public Criteria andOrrframeGreaterThanOrEqualTo(String value) {
            addCriterion("orrframe >=", value, "orrframe");
            return (Criteria) this;
        }

        public Criteria andOrrframeLessThan(String value) {
            addCriterion("orrframe <", value, "orrframe");
            return (Criteria) this;
        }

        public Criteria andOrrframeLessThanOrEqualTo(String value) {
            addCriterion("orrframe <=", value, "orrframe");
            return (Criteria) this;
        }

        public Criteria andOrrframeLike(String value) {
            addCriterion("orrframe like", value, "orrframe");
            return (Criteria) this;
        }

        public Criteria andOrrframeNotLike(String value) {
            addCriterion("orrframe not like", value, "orrframe");
            return (Criteria) this;
        }

        public Criteria andOrrframeIn(List<String> values) {
            addCriterion("orrframe in", values, "orrframe");
            return (Criteria) this;
        }

        public Criteria andOrrframeNotIn(List<String> values) {
            addCriterion("orrframe not in", values, "orrframe");
            return (Criteria) this;
        }

        public Criteria andOrrframeBetween(String value1, String value2) {
            addCriterion("orrframe between", value1, value2, "orrframe");
            return (Criteria) this;
        }

        public Criteria andOrrframeNotBetween(String value1, String value2) {
            addCriterion("orrframe not between", value1, value2, "orrframe");
            return (Criteria) this;
        }

        public Criteria andOrrmodelIsNull() {
            addCriterion("orrmodel is null");
            return (Criteria) this;
        }

        public Criteria andOrrmodelIsNotNull() {
            addCriterion("orrmodel is not null");
            return (Criteria) this;
        }

        public Criteria andOrrmodelEqualTo(String value) {
            addCriterion("orrmodel =", value, "orrmodel");
            return (Criteria) this;
        }

        public Criteria andOrrmodelNotEqualTo(String value) {
            addCriterion("orrmodel <>", value, "orrmodel");
            return (Criteria) this;
        }

        public Criteria andOrrmodelGreaterThan(String value) {
            addCriterion("orrmodel >", value, "orrmodel");
            return (Criteria) this;
        }

        public Criteria andOrrmodelGreaterThanOrEqualTo(String value) {
            addCriterion("orrmodel >=", value, "orrmodel");
            return (Criteria) this;
        }

        public Criteria andOrrmodelLessThan(String value) {
            addCriterion("orrmodel <", value, "orrmodel");
            return (Criteria) this;
        }

        public Criteria andOrrmodelLessThanOrEqualTo(String value) {
            addCriterion("orrmodel <=", value, "orrmodel");
            return (Criteria) this;
        }

        public Criteria andOrrmodelLike(String value) {
            addCriterion("orrmodel like", value, "orrmodel");
            return (Criteria) this;
        }

        public Criteria andOrrmodelNotLike(String value) {
            addCriterion("orrmodel not like", value, "orrmodel");
            return (Criteria) this;
        }

        public Criteria andOrrmodelIn(List<String> values) {
            addCriterion("orrmodel in", values, "orrmodel");
            return (Criteria) this;
        }

        public Criteria andOrrmodelNotIn(List<String> values) {
            addCriterion("orrmodel not in", values, "orrmodel");
            return (Criteria) this;
        }

        public Criteria andOrrmodelBetween(String value1, String value2) {
            addCriterion("orrmodel between", value1, value2, "orrmodel");
            return (Criteria) this;
        }

        public Criteria andOrrmodelNotBetween(String value1, String value2) {
            addCriterion("orrmodel not between", value1, value2, "orrmodel");
            return (Criteria) this;
        }

        public Criteria andOrrbrandIsNull() {
            addCriterion("orrbrand is null");
            return (Criteria) this;
        }

        public Criteria andOrrbrandIsNotNull() {
            addCriterion("orrbrand is not null");
            return (Criteria) this;
        }

        public Criteria andOrrbrandEqualTo(String value) {
            addCriterion("orrbrand =", value, "orrbrand");
            return (Criteria) this;
        }

        public Criteria andOrrbrandNotEqualTo(String value) {
            addCriterion("orrbrand <>", value, "orrbrand");
            return (Criteria) this;
        }

        public Criteria andOrrbrandGreaterThan(String value) {
            addCriterion("orrbrand >", value, "orrbrand");
            return (Criteria) this;
        }

        public Criteria andOrrbrandGreaterThanOrEqualTo(String value) {
            addCriterion("orrbrand >=", value, "orrbrand");
            return (Criteria) this;
        }

        public Criteria andOrrbrandLessThan(String value) {
            addCriterion("orrbrand <", value, "orrbrand");
            return (Criteria) this;
        }

        public Criteria andOrrbrandLessThanOrEqualTo(String value) {
            addCriterion("orrbrand <=", value, "orrbrand");
            return (Criteria) this;
        }

        public Criteria andOrrbrandLike(String value) {
            addCriterion("orrbrand like", value, "orrbrand");
            return (Criteria) this;
        }

        public Criteria andOrrbrandNotLike(String value) {
            addCriterion("orrbrand not like", value, "orrbrand");
            return (Criteria) this;
        }

        public Criteria andOrrbrandIn(List<String> values) {
            addCriterion("orrbrand in", values, "orrbrand");
            return (Criteria) this;
        }

        public Criteria andOrrbrandNotIn(List<String> values) {
            addCriterion("orrbrand not in", values, "orrbrand");
            return (Criteria) this;
        }

        public Criteria andOrrbrandBetween(String value1, String value2) {
            addCriterion("orrbrand between", value1, value2, "orrbrand");
            return (Criteria) this;
        }

        public Criteria andOrrbrandNotBetween(String value1, String value2) {
            addCriterion("orrbrand not between", value1, value2, "orrbrand");
            return (Criteria) this;
        }

        public Criteria andOrrengineIsNull() {
            addCriterion("orrengine is null");
            return (Criteria) this;
        }

        public Criteria andOrrengineIsNotNull() {
            addCriterion("orrengine is not null");
            return (Criteria) this;
        }

        public Criteria andOrrengineEqualTo(String value) {
            addCriterion("orrengine =", value, "orrengine");
            return (Criteria) this;
        }

        public Criteria andOrrengineNotEqualTo(String value) {
            addCriterion("orrengine <>", value, "orrengine");
            return (Criteria) this;
        }

        public Criteria andOrrengineGreaterThan(String value) {
            addCriterion("orrengine >", value, "orrengine");
            return (Criteria) this;
        }

        public Criteria andOrrengineGreaterThanOrEqualTo(String value) {
            addCriterion("orrengine >=", value, "orrengine");
            return (Criteria) this;
        }

        public Criteria andOrrengineLessThan(String value) {
            addCriterion("orrengine <", value, "orrengine");
            return (Criteria) this;
        }

        public Criteria andOrrengineLessThanOrEqualTo(String value) {
            addCriterion("orrengine <=", value, "orrengine");
            return (Criteria) this;
        }

        public Criteria andOrrengineLike(String value) {
            addCriterion("orrengine like", value, "orrengine");
            return (Criteria) this;
        }

        public Criteria andOrrengineNotLike(String value) {
            addCriterion("orrengine not like", value, "orrengine");
            return (Criteria) this;
        }

        public Criteria andOrrengineIn(List<String> values) {
            addCriterion("orrengine in", values, "orrengine");
            return (Criteria) this;
        }

        public Criteria andOrrengineNotIn(List<String> values) {
            addCriterion("orrengine not in", values, "orrengine");
            return (Criteria) this;
        }

        public Criteria andOrrengineBetween(String value1, String value2) {
            addCriterion("orrengine between", value1, value2, "orrengine");
            return (Criteria) this;
        }

        public Criteria andOrrengineNotBetween(String value1, String value2) {
            addCriterion("orrengine not between", value1, value2, "orrengine");
            return (Criteria) this;
        }

        public Criteria andEndidIsNull() {
            addCriterion("endid is null");
            return (Criteria) this;
        }

        public Criteria andEndidIsNotNull() {
            addCriterion("endid is not null");
            return (Criteria) this;
        }

        public Criteria andEndidEqualTo(String value) {
            addCriterion("endid =", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidNotEqualTo(String value) {
            addCriterion("endid <>", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidGreaterThan(String value) {
            addCriterion("endid >", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidGreaterThanOrEqualTo(String value) {
            addCriterion("endid >=", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidLessThan(String value) {
            addCriterion("endid <", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidLessThanOrEqualTo(String value) {
            addCriterion("endid <=", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidLike(String value) {
            addCriterion("endid like", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidNotLike(String value) {
            addCriterion("endid not like", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidIn(List<String> values) {
            addCriterion("endid in", values, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidNotIn(List<String> values) {
            addCriterion("endid not in", values, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidBetween(String value1, String value2) {
            addCriterion("endid between", value1, value2, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidNotBetween(String value1, String value2) {
            addCriterion("endid not between", value1, value2, "endid");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("sid like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("sid not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andCltidIsNull() {
            addCriterion("cltid is null");
            return (Criteria) this;
        }

        public Criteria andCltidIsNotNull() {
            addCriterion("cltid is not null");
            return (Criteria) this;
        }

        public Criteria andCltidEqualTo(String value) {
            addCriterion("cltid =", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidNotEqualTo(String value) {
            addCriterion("cltid <>", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidGreaterThan(String value) {
            addCriterion("cltid >", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidGreaterThanOrEqualTo(String value) {
            addCriterion("cltid >=", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidLessThan(String value) {
            addCriterion("cltid <", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidLessThanOrEqualTo(String value) {
            addCriterion("cltid <=", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidLike(String value) {
            addCriterion("cltid like", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidNotLike(String value) {
            addCriterion("cltid not like", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidIn(List<String> values) {
            addCriterion("cltid in", values, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidNotIn(List<String> values) {
            addCriterion("cltid not in", values, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidBetween(String value1, String value2) {
            addCriterion("cltid between", value1, value2, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidNotBetween(String value1, String value2) {
            addCriterion("cltid not between", value1, value2, "cltid");
            return (Criteria) this;
        }

        public Criteria andOrrdriveIsNull() {
            addCriterion("orrdrive is null");
            return (Criteria) this;
        }

        public Criteria andOrrdriveIsNotNull() {
            addCriterion("orrdrive is not null");
            return (Criteria) this;
        }

        public Criteria andOrrdriveEqualTo(String value) {
            addCriterion("orrdrive =", value, "orrdrive");
            return (Criteria) this;
        }

        public Criteria andOrrdriveNotEqualTo(String value) {
            addCriterion("orrdrive <>", value, "orrdrive");
            return (Criteria) this;
        }

        public Criteria andOrrdriveGreaterThan(String value) {
            addCriterion("orrdrive >", value, "orrdrive");
            return (Criteria) this;
        }

        public Criteria andOrrdriveGreaterThanOrEqualTo(String value) {
            addCriterion("orrdrive >=", value, "orrdrive");
            return (Criteria) this;
        }

        public Criteria andOrrdriveLessThan(String value) {
            addCriterion("orrdrive <", value, "orrdrive");
            return (Criteria) this;
        }

        public Criteria andOrrdriveLessThanOrEqualTo(String value) {
            addCriterion("orrdrive <=", value, "orrdrive");
            return (Criteria) this;
        }

        public Criteria andOrrdriveLike(String value) {
            addCriterion("orrdrive like", value, "orrdrive");
            return (Criteria) this;
        }

        public Criteria andOrrdriveNotLike(String value) {
            addCriterion("orrdrive not like", value, "orrdrive");
            return (Criteria) this;
        }

        public Criteria andOrrdriveIn(List<String> values) {
            addCriterion("orrdrive in", values, "orrdrive");
            return (Criteria) this;
        }

        public Criteria andOrrdriveNotIn(List<String> values) {
            addCriterion("orrdrive not in", values, "orrdrive");
            return (Criteria) this;
        }

        public Criteria andOrrdriveBetween(String value1, String value2) {
            addCriterion("orrdrive between", value1, value2, "orrdrive");
            return (Criteria) this;
        }

        public Criteria andOrrdriveNotBetween(String value1, String value2) {
            addCriterion("orrdrive not between", value1, value2, "orrdrive");
            return (Criteria) this;
        }

        public Criteria andOrrphoneIsNull() {
            addCriterion("orrphone is null");
            return (Criteria) this;
        }

        public Criteria andOrrphoneIsNotNull() {
            addCriterion("orrphone is not null");
            return (Criteria) this;
        }

        public Criteria andOrrphoneEqualTo(String value) {
            addCriterion("orrphone =", value, "orrphone");
            return (Criteria) this;
        }

        public Criteria andOrrphoneNotEqualTo(String value) {
            addCriterion("orrphone <>", value, "orrphone");
            return (Criteria) this;
        }

        public Criteria andOrrphoneGreaterThan(String value) {
            addCriterion("orrphone >", value, "orrphone");
            return (Criteria) this;
        }

        public Criteria andOrrphoneGreaterThanOrEqualTo(String value) {
            addCriterion("orrphone >=", value, "orrphone");
            return (Criteria) this;
        }

        public Criteria andOrrphoneLessThan(String value) {
            addCriterion("orrphone <", value, "orrphone");
            return (Criteria) this;
        }

        public Criteria andOrrphoneLessThanOrEqualTo(String value) {
            addCriterion("orrphone <=", value, "orrphone");
            return (Criteria) this;
        }

        public Criteria andOrrphoneLike(String value) {
            addCriterion("orrphone like", value, "orrphone");
            return (Criteria) this;
        }

        public Criteria andOrrphoneNotLike(String value) {
            addCriterion("orrphone not like", value, "orrphone");
            return (Criteria) this;
        }

        public Criteria andOrrphoneIn(List<String> values) {
            addCriterion("orrphone in", values, "orrphone");
            return (Criteria) this;
        }

        public Criteria andOrrphoneNotIn(List<String> values) {
            addCriterion("orrphone not in", values, "orrphone");
            return (Criteria) this;
        }

        public Criteria andOrrphoneBetween(String value1, String value2) {
            addCriterion("orrphone between", value1, value2, "orrphone");
            return (Criteria) this;
        }

        public Criteria andOrrphoneNotBetween(String value1, String value2) {
            addCriterion("orrphone not between", value1, value2, "orrphone");
            return (Criteria) this;
        }

        public Criteria andOrrmillingsIsNull() {
            addCriterion("orrmillings is null");
            return (Criteria) this;
        }

        public Criteria andOrrmillingsIsNotNull() {
            addCriterion("orrmillings is not null");
            return (Criteria) this;
        }

        public Criteria andOrrmillingsEqualTo(String value) {
            addCriterion("orrmillings =", value, "orrmillings");
            return (Criteria) this;
        }

        public Criteria andOrrmillingsNotEqualTo(String value) {
            addCriterion("orrmillings <>", value, "orrmillings");
            return (Criteria) this;
        }

        public Criteria andOrrmillingsGreaterThan(String value) {
            addCriterion("orrmillings >", value, "orrmillings");
            return (Criteria) this;
        }

        public Criteria andOrrmillingsGreaterThanOrEqualTo(String value) {
            addCriterion("orrmillings >=", value, "orrmillings");
            return (Criteria) this;
        }

        public Criteria andOrrmillingsLessThan(String value) {
            addCriterion("orrmillings <", value, "orrmillings");
            return (Criteria) this;
        }

        public Criteria andOrrmillingsLessThanOrEqualTo(String value) {
            addCriterion("orrmillings <=", value, "orrmillings");
            return (Criteria) this;
        }

        public Criteria andOrrmillingsLike(String value) {
            addCriterion("orrmillings like", value, "orrmillings");
            return (Criteria) this;
        }

        public Criteria andOrrmillingsNotLike(String value) {
            addCriterion("orrmillings not like", value, "orrmillings");
            return (Criteria) this;
        }

        public Criteria andOrrmillingsIn(List<String> values) {
            addCriterion("orrmillings in", values, "orrmillings");
            return (Criteria) this;
        }

        public Criteria andOrrmillingsNotIn(List<String> values) {
            addCriterion("orrmillings not in", values, "orrmillings");
            return (Criteria) this;
        }

        public Criteria andOrrmillingsBetween(String value1, String value2) {
            addCriterion("orrmillings between", value1, value2, "orrmillings");
            return (Criteria) this;
        }

        public Criteria andOrrmillingsNotBetween(String value1, String value2) {
            addCriterion("orrmillings not between", value1, value2, "orrmillings");
            return (Criteria) this;
        }

        public Criteria andOrrmassIsNull() {
            addCriterion("orrmass is null");
            return (Criteria) this;
        }

        public Criteria andOrrmassIsNotNull() {
            addCriterion("orrmass is not null");
            return (Criteria) this;
        }

        public Criteria andOrrmassEqualTo(String value) {
            addCriterion("orrmass =", value, "orrmass");
            return (Criteria) this;
        }

        public Criteria andOrrmassNotEqualTo(String value) {
            addCriterion("orrmass <>", value, "orrmass");
            return (Criteria) this;
        }

        public Criteria andOrrmassGreaterThan(String value) {
            addCriterion("orrmass >", value, "orrmass");
            return (Criteria) this;
        }

        public Criteria andOrrmassGreaterThanOrEqualTo(String value) {
            addCriterion("orrmass >=", value, "orrmass");
            return (Criteria) this;
        }

        public Criteria andOrrmassLessThan(String value) {
            addCriterion("orrmass <", value, "orrmass");
            return (Criteria) this;
        }

        public Criteria andOrrmassLessThanOrEqualTo(String value) {
            addCriterion("orrmass <=", value, "orrmass");
            return (Criteria) this;
        }

        public Criteria andOrrmassLike(String value) {
            addCriterion("orrmass like", value, "orrmass");
            return (Criteria) this;
        }

        public Criteria andOrrmassNotLike(String value) {
            addCriterion("orrmass not like", value, "orrmass");
            return (Criteria) this;
        }

        public Criteria andOrrmassIn(List<String> values) {
            addCriterion("orrmass in", values, "orrmass");
            return (Criteria) this;
        }

        public Criteria andOrrmassNotIn(List<String> values) {
            addCriterion("orrmass not in", values, "orrmass");
            return (Criteria) this;
        }

        public Criteria andOrrmassBetween(String value1, String value2) {
            addCriterion("orrmass between", value1, value2, "orrmass");
            return (Criteria) this;
        }

        public Criteria andOrrmassNotBetween(String value1, String value2) {
            addCriterion("orrmass not between", value1, value2, "orrmass");
            return (Criteria) this;
        }

        public Criteria andOrrlastIsNull() {
            addCriterion("orrlast is null");
            return (Criteria) this;
        }

        public Criteria andOrrlastIsNotNull() {
            addCriterion("orrlast is not null");
            return (Criteria) this;
        }

        public Criteria andOrrlastEqualTo(String value) {
            addCriterion("orrlast =", value, "orrlast");
            return (Criteria) this;
        }

        public Criteria andOrrlastNotEqualTo(String value) {
            addCriterion("orrlast <>", value, "orrlast");
            return (Criteria) this;
        }

        public Criteria andOrrlastGreaterThan(String value) {
            addCriterion("orrlast >", value, "orrlast");
            return (Criteria) this;
        }

        public Criteria andOrrlastGreaterThanOrEqualTo(String value) {
            addCriterion("orrlast >=", value, "orrlast");
            return (Criteria) this;
        }

        public Criteria andOrrlastLessThan(String value) {
            addCriterion("orrlast <", value, "orrlast");
            return (Criteria) this;
        }

        public Criteria andOrrlastLessThanOrEqualTo(String value) {
            addCriterion("orrlast <=", value, "orrlast");
            return (Criteria) this;
        }

        public Criteria andOrrlastLike(String value) {
            addCriterion("orrlast like", value, "orrlast");
            return (Criteria) this;
        }

        public Criteria andOrrlastNotLike(String value) {
            addCriterion("orrlast not like", value, "orrlast");
            return (Criteria) this;
        }

        public Criteria andOrrlastIn(List<String> values) {
            addCriterion("orrlast in", values, "orrlast");
            return (Criteria) this;
        }

        public Criteria andOrrlastNotIn(List<String> values) {
            addCriterion("orrlast not in", values, "orrlast");
            return (Criteria) this;
        }

        public Criteria andOrrlastBetween(String value1, String value2) {
            addCriterion("orrlast between", value1, value2, "orrlast");
            return (Criteria) this;
        }

        public Criteria andOrrlastNotBetween(String value1, String value2) {
            addCriterion("orrlast not between", value1, value2, "orrlast");
            return (Criteria) this;
        }

        public Criteria andOrrmillingIsNull() {
            addCriterion("orrmilling is null");
            return (Criteria) this;
        }

        public Criteria andOrrmillingIsNotNull() {
            addCriterion("orrmilling is not null");
            return (Criteria) this;
        }

        public Criteria andOrrmillingEqualTo(String value) {
            addCriterion("orrmilling =", value, "orrmilling");
            return (Criteria) this;
        }

        public Criteria andOrrmillingNotEqualTo(String value) {
            addCriterion("orrmilling <>", value, "orrmilling");
            return (Criteria) this;
        }

        public Criteria andOrrmillingGreaterThan(String value) {
            addCriterion("orrmilling >", value, "orrmilling");
            return (Criteria) this;
        }

        public Criteria andOrrmillingGreaterThanOrEqualTo(String value) {
            addCriterion("orrmilling >=", value, "orrmilling");
            return (Criteria) this;
        }

        public Criteria andOrrmillingLessThan(String value) {
            addCriterion("orrmilling <", value, "orrmilling");
            return (Criteria) this;
        }

        public Criteria andOrrmillingLessThanOrEqualTo(String value) {
            addCriterion("orrmilling <=", value, "orrmilling");
            return (Criteria) this;
        }

        public Criteria andOrrmillingLike(String value) {
            addCriterion("orrmilling like", value, "orrmilling");
            return (Criteria) this;
        }

        public Criteria andOrrmillingNotLike(String value) {
            addCriterion("orrmilling not like", value, "orrmilling");
            return (Criteria) this;
        }

        public Criteria andOrrmillingIn(List<String> values) {
            addCriterion("orrmilling in", values, "orrmilling");
            return (Criteria) this;
        }

        public Criteria andOrrmillingNotIn(List<String> values) {
            addCriterion("orrmilling not in", values, "orrmilling");
            return (Criteria) this;
        }

        public Criteria andOrrmillingBetween(String value1, String value2) {
            addCriterion("orrmilling between", value1, value2, "orrmilling");
            return (Criteria) this;
        }

        public Criteria andOrrmillingNotBetween(String value1, String value2) {
            addCriterion("orrmilling not between", value1, value2, "orrmilling");
            return (Criteria) this;
        }

        public Criteria andCayidIsNull() {
            addCriterion("cayid is null");
            return (Criteria) this;
        }

        public Criteria andCayidIsNotNull() {
            addCriterion("cayid is not null");
            return (Criteria) this;
        }

        public Criteria andCayidEqualTo(String value) {
            addCriterion("cayid =", value, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidNotEqualTo(String value) {
            addCriterion("cayid <>", value, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidGreaterThan(String value) {
            addCriterion("cayid >", value, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidGreaterThanOrEqualTo(String value) {
            addCriterion("cayid >=", value, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidLessThan(String value) {
            addCriterion("cayid <", value, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidLessThanOrEqualTo(String value) {
            addCriterion("cayid <=", value, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidLike(String value) {
            addCriterion("cayid like", value, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidNotLike(String value) {
            addCriterion("cayid not like", value, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidIn(List<String> values) {
            addCriterion("cayid in", values, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidNotIn(List<String> values) {
            addCriterion("cayid not in", values, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidBetween(String value1, String value2) {
            addCriterion("cayid between", value1, value2, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidNotBetween(String value1, String value2) {
            addCriterion("cayid not between", value1, value2, "cayid");
            return (Criteria) this;
        }

        public Criteria andOrrroadIsNull() {
            addCriterion("orrroad is null");
            return (Criteria) this;
        }

        public Criteria andOrrroadIsNotNull() {
            addCriterion("orrroad is not null");
            return (Criteria) this;
        }

        public Criteria andOrrroadEqualTo(String value) {
            addCriterion("orrroad =", value, "orrroad");
            return (Criteria) this;
        }

        public Criteria andOrrroadNotEqualTo(String value) {
            addCriterion("orrroad <>", value, "orrroad");
            return (Criteria) this;
        }

        public Criteria andOrrroadGreaterThan(String value) {
            addCriterion("orrroad >", value, "orrroad");
            return (Criteria) this;
        }

        public Criteria andOrrroadGreaterThanOrEqualTo(String value) {
            addCriterion("orrroad >=", value, "orrroad");
            return (Criteria) this;
        }

        public Criteria andOrrroadLessThan(String value) {
            addCriterion("orrroad <", value, "orrroad");
            return (Criteria) this;
        }

        public Criteria andOrrroadLessThanOrEqualTo(String value) {
            addCriterion("orrroad <=", value, "orrroad");
            return (Criteria) this;
        }

        public Criteria andOrrroadLike(String value) {
            addCriterion("orrroad like", value, "orrroad");
            return (Criteria) this;
        }

        public Criteria andOrrroadNotLike(String value) {
            addCriterion("orrroad not like", value, "orrroad");
            return (Criteria) this;
        }

        public Criteria andOrrroadIn(List<String> values) {
            addCriterion("orrroad in", values, "orrroad");
            return (Criteria) this;
        }

        public Criteria andOrrroadNotIn(List<String> values) {
            addCriterion("orrroad not in", values, "orrroad");
            return (Criteria) this;
        }

        public Criteria andOrrroadBetween(String value1, String value2) {
            addCriterion("orrroad between", value1, value2, "orrroad");
            return (Criteria) this;
        }

        public Criteria andOrrroadNotBetween(String value1, String value2) {
            addCriterion("orrroad not between", value1, value2, "orrroad");
            return (Criteria) this;
        }

        public Criteria andOrrjoinIsNull() {
            addCriterion("orrjoin is null");
            return (Criteria) this;
        }

        public Criteria andOrrjoinIsNotNull() {
            addCriterion("orrjoin is not null");
            return (Criteria) this;
        }

        public Criteria andOrrjoinEqualTo(String value) {
            addCriterion("orrjoin =", value, "orrjoin");
            return (Criteria) this;
        }

        public Criteria andOrrjoinNotEqualTo(String value) {
            addCriterion("orrjoin <>", value, "orrjoin");
            return (Criteria) this;
        }

        public Criteria andOrrjoinGreaterThan(String value) {
            addCriterion("orrjoin >", value, "orrjoin");
            return (Criteria) this;
        }

        public Criteria andOrrjoinGreaterThanOrEqualTo(String value) {
            addCriterion("orrjoin >=", value, "orrjoin");
            return (Criteria) this;
        }

        public Criteria andOrrjoinLessThan(String value) {
            addCriterion("orrjoin <", value, "orrjoin");
            return (Criteria) this;
        }

        public Criteria andOrrjoinLessThanOrEqualTo(String value) {
            addCriterion("orrjoin <=", value, "orrjoin");
            return (Criteria) this;
        }

        public Criteria andOrrjoinLike(String value) {
            addCriterion("orrjoin like", value, "orrjoin");
            return (Criteria) this;
        }

        public Criteria andOrrjoinNotLike(String value) {
            addCriterion("orrjoin not like", value, "orrjoin");
            return (Criteria) this;
        }

        public Criteria andOrrjoinIn(List<String> values) {
            addCriterion("orrjoin in", values, "orrjoin");
            return (Criteria) this;
        }

        public Criteria andOrrjoinNotIn(List<String> values) {
            addCriterion("orrjoin not in", values, "orrjoin");
            return (Criteria) this;
        }

        public Criteria andOrrjoinBetween(String value1, String value2) {
            addCriterion("orrjoin between", value1, value2, "orrjoin");
            return (Criteria) this;
        }

        public Criteria andOrrjoinNotBetween(String value1, String value2) {
            addCriterion("orrjoin not between", value1, value2, "orrjoin");
            return (Criteria) this;
        }

        public Criteria andOrrpredictIsNull() {
            addCriterion("orrpredict is null");
            return (Criteria) this;
        }

        public Criteria andOrrpredictIsNotNull() {
            addCriterion("orrpredict is not null");
            return (Criteria) this;
        }

        public Criteria andOrrpredictEqualTo(String value) {
            addCriterion("orrpredict =", value, "orrpredict");
            return (Criteria) this;
        }

        public Criteria andOrrpredictNotEqualTo(String value) {
            addCriterion("orrpredict <>", value, "orrpredict");
            return (Criteria) this;
        }

        public Criteria andOrrpredictGreaterThan(String value) {
            addCriterion("orrpredict >", value, "orrpredict");
            return (Criteria) this;
        }

        public Criteria andOrrpredictGreaterThanOrEqualTo(String value) {
            addCriterion("orrpredict >=", value, "orrpredict");
            return (Criteria) this;
        }

        public Criteria andOrrpredictLessThan(String value) {
            addCriterion("orrpredict <", value, "orrpredict");
            return (Criteria) this;
        }

        public Criteria andOrrpredictLessThanOrEqualTo(String value) {
            addCriterion("orrpredict <=", value, "orrpredict");
            return (Criteria) this;
        }

        public Criteria andOrrpredictLike(String value) {
            addCriterion("orrpredict like", value, "orrpredict");
            return (Criteria) this;
        }

        public Criteria andOrrpredictNotLike(String value) {
            addCriterion("orrpredict not like", value, "orrpredict");
            return (Criteria) this;
        }

        public Criteria andOrrpredictIn(List<String> values) {
            addCriterion("orrpredict in", values, "orrpredict");
            return (Criteria) this;
        }

        public Criteria andOrrpredictNotIn(List<String> values) {
            addCriterion("orrpredict not in", values, "orrpredict");
            return (Criteria) this;
        }

        public Criteria andOrrpredictBetween(String value1, String value2) {
            addCriterion("orrpredict between", value1, value2, "orrpredict");
            return (Criteria) this;
        }

        public Criteria andOrrpredictNotBetween(String value1, String value2) {
            addCriterion("orrpredict not between", value1, value2, "orrpredict");
            return (Criteria) this;
        }

        public Criteria andOrrcloseIsNull() {
            addCriterion("orrclose is null");
            return (Criteria) this;
        }

        public Criteria andOrrcloseIsNotNull() {
            addCriterion("orrclose is not null");
            return (Criteria) this;
        }

        public Criteria andOrrcloseEqualTo(String value) {
            addCriterion("orrclose =", value, "orrclose");
            return (Criteria) this;
        }

        public Criteria andOrrcloseNotEqualTo(String value) {
            addCriterion("orrclose <>", value, "orrclose");
            return (Criteria) this;
        }

        public Criteria andOrrcloseGreaterThan(String value) {
            addCriterion("orrclose >", value, "orrclose");
            return (Criteria) this;
        }

        public Criteria andOrrcloseGreaterThanOrEqualTo(String value) {
            addCriterion("orrclose >=", value, "orrclose");
            return (Criteria) this;
        }

        public Criteria andOrrcloseLessThan(String value) {
            addCriterion("orrclose <", value, "orrclose");
            return (Criteria) this;
        }

        public Criteria andOrrcloseLessThanOrEqualTo(String value) {
            addCriterion("orrclose <=", value, "orrclose");
            return (Criteria) this;
        }

        public Criteria andOrrcloseLike(String value) {
            addCriterion("orrclose like", value, "orrclose");
            return (Criteria) this;
        }

        public Criteria andOrrcloseNotLike(String value) {
            addCriterion("orrclose not like", value, "orrclose");
            return (Criteria) this;
        }

        public Criteria andOrrcloseIn(List<String> values) {
            addCriterion("orrclose in", values, "orrclose");
            return (Criteria) this;
        }

        public Criteria andOrrcloseNotIn(List<String> values) {
            addCriterion("orrclose not in", values, "orrclose");
            return (Criteria) this;
        }

        public Criteria andOrrcloseBetween(String value1, String value2) {
            addCriterion("orrclose between", value1, value2, "orrclose");
            return (Criteria) this;
        }

        public Criteria andOrrcloseNotBetween(String value1, String value2) {
            addCriterion("orrclose not between", value1, value2, "orrclose");
            return (Criteria) this;
        }

        public Criteria andOrrreparationsIsNull() {
            addCriterion("orrreparations is null");
            return (Criteria) this;
        }

        public Criteria andOrrreparationsIsNotNull() {
            addCriterion("orrreparations is not null");
            return (Criteria) this;
        }

        public Criteria andOrrreparationsEqualTo(String value) {
            addCriterion("orrreparations =", value, "orrreparations");
            return (Criteria) this;
        }

        public Criteria andOrrreparationsNotEqualTo(String value) {
            addCriterion("orrreparations <>", value, "orrreparations");
            return (Criteria) this;
        }

        public Criteria andOrrreparationsGreaterThan(String value) {
            addCriterion("orrreparations >", value, "orrreparations");
            return (Criteria) this;
        }

        public Criteria andOrrreparationsGreaterThanOrEqualTo(String value) {
            addCriterion("orrreparations >=", value, "orrreparations");
            return (Criteria) this;
        }

        public Criteria andOrrreparationsLessThan(String value) {
            addCriterion("orrreparations <", value, "orrreparations");
            return (Criteria) this;
        }

        public Criteria andOrrreparationsLessThanOrEqualTo(String value) {
            addCriterion("orrreparations <=", value, "orrreparations");
            return (Criteria) this;
        }

        public Criteria andOrrreparationsLike(String value) {
            addCriterion("orrreparations like", value, "orrreparations");
            return (Criteria) this;
        }

        public Criteria andOrrreparationsNotLike(String value) {
            addCriterion("orrreparations not like", value, "orrreparations");
            return (Criteria) this;
        }

        public Criteria andOrrreparationsIn(List<String> values) {
            addCriterion("orrreparations in", values, "orrreparations");
            return (Criteria) this;
        }

        public Criteria andOrrreparationsNotIn(List<String> values) {
            addCriterion("orrreparations not in", values, "orrreparations");
            return (Criteria) this;
        }

        public Criteria andOrrreparationsBetween(String value1, String value2) {
            addCriterion("orrreparations between", value1, value2, "orrreparations");
            return (Criteria) this;
        }

        public Criteria andOrrreparationsNotBetween(String value1, String value2) {
            addCriterion("orrreparations not between", value1, value2, "orrreparations");
            return (Criteria) this;
        }

        public Criteria andOrrcompleteIsNull() {
            addCriterion("orrcomplete is null");
            return (Criteria) this;
        }

        public Criteria andOrrcompleteIsNotNull() {
            addCriterion("orrcomplete is not null");
            return (Criteria) this;
        }

        public Criteria andOrrcompleteEqualTo(String value) {
            addCriterion("orrcomplete =", value, "orrcomplete");
            return (Criteria) this;
        }

        public Criteria andOrrcompleteNotEqualTo(String value) {
            addCriterion("orrcomplete <>", value, "orrcomplete");
            return (Criteria) this;
        }

        public Criteria andOrrcompleteGreaterThan(String value) {
            addCriterion("orrcomplete >", value, "orrcomplete");
            return (Criteria) this;
        }

        public Criteria andOrrcompleteGreaterThanOrEqualTo(String value) {
            addCriterion("orrcomplete >=", value, "orrcomplete");
            return (Criteria) this;
        }

        public Criteria andOrrcompleteLessThan(String value) {
            addCriterion("orrcomplete <", value, "orrcomplete");
            return (Criteria) this;
        }

        public Criteria andOrrcompleteLessThanOrEqualTo(String value) {
            addCriterion("orrcomplete <=", value, "orrcomplete");
            return (Criteria) this;
        }

        public Criteria andOrrcompleteLike(String value) {
            addCriterion("orrcomplete like", value, "orrcomplete");
            return (Criteria) this;
        }

        public Criteria andOrrcompleteNotLike(String value) {
            addCriterion("orrcomplete not like", value, "orrcomplete");
            return (Criteria) this;
        }

        public Criteria andOrrcompleteIn(List<String> values) {
            addCriterion("orrcomplete in", values, "orrcomplete");
            return (Criteria) this;
        }

        public Criteria andOrrcompleteNotIn(List<String> values) {
            addCriterion("orrcomplete not in", values, "orrcomplete");
            return (Criteria) this;
        }

        public Criteria andOrrcompleteBetween(String value1, String value2) {
            addCriterion("orrcomplete between", value1, value2, "orrcomplete");
            return (Criteria) this;
        }

        public Criteria andOrrcompleteNotBetween(String value1, String value2) {
            addCriterion("orrcomplete not between", value1, value2, "orrcomplete");
            return (Criteria) this;
        }

        public Criteria andOrrmillIsNull() {
            addCriterion("orrmill is null");
            return (Criteria) this;
        }

        public Criteria andOrrmillIsNotNull() {
            addCriterion("orrmill is not null");
            return (Criteria) this;
        }

        public Criteria andOrrmillEqualTo(String value) {
            addCriterion("orrmill =", value, "orrmill");
            return (Criteria) this;
        }

        public Criteria andOrrmillNotEqualTo(String value) {
            addCriterion("orrmill <>", value, "orrmill");
            return (Criteria) this;
        }

        public Criteria andOrrmillGreaterThan(String value) {
            addCriterion("orrmill >", value, "orrmill");
            return (Criteria) this;
        }

        public Criteria andOrrmillGreaterThanOrEqualTo(String value) {
            addCriterion("orrmill >=", value, "orrmill");
            return (Criteria) this;
        }

        public Criteria andOrrmillLessThan(String value) {
            addCriterion("orrmill <", value, "orrmill");
            return (Criteria) this;
        }

        public Criteria andOrrmillLessThanOrEqualTo(String value) {
            addCriterion("orrmill <=", value, "orrmill");
            return (Criteria) this;
        }

        public Criteria andOrrmillLike(String value) {
            addCriterion("orrmill like", value, "orrmill");
            return (Criteria) this;
        }

        public Criteria andOrrmillNotLike(String value) {
            addCriterion("orrmill not like", value, "orrmill");
            return (Criteria) this;
        }

        public Criteria andOrrmillIn(List<String> values) {
            addCriterion("orrmill in", values, "orrmill");
            return (Criteria) this;
        }

        public Criteria andOrrmillNotIn(List<String> values) {
            addCriterion("orrmill not in", values, "orrmill");
            return (Criteria) this;
        }

        public Criteria andOrrmillBetween(String value1, String value2) {
            addCriterion("orrmill between", value1, value2, "orrmill");
            return (Criteria) this;
        }

        public Criteria andOrrmillNotBetween(String value1, String value2) {
            addCriterion("orrmill not between", value1, value2, "orrmill");
            return (Criteria) this;
        }

        public Criteria andOrrespriceIsNull() {
            addCriterion("orresprice is null");
            return (Criteria) this;
        }

        public Criteria andOrrespriceIsNotNull() {
            addCriterion("orresprice is not null");
            return (Criteria) this;
        }

        public Criteria andOrrespriceEqualTo(String value) {
            addCriterion("orresprice =", value, "orresprice");
            return (Criteria) this;
        }

        public Criteria andOrrespriceNotEqualTo(String value) {
            addCriterion("orresprice <>", value, "orresprice");
            return (Criteria) this;
        }

        public Criteria andOrrespriceGreaterThan(String value) {
            addCriterion("orresprice >", value, "orresprice");
            return (Criteria) this;
        }

        public Criteria andOrrespriceGreaterThanOrEqualTo(String value) {
            addCriterion("orresprice >=", value, "orresprice");
            return (Criteria) this;
        }

        public Criteria andOrrespriceLessThan(String value) {
            addCriterion("orresprice <", value, "orresprice");
            return (Criteria) this;
        }

        public Criteria andOrrespriceLessThanOrEqualTo(String value) {
            addCriterion("orresprice <=", value, "orresprice");
            return (Criteria) this;
        }

        public Criteria andOrrespriceLike(String value) {
            addCriterion("orresprice like", value, "orresprice");
            return (Criteria) this;
        }

        public Criteria andOrrespriceNotLike(String value) {
            addCriterion("orresprice not like", value, "orresprice");
            return (Criteria) this;
        }

        public Criteria andOrrespriceIn(List<String> values) {
            addCriterion("orresprice in", values, "orresprice");
            return (Criteria) this;
        }

        public Criteria andOrrespriceNotIn(List<String> values) {
            addCriterion("orresprice not in", values, "orresprice");
            return (Criteria) this;
        }

        public Criteria andOrrespriceBetween(String value1, String value2) {
            addCriterion("orresprice between", value1, value2, "orresprice");
            return (Criteria) this;
        }

        public Criteria andOrrespriceNotBetween(String value1, String value2) {
            addCriterion("orresprice not between", value1, value2, "orresprice");
            return (Criteria) this;
        }

        public Criteria andOrrremakeIsNull() {
            addCriterion("orrremake is null");
            return (Criteria) this;
        }

        public Criteria andOrrremakeIsNotNull() {
            addCriterion("orrremake is not null");
            return (Criteria) this;
        }

        public Criteria andOrrremakeEqualTo(String value) {
            addCriterion("orrremake =", value, "orrremake");
            return (Criteria) this;
        }

        public Criteria andOrrremakeNotEqualTo(String value) {
            addCriterion("orrremake <>", value, "orrremake");
            return (Criteria) this;
        }

        public Criteria andOrrremakeGreaterThan(String value) {
            addCriterion("orrremake >", value, "orrremake");
            return (Criteria) this;
        }

        public Criteria andOrrremakeGreaterThanOrEqualTo(String value) {
            addCriterion("orrremake >=", value, "orrremake");
            return (Criteria) this;
        }

        public Criteria andOrrremakeLessThan(String value) {
            addCriterion("orrremake <", value, "orrremake");
            return (Criteria) this;
        }

        public Criteria andOrrremakeLessThanOrEqualTo(String value) {
            addCriterion("orrremake <=", value, "orrremake");
            return (Criteria) this;
        }

        public Criteria andOrrremakeLike(String value) {
            addCriterion("orrremake like", value, "orrremake");
            return (Criteria) this;
        }

        public Criteria andOrrremakeNotLike(String value) {
            addCriterion("orrremake not like", value, "orrremake");
            return (Criteria) this;
        }

        public Criteria andOrrremakeIn(List<String> values) {
            addCriterion("orrremake in", values, "orrremake");
            return (Criteria) this;
        }

        public Criteria andOrrremakeNotIn(List<String> values) {
            addCriterion("orrremake not in", values, "orrremake");
            return (Criteria) this;
        }

        public Criteria andOrrremakeBetween(String value1, String value2) {
            addCriterion("orrremake between", value1, value2, "orrremake");
            return (Criteria) this;
        }

        public Criteria andOrrremakeNotBetween(String value1, String value2) {
            addCriterion("orrremake not between", value1, value2, "orrremake");
            return (Criteria) this;
        }

        public Criteria andOrrdescribeIsNull() {
            addCriterion("orrdescribe is null");
            return (Criteria) this;
        }

        public Criteria andOrrdescribeIsNotNull() {
            addCriterion("orrdescribe is not null");
            return (Criteria) this;
        }

        public Criteria andOrrdescribeEqualTo(String value) {
            addCriterion("orrdescribe =", value, "orrdescribe");
            return (Criteria) this;
        }

        public Criteria andOrrdescribeNotEqualTo(String value) {
            addCriterion("orrdescribe <>", value, "orrdescribe");
            return (Criteria) this;
        }

        public Criteria andOrrdescribeGreaterThan(String value) {
            addCriterion("orrdescribe >", value, "orrdescribe");
            return (Criteria) this;
        }

        public Criteria andOrrdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("orrdescribe >=", value, "orrdescribe");
            return (Criteria) this;
        }

        public Criteria andOrrdescribeLessThan(String value) {
            addCriterion("orrdescribe <", value, "orrdescribe");
            return (Criteria) this;
        }

        public Criteria andOrrdescribeLessThanOrEqualTo(String value) {
            addCriterion("orrdescribe <=", value, "orrdescribe");
            return (Criteria) this;
        }

        public Criteria andOrrdescribeLike(String value) {
            addCriterion("orrdescribe like", value, "orrdescribe");
            return (Criteria) this;
        }

        public Criteria andOrrdescribeNotLike(String value) {
            addCriterion("orrdescribe not like", value, "orrdescribe");
            return (Criteria) this;
        }

        public Criteria andOrrdescribeIn(List<String> values) {
            addCriterion("orrdescribe in", values, "orrdescribe");
            return (Criteria) this;
        }

        public Criteria andOrrdescribeNotIn(List<String> values) {
            addCriterion("orrdescribe not in", values, "orrdescribe");
            return (Criteria) this;
        }

        public Criteria andOrrdescribeBetween(String value1, String value2) {
            addCriterion("orrdescribe between", value1, value2, "orrdescribe");
            return (Criteria) this;
        }

        public Criteria andOrrdescribeNotBetween(String value1, String value2) {
            addCriterion("orrdescribe not between", value1, value2, "orrdescribe");
            return (Criteria) this;
        }

        public Criteria andOrrbillsIsNull() {
            addCriterion("orrbills is null");
            return (Criteria) this;
        }

        public Criteria andOrrbillsIsNotNull() {
            addCriterion("orrbills is not null");
            return (Criteria) this;
        }

        public Criteria andOrrbillsEqualTo(String value) {
            addCriterion("orrbills =", value, "orrbills");
            return (Criteria) this;
        }

        public Criteria andOrrbillsNotEqualTo(String value) {
            addCriterion("orrbills <>", value, "orrbills");
            return (Criteria) this;
        }

        public Criteria andOrrbillsGreaterThan(String value) {
            addCriterion("orrbills >", value, "orrbills");
            return (Criteria) this;
        }

        public Criteria andOrrbillsGreaterThanOrEqualTo(String value) {
            addCriterion("orrbills >=", value, "orrbills");
            return (Criteria) this;
        }

        public Criteria andOrrbillsLessThan(String value) {
            addCriterion("orrbills <", value, "orrbills");
            return (Criteria) this;
        }

        public Criteria andOrrbillsLessThanOrEqualTo(String value) {
            addCriterion("orrbills <=", value, "orrbills");
            return (Criteria) this;
        }

        public Criteria andOrrbillsLike(String value) {
            addCriterion("orrbills like", value, "orrbills");
            return (Criteria) this;
        }

        public Criteria andOrrbillsNotLike(String value) {
            addCriterion("orrbills not like", value, "orrbills");
            return (Criteria) this;
        }

        public Criteria andOrrbillsIn(List<String> values) {
            addCriterion("orrbills in", values, "orrbills");
            return (Criteria) this;
        }

        public Criteria andOrrbillsNotIn(List<String> values) {
            addCriterion("orrbills not in", values, "orrbills");
            return (Criteria) this;
        }

        public Criteria andOrrbillsBetween(String value1, String value2) {
            addCriterion("orrbills between", value1, value2, "orrbills");
            return (Criteria) this;
        }

        public Criteria andOrrbillsNotBetween(String value1, String value2) {
            addCriterion("orrbills not between", value1, value2, "orrbills");
            return (Criteria) this;
        }

        public Criteria andOrrztIsNull() {
            addCriterion("orrzt is null");
            return (Criteria) this;
        }

        public Criteria andOrrztIsNotNull() {
            addCriterion("orrzt is not null");
            return (Criteria) this;
        }

        public Criteria andOrrztEqualTo(String value) {
            addCriterion("orrzt =", value, "orrzt");
            return (Criteria) this;
        }

        public Criteria andOrrztNotEqualTo(String value) {
            addCriterion("orrzt <>", value, "orrzt");
            return (Criteria) this;
        }

        public Criteria andOrrztGreaterThan(String value) {
            addCriterion("orrzt >", value, "orrzt");
            return (Criteria) this;
        }

        public Criteria andOrrztGreaterThanOrEqualTo(String value) {
            addCriterion("orrzt >=", value, "orrzt");
            return (Criteria) this;
        }

        public Criteria andOrrztLessThan(String value) {
            addCriterion("orrzt <", value, "orrzt");
            return (Criteria) this;
        }

        public Criteria andOrrztLessThanOrEqualTo(String value) {
            addCriterion("orrzt <=", value, "orrzt");
            return (Criteria) this;
        }

        public Criteria andOrrztLike(String value) {
            addCriterion("orrzt like", value, "orrzt");
            return (Criteria) this;
        }

        public Criteria andOrrztNotLike(String value) {
            addCriterion("orrzt not like", value, "orrzt");
            return (Criteria) this;
        }

        public Criteria andOrrztIn(List<String> values) {
            addCriterion("orrzt in", values, "orrzt");
            return (Criteria) this;
        }

        public Criteria andOrrztNotIn(List<String> values) {
            addCriterion("orrzt not in", values, "orrzt");
            return (Criteria) this;
        }

        public Criteria andOrrztBetween(String value1, String value2) {
            addCriterion("orrzt between", value1, value2, "orrzt");
            return (Criteria) this;
        }

        public Criteria andOrrztNotBetween(String value1, String value2) {
            addCriterion("orrzt not between", value1, value2, "orrzt");
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