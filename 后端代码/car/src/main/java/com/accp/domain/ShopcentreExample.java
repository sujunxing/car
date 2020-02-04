package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ShopcentreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopcentreExample() {
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

        public Criteria andSheidIsNull() {
            addCriterion("sheid is null");
            return (Criteria) this;
        }

        public Criteria andSheidIsNotNull() {
            addCriterion("sheid is not null");
            return (Criteria) this;
        }

        public Criteria andSheidEqualTo(String value) {
            addCriterion("sheid =", value, "sheid");
            return (Criteria) this;
        }

        public Criteria andSheidNotEqualTo(String value) {
            addCriterion("sheid <>", value, "sheid");
            return (Criteria) this;
        }

        public Criteria andSheidGreaterThan(String value) {
            addCriterion("sheid >", value, "sheid");
            return (Criteria) this;
        }

        public Criteria andSheidGreaterThanOrEqualTo(String value) {
            addCriterion("sheid >=", value, "sheid");
            return (Criteria) this;
        }

        public Criteria andSheidLessThan(String value) {
            addCriterion("sheid <", value, "sheid");
            return (Criteria) this;
        }

        public Criteria andSheidLessThanOrEqualTo(String value) {
            addCriterion("sheid <=", value, "sheid");
            return (Criteria) this;
        }

        public Criteria andSheidLike(String value) {
            addCriterion("sheid like", value, "sheid");
            return (Criteria) this;
        }

        public Criteria andSheidNotLike(String value) {
            addCriterion("sheid not like", value, "sheid");
            return (Criteria) this;
        }

        public Criteria andSheidIn(List<String> values) {
            addCriterion("sheid in", values, "sheid");
            return (Criteria) this;
        }

        public Criteria andSheidNotIn(List<String> values) {
            addCriterion("sheid not in", values, "sheid");
            return (Criteria) this;
        }

        public Criteria andSheidBetween(String value1, String value2) {
            addCriterion("sheid between", value1, value2, "sheid");
            return (Criteria) this;
        }

        public Criteria andSheidNotBetween(String value1, String value2) {
            addCriterion("sheid not between", value1, value2, "sheid");
            return (Criteria) this;
        }

        public Criteria andShenameIsNull() {
            addCriterion("shename is null");
            return (Criteria) this;
        }

        public Criteria andShenameIsNotNull() {
            addCriterion("shename is not null");
            return (Criteria) this;
        }

        public Criteria andShenameEqualTo(String value) {
            addCriterion("shename =", value, "shename");
            return (Criteria) this;
        }

        public Criteria andShenameNotEqualTo(String value) {
            addCriterion("shename <>", value, "shename");
            return (Criteria) this;
        }

        public Criteria andShenameGreaterThan(String value) {
            addCriterion("shename >", value, "shename");
            return (Criteria) this;
        }

        public Criteria andShenameGreaterThanOrEqualTo(String value) {
            addCriterion("shename >=", value, "shename");
            return (Criteria) this;
        }

        public Criteria andShenameLessThan(String value) {
            addCriterion("shename <", value, "shename");
            return (Criteria) this;
        }

        public Criteria andShenameLessThanOrEqualTo(String value) {
            addCriterion("shename <=", value, "shename");
            return (Criteria) this;
        }

        public Criteria andShenameLike(String value) {
            addCriterion("shename like", value, "shename");
            return (Criteria) this;
        }

        public Criteria andShenameNotLike(String value) {
            addCriterion("shename not like", value, "shename");
            return (Criteria) this;
        }

        public Criteria andShenameIn(List<String> values) {
            addCriterion("shename in", values, "shename");
            return (Criteria) this;
        }

        public Criteria andShenameNotIn(List<String> values) {
            addCriterion("shename not in", values, "shename");
            return (Criteria) this;
        }

        public Criteria andShenameBetween(String value1, String value2) {
            addCriterion("shename between", value1, value2, "shename");
            return (Criteria) this;
        }

        public Criteria andShenameNotBetween(String value1, String value2) {
            addCriterion("shename not between", value1, value2, "shename");
            return (Criteria) this;
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