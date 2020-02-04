package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class AdjunctExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdjunctExample() {
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

        public Criteria andAdtidIsNull() {
            addCriterion("adtid is null");
            return (Criteria) this;
        }

        public Criteria andAdtidIsNotNull() {
            addCriterion("adtid is not null");
            return (Criteria) this;
        }

        public Criteria andAdtidEqualTo(String value) {
            addCriterion("adtid =", value, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidNotEqualTo(String value) {
            addCriterion("adtid <>", value, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidGreaterThan(String value) {
            addCriterion("adtid >", value, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidGreaterThanOrEqualTo(String value) {
            addCriterion("adtid >=", value, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidLessThan(String value) {
            addCriterion("adtid <", value, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidLessThanOrEqualTo(String value) {
            addCriterion("adtid <=", value, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidLike(String value) {
            addCriterion("adtid like", value, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidNotLike(String value) {
            addCriterion("adtid not like", value, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidIn(List<String> values) {
            addCriterion("adtid in", values, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidNotIn(List<String> values) {
            addCriterion("adtid not in", values, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidBetween(String value1, String value2) {
            addCriterion("adtid between", value1, value2, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidNotBetween(String value1, String value2) {
            addCriterion("adtid not between", value1, value2, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtnameIsNull() {
            addCriterion("adtname is null");
            return (Criteria) this;
        }

        public Criteria andAdtnameIsNotNull() {
            addCriterion("adtname is not null");
            return (Criteria) this;
        }

        public Criteria andAdtnameEqualTo(String value) {
            addCriterion("adtname =", value, "adtname");
            return (Criteria) this;
        }

        public Criteria andAdtnameNotEqualTo(String value) {
            addCriterion("adtname <>", value, "adtname");
            return (Criteria) this;
        }

        public Criteria andAdtnameGreaterThan(String value) {
            addCriterion("adtname >", value, "adtname");
            return (Criteria) this;
        }

        public Criteria andAdtnameGreaterThanOrEqualTo(String value) {
            addCriterion("adtname >=", value, "adtname");
            return (Criteria) this;
        }

        public Criteria andAdtnameLessThan(String value) {
            addCriterion("adtname <", value, "adtname");
            return (Criteria) this;
        }

        public Criteria andAdtnameLessThanOrEqualTo(String value) {
            addCriterion("adtname <=", value, "adtname");
            return (Criteria) this;
        }

        public Criteria andAdtnameLike(String value) {
            addCriterion("adtname like", value, "adtname");
            return (Criteria) this;
        }

        public Criteria andAdtnameNotLike(String value) {
            addCriterion("adtname not like", value, "adtname");
            return (Criteria) this;
        }

        public Criteria andAdtnameIn(List<String> values) {
            addCriterion("adtname in", values, "adtname");
            return (Criteria) this;
        }

        public Criteria andAdtnameNotIn(List<String> values) {
            addCriterion("adtname not in", values, "adtname");
            return (Criteria) this;
        }

        public Criteria andAdtnameBetween(String value1, String value2) {
            addCriterion("adtname between", value1, value2, "adtname");
            return (Criteria) this;
        }

        public Criteria andAdtnameNotBetween(String value1, String value2) {
            addCriterion("adtname not between", value1, value2, "adtname");
            return (Criteria) this;
        }

        public Criteria andAdtclaIsNull() {
            addCriterion("adtcla is null");
            return (Criteria) this;
        }

        public Criteria andAdtclaIsNotNull() {
            addCriterion("adtcla is not null");
            return (Criteria) this;
        }

        public Criteria andAdtclaEqualTo(String value) {
            addCriterion("adtcla =", value, "adtcla");
            return (Criteria) this;
        }

        public Criteria andAdtclaNotEqualTo(String value) {
            addCriterion("adtcla <>", value, "adtcla");
            return (Criteria) this;
        }

        public Criteria andAdtclaGreaterThan(String value) {
            addCriterion("adtcla >", value, "adtcla");
            return (Criteria) this;
        }

        public Criteria andAdtclaGreaterThanOrEqualTo(String value) {
            addCriterion("adtcla >=", value, "adtcla");
            return (Criteria) this;
        }

        public Criteria andAdtclaLessThan(String value) {
            addCriterion("adtcla <", value, "adtcla");
            return (Criteria) this;
        }

        public Criteria andAdtclaLessThanOrEqualTo(String value) {
            addCriterion("adtcla <=", value, "adtcla");
            return (Criteria) this;
        }

        public Criteria andAdtclaLike(String value) {
            addCriterion("adtcla like", value, "adtcla");
            return (Criteria) this;
        }

        public Criteria andAdtclaNotLike(String value) {
            addCriterion("adtcla not like", value, "adtcla");
            return (Criteria) this;
        }

        public Criteria andAdtclaIn(List<String> values) {
            addCriterion("adtcla in", values, "adtcla");
            return (Criteria) this;
        }

        public Criteria andAdtclaNotIn(List<String> values) {
            addCriterion("adtcla not in", values, "adtcla");
            return (Criteria) this;
        }

        public Criteria andAdtclaBetween(String value1, String value2) {
            addCriterion("adtcla between", value1, value2, "adtcla");
            return (Criteria) this;
        }

        public Criteria andAdtclaNotBetween(String value1, String value2) {
            addCriterion("adtcla not between", value1, value2, "adtcla");
            return (Criteria) this;
        }

        public Criteria andAdtpriceIsNull() {
            addCriterion("adtprice is null");
            return (Criteria) this;
        }

        public Criteria andAdtpriceIsNotNull() {
            addCriterion("adtprice is not null");
            return (Criteria) this;
        }

        public Criteria andAdtpriceEqualTo(Integer value) {
            addCriterion("adtprice =", value, "adtprice");
            return (Criteria) this;
        }

        public Criteria andAdtpriceNotEqualTo(Integer value) {
            addCriterion("adtprice <>", value, "adtprice");
            return (Criteria) this;
        }

        public Criteria andAdtpriceGreaterThan(Integer value) {
            addCriterion("adtprice >", value, "adtprice");
            return (Criteria) this;
        }

        public Criteria andAdtpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("adtprice >=", value, "adtprice");
            return (Criteria) this;
        }

        public Criteria andAdtpriceLessThan(Integer value) {
            addCriterion("adtprice <", value, "adtprice");
            return (Criteria) this;
        }

        public Criteria andAdtpriceLessThanOrEqualTo(Integer value) {
            addCriterion("adtprice <=", value, "adtprice");
            return (Criteria) this;
        }

        public Criteria andAdtpriceIn(List<Integer> values) {
            addCriterion("adtprice in", values, "adtprice");
            return (Criteria) this;
        }

        public Criteria andAdtpriceNotIn(List<Integer> values) {
            addCriterion("adtprice not in", values, "adtprice");
            return (Criteria) this;
        }

        public Criteria andAdtpriceBetween(Integer value1, Integer value2) {
            addCriterion("adtprice between", value1, value2, "adtprice");
            return (Criteria) this;
        }

        public Criteria andAdtpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("adtprice not between", value1, value2, "adtprice");
            return (Criteria) this;
        }

        public Criteria andAdtremakeIsNull() {
            addCriterion("adtremake is null");
            return (Criteria) this;
        }

        public Criteria andAdtremakeIsNotNull() {
            addCriterion("adtremake is not null");
            return (Criteria) this;
        }

        public Criteria andAdtremakeEqualTo(String value) {
            addCriterion("adtremake =", value, "adtremake");
            return (Criteria) this;
        }

        public Criteria andAdtremakeNotEqualTo(String value) {
            addCriterion("adtremake <>", value, "adtremake");
            return (Criteria) this;
        }

        public Criteria andAdtremakeGreaterThan(String value) {
            addCriterion("adtremake >", value, "adtremake");
            return (Criteria) this;
        }

        public Criteria andAdtremakeGreaterThanOrEqualTo(String value) {
            addCriterion("adtremake >=", value, "adtremake");
            return (Criteria) this;
        }

        public Criteria andAdtremakeLessThan(String value) {
            addCriterion("adtremake <", value, "adtremake");
            return (Criteria) this;
        }

        public Criteria andAdtremakeLessThanOrEqualTo(String value) {
            addCriterion("adtremake <=", value, "adtremake");
            return (Criteria) this;
        }

        public Criteria andAdtremakeLike(String value) {
            addCriterion("adtremake like", value, "adtremake");
            return (Criteria) this;
        }

        public Criteria andAdtremakeNotLike(String value) {
            addCriterion("adtremake not like", value, "adtremake");
            return (Criteria) this;
        }

        public Criteria andAdtremakeIn(List<String> values) {
            addCriterion("adtremake in", values, "adtremake");
            return (Criteria) this;
        }

        public Criteria andAdtremakeNotIn(List<String> values) {
            addCriterion("adtremake not in", values, "adtremake");
            return (Criteria) this;
        }

        public Criteria andAdtremakeBetween(String value1, String value2) {
            addCriterion("adtremake between", value1, value2, "adtremake");
            return (Criteria) this;
        }

        public Criteria andAdtremakeNotBetween(String value1, String value2) {
            addCriterion("adtremake not between", value1, value2, "adtremake");
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