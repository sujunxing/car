package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class PayoffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayoffExample() {
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

        public Criteria andPafidIsNull() {
            addCriterion("pafid is null");
            return (Criteria) this;
        }

        public Criteria andPafidIsNotNull() {
            addCriterion("pafid is not null");
            return (Criteria) this;
        }

        public Criteria andPafidEqualTo(String value) {
            addCriterion("pafid =", value, "pafid");
            return (Criteria) this;
        }

        public Criteria andPafidNotEqualTo(String value) {
            addCriterion("pafid <>", value, "pafid");
            return (Criteria) this;
        }

        public Criteria andPafidGreaterThan(String value) {
            addCriterion("pafid >", value, "pafid");
            return (Criteria) this;
        }

        public Criteria andPafidGreaterThanOrEqualTo(String value) {
            addCriterion("pafid >=", value, "pafid");
            return (Criteria) this;
        }

        public Criteria andPafidLessThan(String value) {
            addCriterion("pafid <", value, "pafid");
            return (Criteria) this;
        }

        public Criteria andPafidLessThanOrEqualTo(String value) {
            addCriterion("pafid <=", value, "pafid");
            return (Criteria) this;
        }

        public Criteria andPafidLike(String value) {
            addCriterion("pafid like", value, "pafid");
            return (Criteria) this;
        }

        public Criteria andPafidNotLike(String value) {
            addCriterion("pafid not like", value, "pafid");
            return (Criteria) this;
        }

        public Criteria andPafidIn(List<String> values) {
            addCriterion("pafid in", values, "pafid");
            return (Criteria) this;
        }

        public Criteria andPafidNotIn(List<String> values) {
            addCriterion("pafid not in", values, "pafid");
            return (Criteria) this;
        }

        public Criteria andPafidBetween(String value1, String value2) {
            addCriterion("pafid between", value1, value2, "pafid");
            return (Criteria) this;
        }

        public Criteria andPafidNotBetween(String value1, String value2) {
            addCriterion("pafid not between", value1, value2, "pafid");
            return (Criteria) this;
        }

        public Criteria andPaftypeIsNull() {
            addCriterion("paftype is null");
            return (Criteria) this;
        }

        public Criteria andPaftypeIsNotNull() {
            addCriterion("paftype is not null");
            return (Criteria) this;
        }

        public Criteria andPaftypeEqualTo(String value) {
            addCriterion("paftype =", value, "paftype");
            return (Criteria) this;
        }

        public Criteria andPaftypeNotEqualTo(String value) {
            addCriterion("paftype <>", value, "paftype");
            return (Criteria) this;
        }

        public Criteria andPaftypeGreaterThan(String value) {
            addCriterion("paftype >", value, "paftype");
            return (Criteria) this;
        }

        public Criteria andPaftypeGreaterThanOrEqualTo(String value) {
            addCriterion("paftype >=", value, "paftype");
            return (Criteria) this;
        }

        public Criteria andPaftypeLessThan(String value) {
            addCriterion("paftype <", value, "paftype");
            return (Criteria) this;
        }

        public Criteria andPaftypeLessThanOrEqualTo(String value) {
            addCriterion("paftype <=", value, "paftype");
            return (Criteria) this;
        }

        public Criteria andPaftypeLike(String value) {
            addCriterion("paftype like", value, "paftype");
            return (Criteria) this;
        }

        public Criteria andPaftypeNotLike(String value) {
            addCriterion("paftype not like", value, "paftype");
            return (Criteria) this;
        }

        public Criteria andPaftypeIn(List<String> values) {
            addCriterion("paftype in", values, "paftype");
            return (Criteria) this;
        }

        public Criteria andPaftypeNotIn(List<String> values) {
            addCriterion("paftype not in", values, "paftype");
            return (Criteria) this;
        }

        public Criteria andPaftypeBetween(String value1, String value2) {
            addCriterion("paftype between", value1, value2, "paftype");
            return (Criteria) this;
        }

        public Criteria andPaftypeNotBetween(String value1, String value2) {
            addCriterion("paftype not between", value1, value2, "paftype");
            return (Criteria) this;
        }

        public Criteria andPafagopriceIsNull() {
            addCriterion("pafagoprice is null");
            return (Criteria) this;
        }

        public Criteria andPafagopriceIsNotNull() {
            addCriterion("pafagoprice is not null");
            return (Criteria) this;
        }

        public Criteria andPafagopriceEqualTo(Float value) {
            addCriterion("pafagoprice =", value, "pafagoprice");
            return (Criteria) this;
        }

        public Criteria andPafagopriceNotEqualTo(Float value) {
            addCriterion("pafagoprice <>", value, "pafagoprice");
            return (Criteria) this;
        }

        public Criteria andPafagopriceGreaterThan(Float value) {
            addCriterion("pafagoprice >", value, "pafagoprice");
            return (Criteria) this;
        }

        public Criteria andPafagopriceGreaterThanOrEqualTo(Float value) {
            addCriterion("pafagoprice >=", value, "pafagoprice");
            return (Criteria) this;
        }

        public Criteria andPafagopriceLessThan(Float value) {
            addCriterion("pafagoprice <", value, "pafagoprice");
            return (Criteria) this;
        }

        public Criteria andPafagopriceLessThanOrEqualTo(Float value) {
            addCriterion("pafagoprice <=", value, "pafagoprice");
            return (Criteria) this;
        }

        public Criteria andPafagopriceIn(List<Float> values) {
            addCriterion("pafagoprice in", values, "pafagoprice");
            return (Criteria) this;
        }

        public Criteria andPafagopriceNotIn(List<Float> values) {
            addCriterion("pafagoprice not in", values, "pafagoprice");
            return (Criteria) this;
        }

        public Criteria andPafagopriceBetween(Float value1, Float value2) {
            addCriterion("pafagoprice between", value1, value2, "pafagoprice");
            return (Criteria) this;
        }

        public Criteria andPafagopriceNotBetween(Float value1, Float value2) {
            addCriterion("pafagoprice not between", value1, value2, "pafagoprice");
            return (Criteria) this;
        }

        public Criteria andPaftotalpriceIsNull() {
            addCriterion("paftotalprice is null");
            return (Criteria) this;
        }

        public Criteria andPaftotalpriceIsNotNull() {
            addCriterion("paftotalprice is not null");
            return (Criteria) this;
        }

        public Criteria andPaftotalpriceEqualTo(Float value) {
            addCriterion("paftotalprice =", value, "paftotalprice");
            return (Criteria) this;
        }

        public Criteria andPaftotalpriceNotEqualTo(Float value) {
            addCriterion("paftotalprice <>", value, "paftotalprice");
            return (Criteria) this;
        }

        public Criteria andPaftotalpriceGreaterThan(Float value) {
            addCriterion("paftotalprice >", value, "paftotalprice");
            return (Criteria) this;
        }

        public Criteria andPaftotalpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("paftotalprice >=", value, "paftotalprice");
            return (Criteria) this;
        }

        public Criteria andPaftotalpriceLessThan(Float value) {
            addCriterion("paftotalprice <", value, "paftotalprice");
            return (Criteria) this;
        }

        public Criteria andPaftotalpriceLessThanOrEqualTo(Float value) {
            addCriterion("paftotalprice <=", value, "paftotalprice");
            return (Criteria) this;
        }

        public Criteria andPaftotalpriceIn(List<Float> values) {
            addCriterion("paftotalprice in", values, "paftotalprice");
            return (Criteria) this;
        }

        public Criteria andPaftotalpriceNotIn(List<Float> values) {
            addCriterion("paftotalprice not in", values, "paftotalprice");
            return (Criteria) this;
        }

        public Criteria andPaftotalpriceBetween(Float value1, Float value2) {
            addCriterion("paftotalprice between", value1, value2, "paftotalprice");
            return (Criteria) this;
        }

        public Criteria andPaftotalpriceNotBetween(Float value1, Float value2) {
            addCriterion("paftotalprice not between", value1, value2, "paftotalprice");
            return (Criteria) this;
        }

        public Criteria andPafmaterialsIsNull() {
            addCriterion("pafmaterials is null");
            return (Criteria) this;
        }

        public Criteria andPafmaterialsIsNotNull() {
            addCriterion("pafmaterials is not null");
            return (Criteria) this;
        }

        public Criteria andPafmaterialsEqualTo(Float value) {
            addCriterion("pafmaterials =", value, "pafmaterials");
            return (Criteria) this;
        }

        public Criteria andPafmaterialsNotEqualTo(Float value) {
            addCriterion("pafmaterials <>", value, "pafmaterials");
            return (Criteria) this;
        }

        public Criteria andPafmaterialsGreaterThan(Float value) {
            addCriterion("pafmaterials >", value, "pafmaterials");
            return (Criteria) this;
        }

        public Criteria andPafmaterialsGreaterThanOrEqualTo(Float value) {
            addCriterion("pafmaterials >=", value, "pafmaterials");
            return (Criteria) this;
        }

        public Criteria andPafmaterialsLessThan(Float value) {
            addCriterion("pafmaterials <", value, "pafmaterials");
            return (Criteria) this;
        }

        public Criteria andPafmaterialsLessThanOrEqualTo(Float value) {
            addCriterion("pafmaterials <=", value, "pafmaterials");
            return (Criteria) this;
        }

        public Criteria andPafmaterialsIn(List<Float> values) {
            addCriterion("pafmaterials in", values, "pafmaterials");
            return (Criteria) this;
        }

        public Criteria andPafmaterialsNotIn(List<Float> values) {
            addCriterion("pafmaterials not in", values, "pafmaterials");
            return (Criteria) this;
        }

        public Criteria andPafmaterialsBetween(Float value1, Float value2) {
            addCriterion("pafmaterials between", value1, value2, "pafmaterials");
            return (Criteria) this;
        }

        public Criteria andPafmaterialsNotBetween(Float value1, Float value2) {
            addCriterion("pafmaterials not between", value1, value2, "pafmaterials");
            return (Criteria) this;
        }

        public Criteria andPafcostIsNull() {
            addCriterion("pafcost is null");
            return (Criteria) this;
        }

        public Criteria andPafcostIsNotNull() {
            addCriterion("pafcost is not null");
            return (Criteria) this;
        }

        public Criteria andPafcostEqualTo(Float value) {
            addCriterion("pafcost =", value, "pafcost");
            return (Criteria) this;
        }

        public Criteria andPafcostNotEqualTo(Float value) {
            addCriterion("pafcost <>", value, "pafcost");
            return (Criteria) this;
        }

        public Criteria andPafcostGreaterThan(Float value) {
            addCriterion("pafcost >", value, "pafcost");
            return (Criteria) this;
        }

        public Criteria andPafcostGreaterThanOrEqualTo(Float value) {
            addCriterion("pafcost >=", value, "pafcost");
            return (Criteria) this;
        }

        public Criteria andPafcostLessThan(Float value) {
            addCriterion("pafcost <", value, "pafcost");
            return (Criteria) this;
        }

        public Criteria andPafcostLessThanOrEqualTo(Float value) {
            addCriterion("pafcost <=", value, "pafcost");
            return (Criteria) this;
        }

        public Criteria andPafcostIn(List<Float> values) {
            addCriterion("pafcost in", values, "pafcost");
            return (Criteria) this;
        }

        public Criteria andPafcostNotIn(List<Float> values) {
            addCriterion("pafcost not in", values, "pafcost");
            return (Criteria) this;
        }

        public Criteria andPafcostBetween(Float value1, Float value2) {
            addCriterion("pafcost between", value1, value2, "pafcost");
            return (Criteria) this;
        }

        public Criteria andPafcostNotBetween(Float value1, Float value2) {
            addCriterion("pafcost not between", value1, value2, "pafcost");
            return (Criteria) this;
        }

        public Criteria andPafadditionIsNull() {
            addCriterion("pafaddition is null");
            return (Criteria) this;
        }

        public Criteria andPafadditionIsNotNull() {
            addCriterion("pafaddition is not null");
            return (Criteria) this;
        }

        public Criteria andPafadditionEqualTo(Float value) {
            addCriterion("pafaddition =", value, "pafaddition");
            return (Criteria) this;
        }

        public Criteria andPafadditionNotEqualTo(Float value) {
            addCriterion("pafaddition <>", value, "pafaddition");
            return (Criteria) this;
        }

        public Criteria andPafadditionGreaterThan(Float value) {
            addCriterion("pafaddition >", value, "pafaddition");
            return (Criteria) this;
        }

        public Criteria andPafadditionGreaterThanOrEqualTo(Float value) {
            addCriterion("pafaddition >=", value, "pafaddition");
            return (Criteria) this;
        }

        public Criteria andPafadditionLessThan(Float value) {
            addCriterion("pafaddition <", value, "pafaddition");
            return (Criteria) this;
        }

        public Criteria andPafadditionLessThanOrEqualTo(Float value) {
            addCriterion("pafaddition <=", value, "pafaddition");
            return (Criteria) this;
        }

        public Criteria andPafadditionIn(List<Float> values) {
            addCriterion("pafaddition in", values, "pafaddition");
            return (Criteria) this;
        }

        public Criteria andPafadditionNotIn(List<Float> values) {
            addCriterion("pafaddition not in", values, "pafaddition");
            return (Criteria) this;
        }

        public Criteria andPafadditionBetween(Float value1, Float value2) {
            addCriterion("pafaddition between", value1, value2, "pafaddition");
            return (Criteria) this;
        }

        public Criteria andPafadditionNotBetween(Float value1, Float value2) {
            addCriterion("pafaddition not between", value1, value2, "pafaddition");
            return (Criteria) this;
        }

        public Criteria andPafcloseIsNull() {
            addCriterion("pafclose is null");
            return (Criteria) this;
        }

        public Criteria andPafcloseIsNotNull() {
            addCriterion("pafclose is not null");
            return (Criteria) this;
        }

        public Criteria andPafcloseEqualTo(String value) {
            addCriterion("pafclose =", value, "pafclose");
            return (Criteria) this;
        }

        public Criteria andPafcloseNotEqualTo(String value) {
            addCriterion("pafclose <>", value, "pafclose");
            return (Criteria) this;
        }

        public Criteria andPafcloseGreaterThan(String value) {
            addCriterion("pafclose >", value, "pafclose");
            return (Criteria) this;
        }

        public Criteria andPafcloseGreaterThanOrEqualTo(String value) {
            addCriterion("pafclose >=", value, "pafclose");
            return (Criteria) this;
        }

        public Criteria andPafcloseLessThan(String value) {
            addCriterion("pafclose <", value, "pafclose");
            return (Criteria) this;
        }

        public Criteria andPafcloseLessThanOrEqualTo(String value) {
            addCriterion("pafclose <=", value, "pafclose");
            return (Criteria) this;
        }

        public Criteria andPafcloseLike(String value) {
            addCriterion("pafclose like", value, "pafclose");
            return (Criteria) this;
        }

        public Criteria andPafcloseNotLike(String value) {
            addCriterion("pafclose not like", value, "pafclose");
            return (Criteria) this;
        }

        public Criteria andPafcloseIn(List<String> values) {
            addCriterion("pafclose in", values, "pafclose");
            return (Criteria) this;
        }

        public Criteria andPafcloseNotIn(List<String> values) {
            addCriterion("pafclose not in", values, "pafclose");
            return (Criteria) this;
        }

        public Criteria andPafcloseBetween(String value1, String value2) {
            addCriterion("pafclose between", value1, value2, "pafclose");
            return (Criteria) this;
        }

        public Criteria andPafcloseNotBetween(String value1, String value2) {
            addCriterion("pafclose not between", value1, value2, "pafclose");
            return (Criteria) this;
        }

        public Criteria andPafpersonIsNull() {
            addCriterion("pafperson is null");
            return (Criteria) this;
        }

        public Criteria andPafpersonIsNotNull() {
            addCriterion("pafperson is not null");
            return (Criteria) this;
        }

        public Criteria andPafpersonEqualTo(String value) {
            addCriterion("pafperson =", value, "pafperson");
            return (Criteria) this;
        }

        public Criteria andPafpersonNotEqualTo(String value) {
            addCriterion("pafperson <>", value, "pafperson");
            return (Criteria) this;
        }

        public Criteria andPafpersonGreaterThan(String value) {
            addCriterion("pafperson >", value, "pafperson");
            return (Criteria) this;
        }

        public Criteria andPafpersonGreaterThanOrEqualTo(String value) {
            addCriterion("pafperson >=", value, "pafperson");
            return (Criteria) this;
        }

        public Criteria andPafpersonLessThan(String value) {
            addCriterion("pafperson <", value, "pafperson");
            return (Criteria) this;
        }

        public Criteria andPafpersonLessThanOrEqualTo(String value) {
            addCriterion("pafperson <=", value, "pafperson");
            return (Criteria) this;
        }

        public Criteria andPafpersonLike(String value) {
            addCriterion("pafperson like", value, "pafperson");
            return (Criteria) this;
        }

        public Criteria andPafpersonNotLike(String value) {
            addCriterion("pafperson not like", value, "pafperson");
            return (Criteria) this;
        }

        public Criteria andPafpersonIn(List<String> values) {
            addCriterion("pafperson in", values, "pafperson");
            return (Criteria) this;
        }

        public Criteria andPafpersonNotIn(List<String> values) {
            addCriterion("pafperson not in", values, "pafperson");
            return (Criteria) this;
        }

        public Criteria andPafpersonBetween(String value1, String value2) {
            addCriterion("pafperson between", value1, value2, "pafperson");
            return (Criteria) this;
        }

        public Criteria andPafpersonNotBetween(String value1, String value2) {
            addCriterion("pafperson not between", value1, value2, "pafperson");
            return (Criteria) this;
        }

        public Criteria andPafcashIsNull() {
            addCriterion("pafcash is null");
            return (Criteria) this;
        }

        public Criteria andPafcashIsNotNull() {
            addCriterion("pafcash is not null");
            return (Criteria) this;
        }

        public Criteria andPafcashEqualTo(Float value) {
            addCriterion("pafcash =", value, "pafcash");
            return (Criteria) this;
        }

        public Criteria andPafcashNotEqualTo(Float value) {
            addCriterion("pafcash <>", value, "pafcash");
            return (Criteria) this;
        }

        public Criteria andPafcashGreaterThan(Float value) {
            addCriterion("pafcash >", value, "pafcash");
            return (Criteria) this;
        }

        public Criteria andPafcashGreaterThanOrEqualTo(Float value) {
            addCriterion("pafcash >=", value, "pafcash");
            return (Criteria) this;
        }

        public Criteria andPafcashLessThan(Float value) {
            addCriterion("pafcash <", value, "pafcash");
            return (Criteria) this;
        }

        public Criteria andPafcashLessThanOrEqualTo(Float value) {
            addCriterion("pafcash <=", value, "pafcash");
            return (Criteria) this;
        }

        public Criteria andPafcashIn(List<Float> values) {
            addCriterion("pafcash in", values, "pafcash");
            return (Criteria) this;
        }

        public Criteria andPafcashNotIn(List<Float> values) {
            addCriterion("pafcash not in", values, "pafcash");
            return (Criteria) this;
        }

        public Criteria andPafcashBetween(Float value1, Float value2) {
            addCriterion("pafcash between", value1, value2, "pafcash");
            return (Criteria) this;
        }

        public Criteria andPafcashNotBetween(Float value1, Float value2) {
            addCriterion("pafcash not between", value1, value2, "pafcash");
            return (Criteria) this;
        }

        public Criteria andPafbankIsNull() {
            addCriterion("pafbank is null");
            return (Criteria) this;
        }

        public Criteria andPafbankIsNotNull() {
            addCriterion("pafbank is not null");
            return (Criteria) this;
        }

        public Criteria andPafbankEqualTo(String value) {
            addCriterion("pafbank =", value, "pafbank");
            return (Criteria) this;
        }

        public Criteria andPafbankNotEqualTo(String value) {
            addCriterion("pafbank <>", value, "pafbank");
            return (Criteria) this;
        }

        public Criteria andPafbankGreaterThan(String value) {
            addCriterion("pafbank >", value, "pafbank");
            return (Criteria) this;
        }

        public Criteria andPafbankGreaterThanOrEqualTo(String value) {
            addCriterion("pafbank >=", value, "pafbank");
            return (Criteria) this;
        }

        public Criteria andPafbankLessThan(String value) {
            addCriterion("pafbank <", value, "pafbank");
            return (Criteria) this;
        }

        public Criteria andPafbankLessThanOrEqualTo(String value) {
            addCriterion("pafbank <=", value, "pafbank");
            return (Criteria) this;
        }

        public Criteria andPafbankLike(String value) {
            addCriterion("pafbank like", value, "pafbank");
            return (Criteria) this;
        }

        public Criteria andPafbankNotLike(String value) {
            addCriterion("pafbank not like", value, "pafbank");
            return (Criteria) this;
        }

        public Criteria andPafbankIn(List<String> values) {
            addCriterion("pafbank in", values, "pafbank");
            return (Criteria) this;
        }

        public Criteria andPafbankNotIn(List<String> values) {
            addCriterion("pafbank not in", values, "pafbank");
            return (Criteria) this;
        }

        public Criteria andPafbankBetween(String value1, String value2) {
            addCriterion("pafbank between", value1, value2, "pafbank");
            return (Criteria) this;
        }

        public Criteria andPafbankNotBetween(String value1, String value2) {
            addCriterion("pafbank not between", value1, value2, "pafbank");
            return (Criteria) this;
        }

        public Criteria andPafbillIsNull() {
            addCriterion("pafbill is null");
            return (Criteria) this;
        }

        public Criteria andPafbillIsNotNull() {
            addCriterion("pafbill is not null");
            return (Criteria) this;
        }

        public Criteria andPafbillEqualTo(String value) {
            addCriterion("pafbill =", value, "pafbill");
            return (Criteria) this;
        }

        public Criteria andPafbillNotEqualTo(String value) {
            addCriterion("pafbill <>", value, "pafbill");
            return (Criteria) this;
        }

        public Criteria andPafbillGreaterThan(String value) {
            addCriterion("pafbill >", value, "pafbill");
            return (Criteria) this;
        }

        public Criteria andPafbillGreaterThanOrEqualTo(String value) {
            addCriterion("pafbill >=", value, "pafbill");
            return (Criteria) this;
        }

        public Criteria andPafbillLessThan(String value) {
            addCriterion("pafbill <", value, "pafbill");
            return (Criteria) this;
        }

        public Criteria andPafbillLessThanOrEqualTo(String value) {
            addCriterion("pafbill <=", value, "pafbill");
            return (Criteria) this;
        }

        public Criteria andPafbillLike(String value) {
            addCriterion("pafbill like", value, "pafbill");
            return (Criteria) this;
        }

        public Criteria andPafbillNotLike(String value) {
            addCriterion("pafbill not like", value, "pafbill");
            return (Criteria) this;
        }

        public Criteria andPafbillIn(List<String> values) {
            addCriterion("pafbill in", values, "pafbill");
            return (Criteria) this;
        }

        public Criteria andPafbillNotIn(List<String> values) {
            addCriterion("pafbill not in", values, "pafbill");
            return (Criteria) this;
        }

        public Criteria andPafbillBetween(String value1, String value2) {
            addCriterion("pafbill between", value1, value2, "pafbill");
            return (Criteria) this;
        }

        public Criteria andPafbillNotBetween(String value1, String value2) {
            addCriterion("pafbill not between", value1, value2, "pafbill");
            return (Criteria) this;
        }

        public Criteria andPafbuyerIsNull() {
            addCriterion("pafbuyer is null");
            return (Criteria) this;
        }

        public Criteria andPafbuyerIsNotNull() {
            addCriterion("pafbuyer is not null");
            return (Criteria) this;
        }

        public Criteria andPafbuyerEqualTo(Float value) {
            addCriterion("pafbuyer =", value, "pafbuyer");
            return (Criteria) this;
        }

        public Criteria andPafbuyerNotEqualTo(Float value) {
            addCriterion("pafbuyer <>", value, "pafbuyer");
            return (Criteria) this;
        }

        public Criteria andPafbuyerGreaterThan(Float value) {
            addCriterion("pafbuyer >", value, "pafbuyer");
            return (Criteria) this;
        }

        public Criteria andPafbuyerGreaterThanOrEqualTo(Float value) {
            addCriterion("pafbuyer >=", value, "pafbuyer");
            return (Criteria) this;
        }

        public Criteria andPafbuyerLessThan(Float value) {
            addCriterion("pafbuyer <", value, "pafbuyer");
            return (Criteria) this;
        }

        public Criteria andPafbuyerLessThanOrEqualTo(Float value) {
            addCriterion("pafbuyer <=", value, "pafbuyer");
            return (Criteria) this;
        }

        public Criteria andPafbuyerIn(List<Float> values) {
            addCriterion("pafbuyer in", values, "pafbuyer");
            return (Criteria) this;
        }

        public Criteria andPafbuyerNotIn(List<Float> values) {
            addCriterion("pafbuyer not in", values, "pafbuyer");
            return (Criteria) this;
        }

        public Criteria andPafbuyerBetween(Float value1, Float value2) {
            addCriterion("pafbuyer between", value1, value2, "pafbuyer");
            return (Criteria) this;
        }

        public Criteria andPafbuyerNotBetween(Float value1, Float value2) {
            addCriterion("pafbuyer not between", value1, value2, "pafbuyer");
            return (Criteria) this;
        }

        public Criteria andPafsavingsIsNull() {
            addCriterion("pafsavings is null");
            return (Criteria) this;
        }

        public Criteria andPafsavingsIsNotNull() {
            addCriterion("pafsavings is not null");
            return (Criteria) this;
        }

        public Criteria andPafsavingsEqualTo(Float value) {
            addCriterion("pafsavings =", value, "pafsavings");
            return (Criteria) this;
        }

        public Criteria andPafsavingsNotEqualTo(Float value) {
            addCriterion("pafsavings <>", value, "pafsavings");
            return (Criteria) this;
        }

        public Criteria andPafsavingsGreaterThan(Float value) {
            addCriterion("pafsavings >", value, "pafsavings");
            return (Criteria) this;
        }

        public Criteria andPafsavingsGreaterThanOrEqualTo(Float value) {
            addCriterion("pafsavings >=", value, "pafsavings");
            return (Criteria) this;
        }

        public Criteria andPafsavingsLessThan(Float value) {
            addCriterion("pafsavings <", value, "pafsavings");
            return (Criteria) this;
        }

        public Criteria andPafsavingsLessThanOrEqualTo(Float value) {
            addCriterion("pafsavings <=", value, "pafsavings");
            return (Criteria) this;
        }

        public Criteria andPafsavingsIn(List<Float> values) {
            addCriterion("pafsavings in", values, "pafsavings");
            return (Criteria) this;
        }

        public Criteria andPafsavingsNotIn(List<Float> values) {
            addCriterion("pafsavings not in", values, "pafsavings");
            return (Criteria) this;
        }

        public Criteria andPafsavingsBetween(Float value1, Float value2) {
            addCriterion("pafsavings between", value1, value2, "pafsavings");
            return (Criteria) this;
        }

        public Criteria andPafsavingsNotBetween(Float value1, Float value2) {
            addCriterion("pafsavings not between", value1, value2, "pafsavings");
            return (Criteria) this;
        }

        public Criteria andPafearnestIsNull() {
            addCriterion("pafearnest is null");
            return (Criteria) this;
        }

        public Criteria andPafearnestIsNotNull() {
            addCriterion("pafearnest is not null");
            return (Criteria) this;
        }

        public Criteria andPafearnestEqualTo(Float value) {
            addCriterion("pafearnest =", value, "pafearnest");
            return (Criteria) this;
        }

        public Criteria andPafearnestNotEqualTo(Float value) {
            addCriterion("pafearnest <>", value, "pafearnest");
            return (Criteria) this;
        }

        public Criteria andPafearnestGreaterThan(Float value) {
            addCriterion("pafearnest >", value, "pafearnest");
            return (Criteria) this;
        }

        public Criteria andPafearnestGreaterThanOrEqualTo(Float value) {
            addCriterion("pafearnest >=", value, "pafearnest");
            return (Criteria) this;
        }

        public Criteria andPafearnestLessThan(Float value) {
            addCriterion("pafearnest <", value, "pafearnest");
            return (Criteria) this;
        }

        public Criteria andPafearnestLessThanOrEqualTo(Float value) {
            addCriterion("pafearnest <=", value, "pafearnest");
            return (Criteria) this;
        }

        public Criteria andPafearnestIn(List<Float> values) {
            addCriterion("pafearnest in", values, "pafearnest");
            return (Criteria) this;
        }

        public Criteria andPafearnestNotIn(List<Float> values) {
            addCriterion("pafearnest not in", values, "pafearnest");
            return (Criteria) this;
        }

        public Criteria andPafearnestBetween(Float value1, Float value2) {
            addCriterion("pafearnest between", value1, value2, "pafearnest");
            return (Criteria) this;
        }

        public Criteria andPafearnestNotBetween(Float value1, Float value2) {
            addCriterion("pafearnest not between", value1, value2, "pafearnest");
            return (Criteria) this;
        }

        public Criteria andPaftaxesIsNull() {
            addCriterion("paftaxes is null");
            return (Criteria) this;
        }

        public Criteria andPaftaxesIsNotNull() {
            addCriterion("paftaxes is not null");
            return (Criteria) this;
        }

        public Criteria andPaftaxesEqualTo(Float value) {
            addCriterion("paftaxes =", value, "paftaxes");
            return (Criteria) this;
        }

        public Criteria andPaftaxesNotEqualTo(Float value) {
            addCriterion("paftaxes <>", value, "paftaxes");
            return (Criteria) this;
        }

        public Criteria andPaftaxesGreaterThan(Float value) {
            addCriterion("paftaxes >", value, "paftaxes");
            return (Criteria) this;
        }

        public Criteria andPaftaxesGreaterThanOrEqualTo(Float value) {
            addCriterion("paftaxes >=", value, "paftaxes");
            return (Criteria) this;
        }

        public Criteria andPaftaxesLessThan(Float value) {
            addCriterion("paftaxes <", value, "paftaxes");
            return (Criteria) this;
        }

        public Criteria andPaftaxesLessThanOrEqualTo(Float value) {
            addCriterion("paftaxes <=", value, "paftaxes");
            return (Criteria) this;
        }

        public Criteria andPaftaxesIn(List<Float> values) {
            addCriterion("paftaxes in", values, "paftaxes");
            return (Criteria) this;
        }

        public Criteria andPaftaxesNotIn(List<Float> values) {
            addCriterion("paftaxes not in", values, "paftaxes");
            return (Criteria) this;
        }

        public Criteria andPaftaxesBetween(Float value1, Float value2) {
            addCriterion("paftaxes between", value1, value2, "paftaxes");
            return (Criteria) this;
        }

        public Criteria andPaftaxesNotBetween(Float value1, Float value2) {
            addCriterion("paftaxes not between", value1, value2, "paftaxes");
            return (Criteria) this;
        }

        public Criteria andPafvoucherIsNull() {
            addCriterion("pafvoucher is null");
            return (Criteria) this;
        }

        public Criteria andPafvoucherIsNotNull() {
            addCriterion("pafvoucher is not null");
            return (Criteria) this;
        }

        public Criteria andPafvoucherEqualTo(Float value) {
            addCriterion("pafvoucher =", value, "pafvoucher");
            return (Criteria) this;
        }

        public Criteria andPafvoucherNotEqualTo(Float value) {
            addCriterion("pafvoucher <>", value, "pafvoucher");
            return (Criteria) this;
        }

        public Criteria andPafvoucherGreaterThan(Float value) {
            addCriterion("pafvoucher >", value, "pafvoucher");
            return (Criteria) this;
        }

        public Criteria andPafvoucherGreaterThanOrEqualTo(Float value) {
            addCriterion("pafvoucher >=", value, "pafvoucher");
            return (Criteria) this;
        }

        public Criteria andPafvoucherLessThan(Float value) {
            addCriterion("pafvoucher <", value, "pafvoucher");
            return (Criteria) this;
        }

        public Criteria andPafvoucherLessThanOrEqualTo(Float value) {
            addCriterion("pafvoucher <=", value, "pafvoucher");
            return (Criteria) this;
        }

        public Criteria andPafvoucherIn(List<Float> values) {
            addCriterion("pafvoucher in", values, "pafvoucher");
            return (Criteria) this;
        }

        public Criteria andPafvoucherNotIn(List<Float> values) {
            addCriterion("pafvoucher not in", values, "pafvoucher");
            return (Criteria) this;
        }

        public Criteria andPafvoucherBetween(Float value1, Float value2) {
            addCriterion("pafvoucher between", value1, value2, "pafvoucher");
            return (Criteria) this;
        }

        public Criteria andPafvoucherNotBetween(Float value1, Float value2) {
            addCriterion("pafvoucher not between", value1, value2, "pafvoucher");
            return (Criteria) this;
        }

        public Criteria andPafendIsNull() {
            addCriterion("pafend is null");
            return (Criteria) this;
        }

        public Criteria andPafendIsNotNull() {
            addCriterion("pafend is not null");
            return (Criteria) this;
        }

        public Criteria andPafendEqualTo(Float value) {
            addCriterion("pafend =", value, "pafend");
            return (Criteria) this;
        }

        public Criteria andPafendNotEqualTo(Float value) {
            addCriterion("pafend <>", value, "pafend");
            return (Criteria) this;
        }

        public Criteria andPafendGreaterThan(Float value) {
            addCriterion("pafend >", value, "pafend");
            return (Criteria) this;
        }

        public Criteria andPafendGreaterThanOrEqualTo(Float value) {
            addCriterion("pafend >=", value, "pafend");
            return (Criteria) this;
        }

        public Criteria andPafendLessThan(Float value) {
            addCriterion("pafend <", value, "pafend");
            return (Criteria) this;
        }

        public Criteria andPafendLessThanOrEqualTo(Float value) {
            addCriterion("pafend <=", value, "pafend");
            return (Criteria) this;
        }

        public Criteria andPafendIn(List<Float> values) {
            addCriterion("pafend in", values, "pafend");
            return (Criteria) this;
        }

        public Criteria andPafendNotIn(List<Float> values) {
            addCriterion("pafend not in", values, "pafend");
            return (Criteria) this;
        }

        public Criteria andPafendBetween(Float value1, Float value2) {
            addCriterion("pafend between", value1, value2, "pafend");
            return (Criteria) this;
        }

        public Criteria andPafendNotBetween(Float value1, Float value2) {
            addCriterion("pafend not between", value1, value2, "pafend");
            return (Criteria) this;
        }

        public Criteria andPafinteriorIsNull() {
            addCriterion("pafinterior is null");
            return (Criteria) this;
        }

        public Criteria andPafinteriorIsNotNull() {
            addCriterion("pafinterior is not null");
            return (Criteria) this;
        }

        public Criteria andPafinteriorEqualTo(Float value) {
            addCriterion("pafinterior =", value, "pafinterior");
            return (Criteria) this;
        }

        public Criteria andPafinteriorNotEqualTo(Float value) {
            addCriterion("pafinterior <>", value, "pafinterior");
            return (Criteria) this;
        }

        public Criteria andPafinteriorGreaterThan(Float value) {
            addCriterion("pafinterior >", value, "pafinterior");
            return (Criteria) this;
        }

        public Criteria andPafinteriorGreaterThanOrEqualTo(Float value) {
            addCriterion("pafinterior >=", value, "pafinterior");
            return (Criteria) this;
        }

        public Criteria andPafinteriorLessThan(Float value) {
            addCriterion("pafinterior <", value, "pafinterior");
            return (Criteria) this;
        }

        public Criteria andPafinteriorLessThanOrEqualTo(Float value) {
            addCriterion("pafinterior <=", value, "pafinterior");
            return (Criteria) this;
        }

        public Criteria andPafinteriorIn(List<Float> values) {
            addCriterion("pafinterior in", values, "pafinterior");
            return (Criteria) this;
        }

        public Criteria andPafinteriorNotIn(List<Float> values) {
            addCriterion("pafinterior not in", values, "pafinterior");
            return (Criteria) this;
        }

        public Criteria andPafinteriorBetween(Float value1, Float value2) {
            addCriterion("pafinterior between", value1, value2, "pafinterior");
            return (Criteria) this;
        }

        public Criteria andPafinteriorNotBetween(Float value1, Float value2) {
            addCriterion("pafinterior not between", value1, value2, "pafinterior");
            return (Criteria) this;
        }

        public Criteria andPafintegralIsNull() {
            addCriterion("pafintegral is null");
            return (Criteria) this;
        }

        public Criteria andPafintegralIsNotNull() {
            addCriterion("pafintegral is not null");
            return (Criteria) this;
        }

        public Criteria andPafintegralEqualTo(Float value) {
            addCriterion("pafintegral =", value, "pafintegral");
            return (Criteria) this;
        }

        public Criteria andPafintegralNotEqualTo(Float value) {
            addCriterion("pafintegral <>", value, "pafintegral");
            return (Criteria) this;
        }

        public Criteria andPafintegralGreaterThan(Float value) {
            addCriterion("pafintegral >", value, "pafintegral");
            return (Criteria) this;
        }

        public Criteria andPafintegralGreaterThanOrEqualTo(Float value) {
            addCriterion("pafintegral >=", value, "pafintegral");
            return (Criteria) this;
        }

        public Criteria andPafintegralLessThan(Float value) {
            addCriterion("pafintegral <", value, "pafintegral");
            return (Criteria) this;
        }

        public Criteria andPafintegralLessThanOrEqualTo(Float value) {
            addCriterion("pafintegral <=", value, "pafintegral");
            return (Criteria) this;
        }

        public Criteria andPafintegralIn(List<Float> values) {
            addCriterion("pafintegral in", values, "pafintegral");
            return (Criteria) this;
        }

        public Criteria andPafintegralNotIn(List<Float> values) {
            addCriterion("pafintegral not in", values, "pafintegral");
            return (Criteria) this;
        }

        public Criteria andPafintegralBetween(Float value1, Float value2) {
            addCriterion("pafintegral between", value1, value2, "pafintegral");
            return (Criteria) this;
        }

        public Criteria andPafintegralNotBetween(Float value1, Float value2) {
            addCriterion("pafintegral not between", value1, value2, "pafintegral");
            return (Criteria) this;
        }

        public Criteria andPafaccountIsNull() {
            addCriterion("pafaccount is null");
            return (Criteria) this;
        }

        public Criteria andPafaccountIsNotNull() {
            addCriterion("pafaccount is not null");
            return (Criteria) this;
        }

        public Criteria andPafaccountEqualTo(Float value) {
            addCriterion("pafaccount =", value, "pafaccount");
            return (Criteria) this;
        }

        public Criteria andPafaccountNotEqualTo(Float value) {
            addCriterion("pafaccount <>", value, "pafaccount");
            return (Criteria) this;
        }

        public Criteria andPafaccountGreaterThan(Float value) {
            addCriterion("pafaccount >", value, "pafaccount");
            return (Criteria) this;
        }

        public Criteria andPafaccountGreaterThanOrEqualTo(Float value) {
            addCriterion("pafaccount >=", value, "pafaccount");
            return (Criteria) this;
        }

        public Criteria andPafaccountLessThan(Float value) {
            addCriterion("pafaccount <", value, "pafaccount");
            return (Criteria) this;
        }

        public Criteria andPafaccountLessThanOrEqualTo(Float value) {
            addCriterion("pafaccount <=", value, "pafaccount");
            return (Criteria) this;
        }

        public Criteria andPafaccountIn(List<Float> values) {
            addCriterion("pafaccount in", values, "pafaccount");
            return (Criteria) this;
        }

        public Criteria andPafaccountNotIn(List<Float> values) {
            addCriterion("pafaccount not in", values, "pafaccount");
            return (Criteria) this;
        }

        public Criteria andPafaccountBetween(Float value1, Float value2) {
            addCriterion("pafaccount between", value1, value2, "pafaccount");
            return (Criteria) this;
        }

        public Criteria andPafaccountNotBetween(Float value1, Float value2) {
            addCriterion("pafaccount not between", value1, value2, "pafaccount");
            return (Criteria) this;
        }

        public Criteria andPafkindIsNull() {
            addCriterion("pafkind is null");
            return (Criteria) this;
        }

        public Criteria andPafkindIsNotNull() {
            addCriterion("pafkind is not null");
            return (Criteria) this;
        }

        public Criteria andPafkindEqualTo(String value) {
            addCriterion("pafkind =", value, "pafkind");
            return (Criteria) this;
        }

        public Criteria andPafkindNotEqualTo(String value) {
            addCriterion("pafkind <>", value, "pafkind");
            return (Criteria) this;
        }

        public Criteria andPafkindGreaterThan(String value) {
            addCriterion("pafkind >", value, "pafkind");
            return (Criteria) this;
        }

        public Criteria andPafkindGreaterThanOrEqualTo(String value) {
            addCriterion("pafkind >=", value, "pafkind");
            return (Criteria) this;
        }

        public Criteria andPafkindLessThan(String value) {
            addCriterion("pafkind <", value, "pafkind");
            return (Criteria) this;
        }

        public Criteria andPafkindLessThanOrEqualTo(String value) {
            addCriterion("pafkind <=", value, "pafkind");
            return (Criteria) this;
        }

        public Criteria andPafkindLike(String value) {
            addCriterion("pafkind like", value, "pafkind");
            return (Criteria) this;
        }

        public Criteria andPafkindNotLike(String value) {
            addCriterion("pafkind not like", value, "pafkind");
            return (Criteria) this;
        }

        public Criteria andPafkindIn(List<String> values) {
            addCriterion("pafkind in", values, "pafkind");
            return (Criteria) this;
        }

        public Criteria andPafkindNotIn(List<String> values) {
            addCriterion("pafkind not in", values, "pafkind");
            return (Criteria) this;
        }

        public Criteria andPafkindBetween(String value1, String value2) {
            addCriterion("pafkind between", value1, value2, "pafkind");
            return (Criteria) this;
        }

        public Criteria andPafkindNotBetween(String value1, String value2) {
            addCriterion("pafkind not between", value1, value2, "pafkind");
            return (Criteria) this;
        }

        public Criteria andPafinvoiceIsNull() {
            addCriterion("pafinvoice is null");
            return (Criteria) this;
        }

        public Criteria andPafinvoiceIsNotNull() {
            addCriterion("pafinvoice is not null");
            return (Criteria) this;
        }

        public Criteria andPafinvoiceEqualTo(String value) {
            addCriterion("pafinvoice =", value, "pafinvoice");
            return (Criteria) this;
        }

        public Criteria andPafinvoiceNotEqualTo(String value) {
            addCriterion("pafinvoice <>", value, "pafinvoice");
            return (Criteria) this;
        }

        public Criteria andPafinvoiceGreaterThan(String value) {
            addCriterion("pafinvoice >", value, "pafinvoice");
            return (Criteria) this;
        }

        public Criteria andPafinvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("pafinvoice >=", value, "pafinvoice");
            return (Criteria) this;
        }

        public Criteria andPafinvoiceLessThan(String value) {
            addCriterion("pafinvoice <", value, "pafinvoice");
            return (Criteria) this;
        }

        public Criteria andPafinvoiceLessThanOrEqualTo(String value) {
            addCriterion("pafinvoice <=", value, "pafinvoice");
            return (Criteria) this;
        }

        public Criteria andPafinvoiceLike(String value) {
            addCriterion("pafinvoice like", value, "pafinvoice");
            return (Criteria) this;
        }

        public Criteria andPafinvoiceNotLike(String value) {
            addCriterion("pafinvoice not like", value, "pafinvoice");
            return (Criteria) this;
        }

        public Criteria andPafinvoiceIn(List<String> values) {
            addCriterion("pafinvoice in", values, "pafinvoice");
            return (Criteria) this;
        }

        public Criteria andPafinvoiceNotIn(List<String> values) {
            addCriterion("pafinvoice not in", values, "pafinvoice");
            return (Criteria) this;
        }

        public Criteria andPafinvoiceBetween(String value1, String value2) {
            addCriterion("pafinvoice between", value1, value2, "pafinvoice");
            return (Criteria) this;
        }

        public Criteria andPafinvoiceNotBetween(String value1, String value2) {
            addCriterion("pafinvoice not between", value1, value2, "pafinvoice");
            return (Criteria) this;
        }

        public Criteria andPafvalueIsNull() {
            addCriterion("pafvalue is null");
            return (Criteria) this;
        }

        public Criteria andPafvalueIsNotNull() {
            addCriterion("pafvalue is not null");
            return (Criteria) this;
        }

        public Criteria andPafvalueEqualTo(Float value) {
            addCriterion("pafvalue =", value, "pafvalue");
            return (Criteria) this;
        }

        public Criteria andPafvalueNotEqualTo(Float value) {
            addCriterion("pafvalue <>", value, "pafvalue");
            return (Criteria) this;
        }

        public Criteria andPafvalueGreaterThan(Float value) {
            addCriterion("pafvalue >", value, "pafvalue");
            return (Criteria) this;
        }

        public Criteria andPafvalueGreaterThanOrEqualTo(Float value) {
            addCriterion("pafvalue >=", value, "pafvalue");
            return (Criteria) this;
        }

        public Criteria andPafvalueLessThan(Float value) {
            addCriterion("pafvalue <", value, "pafvalue");
            return (Criteria) this;
        }

        public Criteria andPafvalueLessThanOrEqualTo(Float value) {
            addCriterion("pafvalue <=", value, "pafvalue");
            return (Criteria) this;
        }

        public Criteria andPafvalueIn(List<Float> values) {
            addCriterion("pafvalue in", values, "pafvalue");
            return (Criteria) this;
        }

        public Criteria andPafvalueNotIn(List<Float> values) {
            addCriterion("pafvalue not in", values, "pafvalue");
            return (Criteria) this;
        }

        public Criteria andPafvalueBetween(Float value1, Float value2) {
            addCriterion("pafvalue between", value1, value2, "pafvalue");
            return (Criteria) this;
        }

        public Criteria andPafvalueNotBetween(Float value1, Float value2) {
            addCriterion("pafvalue not between", value1, value2, "pafvalue");
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

        public Criteria andMe2berIsNull() {
            addCriterion("me2ber is null");
            return (Criteria) this;
        }

        public Criteria andMe2berIsNotNull() {
            addCriterion("me2ber is not null");
            return (Criteria) this;
        }

        public Criteria andMe2berEqualTo(Integer value) {
            addCriterion("me2ber =", value, "me2ber");
            return (Criteria) this;
        }

        public Criteria andMe2berNotEqualTo(Integer value) {
            addCriterion("me2ber <>", value, "me2ber");
            return (Criteria) this;
        }

        public Criteria andMe2berGreaterThan(Integer value) {
            addCriterion("me2ber >", value, "me2ber");
            return (Criteria) this;
        }

        public Criteria andMe2berGreaterThanOrEqualTo(Integer value) {
            addCriterion("me2ber >=", value, "me2ber");
            return (Criteria) this;
        }

        public Criteria andMe2berLessThan(Integer value) {
            addCriterion("me2ber <", value, "me2ber");
            return (Criteria) this;
        }

        public Criteria andMe2berLessThanOrEqualTo(Integer value) {
            addCriterion("me2ber <=", value, "me2ber");
            return (Criteria) this;
        }

        public Criteria andMe2berIn(List<Integer> values) {
            addCriterion("me2ber in", values, "me2ber");
            return (Criteria) this;
        }

        public Criteria andMe2berNotIn(List<Integer> values) {
            addCriterion("me2ber not in", values, "me2ber");
            return (Criteria) this;
        }

        public Criteria andMe2berBetween(Integer value1, Integer value2) {
            addCriterion("me2ber between", value1, value2, "me2ber");
            return (Criteria) this;
        }

        public Criteria andMe2berNotBetween(Integer value1, Integer value2) {
            addCriterion("me2ber not between", value1, value2, "me2ber");
            return (Criteria) this;
        }

        public Criteria andMe2ber11IsNull() {
            addCriterion("me2ber11 is null");
            return (Criteria) this;
        }

        public Criteria andMe2ber11IsNotNull() {
            addCriterion("me2ber11 is not null");
            return (Criteria) this;
        }

        public Criteria andMe2ber11EqualTo(String value) {
            addCriterion("me2ber11 =", value, "me2ber11");
            return (Criteria) this;
        }

        public Criteria andMe2ber11NotEqualTo(String value) {
            addCriterion("me2ber11 <>", value, "me2ber11");
            return (Criteria) this;
        }

        public Criteria andMe2ber11GreaterThan(String value) {
            addCriterion("me2ber11 >", value, "me2ber11");
            return (Criteria) this;
        }

        public Criteria andMe2ber11GreaterThanOrEqualTo(String value) {
            addCriterion("me2ber11 >=", value, "me2ber11");
            return (Criteria) this;
        }

        public Criteria andMe2ber11LessThan(String value) {
            addCriterion("me2ber11 <", value, "me2ber11");
            return (Criteria) this;
        }

        public Criteria andMe2ber11LessThanOrEqualTo(String value) {
            addCriterion("me2ber11 <=", value, "me2ber11");
            return (Criteria) this;
        }

        public Criteria andMe2ber11Like(String value) {
            addCriterion("me2ber11 like", value, "me2ber11");
            return (Criteria) this;
        }

        public Criteria andMe2ber11NotLike(String value) {
            addCriterion("me2ber11 not like", value, "me2ber11");
            return (Criteria) this;
        }

        public Criteria andMe2ber11In(List<String> values) {
            addCriterion("me2ber11 in", values, "me2ber11");
            return (Criteria) this;
        }

        public Criteria andMe2ber11NotIn(List<String> values) {
            addCriterion("me2ber11 not in", values, "me2ber11");
            return (Criteria) this;
        }

        public Criteria andMe2ber11Between(String value1, String value2) {
            addCriterion("me2ber11 between", value1, value2, "me2ber11");
            return (Criteria) this;
        }

        public Criteria andMe2ber11NotBetween(String value1, String value2) {
            addCriterion("me2ber11 not between", value1, value2, "me2ber11");
            return (Criteria) this;
        }

        public Criteria andMe2ber22IsNull() {
            addCriterion("me2ber22 is null");
            return (Criteria) this;
        }

        public Criteria andMe2ber22IsNotNull() {
            addCriterion("me2ber22 is not null");
            return (Criteria) this;
        }

        public Criteria andMe2ber22EqualTo(String value) {
            addCriterion("me2ber22 =", value, "me2ber22");
            return (Criteria) this;
        }

        public Criteria andMe2ber22NotEqualTo(String value) {
            addCriterion("me2ber22 <>", value, "me2ber22");
            return (Criteria) this;
        }

        public Criteria andMe2ber22GreaterThan(String value) {
            addCriterion("me2ber22 >", value, "me2ber22");
            return (Criteria) this;
        }

        public Criteria andMe2ber22GreaterThanOrEqualTo(String value) {
            addCriterion("me2ber22 >=", value, "me2ber22");
            return (Criteria) this;
        }

        public Criteria andMe2ber22LessThan(String value) {
            addCriterion("me2ber22 <", value, "me2ber22");
            return (Criteria) this;
        }

        public Criteria andMe2ber22LessThanOrEqualTo(String value) {
            addCriterion("me2ber22 <=", value, "me2ber22");
            return (Criteria) this;
        }

        public Criteria andMe2ber22Like(String value) {
            addCriterion("me2ber22 like", value, "me2ber22");
            return (Criteria) this;
        }

        public Criteria andMe2ber22NotLike(String value) {
            addCriterion("me2ber22 not like", value, "me2ber22");
            return (Criteria) this;
        }

        public Criteria andMe2ber22In(List<String> values) {
            addCriterion("me2ber22 in", values, "me2ber22");
            return (Criteria) this;
        }

        public Criteria andMe2ber22NotIn(List<String> values) {
            addCriterion("me2ber22 not in", values, "me2ber22");
            return (Criteria) this;
        }

        public Criteria andMe2ber22Between(String value1, String value2) {
            addCriterion("me2ber22 between", value1, value2, "me2ber22");
            return (Criteria) this;
        }

        public Criteria andMe2ber22NotBetween(String value1, String value2) {
            addCriterion("me2ber22 not between", value1, value2, "me2ber22");
            return (Criteria) this;
        }

        public Criteria andMe2ber33IsNull() {
            addCriterion("me2ber33 is null");
            return (Criteria) this;
        }

        public Criteria andMe2ber33IsNotNull() {
            addCriterion("me2ber33 is not null");
            return (Criteria) this;
        }

        public Criteria andMe2ber33EqualTo(String value) {
            addCriterion("me2ber33 =", value, "me2ber33");
            return (Criteria) this;
        }

        public Criteria andMe2ber33NotEqualTo(String value) {
            addCriterion("me2ber33 <>", value, "me2ber33");
            return (Criteria) this;
        }

        public Criteria andMe2ber33GreaterThan(String value) {
            addCriterion("me2ber33 >", value, "me2ber33");
            return (Criteria) this;
        }

        public Criteria andMe2ber33GreaterThanOrEqualTo(String value) {
            addCriterion("me2ber33 >=", value, "me2ber33");
            return (Criteria) this;
        }

        public Criteria andMe2ber33LessThan(String value) {
            addCriterion("me2ber33 <", value, "me2ber33");
            return (Criteria) this;
        }

        public Criteria andMe2ber33LessThanOrEqualTo(String value) {
            addCriterion("me2ber33 <=", value, "me2ber33");
            return (Criteria) this;
        }

        public Criteria andMe2ber33Like(String value) {
            addCriterion("me2ber33 like", value, "me2ber33");
            return (Criteria) this;
        }

        public Criteria andMe2ber33NotLike(String value) {
            addCriterion("me2ber33 not like", value, "me2ber33");
            return (Criteria) this;
        }

        public Criteria andMe2ber33In(List<String> values) {
            addCriterion("me2ber33 in", values, "me2ber33");
            return (Criteria) this;
        }

        public Criteria andMe2ber33NotIn(List<String> values) {
            addCriterion("me2ber33 not in", values, "me2ber33");
            return (Criteria) this;
        }

        public Criteria andMe2ber33Between(String value1, String value2) {
            addCriterion("me2ber33 between", value1, value2, "me2ber33");
            return (Criteria) this;
        }

        public Criteria andMe2ber33NotBetween(String value1, String value2) {
            addCriterion("me2ber33 not between", value1, value2, "me2ber33");
            return (Criteria) this;
        }

        public Criteria andMe2ber44IsNull() {
            addCriterion("me2ber44 is null");
            return (Criteria) this;
        }

        public Criteria andMe2ber44IsNotNull() {
            addCriterion("me2ber44 is not null");
            return (Criteria) this;
        }

        public Criteria andMe2ber44EqualTo(String value) {
            addCriterion("me2ber44 =", value, "me2ber44");
            return (Criteria) this;
        }

        public Criteria andMe2ber44NotEqualTo(String value) {
            addCriterion("me2ber44 <>", value, "me2ber44");
            return (Criteria) this;
        }

        public Criteria andMe2ber44GreaterThan(String value) {
            addCriterion("me2ber44 >", value, "me2ber44");
            return (Criteria) this;
        }

        public Criteria andMe2ber44GreaterThanOrEqualTo(String value) {
            addCriterion("me2ber44 >=", value, "me2ber44");
            return (Criteria) this;
        }

        public Criteria andMe2ber44LessThan(String value) {
            addCriterion("me2ber44 <", value, "me2ber44");
            return (Criteria) this;
        }

        public Criteria andMe2ber44LessThanOrEqualTo(String value) {
            addCriterion("me2ber44 <=", value, "me2ber44");
            return (Criteria) this;
        }

        public Criteria andMe2ber44Like(String value) {
            addCriterion("me2ber44 like", value, "me2ber44");
            return (Criteria) this;
        }

        public Criteria andMe2ber44NotLike(String value) {
            addCriterion("me2ber44 not like", value, "me2ber44");
            return (Criteria) this;
        }

        public Criteria andMe2ber44In(List<String> values) {
            addCriterion("me2ber44 in", values, "me2ber44");
            return (Criteria) this;
        }

        public Criteria andMe2ber44NotIn(List<String> values) {
            addCriterion("me2ber44 not in", values, "me2ber44");
            return (Criteria) this;
        }

        public Criteria andMe2ber44Between(String value1, String value2) {
            addCriterion("me2ber44 between", value1, value2, "me2ber44");
            return (Criteria) this;
        }

        public Criteria andMe2ber44NotBetween(String value1, String value2) {
            addCriterion("me2ber44 not between", value1, value2, "me2ber44");
            return (Criteria) this;
        }

        public Criteria andMe2ber55IsNull() {
            addCriterion("me2ber55 is null");
            return (Criteria) this;
        }

        public Criteria andMe2ber55IsNotNull() {
            addCriterion("me2ber55 is not null");
            return (Criteria) this;
        }

        public Criteria andMe2ber55EqualTo(String value) {
            addCriterion("me2ber55 =", value, "me2ber55");
            return (Criteria) this;
        }

        public Criteria andMe2ber55NotEqualTo(String value) {
            addCriterion("me2ber55 <>", value, "me2ber55");
            return (Criteria) this;
        }

        public Criteria andMe2ber55GreaterThan(String value) {
            addCriterion("me2ber55 >", value, "me2ber55");
            return (Criteria) this;
        }

        public Criteria andMe2ber55GreaterThanOrEqualTo(String value) {
            addCriterion("me2ber55 >=", value, "me2ber55");
            return (Criteria) this;
        }

        public Criteria andMe2ber55LessThan(String value) {
            addCriterion("me2ber55 <", value, "me2ber55");
            return (Criteria) this;
        }

        public Criteria andMe2ber55LessThanOrEqualTo(String value) {
            addCriterion("me2ber55 <=", value, "me2ber55");
            return (Criteria) this;
        }

        public Criteria andMe2ber55Like(String value) {
            addCriterion("me2ber55 like", value, "me2ber55");
            return (Criteria) this;
        }

        public Criteria andMe2ber55NotLike(String value) {
            addCriterion("me2ber55 not like", value, "me2ber55");
            return (Criteria) this;
        }

        public Criteria andMe2ber55In(List<String> values) {
            addCriterion("me2ber55 in", values, "me2ber55");
            return (Criteria) this;
        }

        public Criteria andMe2ber55NotIn(List<String> values) {
            addCriterion("me2ber55 not in", values, "me2ber55");
            return (Criteria) this;
        }

        public Criteria andMe2ber55Between(String value1, String value2) {
            addCriterion("me2ber55 between", value1, value2, "me2ber55");
            return (Criteria) this;
        }

        public Criteria andMe2ber55NotBetween(String value1, String value2) {
            addCriterion("me2ber55 not between", value1, value2, "me2ber55");
            return (Criteria) this;
        }

        public Criteria andMe2ber66IsNull() {
            addCriterion("me2ber66 is null");
            return (Criteria) this;
        }

        public Criteria andMe2ber66IsNotNull() {
            addCriterion("me2ber66 is not null");
            return (Criteria) this;
        }

        public Criteria andMe2ber66EqualTo(Integer value) {
            addCriterion("me2ber66 =", value, "me2ber66");
            return (Criteria) this;
        }

        public Criteria andMe2ber66NotEqualTo(Integer value) {
            addCriterion("me2ber66 <>", value, "me2ber66");
            return (Criteria) this;
        }

        public Criteria andMe2ber66GreaterThan(Integer value) {
            addCriterion("me2ber66 >", value, "me2ber66");
            return (Criteria) this;
        }

        public Criteria andMe2ber66GreaterThanOrEqualTo(Integer value) {
            addCriterion("me2ber66 >=", value, "me2ber66");
            return (Criteria) this;
        }

        public Criteria andMe2ber66LessThan(Integer value) {
            addCriterion("me2ber66 <", value, "me2ber66");
            return (Criteria) this;
        }

        public Criteria andMe2ber66LessThanOrEqualTo(Integer value) {
            addCriterion("me2ber66 <=", value, "me2ber66");
            return (Criteria) this;
        }

        public Criteria andMe2ber66In(List<Integer> values) {
            addCriterion("me2ber66 in", values, "me2ber66");
            return (Criteria) this;
        }

        public Criteria andMe2ber66NotIn(List<Integer> values) {
            addCriterion("me2ber66 not in", values, "me2ber66");
            return (Criteria) this;
        }

        public Criteria andMe2ber66Between(Integer value1, Integer value2) {
            addCriterion("me2ber66 between", value1, value2, "me2ber66");
            return (Criteria) this;
        }

        public Criteria andMe2ber66NotBetween(Integer value1, Integer value2) {
            addCriterion("me2ber66 not between", value1, value2, "me2ber66");
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