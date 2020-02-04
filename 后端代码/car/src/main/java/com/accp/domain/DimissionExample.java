package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class DimissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DimissionExample() {
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

        public Criteria andDinidIsNull() {
            addCriterion("dinid is null");
            return (Criteria) this;
        }

        public Criteria andDinidIsNotNull() {
            addCriterion("dinid is not null");
            return (Criteria) this;
        }

        public Criteria andDinidEqualTo(Integer value) {
            addCriterion("dinid =", value, "dinid");
            return (Criteria) this;
        }

        public Criteria andDinidNotEqualTo(Integer value) {
            addCriterion("dinid <>", value, "dinid");
            return (Criteria) this;
        }

        public Criteria andDinidGreaterThan(Integer value) {
            addCriterion("dinid >", value, "dinid");
            return (Criteria) this;
        }

        public Criteria andDinidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dinid >=", value, "dinid");
            return (Criteria) this;
        }

        public Criteria andDinidLessThan(Integer value) {
            addCriterion("dinid <", value, "dinid");
            return (Criteria) this;
        }

        public Criteria andDinidLessThanOrEqualTo(Integer value) {
            addCriterion("dinid <=", value, "dinid");
            return (Criteria) this;
        }

        public Criteria andDinidIn(List<Integer> values) {
            addCriterion("dinid in", values, "dinid");
            return (Criteria) this;
        }

        public Criteria andDinidNotIn(List<Integer> values) {
            addCriterion("dinid not in", values, "dinid");
            return (Criteria) this;
        }

        public Criteria andDinidBetween(Integer value1, Integer value2) {
            addCriterion("dinid between", value1, value2, "dinid");
            return (Criteria) this;
        }

        public Criteria andDinidNotBetween(Integer value1, Integer value2) {
            addCriterion("dinid not between", value1, value2, "dinid");
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

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andDindateIsNull() {
            addCriterion("dindate is null");
            return (Criteria) this;
        }

        public Criteria andDindateIsNotNull() {
            addCriterion("dindate is not null");
            return (Criteria) this;
        }

        public Criteria andDindateEqualTo(String value) {
            addCriterion("dindate =", value, "dindate");
            return (Criteria) this;
        }

        public Criteria andDindateNotEqualTo(String value) {
            addCriterion("dindate <>", value, "dindate");
            return (Criteria) this;
        }

        public Criteria andDindateGreaterThan(String value) {
            addCriterion("dindate >", value, "dindate");
            return (Criteria) this;
        }

        public Criteria andDindateGreaterThanOrEqualTo(String value) {
            addCriterion("dindate >=", value, "dindate");
            return (Criteria) this;
        }

        public Criteria andDindateLessThan(String value) {
            addCriterion("dindate <", value, "dindate");
            return (Criteria) this;
        }

        public Criteria andDindateLessThanOrEqualTo(String value) {
            addCriterion("dindate <=", value, "dindate");
            return (Criteria) this;
        }

        public Criteria andDindateLike(String value) {
            addCriterion("dindate like", value, "dindate");
            return (Criteria) this;
        }

        public Criteria andDindateNotLike(String value) {
            addCriterion("dindate not like", value, "dindate");
            return (Criteria) this;
        }

        public Criteria andDindateIn(List<String> values) {
            addCriterion("dindate in", values, "dindate");
            return (Criteria) this;
        }

        public Criteria andDindateNotIn(List<String> values) {
            addCriterion("dindate not in", values, "dindate");
            return (Criteria) this;
        }

        public Criteria andDindateBetween(String value1, String value2) {
            addCriterion("dindate between", value1, value2, "dindate");
            return (Criteria) this;
        }

        public Criteria andDindateNotBetween(String value1, String value2) {
            addCriterion("dindate not between", value1, value2, "dindate");
            return (Criteria) this;
        }

        public Criteria andDincauseIsNull() {
            addCriterion("dincause is null");
            return (Criteria) this;
        }

        public Criteria andDincauseIsNotNull() {
            addCriterion("dincause is not null");
            return (Criteria) this;
        }

        public Criteria andDincauseEqualTo(String value) {
            addCriterion("dincause =", value, "dincause");
            return (Criteria) this;
        }

        public Criteria andDincauseNotEqualTo(String value) {
            addCriterion("dincause <>", value, "dincause");
            return (Criteria) this;
        }

        public Criteria andDincauseGreaterThan(String value) {
            addCriterion("dincause >", value, "dincause");
            return (Criteria) this;
        }

        public Criteria andDincauseGreaterThanOrEqualTo(String value) {
            addCriterion("dincause >=", value, "dincause");
            return (Criteria) this;
        }

        public Criteria andDincauseLessThan(String value) {
            addCriterion("dincause <", value, "dincause");
            return (Criteria) this;
        }

        public Criteria andDincauseLessThanOrEqualTo(String value) {
            addCriterion("dincause <=", value, "dincause");
            return (Criteria) this;
        }

        public Criteria andDincauseLike(String value) {
            addCriterion("dincause like", value, "dincause");
            return (Criteria) this;
        }

        public Criteria andDincauseNotLike(String value) {
            addCriterion("dincause not like", value, "dincause");
            return (Criteria) this;
        }

        public Criteria andDincauseIn(List<String> values) {
            addCriterion("dincause in", values, "dincause");
            return (Criteria) this;
        }

        public Criteria andDincauseNotIn(List<String> values) {
            addCriterion("dincause not in", values, "dincause");
            return (Criteria) this;
        }

        public Criteria andDincauseBetween(String value1, String value2) {
            addCriterion("dincause between", value1, value2, "dincause");
            return (Criteria) this;
        }

        public Criteria andDincauseNotBetween(String value1, String value2) {
            addCriterion("dincause not between", value1, value2, "dincause");
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