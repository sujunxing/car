package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
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

        public Criteria andDetidIsNull() {
            addCriterion("detid is null");
            return (Criteria) this;
        }

        public Criteria andDetidIsNotNull() {
            addCriterion("detid is not null");
            return (Criteria) this;
        }

        public Criteria andDetidEqualTo(Integer value) {
            addCriterion("detid =", value, "detid");
            return (Criteria) this;
        }

        public Criteria andDetidNotEqualTo(Integer value) {
            addCriterion("detid <>", value, "detid");
            return (Criteria) this;
        }

        public Criteria andDetidGreaterThan(Integer value) {
            addCriterion("detid >", value, "detid");
            return (Criteria) this;
        }

        public Criteria andDetidGreaterThanOrEqualTo(Integer value) {
            addCriterion("detid >=", value, "detid");
            return (Criteria) this;
        }

        public Criteria andDetidLessThan(Integer value) {
            addCriterion("detid <", value, "detid");
            return (Criteria) this;
        }

        public Criteria andDetidLessThanOrEqualTo(Integer value) {
            addCriterion("detid <=", value, "detid");
            return (Criteria) this;
        }

        public Criteria andDetidIn(List<Integer> values) {
            addCriterion("detid in", values, "detid");
            return (Criteria) this;
        }

        public Criteria andDetidNotIn(List<Integer> values) {
            addCriterion("detid not in", values, "detid");
            return (Criteria) this;
        }

        public Criteria andDetidBetween(Integer value1, Integer value2) {
            addCriterion("detid between", value1, value2, "detid");
            return (Criteria) this;
        }

        public Criteria andDetidNotBetween(Integer value1, Integer value2) {
            addCriterion("detid not between", value1, value2, "detid");
            return (Criteria) this;
        }

        public Criteria andDetnameIsNull() {
            addCriterion("detname is null");
            return (Criteria) this;
        }

        public Criteria andDetnameIsNotNull() {
            addCriterion("detname is not null");
            return (Criteria) this;
        }

        public Criteria andDetnameEqualTo(String value) {
            addCriterion("detname =", value, "detname");
            return (Criteria) this;
        }

        public Criteria andDetnameNotEqualTo(String value) {
            addCriterion("detname <>", value, "detname");
            return (Criteria) this;
        }

        public Criteria andDetnameGreaterThan(String value) {
            addCriterion("detname >", value, "detname");
            return (Criteria) this;
        }

        public Criteria andDetnameGreaterThanOrEqualTo(String value) {
            addCriterion("detname >=", value, "detname");
            return (Criteria) this;
        }

        public Criteria andDetnameLessThan(String value) {
            addCriterion("detname <", value, "detname");
            return (Criteria) this;
        }

        public Criteria andDetnameLessThanOrEqualTo(String value) {
            addCriterion("detname <=", value, "detname");
            return (Criteria) this;
        }

        public Criteria andDetnameLike(String value) {
            addCriterion("detname like", value, "detname");
            return (Criteria) this;
        }

        public Criteria andDetnameNotLike(String value) {
            addCriterion("detname not like", value, "detname");
            return (Criteria) this;
        }

        public Criteria andDetnameIn(List<String> values) {
            addCriterion("detname in", values, "detname");
            return (Criteria) this;
        }

        public Criteria andDetnameNotIn(List<String> values) {
            addCriterion("detname not in", values, "detname");
            return (Criteria) this;
        }

        public Criteria andDetnameBetween(String value1, String value2) {
            addCriterion("detname between", value1, value2, "detname");
            return (Criteria) this;
        }

        public Criteria andDetnameNotBetween(String value1, String value2) {
            addCriterion("detname not between", value1, value2, "detname");
            return (Criteria) this;
        }

        public Criteria andDetclassifyIsNull() {
            addCriterion("detclassify is null");
            return (Criteria) this;
        }

        public Criteria andDetclassifyIsNotNull() {
            addCriterion("detclassify is not null");
            return (Criteria) this;
        }

        public Criteria andDetclassifyEqualTo(String value) {
            addCriterion("detclassify =", value, "detclassify");
            return (Criteria) this;
        }

        public Criteria andDetclassifyNotEqualTo(String value) {
            addCriterion("detclassify <>", value, "detclassify");
            return (Criteria) this;
        }

        public Criteria andDetclassifyGreaterThan(String value) {
            addCriterion("detclassify >", value, "detclassify");
            return (Criteria) this;
        }

        public Criteria andDetclassifyGreaterThanOrEqualTo(String value) {
            addCriterion("detclassify >=", value, "detclassify");
            return (Criteria) this;
        }

        public Criteria andDetclassifyLessThan(String value) {
            addCriterion("detclassify <", value, "detclassify");
            return (Criteria) this;
        }

        public Criteria andDetclassifyLessThanOrEqualTo(String value) {
            addCriterion("detclassify <=", value, "detclassify");
            return (Criteria) this;
        }

        public Criteria andDetclassifyLike(String value) {
            addCriterion("detclassify like", value, "detclassify");
            return (Criteria) this;
        }

        public Criteria andDetclassifyNotLike(String value) {
            addCriterion("detclassify not like", value, "detclassify");
            return (Criteria) this;
        }

        public Criteria andDetclassifyIn(List<String> values) {
            addCriterion("detclassify in", values, "detclassify");
            return (Criteria) this;
        }

        public Criteria andDetclassifyNotIn(List<String> values) {
            addCriterion("detclassify not in", values, "detclassify");
            return (Criteria) this;
        }

        public Criteria andDetclassifyBetween(String value1, String value2) {
            addCriterion("detclassify between", value1, value2, "detclassify");
            return (Criteria) this;
        }

        public Criteria andDetclassifyNotBetween(String value1, String value2) {
            addCriterion("detclassify not between", value1, value2, "detclassify");
            return (Criteria) this;
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