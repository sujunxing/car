package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ManufacturerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManufacturerExample() {
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

        public Criteria andMarnameIsNull() {
            addCriterion("marname is null");
            return (Criteria) this;
        }

        public Criteria andMarnameIsNotNull() {
            addCriterion("marname is not null");
            return (Criteria) this;
        }

        public Criteria andMarnameEqualTo(String value) {
            addCriterion("marname =", value, "marname");
            return (Criteria) this;
        }

        public Criteria andMarnameNotEqualTo(String value) {
            addCriterion("marname <>", value, "marname");
            return (Criteria) this;
        }

        public Criteria andMarnameGreaterThan(String value) {
            addCriterion("marname >", value, "marname");
            return (Criteria) this;
        }

        public Criteria andMarnameGreaterThanOrEqualTo(String value) {
            addCriterion("marname >=", value, "marname");
            return (Criteria) this;
        }

        public Criteria andMarnameLessThan(String value) {
            addCriterion("marname <", value, "marname");
            return (Criteria) this;
        }

        public Criteria andMarnameLessThanOrEqualTo(String value) {
            addCriterion("marname <=", value, "marname");
            return (Criteria) this;
        }

        public Criteria andMarnameLike(String value) {
            addCriterion("marname like", value, "marname");
            return (Criteria) this;
        }

        public Criteria andMarnameNotLike(String value) {
            addCriterion("marname not like", value, "marname");
            return (Criteria) this;
        }

        public Criteria andMarnameIn(List<String> values) {
            addCriterion("marname in", values, "marname");
            return (Criteria) this;
        }

        public Criteria andMarnameNotIn(List<String> values) {
            addCriterion("marname not in", values, "marname");
            return (Criteria) this;
        }

        public Criteria andMarnameBetween(String value1, String value2) {
            addCriterion("marname between", value1, value2, "marname");
            return (Criteria) this;
        }

        public Criteria andMarnameNotBetween(String value1, String value2) {
            addCriterion("marname not between", value1, value2, "marname");
            return (Criteria) this;
        }

        public Criteria andMaraddressIsNull() {
            addCriterion("maraddress is null");
            return (Criteria) this;
        }

        public Criteria andMaraddressIsNotNull() {
            addCriterion("maraddress is not null");
            return (Criteria) this;
        }

        public Criteria andMaraddressEqualTo(String value) {
            addCriterion("maraddress =", value, "maraddress");
            return (Criteria) this;
        }

        public Criteria andMaraddressNotEqualTo(String value) {
            addCriterion("maraddress <>", value, "maraddress");
            return (Criteria) this;
        }

        public Criteria andMaraddressGreaterThan(String value) {
            addCriterion("maraddress >", value, "maraddress");
            return (Criteria) this;
        }

        public Criteria andMaraddressGreaterThanOrEqualTo(String value) {
            addCriterion("maraddress >=", value, "maraddress");
            return (Criteria) this;
        }

        public Criteria andMaraddressLessThan(String value) {
            addCriterion("maraddress <", value, "maraddress");
            return (Criteria) this;
        }

        public Criteria andMaraddressLessThanOrEqualTo(String value) {
            addCriterion("maraddress <=", value, "maraddress");
            return (Criteria) this;
        }

        public Criteria andMaraddressLike(String value) {
            addCriterion("maraddress like", value, "maraddress");
            return (Criteria) this;
        }

        public Criteria andMaraddressNotLike(String value) {
            addCriterion("maraddress not like", value, "maraddress");
            return (Criteria) this;
        }

        public Criteria andMaraddressIn(List<String> values) {
            addCriterion("maraddress in", values, "maraddress");
            return (Criteria) this;
        }

        public Criteria andMaraddressNotIn(List<String> values) {
            addCriterion("maraddress not in", values, "maraddress");
            return (Criteria) this;
        }

        public Criteria andMaraddressBetween(String value1, String value2) {
            addCriterion("maraddress between", value1, value2, "maraddress");
            return (Criteria) this;
        }

        public Criteria andMaraddressNotBetween(String value1, String value2) {
            addCriterion("maraddress not between", value1, value2, "maraddress");
            return (Criteria) this;
        }

        public Criteria andMarmanageIsNull() {
            addCriterion("marmanage is null");
            return (Criteria) this;
        }

        public Criteria andMarmanageIsNotNull() {
            addCriterion("marmanage is not null");
            return (Criteria) this;
        }

        public Criteria andMarmanageEqualTo(String value) {
            addCriterion("marmanage =", value, "marmanage");
            return (Criteria) this;
        }

        public Criteria andMarmanageNotEqualTo(String value) {
            addCriterion("marmanage <>", value, "marmanage");
            return (Criteria) this;
        }

        public Criteria andMarmanageGreaterThan(String value) {
            addCriterion("marmanage >", value, "marmanage");
            return (Criteria) this;
        }

        public Criteria andMarmanageGreaterThanOrEqualTo(String value) {
            addCriterion("marmanage >=", value, "marmanage");
            return (Criteria) this;
        }

        public Criteria andMarmanageLessThan(String value) {
            addCriterion("marmanage <", value, "marmanage");
            return (Criteria) this;
        }

        public Criteria andMarmanageLessThanOrEqualTo(String value) {
            addCriterion("marmanage <=", value, "marmanage");
            return (Criteria) this;
        }

        public Criteria andMarmanageLike(String value) {
            addCriterion("marmanage like", value, "marmanage");
            return (Criteria) this;
        }

        public Criteria andMarmanageNotLike(String value) {
            addCriterion("marmanage not like", value, "marmanage");
            return (Criteria) this;
        }

        public Criteria andMarmanageIn(List<String> values) {
            addCriterion("marmanage in", values, "marmanage");
            return (Criteria) this;
        }

        public Criteria andMarmanageNotIn(List<String> values) {
            addCriterion("marmanage not in", values, "marmanage");
            return (Criteria) this;
        }

        public Criteria andMarmanageBetween(String value1, String value2) {
            addCriterion("marmanage between", value1, value2, "marmanage");
            return (Criteria) this;
        }

        public Criteria andMarmanageNotBetween(String value1, String value2) {
            addCriterion("marmanage not between", value1, value2, "marmanage");
            return (Criteria) this;
        }

        public Criteria andMarurlIsNull() {
            addCriterion("marurl is null");
            return (Criteria) this;
        }

        public Criteria andMarurlIsNotNull() {
            addCriterion("marurl is not null");
            return (Criteria) this;
        }

        public Criteria andMarurlEqualTo(String value) {
            addCriterion("marurl =", value, "marurl");
            return (Criteria) this;
        }

        public Criteria andMarurlNotEqualTo(String value) {
            addCriterion("marurl <>", value, "marurl");
            return (Criteria) this;
        }

        public Criteria andMarurlGreaterThan(String value) {
            addCriterion("marurl >", value, "marurl");
            return (Criteria) this;
        }

        public Criteria andMarurlGreaterThanOrEqualTo(String value) {
            addCriterion("marurl >=", value, "marurl");
            return (Criteria) this;
        }

        public Criteria andMarurlLessThan(String value) {
            addCriterion("marurl <", value, "marurl");
            return (Criteria) this;
        }

        public Criteria andMarurlLessThanOrEqualTo(String value) {
            addCriterion("marurl <=", value, "marurl");
            return (Criteria) this;
        }

        public Criteria andMarurlLike(String value) {
            addCriterion("marurl like", value, "marurl");
            return (Criteria) this;
        }

        public Criteria andMarurlNotLike(String value) {
            addCriterion("marurl not like", value, "marurl");
            return (Criteria) this;
        }

        public Criteria andMarurlIn(List<String> values) {
            addCriterion("marurl in", values, "marurl");
            return (Criteria) this;
        }

        public Criteria andMarurlNotIn(List<String> values) {
            addCriterion("marurl not in", values, "marurl");
            return (Criteria) this;
        }

        public Criteria andMarurlBetween(String value1, String value2) {
            addCriterion("marurl between", value1, value2, "marurl");
            return (Criteria) this;
        }

        public Criteria andMarurlNotBetween(String value1, String value2) {
            addCriterion("marurl not between", value1, value2, "marurl");
            return (Criteria) this;
        }

        public Criteria andMaropenIsNull() {
            addCriterion("maropen is null");
            return (Criteria) this;
        }

        public Criteria andMaropenIsNotNull() {
            addCriterion("maropen is not null");
            return (Criteria) this;
        }

        public Criteria andMaropenEqualTo(String value) {
            addCriterion("maropen =", value, "maropen");
            return (Criteria) this;
        }

        public Criteria andMaropenNotEqualTo(String value) {
            addCriterion("maropen <>", value, "maropen");
            return (Criteria) this;
        }

        public Criteria andMaropenGreaterThan(String value) {
            addCriterion("maropen >", value, "maropen");
            return (Criteria) this;
        }

        public Criteria andMaropenGreaterThanOrEqualTo(String value) {
            addCriterion("maropen >=", value, "maropen");
            return (Criteria) this;
        }

        public Criteria andMaropenLessThan(String value) {
            addCriterion("maropen <", value, "maropen");
            return (Criteria) this;
        }

        public Criteria andMaropenLessThanOrEqualTo(String value) {
            addCriterion("maropen <=", value, "maropen");
            return (Criteria) this;
        }

        public Criteria andMaropenLike(String value) {
            addCriterion("maropen like", value, "maropen");
            return (Criteria) this;
        }

        public Criteria andMaropenNotLike(String value) {
            addCriterion("maropen not like", value, "maropen");
            return (Criteria) this;
        }

        public Criteria andMaropenIn(List<String> values) {
            addCriterion("maropen in", values, "maropen");
            return (Criteria) this;
        }

        public Criteria andMaropenNotIn(List<String> values) {
            addCriterion("maropen not in", values, "maropen");
            return (Criteria) this;
        }

        public Criteria andMaropenBetween(String value1, String value2) {
            addCriterion("maropen between", value1, value2, "maropen");
            return (Criteria) this;
        }

        public Criteria andMaropenNotBetween(String value1, String value2) {
            addCriterion("maropen not between", value1, value2, "maropen");
            return (Criteria) this;
        }

        public Criteria andMaraccountIsNull() {
            addCriterion("maraccount is null");
            return (Criteria) this;
        }

        public Criteria andMaraccountIsNotNull() {
            addCriterion("maraccount is not null");
            return (Criteria) this;
        }

        public Criteria andMaraccountEqualTo(String value) {
            addCriterion("maraccount =", value, "maraccount");
            return (Criteria) this;
        }

        public Criteria andMaraccountNotEqualTo(String value) {
            addCriterion("maraccount <>", value, "maraccount");
            return (Criteria) this;
        }

        public Criteria andMaraccountGreaterThan(String value) {
            addCriterion("maraccount >", value, "maraccount");
            return (Criteria) this;
        }

        public Criteria andMaraccountGreaterThanOrEqualTo(String value) {
            addCriterion("maraccount >=", value, "maraccount");
            return (Criteria) this;
        }

        public Criteria andMaraccountLessThan(String value) {
            addCriterion("maraccount <", value, "maraccount");
            return (Criteria) this;
        }

        public Criteria andMaraccountLessThanOrEqualTo(String value) {
            addCriterion("maraccount <=", value, "maraccount");
            return (Criteria) this;
        }

        public Criteria andMaraccountLike(String value) {
            addCriterion("maraccount like", value, "maraccount");
            return (Criteria) this;
        }

        public Criteria andMaraccountNotLike(String value) {
            addCriterion("maraccount not like", value, "maraccount");
            return (Criteria) this;
        }

        public Criteria andMaraccountIn(List<String> values) {
            addCriterion("maraccount in", values, "maraccount");
            return (Criteria) this;
        }

        public Criteria andMaraccountNotIn(List<String> values) {
            addCriterion("maraccount not in", values, "maraccount");
            return (Criteria) this;
        }

        public Criteria andMaraccountBetween(String value1, String value2) {
            addCriterion("maraccount between", value1, value2, "maraccount");
            return (Criteria) this;
        }

        public Criteria andMaraccountNotBetween(String value1, String value2) {
            addCriterion("maraccount not between", value1, value2, "maraccount");
            return (Criteria) this;
        }

        public Criteria andMarwayIsNull() {
            addCriterion("marway is null");
            return (Criteria) this;
        }

        public Criteria andMarwayIsNotNull() {
            addCriterion("marway is not null");
            return (Criteria) this;
        }

        public Criteria andMarwayEqualTo(String value) {
            addCriterion("marway =", value, "marway");
            return (Criteria) this;
        }

        public Criteria andMarwayNotEqualTo(String value) {
            addCriterion("marway <>", value, "marway");
            return (Criteria) this;
        }

        public Criteria andMarwayGreaterThan(String value) {
            addCriterion("marway >", value, "marway");
            return (Criteria) this;
        }

        public Criteria andMarwayGreaterThanOrEqualTo(String value) {
            addCriterion("marway >=", value, "marway");
            return (Criteria) this;
        }

        public Criteria andMarwayLessThan(String value) {
            addCriterion("marway <", value, "marway");
            return (Criteria) this;
        }

        public Criteria andMarwayLessThanOrEqualTo(String value) {
            addCriterion("marway <=", value, "marway");
            return (Criteria) this;
        }

        public Criteria andMarwayLike(String value) {
            addCriterion("marway like", value, "marway");
            return (Criteria) this;
        }

        public Criteria andMarwayNotLike(String value) {
            addCriterion("marway not like", value, "marway");
            return (Criteria) this;
        }

        public Criteria andMarwayIn(List<String> values) {
            addCriterion("marway in", values, "marway");
            return (Criteria) this;
        }

        public Criteria andMarwayNotIn(List<String> values) {
            addCriterion("marway not in", values, "marway");
            return (Criteria) this;
        }

        public Criteria andMarwayBetween(String value1, String value2) {
            addCriterion("marway between", value1, value2, "marway");
            return (Criteria) this;
        }

        public Criteria andMarwayNotBetween(String value1, String value2) {
            addCriterion("marway not between", value1, value2, "marway");
            return (Criteria) this;
        }

        public Criteria andMarlevelIsNull() {
            addCriterion("marlevel is null");
            return (Criteria) this;
        }

        public Criteria andMarlevelIsNotNull() {
            addCriterion("marlevel is not null");
            return (Criteria) this;
        }

        public Criteria andMarlevelEqualTo(String value) {
            addCriterion("marlevel =", value, "marlevel");
            return (Criteria) this;
        }

        public Criteria andMarlevelNotEqualTo(String value) {
            addCriterion("marlevel <>", value, "marlevel");
            return (Criteria) this;
        }

        public Criteria andMarlevelGreaterThan(String value) {
            addCriterion("marlevel >", value, "marlevel");
            return (Criteria) this;
        }

        public Criteria andMarlevelGreaterThanOrEqualTo(String value) {
            addCriterion("marlevel >=", value, "marlevel");
            return (Criteria) this;
        }

        public Criteria andMarlevelLessThan(String value) {
            addCriterion("marlevel <", value, "marlevel");
            return (Criteria) this;
        }

        public Criteria andMarlevelLessThanOrEqualTo(String value) {
            addCriterion("marlevel <=", value, "marlevel");
            return (Criteria) this;
        }

        public Criteria andMarlevelLike(String value) {
            addCriterion("marlevel like", value, "marlevel");
            return (Criteria) this;
        }

        public Criteria andMarlevelNotLike(String value) {
            addCriterion("marlevel not like", value, "marlevel");
            return (Criteria) this;
        }

        public Criteria andMarlevelIn(List<String> values) {
            addCriterion("marlevel in", values, "marlevel");
            return (Criteria) this;
        }

        public Criteria andMarlevelNotIn(List<String> values) {
            addCriterion("marlevel not in", values, "marlevel");
            return (Criteria) this;
        }

        public Criteria andMarlevelBetween(String value1, String value2) {
            addCriterion("marlevel between", value1, value2, "marlevel");
            return (Criteria) this;
        }

        public Criteria andMarlevelNotBetween(String value1, String value2) {
            addCriterion("marlevel not between", value1, value2, "marlevel");
            return (Criteria) this;
        }

        public Criteria andMarbrandIsNull() {
            addCriterion("marbrand is null");
            return (Criteria) this;
        }

        public Criteria andMarbrandIsNotNull() {
            addCriterion("marbrand is not null");
            return (Criteria) this;
        }

        public Criteria andMarbrandEqualTo(String value) {
            addCriterion("marbrand =", value, "marbrand");
            return (Criteria) this;
        }

        public Criteria andMarbrandNotEqualTo(String value) {
            addCriterion("marbrand <>", value, "marbrand");
            return (Criteria) this;
        }

        public Criteria andMarbrandGreaterThan(String value) {
            addCriterion("marbrand >", value, "marbrand");
            return (Criteria) this;
        }

        public Criteria andMarbrandGreaterThanOrEqualTo(String value) {
            addCriterion("marbrand >=", value, "marbrand");
            return (Criteria) this;
        }

        public Criteria andMarbrandLessThan(String value) {
            addCriterion("marbrand <", value, "marbrand");
            return (Criteria) this;
        }

        public Criteria andMarbrandLessThanOrEqualTo(String value) {
            addCriterion("marbrand <=", value, "marbrand");
            return (Criteria) this;
        }

        public Criteria andMarbrandLike(String value) {
            addCriterion("marbrand like", value, "marbrand");
            return (Criteria) this;
        }

        public Criteria andMarbrandNotLike(String value) {
            addCriterion("marbrand not like", value, "marbrand");
            return (Criteria) this;
        }

        public Criteria andMarbrandIn(List<String> values) {
            addCriterion("marbrand in", values, "marbrand");
            return (Criteria) this;
        }

        public Criteria andMarbrandNotIn(List<String> values) {
            addCriterion("marbrand not in", values, "marbrand");
            return (Criteria) this;
        }

        public Criteria andMarbrandBetween(String value1, String value2) {
            addCriterion("marbrand between", value1, value2, "marbrand");
            return (Criteria) this;
        }

        public Criteria andMarbrandNotBetween(String value1, String value2) {
            addCriterion("marbrand not between", value1, value2, "marbrand");
            return (Criteria) this;
        }

        public Criteria andMaeidIsNull() {
            addCriterion("maeid is null");
            return (Criteria) this;
        }

        public Criteria andMaeidIsNotNull() {
            addCriterion("maeid is not null");
            return (Criteria) this;
        }

        public Criteria andMaeidEqualTo(Integer value) {
            addCriterion("maeid =", value, "maeid");
            return (Criteria) this;
        }

        public Criteria andMaeidNotEqualTo(Integer value) {
            addCriterion("maeid <>", value, "maeid");
            return (Criteria) this;
        }

        public Criteria andMaeidGreaterThan(Integer value) {
            addCriterion("maeid >", value, "maeid");
            return (Criteria) this;
        }

        public Criteria andMaeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("maeid >=", value, "maeid");
            return (Criteria) this;
        }

        public Criteria andMaeidLessThan(Integer value) {
            addCriterion("maeid <", value, "maeid");
            return (Criteria) this;
        }

        public Criteria andMaeidLessThanOrEqualTo(Integer value) {
            addCriterion("maeid <=", value, "maeid");
            return (Criteria) this;
        }

        public Criteria andMaeidIn(List<Integer> values) {
            addCriterion("maeid in", values, "maeid");
            return (Criteria) this;
        }

        public Criteria andMaeidNotIn(List<Integer> values) {
            addCriterion("maeid not in", values, "maeid");
            return (Criteria) this;
        }

        public Criteria andMaeidBetween(Integer value1, Integer value2) {
            addCriterion("maeid between", value1, value2, "maeid");
            return (Criteria) this;
        }

        public Criteria andMaeidNotBetween(Integer value1, Integer value2) {
            addCriterion("maeid not between", value1, value2, "maeid");
            return (Criteria) this;
        }

        public Criteria andMarrelationIsNull() {
            addCriterion("marrelation is null");
            return (Criteria) this;
        }

        public Criteria andMarrelationIsNotNull() {
            addCriterion("marrelation is not null");
            return (Criteria) this;
        }

        public Criteria andMarrelationEqualTo(String value) {
            addCriterion("marrelation =", value, "marrelation");
            return (Criteria) this;
        }

        public Criteria andMarrelationNotEqualTo(String value) {
            addCriterion("marrelation <>", value, "marrelation");
            return (Criteria) this;
        }

        public Criteria andMarrelationGreaterThan(String value) {
            addCriterion("marrelation >", value, "marrelation");
            return (Criteria) this;
        }

        public Criteria andMarrelationGreaterThanOrEqualTo(String value) {
            addCriterion("marrelation >=", value, "marrelation");
            return (Criteria) this;
        }

        public Criteria andMarrelationLessThan(String value) {
            addCriterion("marrelation <", value, "marrelation");
            return (Criteria) this;
        }

        public Criteria andMarrelationLessThanOrEqualTo(String value) {
            addCriterion("marrelation <=", value, "marrelation");
            return (Criteria) this;
        }

        public Criteria andMarrelationLike(String value) {
            addCriterion("marrelation like", value, "marrelation");
            return (Criteria) this;
        }

        public Criteria andMarrelationNotLike(String value) {
            addCriterion("marrelation not like", value, "marrelation");
            return (Criteria) this;
        }

        public Criteria andMarrelationIn(List<String> values) {
            addCriterion("marrelation in", values, "marrelation");
            return (Criteria) this;
        }

        public Criteria andMarrelationNotIn(List<String> values) {
            addCriterion("marrelation not in", values, "marrelation");
            return (Criteria) this;
        }

        public Criteria andMarrelationBetween(String value1, String value2) {
            addCriterion("marrelation between", value1, value2, "marrelation");
            return (Criteria) this;
        }

        public Criteria andMarrelationNotBetween(String value1, String value2) {
            addCriterion("marrelation not between", value1, value2, "marrelation");
            return (Criteria) this;
        }

        public Criteria andMarphoneIsNull() {
            addCriterion("marphone is null");
            return (Criteria) this;
        }

        public Criteria andMarphoneIsNotNull() {
            addCriterion("marphone is not null");
            return (Criteria) this;
        }

        public Criteria andMarphoneEqualTo(String value) {
            addCriterion("marphone =", value, "marphone");
            return (Criteria) this;
        }

        public Criteria andMarphoneNotEqualTo(String value) {
            addCriterion("marphone <>", value, "marphone");
            return (Criteria) this;
        }

        public Criteria andMarphoneGreaterThan(String value) {
            addCriterion("marphone >", value, "marphone");
            return (Criteria) this;
        }

        public Criteria andMarphoneGreaterThanOrEqualTo(String value) {
            addCriterion("marphone >=", value, "marphone");
            return (Criteria) this;
        }

        public Criteria andMarphoneLessThan(String value) {
            addCriterion("marphone <", value, "marphone");
            return (Criteria) this;
        }

        public Criteria andMarphoneLessThanOrEqualTo(String value) {
            addCriterion("marphone <=", value, "marphone");
            return (Criteria) this;
        }

        public Criteria andMarphoneLike(String value) {
            addCriterion("marphone like", value, "marphone");
            return (Criteria) this;
        }

        public Criteria andMarphoneNotLike(String value) {
            addCriterion("marphone not like", value, "marphone");
            return (Criteria) this;
        }

        public Criteria andMarphoneIn(List<String> values) {
            addCriterion("marphone in", values, "marphone");
            return (Criteria) this;
        }

        public Criteria andMarphoneNotIn(List<String> values) {
            addCriterion("marphone not in", values, "marphone");
            return (Criteria) this;
        }

        public Criteria andMarphoneBetween(String value1, String value2) {
            addCriterion("marphone between", value1, value2, "marphone");
            return (Criteria) this;
        }

        public Criteria andMarphoneNotBetween(String value1, String value2) {
            addCriterion("marphone not between", value1, value2, "marphone");
            return (Criteria) this;
        }

        public Criteria andMarcardIsNull() {
            addCriterion("marcard is null");
            return (Criteria) this;
        }

        public Criteria andMarcardIsNotNull() {
            addCriterion("marcard is not null");
            return (Criteria) this;
        }

        public Criteria andMarcardEqualTo(String value) {
            addCriterion("marcard =", value, "marcard");
            return (Criteria) this;
        }

        public Criteria andMarcardNotEqualTo(String value) {
            addCriterion("marcard <>", value, "marcard");
            return (Criteria) this;
        }

        public Criteria andMarcardGreaterThan(String value) {
            addCriterion("marcard >", value, "marcard");
            return (Criteria) this;
        }

        public Criteria andMarcardGreaterThanOrEqualTo(String value) {
            addCriterion("marcard >=", value, "marcard");
            return (Criteria) this;
        }

        public Criteria andMarcardLessThan(String value) {
            addCriterion("marcard <", value, "marcard");
            return (Criteria) this;
        }

        public Criteria andMarcardLessThanOrEqualTo(String value) {
            addCriterion("marcard <=", value, "marcard");
            return (Criteria) this;
        }

        public Criteria andMarcardLike(String value) {
            addCriterion("marcard like", value, "marcard");
            return (Criteria) this;
        }

        public Criteria andMarcardNotLike(String value) {
            addCriterion("marcard not like", value, "marcard");
            return (Criteria) this;
        }

        public Criteria andMarcardIn(List<String> values) {
            addCriterion("marcard in", values, "marcard");
            return (Criteria) this;
        }

        public Criteria andMarcardNotIn(List<String> values) {
            addCriterion("marcard not in", values, "marcard");
            return (Criteria) this;
        }

        public Criteria andMarcardBetween(String value1, String value2) {
            addCriterion("marcard between", value1, value2, "marcard");
            return (Criteria) this;
        }

        public Criteria andMarcardNotBetween(String value1, String value2) {
            addCriterion("marcard not between", value1, value2, "marcard");
            return (Criteria) this;
        }

        public Criteria andMaremailIsNull() {
            addCriterion("maremail is null");
            return (Criteria) this;
        }

        public Criteria andMaremailIsNotNull() {
            addCriterion("maremail is not null");
            return (Criteria) this;
        }

        public Criteria andMaremailEqualTo(String value) {
            addCriterion("maremail =", value, "maremail");
            return (Criteria) this;
        }

        public Criteria andMaremailNotEqualTo(String value) {
            addCriterion("maremail <>", value, "maremail");
            return (Criteria) this;
        }

        public Criteria andMaremailGreaterThan(String value) {
            addCriterion("maremail >", value, "maremail");
            return (Criteria) this;
        }

        public Criteria andMaremailGreaterThanOrEqualTo(String value) {
            addCriterion("maremail >=", value, "maremail");
            return (Criteria) this;
        }

        public Criteria andMaremailLessThan(String value) {
            addCriterion("maremail <", value, "maremail");
            return (Criteria) this;
        }

        public Criteria andMaremailLessThanOrEqualTo(String value) {
            addCriterion("maremail <=", value, "maremail");
            return (Criteria) this;
        }

        public Criteria andMaremailLike(String value) {
            addCriterion("maremail like", value, "maremail");
            return (Criteria) this;
        }

        public Criteria andMaremailNotLike(String value) {
            addCriterion("maremail not like", value, "maremail");
            return (Criteria) this;
        }

        public Criteria andMaremailIn(List<String> values) {
            addCriterion("maremail in", values, "maremail");
            return (Criteria) this;
        }

        public Criteria andMaremailNotIn(List<String> values) {
            addCriterion("maremail not in", values, "maremail");
            return (Criteria) this;
        }

        public Criteria andMaremailBetween(String value1, String value2) {
            addCriterion("maremail between", value1, value2, "maremail");
            return (Criteria) this;
        }

        public Criteria andMaremailNotBetween(String value1, String value2) {
            addCriterion("maremail not between", value1, value2, "maremail");
            return (Criteria) this;
        }

        public Criteria andMarpaymentIsNull() {
            addCriterion("marpayment is null");
            return (Criteria) this;
        }

        public Criteria andMarpaymentIsNotNull() {
            addCriterion("marpayment is not null");
            return (Criteria) this;
        }

        public Criteria andMarpaymentEqualTo(String value) {
            addCriterion("marpayment =", value, "marpayment");
            return (Criteria) this;
        }

        public Criteria andMarpaymentNotEqualTo(String value) {
            addCriterion("marpayment <>", value, "marpayment");
            return (Criteria) this;
        }

        public Criteria andMarpaymentGreaterThan(String value) {
            addCriterion("marpayment >", value, "marpayment");
            return (Criteria) this;
        }

        public Criteria andMarpaymentGreaterThanOrEqualTo(String value) {
            addCriterion("marpayment >=", value, "marpayment");
            return (Criteria) this;
        }

        public Criteria andMarpaymentLessThan(String value) {
            addCriterion("marpayment <", value, "marpayment");
            return (Criteria) this;
        }

        public Criteria andMarpaymentLessThanOrEqualTo(String value) {
            addCriterion("marpayment <=", value, "marpayment");
            return (Criteria) this;
        }

        public Criteria andMarpaymentLike(String value) {
            addCriterion("marpayment like", value, "marpayment");
            return (Criteria) this;
        }

        public Criteria andMarpaymentNotLike(String value) {
            addCriterion("marpayment not like", value, "marpayment");
            return (Criteria) this;
        }

        public Criteria andMarpaymentIn(List<String> values) {
            addCriterion("marpayment in", values, "marpayment");
            return (Criteria) this;
        }

        public Criteria andMarpaymentNotIn(List<String> values) {
            addCriterion("marpayment not in", values, "marpayment");
            return (Criteria) this;
        }

        public Criteria andMarpaymentBetween(String value1, String value2) {
            addCriterion("marpayment between", value1, value2, "marpayment");
            return (Criteria) this;
        }

        public Criteria andMarpaymentNotBetween(String value1, String value2) {
            addCriterion("marpayment not between", value1, value2, "marpayment");
            return (Criteria) this;
        }

        public Criteria andMaremarkIsNull() {
            addCriterion("maremark is null");
            return (Criteria) this;
        }

        public Criteria andMaremarkIsNotNull() {
            addCriterion("maremark is not null");
            return (Criteria) this;
        }

        public Criteria andMaremarkEqualTo(String value) {
            addCriterion("maremark =", value, "maremark");
            return (Criteria) this;
        }

        public Criteria andMaremarkNotEqualTo(String value) {
            addCriterion("maremark <>", value, "maremark");
            return (Criteria) this;
        }

        public Criteria andMaremarkGreaterThan(String value) {
            addCriterion("maremark >", value, "maremark");
            return (Criteria) this;
        }

        public Criteria andMaremarkGreaterThanOrEqualTo(String value) {
            addCriterion("maremark >=", value, "maremark");
            return (Criteria) this;
        }

        public Criteria andMaremarkLessThan(String value) {
            addCriterion("maremark <", value, "maremark");
            return (Criteria) this;
        }

        public Criteria andMaremarkLessThanOrEqualTo(String value) {
            addCriterion("maremark <=", value, "maremark");
            return (Criteria) this;
        }

        public Criteria andMaremarkLike(String value) {
            addCriterion("maremark like", value, "maremark");
            return (Criteria) this;
        }

        public Criteria andMaremarkNotLike(String value) {
            addCriterion("maremark not like", value, "maremark");
            return (Criteria) this;
        }

        public Criteria andMaremarkIn(List<String> values) {
            addCriterion("maremark in", values, "maremark");
            return (Criteria) this;
        }

        public Criteria andMaremarkNotIn(List<String> values) {
            addCriterion("maremark not in", values, "maremark");
            return (Criteria) this;
        }

        public Criteria andMaremarkBetween(String value1, String value2) {
            addCriterion("maremark between", value1, value2, "maremark");
            return (Criteria) this;
        }

        public Criteria andMaremarkNotBetween(String value1, String value2) {
            addCriterion("maremark not between", value1, value2, "maremark");
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