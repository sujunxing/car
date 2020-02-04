package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ArtisangradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArtisangradeExample() {
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

        public Criteria andAreidIsNull() {
            addCriterion("areid is null");
            return (Criteria) this;
        }

        public Criteria andAreidIsNotNull() {
            addCriterion("areid is not null");
            return (Criteria) this;
        }

        public Criteria andAreidEqualTo(Integer value) {
            addCriterion("areid =", value, "areid");
            return (Criteria) this;
        }

        public Criteria andAreidNotEqualTo(Integer value) {
            addCriterion("areid <>", value, "areid");
            return (Criteria) this;
        }

        public Criteria andAreidGreaterThan(Integer value) {
            addCriterion("areid >", value, "areid");
            return (Criteria) this;
        }

        public Criteria andAreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("areid >=", value, "areid");
            return (Criteria) this;
        }

        public Criteria andAreidLessThan(Integer value) {
            addCriterion("areid <", value, "areid");
            return (Criteria) this;
        }

        public Criteria andAreidLessThanOrEqualTo(Integer value) {
            addCriterion("areid <=", value, "areid");
            return (Criteria) this;
        }

        public Criteria andAreidIn(List<Integer> values) {
            addCriterion("areid in", values, "areid");
            return (Criteria) this;
        }

        public Criteria andAreidNotIn(List<Integer> values) {
            addCriterion("areid not in", values, "areid");
            return (Criteria) this;
        }

        public Criteria andAreidBetween(Integer value1, Integer value2) {
            addCriterion("areid between", value1, value2, "areid");
            return (Criteria) this;
        }

        public Criteria andAreidNotBetween(Integer value1, Integer value2) {
            addCriterion("areid not between", value1, value2, "areid");
            return (Criteria) this;
        }

        public Criteria andArenameIsNull() {
            addCriterion("arename is null");
            return (Criteria) this;
        }

        public Criteria andArenameIsNotNull() {
            addCriterion("arename is not null");
            return (Criteria) this;
        }

        public Criteria andArenameEqualTo(String value) {
            addCriterion("arename =", value, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameNotEqualTo(String value) {
            addCriterion("arename <>", value, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameGreaterThan(String value) {
            addCriterion("arename >", value, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameGreaterThanOrEqualTo(String value) {
            addCriterion("arename >=", value, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameLessThan(String value) {
            addCriterion("arename <", value, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameLessThanOrEqualTo(String value) {
            addCriterion("arename <=", value, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameLike(String value) {
            addCriterion("arename like", value, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameNotLike(String value) {
            addCriterion("arename not like", value, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameIn(List<String> values) {
            addCriterion("arename in", values, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameNotIn(List<String> values) {
            addCriterion("arename not in", values, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameBetween(String value1, String value2) {
            addCriterion("arename between", value1, value2, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameNotBetween(String value1, String value2) {
            addCriterion("arename not between", value1, value2, "arename");
            return (Criteria) this;
        }

        public Criteria andAreweightIsNull() {
            addCriterion("areweight is null");
            return (Criteria) this;
        }

        public Criteria andAreweightIsNotNull() {
            addCriterion("areweight is not null");
            return (Criteria) this;
        }

        public Criteria andAreweightEqualTo(String value) {
            addCriterion("areweight =", value, "areweight");
            return (Criteria) this;
        }

        public Criteria andAreweightNotEqualTo(String value) {
            addCriterion("areweight <>", value, "areweight");
            return (Criteria) this;
        }

        public Criteria andAreweightGreaterThan(String value) {
            addCriterion("areweight >", value, "areweight");
            return (Criteria) this;
        }

        public Criteria andAreweightGreaterThanOrEqualTo(String value) {
            addCriterion("areweight >=", value, "areweight");
            return (Criteria) this;
        }

        public Criteria andAreweightLessThan(String value) {
            addCriterion("areweight <", value, "areweight");
            return (Criteria) this;
        }

        public Criteria andAreweightLessThanOrEqualTo(String value) {
            addCriterion("areweight <=", value, "areweight");
            return (Criteria) this;
        }

        public Criteria andAreweightLike(String value) {
            addCriterion("areweight like", value, "areweight");
            return (Criteria) this;
        }

        public Criteria andAreweightNotLike(String value) {
            addCriterion("areweight not like", value, "areweight");
            return (Criteria) this;
        }

        public Criteria andAreweightIn(List<String> values) {
            addCriterion("areweight in", values, "areweight");
            return (Criteria) this;
        }

        public Criteria andAreweightNotIn(List<String> values) {
            addCriterion("areweight not in", values, "areweight");
            return (Criteria) this;
        }

        public Criteria andAreweightBetween(String value1, String value2) {
            addCriterion("areweight between", value1, value2, "areweight");
            return (Criteria) this;
        }

        public Criteria andAreweightNotBetween(String value1, String value2) {
            addCriterion("areweight not between", value1, value2, "areweight");
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