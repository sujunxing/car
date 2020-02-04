package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class MaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialExample() {
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

        public Criteria andMaiidIsNull() {
            addCriterion("maiid is null");
            return (Criteria) this;
        }

        public Criteria andMaiidIsNotNull() {
            addCriterion("maiid is not null");
            return (Criteria) this;
        }

        public Criteria andMaiidEqualTo(String value) {
            addCriterion("maiid =", value, "maiid");
            return (Criteria) this;
        }

        public Criteria andMaiidNotEqualTo(String value) {
            addCriterion("maiid <>", value, "maiid");
            return (Criteria) this;
        }

        public Criteria andMaiidGreaterThan(String value) {
            addCriterion("maiid >", value, "maiid");
            return (Criteria) this;
        }

        public Criteria andMaiidGreaterThanOrEqualTo(String value) {
            addCriterion("maiid >=", value, "maiid");
            return (Criteria) this;
        }

        public Criteria andMaiidLessThan(String value) {
            addCriterion("maiid <", value, "maiid");
            return (Criteria) this;
        }

        public Criteria andMaiidLessThanOrEqualTo(String value) {
            addCriterion("maiid <=", value, "maiid");
            return (Criteria) this;
        }

        public Criteria andMaiidLike(String value) {
            addCriterion("maiid like", value, "maiid");
            return (Criteria) this;
        }

        public Criteria andMaiidNotLike(String value) {
            addCriterion("maiid not like", value, "maiid");
            return (Criteria) this;
        }

        public Criteria andMaiidIn(List<String> values) {
            addCriterion("maiid in", values, "maiid");
            return (Criteria) this;
        }

        public Criteria andMaiidNotIn(List<String> values) {
            addCriterion("maiid not in", values, "maiid");
            return (Criteria) this;
        }

        public Criteria andMaiidBetween(String value1, String value2) {
            addCriterion("maiid between", value1, value2, "maiid");
            return (Criteria) this;
        }

        public Criteria andMaiidNotBetween(String value1, String value2) {
            addCriterion("maiid not between", value1, value2, "maiid");
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

        public Criteria andMainameIsNull() {
            addCriterion("mainame is null");
            return (Criteria) this;
        }

        public Criteria andMainameIsNotNull() {
            addCriterion("mainame is not null");
            return (Criteria) this;
        }

        public Criteria andMainameEqualTo(String value) {
            addCriterion("mainame =", value, "mainame");
            return (Criteria) this;
        }

        public Criteria andMainameNotEqualTo(String value) {
            addCriterion("mainame <>", value, "mainame");
            return (Criteria) this;
        }

        public Criteria andMainameGreaterThan(String value) {
            addCriterion("mainame >", value, "mainame");
            return (Criteria) this;
        }

        public Criteria andMainameGreaterThanOrEqualTo(String value) {
            addCriterion("mainame >=", value, "mainame");
            return (Criteria) this;
        }

        public Criteria andMainameLessThan(String value) {
            addCriterion("mainame <", value, "mainame");
            return (Criteria) this;
        }

        public Criteria andMainameLessThanOrEqualTo(String value) {
            addCriterion("mainame <=", value, "mainame");
            return (Criteria) this;
        }

        public Criteria andMainameLike(String value) {
            addCriterion("mainame like", value, "mainame");
            return (Criteria) this;
        }

        public Criteria andMainameNotLike(String value) {
            addCriterion("mainame not like", value, "mainame");
            return (Criteria) this;
        }

        public Criteria andMainameIn(List<String> values) {
            addCriterion("mainame in", values, "mainame");
            return (Criteria) this;
        }

        public Criteria andMainameNotIn(List<String> values) {
            addCriterion("mainame not in", values, "mainame");
            return (Criteria) this;
        }

        public Criteria andMainameBetween(String value1, String value2) {
            addCriterion("mainame between", value1, value2, "mainame");
            return (Criteria) this;
        }

        public Criteria andMainameNotBetween(String value1, String value2) {
            addCriterion("mainame not between", value1, value2, "mainame");
            return (Criteria) this;
        }

        public Criteria andMaibrandIsNull() {
            addCriterion("maibrand is null");
            return (Criteria) this;
        }

        public Criteria andMaibrandIsNotNull() {
            addCriterion("maibrand is not null");
            return (Criteria) this;
        }

        public Criteria andMaibrandEqualTo(String value) {
            addCriterion("maibrand =", value, "maibrand");
            return (Criteria) this;
        }

        public Criteria andMaibrandNotEqualTo(String value) {
            addCriterion("maibrand <>", value, "maibrand");
            return (Criteria) this;
        }

        public Criteria andMaibrandGreaterThan(String value) {
            addCriterion("maibrand >", value, "maibrand");
            return (Criteria) this;
        }

        public Criteria andMaibrandGreaterThanOrEqualTo(String value) {
            addCriterion("maibrand >=", value, "maibrand");
            return (Criteria) this;
        }

        public Criteria andMaibrandLessThan(String value) {
            addCriterion("maibrand <", value, "maibrand");
            return (Criteria) this;
        }

        public Criteria andMaibrandLessThanOrEqualTo(String value) {
            addCriterion("maibrand <=", value, "maibrand");
            return (Criteria) this;
        }

        public Criteria andMaibrandLike(String value) {
            addCriterion("maibrand like", value, "maibrand");
            return (Criteria) this;
        }

        public Criteria andMaibrandNotLike(String value) {
            addCriterion("maibrand not like", value, "maibrand");
            return (Criteria) this;
        }

        public Criteria andMaibrandIn(List<String> values) {
            addCriterion("maibrand in", values, "maibrand");
            return (Criteria) this;
        }

        public Criteria andMaibrandNotIn(List<String> values) {
            addCriterion("maibrand not in", values, "maibrand");
            return (Criteria) this;
        }

        public Criteria andMaibrandBetween(String value1, String value2) {
            addCriterion("maibrand between", value1, value2, "maibrand");
            return (Criteria) this;
        }

        public Criteria andMaibrandNotBetween(String value1, String value2) {
            addCriterion("maibrand not between", value1, value2, "maibrand");
            return (Criteria) this;
        }

        public Criteria andMaitypeIsNull() {
            addCriterion("maitype is null");
            return (Criteria) this;
        }

        public Criteria andMaitypeIsNotNull() {
            addCriterion("maitype is not null");
            return (Criteria) this;
        }

        public Criteria andMaitypeEqualTo(String value) {
            addCriterion("maitype =", value, "maitype");
            return (Criteria) this;
        }

        public Criteria andMaitypeNotEqualTo(String value) {
            addCriterion("maitype <>", value, "maitype");
            return (Criteria) this;
        }

        public Criteria andMaitypeGreaterThan(String value) {
            addCriterion("maitype >", value, "maitype");
            return (Criteria) this;
        }

        public Criteria andMaitypeGreaterThanOrEqualTo(String value) {
            addCriterion("maitype >=", value, "maitype");
            return (Criteria) this;
        }

        public Criteria andMaitypeLessThan(String value) {
            addCriterion("maitype <", value, "maitype");
            return (Criteria) this;
        }

        public Criteria andMaitypeLessThanOrEqualTo(String value) {
            addCriterion("maitype <=", value, "maitype");
            return (Criteria) this;
        }

        public Criteria andMaitypeLike(String value) {
            addCriterion("maitype like", value, "maitype");
            return (Criteria) this;
        }

        public Criteria andMaitypeNotLike(String value) {
            addCriterion("maitype not like", value, "maitype");
            return (Criteria) this;
        }

        public Criteria andMaitypeIn(List<String> values) {
            addCriterion("maitype in", values, "maitype");
            return (Criteria) this;
        }

        public Criteria andMaitypeNotIn(List<String> values) {
            addCriterion("maitype not in", values, "maitype");
            return (Criteria) this;
        }

        public Criteria andMaitypeBetween(String value1, String value2) {
            addCriterion("maitype between", value1, value2, "maitype");
            return (Criteria) this;
        }

        public Criteria andMaitypeNotBetween(String value1, String value2) {
            addCriterion("maitype not between", value1, value2, "maitype");
            return (Criteria) this;
        }

        public Criteria andMaiunitIsNull() {
            addCriterion("maiunit is null");
            return (Criteria) this;
        }

        public Criteria andMaiunitIsNotNull() {
            addCriterion("maiunit is not null");
            return (Criteria) this;
        }

        public Criteria andMaiunitEqualTo(String value) {
            addCriterion("maiunit =", value, "maiunit");
            return (Criteria) this;
        }

        public Criteria andMaiunitNotEqualTo(String value) {
            addCriterion("maiunit <>", value, "maiunit");
            return (Criteria) this;
        }

        public Criteria andMaiunitGreaterThan(String value) {
            addCriterion("maiunit >", value, "maiunit");
            return (Criteria) this;
        }

        public Criteria andMaiunitGreaterThanOrEqualTo(String value) {
            addCriterion("maiunit >=", value, "maiunit");
            return (Criteria) this;
        }

        public Criteria andMaiunitLessThan(String value) {
            addCriterion("maiunit <", value, "maiunit");
            return (Criteria) this;
        }

        public Criteria andMaiunitLessThanOrEqualTo(String value) {
            addCriterion("maiunit <=", value, "maiunit");
            return (Criteria) this;
        }

        public Criteria andMaiunitLike(String value) {
            addCriterion("maiunit like", value, "maiunit");
            return (Criteria) this;
        }

        public Criteria andMaiunitNotLike(String value) {
            addCriterion("maiunit not like", value, "maiunit");
            return (Criteria) this;
        }

        public Criteria andMaiunitIn(List<String> values) {
            addCriterion("maiunit in", values, "maiunit");
            return (Criteria) this;
        }

        public Criteria andMaiunitNotIn(List<String> values) {
            addCriterion("maiunit not in", values, "maiunit");
            return (Criteria) this;
        }

        public Criteria andMaiunitBetween(String value1, String value2) {
            addCriterion("maiunit between", value1, value2, "maiunit");
            return (Criteria) this;
        }

        public Criteria andMaiunitNotBetween(String value1, String value2) {
            addCriterion("maiunit not between", value1, value2, "maiunit");
            return (Criteria) this;
        }

        public Criteria andMaiptypeIsNull() {
            addCriterion("maiptype is null");
            return (Criteria) this;
        }

        public Criteria andMaiptypeIsNotNull() {
            addCriterion("maiptype is not null");
            return (Criteria) this;
        }

        public Criteria andMaiptypeEqualTo(String value) {
            addCriterion("maiptype =", value, "maiptype");
            return (Criteria) this;
        }

        public Criteria andMaiptypeNotEqualTo(String value) {
            addCriterion("maiptype <>", value, "maiptype");
            return (Criteria) this;
        }

        public Criteria andMaiptypeGreaterThan(String value) {
            addCriterion("maiptype >", value, "maiptype");
            return (Criteria) this;
        }

        public Criteria andMaiptypeGreaterThanOrEqualTo(String value) {
            addCriterion("maiptype >=", value, "maiptype");
            return (Criteria) this;
        }

        public Criteria andMaiptypeLessThan(String value) {
            addCriterion("maiptype <", value, "maiptype");
            return (Criteria) this;
        }

        public Criteria andMaiptypeLessThanOrEqualTo(String value) {
            addCriterion("maiptype <=", value, "maiptype");
            return (Criteria) this;
        }

        public Criteria andMaiptypeLike(String value) {
            addCriterion("maiptype like", value, "maiptype");
            return (Criteria) this;
        }

        public Criteria andMaiptypeNotLike(String value) {
            addCriterion("maiptype not like", value, "maiptype");
            return (Criteria) this;
        }

        public Criteria andMaiptypeIn(List<String> values) {
            addCriterion("maiptype in", values, "maiptype");
            return (Criteria) this;
        }

        public Criteria andMaiptypeNotIn(List<String> values) {
            addCriterion("maiptype not in", values, "maiptype");
            return (Criteria) this;
        }

        public Criteria andMaiptypeBetween(String value1, String value2) {
            addCriterion("maiptype between", value1, value2, "maiptype");
            return (Criteria) this;
        }

        public Criteria andMaiptypeNotBetween(String value1, String value2) {
            addCriterion("maiptype not between", value1, value2, "maiptype");
            return (Criteria) this;
        }

        public Criteria andMaientrepotIsNull() {
            addCriterion("maientrepot is null");
            return (Criteria) this;
        }

        public Criteria andMaientrepotIsNotNull() {
            addCriterion("maientrepot is not null");
            return (Criteria) this;
        }

        public Criteria andMaientrepotEqualTo(String value) {
            addCriterion("maientrepot =", value, "maientrepot");
            return (Criteria) this;
        }

        public Criteria andMaientrepotNotEqualTo(String value) {
            addCriterion("maientrepot <>", value, "maientrepot");
            return (Criteria) this;
        }

        public Criteria andMaientrepotGreaterThan(String value) {
            addCriterion("maientrepot >", value, "maientrepot");
            return (Criteria) this;
        }

        public Criteria andMaientrepotGreaterThanOrEqualTo(String value) {
            addCriterion("maientrepot >=", value, "maientrepot");
            return (Criteria) this;
        }

        public Criteria andMaientrepotLessThan(String value) {
            addCriterion("maientrepot <", value, "maientrepot");
            return (Criteria) this;
        }

        public Criteria andMaientrepotLessThanOrEqualTo(String value) {
            addCriterion("maientrepot <=", value, "maientrepot");
            return (Criteria) this;
        }

        public Criteria andMaientrepotLike(String value) {
            addCriterion("maientrepot like", value, "maientrepot");
            return (Criteria) this;
        }

        public Criteria andMaientrepotNotLike(String value) {
            addCriterion("maientrepot not like", value, "maientrepot");
            return (Criteria) this;
        }

        public Criteria andMaientrepotIn(List<String> values) {
            addCriterion("maientrepot in", values, "maientrepot");
            return (Criteria) this;
        }

        public Criteria andMaientrepotNotIn(List<String> values) {
            addCriterion("maientrepot not in", values, "maientrepot");
            return (Criteria) this;
        }

        public Criteria andMaientrepotBetween(String value1, String value2) {
            addCriterion("maientrepot between", value1, value2, "maientrepot");
            return (Criteria) this;
        }

        public Criteria andMaientrepotNotBetween(String value1, String value2) {
            addCriterion("maientrepot not between", value1, value2, "maientrepot");
            return (Criteria) this;
        }

        public Criteria andMaiavoidIsNull() {
            addCriterion("maiavoid is null");
            return (Criteria) this;
        }

        public Criteria andMaiavoidIsNotNull() {
            addCriterion("maiavoid is not null");
            return (Criteria) this;
        }

        public Criteria andMaiavoidEqualTo(String value) {
            addCriterion("maiavoid =", value, "maiavoid");
            return (Criteria) this;
        }

        public Criteria andMaiavoidNotEqualTo(String value) {
            addCriterion("maiavoid <>", value, "maiavoid");
            return (Criteria) this;
        }

        public Criteria andMaiavoidGreaterThan(String value) {
            addCriterion("maiavoid >", value, "maiavoid");
            return (Criteria) this;
        }

        public Criteria andMaiavoidGreaterThanOrEqualTo(String value) {
            addCriterion("maiavoid >=", value, "maiavoid");
            return (Criteria) this;
        }

        public Criteria andMaiavoidLessThan(String value) {
            addCriterion("maiavoid <", value, "maiavoid");
            return (Criteria) this;
        }

        public Criteria andMaiavoidLessThanOrEqualTo(String value) {
            addCriterion("maiavoid <=", value, "maiavoid");
            return (Criteria) this;
        }

        public Criteria andMaiavoidLike(String value) {
            addCriterion("maiavoid like", value, "maiavoid");
            return (Criteria) this;
        }

        public Criteria andMaiavoidNotLike(String value) {
            addCriterion("maiavoid not like", value, "maiavoid");
            return (Criteria) this;
        }

        public Criteria andMaiavoidIn(List<String> values) {
            addCriterion("maiavoid in", values, "maiavoid");
            return (Criteria) this;
        }

        public Criteria andMaiavoidNotIn(List<String> values) {
            addCriterion("maiavoid not in", values, "maiavoid");
            return (Criteria) this;
        }

        public Criteria andMaiavoidBetween(String value1, String value2) {
            addCriterion("maiavoid between", value1, value2, "maiavoid");
            return (Criteria) this;
        }

        public Criteria andMaiavoidNotBetween(String value1, String value2) {
            addCriterion("maiavoid not between", value1, value2, "maiavoid");
            return (Criteria) this;
        }

        public Criteria andMaibeforeIsNull() {
            addCriterion("maibefore is null");
            return (Criteria) this;
        }

        public Criteria andMaibeforeIsNotNull() {
            addCriterion("maibefore is not null");
            return (Criteria) this;
        }

        public Criteria andMaibeforeEqualTo(Integer value) {
            addCriterion("maibefore =", value, "maibefore");
            return (Criteria) this;
        }

        public Criteria andMaibeforeNotEqualTo(Integer value) {
            addCriterion("maibefore <>", value, "maibefore");
            return (Criteria) this;
        }

        public Criteria andMaibeforeGreaterThan(Integer value) {
            addCriterion("maibefore >", value, "maibefore");
            return (Criteria) this;
        }

        public Criteria andMaibeforeGreaterThanOrEqualTo(Integer value) {
            addCriterion("maibefore >=", value, "maibefore");
            return (Criteria) this;
        }

        public Criteria andMaibeforeLessThan(Integer value) {
            addCriterion("maibefore <", value, "maibefore");
            return (Criteria) this;
        }

        public Criteria andMaibeforeLessThanOrEqualTo(Integer value) {
            addCriterion("maibefore <=", value, "maibefore");
            return (Criteria) this;
        }

        public Criteria andMaibeforeIn(List<Integer> values) {
            addCriterion("maibefore in", values, "maibefore");
            return (Criteria) this;
        }

        public Criteria andMaibeforeNotIn(List<Integer> values) {
            addCriterion("maibefore not in", values, "maibefore");
            return (Criteria) this;
        }

        public Criteria andMaibeforeBetween(Integer value1, Integer value2) {
            addCriterion("maibefore between", value1, value2, "maibefore");
            return (Criteria) this;
        }

        public Criteria andMaibeforeNotBetween(Integer value1, Integer value2) {
            addCriterion("maibefore not between", value1, value2, "maibefore");
            return (Criteria) this;
        }

        public Criteria andMailaterIsNull() {
            addCriterion("mailater is null");
            return (Criteria) this;
        }

        public Criteria andMailaterIsNotNull() {
            addCriterion("mailater is not null");
            return (Criteria) this;
        }

        public Criteria andMailaterEqualTo(Integer value) {
            addCriterion("mailater =", value, "mailater");
            return (Criteria) this;
        }

        public Criteria andMailaterNotEqualTo(Integer value) {
            addCriterion("mailater <>", value, "mailater");
            return (Criteria) this;
        }

        public Criteria andMailaterGreaterThan(Integer value) {
            addCriterion("mailater >", value, "mailater");
            return (Criteria) this;
        }

        public Criteria andMailaterGreaterThanOrEqualTo(Integer value) {
            addCriterion("mailater >=", value, "mailater");
            return (Criteria) this;
        }

        public Criteria andMailaterLessThan(Integer value) {
            addCriterion("mailater <", value, "mailater");
            return (Criteria) this;
        }

        public Criteria andMailaterLessThanOrEqualTo(Integer value) {
            addCriterion("mailater <=", value, "mailater");
            return (Criteria) this;
        }

        public Criteria andMailaterIn(List<Integer> values) {
            addCriterion("mailater in", values, "mailater");
            return (Criteria) this;
        }

        public Criteria andMailaterNotIn(List<Integer> values) {
            addCriterion("mailater not in", values, "mailater");
            return (Criteria) this;
        }

        public Criteria andMailaterBetween(Integer value1, Integer value2) {
            addCriterion("mailater between", value1, value2, "mailater");
            return (Criteria) this;
        }

        public Criteria andMailaterNotBetween(Integer value1, Integer value2) {
            addCriterion("mailater not between", value1, value2, "mailater");
            return (Criteria) this;
        }

        public Criteria andMainumIsNull() {
            addCriterion("mainum is null");
            return (Criteria) this;
        }

        public Criteria andMainumIsNotNull() {
            addCriterion("mainum is not null");
            return (Criteria) this;
        }

        public Criteria andMainumEqualTo(Integer value) {
            addCriterion("mainum =", value, "mainum");
            return (Criteria) this;
        }

        public Criteria andMainumNotEqualTo(Integer value) {
            addCriterion("mainum <>", value, "mainum");
            return (Criteria) this;
        }

        public Criteria andMainumGreaterThan(Integer value) {
            addCriterion("mainum >", value, "mainum");
            return (Criteria) this;
        }

        public Criteria andMainumGreaterThanOrEqualTo(Integer value) {
            addCriterion("mainum >=", value, "mainum");
            return (Criteria) this;
        }

        public Criteria andMainumLessThan(Integer value) {
            addCriterion("mainum <", value, "mainum");
            return (Criteria) this;
        }

        public Criteria andMainumLessThanOrEqualTo(Integer value) {
            addCriterion("mainum <=", value, "mainum");
            return (Criteria) this;
        }

        public Criteria andMainumIn(List<Integer> values) {
            addCriterion("mainum in", values, "mainum");
            return (Criteria) this;
        }

        public Criteria andMainumNotIn(List<Integer> values) {
            addCriterion("mainum not in", values, "mainum");
            return (Criteria) this;
        }

        public Criteria andMainumBetween(Integer value1, Integer value2) {
            addCriterion("mainum between", value1, value2, "mainum");
            return (Criteria) this;
        }

        public Criteria andMainumNotBetween(Integer value1, Integer value2) {
            addCriterion("mainum not between", value1, value2, "mainum");
            return (Criteria) this;
        }

        public Criteria andMaiprojectIsNull() {
            addCriterion("maiproject is null");
            return (Criteria) this;
        }

        public Criteria andMaiprojectIsNotNull() {
            addCriterion("maiproject is not null");
            return (Criteria) this;
        }

        public Criteria andMaiprojectEqualTo(String value) {
            addCriterion("maiproject =", value, "maiproject");
            return (Criteria) this;
        }

        public Criteria andMaiprojectNotEqualTo(String value) {
            addCriterion("maiproject <>", value, "maiproject");
            return (Criteria) this;
        }

        public Criteria andMaiprojectGreaterThan(String value) {
            addCriterion("maiproject >", value, "maiproject");
            return (Criteria) this;
        }

        public Criteria andMaiprojectGreaterThanOrEqualTo(String value) {
            addCriterion("maiproject >=", value, "maiproject");
            return (Criteria) this;
        }

        public Criteria andMaiprojectLessThan(String value) {
            addCriterion("maiproject <", value, "maiproject");
            return (Criteria) this;
        }

        public Criteria andMaiprojectLessThanOrEqualTo(String value) {
            addCriterion("maiproject <=", value, "maiproject");
            return (Criteria) this;
        }

        public Criteria andMaiprojectLike(String value) {
            addCriterion("maiproject like", value, "maiproject");
            return (Criteria) this;
        }

        public Criteria andMaiprojectNotLike(String value) {
            addCriterion("maiproject not like", value, "maiproject");
            return (Criteria) this;
        }

        public Criteria andMaiprojectIn(List<String> values) {
            addCriterion("maiproject in", values, "maiproject");
            return (Criteria) this;
        }

        public Criteria andMaiprojectNotIn(List<String> values) {
            addCriterion("maiproject not in", values, "maiproject");
            return (Criteria) this;
        }

        public Criteria andMaiprojectBetween(String value1, String value2) {
            addCriterion("maiproject between", value1, value2, "maiproject");
            return (Criteria) this;
        }

        public Criteria andMaiprojectNotBetween(String value1, String value2) {
            addCriterion("maiproject not between", value1, value2, "maiproject");
            return (Criteria) this;
        }

        public Criteria andMaiinventoryIsNull() {
            addCriterion("maiinventory is null");
            return (Criteria) this;
        }

        public Criteria andMaiinventoryIsNotNull() {
            addCriterion("maiinventory is not null");
            return (Criteria) this;
        }

        public Criteria andMaiinventoryEqualTo(Integer value) {
            addCriterion("maiinventory =", value, "maiinventory");
            return (Criteria) this;
        }

        public Criteria andMaiinventoryNotEqualTo(Integer value) {
            addCriterion("maiinventory <>", value, "maiinventory");
            return (Criteria) this;
        }

        public Criteria andMaiinventoryGreaterThan(Integer value) {
            addCriterion("maiinventory >", value, "maiinventory");
            return (Criteria) this;
        }

        public Criteria andMaiinventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("maiinventory >=", value, "maiinventory");
            return (Criteria) this;
        }

        public Criteria andMaiinventoryLessThan(Integer value) {
            addCriterion("maiinventory <", value, "maiinventory");
            return (Criteria) this;
        }

        public Criteria andMaiinventoryLessThanOrEqualTo(Integer value) {
            addCriterion("maiinventory <=", value, "maiinventory");
            return (Criteria) this;
        }

        public Criteria andMaiinventoryIn(List<Integer> values) {
            addCriterion("maiinventory in", values, "maiinventory");
            return (Criteria) this;
        }

        public Criteria andMaiinventoryNotIn(List<Integer> values) {
            addCriterion("maiinventory not in", values, "maiinventory");
            return (Criteria) this;
        }

        public Criteria andMaiinventoryBetween(Integer value1, Integer value2) {
            addCriterion("maiinventory between", value1, value2, "maiinventory");
            return (Criteria) this;
        }

        public Criteria andMaiinventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("maiinventory not between", value1, value2, "maiinventory");
            return (Criteria) this;
        }

        public Criteria andMaimaterialIsNull() {
            addCriterion("maimaterial is null");
            return (Criteria) this;
        }

        public Criteria andMaimaterialIsNotNull() {
            addCriterion("maimaterial is not null");
            return (Criteria) this;
        }

        public Criteria andMaimaterialEqualTo(String value) {
            addCriterion("maimaterial =", value, "maimaterial");
            return (Criteria) this;
        }

        public Criteria andMaimaterialNotEqualTo(String value) {
            addCriterion("maimaterial <>", value, "maimaterial");
            return (Criteria) this;
        }

        public Criteria andMaimaterialGreaterThan(String value) {
            addCriterion("maimaterial >", value, "maimaterial");
            return (Criteria) this;
        }

        public Criteria andMaimaterialGreaterThanOrEqualTo(String value) {
            addCriterion("maimaterial >=", value, "maimaterial");
            return (Criteria) this;
        }

        public Criteria andMaimaterialLessThan(String value) {
            addCriterion("maimaterial <", value, "maimaterial");
            return (Criteria) this;
        }

        public Criteria andMaimaterialLessThanOrEqualTo(String value) {
            addCriterion("maimaterial <=", value, "maimaterial");
            return (Criteria) this;
        }

        public Criteria andMaimaterialLike(String value) {
            addCriterion("maimaterial like", value, "maimaterial");
            return (Criteria) this;
        }

        public Criteria andMaimaterialNotLike(String value) {
            addCriterion("maimaterial not like", value, "maimaterial");
            return (Criteria) this;
        }

        public Criteria andMaimaterialIn(List<String> values) {
            addCriterion("maimaterial in", values, "maimaterial");
            return (Criteria) this;
        }

        public Criteria andMaimaterialNotIn(List<String> values) {
            addCriterion("maimaterial not in", values, "maimaterial");
            return (Criteria) this;
        }

        public Criteria andMaimaterialBetween(String value1, String value2) {
            addCriterion("maimaterial between", value1, value2, "maimaterial");
            return (Criteria) this;
        }

        public Criteria andMaimaterialNotBetween(String value1, String value2) {
            addCriterion("maimaterial not between", value1, value2, "maimaterial");
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