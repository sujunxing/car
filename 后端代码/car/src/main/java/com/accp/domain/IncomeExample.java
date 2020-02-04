package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class IncomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IncomeExample() {
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

        public Criteria andIneidIsNull() {
            addCriterion("ineid is null");
            return (Criteria) this;
        }

        public Criteria andIneidIsNotNull() {
            addCriterion("ineid is not null");
            return (Criteria) this;
        }

        public Criteria andIneidEqualTo(Integer value) {
            addCriterion("ineid =", value, "ineid");
            return (Criteria) this;
        }

        public Criteria andIneidNotEqualTo(Integer value) {
            addCriterion("ineid <>", value, "ineid");
            return (Criteria) this;
        }

        public Criteria andIneidGreaterThan(Integer value) {
            addCriterion("ineid >", value, "ineid");
            return (Criteria) this;
        }

        public Criteria andIneidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ineid >=", value, "ineid");
            return (Criteria) this;
        }

        public Criteria andIneidLessThan(Integer value) {
            addCriterion("ineid <", value, "ineid");
            return (Criteria) this;
        }

        public Criteria andIneidLessThanOrEqualTo(Integer value) {
            addCriterion("ineid <=", value, "ineid");
            return (Criteria) this;
        }

        public Criteria andIneidIn(List<Integer> values) {
            addCriterion("ineid in", values, "ineid");
            return (Criteria) this;
        }

        public Criteria andIneidNotIn(List<Integer> values) {
            addCriterion("ineid not in", values, "ineid");
            return (Criteria) this;
        }

        public Criteria andIneidBetween(Integer value1, Integer value2) {
            addCriterion("ineid between", value1, value2, "ineid");
            return (Criteria) this;
        }

        public Criteria andIneidNotBetween(Integer value1, Integer value2) {
            addCriterion("ineid not between", value1, value2, "ineid");
            return (Criteria) this;
        }

        public Criteria andInenameIsNull() {
            addCriterion("inename is null");
            return (Criteria) this;
        }

        public Criteria andInenameIsNotNull() {
            addCriterion("inename is not null");
            return (Criteria) this;
        }

        public Criteria andInenameEqualTo(String value) {
            addCriterion("inename =", value, "inename");
            return (Criteria) this;
        }

        public Criteria andInenameNotEqualTo(String value) {
            addCriterion("inename <>", value, "inename");
            return (Criteria) this;
        }

        public Criteria andInenameGreaterThan(String value) {
            addCriterion("inename >", value, "inename");
            return (Criteria) this;
        }

        public Criteria andInenameGreaterThanOrEqualTo(String value) {
            addCriterion("inename >=", value, "inename");
            return (Criteria) this;
        }

        public Criteria andInenameLessThan(String value) {
            addCriterion("inename <", value, "inename");
            return (Criteria) this;
        }

        public Criteria andInenameLessThanOrEqualTo(String value) {
            addCriterion("inename <=", value, "inename");
            return (Criteria) this;
        }

        public Criteria andInenameLike(String value) {
            addCriterion("inename like", value, "inename");
            return (Criteria) this;
        }

        public Criteria andInenameNotLike(String value) {
            addCriterion("inename not like", value, "inename");
            return (Criteria) this;
        }

        public Criteria andInenameIn(List<String> values) {
            addCriterion("inename in", values, "inename");
            return (Criteria) this;
        }

        public Criteria andInenameNotIn(List<String> values) {
            addCriterion("inename not in", values, "inename");
            return (Criteria) this;
        }

        public Criteria andInenameBetween(String value1, String value2) {
            addCriterion("inename between", value1, value2, "inename");
            return (Criteria) this;
        }

        public Criteria andInenameNotBetween(String value1, String value2) {
            addCriterion("inename not between", value1, value2, "inename");
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