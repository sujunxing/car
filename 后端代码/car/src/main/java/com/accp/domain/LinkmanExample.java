package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class LinkmanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LinkmanExample() {
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

        public Criteria andLinidIsNull() {
            addCriterion("linid is null");
            return (Criteria) this;
        }

        public Criteria andLinidIsNotNull() {
            addCriterion("linid is not null");
            return (Criteria) this;
        }

        public Criteria andLinidEqualTo(Integer value) {
            addCriterion("linid =", value, "linid");
            return (Criteria) this;
        }

        public Criteria andLinidNotEqualTo(Integer value) {
            addCriterion("linid <>", value, "linid");
            return (Criteria) this;
        }

        public Criteria andLinidGreaterThan(Integer value) {
            addCriterion("linid >", value, "linid");
            return (Criteria) this;
        }

        public Criteria andLinidGreaterThanOrEqualTo(Integer value) {
            addCriterion("linid >=", value, "linid");
            return (Criteria) this;
        }

        public Criteria andLinidLessThan(Integer value) {
            addCriterion("linid <", value, "linid");
            return (Criteria) this;
        }

        public Criteria andLinidLessThanOrEqualTo(Integer value) {
            addCriterion("linid <=", value, "linid");
            return (Criteria) this;
        }

        public Criteria andLinidIn(List<Integer> values) {
            addCriterion("linid in", values, "linid");
            return (Criteria) this;
        }

        public Criteria andLinidNotIn(List<Integer> values) {
            addCriterion("linid not in", values, "linid");
            return (Criteria) this;
        }

        public Criteria andLinidBetween(Integer value1, Integer value2) {
            addCriterion("linid between", value1, value2, "linid");
            return (Criteria) this;
        }

        public Criteria andLinidNotBetween(Integer value1, Integer value2) {
            addCriterion("linid not between", value1, value2, "linid");
            return (Criteria) this;
        }

        public Criteria andLinnameIsNull() {
            addCriterion("linname is null");
            return (Criteria) this;
        }

        public Criteria andLinnameIsNotNull() {
            addCriterion("linname is not null");
            return (Criteria) this;
        }

        public Criteria andLinnameEqualTo(String value) {
            addCriterion("linname =", value, "linname");
            return (Criteria) this;
        }

        public Criteria andLinnameNotEqualTo(String value) {
            addCriterion("linname <>", value, "linname");
            return (Criteria) this;
        }

        public Criteria andLinnameGreaterThan(String value) {
            addCriterion("linname >", value, "linname");
            return (Criteria) this;
        }

        public Criteria andLinnameGreaterThanOrEqualTo(String value) {
            addCriterion("linname >=", value, "linname");
            return (Criteria) this;
        }

        public Criteria andLinnameLessThan(String value) {
            addCriterion("linname <", value, "linname");
            return (Criteria) this;
        }

        public Criteria andLinnameLessThanOrEqualTo(String value) {
            addCriterion("linname <=", value, "linname");
            return (Criteria) this;
        }

        public Criteria andLinnameLike(String value) {
            addCriterion("linname like", value, "linname");
            return (Criteria) this;
        }

        public Criteria andLinnameNotLike(String value) {
            addCriterion("linname not like", value, "linname");
            return (Criteria) this;
        }

        public Criteria andLinnameIn(List<String> values) {
            addCriterion("linname in", values, "linname");
            return (Criteria) this;
        }

        public Criteria andLinnameNotIn(List<String> values) {
            addCriterion("linname not in", values, "linname");
            return (Criteria) this;
        }

        public Criteria andLinnameBetween(String value1, String value2) {
            addCriterion("linname between", value1, value2, "linname");
            return (Criteria) this;
        }

        public Criteria andLinnameNotBetween(String value1, String value2) {
            addCriterion("linname not between", value1, value2, "linname");
            return (Criteria) this;
        }

        public Criteria andLinphoneIsNull() {
            addCriterion("linphone is null");
            return (Criteria) this;
        }

        public Criteria andLinphoneIsNotNull() {
            addCriterion("linphone is not null");
            return (Criteria) this;
        }

        public Criteria andLinphoneEqualTo(String value) {
            addCriterion("linphone =", value, "linphone");
            return (Criteria) this;
        }

        public Criteria andLinphoneNotEqualTo(String value) {
            addCriterion("linphone <>", value, "linphone");
            return (Criteria) this;
        }

        public Criteria andLinphoneGreaterThan(String value) {
            addCriterion("linphone >", value, "linphone");
            return (Criteria) this;
        }

        public Criteria andLinphoneGreaterThanOrEqualTo(String value) {
            addCriterion("linphone >=", value, "linphone");
            return (Criteria) this;
        }

        public Criteria andLinphoneLessThan(String value) {
            addCriterion("linphone <", value, "linphone");
            return (Criteria) this;
        }

        public Criteria andLinphoneLessThanOrEqualTo(String value) {
            addCriterion("linphone <=", value, "linphone");
            return (Criteria) this;
        }

        public Criteria andLinphoneLike(String value) {
            addCriterion("linphone like", value, "linphone");
            return (Criteria) this;
        }

        public Criteria andLinphoneNotLike(String value) {
            addCriterion("linphone not like", value, "linphone");
            return (Criteria) this;
        }

        public Criteria andLinphoneIn(List<String> values) {
            addCriterion("linphone in", values, "linphone");
            return (Criteria) this;
        }

        public Criteria andLinphoneNotIn(List<String> values) {
            addCriterion("linphone not in", values, "linphone");
            return (Criteria) this;
        }

        public Criteria andLinphoneBetween(String value1, String value2) {
            addCriterion("linphone between", value1, value2, "linphone");
            return (Criteria) this;
        }

        public Criteria andLinphoneNotBetween(String value1, String value2) {
            addCriterion("linphone not between", value1, value2, "linphone");
            return (Criteria) this;
        }

        public Criteria andLinjobIsNull() {
            addCriterion("linjob is null");
            return (Criteria) this;
        }

        public Criteria andLinjobIsNotNull() {
            addCriterion("linjob is not null");
            return (Criteria) this;
        }

        public Criteria andLinjobEqualTo(String value) {
            addCriterion("linjob =", value, "linjob");
            return (Criteria) this;
        }

        public Criteria andLinjobNotEqualTo(String value) {
            addCriterion("linjob <>", value, "linjob");
            return (Criteria) this;
        }

        public Criteria andLinjobGreaterThan(String value) {
            addCriterion("linjob >", value, "linjob");
            return (Criteria) this;
        }

        public Criteria andLinjobGreaterThanOrEqualTo(String value) {
            addCriterion("linjob >=", value, "linjob");
            return (Criteria) this;
        }

        public Criteria andLinjobLessThan(String value) {
            addCriterion("linjob <", value, "linjob");
            return (Criteria) this;
        }

        public Criteria andLinjobLessThanOrEqualTo(String value) {
            addCriterion("linjob <=", value, "linjob");
            return (Criteria) this;
        }

        public Criteria andLinjobLike(String value) {
            addCriterion("linjob like", value, "linjob");
            return (Criteria) this;
        }

        public Criteria andLinjobNotLike(String value) {
            addCriterion("linjob not like", value, "linjob");
            return (Criteria) this;
        }

        public Criteria andLinjobIn(List<String> values) {
            addCriterion("linjob in", values, "linjob");
            return (Criteria) this;
        }

        public Criteria andLinjobNotIn(List<String> values) {
            addCriterion("linjob not in", values, "linjob");
            return (Criteria) this;
        }

        public Criteria andLinjobBetween(String value1, String value2) {
            addCriterion("linjob between", value1, value2, "linjob");
            return (Criteria) this;
        }

        public Criteria andLinjobNotBetween(String value1, String value2) {
            addCriterion("linjob not between", value1, value2, "linjob");
            return (Criteria) this;
        }

        public Criteria andLindhIsNull() {
            addCriterion("lindh is null");
            return (Criteria) this;
        }

        public Criteria andLindhIsNotNull() {
            addCriterion("lindh is not null");
            return (Criteria) this;
        }

        public Criteria andLindhEqualTo(String value) {
            addCriterion("lindh =", value, "lindh");
            return (Criteria) this;
        }

        public Criteria andLindhNotEqualTo(String value) {
            addCriterion("lindh <>", value, "lindh");
            return (Criteria) this;
        }

        public Criteria andLindhGreaterThan(String value) {
            addCriterion("lindh >", value, "lindh");
            return (Criteria) this;
        }

        public Criteria andLindhGreaterThanOrEqualTo(String value) {
            addCriterion("lindh >=", value, "lindh");
            return (Criteria) this;
        }

        public Criteria andLindhLessThan(String value) {
            addCriterion("lindh <", value, "lindh");
            return (Criteria) this;
        }

        public Criteria andLindhLessThanOrEqualTo(String value) {
            addCriterion("lindh <=", value, "lindh");
            return (Criteria) this;
        }

        public Criteria andLindhLike(String value) {
            addCriterion("lindh like", value, "lindh");
            return (Criteria) this;
        }

        public Criteria andLindhNotLike(String value) {
            addCriterion("lindh not like", value, "lindh");
            return (Criteria) this;
        }

        public Criteria andLindhIn(List<String> values) {
            addCriterion("lindh in", values, "lindh");
            return (Criteria) this;
        }

        public Criteria andLindhNotIn(List<String> values) {
            addCriterion("lindh not in", values, "lindh");
            return (Criteria) this;
        }

        public Criteria andLindhBetween(String value1, String value2) {
            addCriterion("lindh between", value1, value2, "lindh");
            return (Criteria) this;
        }

        public Criteria andLindhNotBetween(String value1, String value2) {
            addCriterion("lindh not between", value1, value2, "lindh");
            return (Criteria) this;
        }

        public Criteria andLinemailIsNull() {
            addCriterion("linemail is null");
            return (Criteria) this;
        }

        public Criteria andLinemailIsNotNull() {
            addCriterion("linemail is not null");
            return (Criteria) this;
        }

        public Criteria andLinemailEqualTo(String value) {
            addCriterion("linemail =", value, "linemail");
            return (Criteria) this;
        }

        public Criteria andLinemailNotEqualTo(String value) {
            addCriterion("linemail <>", value, "linemail");
            return (Criteria) this;
        }

        public Criteria andLinemailGreaterThan(String value) {
            addCriterion("linemail >", value, "linemail");
            return (Criteria) this;
        }

        public Criteria andLinemailGreaterThanOrEqualTo(String value) {
            addCriterion("linemail >=", value, "linemail");
            return (Criteria) this;
        }

        public Criteria andLinemailLessThan(String value) {
            addCriterion("linemail <", value, "linemail");
            return (Criteria) this;
        }

        public Criteria andLinemailLessThanOrEqualTo(String value) {
            addCriterion("linemail <=", value, "linemail");
            return (Criteria) this;
        }

        public Criteria andLinemailLike(String value) {
            addCriterion("linemail like", value, "linemail");
            return (Criteria) this;
        }

        public Criteria andLinemailNotLike(String value) {
            addCriterion("linemail not like", value, "linemail");
            return (Criteria) this;
        }

        public Criteria andLinemailIn(List<String> values) {
            addCriterion("linemail in", values, "linemail");
            return (Criteria) this;
        }

        public Criteria andLinemailNotIn(List<String> values) {
            addCriterion("linemail not in", values, "linemail");
            return (Criteria) this;
        }

        public Criteria andLinemailBetween(String value1, String value2) {
            addCriterion("linemail between", value1, value2, "linemail");
            return (Criteria) this;
        }

        public Criteria andLinemailNotBetween(String value1, String value2) {
            addCriterion("linemail not between", value1, value2, "linemail");
            return (Criteria) this;
        }

        public Criteria andMaridIsNull() {
            addCriterion("marid is null");
            return (Criteria) this;
        }

        public Criteria andMaridIsNotNull() {
            addCriterion("marid is not null");
            return (Criteria) this;
        }

        public Criteria andMaridEqualTo(String value) {
            addCriterion("marid =", value, "marid");
            return (Criteria) this;
        }

        public Criteria andMaridNotEqualTo(String value) {
            addCriterion("marid <>", value, "marid");
            return (Criteria) this;
        }

        public Criteria andMaridGreaterThan(String value) {
            addCriterion("marid >", value, "marid");
            return (Criteria) this;
        }

        public Criteria andMaridGreaterThanOrEqualTo(String value) {
            addCriterion("marid >=", value, "marid");
            return (Criteria) this;
        }

        public Criteria andMaridLessThan(String value) {
            addCriterion("marid <", value, "marid");
            return (Criteria) this;
        }

        public Criteria andMaridLessThanOrEqualTo(String value) {
            addCriterion("marid <=", value, "marid");
            return (Criteria) this;
        }

        public Criteria andMaridLike(String value) {
            addCriterion("marid like", value, "marid");
            return (Criteria) this;
        }

        public Criteria andMaridNotLike(String value) {
            addCriterion("marid not like", value, "marid");
            return (Criteria) this;
        }

        public Criteria andMaridIn(List<String> values) {
            addCriterion("marid in", values, "marid");
            return (Criteria) this;
        }

        public Criteria andMaridNotIn(List<String> values) {
            addCriterion("marid not in", values, "marid");
            return (Criteria) this;
        }

        public Criteria andMaridBetween(String value1, String value2) {
            addCriterion("marid between", value1, value2, "marid");
            return (Criteria) this;
        }

        public Criteria andMaridNotBetween(String value1, String value2) {
            addCriterion("marid not between", value1, value2, "marid");
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