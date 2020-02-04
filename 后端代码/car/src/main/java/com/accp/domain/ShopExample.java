package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andShpidIsNull() {
            addCriterion("shpid is null");
            return (Criteria) this;
        }

        public Criteria andShpidIsNotNull() {
            addCriterion("shpid is not null");
            return (Criteria) this;
        }

        public Criteria andShpidEqualTo(Integer value) {
            addCriterion("shpid =", value, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpidNotEqualTo(Integer value) {
            addCriterion("shpid <>", value, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpidGreaterThan(Integer value) {
            addCriterion("shpid >", value, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shpid >=", value, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpidLessThan(Integer value) {
            addCriterion("shpid <", value, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpidLessThanOrEqualTo(Integer value) {
            addCriterion("shpid <=", value, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpidIn(List<Integer> values) {
            addCriterion("shpid in", values, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpidNotIn(List<Integer> values) {
            addCriterion("shpid not in", values, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpidBetween(Integer value1, Integer value2) {
            addCriterion("shpid between", value1, value2, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpidNotBetween(Integer value1, Integer value2) {
            addCriterion("shpid not between", value1, value2, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpnameIsNull() {
            addCriterion("shpname is null");
            return (Criteria) this;
        }

        public Criteria andShpnameIsNotNull() {
            addCriterion("shpname is not null");
            return (Criteria) this;
        }

        public Criteria andShpnameEqualTo(String value) {
            addCriterion("shpname =", value, "shpname");
            return (Criteria) this;
        }

        public Criteria andShpnameNotEqualTo(String value) {
            addCriterion("shpname <>", value, "shpname");
            return (Criteria) this;
        }

        public Criteria andShpnameGreaterThan(String value) {
            addCriterion("shpname >", value, "shpname");
            return (Criteria) this;
        }

        public Criteria andShpnameGreaterThanOrEqualTo(String value) {
            addCriterion("shpname >=", value, "shpname");
            return (Criteria) this;
        }

        public Criteria andShpnameLessThan(String value) {
            addCriterion("shpname <", value, "shpname");
            return (Criteria) this;
        }

        public Criteria andShpnameLessThanOrEqualTo(String value) {
            addCriterion("shpname <=", value, "shpname");
            return (Criteria) this;
        }

        public Criteria andShpnameLike(String value) {
            addCriterion("shpname like", value, "shpname");
            return (Criteria) this;
        }

        public Criteria andShpnameNotLike(String value) {
            addCriterion("shpname not like", value, "shpname");
            return (Criteria) this;
        }

        public Criteria andShpnameIn(List<String> values) {
            addCriterion("shpname in", values, "shpname");
            return (Criteria) this;
        }

        public Criteria andShpnameNotIn(List<String> values) {
            addCriterion("shpname not in", values, "shpname");
            return (Criteria) this;
        }

        public Criteria andShpnameBetween(String value1, String value2) {
            addCriterion("shpname between", value1, value2, "shpname");
            return (Criteria) this;
        }

        public Criteria andShpnameNotBetween(String value1, String value2) {
            addCriterion("shpname not between", value1, value2, "shpname");
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