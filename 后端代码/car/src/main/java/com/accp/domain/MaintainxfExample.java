package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class MaintainxfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaintainxfExample() {
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

        public Criteria andMafidIsNull() {
            addCriterion("mafid is null");
            return (Criteria) this;
        }

        public Criteria andMafidIsNotNull() {
            addCriterion("mafid is not null");
            return (Criteria) this;
        }

        public Criteria andMafidEqualTo(String value) {
            addCriterion("mafid =", value, "mafid");
            return (Criteria) this;
        }

        public Criteria andMafidNotEqualTo(String value) {
            addCriterion("mafid <>", value, "mafid");
            return (Criteria) this;
        }

        public Criteria andMafidGreaterThan(String value) {
            addCriterion("mafid >", value, "mafid");
            return (Criteria) this;
        }

        public Criteria andMafidGreaterThanOrEqualTo(String value) {
            addCriterion("mafid >=", value, "mafid");
            return (Criteria) this;
        }

        public Criteria andMafidLessThan(String value) {
            addCriterion("mafid <", value, "mafid");
            return (Criteria) this;
        }

        public Criteria andMafidLessThanOrEqualTo(String value) {
            addCriterion("mafid <=", value, "mafid");
            return (Criteria) this;
        }

        public Criteria andMafidLike(String value) {
            addCriterion("mafid like", value, "mafid");
            return (Criteria) this;
        }

        public Criteria andMafidNotLike(String value) {
            addCriterion("mafid not like", value, "mafid");
            return (Criteria) this;
        }

        public Criteria andMafidIn(List<String> values) {
            addCriterion("mafid in", values, "mafid");
            return (Criteria) this;
        }

        public Criteria andMafidNotIn(List<String> values) {
            addCriterion("mafid not in", values, "mafid");
            return (Criteria) this;
        }

        public Criteria andMafidBetween(String value1, String value2) {
            addCriterion("mafid between", value1, value2, "mafid");
            return (Criteria) this;
        }

        public Criteria andMafidNotBetween(String value1, String value2) {
            addCriterion("mafid not between", value1, value2, "mafid");
            return (Criteria) this;
        }

        public Criteria andOrridIsNull() {
            addCriterion("orrid is null");
            return (Criteria) this;
        }

        public Criteria andOrridIsNotNull() {
            addCriterion("orrid is not null");
            return (Criteria) this;
        }

        public Criteria andOrridEqualTo(String value) {
            addCriterion("orrid =", value, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridNotEqualTo(String value) {
            addCriterion("orrid <>", value, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridGreaterThan(String value) {
            addCriterion("orrid >", value, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridGreaterThanOrEqualTo(String value) {
            addCriterion("orrid >=", value, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridLessThan(String value) {
            addCriterion("orrid <", value, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridLessThanOrEqualTo(String value) {
            addCriterion("orrid <=", value, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridLike(String value) {
            addCriterion("orrid like", value, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridNotLike(String value) {
            addCriterion("orrid not like", value, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridIn(List<String> values) {
            addCriterion("orrid in", values, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridNotIn(List<String> values) {
            addCriterion("orrid not in", values, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridBetween(String value1, String value2) {
            addCriterion("orrid between", value1, value2, "orrid");
            return (Criteria) this;
        }

        public Criteria andOrridNotBetween(String value1, String value2) {
            addCriterion("orrid not between", value1, value2, "orrid");
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

        public Criteria andMafptypeIsNull() {
            addCriterion("mafptype is null");
            return (Criteria) this;
        }

        public Criteria andMafptypeIsNotNull() {
            addCriterion("mafptype is not null");
            return (Criteria) this;
        }

        public Criteria andMafptypeEqualTo(String value) {
            addCriterion("mafptype =", value, "mafptype");
            return (Criteria) this;
        }

        public Criteria andMafptypeNotEqualTo(String value) {
            addCriterion("mafptype <>", value, "mafptype");
            return (Criteria) this;
        }

        public Criteria andMafptypeGreaterThan(String value) {
            addCriterion("mafptype >", value, "mafptype");
            return (Criteria) this;
        }

        public Criteria andMafptypeGreaterThanOrEqualTo(String value) {
            addCriterion("mafptype >=", value, "mafptype");
            return (Criteria) this;
        }

        public Criteria andMafptypeLessThan(String value) {
            addCriterion("mafptype <", value, "mafptype");
            return (Criteria) this;
        }

        public Criteria andMafptypeLessThanOrEqualTo(String value) {
            addCriterion("mafptype <=", value, "mafptype");
            return (Criteria) this;
        }

        public Criteria andMafptypeLike(String value) {
            addCriterion("mafptype like", value, "mafptype");
            return (Criteria) this;
        }

        public Criteria andMafptypeNotLike(String value) {
            addCriterion("mafptype not like", value, "mafptype");
            return (Criteria) this;
        }

        public Criteria andMafptypeIn(List<String> values) {
            addCriterion("mafptype in", values, "mafptype");
            return (Criteria) this;
        }

        public Criteria andMafptypeNotIn(List<String> values) {
            addCriterion("mafptype not in", values, "mafptype");
            return (Criteria) this;
        }

        public Criteria andMafptypeBetween(String value1, String value2) {
            addCriterion("mafptype between", value1, value2, "mafptype");
            return (Criteria) this;
        }

        public Criteria andMafptypeNotBetween(String value1, String value2) {
            addCriterion("mafptype not between", value1, value2, "mafptype");
            return (Criteria) this;
        }

        public Criteria andMafavoidIsNull() {
            addCriterion("mafavoid is null");
            return (Criteria) this;
        }

        public Criteria andMafavoidIsNotNull() {
            addCriterion("mafavoid is not null");
            return (Criteria) this;
        }

        public Criteria andMafavoidEqualTo(String value) {
            addCriterion("mafavoid =", value, "mafavoid");
            return (Criteria) this;
        }

        public Criteria andMafavoidNotEqualTo(String value) {
            addCriterion("mafavoid <>", value, "mafavoid");
            return (Criteria) this;
        }

        public Criteria andMafavoidGreaterThan(String value) {
            addCriterion("mafavoid >", value, "mafavoid");
            return (Criteria) this;
        }

        public Criteria andMafavoidGreaterThanOrEqualTo(String value) {
            addCriterion("mafavoid >=", value, "mafavoid");
            return (Criteria) this;
        }

        public Criteria andMafavoidLessThan(String value) {
            addCriterion("mafavoid <", value, "mafavoid");
            return (Criteria) this;
        }

        public Criteria andMafavoidLessThanOrEqualTo(String value) {
            addCriterion("mafavoid <=", value, "mafavoid");
            return (Criteria) this;
        }

        public Criteria andMafavoidLike(String value) {
            addCriterion("mafavoid like", value, "mafavoid");
            return (Criteria) this;
        }

        public Criteria andMafavoidNotLike(String value) {
            addCriterion("mafavoid not like", value, "mafavoid");
            return (Criteria) this;
        }

        public Criteria andMafavoidIn(List<String> values) {
            addCriterion("mafavoid in", values, "mafavoid");
            return (Criteria) this;
        }

        public Criteria andMafavoidNotIn(List<String> values) {
            addCriterion("mafavoid not in", values, "mafavoid");
            return (Criteria) this;
        }

        public Criteria andMafavoidBetween(String value1, String value2) {
            addCriterion("mafavoid between", value1, value2, "mafavoid");
            return (Criteria) this;
        }

        public Criteria andMafavoidNotBetween(String value1, String value2) {
            addCriterion("mafavoid not between", value1, value2, "mafavoid");
            return (Criteria) this;
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

        public Criteria andMafbeforeIsNull() {
            addCriterion("mafbefore is null");
            return (Criteria) this;
        }

        public Criteria andMafbeforeIsNotNull() {
            addCriterion("mafbefore is not null");
            return (Criteria) this;
        }

        public Criteria andMafbeforeEqualTo(Integer value) {
            addCriterion("mafbefore =", value, "mafbefore");
            return (Criteria) this;
        }

        public Criteria andMafbeforeNotEqualTo(Integer value) {
            addCriterion("mafbefore <>", value, "mafbefore");
            return (Criteria) this;
        }

        public Criteria andMafbeforeGreaterThan(Integer value) {
            addCriterion("mafbefore >", value, "mafbefore");
            return (Criteria) this;
        }

        public Criteria andMafbeforeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mafbefore >=", value, "mafbefore");
            return (Criteria) this;
        }

        public Criteria andMafbeforeLessThan(Integer value) {
            addCriterion("mafbefore <", value, "mafbefore");
            return (Criteria) this;
        }

        public Criteria andMafbeforeLessThanOrEqualTo(Integer value) {
            addCriterion("mafbefore <=", value, "mafbefore");
            return (Criteria) this;
        }

        public Criteria andMafbeforeIn(List<Integer> values) {
            addCriterion("mafbefore in", values, "mafbefore");
            return (Criteria) this;
        }

        public Criteria andMafbeforeNotIn(List<Integer> values) {
            addCriterion("mafbefore not in", values, "mafbefore");
            return (Criteria) this;
        }

        public Criteria andMafbeforeBetween(Integer value1, Integer value2) {
            addCriterion("mafbefore between", value1, value2, "mafbefore");
            return (Criteria) this;
        }

        public Criteria andMafbeforeNotBetween(Integer value1, Integer value2) {
            addCriterion("mafbefore not between", value1, value2, "mafbefore");
            return (Criteria) this;
        }

        public Criteria andMaflaterIsNull() {
            addCriterion("maflater is null");
            return (Criteria) this;
        }

        public Criteria andMaflaterIsNotNull() {
            addCriterion("maflater is not null");
            return (Criteria) this;
        }

        public Criteria andMaflaterEqualTo(Integer value) {
            addCriterion("maflater =", value, "maflater");
            return (Criteria) this;
        }

        public Criteria andMaflaterNotEqualTo(Integer value) {
            addCriterion("maflater <>", value, "maflater");
            return (Criteria) this;
        }

        public Criteria andMaflaterGreaterThan(Integer value) {
            addCriterion("maflater >", value, "maflater");
            return (Criteria) this;
        }

        public Criteria andMaflaterGreaterThanOrEqualTo(Integer value) {
            addCriterion("maflater >=", value, "maflater");
            return (Criteria) this;
        }

        public Criteria andMaflaterLessThan(Integer value) {
            addCriterion("maflater <", value, "maflater");
            return (Criteria) this;
        }

        public Criteria andMaflaterLessThanOrEqualTo(Integer value) {
            addCriterion("maflater <=", value, "maflater");
            return (Criteria) this;
        }

        public Criteria andMaflaterIn(List<Integer> values) {
            addCriterion("maflater in", values, "maflater");
            return (Criteria) this;
        }

        public Criteria andMaflaterNotIn(List<Integer> values) {
            addCriterion("maflater not in", values, "maflater");
            return (Criteria) this;
        }

        public Criteria andMaflaterBetween(Integer value1, Integer value2) {
            addCriterion("maflater between", value1, value2, "maflater");
            return (Criteria) this;
        }

        public Criteria andMaflaterNotBetween(Integer value1, Integer value2) {
            addCriterion("maflater not between", value1, value2, "maflater");
            return (Criteria) this;
        }

        public Criteria andMafdescribeIsNull() {
            addCriterion("mafdescribe is null");
            return (Criteria) this;
        }

        public Criteria andMafdescribeIsNotNull() {
            addCriterion("mafdescribe is not null");
            return (Criteria) this;
        }

        public Criteria andMafdescribeEqualTo(String value) {
            addCriterion("mafdescribe =", value, "mafdescribe");
            return (Criteria) this;
        }

        public Criteria andMafdescribeNotEqualTo(String value) {
            addCriterion("mafdescribe <>", value, "mafdescribe");
            return (Criteria) this;
        }

        public Criteria andMafdescribeGreaterThan(String value) {
            addCriterion("mafdescribe >", value, "mafdescribe");
            return (Criteria) this;
        }

        public Criteria andMafdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("mafdescribe >=", value, "mafdescribe");
            return (Criteria) this;
        }

        public Criteria andMafdescribeLessThan(String value) {
            addCriterion("mafdescribe <", value, "mafdescribe");
            return (Criteria) this;
        }

        public Criteria andMafdescribeLessThanOrEqualTo(String value) {
            addCriterion("mafdescribe <=", value, "mafdescribe");
            return (Criteria) this;
        }

        public Criteria andMafdescribeLike(String value) {
            addCriterion("mafdescribe like", value, "mafdescribe");
            return (Criteria) this;
        }

        public Criteria andMafdescribeNotLike(String value) {
            addCriterion("mafdescribe not like", value, "mafdescribe");
            return (Criteria) this;
        }

        public Criteria andMafdescribeIn(List<String> values) {
            addCriterion("mafdescribe in", values, "mafdescribe");
            return (Criteria) this;
        }

        public Criteria andMafdescribeNotIn(List<String> values) {
            addCriterion("mafdescribe not in", values, "mafdescribe");
            return (Criteria) this;
        }

        public Criteria andMafdescribeBetween(String value1, String value2) {
            addCriterion("mafdescribe between", value1, value2, "mafdescribe");
            return (Criteria) this;
        }

        public Criteria andMafdescribeNotBetween(String value1, String value2) {
            addCriterion("mafdescribe not between", value1, value2, "mafdescribe");
            return (Criteria) this;
        }

        public Criteria andMafcauseIsNull() {
            addCriterion("mafcause is null");
            return (Criteria) this;
        }

        public Criteria andMafcauseIsNotNull() {
            addCriterion("mafcause is not null");
            return (Criteria) this;
        }

        public Criteria andMafcauseEqualTo(String value) {
            addCriterion("mafcause =", value, "mafcause");
            return (Criteria) this;
        }

        public Criteria andMafcauseNotEqualTo(String value) {
            addCriterion("mafcause <>", value, "mafcause");
            return (Criteria) this;
        }

        public Criteria andMafcauseGreaterThan(String value) {
            addCriterion("mafcause >", value, "mafcause");
            return (Criteria) this;
        }

        public Criteria andMafcauseGreaterThanOrEqualTo(String value) {
            addCriterion("mafcause >=", value, "mafcause");
            return (Criteria) this;
        }

        public Criteria andMafcauseLessThan(String value) {
            addCriterion("mafcause <", value, "mafcause");
            return (Criteria) this;
        }

        public Criteria andMafcauseLessThanOrEqualTo(String value) {
            addCriterion("mafcause <=", value, "mafcause");
            return (Criteria) this;
        }

        public Criteria andMafcauseLike(String value) {
            addCriterion("mafcause like", value, "mafcause");
            return (Criteria) this;
        }

        public Criteria andMafcauseNotLike(String value) {
            addCriterion("mafcause not like", value, "mafcause");
            return (Criteria) this;
        }

        public Criteria andMafcauseIn(List<String> values) {
            addCriterion("mafcause in", values, "mafcause");
            return (Criteria) this;
        }

        public Criteria andMafcauseNotIn(List<String> values) {
            addCriterion("mafcause not in", values, "mafcause");
            return (Criteria) this;
        }

        public Criteria andMafcauseBetween(String value1, String value2) {
            addCriterion("mafcause between", value1, value2, "mafcause");
            return (Criteria) this;
        }

        public Criteria andMafcauseNotBetween(String value1, String value2) {
            addCriterion("mafcause not between", value1, value2, "mafcause");
            return (Criteria) this;
        }

        public Criteria andTemidIsNull() {
            addCriterion("temid is null");
            return (Criteria) this;
        }

        public Criteria andTemidIsNotNull() {
            addCriterion("temid is not null");
            return (Criteria) this;
        }

        public Criteria andTemidEqualTo(String value) {
            addCriterion("temid =", value, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidNotEqualTo(String value) {
            addCriterion("temid <>", value, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidGreaterThan(String value) {
            addCriterion("temid >", value, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidGreaterThanOrEqualTo(String value) {
            addCriterion("temid >=", value, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidLessThan(String value) {
            addCriterion("temid <", value, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidLessThanOrEqualTo(String value) {
            addCriterion("temid <=", value, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidLike(String value) {
            addCriterion("temid like", value, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidNotLike(String value) {
            addCriterion("temid not like", value, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidIn(List<String> values) {
            addCriterion("temid in", values, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidNotIn(List<String> values) {
            addCriterion("temid not in", values, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidBetween(String value1, String value2) {
            addCriterion("temid between", value1, value2, "temid");
            return (Criteria) this;
        }

        public Criteria andTemidNotBetween(String value1, String value2) {
            addCriterion("temid not between", value1, value2, "temid");
            return (Criteria) this;
        }

        public Criteria andMafworkIsNull() {
            addCriterion("mafwork is null");
            return (Criteria) this;
        }

        public Criteria andMafworkIsNotNull() {
            addCriterion("mafwork is not null");
            return (Criteria) this;
        }

        public Criteria andMafworkEqualTo(String value) {
            addCriterion("mafwork =", value, "mafwork");
            return (Criteria) this;
        }

        public Criteria andMafworkNotEqualTo(String value) {
            addCriterion("mafwork <>", value, "mafwork");
            return (Criteria) this;
        }

        public Criteria andMafworkGreaterThan(String value) {
            addCriterion("mafwork >", value, "mafwork");
            return (Criteria) this;
        }

        public Criteria andMafworkGreaterThanOrEqualTo(String value) {
            addCriterion("mafwork >=", value, "mafwork");
            return (Criteria) this;
        }

        public Criteria andMafworkLessThan(String value) {
            addCriterion("mafwork <", value, "mafwork");
            return (Criteria) this;
        }

        public Criteria andMafworkLessThanOrEqualTo(String value) {
            addCriterion("mafwork <=", value, "mafwork");
            return (Criteria) this;
        }

        public Criteria andMafworkLike(String value) {
            addCriterion("mafwork like", value, "mafwork");
            return (Criteria) this;
        }

        public Criteria andMafworkNotLike(String value) {
            addCriterion("mafwork not like", value, "mafwork");
            return (Criteria) this;
        }

        public Criteria andMafworkIn(List<String> values) {
            addCriterion("mafwork in", values, "mafwork");
            return (Criteria) this;
        }

        public Criteria andMafworkNotIn(List<String> values) {
            addCriterion("mafwork not in", values, "mafwork");
            return (Criteria) this;
        }

        public Criteria andMafworkBetween(String value1, String value2) {
            addCriterion("mafwork between", value1, value2, "mafwork");
            return (Criteria) this;
        }

        public Criteria andMafworkNotBetween(String value1, String value2) {
            addCriterion("mafwork not between", value1, value2, "mafwork");
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