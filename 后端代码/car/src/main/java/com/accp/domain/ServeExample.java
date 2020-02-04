package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ServeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServeExample() {
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

        public Criteria andSeeidIsNull() {
            addCriterion("seeid is null");
            return (Criteria) this;
        }

        public Criteria andSeeidIsNotNull() {
            addCriterion("seeid is not null");
            return (Criteria) this;
        }

        public Criteria andSeeidEqualTo(String value) {
            addCriterion("seeid =", value, "seeid");
            return (Criteria) this;
        }

        public Criteria andSeeidNotEqualTo(String value) {
            addCriterion("seeid <>", value, "seeid");
            return (Criteria) this;
        }

        public Criteria andSeeidGreaterThan(String value) {
            addCriterion("seeid >", value, "seeid");
            return (Criteria) this;
        }

        public Criteria andSeeidGreaterThanOrEqualTo(String value) {
            addCriterion("seeid >=", value, "seeid");
            return (Criteria) this;
        }

        public Criteria andSeeidLessThan(String value) {
            addCriterion("seeid <", value, "seeid");
            return (Criteria) this;
        }

        public Criteria andSeeidLessThanOrEqualTo(String value) {
            addCriterion("seeid <=", value, "seeid");
            return (Criteria) this;
        }

        public Criteria andSeeidLike(String value) {
            addCriterion("seeid like", value, "seeid");
            return (Criteria) this;
        }

        public Criteria andSeeidNotLike(String value) {
            addCriterion("seeid not like", value, "seeid");
            return (Criteria) this;
        }

        public Criteria andSeeidIn(List<String> values) {
            addCriterion("seeid in", values, "seeid");
            return (Criteria) this;
        }

        public Criteria andSeeidNotIn(List<String> values) {
            addCriterion("seeid not in", values, "seeid");
            return (Criteria) this;
        }

        public Criteria andSeeidBetween(String value1, String value2) {
            addCriterion("seeid between", value1, value2, "seeid");
            return (Criteria) this;
        }

        public Criteria andSeeidNotBetween(String value1, String value2) {
            addCriterion("seeid not between", value1, value2, "seeid");
            return (Criteria) this;
        }

        public Criteria andSeenameIsNull() {
            addCriterion("seename is null");
            return (Criteria) this;
        }

        public Criteria andSeenameIsNotNull() {
            addCriterion("seename is not null");
            return (Criteria) this;
        }

        public Criteria andSeenameEqualTo(String value) {
            addCriterion("seename =", value, "seename");
            return (Criteria) this;
        }

        public Criteria andSeenameNotEqualTo(String value) {
            addCriterion("seename <>", value, "seename");
            return (Criteria) this;
        }

        public Criteria andSeenameGreaterThan(String value) {
            addCriterion("seename >", value, "seename");
            return (Criteria) this;
        }

        public Criteria andSeenameGreaterThanOrEqualTo(String value) {
            addCriterion("seename >=", value, "seename");
            return (Criteria) this;
        }

        public Criteria andSeenameLessThan(String value) {
            addCriterion("seename <", value, "seename");
            return (Criteria) this;
        }

        public Criteria andSeenameLessThanOrEqualTo(String value) {
            addCriterion("seename <=", value, "seename");
            return (Criteria) this;
        }

        public Criteria andSeenameLike(String value) {
            addCriterion("seename like", value, "seename");
            return (Criteria) this;
        }

        public Criteria andSeenameNotLike(String value) {
            addCriterion("seename not like", value, "seename");
            return (Criteria) this;
        }

        public Criteria andSeenameIn(List<String> values) {
            addCriterion("seename in", values, "seename");
            return (Criteria) this;
        }

        public Criteria andSeenameNotIn(List<String> values) {
            addCriterion("seename not in", values, "seename");
            return (Criteria) this;
        }

        public Criteria andSeenameBetween(String value1, String value2) {
            addCriterion("seename between", value1, value2, "seename");
            return (Criteria) this;
        }

        public Criteria andSeenameNotBetween(String value1, String value2) {
            addCriterion("seename not between", value1, value2, "seename");
            return (Criteria) this;
        }

        public Criteria andIneidIsNull() {
            addCriterion("ineid is null");
            return (Criteria) this;
        }

        public Criteria andIneidIsNotNull() {
            addCriterion("ineid is not null");
            return (Criteria) this;
        }

        public Criteria andIneidEqualTo(Integer value) {
            addCriterion("ineid =", value, "ineid");
            return (Criteria) this;
        }

        public Criteria andIneidNotEqualTo(Integer value) {
            addCriterion("ineid <>", value, "ineid");
            return (Criteria) this;
        }

        public Criteria andIneidGreaterThan(Integer value) {
            addCriterion("ineid >", value, "ineid");
            return (Criteria) this;
        }

        public Criteria andIneidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ineid >=", value, "ineid");
            return (Criteria) this;
        }

        public Criteria andIneidLessThan(Integer value) {
            addCriterion("ineid <", value, "ineid");
            return (Criteria) this;
        }

        public Criteria andIneidLessThanOrEqualTo(Integer value) {
            addCriterion("ineid <=", value, "ineid");
            return (Criteria) this;
        }

        public Criteria andIneidIn(List<Integer> values) {
            addCriterion("ineid in", values, "ineid");
            return (Criteria) this;
        }

        public Criteria andIneidNotIn(List<Integer> values) {
            addCriterion("ineid not in", values, "ineid");
            return (Criteria) this;
        }

        public Criteria andIneidBetween(Integer value1, Integer value2) {
            addCriterion("ineid between", value1, value2, "ineid");
            return (Criteria) this;
        }

        public Criteria andIneidNotBetween(Integer value1, Integer value2) {
            addCriterion("ineid not between", value1, value2, "ineid");
            return (Criteria) this;
        }

        public Criteria andCayidIsNull() {
            addCriterion("cayid is null");
            return (Criteria) this;
        }

        public Criteria andCayidIsNotNull() {
            addCriterion("cayid is not null");
            return (Criteria) this;
        }

        public Criteria andCayidEqualTo(String value) {
            addCriterion("cayid =", value, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidNotEqualTo(String value) {
            addCriterion("cayid <>", value, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidGreaterThan(String value) {
            addCriterion("cayid >", value, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidGreaterThanOrEqualTo(String value) {
            addCriterion("cayid >=", value, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidLessThan(String value) {
            addCriterion("cayid <", value, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidLessThanOrEqualTo(String value) {
            addCriterion("cayid <=", value, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidLike(String value) {
            addCriterion("cayid like", value, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidNotLike(String value) {
            addCriterion("cayid not like", value, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidIn(List<String> values) {
            addCriterion("cayid in", values, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidNotIn(List<String> values) {
            addCriterion("cayid not in", values, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidBetween(String value1, String value2) {
            addCriterion("cayid between", value1, value2, "cayid");
            return (Criteria) this;
        }

        public Criteria andCayidNotBetween(String value1, String value2) {
            addCriterion("cayid not between", value1, value2, "cayid");
            return (Criteria) this;
        }

        public Criteria andSeeremarkIsNull() {
            addCriterion("seeremark is null");
            return (Criteria) this;
        }

        public Criteria andSeeremarkIsNotNull() {
            addCriterion("seeremark is not null");
            return (Criteria) this;
        }

        public Criteria andSeeremarkEqualTo(String value) {
            addCriterion("seeremark =", value, "seeremark");
            return (Criteria) this;
        }

        public Criteria andSeeremarkNotEqualTo(String value) {
            addCriterion("seeremark <>", value, "seeremark");
            return (Criteria) this;
        }

        public Criteria andSeeremarkGreaterThan(String value) {
            addCriterion("seeremark >", value, "seeremark");
            return (Criteria) this;
        }

        public Criteria andSeeremarkGreaterThanOrEqualTo(String value) {
            addCriterion("seeremark >=", value, "seeremark");
            return (Criteria) this;
        }

        public Criteria andSeeremarkLessThan(String value) {
            addCriterion("seeremark <", value, "seeremark");
            return (Criteria) this;
        }

        public Criteria andSeeremarkLessThanOrEqualTo(String value) {
            addCriterion("seeremark <=", value, "seeremark");
            return (Criteria) this;
        }

        public Criteria andSeeremarkLike(String value) {
            addCriterion("seeremark like", value, "seeremark");
            return (Criteria) this;
        }

        public Criteria andSeeremarkNotLike(String value) {
            addCriterion("seeremark not like", value, "seeremark");
            return (Criteria) this;
        }

        public Criteria andSeeremarkIn(List<String> values) {
            addCriterion("seeremark in", values, "seeremark");
            return (Criteria) this;
        }

        public Criteria andSeeremarkNotIn(List<String> values) {
            addCriterion("seeremark not in", values, "seeremark");
            return (Criteria) this;
        }

        public Criteria andSeeremarkBetween(String value1, String value2) {
            addCriterion("seeremark between", value1, value2, "seeremark");
            return (Criteria) this;
        }

        public Criteria andSeeremarkNotBetween(String value1, String value2) {
            addCriterion("seeremark not between", value1, value2, "seeremark");
            return (Criteria) this;
        }

        public Criteria andSeestandardIsNull() {
            addCriterion("seestandard is null");
            return (Criteria) this;
        }

        public Criteria andSeestandardIsNotNull() {
            addCriterion("seestandard is not null");
            return (Criteria) this;
        }

        public Criteria andSeestandardEqualTo(Integer value) {
            addCriterion("seestandard =", value, "seestandard");
            return (Criteria) this;
        }

        public Criteria andSeestandardNotEqualTo(Integer value) {
            addCriterion("seestandard <>", value, "seestandard");
            return (Criteria) this;
        }

        public Criteria andSeestandardGreaterThan(Integer value) {
            addCriterion("seestandard >", value, "seestandard");
            return (Criteria) this;
        }

        public Criteria andSeestandardGreaterThanOrEqualTo(Integer value) {
            addCriterion("seestandard >=", value, "seestandard");
            return (Criteria) this;
        }

        public Criteria andSeestandardLessThan(Integer value) {
            addCriterion("seestandard <", value, "seestandard");
            return (Criteria) this;
        }

        public Criteria andSeestandardLessThanOrEqualTo(Integer value) {
            addCriterion("seestandard <=", value, "seestandard");
            return (Criteria) this;
        }

        public Criteria andSeestandardIn(List<Integer> values) {
            addCriterion("seestandard in", values, "seestandard");
            return (Criteria) this;
        }

        public Criteria andSeestandardNotIn(List<Integer> values) {
            addCriterion("seestandard not in", values, "seestandard");
            return (Criteria) this;
        }

        public Criteria andSeestandardBetween(Integer value1, Integer value2) {
            addCriterion("seestandard between", value1, value2, "seestandard");
            return (Criteria) this;
        }

        public Criteria andSeestandardNotBetween(Integer value1, Integer value2) {
            addCriterion("seestandard not between", value1, value2, "seestandard");
            return (Criteria) this;
        }

        public Criteria andSeememberIsNull() {
            addCriterion("seemember is null");
            return (Criteria) this;
        }

        public Criteria andSeememberIsNotNull() {
            addCriterion("seemember is not null");
            return (Criteria) this;
        }

        public Criteria andSeememberEqualTo(Integer value) {
            addCriterion("seemember =", value, "seemember");
            return (Criteria) this;
        }

        public Criteria andSeememberNotEqualTo(Integer value) {
            addCriterion("seemember <>", value, "seemember");
            return (Criteria) this;
        }

        public Criteria andSeememberGreaterThan(Integer value) {
            addCriterion("seemember >", value, "seemember");
            return (Criteria) this;
        }

        public Criteria andSeememberGreaterThanOrEqualTo(Integer value) {
            addCriterion("seemember >=", value, "seemember");
            return (Criteria) this;
        }

        public Criteria andSeememberLessThan(Integer value) {
            addCriterion("seemember <", value, "seemember");
            return (Criteria) this;
        }

        public Criteria andSeememberLessThanOrEqualTo(Integer value) {
            addCriterion("seemember <=", value, "seemember");
            return (Criteria) this;
        }

        public Criteria andSeememberIn(List<Integer> values) {
            addCriterion("seemember in", values, "seemember");
            return (Criteria) this;
        }

        public Criteria andSeememberNotIn(List<Integer> values) {
            addCriterion("seemember not in", values, "seemember");
            return (Criteria) this;
        }

        public Criteria andSeememberBetween(Integer value1, Integer value2) {
            addCriterion("seemember between", value1, value2, "seemember");
            return (Criteria) this;
        }

        public Criteria andSeememberNotBetween(Integer value1, Integer value2) {
            addCriterion("seemember not between", value1, value2, "seemember");
            return (Criteria) this;
        }

        public Criteria andSeevipIsNull() {
            addCriterion("seevip is null");
            return (Criteria) this;
        }

        public Criteria andSeevipIsNotNull() {
            addCriterion("seevip is not null");
            return (Criteria) this;
        }

        public Criteria andSeevipEqualTo(Integer value) {
            addCriterion("seevip =", value, "seevip");
            return (Criteria) this;
        }

        public Criteria andSeevipNotEqualTo(Integer value) {
            addCriterion("seevip <>", value, "seevip");
            return (Criteria) this;
        }

        public Criteria andSeevipGreaterThan(Integer value) {
            addCriterion("seevip >", value, "seevip");
            return (Criteria) this;
        }

        public Criteria andSeevipGreaterThanOrEqualTo(Integer value) {
            addCriterion("seevip >=", value, "seevip");
            return (Criteria) this;
        }

        public Criteria andSeevipLessThan(Integer value) {
            addCriterion("seevip <", value, "seevip");
            return (Criteria) this;
        }

        public Criteria andSeevipLessThanOrEqualTo(Integer value) {
            addCriterion("seevip <=", value, "seevip");
            return (Criteria) this;
        }

        public Criteria andSeevipIn(List<Integer> values) {
            addCriterion("seevip in", values, "seevip");
            return (Criteria) this;
        }

        public Criteria andSeevipNotIn(List<Integer> values) {
            addCriterion("seevip not in", values, "seevip");
            return (Criteria) this;
        }

        public Criteria andSeevipBetween(Integer value1, Integer value2) {
            addCriterion("seevip between", value1, value2, "seevip");
            return (Criteria) this;
        }

        public Criteria andSeevipNotBetween(Integer value1, Integer value2) {
            addCriterion("seevip not between", value1, value2, "seevip");
            return (Criteria) this;
        }

        public Criteria andSeedealIsNull() {
            addCriterion("seedeal is null");
            return (Criteria) this;
        }

        public Criteria andSeedealIsNotNull() {
            addCriterion("seedeal is not null");
            return (Criteria) this;
        }

        public Criteria andSeedealEqualTo(Integer value) {
            addCriterion("seedeal =", value, "seedeal");
            return (Criteria) this;
        }

        public Criteria andSeedealNotEqualTo(Integer value) {
            addCriterion("seedeal <>", value, "seedeal");
            return (Criteria) this;
        }

        public Criteria andSeedealGreaterThan(Integer value) {
            addCriterion("seedeal >", value, "seedeal");
            return (Criteria) this;
        }

        public Criteria andSeedealGreaterThanOrEqualTo(Integer value) {
            addCriterion("seedeal >=", value, "seedeal");
            return (Criteria) this;
        }

        public Criteria andSeedealLessThan(Integer value) {
            addCriterion("seedeal <", value, "seedeal");
            return (Criteria) this;
        }

        public Criteria andSeedealLessThanOrEqualTo(Integer value) {
            addCriterion("seedeal <=", value, "seedeal");
            return (Criteria) this;
        }

        public Criteria andSeedealIn(List<Integer> values) {
            addCriterion("seedeal in", values, "seedeal");
            return (Criteria) this;
        }

        public Criteria andSeedealNotIn(List<Integer> values) {
            addCriterion("seedeal not in", values, "seedeal");
            return (Criteria) this;
        }

        public Criteria andSeedealBetween(Integer value1, Integer value2) {
            addCriterion("seedeal between", value1, value2, "seedeal");
            return (Criteria) this;
        }

        public Criteria andSeedealNotBetween(Integer value1, Integer value2) {
            addCriterion("seedeal not between", value1, value2, "seedeal");
            return (Criteria) this;
        }

        public Criteria andSeeclaimIsNull() {
            addCriterion("seeclaim is null");
            return (Criteria) this;
        }

        public Criteria andSeeclaimIsNotNull() {
            addCriterion("seeclaim is not null");
            return (Criteria) this;
        }

        public Criteria andSeeclaimEqualTo(Integer value) {
            addCriterion("seeclaim =", value, "seeclaim");
            return (Criteria) this;
        }

        public Criteria andSeeclaimNotEqualTo(Integer value) {
            addCriterion("seeclaim <>", value, "seeclaim");
            return (Criteria) this;
        }

        public Criteria andSeeclaimGreaterThan(Integer value) {
            addCriterion("seeclaim >", value, "seeclaim");
            return (Criteria) this;
        }

        public Criteria andSeeclaimGreaterThanOrEqualTo(Integer value) {
            addCriterion("seeclaim >=", value, "seeclaim");
            return (Criteria) this;
        }

        public Criteria andSeeclaimLessThan(Integer value) {
            addCriterion("seeclaim <", value, "seeclaim");
            return (Criteria) this;
        }

        public Criteria andSeeclaimLessThanOrEqualTo(Integer value) {
            addCriterion("seeclaim <=", value, "seeclaim");
            return (Criteria) this;
        }

        public Criteria andSeeclaimIn(List<Integer> values) {
            addCriterion("seeclaim in", values, "seeclaim");
            return (Criteria) this;
        }

        public Criteria andSeeclaimNotIn(List<Integer> values) {
            addCriterion("seeclaim not in", values, "seeclaim");
            return (Criteria) this;
        }

        public Criteria andSeeclaimBetween(Integer value1, Integer value2) {
            addCriterion("seeclaim between", value1, value2, "seeclaim");
            return (Criteria) this;
        }

        public Criteria andSeeclaimNotBetween(Integer value1, Integer value2) {
            addCriterion("seeclaim not between", value1, value2, "seeclaim");
            return (Criteria) this;
        }

        public Criteria andSeeinsuranceIsNull() {
            addCriterion("seeinsurance is null");
            return (Criteria) this;
        }

        public Criteria andSeeinsuranceIsNotNull() {
            addCriterion("seeinsurance is not null");
            return (Criteria) this;
        }

        public Criteria andSeeinsuranceEqualTo(Integer value) {
            addCriterion("seeinsurance =", value, "seeinsurance");
            return (Criteria) this;
        }

        public Criteria andSeeinsuranceNotEqualTo(Integer value) {
            addCriterion("seeinsurance <>", value, "seeinsurance");
            return (Criteria) this;
        }

        public Criteria andSeeinsuranceGreaterThan(Integer value) {
            addCriterion("seeinsurance >", value, "seeinsurance");
            return (Criteria) this;
        }

        public Criteria andSeeinsuranceGreaterThanOrEqualTo(Integer value) {
            addCriterion("seeinsurance >=", value, "seeinsurance");
            return (Criteria) this;
        }

        public Criteria andSeeinsuranceLessThan(Integer value) {
            addCriterion("seeinsurance <", value, "seeinsurance");
            return (Criteria) this;
        }

        public Criteria andSeeinsuranceLessThanOrEqualTo(Integer value) {
            addCriterion("seeinsurance <=", value, "seeinsurance");
            return (Criteria) this;
        }

        public Criteria andSeeinsuranceIn(List<Integer> values) {
            addCriterion("seeinsurance in", values, "seeinsurance");
            return (Criteria) this;
        }

        public Criteria andSeeinsuranceNotIn(List<Integer> values) {
            addCriterion("seeinsurance not in", values, "seeinsurance");
            return (Criteria) this;
        }

        public Criteria andSeeinsuranceBetween(Integer value1, Integer value2) {
            addCriterion("seeinsurance between", value1, value2, "seeinsurance");
            return (Criteria) this;
        }

        public Criteria andSeeinsuranceNotBetween(Integer value1, Integer value2) {
            addCriterion("seeinsurance not between", value1, value2, "seeinsurance");
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