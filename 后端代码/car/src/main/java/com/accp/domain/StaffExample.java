package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("sid like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("sid not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSsexIsNull() {
            addCriterion("ssex is null");
            return (Criteria) this;
        }

        public Criteria andSsexIsNotNull() {
            addCriterion("ssex is not null");
            return (Criteria) this;
        }

        public Criteria andSsexEqualTo(String value) {
            addCriterion("ssex =", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotEqualTo(String value) {
            addCriterion("ssex <>", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThan(String value) {
            addCriterion("ssex >", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThanOrEqualTo(String value) {
            addCriterion("ssex >=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThan(String value) {
            addCriterion("ssex <", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThanOrEqualTo(String value) {
            addCriterion("ssex <=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLike(String value) {
            addCriterion("ssex like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotLike(String value) {
            addCriterion("ssex not like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexIn(List<String> values) {
            addCriterion("ssex in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotIn(List<String> values) {
            addCriterion("ssex not in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexBetween(String value1, String value2) {
            addCriterion("ssex between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotBetween(String value1, String value2) {
            addCriterion("ssex not between", value1, value2, "ssex");
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

        public Criteria andSusernameIsNull() {
            addCriterion("susername is null");
            return (Criteria) this;
        }

        public Criteria andSusernameIsNotNull() {
            addCriterion("susername is not null");
            return (Criteria) this;
        }

        public Criteria andSusernameEqualTo(String value) {
            addCriterion("susername =", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameNotEqualTo(String value) {
            addCriterion("susername <>", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameGreaterThan(String value) {
            addCriterion("susername >", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameGreaterThanOrEqualTo(String value) {
            addCriterion("susername >=", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameLessThan(String value) {
            addCriterion("susername <", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameLessThanOrEqualTo(String value) {
            addCriterion("susername <=", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameLike(String value) {
            addCriterion("susername like", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameNotLike(String value) {
            addCriterion("susername not like", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameIn(List<String> values) {
            addCriterion("susername in", values, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameNotIn(List<String> values) {
            addCriterion("susername not in", values, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameBetween(String value1, String value2) {
            addCriterion("susername between", value1, value2, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameNotBetween(String value1, String value2) {
            addCriterion("susername not between", value1, value2, "susername");
            return (Criteria) this;
        }

        public Criteria andStnidIsNull() {
            addCriterion("stnid is null");
            return (Criteria) this;
        }

        public Criteria andStnidIsNotNull() {
            addCriterion("stnid is not null");
            return (Criteria) this;
        }

        public Criteria andStnidEqualTo(Integer value) {
            addCriterion("stnid =", value, "stnid");
            return (Criteria) this;
        }

        public Criteria andStnidNotEqualTo(Integer value) {
            addCriterion("stnid <>", value, "stnid");
            return (Criteria) this;
        }

        public Criteria andStnidGreaterThan(Integer value) {
            addCriterion("stnid >", value, "stnid");
            return (Criteria) this;
        }

        public Criteria andStnidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stnid >=", value, "stnid");
            return (Criteria) this;
        }

        public Criteria andStnidLessThan(Integer value) {
            addCriterion("stnid <", value, "stnid");
            return (Criteria) this;
        }

        public Criteria andStnidLessThanOrEqualTo(Integer value) {
            addCriterion("stnid <=", value, "stnid");
            return (Criteria) this;
        }

        public Criteria andStnidIn(List<Integer> values) {
            addCriterion("stnid in", values, "stnid");
            return (Criteria) this;
        }

        public Criteria andStnidNotIn(List<Integer> values) {
            addCriterion("stnid not in", values, "stnid");
            return (Criteria) this;
        }

        public Criteria andStnidBetween(Integer value1, Integer value2) {
            addCriterion("stnid between", value1, value2, "stnid");
            return (Criteria) this;
        }

        public Criteria andStnidNotBetween(Integer value1, Integer value2) {
            addCriterion("stnid not between", value1, value2, "stnid");
            return (Criteria) this;
        }

        public Criteria andSbodyIsNull() {
            addCriterion("sbody is null");
            return (Criteria) this;
        }

        public Criteria andSbodyIsNotNull() {
            addCriterion("sbody is not null");
            return (Criteria) this;
        }

        public Criteria andSbodyEqualTo(String value) {
            addCriterion("sbody =", value, "sbody");
            return (Criteria) this;
        }

        public Criteria andSbodyNotEqualTo(String value) {
            addCriterion("sbody <>", value, "sbody");
            return (Criteria) this;
        }

        public Criteria andSbodyGreaterThan(String value) {
            addCriterion("sbody >", value, "sbody");
            return (Criteria) this;
        }

        public Criteria andSbodyGreaterThanOrEqualTo(String value) {
            addCriterion("sbody >=", value, "sbody");
            return (Criteria) this;
        }

        public Criteria andSbodyLessThan(String value) {
            addCriterion("sbody <", value, "sbody");
            return (Criteria) this;
        }

        public Criteria andSbodyLessThanOrEqualTo(String value) {
            addCriterion("sbody <=", value, "sbody");
            return (Criteria) this;
        }

        public Criteria andSbodyLike(String value) {
            addCriterion("sbody like", value, "sbody");
            return (Criteria) this;
        }

        public Criteria andSbodyNotLike(String value) {
            addCriterion("sbody not like", value, "sbody");
            return (Criteria) this;
        }

        public Criteria andSbodyIn(List<String> values) {
            addCriterion("sbody in", values, "sbody");
            return (Criteria) this;
        }

        public Criteria andSbodyNotIn(List<String> values) {
            addCriterion("sbody not in", values, "sbody");
            return (Criteria) this;
        }

        public Criteria andSbodyBetween(String value1, String value2) {
            addCriterion("sbody between", value1, value2, "sbody");
            return (Criteria) this;
        }

        public Criteria andSbodyNotBetween(String value1, String value2) {
            addCriterion("sbody not between", value1, value2, "sbody");
            return (Criteria) this;
        }

        public Criteria andSheightIsNull() {
            addCriterion("sheight is null");
            return (Criteria) this;
        }

        public Criteria andSheightIsNotNull() {
            addCriterion("sheight is not null");
            return (Criteria) this;
        }

        public Criteria andSheightEqualTo(String value) {
            addCriterion("sheight =", value, "sheight");
            return (Criteria) this;
        }

        public Criteria andSheightNotEqualTo(String value) {
            addCriterion("sheight <>", value, "sheight");
            return (Criteria) this;
        }

        public Criteria andSheightGreaterThan(String value) {
            addCriterion("sheight >", value, "sheight");
            return (Criteria) this;
        }

        public Criteria andSheightGreaterThanOrEqualTo(String value) {
            addCriterion("sheight >=", value, "sheight");
            return (Criteria) this;
        }

        public Criteria andSheightLessThan(String value) {
            addCriterion("sheight <", value, "sheight");
            return (Criteria) this;
        }

        public Criteria andSheightLessThanOrEqualTo(String value) {
            addCriterion("sheight <=", value, "sheight");
            return (Criteria) this;
        }

        public Criteria andSheightLike(String value) {
            addCriterion("sheight like", value, "sheight");
            return (Criteria) this;
        }

        public Criteria andSheightNotLike(String value) {
            addCriterion("sheight not like", value, "sheight");
            return (Criteria) this;
        }

        public Criteria andSheightIn(List<String> values) {
            addCriterion("sheight in", values, "sheight");
            return (Criteria) this;
        }

        public Criteria andSheightNotIn(List<String> values) {
            addCriterion("sheight not in", values, "sheight");
            return (Criteria) this;
        }

        public Criteria andSheightBetween(String value1, String value2) {
            addCriterion("sheight between", value1, value2, "sheight");
            return (Criteria) this;
        }

        public Criteria andSheightNotBetween(String value1, String value2) {
            addCriterion("sheight not between", value1, value2, "sheight");
            return (Criteria) this;
        }

        public Criteria andSnativeIsNull() {
            addCriterion("snative is null");
            return (Criteria) this;
        }

        public Criteria andSnativeIsNotNull() {
            addCriterion("snative is not null");
            return (Criteria) this;
        }

        public Criteria andSnativeEqualTo(String value) {
            addCriterion("snative =", value, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeNotEqualTo(String value) {
            addCriterion("snative <>", value, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeGreaterThan(String value) {
            addCriterion("snative >", value, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeGreaterThanOrEqualTo(String value) {
            addCriterion("snative >=", value, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeLessThan(String value) {
            addCriterion("snative <", value, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeLessThanOrEqualTo(String value) {
            addCriterion("snative <=", value, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeLike(String value) {
            addCriterion("snative like", value, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeNotLike(String value) {
            addCriterion("snative not like", value, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeIn(List<String> values) {
            addCriterion("snative in", values, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeNotIn(List<String> values) {
            addCriterion("snative not in", values, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeBetween(String value1, String value2) {
            addCriterion("snative between", value1, value2, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeNotBetween(String value1, String value2) {
            addCriterion("snative not between", value1, value2, "snative");
            return (Criteria) this;
        }

        public Criteria andSnationIsNull() {
            addCriterion("snation is null");
            return (Criteria) this;
        }

        public Criteria andSnationIsNotNull() {
            addCriterion("snation is not null");
            return (Criteria) this;
        }

        public Criteria andSnationEqualTo(String value) {
            addCriterion("snation =", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationNotEqualTo(String value) {
            addCriterion("snation <>", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationGreaterThan(String value) {
            addCriterion("snation >", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationGreaterThanOrEqualTo(String value) {
            addCriterion("snation >=", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationLessThan(String value) {
            addCriterion("snation <", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationLessThanOrEqualTo(String value) {
            addCriterion("snation <=", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationLike(String value) {
            addCriterion("snation like", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationNotLike(String value) {
            addCriterion("snation not like", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationIn(List<String> values) {
            addCriterion("snation in", values, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationNotIn(List<String> values) {
            addCriterion("snation not in", values, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationBetween(String value1, String value2) {
            addCriterion("snation between", value1, value2, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationNotBetween(String value1, String value2) {
            addCriterion("snation not between", value1, value2, "snation");
            return (Criteria) this;
        }

        public Criteria andSmarriageIsNull() {
            addCriterion("smarriage is null");
            return (Criteria) this;
        }

        public Criteria andSmarriageIsNotNull() {
            addCriterion("smarriage is not null");
            return (Criteria) this;
        }

        public Criteria andSmarriageEqualTo(String value) {
            addCriterion("smarriage =", value, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageNotEqualTo(String value) {
            addCriterion("smarriage <>", value, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageGreaterThan(String value) {
            addCriterion("smarriage >", value, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageGreaterThanOrEqualTo(String value) {
            addCriterion("smarriage >=", value, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageLessThan(String value) {
            addCriterion("smarriage <", value, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageLessThanOrEqualTo(String value) {
            addCriterion("smarriage <=", value, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageLike(String value) {
            addCriterion("smarriage like", value, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageNotLike(String value) {
            addCriterion("smarriage not like", value, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageIn(List<String> values) {
            addCriterion("smarriage in", values, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageNotIn(List<String> values) {
            addCriterion("smarriage not in", values, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageBetween(String value1, String value2) {
            addCriterion("smarriage between", value1, value2, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSmarriageNotBetween(String value1, String value2) {
            addCriterion("smarriage not between", value1, value2, "smarriage");
            return (Criteria) this;
        }

        public Criteria andSeducationIsNull() {
            addCriterion("seducation is null");
            return (Criteria) this;
        }

        public Criteria andSeducationIsNotNull() {
            addCriterion("seducation is not null");
            return (Criteria) this;
        }

        public Criteria andSeducationEqualTo(String value) {
            addCriterion("seducation =", value, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationNotEqualTo(String value) {
            addCriterion("seducation <>", value, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationGreaterThan(String value) {
            addCriterion("seducation >", value, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationGreaterThanOrEqualTo(String value) {
            addCriterion("seducation >=", value, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationLessThan(String value) {
            addCriterion("seducation <", value, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationLessThanOrEqualTo(String value) {
            addCriterion("seducation <=", value, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationLike(String value) {
            addCriterion("seducation like", value, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationNotLike(String value) {
            addCriterion("seducation not like", value, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationIn(List<String> values) {
            addCriterion("seducation in", values, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationNotIn(List<String> values) {
            addCriterion("seducation not in", values, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationBetween(String value1, String value2) {
            addCriterion("seducation between", value1, value2, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationNotBetween(String value1, String value2) {
            addCriterion("seducation not between", value1, value2, "seducation");
            return (Criteria) this;
        }

        public Criteria andSschoolIsNull() {
            addCriterion("sschool is null");
            return (Criteria) this;
        }

        public Criteria andSschoolIsNotNull() {
            addCriterion("sschool is not null");
            return (Criteria) this;
        }

        public Criteria andSschoolEqualTo(String value) {
            addCriterion("sschool =", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolNotEqualTo(String value) {
            addCriterion("sschool <>", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolGreaterThan(String value) {
            addCriterion("sschool >", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolGreaterThanOrEqualTo(String value) {
            addCriterion("sschool >=", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolLessThan(String value) {
            addCriterion("sschool <", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolLessThanOrEqualTo(String value) {
            addCriterion("sschool <=", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolLike(String value) {
            addCriterion("sschool like", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolNotLike(String value) {
            addCriterion("sschool not like", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolIn(List<String> values) {
            addCriterion("sschool in", values, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolNotIn(List<String> values) {
            addCriterion("sschool not in", values, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolBetween(String value1, String value2) {
            addCriterion("sschool between", value1, value2, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolNotBetween(String value1, String value2) {
            addCriterion("sschool not between", value1, value2, "sschool");
            return (Criteria) this;
        }

        public Criteria andSmajorIsNull() {
            addCriterion("smajor is null");
            return (Criteria) this;
        }

        public Criteria andSmajorIsNotNull() {
            addCriterion("smajor is not null");
            return (Criteria) this;
        }

        public Criteria andSmajorEqualTo(String value) {
            addCriterion("smajor =", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorNotEqualTo(String value) {
            addCriterion("smajor <>", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorGreaterThan(String value) {
            addCriterion("smajor >", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorGreaterThanOrEqualTo(String value) {
            addCriterion("smajor >=", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorLessThan(String value) {
            addCriterion("smajor <", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorLessThanOrEqualTo(String value) {
            addCriterion("smajor <=", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorLike(String value) {
            addCriterion("smajor like", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorNotLike(String value) {
            addCriterion("smajor not like", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorIn(List<String> values) {
            addCriterion("smajor in", values, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorNotIn(List<String> values) {
            addCriterion("smajor not in", values, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorBetween(String value1, String value2) {
            addCriterion("smajor between", value1, value2, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorNotBetween(String value1, String value2) {
            addCriterion("smajor not between", value1, value2, "smajor");
            return (Criteria) this;
        }

        public Criteria andSstatusIsNull() {
            addCriterion("sstatus is null");
            return (Criteria) this;
        }

        public Criteria andSstatusIsNotNull() {
            addCriterion("sstatus is not null");
            return (Criteria) this;
        }

        public Criteria andSstatusEqualTo(String value) {
            addCriterion("sstatus =", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotEqualTo(String value) {
            addCriterion("sstatus <>", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusGreaterThan(String value) {
            addCriterion("sstatus >", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusGreaterThanOrEqualTo(String value) {
            addCriterion("sstatus >=", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusLessThan(String value) {
            addCriterion("sstatus <", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusLessThanOrEqualTo(String value) {
            addCriterion("sstatus <=", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusLike(String value) {
            addCriterion("sstatus like", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotLike(String value) {
            addCriterion("sstatus not like", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusIn(List<String> values) {
            addCriterion("sstatus in", values, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotIn(List<String> values) {
            addCriterion("sstatus not in", values, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusBetween(String value1, String value2) {
            addCriterion("sstatus between", value1, value2, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotBetween(String value1, String value2) {
            addCriterion("sstatus not between", value1, value2, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSpropertyIsNull() {
            addCriterion("sproperty is null");
            return (Criteria) this;
        }

        public Criteria andSpropertyIsNotNull() {
            addCriterion("sproperty is not null");
            return (Criteria) this;
        }

        public Criteria andSpropertyEqualTo(String value) {
            addCriterion("sproperty =", value, "sproperty");
            return (Criteria) this;
        }

        public Criteria andSpropertyNotEqualTo(String value) {
            addCriterion("sproperty <>", value, "sproperty");
            return (Criteria) this;
        }

        public Criteria andSpropertyGreaterThan(String value) {
            addCriterion("sproperty >", value, "sproperty");
            return (Criteria) this;
        }

        public Criteria andSpropertyGreaterThanOrEqualTo(String value) {
            addCriterion("sproperty >=", value, "sproperty");
            return (Criteria) this;
        }

        public Criteria andSpropertyLessThan(String value) {
            addCriterion("sproperty <", value, "sproperty");
            return (Criteria) this;
        }

        public Criteria andSpropertyLessThanOrEqualTo(String value) {
            addCriterion("sproperty <=", value, "sproperty");
            return (Criteria) this;
        }

        public Criteria andSpropertyLike(String value) {
            addCriterion("sproperty like", value, "sproperty");
            return (Criteria) this;
        }

        public Criteria andSpropertyNotLike(String value) {
            addCriterion("sproperty not like", value, "sproperty");
            return (Criteria) this;
        }

        public Criteria andSpropertyIn(List<String> values) {
            addCriterion("sproperty in", values, "sproperty");
            return (Criteria) this;
        }

        public Criteria andSpropertyNotIn(List<String> values) {
            addCriterion("sproperty not in", values, "sproperty");
            return (Criteria) this;
        }

        public Criteria andSpropertyBetween(String value1, String value2) {
            addCriterion("sproperty between", value1, value2, "sproperty");
            return (Criteria) this;
        }

        public Criteria andSpropertyNotBetween(String value1, String value2) {
            addCriterion("sproperty not between", value1, value2, "sproperty");
            return (Criteria) this;
        }

        public Criteria andSdegreeIsNull() {
            addCriterion("sdegree is null");
            return (Criteria) this;
        }

        public Criteria andSdegreeIsNotNull() {
            addCriterion("sdegree is not null");
            return (Criteria) this;
        }

        public Criteria andSdegreeEqualTo(String value) {
            addCriterion("sdegree =", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeNotEqualTo(String value) {
            addCriterion("sdegree <>", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeGreaterThan(String value) {
            addCriterion("sdegree >", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeGreaterThanOrEqualTo(String value) {
            addCriterion("sdegree >=", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeLessThan(String value) {
            addCriterion("sdegree <", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeLessThanOrEqualTo(String value) {
            addCriterion("sdegree <=", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeLike(String value) {
            addCriterion("sdegree like", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeNotLike(String value) {
            addCriterion("sdegree not like", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeIn(List<String> values) {
            addCriterion("sdegree in", values, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeNotIn(List<String> values) {
            addCriterion("sdegree not in", values, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeBetween(String value1, String value2) {
            addCriterion("sdegree between", value1, value2, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeNotBetween(String value1, String value2) {
            addCriterion("sdegree not between", value1, value2, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSauthorizedIsNull() {
            addCriterion("sauthorized is null");
            return (Criteria) this;
        }

        public Criteria andSauthorizedIsNotNull() {
            addCriterion("sauthorized is not null");
            return (Criteria) this;
        }

        public Criteria andSauthorizedEqualTo(String value) {
            addCriterion("sauthorized =", value, "sauthorized");
            return (Criteria) this;
        }

        public Criteria andSauthorizedNotEqualTo(String value) {
            addCriterion("sauthorized <>", value, "sauthorized");
            return (Criteria) this;
        }

        public Criteria andSauthorizedGreaterThan(String value) {
            addCriterion("sauthorized >", value, "sauthorized");
            return (Criteria) this;
        }

        public Criteria andSauthorizedGreaterThanOrEqualTo(String value) {
            addCriterion("sauthorized >=", value, "sauthorized");
            return (Criteria) this;
        }

        public Criteria andSauthorizedLessThan(String value) {
            addCriterion("sauthorized <", value, "sauthorized");
            return (Criteria) this;
        }

        public Criteria andSauthorizedLessThanOrEqualTo(String value) {
            addCriterion("sauthorized <=", value, "sauthorized");
            return (Criteria) this;
        }

        public Criteria andSauthorizedLike(String value) {
            addCriterion("sauthorized like", value, "sauthorized");
            return (Criteria) this;
        }

        public Criteria andSauthorizedNotLike(String value) {
            addCriterion("sauthorized not like", value, "sauthorized");
            return (Criteria) this;
        }

        public Criteria andSauthorizedIn(List<String> values) {
            addCriterion("sauthorized in", values, "sauthorized");
            return (Criteria) this;
        }

        public Criteria andSauthorizedNotIn(List<String> values) {
            addCriterion("sauthorized not in", values, "sauthorized");
            return (Criteria) this;
        }

        public Criteria andSauthorizedBetween(String value1, String value2) {
            addCriterion("sauthorized between", value1, value2, "sauthorized");
            return (Criteria) this;
        }

        public Criteria andSauthorizedNotBetween(String value1, String value2) {
            addCriterion("sauthorized not between", value1, value2, "sauthorized");
            return (Criteria) this;
        }

        public Criteria andSidentityIsNull() {
            addCriterion("sidentity is null");
            return (Criteria) this;
        }

        public Criteria andSidentityIsNotNull() {
            addCriterion("sidentity is not null");
            return (Criteria) this;
        }

        public Criteria andSidentityEqualTo(String value) {
            addCriterion("sidentity =", value, "sidentity");
            return (Criteria) this;
        }

        public Criteria andSidentityNotEqualTo(String value) {
            addCriterion("sidentity <>", value, "sidentity");
            return (Criteria) this;
        }

        public Criteria andSidentityGreaterThan(String value) {
            addCriterion("sidentity >", value, "sidentity");
            return (Criteria) this;
        }

        public Criteria andSidentityGreaterThanOrEqualTo(String value) {
            addCriterion("sidentity >=", value, "sidentity");
            return (Criteria) this;
        }

        public Criteria andSidentityLessThan(String value) {
            addCriterion("sidentity <", value, "sidentity");
            return (Criteria) this;
        }

        public Criteria andSidentityLessThanOrEqualTo(String value) {
            addCriterion("sidentity <=", value, "sidentity");
            return (Criteria) this;
        }

        public Criteria andSidentityLike(String value) {
            addCriterion("sidentity like", value, "sidentity");
            return (Criteria) this;
        }

        public Criteria andSidentityNotLike(String value) {
            addCriterion("sidentity not like", value, "sidentity");
            return (Criteria) this;
        }

        public Criteria andSidentityIn(List<String> values) {
            addCriterion("sidentity in", values, "sidentity");
            return (Criteria) this;
        }

        public Criteria andSidentityNotIn(List<String> values) {
            addCriterion("sidentity not in", values, "sidentity");
            return (Criteria) this;
        }

        public Criteria andSidentityBetween(String value1, String value2) {
            addCriterion("sidentity between", value1, value2, "sidentity");
            return (Criteria) this;
        }

        public Criteria andSidentityNotBetween(String value1, String value2) {
            addCriterion("sidentity not between", value1, value2, "sidentity");
            return (Criteria) this;
        }

        public Criteria andSregisteredIsNull() {
            addCriterion("sregistered is null");
            return (Criteria) this;
        }

        public Criteria andSregisteredIsNotNull() {
            addCriterion("sregistered is not null");
            return (Criteria) this;
        }

        public Criteria andSregisteredEqualTo(String value) {
            addCriterion("sregistered =", value, "sregistered");
            return (Criteria) this;
        }

        public Criteria andSregisteredNotEqualTo(String value) {
            addCriterion("sregistered <>", value, "sregistered");
            return (Criteria) this;
        }

        public Criteria andSregisteredGreaterThan(String value) {
            addCriterion("sregistered >", value, "sregistered");
            return (Criteria) this;
        }

        public Criteria andSregisteredGreaterThanOrEqualTo(String value) {
            addCriterion("sregistered >=", value, "sregistered");
            return (Criteria) this;
        }

        public Criteria andSregisteredLessThan(String value) {
            addCriterion("sregistered <", value, "sregistered");
            return (Criteria) this;
        }

        public Criteria andSregisteredLessThanOrEqualTo(String value) {
            addCriterion("sregistered <=", value, "sregistered");
            return (Criteria) this;
        }

        public Criteria andSregisteredLike(String value) {
            addCriterion("sregistered like", value, "sregistered");
            return (Criteria) this;
        }

        public Criteria andSregisteredNotLike(String value) {
            addCriterion("sregistered not like", value, "sregistered");
            return (Criteria) this;
        }

        public Criteria andSregisteredIn(List<String> values) {
            addCriterion("sregistered in", values, "sregistered");
            return (Criteria) this;
        }

        public Criteria andSregisteredNotIn(List<String> values) {
            addCriterion("sregistered not in", values, "sregistered");
            return (Criteria) this;
        }

        public Criteria andSregisteredBetween(String value1, String value2) {
            addCriterion("sregistered between", value1, value2, "sregistered");
            return (Criteria) this;
        }

        public Criteria andSregisteredNotBetween(String value1, String value2) {
            addCriterion("sregistered not between", value1, value2, "sregistered");
            return (Criteria) this;
        }

        public Criteria andSpresentIsNull() {
            addCriterion("spresent is null");
            return (Criteria) this;
        }

        public Criteria andSpresentIsNotNull() {
            addCriterion("spresent is not null");
            return (Criteria) this;
        }

        public Criteria andSpresentEqualTo(String value) {
            addCriterion("spresent =", value, "spresent");
            return (Criteria) this;
        }

        public Criteria andSpresentNotEqualTo(String value) {
            addCriterion("spresent <>", value, "spresent");
            return (Criteria) this;
        }

        public Criteria andSpresentGreaterThan(String value) {
            addCriterion("spresent >", value, "spresent");
            return (Criteria) this;
        }

        public Criteria andSpresentGreaterThanOrEqualTo(String value) {
            addCriterion("spresent >=", value, "spresent");
            return (Criteria) this;
        }

        public Criteria andSpresentLessThan(String value) {
            addCriterion("spresent <", value, "spresent");
            return (Criteria) this;
        }

        public Criteria andSpresentLessThanOrEqualTo(String value) {
            addCriterion("spresent <=", value, "spresent");
            return (Criteria) this;
        }

        public Criteria andSpresentLike(String value) {
            addCriterion("spresent like", value, "spresent");
            return (Criteria) this;
        }

        public Criteria andSpresentNotLike(String value) {
            addCriterion("spresent not like", value, "spresent");
            return (Criteria) this;
        }

        public Criteria andSpresentIn(List<String> values) {
            addCriterion("spresent in", values, "spresent");
            return (Criteria) this;
        }

        public Criteria andSpresentNotIn(List<String> values) {
            addCriterion("spresent not in", values, "spresent");
            return (Criteria) this;
        }

        public Criteria andSpresentBetween(String value1, String value2) {
            addCriterion("spresent between", value1, value2, "spresent");
            return (Criteria) this;
        }

        public Criteria andSpresentNotBetween(String value1, String value2) {
            addCriterion("spresent not between", value1, value2, "spresent");
            return (Criteria) this;
        }

        public Criteria andSphoneIsNull() {
            addCriterion("sphone is null");
            return (Criteria) this;
        }

        public Criteria andSphoneIsNotNull() {
            addCriterion("sphone is not null");
            return (Criteria) this;
        }

        public Criteria andSphoneEqualTo(String value) {
            addCriterion("sphone =", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotEqualTo(String value) {
            addCriterion("sphone <>", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneGreaterThan(String value) {
            addCriterion("sphone >", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneGreaterThanOrEqualTo(String value) {
            addCriterion("sphone >=", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLessThan(String value) {
            addCriterion("sphone <", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLessThanOrEqualTo(String value) {
            addCriterion("sphone <=", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLike(String value) {
            addCriterion("sphone like", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotLike(String value) {
            addCriterion("sphone not like", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneIn(List<String> values) {
            addCriterion("sphone in", values, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotIn(List<String> values) {
            addCriterion("sphone not in", values, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneBetween(String value1, String value2) {
            addCriterion("sphone between", value1, value2, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotBetween(String value1, String value2) {
            addCriterion("sphone not between", value1, value2, "sphone");
            return (Criteria) this;
        }

        public Criteria andSnumberIsNull() {
            addCriterion("snumber is null");
            return (Criteria) this;
        }

        public Criteria andSnumberIsNotNull() {
            addCriterion("snumber is not null");
            return (Criteria) this;
        }

        public Criteria andSnumberEqualTo(String value) {
            addCriterion("snumber =", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberNotEqualTo(String value) {
            addCriterion("snumber <>", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberGreaterThan(String value) {
            addCriterion("snumber >", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberGreaterThanOrEqualTo(String value) {
            addCriterion("snumber >=", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberLessThan(String value) {
            addCriterion("snumber <", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberLessThanOrEqualTo(String value) {
            addCriterion("snumber <=", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberLike(String value) {
            addCriterion("snumber like", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberNotLike(String value) {
            addCriterion("snumber not like", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberIn(List<String> values) {
            addCriterion("snumber in", values, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberNotIn(List<String> values) {
            addCriterion("snumber not in", values, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberBetween(String value1, String value2) {
            addCriterion("snumber between", value1, value2, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberNotBetween(String value1, String value2) {
            addCriterion("snumber not between", value1, value2, "snumber");
            return (Criteria) this;
        }

        public Criteria andSemailIsNull() {
            addCriterion("semail is null");
            return (Criteria) this;
        }

        public Criteria andSemailIsNotNull() {
            addCriterion("semail is not null");
            return (Criteria) this;
        }

        public Criteria andSemailEqualTo(String value) {
            addCriterion("semail =", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailNotEqualTo(String value) {
            addCriterion("semail <>", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailGreaterThan(String value) {
            addCriterion("semail >", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailGreaterThanOrEqualTo(String value) {
            addCriterion("semail >=", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailLessThan(String value) {
            addCriterion("semail <", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailLessThanOrEqualTo(String value) {
            addCriterion("semail <=", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailLike(String value) {
            addCriterion("semail like", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailNotLike(String value) {
            addCriterion("semail not like", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailIn(List<String> values) {
            addCriterion("semail in", values, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailNotIn(List<String> values) {
            addCriterion("semail not in", values, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailBetween(String value1, String value2) {
            addCriterion("semail between", value1, value2, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailNotBetween(String value1, String value2) {
            addCriterion("semail not between", value1, value2, "semail");
            return (Criteria) this;
        }

        public Criteria andSbankIsNull() {
            addCriterion("sbank is null");
            return (Criteria) this;
        }

        public Criteria andSbankIsNotNull() {
            addCriterion("sbank is not null");
            return (Criteria) this;
        }

        public Criteria andSbankEqualTo(String value) {
            addCriterion("sbank =", value, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankNotEqualTo(String value) {
            addCriterion("sbank <>", value, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankGreaterThan(String value) {
            addCriterion("sbank >", value, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankGreaterThanOrEqualTo(String value) {
            addCriterion("sbank >=", value, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankLessThan(String value) {
            addCriterion("sbank <", value, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankLessThanOrEqualTo(String value) {
            addCriterion("sbank <=", value, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankLike(String value) {
            addCriterion("sbank like", value, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankNotLike(String value) {
            addCriterion("sbank not like", value, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankIn(List<String> values) {
            addCriterion("sbank in", values, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankNotIn(List<String> values) {
            addCriterion("sbank not in", values, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankBetween(String value1, String value2) {
            addCriterion("sbank between", value1, value2, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankNotBetween(String value1, String value2) {
            addCriterion("sbank not between", value1, value2, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankaccountIsNull() {
            addCriterion("sbankaccount is null");
            return (Criteria) this;
        }

        public Criteria andSbankaccountIsNotNull() {
            addCriterion("sbankaccount is not null");
            return (Criteria) this;
        }

        public Criteria andSbankaccountEqualTo(String value) {
            addCriterion("sbankaccount =", value, "sbankaccount");
            return (Criteria) this;
        }

        public Criteria andSbankaccountNotEqualTo(String value) {
            addCriterion("sbankaccount <>", value, "sbankaccount");
            return (Criteria) this;
        }

        public Criteria andSbankaccountGreaterThan(String value) {
            addCriterion("sbankaccount >", value, "sbankaccount");
            return (Criteria) this;
        }

        public Criteria andSbankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("sbankaccount >=", value, "sbankaccount");
            return (Criteria) this;
        }

        public Criteria andSbankaccountLessThan(String value) {
            addCriterion("sbankaccount <", value, "sbankaccount");
            return (Criteria) this;
        }

        public Criteria andSbankaccountLessThanOrEqualTo(String value) {
            addCriterion("sbankaccount <=", value, "sbankaccount");
            return (Criteria) this;
        }

        public Criteria andSbankaccountLike(String value) {
            addCriterion("sbankaccount like", value, "sbankaccount");
            return (Criteria) this;
        }

        public Criteria andSbankaccountNotLike(String value) {
            addCriterion("sbankaccount not like", value, "sbankaccount");
            return (Criteria) this;
        }

        public Criteria andSbankaccountIn(List<String> values) {
            addCriterion("sbankaccount in", values, "sbankaccount");
            return (Criteria) this;
        }

        public Criteria andSbankaccountNotIn(List<String> values) {
            addCriterion("sbankaccount not in", values, "sbankaccount");
            return (Criteria) this;
        }

        public Criteria andSbankaccountBetween(String value1, String value2) {
            addCriterion("sbankaccount between", value1, value2, "sbankaccount");
            return (Criteria) this;
        }

        public Criteria andSbankaccountNotBetween(String value1, String value2) {
            addCriterion("sbankaccount not between", value1, value2, "sbankaccount");
            return (Criteria) this;
        }

        public Criteria andSurgencyIsNull() {
            addCriterion("surgency is null");
            return (Criteria) this;
        }

        public Criteria andSurgencyIsNotNull() {
            addCriterion("surgency is not null");
            return (Criteria) this;
        }

        public Criteria andSurgencyEqualTo(String value) {
            addCriterion("surgency =", value, "surgency");
            return (Criteria) this;
        }

        public Criteria andSurgencyNotEqualTo(String value) {
            addCriterion("surgency <>", value, "surgency");
            return (Criteria) this;
        }

        public Criteria andSurgencyGreaterThan(String value) {
            addCriterion("surgency >", value, "surgency");
            return (Criteria) this;
        }

        public Criteria andSurgencyGreaterThanOrEqualTo(String value) {
            addCriterion("surgency >=", value, "surgency");
            return (Criteria) this;
        }

        public Criteria andSurgencyLessThan(String value) {
            addCriterion("surgency <", value, "surgency");
            return (Criteria) this;
        }

        public Criteria andSurgencyLessThanOrEqualTo(String value) {
            addCriterion("surgency <=", value, "surgency");
            return (Criteria) this;
        }

        public Criteria andSurgencyLike(String value) {
            addCriterion("surgency like", value, "surgency");
            return (Criteria) this;
        }

        public Criteria andSurgencyNotLike(String value) {
            addCriterion("surgency not like", value, "surgency");
            return (Criteria) this;
        }

        public Criteria andSurgencyIn(List<String> values) {
            addCriterion("surgency in", values, "surgency");
            return (Criteria) this;
        }

        public Criteria andSurgencyNotIn(List<String> values) {
            addCriterion("surgency not in", values, "surgency");
            return (Criteria) this;
        }

        public Criteria andSurgencyBetween(String value1, String value2) {
            addCriterion("surgency between", value1, value2, "surgency");
            return (Criteria) this;
        }

        public Criteria andSurgencyNotBetween(String value1, String value2) {
            addCriterion("surgency not between", value1, value2, "surgency");
            return (Criteria) this;
        }

        public Criteria andSurgencyphoneIsNull() {
            addCriterion("surgencyphone is null");
            return (Criteria) this;
        }

        public Criteria andSurgencyphoneIsNotNull() {
            addCriterion("surgencyphone is not null");
            return (Criteria) this;
        }

        public Criteria andSurgencyphoneEqualTo(String value) {
            addCriterion("surgencyphone =", value, "surgencyphone");
            return (Criteria) this;
        }

        public Criteria andSurgencyphoneNotEqualTo(String value) {
            addCriterion("surgencyphone <>", value, "surgencyphone");
            return (Criteria) this;
        }

        public Criteria andSurgencyphoneGreaterThan(String value) {
            addCriterion("surgencyphone >", value, "surgencyphone");
            return (Criteria) this;
        }

        public Criteria andSurgencyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("surgencyphone >=", value, "surgencyphone");
            return (Criteria) this;
        }

        public Criteria andSurgencyphoneLessThan(String value) {
            addCriterion("surgencyphone <", value, "surgencyphone");
            return (Criteria) this;
        }

        public Criteria andSurgencyphoneLessThanOrEqualTo(String value) {
            addCriterion("surgencyphone <=", value, "surgencyphone");
            return (Criteria) this;
        }

        public Criteria andSurgencyphoneLike(String value) {
            addCriterion("surgencyphone like", value, "surgencyphone");
            return (Criteria) this;
        }

        public Criteria andSurgencyphoneNotLike(String value) {
            addCriterion("surgencyphone not like", value, "surgencyphone");
            return (Criteria) this;
        }

        public Criteria andSurgencyphoneIn(List<String> values) {
            addCriterion("surgencyphone in", values, "surgencyphone");
            return (Criteria) this;
        }

        public Criteria andSurgencyphoneNotIn(List<String> values) {
            addCriterion("surgencyphone not in", values, "surgencyphone");
            return (Criteria) this;
        }

        public Criteria andSurgencyphoneBetween(String value1, String value2) {
            addCriterion("surgencyphone between", value1, value2, "surgencyphone");
            return (Criteria) this;
        }

        public Criteria andSurgencyphoneNotBetween(String value1, String value2) {
            addCriterion("surgencyphone not between", value1, value2, "surgencyphone");
            return (Criteria) this;
        }

        public Criteria andShiredateIsNull() {
            addCriterion("shiredate is null");
            return (Criteria) this;
        }

        public Criteria andShiredateIsNotNull() {
            addCriterion("shiredate is not null");
            return (Criteria) this;
        }

        public Criteria andShiredateEqualTo(String value) {
            addCriterion("shiredate =", value, "shiredate");
            return (Criteria) this;
        }

        public Criteria andShiredateNotEqualTo(String value) {
            addCriterion("shiredate <>", value, "shiredate");
            return (Criteria) this;
        }

        public Criteria andShiredateGreaterThan(String value) {
            addCriterion("shiredate >", value, "shiredate");
            return (Criteria) this;
        }

        public Criteria andShiredateGreaterThanOrEqualTo(String value) {
            addCriterion("shiredate >=", value, "shiredate");
            return (Criteria) this;
        }

        public Criteria andShiredateLessThan(String value) {
            addCriterion("shiredate <", value, "shiredate");
            return (Criteria) this;
        }

        public Criteria andShiredateLessThanOrEqualTo(String value) {
            addCriterion("shiredate <=", value, "shiredate");
            return (Criteria) this;
        }

        public Criteria andShiredateLike(String value) {
            addCriterion("shiredate like", value, "shiredate");
            return (Criteria) this;
        }

        public Criteria andShiredateNotLike(String value) {
            addCriterion("shiredate not like", value, "shiredate");
            return (Criteria) this;
        }

        public Criteria andShiredateIn(List<String> values) {
            addCriterion("shiredate in", values, "shiredate");
            return (Criteria) this;
        }

        public Criteria andShiredateNotIn(List<String> values) {
            addCriterion("shiredate not in", values, "shiredate");
            return (Criteria) this;
        }

        public Criteria andShiredateBetween(String value1, String value2) {
            addCriterion("shiredate between", value1, value2, "shiredate");
            return (Criteria) this;
        }

        public Criteria andShiredateNotBetween(String value1, String value2) {
            addCriterion("shiredate not between", value1, value2, "shiredate");
            return (Criteria) this;
        }

        public Criteria andSexpirationIsNull() {
            addCriterion("sexpiration is null");
            return (Criteria) this;
        }

        public Criteria andSexpirationIsNotNull() {
            addCriterion("sexpiration is not null");
            return (Criteria) this;
        }

        public Criteria andSexpirationEqualTo(String value) {
            addCriterion("sexpiration =", value, "sexpiration");
            return (Criteria) this;
        }

        public Criteria andSexpirationNotEqualTo(String value) {
            addCriterion("sexpiration <>", value, "sexpiration");
            return (Criteria) this;
        }

        public Criteria andSexpirationGreaterThan(String value) {
            addCriterion("sexpiration >", value, "sexpiration");
            return (Criteria) this;
        }

        public Criteria andSexpirationGreaterThanOrEqualTo(String value) {
            addCriterion("sexpiration >=", value, "sexpiration");
            return (Criteria) this;
        }

        public Criteria andSexpirationLessThan(String value) {
            addCriterion("sexpiration <", value, "sexpiration");
            return (Criteria) this;
        }

        public Criteria andSexpirationLessThanOrEqualTo(String value) {
            addCriterion("sexpiration <=", value, "sexpiration");
            return (Criteria) this;
        }

        public Criteria andSexpirationLike(String value) {
            addCriterion("sexpiration like", value, "sexpiration");
            return (Criteria) this;
        }

        public Criteria andSexpirationNotLike(String value) {
            addCriterion("sexpiration not like", value, "sexpiration");
            return (Criteria) this;
        }

        public Criteria andSexpirationIn(List<String> values) {
            addCriterion("sexpiration in", values, "sexpiration");
            return (Criteria) this;
        }

        public Criteria andSexpirationNotIn(List<String> values) {
            addCriterion("sexpiration not in", values, "sexpiration");
            return (Criteria) this;
        }

        public Criteria andSexpirationBetween(String value1, String value2) {
            addCriterion("sexpiration between", value1, value2, "sexpiration");
            return (Criteria) this;
        }

        public Criteria andSexpirationNotBetween(String value1, String value2) {
            addCriterion("sexpiration not between", value1, value2, "sexpiration");
            return (Criteria) this;
        }

        public Criteria andSbirthIsNull() {
            addCriterion("sbirth is null");
            return (Criteria) this;
        }

        public Criteria andSbirthIsNotNull() {
            addCriterion("sbirth is not null");
            return (Criteria) this;
        }

        public Criteria andSbirthEqualTo(String value) {
            addCriterion("sbirth =", value, "sbirth");
            return (Criteria) this;
        }

        public Criteria andSbirthNotEqualTo(String value) {
            addCriterion("sbirth <>", value, "sbirth");
            return (Criteria) this;
        }

        public Criteria andSbirthGreaterThan(String value) {
            addCriterion("sbirth >", value, "sbirth");
            return (Criteria) this;
        }

        public Criteria andSbirthGreaterThanOrEqualTo(String value) {
            addCriterion("sbirth >=", value, "sbirth");
            return (Criteria) this;
        }

        public Criteria andSbirthLessThan(String value) {
            addCriterion("sbirth <", value, "sbirth");
            return (Criteria) this;
        }

        public Criteria andSbirthLessThanOrEqualTo(String value) {
            addCriterion("sbirth <=", value, "sbirth");
            return (Criteria) this;
        }

        public Criteria andSbirthLike(String value) {
            addCriterion("sbirth like", value, "sbirth");
            return (Criteria) this;
        }

        public Criteria andSbirthNotLike(String value) {
            addCriterion("sbirth not like", value, "sbirth");
            return (Criteria) this;
        }

        public Criteria andSbirthIn(List<String> values) {
            addCriterion("sbirth in", values, "sbirth");
            return (Criteria) this;
        }

        public Criteria andSbirthNotIn(List<String> values) {
            addCriterion("sbirth not in", values, "sbirth");
            return (Criteria) this;
        }

        public Criteria andSbirthBetween(String value1, String value2) {
            addCriterion("sbirth between", value1, value2, "sbirth");
            return (Criteria) this;
        }

        public Criteria andSbirthNotBetween(String value1, String value2) {
            addCriterion("sbirth not between", value1, value2, "sbirth");
            return (Criteria) this;
        }

        public Criteria andSstartIsNull() {
            addCriterion("sstart is null");
            return (Criteria) this;
        }

        public Criteria andSstartIsNotNull() {
            addCriterion("sstart is not null");
            return (Criteria) this;
        }

        public Criteria andSstartEqualTo(String value) {
            addCriterion("sstart =", value, "sstart");
            return (Criteria) this;
        }

        public Criteria andSstartNotEqualTo(String value) {
            addCriterion("sstart <>", value, "sstart");
            return (Criteria) this;
        }

        public Criteria andSstartGreaterThan(String value) {
            addCriterion("sstart >", value, "sstart");
            return (Criteria) this;
        }

        public Criteria andSstartGreaterThanOrEqualTo(String value) {
            addCriterion("sstart >=", value, "sstart");
            return (Criteria) this;
        }

        public Criteria andSstartLessThan(String value) {
            addCriterion("sstart <", value, "sstart");
            return (Criteria) this;
        }

        public Criteria andSstartLessThanOrEqualTo(String value) {
            addCriterion("sstart <=", value, "sstart");
            return (Criteria) this;
        }

        public Criteria andSstartLike(String value) {
            addCriterion("sstart like", value, "sstart");
            return (Criteria) this;
        }

        public Criteria andSstartNotLike(String value) {
            addCriterion("sstart not like", value, "sstart");
            return (Criteria) this;
        }

        public Criteria andSstartIn(List<String> values) {
            addCriterion("sstart in", values, "sstart");
            return (Criteria) this;
        }

        public Criteria andSstartNotIn(List<String> values) {
            addCriterion("sstart not in", values, "sstart");
            return (Criteria) this;
        }

        public Criteria andSstartBetween(String value1, String value2) {
            addCriterion("sstart between", value1, value2, "sstart");
            return (Criteria) this;
        }

        public Criteria andSstartNotBetween(String value1, String value2) {
            addCriterion("sstart not between", value1, value2, "sstart");
            return (Criteria) this;
        }

        public Criteria andSfinishIsNull() {
            addCriterion("sfinish is null");
            return (Criteria) this;
        }

        public Criteria andSfinishIsNotNull() {
            addCriterion("sfinish is not null");
            return (Criteria) this;
        }

        public Criteria andSfinishEqualTo(String value) {
            addCriterion("sfinish =", value, "sfinish");
            return (Criteria) this;
        }

        public Criteria andSfinishNotEqualTo(String value) {
            addCriterion("sfinish <>", value, "sfinish");
            return (Criteria) this;
        }

        public Criteria andSfinishGreaterThan(String value) {
            addCriterion("sfinish >", value, "sfinish");
            return (Criteria) this;
        }

        public Criteria andSfinishGreaterThanOrEqualTo(String value) {
            addCriterion("sfinish >=", value, "sfinish");
            return (Criteria) this;
        }

        public Criteria andSfinishLessThan(String value) {
            addCriterion("sfinish <", value, "sfinish");
            return (Criteria) this;
        }

        public Criteria andSfinishLessThanOrEqualTo(String value) {
            addCriterion("sfinish <=", value, "sfinish");
            return (Criteria) this;
        }

        public Criteria andSfinishLike(String value) {
            addCriterion("sfinish like", value, "sfinish");
            return (Criteria) this;
        }

        public Criteria andSfinishNotLike(String value) {
            addCriterion("sfinish not like", value, "sfinish");
            return (Criteria) this;
        }

        public Criteria andSfinishIn(List<String> values) {
            addCriterion("sfinish in", values, "sfinish");
            return (Criteria) this;
        }

        public Criteria andSfinishNotIn(List<String> values) {
            addCriterion("sfinish not in", values, "sfinish");
            return (Criteria) this;
        }

        public Criteria andSfinishBetween(String value1, String value2) {
            addCriterion("sfinish between", value1, value2, "sfinish");
            return (Criteria) this;
        }

        public Criteria andSfinishNotBetween(String value1, String value2) {
            addCriterion("sfinish not between", value1, value2, "sfinish");
            return (Criteria) this;
        }

        public Criteria andSselfmotionIsNull() {
            addCriterion("sselfmotion is null");
            return (Criteria) this;
        }

        public Criteria andSselfmotionIsNotNull() {
            addCriterion("sselfmotion is not null");
            return (Criteria) this;
        }

        public Criteria andSselfmotionEqualTo(String value) {
            addCriterion("sselfmotion =", value, "sselfmotion");
            return (Criteria) this;
        }

        public Criteria andSselfmotionNotEqualTo(String value) {
            addCriterion("sselfmotion <>", value, "sselfmotion");
            return (Criteria) this;
        }

        public Criteria andSselfmotionGreaterThan(String value) {
            addCriterion("sselfmotion >", value, "sselfmotion");
            return (Criteria) this;
        }

        public Criteria andSselfmotionGreaterThanOrEqualTo(String value) {
            addCriterion("sselfmotion >=", value, "sselfmotion");
            return (Criteria) this;
        }

        public Criteria andSselfmotionLessThan(String value) {
            addCriterion("sselfmotion <", value, "sselfmotion");
            return (Criteria) this;
        }

        public Criteria andSselfmotionLessThanOrEqualTo(String value) {
            addCriterion("sselfmotion <=", value, "sselfmotion");
            return (Criteria) this;
        }

        public Criteria andSselfmotionLike(String value) {
            addCriterion("sselfmotion like", value, "sselfmotion");
            return (Criteria) this;
        }

        public Criteria andSselfmotionNotLike(String value) {
            addCriterion("sselfmotion not like", value, "sselfmotion");
            return (Criteria) this;
        }

        public Criteria andSselfmotionIn(List<String> values) {
            addCriterion("sselfmotion in", values, "sselfmotion");
            return (Criteria) this;
        }

        public Criteria andSselfmotionNotIn(List<String> values) {
            addCriterion("sselfmotion not in", values, "sselfmotion");
            return (Criteria) this;
        }

        public Criteria andSselfmotionBetween(String value1, String value2) {
            addCriterion("sselfmotion between", value1, value2, "sselfmotion");
            return (Criteria) this;
        }

        public Criteria andSselfmotionNotBetween(String value1, String value2) {
            addCriterion("sselfmotion not between", value1, value2, "sselfmotion");
            return (Criteria) this;
        }

        public Criteria andSinteriorIsNull() {
            addCriterion("sinterior is null");
            return (Criteria) this;
        }

        public Criteria andSinteriorIsNotNull() {
            addCriterion("sinterior is not null");
            return (Criteria) this;
        }

        public Criteria andSinteriorEqualTo(String value) {
            addCriterion("sinterior =", value, "sinterior");
            return (Criteria) this;
        }

        public Criteria andSinteriorNotEqualTo(String value) {
            addCriterion("sinterior <>", value, "sinterior");
            return (Criteria) this;
        }

        public Criteria andSinteriorGreaterThan(String value) {
            addCriterion("sinterior >", value, "sinterior");
            return (Criteria) this;
        }

        public Criteria andSinteriorGreaterThanOrEqualTo(String value) {
            addCriterion("sinterior >=", value, "sinterior");
            return (Criteria) this;
        }

        public Criteria andSinteriorLessThan(String value) {
            addCriterion("sinterior <", value, "sinterior");
            return (Criteria) this;
        }

        public Criteria andSinteriorLessThanOrEqualTo(String value) {
            addCriterion("sinterior <=", value, "sinterior");
            return (Criteria) this;
        }

        public Criteria andSinteriorLike(String value) {
            addCriterion("sinterior like", value, "sinterior");
            return (Criteria) this;
        }

        public Criteria andSinteriorNotLike(String value) {
            addCriterion("sinterior not like", value, "sinterior");
            return (Criteria) this;
        }

        public Criteria andSinteriorIn(List<String> values) {
            addCriterion("sinterior in", values, "sinterior");
            return (Criteria) this;
        }

        public Criteria andSinteriorNotIn(List<String> values) {
            addCriterion("sinterior not in", values, "sinterior");
            return (Criteria) this;
        }

        public Criteria andSinteriorBetween(String value1, String value2) {
            addCriterion("sinterior between", value1, value2, "sinterior");
            return (Criteria) this;
        }

        public Criteria andSinteriorNotBetween(String value1, String value2) {
            addCriterion("sinterior not between", value1, value2, "sinterior");
            return (Criteria) this;
        }

        public Criteria andSreferrerIsNull() {
            addCriterion("sreferrer is null");
            return (Criteria) this;
        }

        public Criteria andSreferrerIsNotNull() {
            addCriterion("sreferrer is not null");
            return (Criteria) this;
        }

        public Criteria andSreferrerEqualTo(String value) {
            addCriterion("sreferrer =", value, "sreferrer");
            return (Criteria) this;
        }

        public Criteria andSreferrerNotEqualTo(String value) {
            addCriterion("sreferrer <>", value, "sreferrer");
            return (Criteria) this;
        }

        public Criteria andSreferrerGreaterThan(String value) {
            addCriterion("sreferrer >", value, "sreferrer");
            return (Criteria) this;
        }

        public Criteria andSreferrerGreaterThanOrEqualTo(String value) {
            addCriterion("sreferrer >=", value, "sreferrer");
            return (Criteria) this;
        }

        public Criteria andSreferrerLessThan(String value) {
            addCriterion("sreferrer <", value, "sreferrer");
            return (Criteria) this;
        }

        public Criteria andSreferrerLessThanOrEqualTo(String value) {
            addCriterion("sreferrer <=", value, "sreferrer");
            return (Criteria) this;
        }

        public Criteria andSreferrerLike(String value) {
            addCriterion("sreferrer like", value, "sreferrer");
            return (Criteria) this;
        }

        public Criteria andSreferrerNotLike(String value) {
            addCriterion("sreferrer not like", value, "sreferrer");
            return (Criteria) this;
        }

        public Criteria andSreferrerIn(List<String> values) {
            addCriterion("sreferrer in", values, "sreferrer");
            return (Criteria) this;
        }

        public Criteria andSreferrerNotIn(List<String> values) {
            addCriterion("sreferrer not in", values, "sreferrer");
            return (Criteria) this;
        }

        public Criteria andSreferrerBetween(String value1, String value2) {
            addCriterion("sreferrer between", value1, value2, "sreferrer");
            return (Criteria) this;
        }

        public Criteria andSreferrerNotBetween(String value1, String value2) {
            addCriterion("sreferrer not between", value1, value2, "sreferrer");
            return (Criteria) this;
        }

        public Criteria andSelementIsNull() {
            addCriterion("selement is null");
            return (Criteria) this;
        }

        public Criteria andSelementIsNotNull() {
            addCriterion("selement is not null");
            return (Criteria) this;
        }

        public Criteria andSelementEqualTo(String value) {
            addCriterion("selement =", value, "selement");
            return (Criteria) this;
        }

        public Criteria andSelementNotEqualTo(String value) {
            addCriterion("selement <>", value, "selement");
            return (Criteria) this;
        }

        public Criteria andSelementGreaterThan(String value) {
            addCriterion("selement >", value, "selement");
            return (Criteria) this;
        }

        public Criteria andSelementGreaterThanOrEqualTo(String value) {
            addCriterion("selement >=", value, "selement");
            return (Criteria) this;
        }

        public Criteria andSelementLessThan(String value) {
            addCriterion("selement <", value, "selement");
            return (Criteria) this;
        }

        public Criteria andSelementLessThanOrEqualTo(String value) {
            addCriterion("selement <=", value, "selement");
            return (Criteria) this;
        }

        public Criteria andSelementLike(String value) {
            addCriterion("selement like", value, "selement");
            return (Criteria) this;
        }

        public Criteria andSelementNotLike(String value) {
            addCriterion("selement not like", value, "selement");
            return (Criteria) this;
        }

        public Criteria andSelementIn(List<String> values) {
            addCriterion("selement in", values, "selement");
            return (Criteria) this;
        }

        public Criteria andSelementNotIn(List<String> values) {
            addCriterion("selement not in", values, "selement");
            return (Criteria) this;
        }

        public Criteria andSelementBetween(String value1, String value2) {
            addCriterion("selement between", value1, value2, "selement");
            return (Criteria) this;
        }

        public Criteria andSelementNotBetween(String value1, String value2) {
            addCriterion("selement not between", value1, value2, "selement");
            return (Criteria) this;
        }

        public Criteria andStimeIsNull() {
            addCriterion("stime is null");
            return (Criteria) this;
        }

        public Criteria andStimeIsNotNull() {
            addCriterion("stime is not null");
            return (Criteria) this;
        }

        public Criteria andStimeEqualTo(String value) {
            addCriterion("stime =", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotEqualTo(String value) {
            addCriterion("stime <>", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThan(String value) {
            addCriterion("stime >", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThanOrEqualTo(String value) {
            addCriterion("stime >=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThan(String value) {
            addCriterion("stime <", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThanOrEqualTo(String value) {
            addCriterion("stime <=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLike(String value) {
            addCriterion("stime like", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotLike(String value) {
            addCriterion("stime not like", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeIn(List<String> values) {
            addCriterion("stime in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotIn(List<String> values) {
            addCriterion("stime not in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeBetween(String value1, String value2) {
            addCriterion("stime between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotBetween(String value1, String value2) {
            addCriterion("stime not between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andScommodityIsNull() {
            addCriterion("scommodity is null");
            return (Criteria) this;
        }

        public Criteria andScommodityIsNotNull() {
            addCriterion("scommodity is not null");
            return (Criteria) this;
        }

        public Criteria andScommodityEqualTo(String value) {
            addCriterion("scommodity =", value, "scommodity");
            return (Criteria) this;
        }

        public Criteria andScommodityNotEqualTo(String value) {
            addCriterion("scommodity <>", value, "scommodity");
            return (Criteria) this;
        }

        public Criteria andScommodityGreaterThan(String value) {
            addCriterion("scommodity >", value, "scommodity");
            return (Criteria) this;
        }

        public Criteria andScommodityGreaterThanOrEqualTo(String value) {
            addCriterion("scommodity >=", value, "scommodity");
            return (Criteria) this;
        }

        public Criteria andScommodityLessThan(String value) {
            addCriterion("scommodity <", value, "scommodity");
            return (Criteria) this;
        }

        public Criteria andScommodityLessThanOrEqualTo(String value) {
            addCriterion("scommodity <=", value, "scommodity");
            return (Criteria) this;
        }

        public Criteria andScommodityLike(String value) {
            addCriterion("scommodity like", value, "scommodity");
            return (Criteria) this;
        }

        public Criteria andScommodityNotLike(String value) {
            addCriterion("scommodity not like", value, "scommodity");
            return (Criteria) this;
        }

        public Criteria andScommodityIn(List<String> values) {
            addCriterion("scommodity in", values, "scommodity");
            return (Criteria) this;
        }

        public Criteria andScommodityNotIn(List<String> values) {
            addCriterion("scommodity not in", values, "scommodity");
            return (Criteria) this;
        }

        public Criteria andScommodityBetween(String value1, String value2) {
            addCriterion("scommodity between", value1, value2, "scommodity");
            return (Criteria) this;
        }

        public Criteria andScommodityNotBetween(String value1, String value2) {
            addCriterion("scommodity not between", value1, value2, "scommodity");
            return (Criteria) this;
        }

        public Criteria andMitigateIsNull() {
            addCriterion("mitigate is null");
            return (Criteria) this;
        }

        public Criteria andMitigateIsNotNull() {
            addCriterion("mitigate is not null");
            return (Criteria) this;
        }

        public Criteria andMitigateEqualTo(String value) {
            addCriterion("mitigate =", value, "mitigate");
            return (Criteria) this;
        }

        public Criteria andMitigateNotEqualTo(String value) {
            addCriterion("mitigate <>", value, "mitigate");
            return (Criteria) this;
        }

        public Criteria andMitigateGreaterThan(String value) {
            addCriterion("mitigate >", value, "mitigate");
            return (Criteria) this;
        }

        public Criteria andMitigateGreaterThanOrEqualTo(String value) {
            addCriterion("mitigate >=", value, "mitigate");
            return (Criteria) this;
        }

        public Criteria andMitigateLessThan(String value) {
            addCriterion("mitigate <", value, "mitigate");
            return (Criteria) this;
        }

        public Criteria andMitigateLessThanOrEqualTo(String value) {
            addCriterion("mitigate <=", value, "mitigate");
            return (Criteria) this;
        }

        public Criteria andMitigateLike(String value) {
            addCriterion("mitigate like", value, "mitigate");
            return (Criteria) this;
        }

        public Criteria andMitigateNotLike(String value) {
            addCriterion("mitigate not like", value, "mitigate");
            return (Criteria) this;
        }

        public Criteria andMitigateIn(List<String> values) {
            addCriterion("mitigate in", values, "mitigate");
            return (Criteria) this;
        }

        public Criteria andMitigateNotIn(List<String> values) {
            addCriterion("mitigate not in", values, "mitigate");
            return (Criteria) this;
        }

        public Criteria andMitigateBetween(String value1, String value2) {
            addCriterion("mitigate between", value1, value2, "mitigate");
            return (Criteria) this;
        }

        public Criteria andMitigateNotBetween(String value1, String value2) {
            addCriterion("mitigate not between", value1, value2, "mitigate");
            return (Criteria) this;
        }

        public Criteria andSphotopathIsNull() {
            addCriterion("sphotopath is null");
            return (Criteria) this;
        }

        public Criteria andSphotopathIsNotNull() {
            addCriterion("sphotopath is not null");
            return (Criteria) this;
        }

        public Criteria andSphotopathEqualTo(String value) {
            addCriterion("sphotopath =", value, "sphotopath");
            return (Criteria) this;
        }

        public Criteria andSphotopathNotEqualTo(String value) {
            addCriterion("sphotopath <>", value, "sphotopath");
            return (Criteria) this;
        }

        public Criteria andSphotopathGreaterThan(String value) {
            addCriterion("sphotopath >", value, "sphotopath");
            return (Criteria) this;
        }

        public Criteria andSphotopathGreaterThanOrEqualTo(String value) {
            addCriterion("sphotopath >=", value, "sphotopath");
            return (Criteria) this;
        }

        public Criteria andSphotopathLessThan(String value) {
            addCriterion("sphotopath <", value, "sphotopath");
            return (Criteria) this;
        }

        public Criteria andSphotopathLessThanOrEqualTo(String value) {
            addCriterion("sphotopath <=", value, "sphotopath");
            return (Criteria) this;
        }

        public Criteria andSphotopathLike(String value) {
            addCriterion("sphotopath like", value, "sphotopath");
            return (Criteria) this;
        }

        public Criteria andSphotopathNotLike(String value) {
            addCriterion("sphotopath not like", value, "sphotopath");
            return (Criteria) this;
        }

        public Criteria andSphotopathIn(List<String> values) {
            addCriterion("sphotopath in", values, "sphotopath");
            return (Criteria) this;
        }

        public Criteria andSphotopathNotIn(List<String> values) {
            addCriterion("sphotopath not in", values, "sphotopath");
            return (Criteria) this;
        }

        public Criteria andSphotopathBetween(String value1, String value2) {
            addCriterion("sphotopath between", value1, value2, "sphotopath");
            return (Criteria) this;
        }

        public Criteria andSphotopathNotBetween(String value1, String value2) {
            addCriterion("sphotopath not between", value1, value2, "sphotopath");
            return (Criteria) this;
        }

        public Criteria andSmitigateIsNull() {
            addCriterion("smitigate is null");
            return (Criteria) this;
        }

        public Criteria andSmitigateIsNotNull() {
            addCriterion("smitigate is not null");
            return (Criteria) this;
        }

        public Criteria andSmitigateEqualTo(String value) {
            addCriterion("smitigate =", value, "smitigate");
            return (Criteria) this;
        }

        public Criteria andSmitigateNotEqualTo(String value) {
            addCriterion("smitigate <>", value, "smitigate");
            return (Criteria) this;
        }

        public Criteria andSmitigateGreaterThan(String value) {
            addCriterion("smitigate >", value, "smitigate");
            return (Criteria) this;
        }

        public Criteria andSmitigateGreaterThanOrEqualTo(String value) {
            addCriterion("smitigate >=", value, "smitigate");
            return (Criteria) this;
        }

        public Criteria andSmitigateLessThan(String value) {
            addCriterion("smitigate <", value, "smitigate");
            return (Criteria) this;
        }

        public Criteria andSmitigateLessThanOrEqualTo(String value) {
            addCriterion("smitigate <=", value, "smitigate");
            return (Criteria) this;
        }

        public Criteria andSmitigateLike(String value) {
            addCriterion("smitigate like", value, "smitigate");
            return (Criteria) this;
        }

        public Criteria andSmitigateNotLike(String value) {
            addCriterion("smitigate not like", value, "smitigate");
            return (Criteria) this;
        }

        public Criteria andSmitigateIn(List<String> values) {
            addCriterion("smitigate in", values, "smitigate");
            return (Criteria) this;
        }

        public Criteria andSmitigateNotIn(List<String> values) {
            addCriterion("smitigate not in", values, "smitigate");
            return (Criteria) this;
        }

        public Criteria andSmitigateBetween(String value1, String value2) {
            addCriterion("smitigate between", value1, value2, "smitigate");
            return (Criteria) this;
        }

        public Criteria andSmitigateNotBetween(String value1, String value2) {
            addCriterion("smitigate not between", value1, value2, "smitigate");
            return (Criteria) this;
        }

        public Criteria andSeducationsIsNull() {
            addCriterion("seducations is null");
            return (Criteria) this;
        }

        public Criteria andSeducationsIsNotNull() {
            addCriterion("seducations is not null");
            return (Criteria) this;
        }

        public Criteria andSeducationsEqualTo(String value) {
            addCriterion("seducations =", value, "seducations");
            return (Criteria) this;
        }

        public Criteria andSeducationsNotEqualTo(String value) {
            addCriterion("seducations <>", value, "seducations");
            return (Criteria) this;
        }

        public Criteria andSeducationsGreaterThan(String value) {
            addCriterion("seducations >", value, "seducations");
            return (Criteria) this;
        }

        public Criteria andSeducationsGreaterThanOrEqualTo(String value) {
            addCriterion("seducations >=", value, "seducations");
            return (Criteria) this;
        }

        public Criteria andSeducationsLessThan(String value) {
            addCriterion("seducations <", value, "seducations");
            return (Criteria) this;
        }

        public Criteria andSeducationsLessThanOrEqualTo(String value) {
            addCriterion("seducations <=", value, "seducations");
            return (Criteria) this;
        }

        public Criteria andSeducationsLike(String value) {
            addCriterion("seducations like", value, "seducations");
            return (Criteria) this;
        }

        public Criteria andSeducationsNotLike(String value) {
            addCriterion("seducations not like", value, "seducations");
            return (Criteria) this;
        }

        public Criteria andSeducationsIn(List<String> values) {
            addCriterion("seducations in", values, "seducations");
            return (Criteria) this;
        }

        public Criteria andSeducationsNotIn(List<String> values) {
            addCriterion("seducations not in", values, "seducations");
            return (Criteria) this;
        }

        public Criteria andSeducationsBetween(String value1, String value2) {
            addCriterion("seducations between", value1, value2, "seducations");
            return (Criteria) this;
        }

        public Criteria andSeducationsNotBetween(String value1, String value2) {
            addCriterion("seducations not between", value1, value2, "seducations");
            return (Criteria) this;
        }

        public Criteria andSfamilyIsNull() {
            addCriterion("sfamily is null");
            return (Criteria) this;
        }

        public Criteria andSfamilyIsNotNull() {
            addCriterion("sfamily is not null");
            return (Criteria) this;
        }

        public Criteria andSfamilyEqualTo(String value) {
            addCriterion("sfamily =", value, "sfamily");
            return (Criteria) this;
        }

        public Criteria andSfamilyNotEqualTo(String value) {
            addCriterion("sfamily <>", value, "sfamily");
            return (Criteria) this;
        }

        public Criteria andSfamilyGreaterThan(String value) {
            addCriterion("sfamily >", value, "sfamily");
            return (Criteria) this;
        }

        public Criteria andSfamilyGreaterThanOrEqualTo(String value) {
            addCriterion("sfamily >=", value, "sfamily");
            return (Criteria) this;
        }

        public Criteria andSfamilyLessThan(String value) {
            addCriterion("sfamily <", value, "sfamily");
            return (Criteria) this;
        }

        public Criteria andSfamilyLessThanOrEqualTo(String value) {
            addCriterion("sfamily <=", value, "sfamily");
            return (Criteria) this;
        }

        public Criteria andSfamilyLike(String value) {
            addCriterion("sfamily like", value, "sfamily");
            return (Criteria) this;
        }

        public Criteria andSfamilyNotLike(String value) {
            addCriterion("sfamily not like", value, "sfamily");
            return (Criteria) this;
        }

        public Criteria andSfamilyIn(List<String> values) {
            addCriterion("sfamily in", values, "sfamily");
            return (Criteria) this;
        }

        public Criteria andSfamilyNotIn(List<String> values) {
            addCriterion("sfamily not in", values, "sfamily");
            return (Criteria) this;
        }

        public Criteria andSfamilyBetween(String value1, String value2) {
            addCriterion("sfamily between", value1, value2, "sfamily");
            return (Criteria) this;
        }

        public Criteria andSfamilyNotBetween(String value1, String value2) {
            addCriterion("sfamily not between", value1, value2, "sfamily");
            return (Criteria) this;
        }

        public Criteria andSrewardIsNull() {
            addCriterion("sreward is null");
            return (Criteria) this;
        }

        public Criteria andSrewardIsNotNull() {
            addCriterion("sreward is not null");
            return (Criteria) this;
        }

        public Criteria andSrewardEqualTo(String value) {
            addCriterion("sreward =", value, "sreward");
            return (Criteria) this;
        }

        public Criteria andSrewardNotEqualTo(String value) {
            addCriterion("sreward <>", value, "sreward");
            return (Criteria) this;
        }

        public Criteria andSrewardGreaterThan(String value) {
            addCriterion("sreward >", value, "sreward");
            return (Criteria) this;
        }

        public Criteria andSrewardGreaterThanOrEqualTo(String value) {
            addCriterion("sreward >=", value, "sreward");
            return (Criteria) this;
        }

        public Criteria andSrewardLessThan(String value) {
            addCriterion("sreward <", value, "sreward");
            return (Criteria) this;
        }

        public Criteria andSrewardLessThanOrEqualTo(String value) {
            addCriterion("sreward <=", value, "sreward");
            return (Criteria) this;
        }

        public Criteria andSrewardLike(String value) {
            addCriterion("sreward like", value, "sreward");
            return (Criteria) this;
        }

        public Criteria andSrewardNotLike(String value) {
            addCriterion("sreward not like", value, "sreward");
            return (Criteria) this;
        }

        public Criteria andSrewardIn(List<String> values) {
            addCriterion("sreward in", values, "sreward");
            return (Criteria) this;
        }

        public Criteria andSrewardNotIn(List<String> values) {
            addCriterion("sreward not in", values, "sreward");
            return (Criteria) this;
        }

        public Criteria andSrewardBetween(String value1, String value2) {
            addCriterion("sreward between", value1, value2, "sreward");
            return (Criteria) this;
        }

        public Criteria andSrewardNotBetween(String value1, String value2) {
            addCriterion("sreward not between", value1, value2, "sreward");
            return (Criteria) this;
        }

        public Criteria andSopinionIsNull() {
            addCriterion("sopinion is null");
            return (Criteria) this;
        }

        public Criteria andSopinionIsNotNull() {
            addCriterion("sopinion is not null");
            return (Criteria) this;
        }

        public Criteria andSopinionEqualTo(String value) {
            addCriterion("sopinion =", value, "sopinion");
            return (Criteria) this;
        }

        public Criteria andSopinionNotEqualTo(String value) {
            addCriterion("sopinion <>", value, "sopinion");
            return (Criteria) this;
        }

        public Criteria andSopinionGreaterThan(String value) {
            addCriterion("sopinion >", value, "sopinion");
            return (Criteria) this;
        }

        public Criteria andSopinionGreaterThanOrEqualTo(String value) {
            addCriterion("sopinion >=", value, "sopinion");
            return (Criteria) this;
        }

        public Criteria andSopinionLessThan(String value) {
            addCriterion("sopinion <", value, "sopinion");
            return (Criteria) this;
        }

        public Criteria andSopinionLessThanOrEqualTo(String value) {
            addCriterion("sopinion <=", value, "sopinion");
            return (Criteria) this;
        }

        public Criteria andSopinionLike(String value) {
            addCriterion("sopinion like", value, "sopinion");
            return (Criteria) this;
        }

        public Criteria andSopinionNotLike(String value) {
            addCriterion("sopinion not like", value, "sopinion");
            return (Criteria) this;
        }

        public Criteria andSopinionIn(List<String> values) {
            addCriterion("sopinion in", values, "sopinion");
            return (Criteria) this;
        }

        public Criteria andSopinionNotIn(List<String> values) {
            addCriterion("sopinion not in", values, "sopinion");
            return (Criteria) this;
        }

        public Criteria andSopinionBetween(String value1, String value2) {
            addCriterion("sopinion between", value1, value2, "sopinion");
            return (Criteria) this;
        }

        public Criteria andSopinionNotBetween(String value1, String value2) {
            addCriterion("sopinion not between", value1, value2, "sopinion");
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