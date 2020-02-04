package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ManufacturertypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManufacturertypeExample() {
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

        public Criteria andMaeidIsNull() {
            addCriterion("maeid is null");
            return (Criteria) this;
        }

        public Criteria andMaeidIsNotNull() {
            addCriterion("maeid is not null");
            return (Criteria) this;
        }

        public Criteria andMaeidEqualTo(Integer value) {
            addCriterion("maeid =", value, "maeid");
            return (Criteria) this;
        }

        public Criteria andMaeidNotEqualTo(Integer value) {
            addCriterion("maeid <>", value, "maeid");
            return (Criteria) this;
        }

        public Criteria andMaeidGreaterThan(Integer value) {
            addCriterion("maeid >", value, "maeid");
            return (Criteria) this;
        }

        public Criteria andMaeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("maeid >=", value, "maeid");
            return (Criteria) this;
        }

        public Criteria andMaeidLessThan(Integer value) {
            addCriterion("maeid <", value, "maeid");
            return (Criteria) this;
        }

        public Criteria andMaeidLessThanOrEqualTo(Integer value) {
            addCriterion("maeid <=", value, "maeid");
            return (Criteria) this;
        }

        public Criteria andMaeidIn(List<Integer> values) {
            addCriterion("maeid in", values, "maeid");
            return (Criteria) this;
        }

        public Criteria andMaeidNotIn(List<Integer> values) {
            addCriterion("maeid not in", values, "maeid");
            return (Criteria) this;
        }

        public Criteria andMaeidBetween(Integer value1, Integer value2) {
            addCriterion("maeid between", value1, value2, "maeid");
            return (Criteria) this;
        }

        public Criteria andMaeidNotBetween(Integer value1, Integer value2) {
            addCriterion("maeid not between", value1, value2, "maeid");
            return (Criteria) this;
        }

        public Criteria andMaenameIsNull() {
            addCriterion("maename is null");
            return (Criteria) this;
        }

        public Criteria andMaenameIsNotNull() {
            addCriterion("maename is not null");
            return (Criteria) this;
        }

        public Criteria andMaenameEqualTo(String value) {
            addCriterion("maename =", value, "maename");
            return (Criteria) this;
        }

        public Criteria andMaenameNotEqualTo(String value) {
            addCriterion("maename <>", value, "maename");
            return (Criteria) this;
        }

        public Criteria andMaenameGreaterThan(String value) {
            addCriterion("maename >", value, "maename");
            return (Criteria) this;
        }

        public Criteria andMaenameGreaterThanOrEqualTo(String value) {
            addCriterion("maename >=", value, "maename");
            return (Criteria) this;
        }

        public Criteria andMaenameLessThan(String value) {
            addCriterion("maename <", value, "maename");
            return (Criteria) this;
        }

        public Criteria andMaenameLessThanOrEqualTo(String value) {
            addCriterion("maename <=", value, "maename");
            return (Criteria) this;
        }

        public Criteria andMaenameLike(String value) {
            addCriterion("maename like", value, "maename");
            return (Criteria) this;
        }

        public Criteria andMaenameNotLike(String value) {
            addCriterion("maename not like", value, "maename");
            return (Criteria) this;
        }

        public Criteria andMaenameIn(List<String> values) {
            addCriterion("maename in", values, "maename");
            return (Criteria) this;
        }

        public Criteria andMaenameNotIn(List<String> values) {
            addCriterion("maename not in", values, "maename");
            return (Criteria) this;
        }

        public Criteria andMaenameBetween(String value1, String value2) {
            addCriterion("maename between", value1, value2, "maename");
            return (Criteria) this;
        }

        public Criteria andMaenameNotBetween(String value1, String value2) {
            addCriterion("maename not between", value1, value2, "maename");
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