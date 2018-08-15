package com.xyb.shop.model.xyb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AwardInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AwardInfoExample() {
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

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdIsNull() {
            addCriterion("prize_id is null");
            return (Criteria) this;
        }

        public Criteria andPrizeIdIsNotNull() {
            addCriterion("prize_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeIdEqualTo(Long value) {
            addCriterion("prize_id =", value, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdNotEqualTo(Long value) {
            addCriterion("prize_id <>", value, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdGreaterThan(Long value) {
            addCriterion("prize_id >", value, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("prize_id >=", value, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdLessThan(Long value) {
            addCriterion("prize_id <", value, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdLessThanOrEqualTo(Long value) {
            addCriterion("prize_id <=", value, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdIn(List<Long> values) {
            addCriterion("prize_id in", values, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdNotIn(List<Long> values) {
            addCriterion("prize_id not in", values, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdBetween(Long value1, Long value2) {
            addCriterion("prize_id between", value1, value2, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdNotBetween(Long value1, Long value2) {
            addCriterion("prize_id not between", value1, value2, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeCategoryIsNull() {
            addCriterion("prize_category is null");
            return (Criteria) this;
        }

        public Criteria andPrizeCategoryIsNotNull() {
            addCriterion("prize_category is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeCategoryEqualTo(Integer value) {
            addCriterion("prize_category =", value, "prizeCategory");
            return (Criteria) this;
        }

        public Criteria andPrizeCategoryNotEqualTo(Integer value) {
            addCriterion("prize_category <>", value, "prizeCategory");
            return (Criteria) this;
        }

        public Criteria andPrizeCategoryGreaterThan(Integer value) {
            addCriterion("prize_category >", value, "prizeCategory");
            return (Criteria) this;
        }

        public Criteria andPrizeCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("prize_category >=", value, "prizeCategory");
            return (Criteria) this;
        }

        public Criteria andPrizeCategoryLessThan(Integer value) {
            addCriterion("prize_category <", value, "prizeCategory");
            return (Criteria) this;
        }

        public Criteria andPrizeCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("prize_category <=", value, "prizeCategory");
            return (Criteria) this;
        }

        public Criteria andPrizeCategoryIn(List<Integer> values) {
            addCriterion("prize_category in", values, "prizeCategory");
            return (Criteria) this;
        }

        public Criteria andPrizeCategoryNotIn(List<Integer> values) {
            addCriterion("prize_category not in", values, "prizeCategory");
            return (Criteria) this;
        }

        public Criteria andPrizeCategoryBetween(Integer value1, Integer value2) {
            addCriterion("prize_category between", value1, value2, "prizeCategory");
            return (Criteria) this;
        }

        public Criteria andPrizeCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("prize_category not between", value1, value2, "prizeCategory");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberIsNull() {
            addCriterion("prize_number is null");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberIsNotNull() {
            addCriterion("prize_number is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberEqualTo(Integer value) {
            addCriterion("prize_number =", value, "prizeNumber");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberNotEqualTo(Integer value) {
            addCriterion("prize_number <>", value, "prizeNumber");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberGreaterThan(Integer value) {
            addCriterion("prize_number >", value, "prizeNumber");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("prize_number >=", value, "prizeNumber");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberLessThan(Integer value) {
            addCriterion("prize_number <", value, "prizeNumber");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("prize_number <=", value, "prizeNumber");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberIn(List<Integer> values) {
            addCriterion("prize_number in", values, "prizeNumber");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberNotIn(List<Integer> values) {
            addCriterion("prize_number not in", values, "prizeNumber");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberBetween(Integer value1, Integer value2) {
            addCriterion("prize_number between", value1, value2, "prizeNumber");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("prize_number not between", value1, value2, "prizeNumber");
            return (Criteria) this;
        }

        public Criteria andRefNoIsNull() {
            addCriterion("ref_no is null");
            return (Criteria) this;
        }

        public Criteria andRefNoIsNotNull() {
            addCriterion("ref_no is not null");
            return (Criteria) this;
        }

        public Criteria andRefNoEqualTo(String value) {
            addCriterion("ref_no =", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoNotEqualTo(String value) {
            addCriterion("ref_no <>", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoGreaterThan(String value) {
            addCriterion("ref_no >", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoGreaterThanOrEqualTo(String value) {
            addCriterion("ref_no >=", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoLessThan(String value) {
            addCriterion("ref_no <", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoLessThanOrEqualTo(String value) {
            addCriterion("ref_no <=", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoLike(String value) {
            addCriterion("ref_no like", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoNotLike(String value) {
            addCriterion("ref_no not like", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoIn(List<String> values) {
            addCriterion("ref_no in", values, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoNotIn(List<String> values) {
            addCriterion("ref_no not in", values, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoBetween(String value1, String value2) {
            addCriterion("ref_no between", value1, value2, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoNotBetween(String value1, String value2) {
            addCriterion("ref_no not between", value1, value2, "refNo");
            return (Criteria) this;
        }

        public Criteria andPrizePicIsNull() {
            addCriterion("prize_pic is null");
            return (Criteria) this;
        }

        public Criteria andPrizePicIsNotNull() {
            addCriterion("prize_pic is not null");
            return (Criteria) this;
        }

        public Criteria andPrizePicEqualTo(String value) {
            addCriterion("prize_pic =", value, "prizePic");
            return (Criteria) this;
        }

        public Criteria andPrizePicNotEqualTo(String value) {
            addCriterion("prize_pic <>", value, "prizePic");
            return (Criteria) this;
        }

        public Criteria andPrizePicGreaterThan(String value) {
            addCriterion("prize_pic >", value, "prizePic");
            return (Criteria) this;
        }

        public Criteria andPrizePicGreaterThanOrEqualTo(String value) {
            addCriterion("prize_pic >=", value, "prizePic");
            return (Criteria) this;
        }

        public Criteria andPrizePicLessThan(String value) {
            addCriterion("prize_pic <", value, "prizePic");
            return (Criteria) this;
        }

        public Criteria andPrizePicLessThanOrEqualTo(String value) {
            addCriterion("prize_pic <=", value, "prizePic");
            return (Criteria) this;
        }

        public Criteria andPrizePicLike(String value) {
            addCriterion("prize_pic like", value, "prizePic");
            return (Criteria) this;
        }

        public Criteria andPrizePicNotLike(String value) {
            addCriterion("prize_pic not like", value, "prizePic");
            return (Criteria) this;
        }

        public Criteria andPrizePicIn(List<String> values) {
            addCriterion("prize_pic in", values, "prizePic");
            return (Criteria) this;
        }

        public Criteria andPrizePicNotIn(List<String> values) {
            addCriterion("prize_pic not in", values, "prizePic");
            return (Criteria) this;
        }

        public Criteria andPrizePicBetween(String value1, String value2) {
            addCriterion("prize_pic between", value1, value2, "prizePic");
            return (Criteria) this;
        }

        public Criteria andPrizePicNotBetween(String value1, String value2) {
            addCriterion("prize_pic not between", value1, value2, "prizePic");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIsNull() {
            addCriterion("prize_name is null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIsNotNull() {
            addCriterion("prize_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameEqualTo(String value) {
            addCriterion("prize_name =", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotEqualTo(String value) {
            addCriterion("prize_name <>", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThan(String value) {
            addCriterion("prize_name >", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("prize_name >=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThan(String value) {
            addCriterion("prize_name <", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThanOrEqualTo(String value) {
            addCriterion("prize_name <=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLike(String value) {
            addCriterion("prize_name like", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotLike(String value) {
            addCriterion("prize_name not like", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIn(List<String> values) {
            addCriterion("prize_name in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotIn(List<String> values) {
            addCriterion("prize_name not in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameBetween(String value1, String value2) {
            addCriterion("prize_name between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotBetween(String value1, String value2) {
            addCriterion("prize_name not between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andPrizeForActivityIsNull() {
            addCriterion("prize_for_activity is null");
            return (Criteria) this;
        }

        public Criteria andPrizeForActivityIsNotNull() {
            addCriterion("prize_for_activity is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeForActivityEqualTo(Integer value) {
            addCriterion("prize_for_activity =", value, "prizeForActivity");
            return (Criteria) this;
        }

        public Criteria andPrizeForActivityNotEqualTo(Integer value) {
            addCriterion("prize_for_activity <>", value, "prizeForActivity");
            return (Criteria) this;
        }

        public Criteria andPrizeForActivityGreaterThan(Integer value) {
            addCriterion("prize_for_activity >", value, "prizeForActivity");
            return (Criteria) this;
        }

        public Criteria andPrizeForActivityGreaterThanOrEqualTo(Integer value) {
            addCriterion("prize_for_activity >=", value, "prizeForActivity");
            return (Criteria) this;
        }

        public Criteria andPrizeForActivityLessThan(Integer value) {
            addCriterion("prize_for_activity <", value, "prizeForActivity");
            return (Criteria) this;
        }

        public Criteria andPrizeForActivityLessThanOrEqualTo(Integer value) {
            addCriterion("prize_for_activity <=", value, "prizeForActivity");
            return (Criteria) this;
        }

        public Criteria andPrizeForActivityIn(List<Integer> values) {
            addCriterion("prize_for_activity in", values, "prizeForActivity");
            return (Criteria) this;
        }

        public Criteria andPrizeForActivityNotIn(List<Integer> values) {
            addCriterion("prize_for_activity not in", values, "prizeForActivity");
            return (Criteria) this;
        }

        public Criteria andPrizeForActivityBetween(Integer value1, Integer value2) {
            addCriterion("prize_for_activity between", value1, value2, "prizeForActivity");
            return (Criteria) this;
        }

        public Criteria andPrizeForActivityNotBetween(Integer value1, Integer value2) {
            addCriterion("prize_for_activity not between", value1, value2, "prizeForActivity");
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