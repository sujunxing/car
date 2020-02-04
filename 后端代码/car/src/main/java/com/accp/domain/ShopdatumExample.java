package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ShopdatumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopdatumExample() {
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

        public Criteria andShmidIsNull() {
            addCriterion("shmid is null");
            return (Criteria) this;
        }

        public Criteria andShmidIsNotNull() {
            addCriterion("shmid is not null");
            return (Criteria) this;
        }

        public Criteria andShmidEqualTo(String value) {
            addCriterion("shmid =", value, "shmid");
            return (Criteria) this;
        }

        public Criteria andShmidNotEqualTo(String value) {
            addCriterion("shmid <>", value, "shmid");
            return (Criteria) this;
        }

        public Criteria andShmidGreaterThan(String value) {
            addCriterion("shmid >", value, "shmid");
            return (Criteria) this;
        }

        public Criteria andShmidGreaterThanOrEqualTo(String value) {
            addCriterion("shmid >=", value, "shmid");
            return (Criteria) this;
        }

        public Criteria andShmidLessThan(String value) {
            addCriterion("shmid <", value, "shmid");
            return (Criteria) this;
        }

        public Criteria andShmidLessThanOrEqualTo(String value) {
            addCriterion("shmid <=", value, "shmid");
            return (Criteria) this;
        }

        public Criteria andShmidLike(String value) {
            addCriterion("shmid like", value, "shmid");
            return (Criteria) this;
        }

        public Criteria andShmidNotLike(String value) {
            addCriterion("shmid not like", value, "shmid");
            return (Criteria) this;
        }

        public Criteria andShmidIn(List<String> values) {
            addCriterion("shmid in", values, "shmid");
            return (Criteria) this;
        }

        public Criteria andShmidNotIn(List<String> values) {
            addCriterion("shmid not in", values, "shmid");
            return (Criteria) this;
        }

        public Criteria andShmidBetween(String value1, String value2) {
            addCriterion("shmid between", value1, value2, "shmid");
            return (Criteria) this;
        }

        public Criteria andShmidNotBetween(String value1, String value2) {
            addCriterion("shmid not between", value1, value2, "shmid");
            return (Criteria) this;
        }

        public Criteria andShmnameIsNull() {
            addCriterion("shmname is null");
            return (Criteria) this;
        }

        public Criteria andShmnameIsNotNull() {
            addCriterion("shmname is not null");
            return (Criteria) this;
        }

        public Criteria andShmnameEqualTo(String value) {
            addCriterion("shmname =", value, "shmname");
            return (Criteria) this;
        }

        public Criteria andShmnameNotEqualTo(String value) {
            addCriterion("shmname <>", value, "shmname");
            return (Criteria) this;
        }

        public Criteria andShmnameGreaterThan(String value) {
            addCriterion("shmname >", value, "shmname");
            return (Criteria) this;
        }

        public Criteria andShmnameGreaterThanOrEqualTo(String value) {
            addCriterion("shmname >=", value, "shmname");
            return (Criteria) this;
        }

        public Criteria andShmnameLessThan(String value) {
            addCriterion("shmname <", value, "shmname");
            return (Criteria) this;
        }

        public Criteria andShmnameLessThanOrEqualTo(String value) {
            addCriterion("shmname <=", value, "shmname");
            return (Criteria) this;
        }

        public Criteria andShmnameLike(String value) {
            addCriterion("shmname like", value, "shmname");
            return (Criteria) this;
        }

        public Criteria andShmnameNotLike(String value) {
            addCriterion("shmname not like", value, "shmname");
            return (Criteria) this;
        }

        public Criteria andShmnameIn(List<String> values) {
            addCriterion("shmname in", values, "shmname");
            return (Criteria) this;
        }

        public Criteria andShmnameNotIn(List<String> values) {
            addCriterion("shmname not in", values, "shmname");
            return (Criteria) this;
        }

        public Criteria andShmnameBetween(String value1, String value2) {
            addCriterion("shmname between", value1, value2, "shmname");
            return (Criteria) this;
        }

        public Criteria andShmnameNotBetween(String value1, String value2) {
            addCriterion("shmname not between", value1, value2, "shmname");
            return (Criteria) this;
        }

        public Criteria andShmbrandIsNull() {
            addCriterion("shmbrand is null");
            return (Criteria) this;
        }

        public Criteria andShmbrandIsNotNull() {
            addCriterion("shmbrand is not null");
            return (Criteria) this;
        }

        public Criteria andShmbrandEqualTo(String value) {
            addCriterion("shmbrand =", value, "shmbrand");
            return (Criteria) this;
        }

        public Criteria andShmbrandNotEqualTo(String value) {
            addCriterion("shmbrand <>", value, "shmbrand");
            return (Criteria) this;
        }

        public Criteria andShmbrandGreaterThan(String value) {
            addCriterion("shmbrand >", value, "shmbrand");
            return (Criteria) this;
        }

        public Criteria andShmbrandGreaterThanOrEqualTo(String value) {
            addCriterion("shmbrand >=", value, "shmbrand");
            return (Criteria) this;
        }

        public Criteria andShmbrandLessThan(String value) {
            addCriterion("shmbrand <", value, "shmbrand");
            return (Criteria) this;
        }

        public Criteria andShmbrandLessThanOrEqualTo(String value) {
            addCriterion("shmbrand <=", value, "shmbrand");
            return (Criteria) this;
        }

        public Criteria andShmbrandLike(String value) {
            addCriterion("shmbrand like", value, "shmbrand");
            return (Criteria) this;
        }

        public Criteria andShmbrandNotLike(String value) {
            addCriterion("shmbrand not like", value, "shmbrand");
            return (Criteria) this;
        }

        public Criteria andShmbrandIn(List<String> values) {
            addCriterion("shmbrand in", values, "shmbrand");
            return (Criteria) this;
        }

        public Criteria andShmbrandNotIn(List<String> values) {
            addCriterion("shmbrand not in", values, "shmbrand");
            return (Criteria) this;
        }

        public Criteria andShmbrandBetween(String value1, String value2) {
            addCriterion("shmbrand between", value1, value2, "shmbrand");
            return (Criteria) this;
        }

        public Criteria andShmbrandNotBetween(String value1, String value2) {
            addCriterion("shmbrand not between", value1, value2, "shmbrand");
            return (Criteria) this;
        }

        public Criteria andShmtypeIsNull() {
            addCriterion("shmtype is null");
            return (Criteria) this;
        }

        public Criteria andShmtypeIsNotNull() {
            addCriterion("shmtype is not null");
            return (Criteria) this;
        }

        public Criteria andShmtypeEqualTo(String value) {
            addCriterion("shmtype =", value, "shmtype");
            return (Criteria) this;
        }

        public Criteria andShmtypeNotEqualTo(String value) {
            addCriterion("shmtype <>", value, "shmtype");
            return (Criteria) this;
        }

        public Criteria andShmtypeGreaterThan(String value) {
            addCriterion("shmtype >", value, "shmtype");
            return (Criteria) this;
        }

        public Criteria andShmtypeGreaterThanOrEqualTo(String value) {
            addCriterion("shmtype >=", value, "shmtype");
            return (Criteria) this;
        }

        public Criteria andShmtypeLessThan(String value) {
            addCriterion("shmtype <", value, "shmtype");
            return (Criteria) this;
        }

        public Criteria andShmtypeLessThanOrEqualTo(String value) {
            addCriterion("shmtype <=", value, "shmtype");
            return (Criteria) this;
        }

        public Criteria andShmtypeLike(String value) {
            addCriterion("shmtype like", value, "shmtype");
            return (Criteria) this;
        }

        public Criteria andShmtypeNotLike(String value) {
            addCriterion("shmtype not like", value, "shmtype");
            return (Criteria) this;
        }

        public Criteria andShmtypeIn(List<String> values) {
            addCriterion("shmtype in", values, "shmtype");
            return (Criteria) this;
        }

        public Criteria andShmtypeNotIn(List<String> values) {
            addCriterion("shmtype not in", values, "shmtype");
            return (Criteria) this;
        }

        public Criteria andShmtypeBetween(String value1, String value2) {
            addCriterion("shmtype between", value1, value2, "shmtype");
            return (Criteria) this;
        }

        public Criteria andShmtypeNotBetween(String value1, String value2) {
            addCriterion("shmtype not between", value1, value2, "shmtype");
            return (Criteria) this;
        }

        public Criteria andShmnumIsNull() {
            addCriterion("shmnum is null");
            return (Criteria) this;
        }

        public Criteria andShmnumIsNotNull() {
            addCriterion("shmnum is not null");
            return (Criteria) this;
        }

        public Criteria andShmnumEqualTo(String value) {
            addCriterion("shmnum =", value, "shmnum");
            return (Criteria) this;
        }

        public Criteria andShmnumNotEqualTo(String value) {
            addCriterion("shmnum <>", value, "shmnum");
            return (Criteria) this;
        }

        public Criteria andShmnumGreaterThan(String value) {
            addCriterion("shmnum >", value, "shmnum");
            return (Criteria) this;
        }

        public Criteria andShmnumGreaterThanOrEqualTo(String value) {
            addCriterion("shmnum >=", value, "shmnum");
            return (Criteria) this;
        }

        public Criteria andShmnumLessThan(String value) {
            addCriterion("shmnum <", value, "shmnum");
            return (Criteria) this;
        }

        public Criteria andShmnumLessThanOrEqualTo(String value) {
            addCriterion("shmnum <=", value, "shmnum");
            return (Criteria) this;
        }

        public Criteria andShmnumLike(String value) {
            addCriterion("shmnum like", value, "shmnum");
            return (Criteria) this;
        }

        public Criteria andShmnumNotLike(String value) {
            addCriterion("shmnum not like", value, "shmnum");
            return (Criteria) this;
        }

        public Criteria andShmnumIn(List<String> values) {
            addCriterion("shmnum in", values, "shmnum");
            return (Criteria) this;
        }

        public Criteria andShmnumNotIn(List<String> values) {
            addCriterion("shmnum not in", values, "shmnum");
            return (Criteria) this;
        }

        public Criteria andShmnumBetween(String value1, String value2) {
            addCriterion("shmnum between", value1, value2, "shmnum");
            return (Criteria) this;
        }

        public Criteria andShmnumNotBetween(String value1, String value2) {
            addCriterion("shmnum not between", value1, value2, "shmnum");
            return (Criteria) this;
        }

        public Criteria andShlidIsNull() {
            addCriterion("shlid is null");
            return (Criteria) this;
        }

        public Criteria andShlidIsNotNull() {
            addCriterion("shlid is not null");
            return (Criteria) this;
        }

        public Criteria andShlidEqualTo(String value) {
            addCriterion("shlid =", value, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidNotEqualTo(String value) {
            addCriterion("shlid <>", value, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidGreaterThan(String value) {
            addCriterion("shlid >", value, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidGreaterThanOrEqualTo(String value) {
            addCriterion("shlid >=", value, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidLessThan(String value) {
            addCriterion("shlid <", value, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidLessThanOrEqualTo(String value) {
            addCriterion("shlid <=", value, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidLike(String value) {
            addCriterion("shlid like", value, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidNotLike(String value) {
            addCriterion("shlid not like", value, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidIn(List<String> values) {
            addCriterion("shlid in", values, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidNotIn(List<String> values) {
            addCriterion("shlid not in", values, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidBetween(String value1, String value2) {
            addCriterion("shlid between", value1, value2, "shlid");
            return (Criteria) this;
        }

        public Criteria andShlidNotBetween(String value1, String value2) {
            addCriterion("shlid not between", value1, value2, "shlid");
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

        public Criteria andShmchangIsNull() {
            addCriterion("shmchang is null");
            return (Criteria) this;
        }

        public Criteria andShmchangIsNotNull() {
            addCriterion("shmchang is not null");
            return (Criteria) this;
        }

        public Criteria andShmchangEqualTo(String value) {
            addCriterion("shmchang =", value, "shmchang");
            return (Criteria) this;
        }

        public Criteria andShmchangNotEqualTo(String value) {
            addCriterion("shmchang <>", value, "shmchang");
            return (Criteria) this;
        }

        public Criteria andShmchangGreaterThan(String value) {
            addCriterion("shmchang >", value, "shmchang");
            return (Criteria) this;
        }

        public Criteria andShmchangGreaterThanOrEqualTo(String value) {
            addCriterion("shmchang >=", value, "shmchang");
            return (Criteria) this;
        }

        public Criteria andShmchangLessThan(String value) {
            addCriterion("shmchang <", value, "shmchang");
            return (Criteria) this;
        }

        public Criteria andShmchangLessThanOrEqualTo(String value) {
            addCriterion("shmchang <=", value, "shmchang");
            return (Criteria) this;
        }

        public Criteria andShmchangLike(String value) {
            addCriterion("shmchang like", value, "shmchang");
            return (Criteria) this;
        }

        public Criteria andShmchangNotLike(String value) {
            addCriterion("shmchang not like", value, "shmchang");
            return (Criteria) this;
        }

        public Criteria andShmchangIn(List<String> values) {
            addCriterion("shmchang in", values, "shmchang");
            return (Criteria) this;
        }

        public Criteria andShmchangNotIn(List<String> values) {
            addCriterion("shmchang not in", values, "shmchang");
            return (Criteria) this;
        }

        public Criteria andShmchangBetween(String value1, String value2) {
            addCriterion("shmchang between", value1, value2, "shmchang");
            return (Criteria) this;
        }

        public Criteria andShmchangNotBetween(String value1, String value2) {
            addCriterion("shmchang not between", value1, value2, "shmchang");
            return (Criteria) this;
        }

        public Criteria andShmlevlIsNull() {
            addCriterion("shmlevl is null");
            return (Criteria) this;
        }

        public Criteria andShmlevlIsNotNull() {
            addCriterion("shmlevl is not null");
            return (Criteria) this;
        }

        public Criteria andShmlevlEqualTo(String value) {
            addCriterion("shmlevl =", value, "shmlevl");
            return (Criteria) this;
        }

        public Criteria andShmlevlNotEqualTo(String value) {
            addCriterion("shmlevl <>", value, "shmlevl");
            return (Criteria) this;
        }

        public Criteria andShmlevlGreaterThan(String value) {
            addCriterion("shmlevl >", value, "shmlevl");
            return (Criteria) this;
        }

        public Criteria andShmlevlGreaterThanOrEqualTo(String value) {
            addCriterion("shmlevl >=", value, "shmlevl");
            return (Criteria) this;
        }

        public Criteria andShmlevlLessThan(String value) {
            addCriterion("shmlevl <", value, "shmlevl");
            return (Criteria) this;
        }

        public Criteria andShmlevlLessThanOrEqualTo(String value) {
            addCriterion("shmlevl <=", value, "shmlevl");
            return (Criteria) this;
        }

        public Criteria andShmlevlLike(String value) {
            addCriterion("shmlevl like", value, "shmlevl");
            return (Criteria) this;
        }

        public Criteria andShmlevlNotLike(String value) {
            addCriterion("shmlevl not like", value, "shmlevl");
            return (Criteria) this;
        }

        public Criteria andShmlevlIn(List<String> values) {
            addCriterion("shmlevl in", values, "shmlevl");
            return (Criteria) this;
        }

        public Criteria andShmlevlNotIn(List<String> values) {
            addCriterion("shmlevl not in", values, "shmlevl");
            return (Criteria) this;
        }

        public Criteria andShmlevlBetween(String value1, String value2) {
            addCriterion("shmlevl between", value1, value2, "shmlevl");
            return (Criteria) this;
        }

        public Criteria andShmlevlNotBetween(String value1, String value2) {
            addCriterion("shmlevl not between", value1, value2, "shmlevl");
            return (Criteria) this;
        }

        public Criteria andShmplaceIsNull() {
            addCriterion("shmplace is null");
            return (Criteria) this;
        }

        public Criteria andShmplaceIsNotNull() {
            addCriterion("shmplace is not null");
            return (Criteria) this;
        }

        public Criteria andShmplaceEqualTo(String value) {
            addCriterion("shmplace =", value, "shmplace");
            return (Criteria) this;
        }

        public Criteria andShmplaceNotEqualTo(String value) {
            addCriterion("shmplace <>", value, "shmplace");
            return (Criteria) this;
        }

        public Criteria andShmplaceGreaterThan(String value) {
            addCriterion("shmplace >", value, "shmplace");
            return (Criteria) this;
        }

        public Criteria andShmplaceGreaterThanOrEqualTo(String value) {
            addCriterion("shmplace >=", value, "shmplace");
            return (Criteria) this;
        }

        public Criteria andShmplaceLessThan(String value) {
            addCriterion("shmplace <", value, "shmplace");
            return (Criteria) this;
        }

        public Criteria andShmplaceLessThanOrEqualTo(String value) {
            addCriterion("shmplace <=", value, "shmplace");
            return (Criteria) this;
        }

        public Criteria andShmplaceLike(String value) {
            addCriterion("shmplace like", value, "shmplace");
            return (Criteria) this;
        }

        public Criteria andShmplaceNotLike(String value) {
            addCriterion("shmplace not like", value, "shmplace");
            return (Criteria) this;
        }

        public Criteria andShmplaceIn(List<String> values) {
            addCriterion("shmplace in", values, "shmplace");
            return (Criteria) this;
        }

        public Criteria andShmplaceNotIn(List<String> values) {
            addCriterion("shmplace not in", values, "shmplace");
            return (Criteria) this;
        }

        public Criteria andShmplaceBetween(String value1, String value2) {
            addCriterion("shmplace between", value1, value2, "shmplace");
            return (Criteria) this;
        }

        public Criteria andShmplaceNotBetween(String value1, String value2) {
            addCriterion("shmplace not between", value1, value2, "shmplace");
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

        public Criteria andShmcodingIsNull() {
            addCriterion("shmcoding is null");
            return (Criteria) this;
        }

        public Criteria andShmcodingIsNotNull() {
            addCriterion("shmcoding is not null");
            return (Criteria) this;
        }

        public Criteria andShmcodingEqualTo(String value) {
            addCriterion("shmcoding =", value, "shmcoding");
            return (Criteria) this;
        }

        public Criteria andShmcodingNotEqualTo(String value) {
            addCriterion("shmcoding <>", value, "shmcoding");
            return (Criteria) this;
        }

        public Criteria andShmcodingGreaterThan(String value) {
            addCriterion("shmcoding >", value, "shmcoding");
            return (Criteria) this;
        }

        public Criteria andShmcodingGreaterThanOrEqualTo(String value) {
            addCriterion("shmcoding >=", value, "shmcoding");
            return (Criteria) this;
        }

        public Criteria andShmcodingLessThan(String value) {
            addCriterion("shmcoding <", value, "shmcoding");
            return (Criteria) this;
        }

        public Criteria andShmcodingLessThanOrEqualTo(String value) {
            addCriterion("shmcoding <=", value, "shmcoding");
            return (Criteria) this;
        }

        public Criteria andShmcodingLike(String value) {
            addCriterion("shmcoding like", value, "shmcoding");
            return (Criteria) this;
        }

        public Criteria andShmcodingNotLike(String value) {
            addCriterion("shmcoding not like", value, "shmcoding");
            return (Criteria) this;
        }

        public Criteria andShmcodingIn(List<String> values) {
            addCriterion("shmcoding in", values, "shmcoding");
            return (Criteria) this;
        }

        public Criteria andShmcodingNotIn(List<String> values) {
            addCriterion("shmcoding not in", values, "shmcoding");
            return (Criteria) this;
        }

        public Criteria andShmcodingBetween(String value1, String value2) {
            addCriterion("shmcoding between", value1, value2, "shmcoding");
            return (Criteria) this;
        }

        public Criteria andShmcodingNotBetween(String value1, String value2) {
            addCriterion("shmcoding not between", value1, value2, "shmcoding");
            return (Criteria) this;
        }

        public Criteria andShmcodeIsNull() {
            addCriterion("shmcode is null");
            return (Criteria) this;
        }

        public Criteria andShmcodeIsNotNull() {
            addCriterion("shmcode is not null");
            return (Criteria) this;
        }

        public Criteria andShmcodeEqualTo(String value) {
            addCriterion("shmcode =", value, "shmcode");
            return (Criteria) this;
        }

        public Criteria andShmcodeNotEqualTo(String value) {
            addCriterion("shmcode <>", value, "shmcode");
            return (Criteria) this;
        }

        public Criteria andShmcodeGreaterThan(String value) {
            addCriterion("shmcode >", value, "shmcode");
            return (Criteria) this;
        }

        public Criteria andShmcodeGreaterThanOrEqualTo(String value) {
            addCriterion("shmcode >=", value, "shmcode");
            return (Criteria) this;
        }

        public Criteria andShmcodeLessThan(String value) {
            addCriterion("shmcode <", value, "shmcode");
            return (Criteria) this;
        }

        public Criteria andShmcodeLessThanOrEqualTo(String value) {
            addCriterion("shmcode <=", value, "shmcode");
            return (Criteria) this;
        }

        public Criteria andShmcodeLike(String value) {
            addCriterion("shmcode like", value, "shmcode");
            return (Criteria) this;
        }

        public Criteria andShmcodeNotLike(String value) {
            addCriterion("shmcode not like", value, "shmcode");
            return (Criteria) this;
        }

        public Criteria andShmcodeIn(List<String> values) {
            addCriterion("shmcode in", values, "shmcode");
            return (Criteria) this;
        }

        public Criteria andShmcodeNotIn(List<String> values) {
            addCriterion("shmcode not in", values, "shmcode");
            return (Criteria) this;
        }

        public Criteria andShmcodeBetween(String value1, String value2) {
            addCriterion("shmcode between", value1, value2, "shmcode");
            return (Criteria) this;
        }

        public Criteria andShmcodeNotBetween(String value1, String value2) {
            addCriterion("shmcode not between", value1, value2, "shmcode");
            return (Criteria) this;
        }

        public Criteria andShmspecificationIsNull() {
            addCriterion("shmspecification is null");
            return (Criteria) this;
        }

        public Criteria andShmspecificationIsNotNull() {
            addCriterion("shmspecification is not null");
            return (Criteria) this;
        }

        public Criteria andShmspecificationEqualTo(String value) {
            addCriterion("shmspecification =", value, "shmspecification");
            return (Criteria) this;
        }

        public Criteria andShmspecificationNotEqualTo(String value) {
            addCriterion("shmspecification <>", value, "shmspecification");
            return (Criteria) this;
        }

        public Criteria andShmspecificationGreaterThan(String value) {
            addCriterion("shmspecification >", value, "shmspecification");
            return (Criteria) this;
        }

        public Criteria andShmspecificationGreaterThanOrEqualTo(String value) {
            addCriterion("shmspecification >=", value, "shmspecification");
            return (Criteria) this;
        }

        public Criteria andShmspecificationLessThan(String value) {
            addCriterion("shmspecification <", value, "shmspecification");
            return (Criteria) this;
        }

        public Criteria andShmspecificationLessThanOrEqualTo(String value) {
            addCriterion("shmspecification <=", value, "shmspecification");
            return (Criteria) this;
        }

        public Criteria andShmspecificationLike(String value) {
            addCriterion("shmspecification like", value, "shmspecification");
            return (Criteria) this;
        }

        public Criteria andShmspecificationNotLike(String value) {
            addCriterion("shmspecification not like", value, "shmspecification");
            return (Criteria) this;
        }

        public Criteria andShmspecificationIn(List<String> values) {
            addCriterion("shmspecification in", values, "shmspecification");
            return (Criteria) this;
        }

        public Criteria andShmspecificationNotIn(List<String> values) {
            addCriterion("shmspecification not in", values, "shmspecification");
            return (Criteria) this;
        }

        public Criteria andShmspecificationBetween(String value1, String value2) {
            addCriterion("shmspecification between", value1, value2, "shmspecification");
            return (Criteria) this;
        }

        public Criteria andShmspecificationNotBetween(String value1, String value2) {
            addCriterion("shmspecification not between", value1, value2, "shmspecification");
            return (Criteria) this;
        }

        public Criteria andShmbulkIsNull() {
            addCriterion("shmbulk is null");
            return (Criteria) this;
        }

        public Criteria andShmbulkIsNotNull() {
            addCriterion("shmbulk is not null");
            return (Criteria) this;
        }

        public Criteria andShmbulkEqualTo(String value) {
            addCriterion("shmbulk =", value, "shmbulk");
            return (Criteria) this;
        }

        public Criteria andShmbulkNotEqualTo(String value) {
            addCriterion("shmbulk <>", value, "shmbulk");
            return (Criteria) this;
        }

        public Criteria andShmbulkGreaterThan(String value) {
            addCriterion("shmbulk >", value, "shmbulk");
            return (Criteria) this;
        }

        public Criteria andShmbulkGreaterThanOrEqualTo(String value) {
            addCriterion("shmbulk >=", value, "shmbulk");
            return (Criteria) this;
        }

        public Criteria andShmbulkLessThan(String value) {
            addCriterion("shmbulk <", value, "shmbulk");
            return (Criteria) this;
        }

        public Criteria andShmbulkLessThanOrEqualTo(String value) {
            addCriterion("shmbulk <=", value, "shmbulk");
            return (Criteria) this;
        }

        public Criteria andShmbulkLike(String value) {
            addCriterion("shmbulk like", value, "shmbulk");
            return (Criteria) this;
        }

        public Criteria andShmbulkNotLike(String value) {
            addCriterion("shmbulk not like", value, "shmbulk");
            return (Criteria) this;
        }

        public Criteria andShmbulkIn(List<String> values) {
            addCriterion("shmbulk in", values, "shmbulk");
            return (Criteria) this;
        }

        public Criteria andShmbulkNotIn(List<String> values) {
            addCriterion("shmbulk not in", values, "shmbulk");
            return (Criteria) this;
        }

        public Criteria andShmbulkBetween(String value1, String value2) {
            addCriterion("shmbulk between", value1, value2, "shmbulk");
            return (Criteria) this;
        }

        public Criteria andShmbulkNotBetween(String value1, String value2) {
            addCriterion("shmbulk not between", value1, value2, "shmbulk");
            return (Criteria) this;
        }

        public Criteria andShmroughIsNull() {
            addCriterion("shmrough is null");
            return (Criteria) this;
        }

        public Criteria andShmroughIsNotNull() {
            addCriterion("shmrough is not null");
            return (Criteria) this;
        }

        public Criteria andShmroughEqualTo(Integer value) {
            addCriterion("shmrough =", value, "shmrough");
            return (Criteria) this;
        }

        public Criteria andShmroughNotEqualTo(Integer value) {
            addCriterion("shmrough <>", value, "shmrough");
            return (Criteria) this;
        }

        public Criteria andShmroughGreaterThan(Integer value) {
            addCriterion("shmrough >", value, "shmrough");
            return (Criteria) this;
        }

        public Criteria andShmroughGreaterThanOrEqualTo(Integer value) {
            addCriterion("shmrough >=", value, "shmrough");
            return (Criteria) this;
        }

        public Criteria andShmroughLessThan(Integer value) {
            addCriterion("shmrough <", value, "shmrough");
            return (Criteria) this;
        }

        public Criteria andShmroughLessThanOrEqualTo(Integer value) {
            addCriterion("shmrough <=", value, "shmrough");
            return (Criteria) this;
        }

        public Criteria andShmroughIn(List<Integer> values) {
            addCriterion("shmrough in", values, "shmrough");
            return (Criteria) this;
        }

        public Criteria andShmroughNotIn(List<Integer> values) {
            addCriterion("shmrough not in", values, "shmrough");
            return (Criteria) this;
        }

        public Criteria andShmroughBetween(Integer value1, Integer value2) {
            addCriterion("shmrough between", value1, value2, "shmrough");
            return (Criteria) this;
        }

        public Criteria andShmroughNotBetween(Integer value1, Integer value2) {
            addCriterion("shmrough not between", value1, value2, "shmrough");
            return (Criteria) this;
        }

        public Criteria andShmnetIsNull() {
            addCriterion("shmnet is null");
            return (Criteria) this;
        }

        public Criteria andShmnetIsNotNull() {
            addCriterion("shmnet is not null");
            return (Criteria) this;
        }

        public Criteria andShmnetEqualTo(Integer value) {
            addCriterion("shmnet =", value, "shmnet");
            return (Criteria) this;
        }

        public Criteria andShmnetNotEqualTo(Integer value) {
            addCriterion("shmnet <>", value, "shmnet");
            return (Criteria) this;
        }

        public Criteria andShmnetGreaterThan(Integer value) {
            addCriterion("shmnet >", value, "shmnet");
            return (Criteria) this;
        }

        public Criteria andShmnetGreaterThanOrEqualTo(Integer value) {
            addCriterion("shmnet >=", value, "shmnet");
            return (Criteria) this;
        }

        public Criteria andShmnetLessThan(Integer value) {
            addCriterion("shmnet <", value, "shmnet");
            return (Criteria) this;
        }

        public Criteria andShmnetLessThanOrEqualTo(Integer value) {
            addCriterion("shmnet <=", value, "shmnet");
            return (Criteria) this;
        }

        public Criteria andShmnetIn(List<Integer> values) {
            addCriterion("shmnet in", values, "shmnet");
            return (Criteria) this;
        }

        public Criteria andShmnetNotIn(List<Integer> values) {
            addCriterion("shmnet not in", values, "shmnet");
            return (Criteria) this;
        }

        public Criteria andShmnetBetween(Integer value1, Integer value2) {
            addCriterion("shmnet between", value1, value2, "shmnet");
            return (Criteria) this;
        }

        public Criteria andShmnetNotBetween(Integer value1, Integer value2) {
            addCriterion("shmnet not between", value1, value2, "shmnet");
            return (Criteria) this;
        }

        public Criteria andShmstockIsNull() {
            addCriterion("shmstock is null");
            return (Criteria) this;
        }

        public Criteria andShmstockIsNotNull() {
            addCriterion("shmstock is not null");
            return (Criteria) this;
        }

        public Criteria andShmstockEqualTo(Integer value) {
            addCriterion("shmstock =", value, "shmstock");
            return (Criteria) this;
        }

        public Criteria andShmstockNotEqualTo(Integer value) {
            addCriterion("shmstock <>", value, "shmstock");
            return (Criteria) this;
        }

        public Criteria andShmstockGreaterThan(Integer value) {
            addCriterion("shmstock >", value, "shmstock");
            return (Criteria) this;
        }

        public Criteria andShmstockGreaterThanOrEqualTo(Integer value) {
            addCriterion("shmstock >=", value, "shmstock");
            return (Criteria) this;
        }

        public Criteria andShmstockLessThan(Integer value) {
            addCriterion("shmstock <", value, "shmstock");
            return (Criteria) this;
        }

        public Criteria andShmstockLessThanOrEqualTo(Integer value) {
            addCriterion("shmstock <=", value, "shmstock");
            return (Criteria) this;
        }

        public Criteria andShmstockIn(List<Integer> values) {
            addCriterion("shmstock in", values, "shmstock");
            return (Criteria) this;
        }

        public Criteria andShmstockNotIn(List<Integer> values) {
            addCriterion("shmstock not in", values, "shmstock");
            return (Criteria) this;
        }

        public Criteria andShmstockBetween(Integer value1, Integer value2) {
            addCriterion("shmstock between", value1, value2, "shmstock");
            return (Criteria) this;
        }

        public Criteria andShmstockNotBetween(Integer value1, Integer value2) {
            addCriterion("shmstock not between", value1, value2, "shmstock");
            return (Criteria) this;
        }

        public Criteria andShmsellingIsNull() {
            addCriterion("shmselling is null");
            return (Criteria) this;
        }

        public Criteria andShmsellingIsNotNull() {
            addCriterion("shmselling is not null");
            return (Criteria) this;
        }

        public Criteria andShmsellingEqualTo(String value) {
            addCriterion("shmselling =", value, "shmselling");
            return (Criteria) this;
        }

        public Criteria andShmsellingNotEqualTo(String value) {
            addCriterion("shmselling <>", value, "shmselling");
            return (Criteria) this;
        }

        public Criteria andShmsellingGreaterThan(String value) {
            addCriterion("shmselling >", value, "shmselling");
            return (Criteria) this;
        }

        public Criteria andShmsellingGreaterThanOrEqualTo(String value) {
            addCriterion("shmselling >=", value, "shmselling");
            return (Criteria) this;
        }

        public Criteria andShmsellingLessThan(String value) {
            addCriterion("shmselling <", value, "shmselling");
            return (Criteria) this;
        }

        public Criteria andShmsellingLessThanOrEqualTo(String value) {
            addCriterion("shmselling <=", value, "shmselling");
            return (Criteria) this;
        }

        public Criteria andShmsellingLike(String value) {
            addCriterion("shmselling like", value, "shmselling");
            return (Criteria) this;
        }

        public Criteria andShmsellingNotLike(String value) {
            addCriterion("shmselling not like", value, "shmselling");
            return (Criteria) this;
        }

        public Criteria andShmsellingIn(List<String> values) {
            addCriterion("shmselling in", values, "shmselling");
            return (Criteria) this;
        }

        public Criteria andShmsellingNotIn(List<String> values) {
            addCriterion("shmselling not in", values, "shmselling");
            return (Criteria) this;
        }

        public Criteria andShmsellingBetween(String value1, String value2) {
            addCriterion("shmselling between", value1, value2, "shmselling");
            return (Criteria) this;
        }

        public Criteria andShmsellingNotBetween(String value1, String value2) {
            addCriterion("shmselling not between", value1, value2, "shmselling");
            return (Criteria) this;
        }

        public Criteria andShmraiseIsNull() {
            addCriterion("shmraise is null");
            return (Criteria) this;
        }

        public Criteria andShmraiseIsNotNull() {
            addCriterion("shmraise is not null");
            return (Criteria) this;
        }

        public Criteria andShmraiseEqualTo(Integer value) {
            addCriterion("shmraise =", value, "shmraise");
            return (Criteria) this;
        }

        public Criteria andShmraiseNotEqualTo(Integer value) {
            addCriterion("shmraise <>", value, "shmraise");
            return (Criteria) this;
        }

        public Criteria andShmraiseGreaterThan(Integer value) {
            addCriterion("shmraise >", value, "shmraise");
            return (Criteria) this;
        }

        public Criteria andShmraiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("shmraise >=", value, "shmraise");
            return (Criteria) this;
        }

        public Criteria andShmraiseLessThan(Integer value) {
            addCriterion("shmraise <", value, "shmraise");
            return (Criteria) this;
        }

        public Criteria andShmraiseLessThanOrEqualTo(Integer value) {
            addCriterion("shmraise <=", value, "shmraise");
            return (Criteria) this;
        }

        public Criteria andShmraiseIn(List<Integer> values) {
            addCriterion("shmraise in", values, "shmraise");
            return (Criteria) this;
        }

        public Criteria andShmraiseNotIn(List<Integer> values) {
            addCriterion("shmraise not in", values, "shmraise");
            return (Criteria) this;
        }

        public Criteria andShmraiseBetween(Integer value1, Integer value2) {
            addCriterion("shmraise between", value1, value2, "shmraise");
            return (Criteria) this;
        }

        public Criteria andShmraiseNotBetween(Integer value1, Integer value2) {
            addCriterion("shmraise not between", value1, value2, "shmraise");
            return (Criteria) this;
        }

        public Criteria andShmexchangeIsNull() {
            addCriterion("shmexchange is null");
            return (Criteria) this;
        }

        public Criteria andShmexchangeIsNotNull() {
            addCriterion("shmexchange is not null");
            return (Criteria) this;
        }

        public Criteria andShmexchangeEqualTo(String value) {
            addCriterion("shmexchange =", value, "shmexchange");
            return (Criteria) this;
        }

        public Criteria andShmexchangeNotEqualTo(String value) {
            addCriterion("shmexchange <>", value, "shmexchange");
            return (Criteria) this;
        }

        public Criteria andShmexchangeGreaterThan(String value) {
            addCriterion("shmexchange >", value, "shmexchange");
            return (Criteria) this;
        }

        public Criteria andShmexchangeGreaterThanOrEqualTo(String value) {
            addCriterion("shmexchange >=", value, "shmexchange");
            return (Criteria) this;
        }

        public Criteria andShmexchangeLessThan(String value) {
            addCriterion("shmexchange <", value, "shmexchange");
            return (Criteria) this;
        }

        public Criteria andShmexchangeLessThanOrEqualTo(String value) {
            addCriterion("shmexchange <=", value, "shmexchange");
            return (Criteria) this;
        }

        public Criteria andShmexchangeLike(String value) {
            addCriterion("shmexchange like", value, "shmexchange");
            return (Criteria) this;
        }

        public Criteria andShmexchangeNotLike(String value) {
            addCriterion("shmexchange not like", value, "shmexchange");
            return (Criteria) this;
        }

        public Criteria andShmexchangeIn(List<String> values) {
            addCriterion("shmexchange in", values, "shmexchange");
            return (Criteria) this;
        }

        public Criteria andShmexchangeNotIn(List<String> values) {
            addCriterion("shmexchange not in", values, "shmexchange");
            return (Criteria) this;
        }

        public Criteria andShmexchangeBetween(String value1, String value2) {
            addCriterion("shmexchange between", value1, value2, "shmexchange");
            return (Criteria) this;
        }

        public Criteria andShmexchangeNotBetween(String value1, String value2) {
            addCriterion("shmexchange not between", value1, value2, "shmexchange");
            return (Criteria) this;
        }

        public Criteria andShmstandardIsNull() {
            addCriterion("shmstandard is null");
            return (Criteria) this;
        }

        public Criteria andShmstandardIsNotNull() {
            addCriterion("shmstandard is not null");
            return (Criteria) this;
        }

        public Criteria andShmstandardEqualTo(Integer value) {
            addCriterion("shmstandard =", value, "shmstandard");
            return (Criteria) this;
        }

        public Criteria andShmstandardNotEqualTo(Integer value) {
            addCriterion("shmstandard <>", value, "shmstandard");
            return (Criteria) this;
        }

        public Criteria andShmstandardGreaterThan(Integer value) {
            addCriterion("shmstandard >", value, "shmstandard");
            return (Criteria) this;
        }

        public Criteria andShmstandardGreaterThanOrEqualTo(Integer value) {
            addCriterion("shmstandard >=", value, "shmstandard");
            return (Criteria) this;
        }

        public Criteria andShmstandardLessThan(Integer value) {
            addCriterion("shmstandard <", value, "shmstandard");
            return (Criteria) this;
        }

        public Criteria andShmstandardLessThanOrEqualTo(Integer value) {
            addCriterion("shmstandard <=", value, "shmstandard");
            return (Criteria) this;
        }

        public Criteria andShmstandardIn(List<Integer> values) {
            addCriterion("shmstandard in", values, "shmstandard");
            return (Criteria) this;
        }

        public Criteria andShmstandardNotIn(List<Integer> values) {
            addCriterion("shmstandard not in", values, "shmstandard");
            return (Criteria) this;
        }

        public Criteria andShmstandardBetween(Integer value1, Integer value2) {
            addCriterion("shmstandard between", value1, value2, "shmstandard");
            return (Criteria) this;
        }

        public Criteria andShmstandardNotBetween(Integer value1, Integer value2) {
            addCriterion("shmstandard not between", value1, value2, "shmstandard");
            return (Criteria) this;
        }

        public Criteria andShmmemberIsNull() {
            addCriterion("shmmember is null");
            return (Criteria) this;
        }

        public Criteria andShmmemberIsNotNull() {
            addCriterion("shmmember is not null");
            return (Criteria) this;
        }

        public Criteria andShmmemberEqualTo(Integer value) {
            addCriterion("shmmember =", value, "shmmember");
            return (Criteria) this;
        }

        public Criteria andShmmemberNotEqualTo(Integer value) {
            addCriterion("shmmember <>", value, "shmmember");
            return (Criteria) this;
        }

        public Criteria andShmmemberGreaterThan(Integer value) {
            addCriterion("shmmember >", value, "shmmember");
            return (Criteria) this;
        }

        public Criteria andShmmemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("shmmember >=", value, "shmmember");
            return (Criteria) this;
        }

        public Criteria andShmmemberLessThan(Integer value) {
            addCriterion("shmmember <", value, "shmmember");
            return (Criteria) this;
        }

        public Criteria andShmmemberLessThanOrEqualTo(Integer value) {
            addCriterion("shmmember <=", value, "shmmember");
            return (Criteria) this;
        }

        public Criteria andShmmemberIn(List<Integer> values) {
            addCriterion("shmmember in", values, "shmmember");
            return (Criteria) this;
        }

        public Criteria andShmmemberNotIn(List<Integer> values) {
            addCriterion("shmmember not in", values, "shmmember");
            return (Criteria) this;
        }

        public Criteria andShmmemberBetween(Integer value1, Integer value2) {
            addCriterion("shmmember between", value1, value2, "shmmember");
            return (Criteria) this;
        }

        public Criteria andShmmemberNotBetween(Integer value1, Integer value2) {
            addCriterion("shmmember not between", value1, value2, "shmmember");
            return (Criteria) this;
        }

        public Criteria andShmvipIsNull() {
            addCriterion("shmvip is null");
            return (Criteria) this;
        }

        public Criteria andShmvipIsNotNull() {
            addCriterion("shmvip is not null");
            return (Criteria) this;
        }

        public Criteria andShmvipEqualTo(Integer value) {
            addCriterion("shmvip =", value, "shmvip");
            return (Criteria) this;
        }

        public Criteria andShmvipNotEqualTo(Integer value) {
            addCriterion("shmvip <>", value, "shmvip");
            return (Criteria) this;
        }

        public Criteria andShmvipGreaterThan(Integer value) {
            addCriterion("shmvip >", value, "shmvip");
            return (Criteria) this;
        }

        public Criteria andShmvipGreaterThanOrEqualTo(Integer value) {
            addCriterion("shmvip >=", value, "shmvip");
            return (Criteria) this;
        }

        public Criteria andShmvipLessThan(Integer value) {
            addCriterion("shmvip <", value, "shmvip");
            return (Criteria) this;
        }

        public Criteria andShmvipLessThanOrEqualTo(Integer value) {
            addCriterion("shmvip <=", value, "shmvip");
            return (Criteria) this;
        }

        public Criteria andShmvipIn(List<Integer> values) {
            addCriterion("shmvip in", values, "shmvip");
            return (Criteria) this;
        }

        public Criteria andShmvipNotIn(List<Integer> values) {
            addCriterion("shmvip not in", values, "shmvip");
            return (Criteria) this;
        }

        public Criteria andShmvipBetween(Integer value1, Integer value2) {
            addCriterion("shmvip between", value1, value2, "shmvip");
            return (Criteria) this;
        }

        public Criteria andShmvipNotBetween(Integer value1, Integer value2) {
            addCriterion("shmvip not between", value1, value2, "shmvip");
            return (Criteria) this;
        }

        public Criteria andShmdealIsNull() {
            addCriterion("shmdeal is null");
            return (Criteria) this;
        }

        public Criteria andShmdealIsNotNull() {
            addCriterion("shmdeal is not null");
            return (Criteria) this;
        }

        public Criteria andShmdealEqualTo(Integer value) {
            addCriterion("shmdeal =", value, "shmdeal");
            return (Criteria) this;
        }

        public Criteria andShmdealNotEqualTo(Integer value) {
            addCriterion("shmdeal <>", value, "shmdeal");
            return (Criteria) this;
        }

        public Criteria andShmdealGreaterThan(Integer value) {
            addCriterion("shmdeal >", value, "shmdeal");
            return (Criteria) this;
        }

        public Criteria andShmdealGreaterThanOrEqualTo(Integer value) {
            addCriterion("shmdeal >=", value, "shmdeal");
            return (Criteria) this;
        }

        public Criteria andShmdealLessThan(Integer value) {
            addCriterion("shmdeal <", value, "shmdeal");
            return (Criteria) this;
        }

        public Criteria andShmdealLessThanOrEqualTo(Integer value) {
            addCriterion("shmdeal <=", value, "shmdeal");
            return (Criteria) this;
        }

        public Criteria andShmdealIn(List<Integer> values) {
            addCriterion("shmdeal in", values, "shmdeal");
            return (Criteria) this;
        }

        public Criteria andShmdealNotIn(List<Integer> values) {
            addCriterion("shmdeal not in", values, "shmdeal");
            return (Criteria) this;
        }

        public Criteria andShmdealBetween(Integer value1, Integer value2) {
            addCriterion("shmdeal between", value1, value2, "shmdeal");
            return (Criteria) this;
        }

        public Criteria andShmdealNotBetween(Integer value1, Integer value2) {
            addCriterion("shmdeal not between", value1, value2, "shmdeal");
            return (Criteria) this;
        }

        public Criteria andShmclaimIsNull() {
            addCriterion("shmclaim is null");
            return (Criteria) this;
        }

        public Criteria andShmclaimIsNotNull() {
            addCriterion("shmclaim is not null");
            return (Criteria) this;
        }

        public Criteria andShmclaimEqualTo(Integer value) {
            addCriterion("shmclaim =", value, "shmclaim");
            return (Criteria) this;
        }

        public Criteria andShmclaimNotEqualTo(Integer value) {
            addCriterion("shmclaim <>", value, "shmclaim");
            return (Criteria) this;
        }

        public Criteria andShmclaimGreaterThan(Integer value) {
            addCriterion("shmclaim >", value, "shmclaim");
            return (Criteria) this;
        }

        public Criteria andShmclaimGreaterThanOrEqualTo(Integer value) {
            addCriterion("shmclaim >=", value, "shmclaim");
            return (Criteria) this;
        }

        public Criteria andShmclaimLessThan(Integer value) {
            addCriterion("shmclaim <", value, "shmclaim");
            return (Criteria) this;
        }

        public Criteria andShmclaimLessThanOrEqualTo(Integer value) {
            addCriterion("shmclaim <=", value, "shmclaim");
            return (Criteria) this;
        }

        public Criteria andShmclaimIn(List<Integer> values) {
            addCriterion("shmclaim in", values, "shmclaim");
            return (Criteria) this;
        }

        public Criteria andShmclaimNotIn(List<Integer> values) {
            addCriterion("shmclaim not in", values, "shmclaim");
            return (Criteria) this;
        }

        public Criteria andShmclaimBetween(Integer value1, Integer value2) {
            addCriterion("shmclaim between", value1, value2, "shmclaim");
            return (Criteria) this;
        }

        public Criteria andShmclaimNotBetween(Integer value1, Integer value2) {
            addCriterion("shmclaim not between", value1, value2, "shmclaim");
            return (Criteria) this;
        }

        public Criteria andShminsuranceIsNull() {
            addCriterion("shminsurance is null");
            return (Criteria) this;
        }

        public Criteria andShminsuranceIsNotNull() {
            addCriterion("shminsurance is not null");
            return (Criteria) this;
        }

        public Criteria andShminsuranceEqualTo(Integer value) {
            addCriterion("shminsurance =", value, "shminsurance");
            return (Criteria) this;
        }

        public Criteria andShminsuranceNotEqualTo(Integer value) {
            addCriterion("shminsurance <>", value, "shminsurance");
            return (Criteria) this;
        }

        public Criteria andShminsuranceGreaterThan(Integer value) {
            addCriterion("shminsurance >", value, "shminsurance");
            return (Criteria) this;
        }

        public Criteria andShminsuranceGreaterThanOrEqualTo(Integer value) {
            addCriterion("shminsurance >=", value, "shminsurance");
            return (Criteria) this;
        }

        public Criteria andShminsuranceLessThan(Integer value) {
            addCriterion("shminsurance <", value, "shminsurance");
            return (Criteria) this;
        }

        public Criteria andShminsuranceLessThanOrEqualTo(Integer value) {
            addCriterion("shminsurance <=", value, "shminsurance");
            return (Criteria) this;
        }

        public Criteria andShminsuranceIn(List<Integer> values) {
            addCriterion("shminsurance in", values, "shminsurance");
            return (Criteria) this;
        }

        public Criteria andShminsuranceNotIn(List<Integer> values) {
            addCriterion("shminsurance not in", values, "shminsurance");
            return (Criteria) this;
        }

        public Criteria andShminsuranceBetween(Integer value1, Integer value2) {
            addCriterion("shminsurance between", value1, value2, "shminsurance");
            return (Criteria) this;
        }

        public Criteria andShminsuranceNotBetween(Integer value1, Integer value2) {
            addCriterion("shminsurance not between", value1, value2, "shminsurance");
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