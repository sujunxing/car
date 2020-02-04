package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class JueseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JueseExample() {
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

        public Criteria andJueidIsNull() {
            addCriterion("jueid is null");
            return (Criteria) this;
        }

        public Criteria andJueidIsNotNull() {
            addCriterion("jueid is not null");
            return (Criteria) this;
        }

        public Criteria andJueidEqualTo(Integer value) {
            addCriterion("jueid =", value, "jueid");
            return (Criteria) this;
        }

        public Criteria andJueidNotEqualTo(Integer value) {
            addCriterion("jueid <>", value, "jueid");
            return (Criteria) this;
        }

        public Criteria andJueidGreaterThan(Integer value) {
            addCriterion("jueid >", value, "jueid");
            return (Criteria) this;
        }

        public Criteria andJueidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jueid >=", value, "jueid");
            return (Criteria) this;
        }

        public Criteria andJueidLessThan(Integer value) {
            addCriterion("jueid <", value, "jueid");
            return (Criteria) this;
        }

        public Criteria andJueidLessThanOrEqualTo(Integer value) {
            addCriterion("jueid <=", value, "jueid");
            return (Criteria) this;
        }

        public Criteria andJueidIn(List<Integer> values) {
            addCriterion("jueid in", values, "jueid");
            return (Criteria) this;
        }

        public Criteria andJueidNotIn(List<Integer> values) {
            addCriterion("jueid not in", values, "jueid");
            return (Criteria) this;
        }

        public Criteria andJueidBetween(Integer value1, Integer value2) {
            addCriterion("jueid between", value1, value2, "jueid");
            return (Criteria) this;
        }

        public Criteria andJueidNotBetween(Integer value1, Integer value2) {
            addCriterion("jueid not between", value1, value2, "jueid");
            return (Criteria) this;
        }

        public Criteria andJuenameIsNull() {
            addCriterion("Juename is null");
            return (Criteria) this;
        }

        public Criteria andJuenameIsNotNull() {
            addCriterion("Juename is not null");
            return (Criteria) this;
        }

        public Criteria andJuenameEqualTo(String value) {
            addCriterion("Juename =", value, "juename");
            return (Criteria) this;
        }

        public Criteria andJuenameNotEqualTo(String value) {
            addCriterion("Juename <>", value, "juename");
            return (Criteria) this;
        }

        public Criteria andJuenameGreaterThan(String value) {
            addCriterion("Juename >", value, "juename");
            return (Criteria) this;
        }

        public Criteria andJuenameGreaterThanOrEqualTo(String value) {
            addCriterion("Juename >=", value, "juename");
            return (Criteria) this;
        }

        public Criteria andJuenameLessThan(String value) {
            addCriterion("Juename <", value, "juename");
            return (Criteria) this;
        }

        public Criteria andJuenameLessThanOrEqualTo(String value) {
            addCriterion("Juename <=", value, "juename");
            return (Criteria) this;
        }

        public Criteria andJuenameLike(String value) {
            addCriterion("Juename like", value, "juename");
            return (Criteria) this;
        }

        public Criteria andJuenameNotLike(String value) {
            addCriterion("Juename not like", value, "juename");
            return (Criteria) this;
        }

        public Criteria andJuenameIn(List<String> values) {
            addCriterion("Juename in", values, "juename");
            return (Criteria) this;
        }

        public Criteria andJuenameNotIn(List<String> values) {
            addCriterion("Juename not in", values, "juename");
            return (Criteria) this;
        }

        public Criteria andJuenameBetween(String value1, String value2) {
            addCriterion("Juename between", value1, value2, "juename");
            return (Criteria) this;
        }

        public Criteria andJuenameNotBetween(String value1, String value2) {
            addCriterion("Juename not between", value1, value2, "juename");
            return (Criteria) this;
        }

        public Criteria andResidIsNull() {
            addCriterion("resid is null");
            return (Criteria) this;
        }

        public Criteria andResidIsNotNull() {
            addCriterion("resid is not null");
            return (Criteria) this;
        }

        public Criteria andResidEqualTo(Integer value) {
            addCriterion("resid =", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidNotEqualTo(Integer value) {
            addCriterion("resid <>", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidGreaterThan(Integer value) {
            addCriterion("resid >", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidGreaterThanOrEqualTo(Integer value) {
            addCriterion("resid >=", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidLessThan(Integer value) {
            addCriterion("resid <", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidLessThanOrEqualTo(Integer value) {
            addCriterion("resid <=", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidIn(List<Integer> values) {
            addCriterion("resid in", values, "resid");
            return (Criteria) this;
        }

        public Criteria andResidNotIn(List<Integer> values) {
            addCriterion("resid not in", values, "resid");
            return (Criteria) this;
        }

        public Criteria andResidBetween(Integer value1, Integer value2) {
            addCriterion("resid between", value1, value2, "resid");
            return (Criteria) this;
        }

        public Criteria andResidNotBetween(Integer value1, Integer value2) {
            addCriterion("resid not between", value1, value2, "resid");
            return (Criteria) this;
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