package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class WarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseExample() {
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

        public Criteria andWaeidIsNull() {
            addCriterion("waeid is null");
            return (Criteria) this;
        }

        public Criteria andWaeidIsNotNull() {
            addCriterion("waeid is not null");
            return (Criteria) this;
        }

        public Criteria andWaeidEqualTo(Integer value) {
            addCriterion("waeid =", value, "waeid");
            return (Criteria) this;
        }

        public Criteria andWaeidNotEqualTo(Integer value) {
            addCriterion("waeid <>", value, "waeid");
            return (Criteria) this;
        }

        public Criteria andWaeidGreaterThan(Integer value) {
            addCriterion("waeid >", value, "waeid");
            return (Criteria) this;
        }

        public Criteria andWaeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("waeid >=", value, "waeid");
            return (Criteria) this;
        }

        public Criteria andWaeidLessThan(Integer value) {
            addCriterion("waeid <", value, "waeid");
            return (Criteria) this;
        }

        public Criteria andWaeidLessThanOrEqualTo(Integer value) {
            addCriterion("waeid <=", value, "waeid");
            return (Criteria) this;
        }

        public Criteria andWaeidIn(List<Integer> values) {
            addCriterion("waeid in", values, "waeid");
            return (Criteria) this;
        }

        public Criteria andWaeidNotIn(List<Integer> values) {
            addCriterion("waeid not in", values, "waeid");
            return (Criteria) this;
        }

        public Criteria andWaeidBetween(Integer value1, Integer value2) {
            addCriterion("waeid between", value1, value2, "waeid");
            return (Criteria) this;
        }

        public Criteria andWaeidNotBetween(Integer value1, Integer value2) {
            addCriterion("waeid not between", value1, value2, "waeid");
            return (Criteria) this;
        }

        public Criteria andWaenameIsNull() {
            addCriterion("waename is null");
            return (Criteria) this;
        }

        public Criteria andWaenameIsNotNull() {
            addCriterion("waename is not null");
            return (Criteria) this;
        }

        public Criteria andWaenameEqualTo(String value) {
            addCriterion("waename =", value, "waename");
            return (Criteria) this;
        }

        public Criteria andWaenameNotEqualTo(String value) {
            addCriterion("waename <>", value, "waename");
            return (Criteria) this;
        }

        public Criteria andWaenameGreaterThan(String value) {
            addCriterion("waename >", value, "waename");
            return (Criteria) this;
        }

        public Criteria andWaenameGreaterThanOrEqualTo(String value) {
            addCriterion("waename >=", value, "waename");
            return (Criteria) this;
        }

        public Criteria andWaenameLessThan(String value) {
            addCriterion("waename <", value, "waename");
            return (Criteria) this;
        }

        public Criteria andWaenameLessThanOrEqualTo(String value) {
            addCriterion("waename <=", value, "waename");
            return (Criteria) this;
        }

        public Criteria andWaenameLike(String value) {
            addCriterion("waename like", value, "waename");
            return (Criteria) this;
        }

        public Criteria andWaenameNotLike(String value) {
            addCriterion("waename not like", value, "waename");
            return (Criteria) this;
        }

        public Criteria andWaenameIn(List<String> values) {
            addCriterion("waename in", values, "waename");
            return (Criteria) this;
        }

        public Criteria andWaenameNotIn(List<String> values) {
            addCriterion("waename not in", values, "waename");
            return (Criteria) this;
        }

        public Criteria andWaenameBetween(String value1, String value2) {
            addCriterion("waename between", value1, value2, "waename");
            return (Criteria) this;
        }

        public Criteria andWaenameNotBetween(String value1, String value2) {
            addCriterion("waename not between", value1, value2, "waename");
            return (Criteria) this;
        }

        public Criteria andWaekdIsNull() {
            addCriterion("waekd is null");
            return (Criteria) this;
        }

        public Criteria andWaekdIsNotNull() {
            addCriterion("waekd is not null");
            return (Criteria) this;
        }

        public Criteria andWaekdEqualTo(Integer value) {
            addCriterion("waekd =", value, "waekd");
            return (Criteria) this;
        }

        public Criteria andWaekdNotEqualTo(Integer value) {
            addCriterion("waekd <>", value, "waekd");
            return (Criteria) this;
        }

        public Criteria andWaekdGreaterThan(Integer value) {
            addCriterion("waekd >", value, "waekd");
            return (Criteria) this;
        }

        public Criteria andWaekdGreaterThanOrEqualTo(Integer value) {
            addCriterion("waekd >=", value, "waekd");
            return (Criteria) this;
        }

        public Criteria andWaekdLessThan(Integer value) {
            addCriterion("waekd <", value, "waekd");
            return (Criteria) this;
        }

        public Criteria andWaekdLessThanOrEqualTo(Integer value) {
            addCriterion("waekd <=", value, "waekd");
            return (Criteria) this;
        }

        public Criteria andWaekdIn(List<Integer> values) {
            addCriterion("waekd in", values, "waekd");
            return (Criteria) this;
        }

        public Criteria andWaekdNotIn(List<Integer> values) {
            addCriterion("waekd not in", values, "waekd");
            return (Criteria) this;
        }

        public Criteria andWaekdBetween(Integer value1, Integer value2) {
            addCriterion("waekd between", value1, value2, "waekd");
            return (Criteria) this;
        }

        public Criteria andWaekdNotBetween(Integer value1, Integer value2) {
            addCriterion("waekd not between", value1, value2, "waekd");
            return (Criteria) this;
        }

        public Criteria andWaecxIsNull() {
            addCriterion("waecx is null");
            return (Criteria) this;
        }

        public Criteria andWaecxIsNotNull() {
            addCriterion("waecx is not null");
            return (Criteria) this;
        }

        public Criteria andWaecxEqualTo(Integer value) {
            addCriterion("waecx =", value, "waecx");
            return (Criteria) this;
        }

        public Criteria andWaecxNotEqualTo(Integer value) {
            addCriterion("waecx <>", value, "waecx");
            return (Criteria) this;
        }

        public Criteria andWaecxGreaterThan(Integer value) {
            addCriterion("waecx >", value, "waecx");
            return (Criteria) this;
        }

        public Criteria andWaecxGreaterThanOrEqualTo(Integer value) {
            addCriterion("waecx >=", value, "waecx");
            return (Criteria) this;
        }

        public Criteria andWaecxLessThan(Integer value) {
            addCriterion("waecx <", value, "waecx");
            return (Criteria) this;
        }

        public Criteria andWaecxLessThanOrEqualTo(Integer value) {
            addCriterion("waecx <=", value, "waecx");
            return (Criteria) this;
        }

        public Criteria andWaecxIn(List<Integer> values) {
            addCriterion("waecx in", values, "waecx");
            return (Criteria) this;
        }

        public Criteria andWaecxNotIn(List<Integer> values) {
            addCriterion("waecx not in", values, "waecx");
            return (Criteria) this;
        }

        public Criteria andWaecxBetween(Integer value1, Integer value2) {
            addCriterion("waecx between", value1, value2, "waecx");
            return (Criteria) this;
        }

        public Criteria andWaecxNotBetween(Integer value1, Integer value2) {
            addCriterion("waecx not between", value1, value2, "waecx");
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