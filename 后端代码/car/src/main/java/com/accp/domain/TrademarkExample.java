package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class TrademarkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrademarkExample() {
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

        public Criteria andTrkidIsNull() {
            addCriterion("trkid is null");
            return (Criteria) this;
        }

        public Criteria andTrkidIsNotNull() {
            addCriterion("trkid is not null");
            return (Criteria) this;
        }

        public Criteria andTrkidEqualTo(String value) {
            addCriterion("trkid =", value, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidNotEqualTo(String value) {
            addCriterion("trkid <>", value, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidGreaterThan(String value) {
            addCriterion("trkid >", value, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidGreaterThanOrEqualTo(String value) {
            addCriterion("trkid >=", value, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidLessThan(String value) {
            addCriterion("trkid <", value, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidLessThanOrEqualTo(String value) {
            addCriterion("trkid <=", value, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidLike(String value) {
            addCriterion("trkid like", value, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidNotLike(String value) {
            addCriterion("trkid not like", value, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidIn(List<String> values) {
            addCriterion("trkid in", values, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidNotIn(List<String> values) {
            addCriterion("trkid not in", values, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidBetween(String value1, String value2) {
            addCriterion("trkid between", value1, value2, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrkidNotBetween(String value1, String value2) {
            addCriterion("trkid not between", value1, value2, "trkid");
            return (Criteria) this;
        }

        public Criteria andTrknameIsNull() {
            addCriterion("trkname is null");
            return (Criteria) this;
        }

        public Criteria andTrknameIsNotNull() {
            addCriterion("trkname is not null");
            return (Criteria) this;
        }

        public Criteria andTrknameEqualTo(String value) {
            addCriterion("trkname =", value, "trkname");
            return (Criteria) this;
        }

        public Criteria andTrknameNotEqualTo(String value) {
            addCriterion("trkname <>", value, "trkname");
            return (Criteria) this;
        }

        public Criteria andTrknameGreaterThan(String value) {
            addCriterion("trkname >", value, "trkname");
            return (Criteria) this;
        }

        public Criteria andTrknameGreaterThanOrEqualTo(String value) {
            addCriterion("trkname >=", value, "trkname");
            return (Criteria) this;
        }

        public Criteria andTrknameLessThan(String value) {
            addCriterion("trkname <", value, "trkname");
            return (Criteria) this;
        }

        public Criteria andTrknameLessThanOrEqualTo(String value) {
            addCriterion("trkname <=", value, "trkname");
            return (Criteria) this;
        }

        public Criteria andTrknameLike(String value) {
            addCriterion("trkname like", value, "trkname");
            return (Criteria) this;
        }

        public Criteria andTrknameNotLike(String value) {
            addCriterion("trkname not like", value, "trkname");
            return (Criteria) this;
        }

        public Criteria andTrknameIn(List<String> values) {
            addCriterion("trkname in", values, "trkname");
            return (Criteria) this;
        }

        public Criteria andTrknameNotIn(List<String> values) {
            addCriterion("trkname not in", values, "trkname");
            return (Criteria) this;
        }

        public Criteria andTrknameBetween(String value1, String value2) {
            addCriterion("trkname between", value1, value2, "trkname");
            return (Criteria) this;
        }

        public Criteria andTrknameNotBetween(String value1, String value2) {
            addCriterion("trkname not between", value1, value2, "trkname");
            return (Criteria) this;
        }

        public Criteria andTrkzimuIsNull() {
            addCriterion("trkzimu is null");
            return (Criteria) this;
        }

        public Criteria andTrkzimuIsNotNull() {
            addCriterion("trkzimu is not null");
            return (Criteria) this;
        }

        public Criteria andTrkzimuEqualTo(String value) {
            addCriterion("trkzimu =", value, "trkzimu");
            return (Criteria) this;
        }

        public Criteria andTrkzimuNotEqualTo(String value) {
            addCriterion("trkzimu <>", value, "trkzimu");
            return (Criteria) this;
        }

        public Criteria andTrkzimuGreaterThan(String value) {
            addCriterion("trkzimu >", value, "trkzimu");
            return (Criteria) this;
        }

        public Criteria andTrkzimuGreaterThanOrEqualTo(String value) {
            addCriterion("trkzimu >=", value, "trkzimu");
            return (Criteria) this;
        }

        public Criteria andTrkzimuLessThan(String value) {
            addCriterion("trkzimu <", value, "trkzimu");
            return (Criteria) this;
        }

        public Criteria andTrkzimuLessThanOrEqualTo(String value) {
            addCriterion("trkzimu <=", value, "trkzimu");
            return (Criteria) this;
        }

        public Criteria andTrkzimuLike(String value) {
            addCriterion("trkzimu like", value, "trkzimu");
            return (Criteria) this;
        }

        public Criteria andTrkzimuNotLike(String value) {
            addCriterion("trkzimu not like", value, "trkzimu");
            return (Criteria) this;
        }

        public Criteria andTrkzimuIn(List<String> values) {
            addCriterion("trkzimu in", values, "trkzimu");
            return (Criteria) this;
        }

        public Criteria andTrkzimuNotIn(List<String> values) {
            addCriterion("trkzimu not in", values, "trkzimu");
            return (Criteria) this;
        }

        public Criteria andTrkzimuBetween(String value1, String value2) {
            addCriterion("trkzimu between", value1, value2, "trkzimu");
            return (Criteria) this;
        }

        public Criteria andTrkzimuNotBetween(String value1, String value2) {
            addCriterion("trkzimu not between", value1, value2, "trkzimu");
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