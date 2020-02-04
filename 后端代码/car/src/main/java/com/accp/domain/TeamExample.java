package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class TeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamExample() {
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

        public Criteria andTemnameIsNull() {
            addCriterion("temname is null");
            return (Criteria) this;
        }

        public Criteria andTemnameIsNotNull() {
            addCriterion("temname is not null");
            return (Criteria) this;
        }

        public Criteria andTemnameEqualTo(String value) {
            addCriterion("temname =", value, "temname");
            return (Criteria) this;
        }

        public Criteria andTemnameNotEqualTo(String value) {
            addCriterion("temname <>", value, "temname");
            return (Criteria) this;
        }

        public Criteria andTemnameGreaterThan(String value) {
            addCriterion("temname >", value, "temname");
            return (Criteria) this;
        }

        public Criteria andTemnameGreaterThanOrEqualTo(String value) {
            addCriterion("temname >=", value, "temname");
            return (Criteria) this;
        }

        public Criteria andTemnameLessThan(String value) {
            addCriterion("temname <", value, "temname");
            return (Criteria) this;
        }

        public Criteria andTemnameLessThanOrEqualTo(String value) {
            addCriterion("temname <=", value, "temname");
            return (Criteria) this;
        }

        public Criteria andTemnameLike(String value) {
            addCriterion("temname like", value, "temname");
            return (Criteria) this;
        }

        public Criteria andTemnameNotLike(String value) {
            addCriterion("temname not like", value, "temname");
            return (Criteria) this;
        }

        public Criteria andTemnameIn(List<String> values) {
            addCriterion("temname in", values, "temname");
            return (Criteria) this;
        }

        public Criteria andTemnameNotIn(List<String> values) {
            addCriterion("temname not in", values, "temname");
            return (Criteria) this;
        }

        public Criteria andTemnameBetween(String value1, String value2) {
            addCriterion("temname between", value1, value2, "temname");
            return (Criteria) this;
        }

        public Criteria andTemnameNotBetween(String value1, String value2) {
            addCriterion("temname not between", value1, value2, "temname");
            return (Criteria) this;
        }

        public Criteria andTemcalssifyIsNull() {
            addCriterion("temcalssify is null");
            return (Criteria) this;
        }

        public Criteria andTemcalssifyIsNotNull() {
            addCriterion("temcalssify is not null");
            return (Criteria) this;
        }

        public Criteria andTemcalssifyEqualTo(String value) {
            addCriterion("temcalssify =", value, "temcalssify");
            return (Criteria) this;
        }

        public Criteria andTemcalssifyNotEqualTo(String value) {
            addCriterion("temcalssify <>", value, "temcalssify");
            return (Criteria) this;
        }

        public Criteria andTemcalssifyGreaterThan(String value) {
            addCriterion("temcalssify >", value, "temcalssify");
            return (Criteria) this;
        }

        public Criteria andTemcalssifyGreaterThanOrEqualTo(String value) {
            addCriterion("temcalssify >=", value, "temcalssify");
            return (Criteria) this;
        }

        public Criteria andTemcalssifyLessThan(String value) {
            addCriterion("temcalssify <", value, "temcalssify");
            return (Criteria) this;
        }

        public Criteria andTemcalssifyLessThanOrEqualTo(String value) {
            addCriterion("temcalssify <=", value, "temcalssify");
            return (Criteria) this;
        }

        public Criteria andTemcalssifyLike(String value) {
            addCriterion("temcalssify like", value, "temcalssify");
            return (Criteria) this;
        }

        public Criteria andTemcalssifyNotLike(String value) {
            addCriterion("temcalssify not like", value, "temcalssify");
            return (Criteria) this;
        }

        public Criteria andTemcalssifyIn(List<String> values) {
            addCriterion("temcalssify in", values, "temcalssify");
            return (Criteria) this;
        }

        public Criteria andTemcalssifyNotIn(List<String> values) {
            addCriterion("temcalssify not in", values, "temcalssify");
            return (Criteria) this;
        }

        public Criteria andTemcalssifyBetween(String value1, String value2) {
            addCriterion("temcalssify between", value1, value2, "temcalssify");
            return (Criteria) this;
        }

        public Criteria andTemcalssifyNotBetween(String value1, String value2) {
            addCriterion("temcalssify not between", value1, value2, "temcalssify");
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