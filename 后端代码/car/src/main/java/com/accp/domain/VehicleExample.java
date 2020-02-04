package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class VehicleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VehicleExample() {
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

        public Criteria andVeeidIsNull() {
            addCriterion("veeid is null");
            return (Criteria) this;
        }

        public Criteria andVeeidIsNotNull() {
            addCriterion("veeid is not null");
            return (Criteria) this;
        }

        public Criteria andVeeidEqualTo(String value) {
            addCriterion("veeid =", value, "veeid");
            return (Criteria) this;
        }

        public Criteria andVeeidNotEqualTo(String value) {
            addCriterion("veeid <>", value, "veeid");
            return (Criteria) this;
        }

        public Criteria andVeeidGreaterThan(String value) {
            addCriterion("veeid >", value, "veeid");
            return (Criteria) this;
        }

        public Criteria andVeeidGreaterThanOrEqualTo(String value) {
            addCriterion("veeid >=", value, "veeid");
            return (Criteria) this;
        }

        public Criteria andVeeidLessThan(String value) {
            addCriterion("veeid <", value, "veeid");
            return (Criteria) this;
        }

        public Criteria andVeeidLessThanOrEqualTo(String value) {
            addCriterion("veeid <=", value, "veeid");
            return (Criteria) this;
        }

        public Criteria andVeeidLike(String value) {
            addCriterion("veeid like", value, "veeid");
            return (Criteria) this;
        }

        public Criteria andVeeidNotLike(String value) {
            addCriterion("veeid not like", value, "veeid");
            return (Criteria) this;
        }

        public Criteria andVeeidIn(List<String> values) {
            addCriterion("veeid in", values, "veeid");
            return (Criteria) this;
        }

        public Criteria andVeeidNotIn(List<String> values) {
            addCriterion("veeid not in", values, "veeid");
            return (Criteria) this;
        }

        public Criteria andVeeidBetween(String value1, String value2) {
            addCriterion("veeid between", value1, value2, "veeid");
            return (Criteria) this;
        }

        public Criteria andVeeidNotBetween(String value1, String value2) {
            addCriterion("veeid not between", value1, value2, "veeid");
            return (Criteria) this;
        }

        public Criteria andVeebrandIsNull() {
            addCriterion("veebrand is null");
            return (Criteria) this;
        }

        public Criteria andVeebrandIsNotNull() {
            addCriterion("veebrand is not null");
            return (Criteria) this;
        }

        public Criteria andVeebrandEqualTo(String value) {
            addCriterion("veebrand =", value, "veebrand");
            return (Criteria) this;
        }

        public Criteria andVeebrandNotEqualTo(String value) {
            addCriterion("veebrand <>", value, "veebrand");
            return (Criteria) this;
        }

        public Criteria andVeebrandGreaterThan(String value) {
            addCriterion("veebrand >", value, "veebrand");
            return (Criteria) this;
        }

        public Criteria andVeebrandGreaterThanOrEqualTo(String value) {
            addCriterion("veebrand >=", value, "veebrand");
            return (Criteria) this;
        }

        public Criteria andVeebrandLessThan(String value) {
            addCriterion("veebrand <", value, "veebrand");
            return (Criteria) this;
        }

        public Criteria andVeebrandLessThanOrEqualTo(String value) {
            addCriterion("veebrand <=", value, "veebrand");
            return (Criteria) this;
        }

        public Criteria andVeebrandLike(String value) {
            addCriterion("veebrand like", value, "veebrand");
            return (Criteria) this;
        }

        public Criteria andVeebrandNotLike(String value) {
            addCriterion("veebrand not like", value, "veebrand");
            return (Criteria) this;
        }

        public Criteria andVeebrandIn(List<String> values) {
            addCriterion("veebrand in", values, "veebrand");
            return (Criteria) this;
        }

        public Criteria andVeebrandNotIn(List<String> values) {
            addCriterion("veebrand not in", values, "veebrand");
            return (Criteria) this;
        }

        public Criteria andVeebrandBetween(String value1, String value2) {
            addCriterion("veebrand between", value1, value2, "veebrand");
            return (Criteria) this;
        }

        public Criteria andVeebrandNotBetween(String value1, String value2) {
            addCriterion("veebrand not between", value1, value2, "veebrand");
            return (Criteria) this;
        }

        public Criteria andVeetypeIsNull() {
            addCriterion("veetype is null");
            return (Criteria) this;
        }

        public Criteria andVeetypeIsNotNull() {
            addCriterion("veetype is not null");
            return (Criteria) this;
        }

        public Criteria andVeetypeEqualTo(String value) {
            addCriterion("veetype =", value, "veetype");
            return (Criteria) this;
        }

        public Criteria andVeetypeNotEqualTo(String value) {
            addCriterion("veetype <>", value, "veetype");
            return (Criteria) this;
        }

        public Criteria andVeetypeGreaterThan(String value) {
            addCriterion("veetype >", value, "veetype");
            return (Criteria) this;
        }

        public Criteria andVeetypeGreaterThanOrEqualTo(String value) {
            addCriterion("veetype >=", value, "veetype");
            return (Criteria) this;
        }

        public Criteria andVeetypeLessThan(String value) {
            addCriterion("veetype <", value, "veetype");
            return (Criteria) this;
        }

        public Criteria andVeetypeLessThanOrEqualTo(String value) {
            addCriterion("veetype <=", value, "veetype");
            return (Criteria) this;
        }

        public Criteria andVeetypeLike(String value) {
            addCriterion("veetype like", value, "veetype");
            return (Criteria) this;
        }

        public Criteria andVeetypeNotLike(String value) {
            addCriterion("veetype not like", value, "veetype");
            return (Criteria) this;
        }

        public Criteria andVeetypeIn(List<String> values) {
            addCriterion("veetype in", values, "veetype");
            return (Criteria) this;
        }

        public Criteria andVeetypeNotIn(List<String> values) {
            addCriterion("veetype not in", values, "veetype");
            return (Criteria) this;
        }

        public Criteria andVeetypeBetween(String value1, String value2) {
            addCriterion("veetype between", value1, value2, "veetype");
            return (Criteria) this;
        }

        public Criteria andVeetypeNotBetween(String value1, String value2) {
            addCriterion("veetype not between", value1, value2, "veetype");
            return (Criteria) this;
        }

        public Criteria andVeedriverIsNull() {
            addCriterion("veedriver is null");
            return (Criteria) this;
        }

        public Criteria andVeedriverIsNotNull() {
            addCriterion("veedriver is not null");
            return (Criteria) this;
        }

        public Criteria andVeedriverEqualTo(String value) {
            addCriterion("veedriver =", value, "veedriver");
            return (Criteria) this;
        }

        public Criteria andVeedriverNotEqualTo(String value) {
            addCriterion("veedriver <>", value, "veedriver");
            return (Criteria) this;
        }

        public Criteria andVeedriverGreaterThan(String value) {
            addCriterion("veedriver >", value, "veedriver");
            return (Criteria) this;
        }

        public Criteria andVeedriverGreaterThanOrEqualTo(String value) {
            addCriterion("veedriver >=", value, "veedriver");
            return (Criteria) this;
        }

        public Criteria andVeedriverLessThan(String value) {
            addCriterion("veedriver <", value, "veedriver");
            return (Criteria) this;
        }

        public Criteria andVeedriverLessThanOrEqualTo(String value) {
            addCriterion("veedriver <=", value, "veedriver");
            return (Criteria) this;
        }

        public Criteria andVeedriverLike(String value) {
            addCriterion("veedriver like", value, "veedriver");
            return (Criteria) this;
        }

        public Criteria andVeedriverNotLike(String value) {
            addCriterion("veedriver not like", value, "veedriver");
            return (Criteria) this;
        }

        public Criteria andVeedriverIn(List<String> values) {
            addCriterion("veedriver in", values, "veedriver");
            return (Criteria) this;
        }

        public Criteria andVeedriverNotIn(List<String> values) {
            addCriterion("veedriver not in", values, "veedriver");
            return (Criteria) this;
        }

        public Criteria andVeedriverBetween(String value1, String value2) {
            addCriterion("veedriver between", value1, value2, "veedriver");
            return (Criteria) this;
        }

        public Criteria andVeedriverNotBetween(String value1, String value2) {
            addCriterion("veedriver not between", value1, value2, "veedriver");
            return (Criteria) this;
        }

        public Criteria andVeedriverphoneIsNull() {
            addCriterion("veedriverphone is null");
            return (Criteria) this;
        }

        public Criteria andVeedriverphoneIsNotNull() {
            addCriterion("veedriverphone is not null");
            return (Criteria) this;
        }

        public Criteria andVeedriverphoneEqualTo(String value) {
            addCriterion("veedriverphone =", value, "veedriverphone");
            return (Criteria) this;
        }

        public Criteria andVeedriverphoneNotEqualTo(String value) {
            addCriterion("veedriverphone <>", value, "veedriverphone");
            return (Criteria) this;
        }

        public Criteria andVeedriverphoneGreaterThan(String value) {
            addCriterion("veedriverphone >", value, "veedriverphone");
            return (Criteria) this;
        }

        public Criteria andVeedriverphoneGreaterThanOrEqualTo(String value) {
            addCriterion("veedriverphone >=", value, "veedriverphone");
            return (Criteria) this;
        }

        public Criteria andVeedriverphoneLessThan(String value) {
            addCriterion("veedriverphone <", value, "veedriverphone");
            return (Criteria) this;
        }

        public Criteria andVeedriverphoneLessThanOrEqualTo(String value) {
            addCriterion("veedriverphone <=", value, "veedriverphone");
            return (Criteria) this;
        }

        public Criteria andVeedriverphoneLike(String value) {
            addCriterion("veedriverphone like", value, "veedriverphone");
            return (Criteria) this;
        }

        public Criteria andVeedriverphoneNotLike(String value) {
            addCriterion("veedriverphone not like", value, "veedriverphone");
            return (Criteria) this;
        }

        public Criteria andVeedriverphoneIn(List<String> values) {
            addCriterion("veedriverphone in", values, "veedriverphone");
            return (Criteria) this;
        }

        public Criteria andVeedriverphoneNotIn(List<String> values) {
            addCriterion("veedriverphone not in", values, "veedriverphone");
            return (Criteria) this;
        }

        public Criteria andVeedriverphoneBetween(String value1, String value2) {
            addCriterion("veedriverphone between", value1, value2, "veedriverphone");
            return (Criteria) this;
        }

        public Criteria andVeedriverphoneNotBetween(String value1, String value2) {
            addCriterion("veedriverphone not between", value1, value2, "veedriverphone");
            return (Criteria) this;
        }

        public Criteria andVeedateIsNull() {
            addCriterion("veedate is null");
            return (Criteria) this;
        }

        public Criteria andVeedateIsNotNull() {
            addCriterion("veedate is not null");
            return (Criteria) this;
        }

        public Criteria andVeedateEqualTo(String value) {
            addCriterion("veedate =", value, "veedate");
            return (Criteria) this;
        }

        public Criteria andVeedateNotEqualTo(String value) {
            addCriterion("veedate <>", value, "veedate");
            return (Criteria) this;
        }

        public Criteria andVeedateGreaterThan(String value) {
            addCriterion("veedate >", value, "veedate");
            return (Criteria) this;
        }

        public Criteria andVeedateGreaterThanOrEqualTo(String value) {
            addCriterion("veedate >=", value, "veedate");
            return (Criteria) this;
        }

        public Criteria andVeedateLessThan(String value) {
            addCriterion("veedate <", value, "veedate");
            return (Criteria) this;
        }

        public Criteria andVeedateLessThanOrEqualTo(String value) {
            addCriterion("veedate <=", value, "veedate");
            return (Criteria) this;
        }

        public Criteria andVeedateLike(String value) {
            addCriterion("veedate like", value, "veedate");
            return (Criteria) this;
        }

        public Criteria andVeedateNotLike(String value) {
            addCriterion("veedate not like", value, "veedate");
            return (Criteria) this;
        }

        public Criteria andVeedateIn(List<String> values) {
            addCriterion("veedate in", values, "veedate");
            return (Criteria) this;
        }

        public Criteria andVeedateNotIn(List<String> values) {
            addCriterion("veedate not in", values, "veedate");
            return (Criteria) this;
        }

        public Criteria andVeedateBetween(String value1, String value2) {
            addCriterion("veedate between", value1, value2, "veedate");
            return (Criteria) this;
        }

        public Criteria andVeedateNotBetween(String value1, String value2) {
            addCriterion("veedate not between", value1, value2, "veedate");
            return (Criteria) this;
        }

        public Criteria andVeeaffiliationIsNull() {
            addCriterion("veeaffiliation is null");
            return (Criteria) this;
        }

        public Criteria andVeeaffiliationIsNotNull() {
            addCriterion("veeaffiliation is not null");
            return (Criteria) this;
        }

        public Criteria andVeeaffiliationEqualTo(String value) {
            addCriterion("veeaffiliation =", value, "veeaffiliation");
            return (Criteria) this;
        }

        public Criteria andVeeaffiliationNotEqualTo(String value) {
            addCriterion("veeaffiliation <>", value, "veeaffiliation");
            return (Criteria) this;
        }

        public Criteria andVeeaffiliationGreaterThan(String value) {
            addCriterion("veeaffiliation >", value, "veeaffiliation");
            return (Criteria) this;
        }

        public Criteria andVeeaffiliationGreaterThanOrEqualTo(String value) {
            addCriterion("veeaffiliation >=", value, "veeaffiliation");
            return (Criteria) this;
        }

        public Criteria andVeeaffiliationLessThan(String value) {
            addCriterion("veeaffiliation <", value, "veeaffiliation");
            return (Criteria) this;
        }

        public Criteria andVeeaffiliationLessThanOrEqualTo(String value) {
            addCriterion("veeaffiliation <=", value, "veeaffiliation");
            return (Criteria) this;
        }

        public Criteria andVeeaffiliationLike(String value) {
            addCriterion("veeaffiliation like", value, "veeaffiliation");
            return (Criteria) this;
        }

        public Criteria andVeeaffiliationNotLike(String value) {
            addCriterion("veeaffiliation not like", value, "veeaffiliation");
            return (Criteria) this;
        }

        public Criteria andVeeaffiliationIn(List<String> values) {
            addCriterion("veeaffiliation in", values, "veeaffiliation");
            return (Criteria) this;
        }

        public Criteria andVeeaffiliationNotIn(List<String> values) {
            addCriterion("veeaffiliation not in", values, "veeaffiliation");
            return (Criteria) this;
        }

        public Criteria andVeeaffiliationBetween(String value1, String value2) {
            addCriterion("veeaffiliation between", value1, value2, "veeaffiliation");
            return (Criteria) this;
        }

        public Criteria andVeeaffiliationNotBetween(String value1, String value2) {
            addCriterion("veeaffiliation not between", value1, value2, "veeaffiliation");
            return (Criteria) this;
        }

        public Criteria andVeeexpiresIsNull() {
            addCriterion("veeexpires is null");
            return (Criteria) this;
        }

        public Criteria andVeeexpiresIsNotNull() {
            addCriterion("veeexpires is not null");
            return (Criteria) this;
        }

        public Criteria andVeeexpiresEqualTo(String value) {
            addCriterion("veeexpires =", value, "veeexpires");
            return (Criteria) this;
        }

        public Criteria andVeeexpiresNotEqualTo(String value) {
            addCriterion("veeexpires <>", value, "veeexpires");
            return (Criteria) this;
        }

        public Criteria andVeeexpiresGreaterThan(String value) {
            addCriterion("veeexpires >", value, "veeexpires");
            return (Criteria) this;
        }

        public Criteria andVeeexpiresGreaterThanOrEqualTo(String value) {
            addCriterion("veeexpires >=", value, "veeexpires");
            return (Criteria) this;
        }

        public Criteria andVeeexpiresLessThan(String value) {
            addCriterion("veeexpires <", value, "veeexpires");
            return (Criteria) this;
        }

        public Criteria andVeeexpiresLessThanOrEqualTo(String value) {
            addCriterion("veeexpires <=", value, "veeexpires");
            return (Criteria) this;
        }

        public Criteria andVeeexpiresLike(String value) {
            addCriterion("veeexpires like", value, "veeexpires");
            return (Criteria) this;
        }

        public Criteria andVeeexpiresNotLike(String value) {
            addCriterion("veeexpires not like", value, "veeexpires");
            return (Criteria) this;
        }

        public Criteria andVeeexpiresIn(List<String> values) {
            addCriterion("veeexpires in", values, "veeexpires");
            return (Criteria) this;
        }

        public Criteria andVeeexpiresNotIn(List<String> values) {
            addCriterion("veeexpires not in", values, "veeexpires");
            return (Criteria) this;
        }

        public Criteria andVeeexpiresBetween(String value1, String value2) {
            addCriterion("veeexpires between", value1, value2, "veeexpires");
            return (Criteria) this;
        }

        public Criteria andVeeexpiresNotBetween(String value1, String value2) {
            addCriterion("veeexpires not between", value1, value2, "veeexpires");
            return (Criteria) this;
        }

        public Criteria andVeeframeIsNull() {
            addCriterion("veeframe is null");
            return (Criteria) this;
        }

        public Criteria andVeeframeIsNotNull() {
            addCriterion("veeframe is not null");
            return (Criteria) this;
        }

        public Criteria andVeeframeEqualTo(String value) {
            addCriterion("veeframe =", value, "veeframe");
            return (Criteria) this;
        }

        public Criteria andVeeframeNotEqualTo(String value) {
            addCriterion("veeframe <>", value, "veeframe");
            return (Criteria) this;
        }

        public Criteria andVeeframeGreaterThan(String value) {
            addCriterion("veeframe >", value, "veeframe");
            return (Criteria) this;
        }

        public Criteria andVeeframeGreaterThanOrEqualTo(String value) {
            addCriterion("veeframe >=", value, "veeframe");
            return (Criteria) this;
        }

        public Criteria andVeeframeLessThan(String value) {
            addCriterion("veeframe <", value, "veeframe");
            return (Criteria) this;
        }

        public Criteria andVeeframeLessThanOrEqualTo(String value) {
            addCriterion("veeframe <=", value, "veeframe");
            return (Criteria) this;
        }

        public Criteria andVeeframeLike(String value) {
            addCriterion("veeframe like", value, "veeframe");
            return (Criteria) this;
        }

        public Criteria andVeeframeNotLike(String value) {
            addCriterion("veeframe not like", value, "veeframe");
            return (Criteria) this;
        }

        public Criteria andVeeframeIn(List<String> values) {
            addCriterion("veeframe in", values, "veeframe");
            return (Criteria) this;
        }

        public Criteria andVeeframeNotIn(List<String> values) {
            addCriterion("veeframe not in", values, "veeframe");
            return (Criteria) this;
        }

        public Criteria andVeeframeBetween(String value1, String value2) {
            addCriterion("veeframe between", value1, value2, "veeframe");
            return (Criteria) this;
        }

        public Criteria andVeeframeNotBetween(String value1, String value2) {
            addCriterion("veeframe not between", value1, value2, "veeframe");
            return (Criteria) this;
        }

        public Criteria andVeeengineIsNull() {
            addCriterion("veeengine is null");
            return (Criteria) this;
        }

        public Criteria andVeeengineIsNotNull() {
            addCriterion("veeengine is not null");
            return (Criteria) this;
        }

        public Criteria andVeeengineEqualTo(String value) {
            addCriterion("veeengine =", value, "veeengine");
            return (Criteria) this;
        }

        public Criteria andVeeengineNotEqualTo(String value) {
            addCriterion("veeengine <>", value, "veeengine");
            return (Criteria) this;
        }

        public Criteria andVeeengineGreaterThan(String value) {
            addCriterion("veeengine >", value, "veeengine");
            return (Criteria) this;
        }

        public Criteria andVeeengineGreaterThanOrEqualTo(String value) {
            addCriterion("veeengine >=", value, "veeengine");
            return (Criteria) this;
        }

        public Criteria andVeeengineLessThan(String value) {
            addCriterion("veeengine <", value, "veeengine");
            return (Criteria) this;
        }

        public Criteria andVeeengineLessThanOrEqualTo(String value) {
            addCriterion("veeengine <=", value, "veeengine");
            return (Criteria) this;
        }

        public Criteria andVeeengineLike(String value) {
            addCriterion("veeengine like", value, "veeengine");
            return (Criteria) this;
        }

        public Criteria andVeeengineNotLike(String value) {
            addCriterion("veeengine not like", value, "veeengine");
            return (Criteria) this;
        }

        public Criteria andVeeengineIn(List<String> values) {
            addCriterion("veeengine in", values, "veeengine");
            return (Criteria) this;
        }

        public Criteria andVeeengineNotIn(List<String> values) {
            addCriterion("veeengine not in", values, "veeengine");
            return (Criteria) this;
        }

        public Criteria andVeeengineBetween(String value1, String value2) {
            addCriterion("veeengine between", value1, value2, "veeengine");
            return (Criteria) this;
        }

        public Criteria andVeeengineNotBetween(String value1, String value2) {
            addCriterion("veeengine not between", value1, value2, "veeengine");
            return (Criteria) this;
        }

        public Criteria andVeeyearIsNull() {
            addCriterion("veeyear is null");
            return (Criteria) this;
        }

        public Criteria andVeeyearIsNotNull() {
            addCriterion("veeyear is not null");
            return (Criteria) this;
        }

        public Criteria andVeeyearEqualTo(String value) {
            addCriterion("veeyear =", value, "veeyear");
            return (Criteria) this;
        }

        public Criteria andVeeyearNotEqualTo(String value) {
            addCriterion("veeyear <>", value, "veeyear");
            return (Criteria) this;
        }

        public Criteria andVeeyearGreaterThan(String value) {
            addCriterion("veeyear >", value, "veeyear");
            return (Criteria) this;
        }

        public Criteria andVeeyearGreaterThanOrEqualTo(String value) {
            addCriterion("veeyear >=", value, "veeyear");
            return (Criteria) this;
        }

        public Criteria andVeeyearLessThan(String value) {
            addCriterion("veeyear <", value, "veeyear");
            return (Criteria) this;
        }

        public Criteria andVeeyearLessThanOrEqualTo(String value) {
            addCriterion("veeyear <=", value, "veeyear");
            return (Criteria) this;
        }

        public Criteria andVeeyearLike(String value) {
            addCriterion("veeyear like", value, "veeyear");
            return (Criteria) this;
        }

        public Criteria andVeeyearNotLike(String value) {
            addCriterion("veeyear not like", value, "veeyear");
            return (Criteria) this;
        }

        public Criteria andVeeyearIn(List<String> values) {
            addCriterion("veeyear in", values, "veeyear");
            return (Criteria) this;
        }

        public Criteria andVeeyearNotIn(List<String> values) {
            addCriterion("veeyear not in", values, "veeyear");
            return (Criteria) this;
        }

        public Criteria andVeeyearBetween(String value1, String value2) {
            addCriterion("veeyear between", value1, value2, "veeyear");
            return (Criteria) this;
        }

        public Criteria andVeeyearNotBetween(String value1, String value2) {
            addCriterion("veeyear not between", value1, value2, "veeyear");
            return (Criteria) this;
        }

        public Criteria andVeemileageIsNull() {
            addCriterion("veemileage is null");
            return (Criteria) this;
        }

        public Criteria andVeemileageIsNotNull() {
            addCriterion("veemileage is not null");
            return (Criteria) this;
        }

        public Criteria andVeemileageEqualTo(String value) {
            addCriterion("veemileage =", value, "veemileage");
            return (Criteria) this;
        }

        public Criteria andVeemileageNotEqualTo(String value) {
            addCriterion("veemileage <>", value, "veemileage");
            return (Criteria) this;
        }

        public Criteria andVeemileageGreaterThan(String value) {
            addCriterion("veemileage >", value, "veemileage");
            return (Criteria) this;
        }

        public Criteria andVeemileageGreaterThanOrEqualTo(String value) {
            addCriterion("veemileage >=", value, "veemileage");
            return (Criteria) this;
        }

        public Criteria andVeemileageLessThan(String value) {
            addCriterion("veemileage <", value, "veemileage");
            return (Criteria) this;
        }

        public Criteria andVeemileageLessThanOrEqualTo(String value) {
            addCriterion("veemileage <=", value, "veemileage");
            return (Criteria) this;
        }

        public Criteria andVeemileageLike(String value) {
            addCriterion("veemileage like", value, "veemileage");
            return (Criteria) this;
        }

        public Criteria andVeemileageNotLike(String value) {
            addCriterion("veemileage not like", value, "veemileage");
            return (Criteria) this;
        }

        public Criteria andVeemileageIn(List<String> values) {
            addCriterion("veemileage in", values, "veemileage");
            return (Criteria) this;
        }

        public Criteria andVeemileageNotIn(List<String> values) {
            addCriterion("veemileage not in", values, "veemileage");
            return (Criteria) this;
        }

        public Criteria andVeemileageBetween(String value1, String value2) {
            addCriterion("veemileage between", value1, value2, "veemileage");
            return (Criteria) this;
        }

        public Criteria andVeemileageNotBetween(String value1, String value2) {
            addCriterion("veemileage not between", value1, value2, "veemileage");
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

        public Criteria andVeeloadIsNull() {
            addCriterion("veeload is null");
            return (Criteria) this;
        }

        public Criteria andVeeloadIsNotNull() {
            addCriterion("veeload is not null");
            return (Criteria) this;
        }

        public Criteria andVeeloadEqualTo(Integer value) {
            addCriterion("veeload =", value, "veeload");
            return (Criteria) this;
        }

        public Criteria andVeeloadNotEqualTo(Integer value) {
            addCriterion("veeload <>", value, "veeload");
            return (Criteria) this;
        }

        public Criteria andVeeloadGreaterThan(Integer value) {
            addCriterion("veeload >", value, "veeload");
            return (Criteria) this;
        }

        public Criteria andVeeloadGreaterThanOrEqualTo(Integer value) {
            addCriterion("veeload >=", value, "veeload");
            return (Criteria) this;
        }

        public Criteria andVeeloadLessThan(Integer value) {
            addCriterion("veeload <", value, "veeload");
            return (Criteria) this;
        }

        public Criteria andVeeloadLessThanOrEqualTo(Integer value) {
            addCriterion("veeload <=", value, "veeload");
            return (Criteria) this;
        }

        public Criteria andVeeloadIn(List<Integer> values) {
            addCriterion("veeload in", values, "veeload");
            return (Criteria) this;
        }

        public Criteria andVeeloadNotIn(List<Integer> values) {
            addCriterion("veeload not in", values, "veeload");
            return (Criteria) this;
        }

        public Criteria andVeeloadBetween(Integer value1, Integer value2) {
            addCriterion("veeload between", value1, value2, "veeload");
            return (Criteria) this;
        }

        public Criteria andVeeloadNotBetween(Integer value1, Integer value2) {
            addCriterion("veeload not between", value1, value2, "veeload");
            return (Criteria) this;
        }

        public Criteria andVeepurchaseIsNull() {
            addCriterion("veepurchase is null");
            return (Criteria) this;
        }

        public Criteria andVeepurchaseIsNotNull() {
            addCriterion("veepurchase is not null");
            return (Criteria) this;
        }

        public Criteria andVeepurchaseEqualTo(String value) {
            addCriterion("veepurchase =", value, "veepurchase");
            return (Criteria) this;
        }

        public Criteria andVeepurchaseNotEqualTo(String value) {
            addCriterion("veepurchase <>", value, "veepurchase");
            return (Criteria) this;
        }

        public Criteria andVeepurchaseGreaterThan(String value) {
            addCriterion("veepurchase >", value, "veepurchase");
            return (Criteria) this;
        }

        public Criteria andVeepurchaseGreaterThanOrEqualTo(String value) {
            addCriterion("veepurchase >=", value, "veepurchase");
            return (Criteria) this;
        }

        public Criteria andVeepurchaseLessThan(String value) {
            addCriterion("veepurchase <", value, "veepurchase");
            return (Criteria) this;
        }

        public Criteria andVeepurchaseLessThanOrEqualTo(String value) {
            addCriterion("veepurchase <=", value, "veepurchase");
            return (Criteria) this;
        }

        public Criteria andVeepurchaseLike(String value) {
            addCriterion("veepurchase like", value, "veepurchase");
            return (Criteria) this;
        }

        public Criteria andVeepurchaseNotLike(String value) {
            addCriterion("veepurchase not like", value, "veepurchase");
            return (Criteria) this;
        }

        public Criteria andVeepurchaseIn(List<String> values) {
            addCriterion("veepurchase in", values, "veepurchase");
            return (Criteria) this;
        }

        public Criteria andVeepurchaseNotIn(List<String> values) {
            addCriterion("veepurchase not in", values, "veepurchase");
            return (Criteria) this;
        }

        public Criteria andVeepurchaseBetween(String value1, String value2) {
            addCriterion("veepurchase between", value1, value2, "veepurchase");
            return (Criteria) this;
        }

        public Criteria andVeepurchaseNotBetween(String value1, String value2) {
            addCriterion("veepurchase not between", value1, value2, "veepurchase");
            return (Criteria) this;
        }

        public Criteria andVeeregisteredIsNull() {
            addCriterion("veeregistered is null");
            return (Criteria) this;
        }

        public Criteria andVeeregisteredIsNotNull() {
            addCriterion("veeregistered is not null");
            return (Criteria) this;
        }

        public Criteria andVeeregisteredEqualTo(String value) {
            addCriterion("veeregistered =", value, "veeregistered");
            return (Criteria) this;
        }

        public Criteria andVeeregisteredNotEqualTo(String value) {
            addCriterion("veeregistered <>", value, "veeregistered");
            return (Criteria) this;
        }

        public Criteria andVeeregisteredGreaterThan(String value) {
            addCriterion("veeregistered >", value, "veeregistered");
            return (Criteria) this;
        }

        public Criteria andVeeregisteredGreaterThanOrEqualTo(String value) {
            addCriterion("veeregistered >=", value, "veeregistered");
            return (Criteria) this;
        }

        public Criteria andVeeregisteredLessThan(String value) {
            addCriterion("veeregistered <", value, "veeregistered");
            return (Criteria) this;
        }

        public Criteria andVeeregisteredLessThanOrEqualTo(String value) {
            addCriterion("veeregistered <=", value, "veeregistered");
            return (Criteria) this;
        }

        public Criteria andVeeregisteredLike(String value) {
            addCriterion("veeregistered like", value, "veeregistered");
            return (Criteria) this;
        }

        public Criteria andVeeregisteredNotLike(String value) {
            addCriterion("veeregistered not like", value, "veeregistered");
            return (Criteria) this;
        }

        public Criteria andVeeregisteredIn(List<String> values) {
            addCriterion("veeregistered in", values, "veeregistered");
            return (Criteria) this;
        }

        public Criteria andVeeregisteredNotIn(List<String> values) {
            addCriterion("veeregistered not in", values, "veeregistered");
            return (Criteria) this;
        }

        public Criteria andVeeregisteredBetween(String value1, String value2) {
            addCriterion("veeregistered between", value1, value2, "veeregistered");
            return (Criteria) this;
        }

        public Criteria andVeeregisteredNotBetween(String value1, String value2) {
            addCriterion("veeregistered not between", value1, value2, "veeregistered");
            return (Criteria) this;
        }

        public Criteria andVeevehicleIsNull() {
            addCriterion("veevehicle is null");
            return (Criteria) this;
        }

        public Criteria andVeevehicleIsNotNull() {
            addCriterion("veevehicle is not null");
            return (Criteria) this;
        }

        public Criteria andVeevehicleEqualTo(String value) {
            addCriterion("veevehicle =", value, "veevehicle");
            return (Criteria) this;
        }

        public Criteria andVeevehicleNotEqualTo(String value) {
            addCriterion("veevehicle <>", value, "veevehicle");
            return (Criteria) this;
        }

        public Criteria andVeevehicleGreaterThan(String value) {
            addCriterion("veevehicle >", value, "veevehicle");
            return (Criteria) this;
        }

        public Criteria andVeevehicleGreaterThanOrEqualTo(String value) {
            addCriterion("veevehicle >=", value, "veevehicle");
            return (Criteria) this;
        }

        public Criteria andVeevehicleLessThan(String value) {
            addCriterion("veevehicle <", value, "veevehicle");
            return (Criteria) this;
        }

        public Criteria andVeevehicleLessThanOrEqualTo(String value) {
            addCriterion("veevehicle <=", value, "veevehicle");
            return (Criteria) this;
        }

        public Criteria andVeevehicleLike(String value) {
            addCriterion("veevehicle like", value, "veevehicle");
            return (Criteria) this;
        }

        public Criteria andVeevehicleNotLike(String value) {
            addCriterion("veevehicle not like", value, "veevehicle");
            return (Criteria) this;
        }

        public Criteria andVeevehicleIn(List<String> values) {
            addCriterion("veevehicle in", values, "veevehicle");
            return (Criteria) this;
        }

        public Criteria andVeevehicleNotIn(List<String> values) {
            addCriterion("veevehicle not in", values, "veevehicle");
            return (Criteria) this;
        }

        public Criteria andVeevehicleBetween(String value1, String value2) {
            addCriterion("veevehicle between", value1, value2, "veevehicle");
            return (Criteria) this;
        }

        public Criteria andVeevehicleNotBetween(String value1, String value2) {
            addCriterion("veevehicle not between", value1, value2, "veevehicle");
            return (Criteria) this;
        }

        public Criteria andVeecategoryIsNull() {
            addCriterion("veecategory is null");
            return (Criteria) this;
        }

        public Criteria andVeecategoryIsNotNull() {
            addCriterion("veecategory is not null");
            return (Criteria) this;
        }

        public Criteria andVeecategoryEqualTo(String value) {
            addCriterion("veecategory =", value, "veecategory");
            return (Criteria) this;
        }

        public Criteria andVeecategoryNotEqualTo(String value) {
            addCriterion("veecategory <>", value, "veecategory");
            return (Criteria) this;
        }

        public Criteria andVeecategoryGreaterThan(String value) {
            addCriterion("veecategory >", value, "veecategory");
            return (Criteria) this;
        }

        public Criteria andVeecategoryGreaterThanOrEqualTo(String value) {
            addCriterion("veecategory >=", value, "veecategory");
            return (Criteria) this;
        }

        public Criteria andVeecategoryLessThan(String value) {
            addCriterion("veecategory <", value, "veecategory");
            return (Criteria) this;
        }

        public Criteria andVeecategoryLessThanOrEqualTo(String value) {
            addCriterion("veecategory <=", value, "veecategory");
            return (Criteria) this;
        }

        public Criteria andVeecategoryLike(String value) {
            addCriterion("veecategory like", value, "veecategory");
            return (Criteria) this;
        }

        public Criteria andVeecategoryNotLike(String value) {
            addCriterion("veecategory not like", value, "veecategory");
            return (Criteria) this;
        }

        public Criteria andVeecategoryIn(List<String> values) {
            addCriterion("veecategory in", values, "veecategory");
            return (Criteria) this;
        }

        public Criteria andVeecategoryNotIn(List<String> values) {
            addCriterion("veecategory not in", values, "veecategory");
            return (Criteria) this;
        }

        public Criteria andVeecategoryBetween(String value1, String value2) {
            addCriterion("veecategory between", value1, value2, "veecategory");
            return (Criteria) this;
        }

        public Criteria andVeecategoryNotBetween(String value1, String value2) {
            addCriterion("veecategory not between", value1, value2, "veecategory");
            return (Criteria) this;
        }

        public Criteria andVeeseriesIsNull() {
            addCriterion("veeseries is null");
            return (Criteria) this;
        }

        public Criteria andVeeseriesIsNotNull() {
            addCriterion("veeseries is not null");
            return (Criteria) this;
        }

        public Criteria andVeeseriesEqualTo(String value) {
            addCriterion("veeseries =", value, "veeseries");
            return (Criteria) this;
        }

        public Criteria andVeeseriesNotEqualTo(String value) {
            addCriterion("veeseries <>", value, "veeseries");
            return (Criteria) this;
        }

        public Criteria andVeeseriesGreaterThan(String value) {
            addCriterion("veeseries >", value, "veeseries");
            return (Criteria) this;
        }

        public Criteria andVeeseriesGreaterThanOrEqualTo(String value) {
            addCriterion("veeseries >=", value, "veeseries");
            return (Criteria) this;
        }

        public Criteria andVeeseriesLessThan(String value) {
            addCriterion("veeseries <", value, "veeseries");
            return (Criteria) this;
        }

        public Criteria andVeeseriesLessThanOrEqualTo(String value) {
            addCriterion("veeseries <=", value, "veeseries");
            return (Criteria) this;
        }

        public Criteria andVeeseriesLike(String value) {
            addCriterion("veeseries like", value, "veeseries");
            return (Criteria) this;
        }

        public Criteria andVeeseriesNotLike(String value) {
            addCriterion("veeseries not like", value, "veeseries");
            return (Criteria) this;
        }

        public Criteria andVeeseriesIn(List<String> values) {
            addCriterion("veeseries in", values, "veeseries");
            return (Criteria) this;
        }

        public Criteria andVeeseriesNotIn(List<String> values) {
            addCriterion("veeseries not in", values, "veeseries");
            return (Criteria) this;
        }

        public Criteria andVeeseriesBetween(String value1, String value2) {
            addCriterion("veeseries between", value1, value2, "veeseries");
            return (Criteria) this;
        }

        public Criteria andVeeseriesNotBetween(String value1, String value2) {
            addCriterion("veeseries not between", value1, value2, "veeseries");
            return (Criteria) this;
        }

        public Criteria andVeeinsuranceIsNull() {
            addCriterion("veeinsurance is null");
            return (Criteria) this;
        }

        public Criteria andVeeinsuranceIsNotNull() {
            addCriterion("veeinsurance is not null");
            return (Criteria) this;
        }

        public Criteria andVeeinsuranceEqualTo(String value) {
            addCriterion("veeinsurance =", value, "veeinsurance");
            return (Criteria) this;
        }

        public Criteria andVeeinsuranceNotEqualTo(String value) {
            addCriterion("veeinsurance <>", value, "veeinsurance");
            return (Criteria) this;
        }

        public Criteria andVeeinsuranceGreaterThan(String value) {
            addCriterion("veeinsurance >", value, "veeinsurance");
            return (Criteria) this;
        }

        public Criteria andVeeinsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("veeinsurance >=", value, "veeinsurance");
            return (Criteria) this;
        }

        public Criteria andVeeinsuranceLessThan(String value) {
            addCriterion("veeinsurance <", value, "veeinsurance");
            return (Criteria) this;
        }

        public Criteria andVeeinsuranceLessThanOrEqualTo(String value) {
            addCriterion("veeinsurance <=", value, "veeinsurance");
            return (Criteria) this;
        }

        public Criteria andVeeinsuranceLike(String value) {
            addCriterion("veeinsurance like", value, "veeinsurance");
            return (Criteria) this;
        }

        public Criteria andVeeinsuranceNotLike(String value) {
            addCriterion("veeinsurance not like", value, "veeinsurance");
            return (Criteria) this;
        }

        public Criteria andVeeinsuranceIn(List<String> values) {
            addCriterion("veeinsurance in", values, "veeinsurance");
            return (Criteria) this;
        }

        public Criteria andVeeinsuranceNotIn(List<String> values) {
            addCriterion("veeinsurance not in", values, "veeinsurance");
            return (Criteria) this;
        }

        public Criteria andVeeinsuranceBetween(String value1, String value2) {
            addCriterion("veeinsurance between", value1, value2, "veeinsurance");
            return (Criteria) this;
        }

        public Criteria andVeeinsuranceNotBetween(String value1, String value2) {
            addCriterion("veeinsurance not between", value1, value2, "veeinsurance");
            return (Criteria) this;
        }

        public Criteria andVeeexpireIsNull() {
            addCriterion("veeexpire is null");
            return (Criteria) this;
        }

        public Criteria andVeeexpireIsNotNull() {
            addCriterion("veeexpire is not null");
            return (Criteria) this;
        }

        public Criteria andVeeexpireEqualTo(String value) {
            addCriterion("veeexpire =", value, "veeexpire");
            return (Criteria) this;
        }

        public Criteria andVeeexpireNotEqualTo(String value) {
            addCriterion("veeexpire <>", value, "veeexpire");
            return (Criteria) this;
        }

        public Criteria andVeeexpireGreaterThan(String value) {
            addCriterion("veeexpire >", value, "veeexpire");
            return (Criteria) this;
        }

        public Criteria andVeeexpireGreaterThanOrEqualTo(String value) {
            addCriterion("veeexpire >=", value, "veeexpire");
            return (Criteria) this;
        }

        public Criteria andVeeexpireLessThan(String value) {
            addCriterion("veeexpire <", value, "veeexpire");
            return (Criteria) this;
        }

        public Criteria andVeeexpireLessThanOrEqualTo(String value) {
            addCriterion("veeexpire <=", value, "veeexpire");
            return (Criteria) this;
        }

        public Criteria andVeeexpireLike(String value) {
            addCriterion("veeexpire like", value, "veeexpire");
            return (Criteria) this;
        }

        public Criteria andVeeexpireNotLike(String value) {
            addCriterion("veeexpire not like", value, "veeexpire");
            return (Criteria) this;
        }

        public Criteria andVeeexpireIn(List<String> values) {
            addCriterion("veeexpire in", values, "veeexpire");
            return (Criteria) this;
        }

        public Criteria andVeeexpireNotIn(List<String> values) {
            addCriterion("veeexpire not in", values, "veeexpire");
            return (Criteria) this;
        }

        public Criteria andVeeexpireBetween(String value1, String value2) {
            addCriterion("veeexpire between", value1, value2, "veeexpire");
            return (Criteria) this;
        }

        public Criteria andVeeexpireNotBetween(String value1, String value2) {
            addCriterion("veeexpire not between", value1, value2, "veeexpire");
            return (Criteria) this;
        }

        public Criteria andVeeflagIsNull() {
            addCriterion("veeflag is null");
            return (Criteria) this;
        }

        public Criteria andVeeflagIsNotNull() {
            addCriterion("veeflag is not null");
            return (Criteria) this;
        }

        public Criteria andVeeflagEqualTo(String value) {
            addCriterion("veeflag =", value, "veeflag");
            return (Criteria) this;
        }

        public Criteria andVeeflagNotEqualTo(String value) {
            addCriterion("veeflag <>", value, "veeflag");
            return (Criteria) this;
        }

        public Criteria andVeeflagGreaterThan(String value) {
            addCriterion("veeflag >", value, "veeflag");
            return (Criteria) this;
        }

        public Criteria andVeeflagGreaterThanOrEqualTo(String value) {
            addCriterion("veeflag >=", value, "veeflag");
            return (Criteria) this;
        }

        public Criteria andVeeflagLessThan(String value) {
            addCriterion("veeflag <", value, "veeflag");
            return (Criteria) this;
        }

        public Criteria andVeeflagLessThanOrEqualTo(String value) {
            addCriterion("veeflag <=", value, "veeflag");
            return (Criteria) this;
        }

        public Criteria andVeeflagLike(String value) {
            addCriterion("veeflag like", value, "veeflag");
            return (Criteria) this;
        }

        public Criteria andVeeflagNotLike(String value) {
            addCriterion("veeflag not like", value, "veeflag");
            return (Criteria) this;
        }

        public Criteria andVeeflagIn(List<String> values) {
            addCriterion("veeflag in", values, "veeflag");
            return (Criteria) this;
        }

        public Criteria andVeeflagNotIn(List<String> values) {
            addCriterion("veeflag not in", values, "veeflag");
            return (Criteria) this;
        }

        public Criteria andVeeflagBetween(String value1, String value2) {
            addCriterion("veeflag between", value1, value2, "veeflag");
            return (Criteria) this;
        }

        public Criteria andVeeflagNotBetween(String value1, String value2) {
            addCriterion("veeflag not between", value1, value2, "veeflag");
            return (Criteria) this;
        }

        public Criteria andVeebusinessIsNull() {
            addCriterion("veebusiness is null");
            return (Criteria) this;
        }

        public Criteria andVeebusinessIsNotNull() {
            addCriterion("veebusiness is not null");
            return (Criteria) this;
        }

        public Criteria andVeebusinessEqualTo(String value) {
            addCriterion("veebusiness =", value, "veebusiness");
            return (Criteria) this;
        }

        public Criteria andVeebusinessNotEqualTo(String value) {
            addCriterion("veebusiness <>", value, "veebusiness");
            return (Criteria) this;
        }

        public Criteria andVeebusinessGreaterThan(String value) {
            addCriterion("veebusiness >", value, "veebusiness");
            return (Criteria) this;
        }

        public Criteria andVeebusinessGreaterThanOrEqualTo(String value) {
            addCriterion("veebusiness >=", value, "veebusiness");
            return (Criteria) this;
        }

        public Criteria andVeebusinessLessThan(String value) {
            addCriterion("veebusiness <", value, "veebusiness");
            return (Criteria) this;
        }

        public Criteria andVeebusinessLessThanOrEqualTo(String value) {
            addCriterion("veebusiness <=", value, "veebusiness");
            return (Criteria) this;
        }

        public Criteria andVeebusinessLike(String value) {
            addCriterion("veebusiness like", value, "veebusiness");
            return (Criteria) this;
        }

        public Criteria andVeebusinessNotLike(String value) {
            addCriterion("veebusiness not like", value, "veebusiness");
            return (Criteria) this;
        }

        public Criteria andVeebusinessIn(List<String> values) {
            addCriterion("veebusiness in", values, "veebusiness");
            return (Criteria) this;
        }

        public Criteria andVeebusinessNotIn(List<String> values) {
            addCriterion("veebusiness not in", values, "veebusiness");
            return (Criteria) this;
        }

        public Criteria andVeebusinessBetween(String value1, String value2) {
            addCriterion("veebusiness between", value1, value2, "veebusiness");
            return (Criteria) this;
        }

        public Criteria andVeebusinessNotBetween(String value1, String value2) {
            addCriterion("veebusiness not between", value1, value2, "veebusiness");
            return (Criteria) this;
        }

        public Criteria andVeebusexpIsNull() {
            addCriterion("veebusexp is null");
            return (Criteria) this;
        }

        public Criteria andVeebusexpIsNotNull() {
            addCriterion("veebusexp is not null");
            return (Criteria) this;
        }

        public Criteria andVeebusexpEqualTo(String value) {
            addCriterion("veebusexp =", value, "veebusexp");
            return (Criteria) this;
        }

        public Criteria andVeebusexpNotEqualTo(String value) {
            addCriterion("veebusexp <>", value, "veebusexp");
            return (Criteria) this;
        }

        public Criteria andVeebusexpGreaterThan(String value) {
            addCriterion("veebusexp >", value, "veebusexp");
            return (Criteria) this;
        }

        public Criteria andVeebusexpGreaterThanOrEqualTo(String value) {
            addCriterion("veebusexp >=", value, "veebusexp");
            return (Criteria) this;
        }

        public Criteria andVeebusexpLessThan(String value) {
            addCriterion("veebusexp <", value, "veebusexp");
            return (Criteria) this;
        }

        public Criteria andVeebusexpLessThanOrEqualTo(String value) {
            addCriterion("veebusexp <=", value, "veebusexp");
            return (Criteria) this;
        }

        public Criteria andVeebusexpLike(String value) {
            addCriterion("veebusexp like", value, "veebusexp");
            return (Criteria) this;
        }

        public Criteria andVeebusexpNotLike(String value) {
            addCriterion("veebusexp not like", value, "veebusexp");
            return (Criteria) this;
        }

        public Criteria andVeebusexpIn(List<String> values) {
            addCriterion("veebusexp in", values, "veebusexp");
            return (Criteria) this;
        }

        public Criteria andVeebusexpNotIn(List<String> values) {
            addCriterion("veebusexp not in", values, "veebusexp");
            return (Criteria) this;
        }

        public Criteria andVeebusexpBetween(String value1, String value2) {
            addCriterion("veebusexp between", value1, value2, "veebusexp");
            return (Criteria) this;
        }

        public Criteria andVeebusexpNotBetween(String value1, String value2) {
            addCriterion("veebusexp not between", value1, value2, "veebusexp");
            return (Criteria) this;
        }

        public Criteria andVeeupkeepIsNull() {
            addCriterion("veeupkeep is null");
            return (Criteria) this;
        }

        public Criteria andVeeupkeepIsNotNull() {
            addCriterion("veeupkeep is not null");
            return (Criteria) this;
        }

        public Criteria andVeeupkeepEqualTo(String value) {
            addCriterion("veeupkeep =", value, "veeupkeep");
            return (Criteria) this;
        }

        public Criteria andVeeupkeepNotEqualTo(String value) {
            addCriterion("veeupkeep <>", value, "veeupkeep");
            return (Criteria) this;
        }

        public Criteria andVeeupkeepGreaterThan(String value) {
            addCriterion("veeupkeep >", value, "veeupkeep");
            return (Criteria) this;
        }

        public Criteria andVeeupkeepGreaterThanOrEqualTo(String value) {
            addCriterion("veeupkeep >=", value, "veeupkeep");
            return (Criteria) this;
        }

        public Criteria andVeeupkeepLessThan(String value) {
            addCriterion("veeupkeep <", value, "veeupkeep");
            return (Criteria) this;
        }

        public Criteria andVeeupkeepLessThanOrEqualTo(String value) {
            addCriterion("veeupkeep <=", value, "veeupkeep");
            return (Criteria) this;
        }

        public Criteria andVeeupkeepLike(String value) {
            addCriterion("veeupkeep like", value, "veeupkeep");
            return (Criteria) this;
        }

        public Criteria andVeeupkeepNotLike(String value) {
            addCriterion("veeupkeep not like", value, "veeupkeep");
            return (Criteria) this;
        }

        public Criteria andVeeupkeepIn(List<String> values) {
            addCriterion("veeupkeep in", values, "veeupkeep");
            return (Criteria) this;
        }

        public Criteria andVeeupkeepNotIn(List<String> values) {
            addCriterion("veeupkeep not in", values, "veeupkeep");
            return (Criteria) this;
        }

        public Criteria andVeeupkeepBetween(String value1, String value2) {
            addCriterion("veeupkeep between", value1, value2, "veeupkeep");
            return (Criteria) this;
        }

        public Criteria andVeeupkeepNotBetween(String value1, String value2) {
            addCriterion("veeupkeep not between", value1, value2, "veeupkeep");
            return (Criteria) this;
        }

        public Criteria andVeeupdateIsNull() {
            addCriterion("veeupdate is null");
            return (Criteria) this;
        }

        public Criteria andVeeupdateIsNotNull() {
            addCriterion("veeupdate is not null");
            return (Criteria) this;
        }

        public Criteria andVeeupdateEqualTo(String value) {
            addCriterion("veeupdate =", value, "veeupdate");
            return (Criteria) this;
        }

        public Criteria andVeeupdateNotEqualTo(String value) {
            addCriterion("veeupdate <>", value, "veeupdate");
            return (Criteria) this;
        }

        public Criteria andVeeupdateGreaterThan(String value) {
            addCriterion("veeupdate >", value, "veeupdate");
            return (Criteria) this;
        }

        public Criteria andVeeupdateGreaterThanOrEqualTo(String value) {
            addCriterion("veeupdate >=", value, "veeupdate");
            return (Criteria) this;
        }

        public Criteria andVeeupdateLessThan(String value) {
            addCriterion("veeupdate <", value, "veeupdate");
            return (Criteria) this;
        }

        public Criteria andVeeupdateLessThanOrEqualTo(String value) {
            addCriterion("veeupdate <=", value, "veeupdate");
            return (Criteria) this;
        }

        public Criteria andVeeupdateLike(String value) {
            addCriterion("veeupdate like", value, "veeupdate");
            return (Criteria) this;
        }

        public Criteria andVeeupdateNotLike(String value) {
            addCriterion("veeupdate not like", value, "veeupdate");
            return (Criteria) this;
        }

        public Criteria andVeeupdateIn(List<String> values) {
            addCriterion("veeupdate in", values, "veeupdate");
            return (Criteria) this;
        }

        public Criteria andVeeupdateNotIn(List<String> values) {
            addCriterion("veeupdate not in", values, "veeupdate");
            return (Criteria) this;
        }

        public Criteria andVeeupdateBetween(String value1, String value2) {
            addCriterion("veeupdate between", value1, value2, "veeupdate");
            return (Criteria) this;
        }

        public Criteria andVeeupdateNotBetween(String value1, String value2) {
            addCriterion("veeupdate not between", value1, value2, "veeupdate");
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

        public Criteria andBei1IsNull() {
            addCriterion("bei1 is null");
            return (Criteria) this;
        }

        public Criteria andBei1IsNotNull() {
            addCriterion("bei1 is not null");
            return (Criteria) this;
        }

        public Criteria andBei1EqualTo(String value) {
            addCriterion("bei1 =", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1NotEqualTo(String value) {
            addCriterion("bei1 <>", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1GreaterThan(String value) {
            addCriterion("bei1 >", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1GreaterThanOrEqualTo(String value) {
            addCriterion("bei1 >=", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1LessThan(String value) {
            addCriterion("bei1 <", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1LessThanOrEqualTo(String value) {
            addCriterion("bei1 <=", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1Like(String value) {
            addCriterion("bei1 like", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1NotLike(String value) {
            addCriterion("bei1 not like", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1In(List<String> values) {
            addCriterion("bei1 in", values, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1NotIn(List<String> values) {
            addCriterion("bei1 not in", values, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1Between(String value1, String value2) {
            addCriterion("bei1 between", value1, value2, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1NotBetween(String value1, String value2) {
            addCriterion("bei1 not between", value1, value2, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei2IsNull() {
            addCriterion("bei2 is null");
            return (Criteria) this;
        }

        public Criteria andBei2IsNotNull() {
            addCriterion("bei2 is not null");
            return (Criteria) this;
        }

        public Criteria andBei2EqualTo(String value) {
            addCriterion("bei2 =", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2NotEqualTo(String value) {
            addCriterion("bei2 <>", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2GreaterThan(String value) {
            addCriterion("bei2 >", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2GreaterThanOrEqualTo(String value) {
            addCriterion("bei2 >=", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2LessThan(String value) {
            addCriterion("bei2 <", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2LessThanOrEqualTo(String value) {
            addCriterion("bei2 <=", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2Like(String value) {
            addCriterion("bei2 like", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2NotLike(String value) {
            addCriterion("bei2 not like", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2In(List<String> values) {
            addCriterion("bei2 in", values, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2NotIn(List<String> values) {
            addCriterion("bei2 not in", values, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2Between(String value1, String value2) {
            addCriterion("bei2 between", value1, value2, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2NotBetween(String value1, String value2) {
            addCriterion("bei2 not between", value1, value2, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei3IsNull() {
            addCriterion("bei3 is null");
            return (Criteria) this;
        }

        public Criteria andBei3IsNotNull() {
            addCriterion("bei3 is not null");
            return (Criteria) this;
        }

        public Criteria andBei3EqualTo(String value) {
            addCriterion("bei3 =", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3NotEqualTo(String value) {
            addCriterion("bei3 <>", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3GreaterThan(String value) {
            addCriterion("bei3 >", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3GreaterThanOrEqualTo(String value) {
            addCriterion("bei3 >=", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3LessThan(String value) {
            addCriterion("bei3 <", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3LessThanOrEqualTo(String value) {
            addCriterion("bei3 <=", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3Like(String value) {
            addCriterion("bei3 like", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3NotLike(String value) {
            addCriterion("bei3 not like", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3In(List<String> values) {
            addCriterion("bei3 in", values, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3NotIn(List<String> values) {
            addCriterion("bei3 not in", values, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3Between(String value1, String value2) {
            addCriterion("bei3 between", value1, value2, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3NotBetween(String value1, String value2) {
            addCriterion("bei3 not between", value1, value2, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei4IsNull() {
            addCriterion("bei4 is null");
            return (Criteria) this;
        }

        public Criteria andBei4IsNotNull() {
            addCriterion("bei4 is not null");
            return (Criteria) this;
        }

        public Criteria andBei4EqualTo(String value) {
            addCriterion("bei4 =", value, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4NotEqualTo(String value) {
            addCriterion("bei4 <>", value, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4GreaterThan(String value) {
            addCriterion("bei4 >", value, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4GreaterThanOrEqualTo(String value) {
            addCriterion("bei4 >=", value, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4LessThan(String value) {
            addCriterion("bei4 <", value, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4LessThanOrEqualTo(String value) {
            addCriterion("bei4 <=", value, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4Like(String value) {
            addCriterion("bei4 like", value, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4NotLike(String value) {
            addCriterion("bei4 not like", value, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4In(List<String> values) {
            addCriterion("bei4 in", values, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4NotIn(List<String> values) {
            addCriterion("bei4 not in", values, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4Between(String value1, String value2) {
            addCriterion("bei4 between", value1, value2, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4NotBetween(String value1, String value2) {
            addCriterion("bei4 not between", value1, value2, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei5IsNull() {
            addCriterion("bei5 is null");
            return (Criteria) this;
        }

        public Criteria andBei5IsNotNull() {
            addCriterion("bei5 is not null");
            return (Criteria) this;
        }

        public Criteria andBei5EqualTo(Integer value) {
            addCriterion("bei5 =", value, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei5NotEqualTo(Integer value) {
            addCriterion("bei5 <>", value, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei5GreaterThan(Integer value) {
            addCriterion("bei5 >", value, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei5GreaterThanOrEqualTo(Integer value) {
            addCriterion("bei5 >=", value, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei5LessThan(Integer value) {
            addCriterion("bei5 <", value, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei5LessThanOrEqualTo(Integer value) {
            addCriterion("bei5 <=", value, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei5In(List<Integer> values) {
            addCriterion("bei5 in", values, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei5NotIn(List<Integer> values) {
            addCriterion("bei5 not in", values, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei5Between(Integer value1, Integer value2) {
            addCriterion("bei5 between", value1, value2, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei5NotBetween(Integer value1, Integer value2) {
            addCriterion("bei5 not between", value1, value2, "bei5");
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