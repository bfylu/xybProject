package com.xyb.shop.model.xyb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTreasureBoxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTreasureBoxExample() {
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

        public Criteria andBoxNoIsNull() {
            addCriterion("box_no is null");
            return (Criteria) this;
        }

        public Criteria andBoxNoIsNotNull() {
            addCriterion("box_no is not null");
            return (Criteria) this;
        }

        public Criteria andBoxNoEqualTo(String value) {
            addCriterion("box_no =", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoNotEqualTo(String value) {
            addCriterion("box_no <>", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoGreaterThan(String value) {
            addCriterion("box_no >", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoGreaterThanOrEqualTo(String value) {
            addCriterion("box_no >=", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoLessThan(String value) {
            addCriterion("box_no <", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoLessThanOrEqualTo(String value) {
            addCriterion("box_no <=", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoLike(String value) {
            addCriterion("box_no like", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoNotLike(String value) {
            addCriterion("box_no not like", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoIn(List<String> values) {
            addCriterion("box_no in", values, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoNotIn(List<String> values) {
            addCriterion("box_no not in", values, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoBetween(String value1, String value2) {
            addCriterion("box_no between", value1, value2, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoNotBetween(String value1, String value2) {
            addCriterion("box_no not between", value1, value2, "boxNo");
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

        public Criteria andBoxStateIsNull() {
            addCriterion("box_state is null");
            return (Criteria) this;
        }

        public Criteria andBoxStateIsNotNull() {
            addCriterion("box_state is not null");
            return (Criteria) this;
        }

        public Criteria andBoxStateEqualTo(Integer value) {
            addCriterion("box_state =", value, "boxState");
            return (Criteria) this;
        }

        public Criteria andBoxStateNotEqualTo(Integer value) {
            addCriterion("box_state <>", value, "boxState");
            return (Criteria) this;
        }

        public Criteria andBoxStateGreaterThan(Integer value) {
            addCriterion("box_state >", value, "boxState");
            return (Criteria) this;
        }

        public Criteria andBoxStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("box_state >=", value, "boxState");
            return (Criteria) this;
        }

        public Criteria andBoxStateLessThan(Integer value) {
            addCriterion("box_state <", value, "boxState");
            return (Criteria) this;
        }

        public Criteria andBoxStateLessThanOrEqualTo(Integer value) {
            addCriterion("box_state <=", value, "boxState");
            return (Criteria) this;
        }

        public Criteria andBoxStateIn(List<Integer> values) {
            addCriterion("box_state in", values, "boxState");
            return (Criteria) this;
        }

        public Criteria andBoxStateNotIn(List<Integer> values) {
            addCriterion("box_state not in", values, "boxState");
            return (Criteria) this;
        }

        public Criteria andBoxStateBetween(Integer value1, Integer value2) {
            addCriterion("box_state between", value1, value2, "boxState");
            return (Criteria) this;
        }

        public Criteria andBoxStateNotBetween(Integer value1, Integer value2) {
            addCriterion("box_state not between", value1, value2, "boxState");
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

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andClickNumberIsNull() {
            addCriterion("click_number is null");
            return (Criteria) this;
        }

        public Criteria andClickNumberIsNotNull() {
            addCriterion("click_number is not null");
            return (Criteria) this;
        }

        public Criteria andClickNumberEqualTo(Integer value) {
            addCriterion("click_number =", value, "clickNumber");
            return (Criteria) this;
        }

        public Criteria andClickNumberNotEqualTo(Integer value) {
            addCriterion("click_number <>", value, "clickNumber");
            return (Criteria) this;
        }

        public Criteria andClickNumberGreaterThan(Integer value) {
            addCriterion("click_number >", value, "clickNumber");
            return (Criteria) this;
        }

        public Criteria andClickNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("click_number >=", value, "clickNumber");
            return (Criteria) this;
        }

        public Criteria andClickNumberLessThan(Integer value) {
            addCriterion("click_number <", value, "clickNumber");
            return (Criteria) this;
        }

        public Criteria andClickNumberLessThanOrEqualTo(Integer value) {
            addCriterion("click_number <=", value, "clickNumber");
            return (Criteria) this;
        }

        public Criteria andClickNumberIn(List<Integer> values) {
            addCriterion("click_number in", values, "clickNumber");
            return (Criteria) this;
        }

        public Criteria andClickNumberNotIn(List<Integer> values) {
            addCriterion("click_number not in", values, "clickNumber");
            return (Criteria) this;
        }

        public Criteria andClickNumberBetween(Integer value1, Integer value2) {
            addCriterion("click_number between", value1, value2, "clickNumber");
            return (Criteria) this;
        }

        public Criteria andClickNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("click_number not between", value1, value2, "clickNumber");
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

        public Criteria andGetSocreNumberIsNull() {
            addCriterion("get_socre_number is null");
            return (Criteria) this;
        }

        public Criteria andGetSocreNumberIsNotNull() {
            addCriterion("get_socre_number is not null");
            return (Criteria) this;
        }

        public Criteria andGetSocreNumberEqualTo(Integer value) {
            addCriterion("get_socre_number =", value, "getSocreNumber");
            return (Criteria) this;
        }

        public Criteria andGetSocreNumberNotEqualTo(Integer value) {
            addCriterion("get_socre_number <>", value, "getSocreNumber");
            return (Criteria) this;
        }

        public Criteria andGetSocreNumberGreaterThan(Integer value) {
            addCriterion("get_socre_number >", value, "getSocreNumber");
            return (Criteria) this;
        }

        public Criteria andGetSocreNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("get_socre_number >=", value, "getSocreNumber");
            return (Criteria) this;
        }

        public Criteria andGetSocreNumberLessThan(Integer value) {
            addCriterion("get_socre_number <", value, "getSocreNumber");
            return (Criteria) this;
        }

        public Criteria andGetSocreNumberLessThanOrEqualTo(Integer value) {
            addCriterion("get_socre_number <=", value, "getSocreNumber");
            return (Criteria) this;
        }

        public Criteria andGetSocreNumberIn(List<Integer> values) {
            addCriterion("get_socre_number in", values, "getSocreNumber");
            return (Criteria) this;
        }

        public Criteria andGetSocreNumberNotIn(List<Integer> values) {
            addCriterion("get_socre_number not in", values, "getSocreNumber");
            return (Criteria) this;
        }

        public Criteria andGetSocreNumberBetween(Integer value1, Integer value2) {
            addCriterion("get_socre_number between", value1, value2, "getSocreNumber");
            return (Criteria) this;
        }

        public Criteria andGetSocreNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("get_socre_number not between", value1, value2, "getSocreNumber");
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