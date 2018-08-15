package com.xyb.shop.model.xyb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppLoginKeyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppLoginKeyExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMerCodeIsNull() {
            addCriterion("mer_code is null");
            return (Criteria) this;
        }

        public Criteria andMerCodeIsNotNull() {
            addCriterion("mer_code is not null");
            return (Criteria) this;
        }

        public Criteria andMerCodeEqualTo(String value) {
            addCriterion("mer_code =", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeNotEqualTo(String value) {
            addCriterion("mer_code <>", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeGreaterThan(String value) {
            addCriterion("mer_code >", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("mer_code >=", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeLessThan(String value) {
            addCriterion("mer_code <", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeLessThanOrEqualTo(String value) {
            addCriterion("mer_code <=", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeLike(String value) {
            addCriterion("mer_code like", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeNotLike(String value) {
            addCriterion("mer_code not like", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeIn(List<String> values) {
            addCriterion("mer_code in", values, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeNotIn(List<String> values) {
            addCriterion("mer_code not in", values, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeBetween(String value1, String value2) {
            addCriterion("mer_code between", value1, value2, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeNotBetween(String value1, String value2) {
            addCriterion("mer_code not between", value1, value2, "merCode");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andSessionTokenIsNull() {
            addCriterion("session_token is null");
            return (Criteria) this;
        }

        public Criteria andSessionTokenIsNotNull() {
            addCriterion("session_token is not null");
            return (Criteria) this;
        }

        public Criteria andSessionTokenEqualTo(String value) {
            addCriterion("session_token =", value, "sessionToken");
            return (Criteria) this;
        }

        public Criteria andSessionTokenNotEqualTo(String value) {
            addCriterion("session_token <>", value, "sessionToken");
            return (Criteria) this;
        }

        public Criteria andSessionTokenGreaterThan(String value) {
            addCriterion("session_token >", value, "sessionToken");
            return (Criteria) this;
        }

        public Criteria andSessionTokenGreaterThanOrEqualTo(String value) {
            addCriterion("session_token >=", value, "sessionToken");
            return (Criteria) this;
        }

        public Criteria andSessionTokenLessThan(String value) {
            addCriterion("session_token <", value, "sessionToken");
            return (Criteria) this;
        }

        public Criteria andSessionTokenLessThanOrEqualTo(String value) {
            addCriterion("session_token <=", value, "sessionToken");
            return (Criteria) this;
        }

        public Criteria andSessionTokenLike(String value) {
            addCriterion("session_token like", value, "sessionToken");
            return (Criteria) this;
        }

        public Criteria andSessionTokenNotLike(String value) {
            addCriterion("session_token not like", value, "sessionToken");
            return (Criteria) this;
        }

        public Criteria andSessionTokenIn(List<String> values) {
            addCriterion("session_token in", values, "sessionToken");
            return (Criteria) this;
        }

        public Criteria andSessionTokenNotIn(List<String> values) {
            addCriterion("session_token not in", values, "sessionToken");
            return (Criteria) this;
        }

        public Criteria andSessionTokenBetween(String value1, String value2) {
            addCriterion("session_token between", value1, value2, "sessionToken");
            return (Criteria) this;
        }

        public Criteria andSessionTokenNotBetween(String value1, String value2) {
            addCriterion("session_token not between", value1, value2, "sessionToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenIsNull() {
            addCriterion("login_token is null");
            return (Criteria) this;
        }

        public Criteria andLoginTokenIsNotNull() {
            addCriterion("login_token is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTokenEqualTo(String value) {
            addCriterion("login_token =", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenNotEqualTo(String value) {
            addCriterion("login_token <>", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenGreaterThan(String value) {
            addCriterion("login_token >", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenGreaterThanOrEqualTo(String value) {
            addCriterion("login_token >=", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenLessThan(String value) {
            addCriterion("login_token <", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenLessThanOrEqualTo(String value) {
            addCriterion("login_token <=", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenLike(String value) {
            addCriterion("login_token like", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenNotLike(String value) {
            addCriterion("login_token not like", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenIn(List<String> values) {
            addCriterion("login_token in", values, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenNotIn(List<String> values) {
            addCriterion("login_token not in", values, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenBetween(String value1, String value2) {
            addCriterion("login_token between", value1, value2, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenNotBetween(String value1, String value2) {
            addCriterion("login_token not between", value1, value2, "loginToken");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber1IsNull() {
            addCriterion("phone_number1 is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber1IsNotNull() {
            addCriterion("phone_number1 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber1EqualTo(String value) {
            addCriterion("phone_number1 =", value, "phoneNumber1");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber1NotEqualTo(String value) {
            addCriterion("phone_number1 <>", value, "phoneNumber1");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber1GreaterThan(String value) {
            addCriterion("phone_number1 >", value, "phoneNumber1");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber1GreaterThanOrEqualTo(String value) {
            addCriterion("phone_number1 >=", value, "phoneNumber1");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber1LessThan(String value) {
            addCriterion("phone_number1 <", value, "phoneNumber1");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber1LessThanOrEqualTo(String value) {
            addCriterion("phone_number1 <=", value, "phoneNumber1");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber1Like(String value) {
            addCriterion("phone_number1 like", value, "phoneNumber1");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber1NotLike(String value) {
            addCriterion("phone_number1 not like", value, "phoneNumber1");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber1In(List<String> values) {
            addCriterion("phone_number1 in", values, "phoneNumber1");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber1NotIn(List<String> values) {
            addCriterion("phone_number1 not in", values, "phoneNumber1");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber1Between(String value1, String value2) {
            addCriterion("phone_number1 between", value1, value2, "phoneNumber1");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber1NotBetween(String value1, String value2) {
            addCriterion("phone_number1 not between", value1, value2, "phoneNumber1");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber2IsNull() {
            addCriterion("phone_number2 is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber2IsNotNull() {
            addCriterion("phone_number2 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber2EqualTo(String value) {
            addCriterion("phone_number2 =", value, "phoneNumber2");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber2NotEqualTo(String value) {
            addCriterion("phone_number2 <>", value, "phoneNumber2");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber2GreaterThan(String value) {
            addCriterion("phone_number2 >", value, "phoneNumber2");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber2GreaterThanOrEqualTo(String value) {
            addCriterion("phone_number2 >=", value, "phoneNumber2");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber2LessThan(String value) {
            addCriterion("phone_number2 <", value, "phoneNumber2");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber2LessThanOrEqualTo(String value) {
            addCriterion("phone_number2 <=", value, "phoneNumber2");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber2Like(String value) {
            addCriterion("phone_number2 like", value, "phoneNumber2");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber2NotLike(String value) {
            addCriterion("phone_number2 not like", value, "phoneNumber2");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber2In(List<String> values) {
            addCriterion("phone_number2 in", values, "phoneNumber2");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber2NotIn(List<String> values) {
            addCriterion("phone_number2 not in", values, "phoneNumber2");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber2Between(String value1, String value2) {
            addCriterion("phone_number2 between", value1, value2, "phoneNumber2");
            return (Criteria) this;
        }

        public Criteria andPhoneNumber2NotBetween(String value1, String value2) {
            addCriterion("phone_number2 not between", value1, value2, "phoneNumber2");
            return (Criteria) this;
        }

        public Criteria andAppKeyIsNull() {
            addCriterion("app_key is null");
            return (Criteria) this;
        }

        public Criteria andAppKeyIsNotNull() {
            addCriterion("app_key is not null");
            return (Criteria) this;
        }

        public Criteria andAppKeyEqualTo(String value) {
            addCriterion("app_key =", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotEqualTo(String value) {
            addCriterion("app_key <>", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyGreaterThan(String value) {
            addCriterion("app_key >", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyGreaterThanOrEqualTo(String value) {
            addCriterion("app_key >=", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLessThan(String value) {
            addCriterion("app_key <", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLessThanOrEqualTo(String value) {
            addCriterion("app_key <=", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLike(String value) {
            addCriterion("app_key like", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotLike(String value) {
            addCriterion("app_key not like", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyIn(List<String> values) {
            addCriterion("app_key in", values, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotIn(List<String> values) {
            addCriterion("app_key not in", values, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyBetween(String value1, String value2) {
            addCriterion("app_key between", value1, value2, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotBetween(String value1, String value2) {
            addCriterion("app_key not between", value1, value2, "appKey");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIsNull() {
            addCriterion("system_type is null");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIsNotNull() {
            addCriterion("system_type is not null");
            return (Criteria) this;
        }

        public Criteria andSystemTypeEqualTo(String value) {
            addCriterion("system_type =", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotEqualTo(String value) {
            addCriterion("system_type <>", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeGreaterThan(String value) {
            addCriterion("system_type >", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("system_type >=", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLessThan(String value) {
            addCriterion("system_type <", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLessThanOrEqualTo(String value) {
            addCriterion("system_type <=", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLike(String value) {
            addCriterion("system_type like", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotLike(String value) {
            addCriterion("system_type not like", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIn(List<String> values) {
            addCriterion("system_type in", values, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotIn(List<String> values) {
            addCriterion("system_type not in", values, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeBetween(String value1, String value2) {
            addCriterion("system_type between", value1, value2, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotBetween(String value1, String value2) {
            addCriterion("system_type not between", value1, value2, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNameIsNull() {
            addCriterion("system_version_name is null");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNameIsNotNull() {
            addCriterion("system_version_name is not null");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNameEqualTo(String value) {
            addCriterion("system_version_name =", value, "systemVersionName");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNameNotEqualTo(String value) {
            addCriterion("system_version_name <>", value, "systemVersionName");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNameGreaterThan(String value) {
            addCriterion("system_version_name >", value, "systemVersionName");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNameGreaterThanOrEqualTo(String value) {
            addCriterion("system_version_name >=", value, "systemVersionName");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNameLessThan(String value) {
            addCriterion("system_version_name <", value, "systemVersionName");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNameLessThanOrEqualTo(String value) {
            addCriterion("system_version_name <=", value, "systemVersionName");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNameLike(String value) {
            addCriterion("system_version_name like", value, "systemVersionName");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNameNotLike(String value) {
            addCriterion("system_version_name not like", value, "systemVersionName");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNameIn(List<String> values) {
            addCriterion("system_version_name in", values, "systemVersionName");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNameNotIn(List<String> values) {
            addCriterion("system_version_name not in", values, "systemVersionName");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNameBetween(String value1, String value2) {
            addCriterion("system_version_name between", value1, value2, "systemVersionName");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNameNotBetween(String value1, String value2) {
            addCriterion("system_version_name not between", value1, value2, "systemVersionName");
            return (Criteria) this;
        }

        public Criteria andSystemVersionCodeIsNull() {
            addCriterion("system_version_code is null");
            return (Criteria) this;
        }

        public Criteria andSystemVersionCodeIsNotNull() {
            addCriterion("system_version_code is not null");
            return (Criteria) this;
        }

        public Criteria andSystemVersionCodeEqualTo(Integer value) {
            addCriterion("system_version_code =", value, "systemVersionCode");
            return (Criteria) this;
        }

        public Criteria andSystemVersionCodeNotEqualTo(Integer value) {
            addCriterion("system_version_code <>", value, "systemVersionCode");
            return (Criteria) this;
        }

        public Criteria andSystemVersionCodeGreaterThan(Integer value) {
            addCriterion("system_version_code >", value, "systemVersionCode");
            return (Criteria) this;
        }

        public Criteria andSystemVersionCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("system_version_code >=", value, "systemVersionCode");
            return (Criteria) this;
        }

        public Criteria andSystemVersionCodeLessThan(Integer value) {
            addCriterion("system_version_code <", value, "systemVersionCode");
            return (Criteria) this;
        }

        public Criteria andSystemVersionCodeLessThanOrEqualTo(Integer value) {
            addCriterion("system_version_code <=", value, "systemVersionCode");
            return (Criteria) this;
        }

        public Criteria andSystemVersionCodeIn(List<Integer> values) {
            addCriterion("system_version_code in", values, "systemVersionCode");
            return (Criteria) this;
        }

        public Criteria andSystemVersionCodeNotIn(List<Integer> values) {
            addCriterion("system_version_code not in", values, "systemVersionCode");
            return (Criteria) this;
        }

        public Criteria andSystemVersionCodeBetween(Integer value1, Integer value2) {
            addCriterion("system_version_code between", value1, value2, "systemVersionCode");
            return (Criteria) this;
        }

        public Criteria andSystemVersionCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("system_version_code not between", value1, value2, "systemVersionCode");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNull() {
            addCriterion("terminal_type is null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNotNull() {
            addCriterion("terminal_type is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeEqualTo(String value) {
            addCriterion("terminal_type =", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotEqualTo(String value) {
            addCriterion("terminal_type <>", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThan(String value) {
            addCriterion("terminal_type >", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("terminal_type >=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThan(String value) {
            addCriterion("terminal_type <", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThanOrEqualTo(String value) {
            addCriterion("terminal_type <=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLike(String value) {
            addCriterion("terminal_type like", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotLike(String value) {
            addCriterion("terminal_type not like", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIn(List<String> values) {
            addCriterion("terminal_type in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotIn(List<String> values) {
            addCriterion("terminal_type not in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeBetween(String value1, String value2) {
            addCriterion("terminal_type between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotBetween(String value1, String value2) {
            addCriterion("terminal_type not between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalNoIsNull() {
            addCriterion("terminal_no is null");
            return (Criteria) this;
        }

        public Criteria andTerminalNoIsNotNull() {
            addCriterion("terminal_no is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalNoEqualTo(String value) {
            addCriterion("terminal_no =", value, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoNotEqualTo(String value) {
            addCriterion("terminal_no <>", value, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoGreaterThan(String value) {
            addCriterion("terminal_no >", value, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoGreaterThanOrEqualTo(String value) {
            addCriterion("terminal_no >=", value, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoLessThan(String value) {
            addCriterion("terminal_no <", value, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoLessThanOrEqualTo(String value) {
            addCriterion("terminal_no <=", value, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoLike(String value) {
            addCriterion("terminal_no like", value, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoNotLike(String value) {
            addCriterion("terminal_no not like", value, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoIn(List<String> values) {
            addCriterion("terminal_no in", values, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoNotIn(List<String> values) {
            addCriterion("terminal_no not in", values, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoBetween(String value1, String value2) {
            addCriterion("terminal_no between", value1, value2, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoNotBetween(String value1, String value2) {
            addCriterion("terminal_no not between", value1, value2, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("imei is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("imei is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("imei =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("imei <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("imei >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("imei >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("imei <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("imei <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("imei like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("imei not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("imei in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("imei not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("imei between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("imei not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("expire_time is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(Date value) {
            addCriterion("expire_time =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(Date value) {
            addCriterion("expire_time <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(Date value) {
            addCriterion("expire_time >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expire_time >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(Date value) {
            addCriterion("expire_time <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("expire_time <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<Date> values) {
            addCriterion("expire_time in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<Date> values) {
            addCriterion("expire_time not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(Date value1, Date value2) {
            addCriterion("expire_time between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("expire_time not between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andExt1IsNull() {
            addCriterion("ext1 is null");
            return (Criteria) this;
        }

        public Criteria andExt1IsNotNull() {
            addCriterion("ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andExt1EqualTo(String value) {
            addCriterion("ext1 =", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotEqualTo(String value) {
            addCriterion("ext1 <>", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThan(String value) {
            addCriterion("ext1 >", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThanOrEqualTo(String value) {
            addCriterion("ext1 >=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThan(String value) {
            addCriterion("ext1 <", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThanOrEqualTo(String value) {
            addCriterion("ext1 <=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Like(String value) {
            addCriterion("ext1 like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotLike(String value) {
            addCriterion("ext1 not like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1In(List<String> values) {
            addCriterion("ext1 in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotIn(List<String> values) {
            addCriterion("ext1 not in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Between(String value1, String value2) {
            addCriterion("ext1 between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotBetween(String value1, String value2) {
            addCriterion("ext1 not between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt2IsNull() {
            addCriterion("ext2 is null");
            return (Criteria) this;
        }

        public Criteria andExt2IsNotNull() {
            addCriterion("ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andExt2EqualTo(String value) {
            addCriterion("ext2 =", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotEqualTo(String value) {
            addCriterion("ext2 <>", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThan(String value) {
            addCriterion("ext2 >", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThanOrEqualTo(String value) {
            addCriterion("ext2 >=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThan(String value) {
            addCriterion("ext2 <", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThanOrEqualTo(String value) {
            addCriterion("ext2 <=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Like(String value) {
            addCriterion("ext2 like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotLike(String value) {
            addCriterion("ext2 not like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2In(List<String> values) {
            addCriterion("ext2 in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotIn(List<String> values) {
            addCriterion("ext2 not in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Between(String value1, String value2) {
            addCriterion("ext2 between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotBetween(String value1, String value2) {
            addCriterion("ext2 not between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt3IsNull() {
            addCriterion("ext3 is null");
            return (Criteria) this;
        }

        public Criteria andExt3IsNotNull() {
            addCriterion("ext3 is not null");
            return (Criteria) this;
        }

        public Criteria andExt3EqualTo(String value) {
            addCriterion("ext3 =", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotEqualTo(String value) {
            addCriterion("ext3 <>", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThan(String value) {
            addCriterion("ext3 >", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThanOrEqualTo(String value) {
            addCriterion("ext3 >=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThan(String value) {
            addCriterion("ext3 <", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThanOrEqualTo(String value) {
            addCriterion("ext3 <=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Like(String value) {
            addCriterion("ext3 like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotLike(String value) {
            addCriterion("ext3 not like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3In(List<String> values) {
            addCriterion("ext3 in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotIn(List<String> values) {
            addCriterion("ext3 not in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Between(String value1, String value2) {
            addCriterion("ext3 between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotBetween(String value1, String value2) {
            addCriterion("ext3 not between", value1, value2, "ext3");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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