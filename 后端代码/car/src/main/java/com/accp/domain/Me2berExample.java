package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class Me2berExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Me2berExample() {
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

        public Criteria andMe2beridIsNull() {
            addCriterion("me2berid is null");
            return (Criteria) this;
        }

        public Criteria andMe2beridIsNotNull() {
            addCriterion("me2berid is not null");
            return (Criteria) this;
        }

        public Criteria andMe2beridEqualTo(Integer value) {
            addCriterion("me2berid =", value, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridNotEqualTo(Integer value) {
            addCriterion("me2berid <>", value, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridGreaterThan(Integer value) {
            addCriterion("me2berid >", value, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridGreaterThanOrEqualTo(Integer value) {
            addCriterion("me2berid >=", value, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridLessThan(Integer value) {
            addCriterion("me2berid <", value, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridLessThanOrEqualTo(Integer value) {
            addCriterion("me2berid <=", value, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridIn(List<Integer> values) {
            addCriterion("me2berid in", values, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridNotIn(List<Integer> values) {
            addCriterion("me2berid not in", values, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridBetween(Integer value1, Integer value2) {
            addCriterion("me2berid between", value1, value2, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2beridNotBetween(Integer value1, Integer value2) {
            addCriterion("me2berid not between", value1, value2, "me2berid");
            return (Criteria) this;
        }

        public Criteria andMe2bernameIsNull() {
            addCriterion("me2bername is null");
            return (Criteria) this;
        }

        public Criteria andMe2bernameIsNotNull() {
            addCriterion("me2bername is not null");
            return (Criteria) this;
        }

        public Criteria andMe2bernameEqualTo(String value) {
            addCriterion("me2bername =", value, "me2bername");
            return (Criteria) this;
        }

        public Criteria andMe2bernameNotEqualTo(String value) {
            addCriterion("me2bername <>", value, "me2bername");
            return (Criteria) this;
        }

        public Criteria andMe2bernameGreaterThan(String value) {
            addCriterion("me2bername >", value, "me2bername");
            return (Criteria) this;
        }

        public Criteria andMe2bernameGreaterThanOrEqualTo(String value) {
            addCriterion("me2bername >=", value, "me2bername");
            return (Criteria) this;
        }

        public Criteria andMe2bernameLessThan(String value) {
            addCriterion("me2bername <", value, "me2bername");
            return (Criteria) this;
        }

        public Criteria andMe2bernameLessThanOrEqualTo(String value) {
            addCriterion("me2bername <=", value, "me2bername");
            return (Criteria) this;
        }

        public Criteria andMe2bernameLike(String value) {
            addCriterion("me2bername like", value, "me2bername");
            return (Criteria) this;
        }

        public Criteria andMe2bernameNotLike(String value) {
            addCriterion("me2bername not like", value, "me2bername");
            return (Criteria) this;
        }

        public Criteria andMe2bernameIn(List<String> values) {
            addCriterion("me2bername in", values, "me2bername");
            return (Criteria) this;
        }

        public Criteria andMe2bernameNotIn(List<String> values) {
            addCriterion("me2bername not in", values, "me2bername");
            return (Criteria) this;
        }

        public Criteria andMe2bernameBetween(String value1, String value2) {
            addCriterion("me2bername between", value1, value2, "me2bername");
            return (Criteria) this;
        }

        public Criteria andMe2bernameNotBetween(String value1, String value2) {
            addCriterion("me2bername not between", value1, value2, "me2bername");
            return (Criteria) this;
        }

        public Criteria andMe2berpwdIsNull() {
            addCriterion("me2berpwd is null");
            return (Criteria) this;
        }

        public Criteria andMe2berpwdIsNotNull() {
            addCriterion("me2berpwd is not null");
            return (Criteria) this;
        }

        public Criteria andMe2berpwdEqualTo(String value) {
            addCriterion("me2berpwd =", value, "me2berpwd");
            return (Criteria) this;
        }

        public Criteria andMe2berpwdNotEqualTo(String value) {
            addCriterion("me2berpwd <>", value, "me2berpwd");
            return (Criteria) this;
        }

        public Criteria andMe2berpwdGreaterThan(String value) {
            addCriterion("me2berpwd >", value, "me2berpwd");
            return (Criteria) this;
        }

        public Criteria andMe2berpwdGreaterThanOrEqualTo(String value) {
            addCriterion("me2berpwd >=", value, "me2berpwd");
            return (Criteria) this;
        }

        public Criteria andMe2berpwdLessThan(String value) {
            addCriterion("me2berpwd <", value, "me2berpwd");
            return (Criteria) this;
        }

        public Criteria andMe2berpwdLessThanOrEqualTo(String value) {
            addCriterion("me2berpwd <=", value, "me2berpwd");
            return (Criteria) this;
        }

        public Criteria andMe2berpwdLike(String value) {
            addCriterion("me2berpwd like", value, "me2berpwd");
            return (Criteria) this;
        }

        public Criteria andMe2berpwdNotLike(String value) {
            addCriterion("me2berpwd not like", value, "me2berpwd");
            return (Criteria) this;
        }

        public Criteria andMe2berpwdIn(List<String> values) {
            addCriterion("me2berpwd in", values, "me2berpwd");
            return (Criteria) this;
        }

        public Criteria andMe2berpwdNotIn(List<String> values) {
            addCriterion("me2berpwd not in", values, "me2berpwd");
            return (Criteria) this;
        }

        public Criteria andMe2berpwdBetween(String value1, String value2) {
            addCriterion("me2berpwd between", value1, value2, "me2berpwd");
            return (Criteria) this;
        }

        public Criteria andMe2berpwdNotBetween(String value1, String value2) {
            addCriterion("me2berpwd not between", value1, value2, "me2berpwd");
            return (Criteria) this;
        }

        public Criteria andMe2berusernameIsNull() {
            addCriterion("me2berusername is null");
            return (Criteria) this;
        }

        public Criteria andMe2berusernameIsNotNull() {
            addCriterion("me2berusername is not null");
            return (Criteria) this;
        }

        public Criteria andMe2berusernameEqualTo(String value) {
            addCriterion("me2berusername =", value, "me2berusername");
            return (Criteria) this;
        }

        public Criteria andMe2berusernameNotEqualTo(String value) {
            addCriterion("me2berusername <>", value, "me2berusername");
            return (Criteria) this;
        }

        public Criteria andMe2berusernameGreaterThan(String value) {
            addCriterion("me2berusername >", value, "me2berusername");
            return (Criteria) this;
        }

        public Criteria andMe2berusernameGreaterThanOrEqualTo(String value) {
            addCriterion("me2berusername >=", value, "me2berusername");
            return (Criteria) this;
        }

        public Criteria andMe2berusernameLessThan(String value) {
            addCriterion("me2berusername <", value, "me2berusername");
            return (Criteria) this;
        }

        public Criteria andMe2berusernameLessThanOrEqualTo(String value) {
            addCriterion("me2berusername <=", value, "me2berusername");
            return (Criteria) this;
        }

        public Criteria andMe2berusernameLike(String value) {
            addCriterion("me2berusername like", value, "me2berusername");
            return (Criteria) this;
        }

        public Criteria andMe2berusernameNotLike(String value) {
            addCriterion("me2berusername not like", value, "me2berusername");
            return (Criteria) this;
        }

        public Criteria andMe2berusernameIn(List<String> values) {
            addCriterion("me2berusername in", values, "me2berusername");
            return (Criteria) this;
        }

        public Criteria andMe2berusernameNotIn(List<String> values) {
            addCriterion("me2berusername not in", values, "me2berusername");
            return (Criteria) this;
        }

        public Criteria andMe2berusernameBetween(String value1, String value2) {
            addCriterion("me2berusername between", value1, value2, "me2berusername");
            return (Criteria) this;
        }

        public Criteria andMe2berusernameNotBetween(String value1, String value2) {
            addCriterion("me2berusername not between", value1, value2, "me2berusername");
            return (Criteria) this;
        }

        public Criteria andCltidIsNull() {
            addCriterion("cltid is null");
            return (Criteria) this;
        }

        public Criteria andCltidIsNotNull() {
            addCriterion("cltid is not null");
            return (Criteria) this;
        }

        public Criteria andCltidEqualTo(String value) {
            addCriterion("cltid =", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidNotEqualTo(String value) {
            addCriterion("cltid <>", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidGreaterThan(String value) {
            addCriterion("cltid >", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidGreaterThanOrEqualTo(String value) {
            addCriterion("cltid >=", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidLessThan(String value) {
            addCriterion("cltid <", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidLessThanOrEqualTo(String value) {
            addCriterion("cltid <=", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidLike(String value) {
            addCriterion("cltid like", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidNotLike(String value) {
            addCriterion("cltid not like", value, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidIn(List<String> values) {
            addCriterion("cltid in", values, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidNotIn(List<String> values) {
            addCriterion("cltid not in", values, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidBetween(String value1, String value2) {
            addCriterion("cltid between", value1, value2, "cltid");
            return (Criteria) this;
        }

        public Criteria andCltidNotBetween(String value1, String value2) {
            addCriterion("cltid not between", value1, value2, "cltid");
            return (Criteria) this;
        }

        public Criteria andMe2berbalanceIsNull() {
            addCriterion("me2berbalance is null");
            return (Criteria) this;
        }

        public Criteria andMe2berbalanceIsNotNull() {
            addCriterion("me2berbalance is not null");
            return (Criteria) this;
        }

        public Criteria andMe2berbalanceEqualTo(Float value) {
            addCriterion("me2berbalance =", value, "me2berbalance");
            return (Criteria) this;
        }

        public Criteria andMe2berbalanceNotEqualTo(Float value) {
            addCriterion("me2berbalance <>", value, "me2berbalance");
            return (Criteria) this;
        }

        public Criteria andMe2berbalanceGreaterThan(Float value) {
            addCriterion("me2berbalance >", value, "me2berbalance");
            return (Criteria) this;
        }

        public Criteria andMe2berbalanceGreaterThanOrEqualTo(Float value) {
            addCriterion("me2berbalance >=", value, "me2berbalance");
            return (Criteria) this;
        }

        public Criteria andMe2berbalanceLessThan(Float value) {
            addCriterion("me2berbalance <", value, "me2berbalance");
            return (Criteria) this;
        }

        public Criteria andMe2berbalanceLessThanOrEqualTo(Float value) {
            addCriterion("me2berbalance <=", value, "me2berbalance");
            return (Criteria) this;
        }

        public Criteria andMe2berbalanceIn(List<Float> values) {
            addCriterion("me2berbalance in", values, "me2berbalance");
            return (Criteria) this;
        }

        public Criteria andMe2berbalanceNotIn(List<Float> values) {
            addCriterion("me2berbalance not in", values, "me2berbalance");
            return (Criteria) this;
        }

        public Criteria andMe2berbalanceBetween(Float value1, Float value2) {
            addCriterion("me2berbalance between", value1, value2, "me2berbalance");
            return (Criteria) this;
        }

        public Criteria andMe2berbalanceNotBetween(Float value1, Float value2) {
            addCriterion("me2berbalance not between", value1, value2, "me2berbalance");
            return (Criteria) this;
        }

        public Criteria andMe2ber1IsNull() {
            addCriterion("Me2ber1 is null");
            return (Criteria) this;
        }

        public Criteria andMe2ber1IsNotNull() {
            addCriterion("Me2ber1 is not null");
            return (Criteria) this;
        }

        public Criteria andMe2ber1EqualTo(Float value) {
            addCriterion("Me2ber1 =", value, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber1NotEqualTo(Float value) {
            addCriterion("Me2ber1 <>", value, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber1GreaterThan(Float value) {
            addCriterion("Me2ber1 >", value, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber1GreaterThanOrEqualTo(Float value) {
            addCriterion("Me2ber1 >=", value, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber1LessThan(Float value) {
            addCriterion("Me2ber1 <", value, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber1LessThanOrEqualTo(Float value) {
            addCriterion("Me2ber1 <=", value, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber1In(List<Float> values) {
            addCriterion("Me2ber1 in", values, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber1NotIn(List<Float> values) {
            addCriterion("Me2ber1 not in", values, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber1Between(Float value1, Float value2) {
            addCriterion("Me2ber1 between", value1, value2, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber1NotBetween(Float value1, Float value2) {
            addCriterion("Me2ber1 not between", value1, value2, "me2ber1");
            return (Criteria) this;
        }

        public Criteria andMe2ber2IsNull() {
            addCriterion("Me2ber2 is null");
            return (Criteria) this;
        }

        public Criteria andMe2ber2IsNotNull() {
            addCriterion("Me2ber2 is not null");
            return (Criteria) this;
        }

        public Criteria andMe2ber2EqualTo(String value) {
            addCriterion("Me2ber2 =", value, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2NotEqualTo(String value) {
            addCriterion("Me2ber2 <>", value, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2GreaterThan(String value) {
            addCriterion("Me2ber2 >", value, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2GreaterThanOrEqualTo(String value) {
            addCriterion("Me2ber2 >=", value, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2LessThan(String value) {
            addCriterion("Me2ber2 <", value, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2LessThanOrEqualTo(String value) {
            addCriterion("Me2ber2 <=", value, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2Like(String value) {
            addCriterion("Me2ber2 like", value, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2NotLike(String value) {
            addCriterion("Me2ber2 not like", value, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2In(List<String> values) {
            addCriterion("Me2ber2 in", values, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2NotIn(List<String> values) {
            addCriterion("Me2ber2 not in", values, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2Between(String value1, String value2) {
            addCriterion("Me2ber2 between", value1, value2, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber2NotBetween(String value1, String value2) {
            addCriterion("Me2ber2 not between", value1, value2, "me2ber2");
            return (Criteria) this;
        }

        public Criteria andMe2ber3IsNull() {
            addCriterion("Me2ber3 is null");
            return (Criteria) this;
        }

        public Criteria andMe2ber3IsNotNull() {
            addCriterion("Me2ber3 is not null");
            return (Criteria) this;
        }

        public Criteria andMe2ber3EqualTo(String value) {
            addCriterion("Me2ber3 =", value, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3NotEqualTo(String value) {
            addCriterion("Me2ber3 <>", value, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3GreaterThan(String value) {
            addCriterion("Me2ber3 >", value, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3GreaterThanOrEqualTo(String value) {
            addCriterion("Me2ber3 >=", value, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3LessThan(String value) {
            addCriterion("Me2ber3 <", value, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3LessThanOrEqualTo(String value) {
            addCriterion("Me2ber3 <=", value, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3Like(String value) {
            addCriterion("Me2ber3 like", value, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3NotLike(String value) {
            addCriterion("Me2ber3 not like", value, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3In(List<String> values) {
            addCriterion("Me2ber3 in", values, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3NotIn(List<String> values) {
            addCriterion("Me2ber3 not in", values, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3Between(String value1, String value2) {
            addCriterion("Me2ber3 between", value1, value2, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber3NotBetween(String value1, String value2) {
            addCriterion("Me2ber3 not between", value1, value2, "me2ber3");
            return (Criteria) this;
        }

        public Criteria andMe2ber4IsNull() {
            addCriterion("Me2ber4 is null");
            return (Criteria) this;
        }

        public Criteria andMe2ber4IsNotNull() {
            addCriterion("Me2ber4 is not null");
            return (Criteria) this;
        }

        public Criteria andMe2ber4EqualTo(String value) {
            addCriterion("Me2ber4 =", value, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4NotEqualTo(String value) {
            addCriterion("Me2ber4 <>", value, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4GreaterThan(String value) {
            addCriterion("Me2ber4 >", value, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4GreaterThanOrEqualTo(String value) {
            addCriterion("Me2ber4 >=", value, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4LessThan(String value) {
            addCriterion("Me2ber4 <", value, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4LessThanOrEqualTo(String value) {
            addCriterion("Me2ber4 <=", value, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4Like(String value) {
            addCriterion("Me2ber4 like", value, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4NotLike(String value) {
            addCriterion("Me2ber4 not like", value, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4In(List<String> values) {
            addCriterion("Me2ber4 in", values, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4NotIn(List<String> values) {
            addCriterion("Me2ber4 not in", values, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4Between(String value1, String value2) {
            addCriterion("Me2ber4 between", value1, value2, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber4NotBetween(String value1, String value2) {
            addCriterion("Me2ber4 not between", value1, value2, "me2ber4");
            return (Criteria) this;
        }

        public Criteria andMe2ber5IsNull() {
            addCriterion("Me2ber5 is null");
            return (Criteria) this;
        }

        public Criteria andMe2ber5IsNotNull() {
            addCriterion("Me2ber5 is not null");
            return (Criteria) this;
        }

        public Criteria andMe2ber5EqualTo(String value) {
            addCriterion("Me2ber5 =", value, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber5NotEqualTo(String value) {
            addCriterion("Me2ber5 <>", value, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber5GreaterThan(String value) {
            addCriterion("Me2ber5 >", value, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber5GreaterThanOrEqualTo(String value) {
            addCriterion("Me2ber5 >=", value, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber5LessThan(String value) {
            addCriterion("Me2ber5 <", value, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber5LessThanOrEqualTo(String value) {
            addCriterion("Me2ber5 <=", value, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber5Like(String value) {
            addCriterion("Me2ber5 like", value, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber5NotLike(String value) {
            addCriterion("Me2ber5 not like", value, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber5In(List<String> values) {
            addCriterion("Me2ber5 in", values, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber5NotIn(List<String> values) {
            addCriterion("Me2ber5 not in", values, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber5Between(String value1, String value2) {
            addCriterion("Me2ber5 between", value1, value2, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber5NotBetween(String value1, String value2) {
            addCriterion("Me2ber5 not between", value1, value2, "me2ber5");
            return (Criteria) this;
        }

        public Criteria andMe2ber6IsNull() {
            addCriterion("Me2ber6 is null");
            return (Criteria) this;
        }

        public Criteria andMe2ber6IsNotNull() {
            addCriterion("Me2ber6 is not null");
            return (Criteria) this;
        }

        public Criteria andMe2ber6EqualTo(String value) {
            addCriterion("Me2ber6 =", value, "me2ber6");
            return (Criteria) this;
        }

        public Criteria andMe2ber6NotEqualTo(String value) {
            addCriterion("Me2ber6 <>", value, "me2ber6");
            return (Criteria) this;
        }

        public Criteria andMe2ber6GreaterThan(String value) {
            addCriterion("Me2ber6 >", value, "me2ber6");
            return (Criteria) this;
        }

        public Criteria andMe2ber6GreaterThanOrEqualTo(String value) {
            addCriterion("Me2ber6 >=", value, "me2ber6");
            return (Criteria) this;
        }

        public Criteria andMe2ber6LessThan(String value) {
            addCriterion("Me2ber6 <", value, "me2ber6");
            return (Criteria) this;
        }

        public Criteria andMe2ber6LessThanOrEqualTo(String value) {
            addCriterion("Me2ber6 <=", value, "me2ber6");
            return (Criteria) this;
        }

        public Criteria andMe2ber6Like(String value) {
            addCriterion("Me2ber6 like", value, "me2ber6");
            return (Criteria) this;
        }

        public Criteria andMe2ber6NotLike(String value) {
            addCriterion("Me2ber6 not like", value, "me2ber6");
            return (Criteria) this;
        }

        public Criteria andMe2ber6In(List<String> values) {
            addCriterion("Me2ber6 in", values, "me2ber6");
            return (Criteria) this;
        }

        public Criteria andMe2ber6NotIn(List<String> values) {
            addCriterion("Me2ber6 not in", values, "me2ber6");
            return (Criteria) this;
        }

        public Criteria andMe2ber6Between(String value1, String value2) {
            addCriterion("Me2ber6 between", value1, value2, "me2ber6");
            return (Criteria) this;
        }

        public Criteria andMe2ber6NotBetween(String value1, String value2) {
            addCriterion("Me2ber6 not between", value1, value2, "me2ber6");
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