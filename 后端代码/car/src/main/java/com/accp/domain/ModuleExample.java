package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ModuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModuleExample() {
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

        public Criteria andMoenameIsNull() {
            addCriterion("moename is null");
            return (Criteria) this;
        }

        public Criteria andMoenameIsNotNull() {
            addCriterion("moename is not null");
            return (Criteria) this;
        }

        public Criteria andMoenameEqualTo(String value) {
            addCriterion("moename =", value, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameNotEqualTo(String value) {
            addCriterion("moename <>", value, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameGreaterThan(String value) {
            addCriterion("moename >", value, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameGreaterThanOrEqualTo(String value) {
            addCriterion("moename >=", value, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameLessThan(String value) {
            addCriterion("moename <", value, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameLessThanOrEqualTo(String value) {
            addCriterion("moename <=", value, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameLike(String value) {
            addCriterion("moename like", value, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameNotLike(String value) {
            addCriterion("moename not like", value, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameIn(List<String> values) {
            addCriterion("moename in", values, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameNotIn(List<String> values) {
            addCriterion("moename not in", values, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameBetween(String value1, String value2) {
            addCriterion("moename between", value1, value2, "moename");
            return (Criteria) this;
        }

        public Criteria andMoenameNotBetween(String value1, String value2) {
            addCriterion("moename not between", value1, value2, "moename");
            return (Criteria) this;
        }

        public Criteria andMonidIsNull() {
            addCriterion("monid is null");
            return (Criteria) this;
        }

        public Criteria andMonidIsNotNull() {
            addCriterion("monid is not null");
            return (Criteria) this;
        }

        public Criteria andMonidEqualTo(Integer value) {
            addCriterion("monid =", value, "monid");
            return (Criteria) this;
        }

        public Criteria andMonidNotEqualTo(Integer value) {
            addCriterion("monid <>", value, "monid");
            return (Criteria) this;
        }

        public Criteria andMonidGreaterThan(Integer value) {
            addCriterion("monid >", value, "monid");
            return (Criteria) this;
        }

        public Criteria andMonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("monid >=", value, "monid");
            return (Criteria) this;
        }

        public Criteria andMonidLessThan(Integer value) {
            addCriterion("monid <", value, "monid");
            return (Criteria) this;
        }

        public Criteria andMonidLessThanOrEqualTo(Integer value) {
            addCriterion("monid <=", value, "monid");
            return (Criteria) this;
        }

        public Criteria andMonidIn(List<Integer> values) {
            addCriterion("monid in", values, "monid");
            return (Criteria) this;
        }

        public Criteria andMonidNotIn(List<Integer> values) {
            addCriterion("monid not in", values, "monid");
            return (Criteria) this;
        }

        public Criteria andMonidBetween(Integer value1, Integer value2) {
            addCriterion("monid between", value1, value2, "monid");
            return (Criteria) this;
        }

        public Criteria andMonidNotBetween(Integer value1, Integer value2) {
            addCriterion("monid not between", value1, value2, "monid");
            return (Criteria) this;
        }

        public Criteria andMoetypeIsNull() {
            addCriterion("moetype is null");
            return (Criteria) this;
        }

        public Criteria andMoetypeIsNotNull() {
            addCriterion("moetype is not null");
            return (Criteria) this;
        }

        public Criteria andMoetypeEqualTo(Integer value) {
            addCriterion("moetype =", value, "moetype");
            return (Criteria) this;
        }

        public Criteria andMoetypeNotEqualTo(Integer value) {
            addCriterion("moetype <>", value, "moetype");
            return (Criteria) this;
        }

        public Criteria andMoetypeGreaterThan(Integer value) {
            addCriterion("moetype >", value, "moetype");
            return (Criteria) this;
        }

        public Criteria andMoetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("moetype >=", value, "moetype");
            return (Criteria) this;
        }

        public Criteria andMoetypeLessThan(Integer value) {
            addCriterion("moetype <", value, "moetype");
            return (Criteria) this;
        }

        public Criteria andMoetypeLessThanOrEqualTo(Integer value) {
            addCriterion("moetype <=", value, "moetype");
            return (Criteria) this;
        }

        public Criteria andMoetypeIn(List<Integer> values) {
            addCriterion("moetype in", values, "moetype");
            return (Criteria) this;
        }

        public Criteria andMoetypeNotIn(List<Integer> values) {
            addCriterion("moetype not in", values, "moetype");
            return (Criteria) this;
        }

        public Criteria andMoetypeBetween(Integer value1, Integer value2) {
            addCriterion("moetype between", value1, value2, "moetype");
            return (Criteria) this;
        }

        public Criteria andMoetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("moetype not between", value1, value2, "moetype");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
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