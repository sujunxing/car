package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ModuledetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModuledetailsExample() {
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

        public Criteria andMosidIsNull() {
            addCriterion("mosid is null");
            return (Criteria) this;
        }

        public Criteria andMosidIsNotNull() {
            addCriterion("mosid is not null");
            return (Criteria) this;
        }

        public Criteria andMosidEqualTo(Integer value) {
            addCriterion("mosid =", value, "mosid");
            return (Criteria) this;
        }

        public Criteria andMosidNotEqualTo(Integer value) {
            addCriterion("mosid <>", value, "mosid");
            return (Criteria) this;
        }

        public Criteria andMosidGreaterThan(Integer value) {
            addCriterion("mosid >", value, "mosid");
            return (Criteria) this;
        }

        public Criteria andMosidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mosid >=", value, "mosid");
            return (Criteria) this;
        }

        public Criteria andMosidLessThan(Integer value) {
            addCriterion("mosid <", value, "mosid");
            return (Criteria) this;
        }

        public Criteria andMosidLessThanOrEqualTo(Integer value) {
            addCriterion("mosid <=", value, "mosid");
            return (Criteria) this;
        }

        public Criteria andMosidIn(List<Integer> values) {
            addCriterion("mosid in", values, "mosid");
            return (Criteria) this;
        }

        public Criteria andMosidNotIn(List<Integer> values) {
            addCriterion("mosid not in", values, "mosid");
            return (Criteria) this;
        }

        public Criteria andMosidBetween(Integer value1, Integer value2) {
            addCriterion("mosid between", value1, value2, "mosid");
            return (Criteria) this;
        }

        public Criteria andMosidNotBetween(Integer value1, Integer value2) {
            addCriterion("mosid not between", value1, value2, "mosid");
            return (Criteria) this;
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

        public Criteria andMoeidIsNull() {
            addCriterion("moeid is null");
            return (Criteria) this;
        }

        public Criteria andMoeidIsNotNull() {
            addCriterion("moeid is not null");
            return (Criteria) this;
        }

        public Criteria andMoeidEqualTo(Integer value) {
            addCriterion("moeid =", value, "moeid");
            return (Criteria) this;
        }

        public Criteria andMoeidNotEqualTo(Integer value) {
            addCriterion("moeid <>", value, "moeid");
            return (Criteria) this;
        }

        public Criteria andMoeidGreaterThan(Integer value) {
            addCriterion("moeid >", value, "moeid");
            return (Criteria) this;
        }

        public Criteria andMoeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("moeid >=", value, "moeid");
            return (Criteria) this;
        }

        public Criteria andMoeidLessThan(Integer value) {
            addCriterion("moeid <", value, "moeid");
            return (Criteria) this;
        }

        public Criteria andMoeidLessThanOrEqualTo(Integer value) {
            addCriterion("moeid <=", value, "moeid");
            return (Criteria) this;
        }

        public Criteria andMoeidIn(List<Integer> values) {
            addCriterion("moeid in", values, "moeid");
            return (Criteria) this;
        }

        public Criteria andMoeidNotIn(List<Integer> values) {
            addCriterion("moeid not in", values, "moeid");
            return (Criteria) this;
        }

        public Criteria andMoeidBetween(Integer value1, Integer value2) {
            addCriterion("moeid between", value1, value2, "moeid");
            return (Criteria) this;
        }

        public Criteria andMoeidNotBetween(Integer value1, Integer value2) {
            addCriterion("moeid not between", value1, value2, "moeid");
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