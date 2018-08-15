package com.xyb.shop.model.xyb;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WechatUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WechatUserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSubscribeIsNull() {
            addCriterion("subscribe is null");
            return (Criteria) this;
        }

        public Criteria andSubscribeIsNotNull() {
            addCriterion("subscribe is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribeEqualTo(String value) {
            addCriterion("subscribe =", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeNotEqualTo(String value) {
            addCriterion("subscribe <>", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeGreaterThan(String value) {
            addCriterion("subscribe >", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeGreaterThanOrEqualTo(String value) {
            addCriterion("subscribe >=", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeLessThan(String value) {
            addCriterion("subscribe <", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeLessThanOrEqualTo(String value) {
            addCriterion("subscribe <=", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeLike(String value) {
            addCriterion("subscribe like", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeNotLike(String value) {
            addCriterion("subscribe not like", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeIn(List<String> values) {
            addCriterion("subscribe in", values, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeNotIn(List<String> values) {
            addCriterion("subscribe not in", values, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeBetween(String value1, String value2) {
            addCriterion("subscribe between", value1, value2, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeNotBetween(String value1, String value2) {
            addCriterion("subscribe not between", value1, value2, "subscribe");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNull() {
            addCriterion("pay_password is null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNotNull() {
            addCriterion("pay_password is not null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordEqualTo(String value) {
            addCriterion("pay_password =", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotEqualTo(String value) {
            addCriterion("pay_password <>", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThan(String value) {
            addCriterion("pay_password >", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("pay_password >=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThan(String value) {
            addCriterion("pay_password <", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThanOrEqualTo(String value) {
            addCriterion("pay_password <=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLike(String value) {
            addCriterion("pay_password like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotLike(String value) {
            addCriterion("pay_password not like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIn(List<String> values) {
            addCriterion("pay_password in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotIn(List<String> values) {
            addCriterion("pay_password not in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordBetween(String value1, String value2) {
            addCriterion("pay_password between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotBetween(String value1, String value2) {
            addCriterion("pay_password not between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIsNull() {
            addCriterion("headimgurl is null");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIsNotNull() {
            addCriterion("headimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlEqualTo(String value) {
            addCriterion("headimgurl =", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotEqualTo(String value) {
            addCriterion("headimgurl <>", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlGreaterThan(String value) {
            addCriterion("headimgurl >", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("headimgurl >=", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLessThan(String value) {
            addCriterion("headimgurl <", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLessThanOrEqualTo(String value) {
            addCriterion("headimgurl <=", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLike(String value) {
            addCriterion("headimgurl like", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotLike(String value) {
            addCriterion("headimgurl not like", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIn(List<String> values) {
            addCriterion("headimgurl in", values, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotIn(List<String> values) {
            addCriterion("headimgurl not in", values, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlBetween(String value1, String value2) {
            addCriterion("headimgurl between", value1, value2, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotBetween(String value1, String value2) {
            addCriterion("headimgurl not between", value1, value2, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeIsNull() {
            addCriterion("subscribe_time is null");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeIsNotNull() {
            addCriterion("subscribe_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeEqualTo(Date value) {
            addCriterion("subscribe_time =", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeNotEqualTo(Date value) {
            addCriterion("subscribe_time <>", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeGreaterThan(Date value) {
            addCriterion("subscribe_time >", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("subscribe_time >=", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeLessThan(Date value) {
            addCriterion("subscribe_time <", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeLessThanOrEqualTo(Date value) {
            addCriterion("subscribe_time <=", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeIn(List<Date> values) {
            addCriterion("subscribe_time in", values, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeNotIn(List<Date> values) {
            addCriterion("subscribe_time not in", values, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeBetween(Date value1, Date value2) {
            addCriterion("subscribe_time between", value1, value2, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeNotBetween(Date value1, Date value2) {
            addCriterion("subscribe_time not between", value1, value2, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardPicIsNull() {
            addCriterion("idcard_pic is null");
            return (Criteria) this;
        }

        public Criteria andIdcardPicIsNotNull() {
            addCriterion("idcard_pic is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardPicEqualTo(String value) {
            addCriterion("idcard_pic =", value, "idcardPic");
            return (Criteria) this;
        }

        public Criteria andIdcardPicNotEqualTo(String value) {
            addCriterion("idcard_pic <>", value, "idcardPic");
            return (Criteria) this;
        }

        public Criteria andIdcardPicGreaterThan(String value) {
            addCriterion("idcard_pic >", value, "idcardPic");
            return (Criteria) this;
        }

        public Criteria andIdcardPicGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_pic >=", value, "idcardPic");
            return (Criteria) this;
        }

        public Criteria andIdcardPicLessThan(String value) {
            addCriterion("idcard_pic <", value, "idcardPic");
            return (Criteria) this;
        }

        public Criteria andIdcardPicLessThanOrEqualTo(String value) {
            addCriterion("idcard_pic <=", value, "idcardPic");
            return (Criteria) this;
        }

        public Criteria andIdcardPicLike(String value) {
            addCriterion("idcard_pic like", value, "idcardPic");
            return (Criteria) this;
        }

        public Criteria andIdcardPicNotLike(String value) {
            addCriterion("idcard_pic not like", value, "idcardPic");
            return (Criteria) this;
        }

        public Criteria andIdcardPicIn(List<String> values) {
            addCriterion("idcard_pic in", values, "idcardPic");
            return (Criteria) this;
        }

        public Criteria andIdcardPicNotIn(List<String> values) {
            addCriterion("idcard_pic not in", values, "idcardPic");
            return (Criteria) this;
        }

        public Criteria andIdcardPicBetween(String value1, String value2) {
            addCriterion("idcard_pic between", value1, value2, "idcardPic");
            return (Criteria) this;
        }

        public Criteria andIdcardPicNotBetween(String value1, String value2) {
            addCriterion("idcard_pic not between", value1, value2, "idcardPic");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andIsAuthIsNull() {
            addCriterion("is_auth is null");
            return (Criteria) this;
        }

        public Criteria andIsAuthIsNotNull() {
            addCriterion("is_auth is not null");
            return (Criteria) this;
        }

        public Criteria andIsAuthEqualTo(String value) {
            addCriterion("is_auth =", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthNotEqualTo(String value) {
            addCriterion("is_auth <>", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthGreaterThan(String value) {
            addCriterion("is_auth >", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthGreaterThanOrEqualTo(String value) {
            addCriterion("is_auth >=", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthLessThan(String value) {
            addCriterion("is_auth <", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthLessThanOrEqualTo(String value) {
            addCriterion("is_auth <=", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthLike(String value) {
            addCriterion("is_auth like", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthNotLike(String value) {
            addCriterion("is_auth not like", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthIn(List<String> values) {
            addCriterion("is_auth in", values, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthNotIn(List<String> values) {
            addCriterion("is_auth not in", values, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthBetween(String value1, String value2) {
            addCriterion("is_auth between", value1, value2, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthNotBetween(String value1, String value2) {
            addCriterion("is_auth not between", value1, value2, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsFaceAuthIsNull() {
            addCriterion("is_face_auth is null");
            return (Criteria) this;
        }

        public Criteria andIsFaceAuthIsNotNull() {
            addCriterion("is_face_auth is not null");
            return (Criteria) this;
        }

        public Criteria andIsFaceAuthEqualTo(String value) {
            addCriterion("is_face_auth =", value, "isFaceAuth");
            return (Criteria) this;
        }

        public Criteria andIsFaceAuthNotEqualTo(String value) {
            addCriterion("is_face_auth <>", value, "isFaceAuth");
            return (Criteria) this;
        }

        public Criteria andIsFaceAuthGreaterThan(String value) {
            addCriterion("is_face_auth >", value, "isFaceAuth");
            return (Criteria) this;
        }

        public Criteria andIsFaceAuthGreaterThanOrEqualTo(String value) {
            addCriterion("is_face_auth >=", value, "isFaceAuth");
            return (Criteria) this;
        }

        public Criteria andIsFaceAuthLessThan(String value) {
            addCriterion("is_face_auth <", value, "isFaceAuth");
            return (Criteria) this;
        }

        public Criteria andIsFaceAuthLessThanOrEqualTo(String value) {
            addCriterion("is_face_auth <=", value, "isFaceAuth");
            return (Criteria) this;
        }

        public Criteria andIsFaceAuthLike(String value) {
            addCriterion("is_face_auth like", value, "isFaceAuth");
            return (Criteria) this;
        }

        public Criteria andIsFaceAuthNotLike(String value) {
            addCriterion("is_face_auth not like", value, "isFaceAuth");
            return (Criteria) this;
        }

        public Criteria andIsFaceAuthIn(List<String> values) {
            addCriterion("is_face_auth in", values, "isFaceAuth");
            return (Criteria) this;
        }

        public Criteria andIsFaceAuthNotIn(List<String> values) {
            addCriterion("is_face_auth not in", values, "isFaceAuth");
            return (Criteria) this;
        }

        public Criteria andIsFaceAuthBetween(String value1, String value2) {
            addCriterion("is_face_auth between", value1, value2, "isFaceAuth");
            return (Criteria) this;
        }

        public Criteria andIsFaceAuthNotBetween(String value1, String value2) {
            addCriterion("is_face_auth not between", value1, value2, "isFaceAuth");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNull() {
            addCriterion("unionid is null");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNotNull() {
            addCriterion("unionid is not null");
            return (Criteria) this;
        }

        public Criteria andUnionidEqualTo(String value) {
            addCriterion("unionid =", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotEqualTo(String value) {
            addCriterion("unionid <>", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThan(String value) {
            addCriterion("unionid >", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThanOrEqualTo(String value) {
            addCriterion("unionid >=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThan(String value) {
            addCriterion("unionid <", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThanOrEqualTo(String value) {
            addCriterion("unionid <=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLike(String value) {
            addCriterion("unionid like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotLike(String value) {
            addCriterion("unionid not like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidIn(List<String> values) {
            addCriterion("unionid in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotIn(List<String> values) {
            addCriterion("unionid not in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidBetween(String value1, String value2) {
            addCriterion("unionid between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotBetween(String value1, String value2) {
            addCriterion("unionid not between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("groupid is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("groupid is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(String value) {
            addCriterion("groupid =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(String value) {
            addCriterion("groupid <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(String value) {
            addCriterion("groupid >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(String value) {
            addCriterion("groupid >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(String value) {
            addCriterion("groupid <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(String value) {
            addCriterion("groupid <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLike(String value) {
            addCriterion("groupid like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotLike(String value) {
            addCriterion("groupid not like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<String> values) {
            addCriterion("groupid in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<String> values) {
            addCriterion("groupid not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(String value1, String value2) {
            addCriterion("groupid between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(String value1, String value2) {
            addCriterion("groupid not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andTagidListIsNull() {
            addCriterion("tagid_list is null");
            return (Criteria) this;
        }

        public Criteria andTagidListIsNotNull() {
            addCriterion("tagid_list is not null");
            return (Criteria) this;
        }

        public Criteria andTagidListEqualTo(String value) {
            addCriterion("tagid_list =", value, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListNotEqualTo(String value) {
            addCriterion("tagid_list <>", value, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListGreaterThan(String value) {
            addCriterion("tagid_list >", value, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListGreaterThanOrEqualTo(String value) {
            addCriterion("tagid_list >=", value, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListLessThan(String value) {
            addCriterion("tagid_list <", value, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListLessThanOrEqualTo(String value) {
            addCriterion("tagid_list <=", value, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListLike(String value) {
            addCriterion("tagid_list like", value, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListNotLike(String value) {
            addCriterion("tagid_list not like", value, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListIn(List<String> values) {
            addCriterion("tagid_list in", values, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListNotIn(List<String> values) {
            addCriterion("tagid_list not in", values, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListBetween(String value1, String value2) {
            addCriterion("tagid_list between", value1, value2, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListNotBetween(String value1, String value2) {
            addCriterion("tagid_list not between", value1, value2, "tagidList");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneIsNull() {
            addCriterion("subscribe_scene is null");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneIsNotNull() {
            addCriterion("subscribe_scene is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneEqualTo(String value) {
            addCriterion("subscribe_scene =", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneNotEqualTo(String value) {
            addCriterion("subscribe_scene <>", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneGreaterThan(String value) {
            addCriterion("subscribe_scene >", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneGreaterThanOrEqualTo(String value) {
            addCriterion("subscribe_scene >=", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneLessThan(String value) {
            addCriterion("subscribe_scene <", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneLessThanOrEqualTo(String value) {
            addCriterion("subscribe_scene <=", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneLike(String value) {
            addCriterion("subscribe_scene like", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneNotLike(String value) {
            addCriterion("subscribe_scene not like", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneIn(List<String> values) {
            addCriterion("subscribe_scene in", values, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneNotIn(List<String> values) {
            addCriterion("subscribe_scene not in", values, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneBetween(String value1, String value2) {
            addCriterion("subscribe_scene between", value1, value2, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneNotBetween(String value1, String value2) {
            addCriterion("subscribe_scene not between", value1, value2, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneIsNull() {
            addCriterion("qr_scene is null");
            return (Criteria) this;
        }

        public Criteria andQrSceneIsNotNull() {
            addCriterion("qr_scene is not null");
            return (Criteria) this;
        }

        public Criteria andQrSceneEqualTo(String value) {
            addCriterion("qr_scene =", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneNotEqualTo(String value) {
            addCriterion("qr_scene <>", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneGreaterThan(String value) {
            addCriterion("qr_scene >", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneGreaterThanOrEqualTo(String value) {
            addCriterion("qr_scene >=", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneLessThan(String value) {
            addCriterion("qr_scene <", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneLessThanOrEqualTo(String value) {
            addCriterion("qr_scene <=", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneLike(String value) {
            addCriterion("qr_scene like", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneNotLike(String value) {
            addCriterion("qr_scene not like", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneIn(List<String> values) {
            addCriterion("qr_scene in", values, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneNotIn(List<String> values) {
            addCriterion("qr_scene not in", values, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneBetween(String value1, String value2) {
            addCriterion("qr_scene between", value1, value2, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneNotBetween(String value1, String value2) {
            addCriterion("qr_scene not between", value1, value2, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrIsNull() {
            addCriterion("qr_scene_str is null");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrIsNotNull() {
            addCriterion("qr_scene_str is not null");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrEqualTo(String value) {
            addCriterion("qr_scene_str =", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrNotEqualTo(String value) {
            addCriterion("qr_scene_str <>", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrGreaterThan(String value) {
            addCriterion("qr_scene_str >", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrGreaterThanOrEqualTo(String value) {
            addCriterion("qr_scene_str >=", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrLessThan(String value) {
            addCriterion("qr_scene_str <", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrLessThanOrEqualTo(String value) {
            addCriterion("qr_scene_str <=", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrLike(String value) {
            addCriterion("qr_scene_str like", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrNotLike(String value) {
            addCriterion("qr_scene_str not like", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrIn(List<String> values) {
            addCriterion("qr_scene_str in", values, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrNotIn(List<String> values) {
            addCriterion("qr_scene_str not in", values, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrBetween(String value1, String value2) {
            addCriterion("qr_scene_str between", value1, value2, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrNotBetween(String value1, String value2) {
            addCriterion("qr_scene_str not between", value1, value2, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateDtIsNull() {
            addCriterion("create_dt is null");
            return (Criteria) this;
        }

        public Criteria andCreateDtIsNotNull() {
            addCriterion("create_dt is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDtEqualTo(Date value) {
            addCriterion("create_dt =", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotEqualTo(Date value) {
            addCriterion("create_dt <>", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtGreaterThan(Date value) {
            addCriterion("create_dt >", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_dt >=", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtLessThan(Date value) {
            addCriterion("create_dt <", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtLessThanOrEqualTo(Date value) {
            addCriterion("create_dt <=", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtIn(List<Date> values) {
            addCriterion("create_dt in", values, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotIn(List<Date> values) {
            addCriterion("create_dt not in", values, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtBetween(Date value1, Date value2) {
            addCriterion("create_dt between", value1, value2, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotBetween(Date value1, Date value2) {
            addCriterion("create_dt not between", value1, value2, "createDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtIsNull() {
            addCriterion("update_dt is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDtIsNotNull() {
            addCriterion("update_dt is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDtEqualTo(Date value) {
            addCriterion("update_dt =", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtNotEqualTo(Date value) {
            addCriterion("update_dt <>", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtGreaterThan(Date value) {
            addCriterion("update_dt >", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtGreaterThanOrEqualTo(Date value) {
            addCriterion("update_dt >=", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtLessThan(Date value) {
            addCriterion("update_dt <", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtLessThanOrEqualTo(Date value) {
            addCriterion("update_dt <=", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtIn(List<Date> values) {
            addCriterion("update_dt in", values, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtNotIn(List<Date> values) {
            addCriterion("update_dt not in", values, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtBetween(Date value1, Date value2) {
            addCriterion("update_dt between", value1, value2, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtNotBetween(Date value1, Date value2) {
            addCriterion("update_dt not between", value1, value2, "updateDt");
            return (Criteria) this;
        }

        public Criteria andIsUserTypeIsNull() {
            addCriterion("is_user_type is null");
            return (Criteria) this;
        }

        public Criteria andIsUserTypeIsNotNull() {
            addCriterion("is_user_type is not null");
            return (Criteria) this;
        }

        public Criteria andIsUserTypeEqualTo(Integer value) {
            addCriterion("is_user_type =", value, "isUserType");
            return (Criteria) this;
        }

        public Criteria andIsUserTypeNotEqualTo(Integer value) {
            addCriterion("is_user_type <>", value, "isUserType");
            return (Criteria) this;
        }

        public Criteria andIsUserTypeGreaterThan(Integer value) {
            addCriterion("is_user_type >", value, "isUserType");
            return (Criteria) this;
        }

        public Criteria andIsUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_user_type >=", value, "isUserType");
            return (Criteria) this;
        }

        public Criteria andIsUserTypeLessThan(Integer value) {
            addCriterion("is_user_type <", value, "isUserType");
            return (Criteria) this;
        }

        public Criteria andIsUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("is_user_type <=", value, "isUserType");
            return (Criteria) this;
        }

        public Criteria andIsUserTypeIn(List<Integer> values) {
            addCriterion("is_user_type in", values, "isUserType");
            return (Criteria) this;
        }

        public Criteria andIsUserTypeNotIn(List<Integer> values) {
            addCriterion("is_user_type not in", values, "isUserType");
            return (Criteria) this;
        }

        public Criteria andIsUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("is_user_type between", value1, value2, "isUserType");
            return (Criteria) this;
        }

        public Criteria andIsUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_user_type not between", value1, value2, "isUserType");
            return (Criteria) this;
        }

        public Criteria andUserIsSupportStageIsNull() {
            addCriterion("user_is_support_Stage is null");
            return (Criteria) this;
        }

        public Criteria andUserIsSupportStageIsNotNull() {
            addCriterion("user_is_support_Stage is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsSupportStageEqualTo(Integer value) {
            addCriterion("user_is_support_Stage =", value, "userIsSupportStage");
            return (Criteria) this;
        }

        public Criteria andUserIsSupportStageNotEqualTo(Integer value) {
            addCriterion("user_is_support_Stage <>", value, "userIsSupportStage");
            return (Criteria) this;
        }

        public Criteria andUserIsSupportStageGreaterThan(Integer value) {
            addCriterion("user_is_support_Stage >", value, "userIsSupportStage");
            return (Criteria) this;
        }

        public Criteria andUserIsSupportStageGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_is_support_Stage >=", value, "userIsSupportStage");
            return (Criteria) this;
        }

        public Criteria andUserIsSupportStageLessThan(Integer value) {
            addCriterion("user_is_support_Stage <", value, "userIsSupportStage");
            return (Criteria) this;
        }

        public Criteria andUserIsSupportStageLessThanOrEqualTo(Integer value) {
            addCriterion("user_is_support_Stage <=", value, "userIsSupportStage");
            return (Criteria) this;
        }

        public Criteria andUserIsSupportStageIn(List<Integer> values) {
            addCriterion("user_is_support_Stage in", values, "userIsSupportStage");
            return (Criteria) this;
        }

        public Criteria andUserIsSupportStageNotIn(List<Integer> values) {
            addCriterion("user_is_support_Stage not in", values, "userIsSupportStage");
            return (Criteria) this;
        }

        public Criteria andUserIsSupportStageBetween(Integer value1, Integer value2) {
            addCriterion("user_is_support_Stage between", value1, value2, "userIsSupportStage");
            return (Criteria) this;
        }

        public Criteria andUserIsSupportStageNotBetween(Integer value1, Integer value2) {
            addCriterion("user_is_support_Stage not between", value1, value2, "userIsSupportStage");
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