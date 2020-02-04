package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ShopsmallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopsmallExample() {
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

        public Criteria andShlidIsNull() {
            addCriterion("shlid is null");
            return (Criteria) this;
        }

        public Criteria andShlidIsNotNull() {
            addCriterion("shlid is not null");
            return (Criteria) this;
        }

        public Criteria andShlidEqualTo(String value) {
            addCriterion("shlid =", value, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidNotEqualTo(String value) {
            addCriterion("shlid <>", value, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidGreaterThan(String value) {
            addCriterion("shlid >", value, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidGreaterThanOrEqualTo(String value) {
            addCriterion("shlid >=", value, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidLessThan(String value) {
            addCriterion("shlid <", value, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidLessThanOrEqualTo(String value) {
            addCriterion("shlid <=", value, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidLike(String value) {
            addCriterion("shlid like", value, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidNotLike(String value) {
            addCriterion("shlid not like", value, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidIn(List<String> values) {
            addCriterion("shlid in", values, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidNotIn(List<String> values) {
            addCriterion("shlid not in", values, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidBetween(String value1, String value2) {
            addCriterion("shlid between", value1, value2, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidNotBetween(String value1, String value2) {
            addCriterion("shlid not between", value1, value2, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlnameIsNull() {
            addCriterion("shlname is null");
            return (Criteria) this;
        }

        public Criteria andShlnameIsNotNull() {
            addCriterion("shlname is not null");
            return (Criteria) this;
        }

        public Criteria andShlnameEqualTo(String value) {
            addCriterion("shlname =", value, "shlname");
            return (Criteria) this;
        }

        public Criteria andShlnameNotEqualTo(String value) {
            addCriterion("shlname <>", value, "shlname");
            return (Criteria) this;
        }

        public Criteria andShlnameGreaterThan(String value) {
            addCriterion("shlname >", value, "shlname");
            return (Criteria) this;
        }

        public Criteria andShlnameGreaterThanOrEqualTo(String value) {
            addCriterion("shlname >=", value, "shlname");
            return (Criteria) this;
        }

        public Criteria andShlnameLessThan(String value) {
            addCriterion("shlname <", value, "shlname");
            return (Criteria) this;
        }

        public Criteria andShlnameLessThanOrEqualTo(String value) {
            addCriterion("shlname <=", value, "shlname");
            return (Criteria) this;
        }

        public Criteria andShlnameLike(String value) {
            addCriterion("shlname like", value, "shlname");
            return (Criteria) this;
        }

        public Criteria andShlnameNotLike(String value) {
            addCriterion("shlname not like", value, "shlname");
            return (Criteria) this;
        }

        public Criteria andShlnameIn(List<String> values) {
            addCriterion("shlname in", values, "shlname");
            return (Criteria) this;
        }

        public Criteria andShlnameNotIn(List<String> values) {
            addCriterion("shlname not in", values, "shlname");
            return (Criteria) this;
        }

        public Criteria andShlnameBetween(String value1, String value2) {
            addCriterion("shlname between", value1, value2, "shlname");
            return (Criteria) this;
        }

        public Criteria andShlnameNotBetween(String value1, String value2) {
            addCriterion("shlname not between", value1, value2, "shlname");
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