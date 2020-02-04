package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class MotorcycleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MotorcycleExample() {
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

        public Criteria andMoeidIsNull() {
            addCriterion("moeid is null");
            return (Criteria) this;
        }

        public Criteria andMoeidIsNotNull() {
            addCriterion("moeid is not null");
            return (Criteria) this;
        }

        public Criteria andMoeidEqualTo(String value) {
            addCriterion("moeid =", value, "moeid");
            return (Criteria) this;
        }

        public Criteria andMoeidNotEqualTo(String value) {
            addCriterion("moeid <>", value, "moeid");
            return (Criteria) this;
        }

        public Criteria andMoeidGreaterThan(String value) {
            addCriterion("moeid >", value, "moeid");
            return (Criteria) this;
        }

        public Criteria andMoeidGreaterThanOrEqualTo(String value) {
            addCriterion("moeid >=", value, "moeid");
            return (Criteria) this;
        }

        public Criteria andMoeidLessThan(String value) {
            addCriterion("moeid <", value, "moeid");
            return (Criteria) this;
        }

        public Criteria andMoeidLessThanOrEqualTo(String value) {
            addCriterion("moeid <=", value, "moeid");
            return (Criteria) this;
        }

        public Criteria andMoeidLike(String value) {
            addCriterion("moeid like", value, "moeid");
            return (Criteria) this;
        }

        public Criteria andMoeidNotLike(String value) {
            addCriterion("moeid not like", value, "moeid");
            return (Criteria) this;
        }

        public Criteria andMoeidIn(List<String> values) {
            addCriterion("moeid in", values, "moeid");
            return (Criteria) this;
        }

        public Criteria andMoeidNotIn(List<String> values) {
            addCriterion("moeid not in", values, "moeid");
            return (Criteria) this;
        }

        public Criteria andMoeidBetween(String value1, String value2) {
            addCriterion("moeid between", value1, value2, "moeid");
            return (Criteria) this;
        }

        public Criteria andMoeidNotBetween(String value1, String value2) {
            addCriterion("moeid not between", value1, value2, "moeid");
            return (Criteria) this;
        }

        public Criteria andTrkidIsNull() {
            addCriterion("trkid is null");
            return (Criteria) this;
        }

        public Criteria andTrkidIsNotNull() {
            addCriterion("trkid is not null");
            return (Criteria) this;
        }

        public Criteria andTrkidEqualTo(String value) {
            addCriterion("trkid =", value, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidNotEqualTo(String value) {
            addCriterion("trkid <>", value, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidGreaterThan(String value) {
            addCriterion("trkid >", value, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidGreaterThanOrEqualTo(String value) {
            addCriterion("trkid >=", value, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidLessThan(String value) {
            addCriterion("trkid <", value, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidLessThanOrEqualTo(String value) {
            addCriterion("trkid <=", value, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidLike(String value) {
            addCriterion("trkid like", value, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidNotLike(String value) {
            addCriterion("trkid not like", value, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidIn(List<String> values) {
            addCriterion("trkid in", values, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidNotIn(List<String> values) {
            addCriterion("trkid not in", values, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidBetween(String value1, String value2) {
            addCriterion("trkid between", value1, value2, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidNotBetween(String value1, String value2) {
            addCriterion("trkid not between", value1, value2, "trkid");
            return (Criteria) this;
        }

        public Criteria andMoenameIsNull() {
            addCriterion("moename is null");
            return (Criteria) this;
        }

        public Criteria andMoenameIsNotNull() {
            addCriterion("moename is not null");
            return (Criteria) this;
        }

        public Criteria andMoenameEqualTo(String value) {
            addCriterion("moename =", value, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameNotEqualTo(String value) {
            addCriterion("moename <>", value, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameGreaterThan(String value) {
            addCriterion("moename >", value, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameGreaterThanOrEqualTo(String value) {
            addCriterion("moename >=", value, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameLessThan(String value) {
            addCriterion("moename <", value, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameLessThanOrEqualTo(String value) {
            addCriterion("moename <=", value, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameLike(String value) {
            addCriterion("moename like", value, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameNotLike(String value) {
            addCriterion("moename not like", value, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameIn(List<String> values) {
            addCriterion("moename in", values, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameNotIn(List<String> values) {
            addCriterion("moename not in", values, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameBetween(String value1, String value2) {
            addCriterion("moename between", value1, value2, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameNotBetween(String value1, String value2) {
            addCriterion("moename not between", value1, value2, "moename");
            return (Criteria) this;
        }

        public Criteria andMoesourceIsNull() {
            addCriterion("moesource is null");
            return (Criteria) this;
        }

        public Criteria andMoesourceIsNotNull() {
            addCriterion("moesource is not null");
            return (Criteria) this;
        }

        public Criteria andMoesourceEqualTo(String value) {
            addCriterion("moesource =", value, "moesource");
            return (Criteria) this;
        }

        public Criteria andMoesourceNotEqualTo(String value) {
            addCriterion("moesource <>", value, "moesource");
            return (Criteria) this;
        }

        public Criteria andMoesourceGreaterThan(String value) {
            addCriterion("moesource >", value, "moesource");
            return (Criteria) this;
        }

        public Criteria andMoesourceGreaterThanOrEqualTo(String value) {
            addCriterion("moesource >=", value, "moesource");
            return (Criteria) this;
        }

        public Criteria andMoesourceLessThan(String value) {
            addCriterion("moesource <", value, "moesource");
            return (Criteria) this;
        }

        public Criteria andMoesourceLessThanOrEqualTo(String value) {
            addCriterion("moesource <=", value, "moesource");
            return (Criteria) this;
        }

        public Criteria andMoesourceLike(String value) {
            addCriterion("moesource like", value, "moesource");
            return (Criteria) this;
        }

        public Criteria andMoesourceNotLike(String value) {
            addCriterion("moesource not like", value, "moesource");
            return (Criteria) this;
        }

        public Criteria andMoesourceIn(List<String> values) {
            addCriterion("moesource in", values, "moesource");
            return (Criteria) this;
        }

        public Criteria andMoesourceNotIn(List<String> values) {
            addCriterion("moesource not in", values, "moesource");
            return (Criteria) this;
        }

        public Criteria andMoesourceBetween(String value1, String value2) {
            addCriterion("moesource between", value1, value2, "moesource");
            return (Criteria) this;
        }

        public Criteria andMoesourceNotBetween(String value1, String value2) {
            addCriterion("moesource not between", value1, value2, "moesource");
            return (Criteria) this;
        }

        public Criteria andMoepriceIsNull() {
            addCriterion("moeprice is null");
            return (Criteria) this;
        }

        public Criteria andMoepriceIsNotNull() {
            addCriterion("moeprice is not null");
            return (Criteria) this;
        }

        public Criteria andMoepriceEqualTo(Integer value) {
            addCriterion("moeprice =", value, "moeprice");
            return (Criteria) this;
        }

        public Criteria andMoepriceNotEqualTo(Integer value) {
            addCriterion("moeprice <>", value, "moeprice");
            return (Criteria) this;
        }

        public Criteria andMoepriceGreaterThan(Integer value) {
            addCriterion("moeprice >", value, "moeprice");
            return (Criteria) this;
        }

        public Criteria andMoepriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("moeprice >=", value, "moeprice");
            return (Criteria) this;
        }

        public Criteria andMoepriceLessThan(Integer value) {
            addCriterion("moeprice <", value, "moeprice");
            return (Criteria) this;
        }

        public Criteria andMoepriceLessThanOrEqualTo(Integer value) {
            addCriterion("moeprice <=", value, "moeprice");
            return (Criteria) this;
        }

        public Criteria andMoepriceIn(List<Integer> values) {
            addCriterion("moeprice in", values, "moeprice");
            return (Criteria) this;
        }

        public Criteria andMoepriceNotIn(List<Integer> values) {
            addCriterion("moeprice not in", values, "moeprice");
            return (Criteria) this;
        }

        public Criteria andMoepriceBetween(Integer value1, Integer value2) {
            addCriterion("moeprice between", value1, value2, "moeprice");
            return (Criteria) this;
        }

        public Criteria andMoepriceNotBetween(Integer value1, Integer value2) {
            addCriterion("moeprice not between", value1, value2, "moeprice");
            return (Criteria) this;
        }

        public Criteria andMoeyearIsNull() {
            addCriterion("moeyear is null");
            return (Criteria) this;
        }

        public Criteria andMoeyearIsNotNull() {
            addCriterion("moeyear is not null");
            return (Criteria) this;
        }

        public Criteria andMoeyearEqualTo(String value) {
            addCriterion("moeyear =", value, "moeyear");
            return (Criteria) this;
        }

        public Criteria andMoeyearNotEqualTo(String value) {
            addCriterion("moeyear <>", value, "moeyear");
            return (Criteria) this;
        }

        public Criteria andMoeyearGreaterThan(String value) {
            addCriterion("moeyear >", value, "moeyear");
            return (Criteria) this;
        }

        public Criteria andMoeyearGreaterThanOrEqualTo(String value) {
            addCriterion("moeyear >=", value, "moeyear");
            return (Criteria) this;
        }

        public Criteria andMoeyearLessThan(String value) {
            addCriterion("moeyear <", value, "moeyear");
            return (Criteria) this;
        }

        public Criteria andMoeyearLessThanOrEqualTo(String value) {
            addCriterion("moeyear <=", value, "moeyear");
            return (Criteria) this;
        }

        public Criteria andMoeyearLike(String value) {
            addCriterion("moeyear like", value, "moeyear");
            return (Criteria) this;
        }

        public Criteria andMoeyearNotLike(String value) {
            addCriterion("moeyear not like", value, "moeyear");
            return (Criteria) this;
        }

        public Criteria andMoeyearIn(List<String> values) {
            addCriterion("moeyear in", values, "moeyear");
            return (Criteria) this;
        }

        public Criteria andMoeyearNotIn(List<String> values) {
            addCriterion("moeyear not in", values, "moeyear");
            return (Criteria) this;
        }

        public Criteria andMoeyearBetween(String value1, String value2) {
            addCriterion("moeyear between", value1, value2, "moeyear");
            return (Criteria) this;
        }

        public Criteria andMoeyearNotBetween(String value1, String value2) {
            addCriterion("moeyear not between", value1, value2, "moeyear");
            return (Criteria) this;
        }

        public Criteria andMoepowerIsNull() {
            addCriterion("moepower is null");
            return (Criteria) this;
        }

        public Criteria andMoepowerIsNotNull() {
            addCriterion("moepower is not null");
            return (Criteria) this;
        }

        public Criteria andMoepowerEqualTo(String value) {
            addCriterion("moepower =", value, "moepower");
            return (Criteria) this;
        }

        public Criteria andMoepowerNotEqualTo(String value) {
            addCriterion("moepower <>", value, "moepower");
            return (Criteria) this;
        }

        public Criteria andMoepowerGreaterThan(String value) {
            addCriterion("moepower >", value, "moepower");
            return (Criteria) this;
        }

        public Criteria andMoepowerGreaterThanOrEqualTo(String value) {
            addCriterion("moepower >=", value, "moepower");
            return (Criteria) this;
        }

        public Criteria andMoepowerLessThan(String value) {
            addCriterion("moepower <", value, "moepower");
            return (Criteria) this;
        }

        public Criteria andMoepowerLessThanOrEqualTo(String value) {
            addCriterion("moepower <=", value, "moepower");
            return (Criteria) this;
        }

        public Criteria andMoepowerLike(String value) {
            addCriterion("moepower like", value, "moepower");
            return (Criteria) this;
        }

        public Criteria andMoepowerNotLike(String value) {
            addCriterion("moepower not like", value, "moepower");
            return (Criteria) this;
        }

        public Criteria andMoepowerIn(List<String> values) {
            addCriterion("moepower in", values, "moepower");
            return (Criteria) this;
        }

        public Criteria andMoepowerNotIn(List<String> values) {
            addCriterion("moepower not in", values, "moepower");
            return (Criteria) this;
        }

        public Criteria andMoepowerBetween(String value1, String value2) {
            addCriterion("moepower between", value1, value2, "moepower");
            return (Criteria) this;
        }

        public Criteria andMoepowerNotBetween(String value1, String value2) {
            addCriterion("moepower not between", value1, value2, "moepower");
            return (Criteria) this;
        }

        public Criteria andMoegradeIsNull() {
            addCriterion("moegrade is null");
            return (Criteria) this;
        }

        public Criteria andMoegradeIsNotNull() {
            addCriterion("moegrade is not null");
            return (Criteria) this;
        }

        public Criteria andMoegradeEqualTo(String value) {
            addCriterion("moegrade =", value, "moegrade");
            return (Criteria) this;
        }

        public Criteria andMoegradeNotEqualTo(String value) {
            addCriterion("moegrade <>", value, "moegrade");
            return (Criteria) this;
        }

        public Criteria andMoegradeGreaterThan(String value) {
            addCriterion("moegrade >", value, "moegrade");
            return (Criteria) this;
        }

        public Criteria andMoegradeGreaterThanOrEqualTo(String value) {
            addCriterion("moegrade >=", value, "moegrade");
            return (Criteria) this;
        }

        public Criteria andMoegradeLessThan(String value) {
            addCriterion("moegrade <", value, "moegrade");
            return (Criteria) this;
        }

        public Criteria andMoegradeLessThanOrEqualTo(String value) {
            addCriterion("moegrade <=", value, "moegrade");
            return (Criteria) this;
        }

        public Criteria andMoegradeLike(String value) {
            addCriterion("moegrade like", value, "moegrade");
            return (Criteria) this;
        }

        public Criteria andMoegradeNotLike(String value) {
            addCriterion("moegrade not like", value, "moegrade");
            return (Criteria) this;
        }

        public Criteria andMoegradeIn(List<String> values) {
            addCriterion("moegrade in", values, "moegrade");
            return (Criteria) this;
        }

        public Criteria andMoegradeNotIn(List<String> values) {
            addCriterion("moegrade not in", values, "moegrade");
            return (Criteria) this;
        }

        public Criteria andMoegradeBetween(String value1, String value2) {
            addCriterion("moegrade between", value1, value2, "moegrade");
            return (Criteria) this;
        }

        public Criteria andMoegradeNotBetween(String value1, String value2) {
            addCriterion("moegrade not between", value1, value2, "moegrade");
            return (Criteria) this;
        }

        public Criteria andMoeloadIsNull() {
            addCriterion("moeload is null");
            return (Criteria) this;
        }

        public Criteria andMoeloadIsNotNull() {
            addCriterion("moeload is not null");
            return (Criteria) this;
        }

        public Criteria andMoeloadEqualTo(String value) {
            addCriterion("moeload =", value, "moeload");
            return (Criteria) this;
        }

        public Criteria andMoeloadNotEqualTo(String value) {
            addCriterion("moeload <>", value, "moeload");
            return (Criteria) this;
        }

        public Criteria andMoeloadGreaterThan(String value) {
            addCriterion("moeload >", value, "moeload");
            return (Criteria) this;
        }

        public Criteria andMoeloadGreaterThanOrEqualTo(String value) {
            addCriterion("moeload >=", value, "moeload");
            return (Criteria) this;
        }

        public Criteria andMoeloadLessThan(String value) {
            addCriterion("moeload <", value, "moeload");
            return (Criteria) this;
        }

        public Criteria andMoeloadLessThanOrEqualTo(String value) {
            addCriterion("moeload <=", value, "moeload");
            return (Criteria) this;
        }

        public Criteria andMoeloadLike(String value) {
            addCriterion("moeload like", value, "moeload");
            return (Criteria) this;
        }

        public Criteria andMoeloadNotLike(String value) {
            addCriterion("moeload not like", value, "moeload");
            return (Criteria) this;
        }

        public Criteria andMoeloadIn(List<String> values) {
            addCriterion("moeload in", values, "moeload");
            return (Criteria) this;
        }

        public Criteria andMoeloadNotIn(List<String> values) {
            addCriterion("moeload not in", values, "moeload");
            return (Criteria) this;
        }

        public Criteria andMoeloadBetween(String value1, String value2) {
            addCriterion("moeload between", value1, value2, "moeload");
            return (Criteria) this;
        }

        public Criteria andMoeloadNotBetween(String value1, String value2) {
            addCriterion("moeload not between", value1, value2, "moeload");
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