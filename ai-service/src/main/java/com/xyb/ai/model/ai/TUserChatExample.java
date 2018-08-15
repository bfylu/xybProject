package com.xyb.ai.model.ai;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserChatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserChatExample() {
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

        public Criteria andBuyUserIdIsNull() {
            addCriterion("buy_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdIsNotNull() {
            addCriterion("buy_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdEqualTo(String value) {
            addCriterion("buy_user_id =", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdNotEqualTo(String value) {
            addCriterion("buy_user_id <>", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdGreaterThan(String value) {
            addCriterion("buy_user_id >", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("buy_user_id >=", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdLessThan(String value) {
            addCriterion("buy_user_id <", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdLessThanOrEqualTo(String value) {
            addCriterion("buy_user_id <=", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdLike(String value) {
            addCriterion("buy_user_id like", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdNotLike(String value) {
            addCriterion("buy_user_id not like", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdIn(List<String> values) {
            addCriterion("buy_user_id in", values, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdNotIn(List<String> values) {
            addCriterion("buy_user_id not in", values, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdBetween(String value1, String value2) {
            addCriterion("buy_user_id between", value1, value2, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdNotBetween(String value1, String value2) {
            addCriterion("buy_user_id not between", value1, value2, "buyUserId");
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

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andChatTimeIsNull() {
            addCriterion("chat_time is null");
            return (Criteria) this;
        }

        public Criteria andChatTimeIsNotNull() {
            addCriterion("chat_time is not null");
            return (Criteria) this;
        }

        public Criteria andChatTimeEqualTo(Date value) {
            addCriterion("chat_time =", value, "chatTime");
            return (Criteria) this;
        }

        public Criteria andChatTimeNotEqualTo(Date value) {
            addCriterion("chat_time <>", value, "chatTime");
            return (Criteria) this;
        }

        public Criteria andChatTimeGreaterThan(Date value) {
            addCriterion("chat_time >", value, "chatTime");
            return (Criteria) this;
        }

        public Criteria andChatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("chat_time >=", value, "chatTime");
            return (Criteria) this;
        }

        public Criteria andChatTimeLessThan(Date value) {
            addCriterion("chat_time <", value, "chatTime");
            return (Criteria) this;
        }

        public Criteria andChatTimeLessThanOrEqualTo(Date value) {
            addCriterion("chat_time <=", value, "chatTime");
            return (Criteria) this;
        }

        public Criteria andChatTimeIn(List<Date> values) {
            addCriterion("chat_time in", values, "chatTime");
            return (Criteria) this;
        }

        public Criteria andChatTimeNotIn(List<Date> values) {
            addCriterion("chat_time not in", values, "chatTime");
            return (Criteria) this;
        }

        public Criteria andChatTimeBetween(Date value1, Date value2) {
            addCriterion("chat_time between", value1, value2, "chatTime");
            return (Criteria) this;
        }

        public Criteria andChatTimeNotBetween(Date value1, Date value2) {
            addCriterion("chat_time not between", value1, value2, "chatTime");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdIsNull() {
            addCriterion("message_type_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdIsNotNull() {
            addCriterion("message_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdEqualTo(Integer value) {
            addCriterion("message_type_id =", value, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdNotEqualTo(Integer value) {
            addCriterion("message_type_id <>", value, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdGreaterThan(Integer value) {
            addCriterion("message_type_id >", value, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_type_id >=", value, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdLessThan(Integer value) {
            addCriterion("message_type_id <", value, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_type_id <=", value, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdIn(List<Integer> values) {
            addCriterion("message_type_id in", values, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdNotIn(List<Integer> values) {
            addCriterion("message_type_id not in", values, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("message_type_id between", value1, value2, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_type_id not between", value1, value2, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMsgStatusIsNull() {
            addCriterion("msg_status is null");
            return (Criteria) this;
        }

        public Criteria andMsgStatusIsNotNull() {
            addCriterion("msg_status is not null");
            return (Criteria) this;
        }

        public Criteria andMsgStatusEqualTo(Short value) {
            addCriterion("msg_status =", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusNotEqualTo(Short value) {
            addCriterion("msg_status <>", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusGreaterThan(Short value) {
            addCriterion("msg_status >", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("msg_status >=", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusLessThan(Short value) {
            addCriterion("msg_status <", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusLessThanOrEqualTo(Short value) {
            addCriterion("msg_status <=", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusIn(List<Short> values) {
            addCriterion("msg_status in", values, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusNotIn(List<Short> values) {
            addCriterion("msg_status not in", values, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusBetween(Short value1, Short value2) {
            addCriterion("msg_status between", value1, value2, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusNotBetween(Short value1, Short value2) {
            addCriterion("msg_status not between", value1, value2, "msgStatus");
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

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
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