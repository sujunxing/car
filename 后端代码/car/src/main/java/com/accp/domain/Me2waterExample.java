package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class Me2waterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Me2waterExample() {
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

        public Criteria andMe2wateridIsNull() {
            addCriterion("me2waterid is null");
            return (Criteria) this;
        }

        public Criteria andMe2wateridIsNotNull() {
            addCriterion("me2waterid is not null");
            return (Criteria) this;
        }

        public Criteria andMe2wateridEqualTo(Integer value) {
            addCriterion("me2waterid =", value, "me2waterid");
            return (Criteria) this;
        }

        public Criteria andMe2wateridNotEqualTo(Integer value) {
            addCriterion("me2waterid <>", value, "me2waterid");
            return (Criteria) this;
        }

        public Criteria andMe2wateridGreaterThan(Integer value) {
            addCriterion("me2waterid >", value, "me2waterid");
            return (Criteria) this;
        }

        public Criteria andMe2wateridGreaterThanOrEqualTo(Integer value) {
            addCriterion("me2waterid >=", value, "me2waterid");
            return (Criteria) this;
        }

        public Criteria andMe2wateridLessThan(Integer value) {
            addCriterion("me2waterid <", value, "me2waterid");
            return (Criteria) this;
        }

        public Criteria andMe2wateridLessThanOrEqualTo(Integer value) {
            addCriterion("me2waterid <=", value, "me2waterid");
            return (Criteria) this;
        }

        public Criteria andMe2wateridIn(List<Integer> values) {
            addCriterion("me2waterid in", values, "me2waterid");
            return (Criteria) this;
        }

        public Criteria andMe2wateridNotIn(List<Integer> values) {
            addCriterion("me2waterid not in", values, "me2waterid");
            return (Criteria) this;
        }

        public Criteria andMe2wateridBetween(Integer value1, Integer value2) {
            addCriterion("me2waterid between", value1, value2, "me2waterid");
            return (Criteria) this;
        }

        public Criteria andMe2wateridNotBetween(Integer value1, Integer value2) {
            addCriterion("me2waterid not between", value1, value2, "me2waterid");
            return (Criteria) this;
        }

        public Criteria andMe2beridIsNull() {
            addCriterion("me2berid is null");
            return (Criteria) this;
        }

        public Criteria andMe2beridIsNotNull() {
            addCriterion("me2berid is not null");
            return (Criteria) this;
        }

        public Criteria andMe2beridEqualTo(Integer value) {
            addCriterion("me2berid =", value, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridNotEqualTo(Integer value) {
            addCriterion("me2berid <>", value, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridGreaterThan(Integer value) {
            addCriterion("me2berid >", value, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridGreaterThanOrEqualTo(Integer value) {
            addCriterion("me2berid >=", value, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridLessThan(Integer value) {
            addCriterion("me2berid <", value, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridLessThanOrEqualTo(Integer value) {
            addCriterion("me2berid <=", value, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridIn(List<Integer> values) {
            addCriterion("me2berid in", values, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridNotIn(List<Integer> values) {
            addCriterion("me2berid not in", values, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridBetween(Integer value1, Integer value2) {
            addCriterion("me2berid between", value1, value2, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridNotBetween(Integer value1, Integer value2) {
            addCriterion("me2berid not between", value1, value2, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2ber1IsNull() {
            addCriterion("Me2ber1 is null");
            return (Criteria) this;
        }

        public Criteria andMe2ber1IsNotNull() {
            addCriterion("Me2ber1 is not null");
            return (Criteria) this;
        }

        public Criteria andMe2ber1EqualTo(String value) {
            addCriterion("Me2ber1 =", value, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber1NotEqualTo(String value) {
            addCriterion("Me2ber1 <>", value, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber1GreaterThan(String value) {
            addCriterion("Me2ber1 >", value, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber1GreaterThanOrEqualTo(String value) {
            addCriterion("Me2ber1 >=", value, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber1LessThan(String value) {
            addCriterion("Me2ber1 <", value, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber1LessThanOrEqualTo(String value) {
            addCriterion("Me2ber1 <=", value, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber1Like(String value) {
            addCriterion("Me2ber1 like", value, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber1NotLike(String value) {
            addCriterion("Me2ber1 not like", value, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber1In(List<String> values) {
            addCriterion("Me2ber1 in", values, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber1NotIn(List<String> values) {
            addCriterion("Me2ber1 not in", values, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber1Between(String value1, String value2) {
            addCriterion("Me2ber1 between", value1, value2, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber1NotBetween(String value1, String value2) {
            addCriterion("Me2ber1 not between", value1, value2, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber2IsNull() {
            addCriterion("Me2ber2 is null");
            return (Criteria) this;
        }

        public Criteria andMe2ber2IsNotNull() {
            addCriterion("Me2ber2 is not null");
            return (Criteria) this;
        }

        public Criteria andMe2ber2EqualTo(String value) {
            addCriterion("Me2ber2 =", value, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2NotEqualTo(String value) {
            addCriterion("Me2ber2 <>", value, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2GreaterThan(String value) {
            addCriterion("Me2ber2 >", value, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2GreaterThanOrEqualTo(String value) {
            addCriterion("Me2ber2 >=", value, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2LessThan(String value) {
            addCriterion("Me2ber2 <", value, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2LessThanOrEqualTo(String value) {
            addCriterion("Me2ber2 <=", value, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2Like(String value) {
            addCriterion("Me2ber2 like", value, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2NotLike(String value) {
            addCriterion("Me2ber2 not like", value, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2In(List<String> values) {
            addCriterion("Me2ber2 in", values, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2NotIn(List<String> values) {
            addCriterion("Me2ber2 not in", values, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2Between(String value1, String value2) {
            addCriterion("Me2ber2 between", value1, value2, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2NotBetween(String value1, String value2) {
            addCriterion("Me2ber2 not between", value1, value2, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber3IsNull() {
            addCriterion("Me2ber3 is null");
            return (Criteria) this;
        }

        public Criteria andMe2ber3IsNotNull() {
            addCriterion("Me2ber3 is not null");
            return (Criteria) this;
        }

        public Criteria andMe2ber3EqualTo(String value) {
            addCriterion("Me2ber3 =", value, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3NotEqualTo(String value) {
            addCriterion("Me2ber3 <>", value, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3GreaterThan(String value) {
            addCriterion("Me2ber3 >", value, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3GreaterThanOrEqualTo(String value) {
            addCriterion("Me2ber3 >=", value, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3LessThan(String value) {
            addCriterion("Me2ber3 <", value, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3LessThanOrEqualTo(String value) {
            addCriterion("Me2ber3 <=", value, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3Like(String value) {
            addCriterion("Me2ber3 like", value, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3NotLike(String value) {
            addCriterion("Me2ber3 not like", value, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3In(List<String> values) {
            addCriterion("Me2ber3 in", values, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3NotIn(List<String> values) {
            addCriterion("Me2ber3 not in", values, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3Between(String value1, String value2) {
            addCriterion("Me2ber3 between", value1, value2, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3NotBetween(String value1, String value2) {
            addCriterion("Me2ber3 not between", value1, value2, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber4IsNull() {
            addCriterion("Me2ber4 is null");
            return (Criteria) this;
        }

        public Criteria andMe2ber4IsNotNull() {
            addCriterion("Me2ber4 is not null");
            return (Criteria) this;
        }

        public Criteria andMe2ber4EqualTo(String value) {
            addCriterion("Me2ber4 =", value, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4NotEqualTo(String value) {
            addCriterion("Me2ber4 <>", value, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4GreaterThan(String value) {
            addCriterion("Me2ber4 >", value, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4GreaterThanOrEqualTo(String value) {
            addCriterion("Me2ber4 >=", value, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4LessThan(String value) {
            addCriterion("Me2ber4 <", value, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4LessThanOrEqualTo(String value) {
            addCriterion("Me2ber4 <=", value, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4Like(String value) {
            addCriterion("Me2ber4 like", value, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4NotLike(String value) {
            addCriterion("Me2ber4 not like", value, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4In(List<String> values) {
            addCriterion("Me2ber4 in", values, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4NotIn(List<String> values) {
            addCriterion("Me2ber4 not in", values, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4Between(String value1, String value2) {
            addCriterion("Me2ber4 between", value1, value2, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4NotBetween(String value1, String value2) {
            addCriterion("Me2ber4 not between", value1, value2, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber5IsNull() {
            addCriterion("Me2ber5 is null");
            return (Criteria) this;
        }

        public Criteria andMe2ber5IsNotNull() {
            addCriterion("Me2ber5 is not null");
            return (Criteria) this;
        }

        public Criteria andMe2ber5EqualTo(Float value) {
            addCriterion("Me2ber5 =", value, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber5NotEqualTo(Float value) {
            addCriterion("Me2ber5 <>", value, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber5GreaterThan(Float value) {
            addCriterion("Me2ber5 >", value, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber5GreaterThanOrEqualTo(Float value) {
            addCriterion("Me2ber5 >=", value, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber5LessThan(Float value) {
            addCriterion("Me2ber5 <", value, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber5LessThanOrEqualTo(Float value) {
            addCriterion("Me2ber5 <=", value, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber5In(List<Float> values) {
            addCriterion("Me2ber5 in", values, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber5NotIn(List<Float> values) {
            addCriterion("Me2ber5 not in", values, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber5Between(Float value1, Float value2) {
            addCriterion("Me2ber5 between", value1, value2, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber5NotBetween(Float value1, Float value2) {
            addCriterion("Me2ber5 not between", value1, value2, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber6IsNull() {
            addCriterion("Me2ber6 is null");
            return (Criteria) this;
        }

        public Criteria andMe2ber6IsNotNull() {
            addCriterion("Me2ber6 is not null");
            return (Criteria) this;
        }

        public Criteria andMe2ber6EqualTo(Integer value) {
            addCriterion("Me2ber6 =", value, "me2ber6");
            return (Criteria) this;
        }

        public Criteria andMe2ber6NotEqualTo(Integer value) {
            addCriterion("Me2ber6 <>", value, "me2ber6");
            return (Criteria) this;
        }

        public Criteria andMe2ber6GreaterThan(Integer value) {
            addCriterion("Me2ber6 >", value, "me2ber6");
            return (Criteria) this;
        }

        public Criteria andMe2ber6GreaterThanOrEqualTo(Integer value) {
            addCriterion("Me2ber6 >=", value, "me2ber6");
            return (Criteria) this;
        }

        public Criteria andMe2ber6LessThan(Integer value) {
            addCriterion("Me2ber6 <", value, "me2ber6");
            return (Criteria) this;
        }

        public Criteria andMe2ber6LessThanOrEqualTo(Integer value) {
            addCriterion("Me2ber6 <=", value, "me2ber6");
            return (Criteria) this;
        }

        public Criteria andMe2ber6In(List<Integer> values) {
            addCriterion("Me2ber6 in", values, "me2ber6");
            return (Criteria) this;
        }

        public Criteria andMe2ber6NotIn(List<Integer> values) {
            addCriterion("Me2ber6 not in", values, "me2ber6");
            return (Criteria) this;
        }

        public Criteria andMe2ber6Between(Integer value1, Integer value2) {
            addCriterion("Me2ber6 between", value1, value2, "me2ber6");
            return (Criteria) this;
        }

        public Criteria andMe2ber6NotBetween(Integer value1, Integer value2) {
            addCriterion("Me2ber6 not between", value1, value2, "me2ber6");
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