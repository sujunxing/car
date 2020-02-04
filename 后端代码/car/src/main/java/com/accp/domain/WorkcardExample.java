package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class WorkcardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkcardExample() {
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

        public Criteria andWodidIsNull() {
            addCriterion("wodid is null");
            return (Criteria) this;
        }

        public Criteria andWodidIsNotNull() {
            addCriterion("wodid is not null");
            return (Criteria) this;
        }

        public Criteria andWodidEqualTo(Integer value) {
            addCriterion("wodid =", value, "wodid");
            return (Criteria) this;
        }

        public Criteria andWodidNotEqualTo(Integer value) {
            addCriterion("wodid <>", value, "wodid");
            return (Criteria) this;
        }

        public Criteria andWodidGreaterThan(Integer value) {
            addCriterion("wodid >", value, "wodid");
            return (Criteria) this;
        }

        public Criteria andWodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wodid >=", value, "wodid");
            return (Criteria) this;
        }

        public Criteria andWodidLessThan(Integer value) {
            addCriterion("wodid <", value, "wodid");
            return (Criteria) this;
        }

        public Criteria andWodidLessThanOrEqualTo(Integer value) {
            addCriterion("wodid <=", value, "wodid");
            return (Criteria) this;
        }

        public Criteria andWodidIn(List<Integer> values) {
            addCriterion("wodid in", values, "wodid");
            return (Criteria) this;
        }

        public Criteria andWodidNotIn(List<Integer> values) {
            addCriterion("wodid not in", values, "wodid");
            return (Criteria) this;
        }

        public Criteria andWodidBetween(Integer value1, Integer value2) {
            addCriterion("wodid between", value1, value2, "wodid");
            return (Criteria) this;
        }

        public Criteria andWodidNotBetween(Integer value1, Integer value2) {
            addCriterion("wodid not between", value1, value2, "wodid");
            return (Criteria) this;
        }

        public Criteria andWodlicenseIsNull() {
            addCriterion("wodlicense is null");
            return (Criteria) this;
        }

        public Criteria andWodlicenseIsNotNull() {
            addCriterion("wodlicense is not null");
            return (Criteria) this;
        }

        public Criteria andWodlicenseEqualTo(String value) {
            addCriterion("wodlicense =", value, "wodlicense");
            return (Criteria) this;
        }

        public Criteria andWodlicenseNotEqualTo(String value) {
            addCriterion("wodlicense <>", value, "wodlicense");
            return (Criteria) this;
        }

        public Criteria andWodlicenseGreaterThan(String value) {
            addCriterion("wodlicense >", value, "wodlicense");
            return (Criteria) this;
        }

        public Criteria andWodlicenseGreaterThanOrEqualTo(String value) {
            addCriterion("wodlicense >=", value, "wodlicense");
            return (Criteria) this;
        }

        public Criteria andWodlicenseLessThan(String value) {
            addCriterion("wodlicense <", value, "wodlicense");
            return (Criteria) this;
        }

        public Criteria andWodlicenseLessThanOrEqualTo(String value) {
            addCriterion("wodlicense <=", value, "wodlicense");
            return (Criteria) this;
        }

        public Criteria andWodlicenseLike(String value) {
            addCriterion("wodlicense like", value, "wodlicense");
            return (Criteria) this;
        }

        public Criteria andWodlicenseNotLike(String value) {
            addCriterion("wodlicense not like", value, "wodlicense");
            return (Criteria) this;
        }

        public Criteria andWodlicenseIn(List<String> values) {
            addCriterion("wodlicense in", values, "wodlicense");
            return (Criteria) this;
        }

        public Criteria andWodlicenseNotIn(List<String> values) {
            addCriterion("wodlicense not in", values, "wodlicense");
            return (Criteria) this;
        }

        public Criteria andWodlicenseBetween(String value1, String value2) {
            addCriterion("wodlicense between", value1, value2, "wodlicense");
            return (Criteria) this;
        }

        public Criteria andWodlicenseNotBetween(String value1, String value2) {
            addCriterion("wodlicense not between", value1, value2, "wodlicense");
            return (Criteria) this;
        }

        public Criteria andWodbrandIsNull() {
            addCriterion("wodbrand is null");
            return (Criteria) this;
        }

        public Criteria andWodbrandIsNotNull() {
            addCriterion("wodbrand is not null");
            return (Criteria) this;
        }

        public Criteria andWodbrandEqualTo(String value) {
            addCriterion("wodbrand =", value, "wodbrand");
            return (Criteria) this;
        }

        public Criteria andWodbrandNotEqualTo(String value) {
            addCriterion("wodbrand <>", value, "wodbrand");
            return (Criteria) this;
        }

        public Criteria andWodbrandGreaterThan(String value) {
            addCriterion("wodbrand >", value, "wodbrand");
            return (Criteria) this;
        }

        public Criteria andWodbrandGreaterThanOrEqualTo(String value) {
            addCriterion("wodbrand >=", value, "wodbrand");
            return (Criteria) this;
        }

        public Criteria andWodbrandLessThan(String value) {
            addCriterion("wodbrand <", value, "wodbrand");
            return (Criteria) this;
        }

        public Criteria andWodbrandLessThanOrEqualTo(String value) {
            addCriterion("wodbrand <=", value, "wodbrand");
            return (Criteria) this;
        }

        public Criteria andWodbrandLike(String value) {
            addCriterion("wodbrand like", value, "wodbrand");
            return (Criteria) this;
        }

        public Criteria andWodbrandNotLike(String value) {
            addCriterion("wodbrand not like", value, "wodbrand");
            return (Criteria) this;
        }

        public Criteria andWodbrandIn(List<String> values) {
            addCriterion("wodbrand in", values, "wodbrand");
            return (Criteria) this;
        }

        public Criteria andWodbrandNotIn(List<String> values) {
            addCriterion("wodbrand not in", values, "wodbrand");
            return (Criteria) this;
        }

        public Criteria andWodbrandBetween(String value1, String value2) {
            addCriterion("wodbrand between", value1, value2, "wodbrand");
            return (Criteria) this;
        }

        public Criteria andWodbrandNotBetween(String value1, String value2) {
            addCriterion("wodbrand not between", value1, value2, "wodbrand");
            return (Criteria) this;
        }

        public Criteria andWodtypeIsNull() {
            addCriterion("wodtype is null");
            return (Criteria) this;
        }

        public Criteria andWodtypeIsNotNull() {
            addCriterion("wodtype is not null");
            return (Criteria) this;
        }

        public Criteria andWodtypeEqualTo(String value) {
            addCriterion("wodtype =", value, "wodtype");
            return (Criteria) this;
        }

        public Criteria andWodtypeNotEqualTo(String value) {
            addCriterion("wodtype <>", value, "wodtype");
            return (Criteria) this;
        }

        public Criteria andWodtypeGreaterThan(String value) {
            addCriterion("wodtype >", value, "wodtype");
            return (Criteria) this;
        }

        public Criteria andWodtypeGreaterThanOrEqualTo(String value) {
            addCriterion("wodtype >=", value, "wodtype");
            return (Criteria) this;
        }

        public Criteria andWodtypeLessThan(String value) {
            addCriterion("wodtype <", value, "wodtype");
            return (Criteria) this;
        }

        public Criteria andWodtypeLessThanOrEqualTo(String value) {
            addCriterion("wodtype <=", value, "wodtype");
            return (Criteria) this;
        }

        public Criteria andWodtypeLike(String value) {
            addCriterion("wodtype like", value, "wodtype");
            return (Criteria) this;
        }

        public Criteria andWodtypeNotLike(String value) {
            addCriterion("wodtype not like", value, "wodtype");
            return (Criteria) this;
        }

        public Criteria andWodtypeIn(List<String> values) {
            addCriterion("wodtype in", values, "wodtype");
            return (Criteria) this;
        }

        public Criteria andWodtypeNotIn(List<String> values) {
            addCriterion("wodtype not in", values, "wodtype");
            return (Criteria) this;
        }

        public Criteria andWodtypeBetween(String value1, String value2) {
            addCriterion("wodtype between", value1, value2, "wodtype");
            return (Criteria) this;
        }

        public Criteria andWodtypeNotBetween(String value1, String value2) {
            addCriterion("wodtype not between", value1, value2, "wodtype");
            return (Criteria) this;
        }

        public Criteria andWodmileageIsNull() {
            addCriterion("wodmileage is null");
            return (Criteria) this;
        }

        public Criteria andWodmileageIsNotNull() {
            addCriterion("wodmileage is not null");
            return (Criteria) this;
        }

        public Criteria andWodmileageEqualTo(Integer value) {
            addCriterion("wodmileage =", value, "wodmileage");
            return (Criteria) this;
        }

        public Criteria andWodmileageNotEqualTo(Integer value) {
            addCriterion("wodmileage <>", value, "wodmileage");
            return (Criteria) this;
        }

        public Criteria andWodmileageGreaterThan(Integer value) {
            addCriterion("wodmileage >", value, "wodmileage");
            return (Criteria) this;
        }

        public Criteria andWodmileageGreaterThanOrEqualTo(Integer value) {
            addCriterion("wodmileage >=", value, "wodmileage");
            return (Criteria) this;
        }

        public Criteria andWodmileageLessThan(Integer value) {
            addCriterion("wodmileage <", value, "wodmileage");
            return (Criteria) this;
        }

        public Criteria andWodmileageLessThanOrEqualTo(Integer value) {
            addCriterion("wodmileage <=", value, "wodmileage");
            return (Criteria) this;
        }

        public Criteria andWodmileageIn(List<Integer> values) {
            addCriterion("wodmileage in", values, "wodmileage");
            return (Criteria) this;
        }

        public Criteria andWodmileageNotIn(List<Integer> values) {
            addCriterion("wodmileage not in", values, "wodmileage");
            return (Criteria) this;
        }

        public Criteria andWodmileageBetween(Integer value1, Integer value2) {
            addCriterion("wodmileage between", value1, value2, "wodmileage");
            return (Criteria) this;
        }

        public Criteria andWodmileageNotBetween(Integer value1, Integer value2) {
            addCriterion("wodmileage not between", value1, value2, "wodmileage");
            return (Criteria) this;
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