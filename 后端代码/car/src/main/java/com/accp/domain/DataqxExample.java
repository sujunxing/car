package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class DataqxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataqxExample() {
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

        public Criteria andDaxidIsNull() {
            addCriterion("daxid is null");
            return (Criteria) this;
        }

        public Criteria andDaxidIsNotNull() {
            addCriterion("daxid is not null");
            return (Criteria) this;
        }

        public Criteria andDaxidEqualTo(Integer value) {
            addCriterion("daxid =", value, "daxid");
            return (Criteria) this;
        }

        public Criteria andDaxidNotEqualTo(Integer value) {
            addCriterion("daxid <>", value, "daxid");
            return (Criteria) this;
        }

        public Criteria andDaxidGreaterThan(Integer value) {
            addCriterion("daxid >", value, "daxid");
            return (Criteria) this;
        }

        public Criteria andDaxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("daxid >=", value, "daxid");
            return (Criteria) this;
        }

        public Criteria andDaxidLessThan(Integer value) {
            addCriterion("daxid <", value, "daxid");
            return (Criteria) this;
        }

        public Criteria andDaxidLessThanOrEqualTo(Integer value) {
            addCriterion("daxid <=", value, "daxid");
            return (Criteria) this;
        }

        public Criteria andDaxidIn(List<Integer> values) {
            addCriterion("daxid in", values, "daxid");
            return (Criteria) this;
        }

        public Criteria andDaxidNotIn(List<Integer> values) {
            addCriterion("daxid not in", values, "daxid");
            return (Criteria) this;
        }

        public Criteria andDaxidBetween(Integer value1, Integer value2) {
            addCriterion("daxid between", value1, value2, "daxid");
            return (Criteria) this;
        }

        public Criteria andDaxidNotBetween(Integer value1, Integer value2) {
            addCriterion("daxid not between", value1, value2, "daxid");
            return (Criteria) this;
        }

        public Criteria andDaxnameIsNull() {
            addCriterion("daxname is null");
            return (Criteria) this;
        }

        public Criteria andDaxnameIsNotNull() {
            addCriterion("daxname is not null");
            return (Criteria) this;
        }

        public Criteria andDaxnameEqualTo(String value) {
            addCriterion("daxname =", value, "daxname");
            return (Criteria) this;
        }

        public Criteria andDaxnameNotEqualTo(String value) {
            addCriterion("daxname <>", value, "daxname");
            return (Criteria) this;
        }

        public Criteria andDaxnameGreaterThan(String value) {
            addCriterion("daxname >", value, "daxname");
            return (Criteria) this;
        }

        public Criteria andDaxnameGreaterThanOrEqualTo(String value) {
            addCriterion("daxname >=", value, "daxname");
            return (Criteria) this;
        }

        public Criteria andDaxnameLessThan(String value) {
            addCriterion("daxname <", value, "daxname");
            return (Criteria) this;
        }

        public Criteria andDaxnameLessThanOrEqualTo(String value) {
            addCriterion("daxname <=", value, "daxname");
            return (Criteria) this;
        }

        public Criteria andDaxnameLike(String value) {
            addCriterion("daxname like", value, "daxname");
            return (Criteria) this;
        }

        public Criteria andDaxnameNotLike(String value) {
            addCriterion("daxname not like", value, "daxname");
            return (Criteria) this;
        }

        public Criteria andDaxnameIn(List<String> values) {
            addCriterion("daxname in", values, "daxname");
            return (Criteria) this;
        }

        public Criteria andDaxnameNotIn(List<String> values) {
            addCriterion("daxname not in", values, "daxname");
            return (Criteria) this;
        }

        public Criteria andDaxnameBetween(String value1, String value2) {
            addCriterion("daxname between", value1, value2, "daxname");
            return (Criteria) this;
        }

        public Criteria andDaxnameNotBetween(String value1, String value2) {
            addCriterion("daxname not between", value1, value2, "daxname");
            return (Criteria) this;
        }

        public Criteria andDaxtypeIsNull() {
            addCriterion("daxtype is null");
            return (Criteria) this;
        }

        public Criteria andDaxtypeIsNotNull() {
            addCriterion("daxtype is not null");
            return (Criteria) this;
        }

        public Criteria andDaxtypeEqualTo(Integer value) {
            addCriterion("daxtype =", value, "daxtype");
            return (Criteria) this;
        }

        public Criteria andDaxtypeNotEqualTo(Integer value) {
            addCriterion("daxtype <>", value, "daxtype");
            return (Criteria) this;
        }

        public Criteria andDaxtypeGreaterThan(Integer value) {
            addCriterion("daxtype >", value, "daxtype");
            return (Criteria) this;
        }

        public Criteria andDaxtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("daxtype >=", value, "daxtype");
            return (Criteria) this;
        }

        public Criteria andDaxtypeLessThan(Integer value) {
            addCriterion("daxtype <", value, "daxtype");
            return (Criteria) this;
        }

        public Criteria andDaxtypeLessThanOrEqualTo(Integer value) {
            addCriterion("daxtype <=", value, "daxtype");
            return (Criteria) this;
        }

        public Criteria andDaxtypeIn(List<Integer> values) {
            addCriterion("daxtype in", values, "daxtype");
            return (Criteria) this;
        }

        public Criteria andDaxtypeNotIn(List<Integer> values) {
            addCriterion("daxtype not in", values, "daxtype");
            return (Criteria) this;
        }

        public Criteria andDaxtypeBetween(Integer value1, Integer value2) {
            addCriterion("daxtype between", value1, value2, "daxtype");
            return (Criteria) this;
        }

        public Criteria andDaxtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("daxtype not between", value1, value2, "daxtype");
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