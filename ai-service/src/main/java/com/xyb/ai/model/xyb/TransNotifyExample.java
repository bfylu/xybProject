package com.xyb.ai.model.xyb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransNotifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransNotifyExample() {
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

        public Criteria andNotifyNoIsNull() {
            addCriterion("notify_no is null");
            return (Criteria) this;
        }

        public Criteria andNotifyNoIsNotNull() {
            addCriterion("notify_no is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyNoEqualTo(String value) {
            addCriterion("notify_no =", value, "notifyNo");
            return (Criteria) this;
        }

        public Criteria andNotifyNoNotEqualTo(String value) {
            addCriterion("notify_no <>", value, "notifyNo");
            return (Criteria) this;
        }

        public Criteria andNotifyNoGreaterThan(String value) {
            addCriterion("notify_no >", value, "notifyNo");
            return (Criteria) this;
        }

        public Criteria andNotifyNoGreaterThanOrEqualTo(String value) {
            addCriterion("notify_no >=", value, "notifyNo");
            return (Criteria) this;
        }

        public Criteria andNotifyNoLessThan(String value) {
            addCriterion("notify_no <", value, "notifyNo");
            return (Criteria) this;
        }

        public Criteria andNotifyNoLessThanOrEqualTo(String value) {
            addCriterion("notify_no <=", value, "notifyNo");
            return (Criteria) this;
        }

        public Criteria andNotifyNoLike(String value) {
            addCriterion("notify_no like", value, "notifyNo");
            return (Criteria) this;
        }

        public Criteria andNotifyNoNotLike(String value) {
            addCriterion("notify_no not like", value, "notifyNo");
            return (Criteria) this;
        }

        public Criteria andNotifyNoIn(List<String> values) {
            addCriterion("notify_no in", values, "notifyNo");
            return (Criteria) this;
        }

        public Criteria andNotifyNoNotIn(List<String> values) {
            addCriterion("notify_no not in", values, "notifyNo");
            return (Criteria) this;
        }

        public Criteria andNotifyNoBetween(String value1, String value2) {
            addCriterion("notify_no between", value1, value2, "notifyNo");
            return (Criteria) this;
        }

        public Criteria andNotifyNoNotBetween(String value1, String value2) {
            addCriterion("notify_no not between", value1, value2, "notifyNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andRespCodeIsNull() {
            addCriterion("resp_code is null");
            return (Criteria) this;
        }

        public Criteria andRespCodeIsNotNull() {
            addCriterion("resp_code is not null");
            return (Criteria) this;
        }

        public Criteria andRespCodeEqualTo(String value) {
            addCriterion("resp_code =", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeNotEqualTo(String value) {
            addCriterion("resp_code <>", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeGreaterThan(String value) {
            addCriterion("resp_code >", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeGreaterThanOrEqualTo(String value) {
            addCriterion("resp_code >=", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeLessThan(String value) {
            addCriterion("resp_code <", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeLessThanOrEqualTo(String value) {
            addCriterion("resp_code <=", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeLike(String value) {
            addCriterion("resp_code like", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeNotLike(String value) {
            addCriterion("resp_code not like", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeIn(List<String> values) {
            addCriterion("resp_code in", values, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeNotIn(List<String> values) {
            addCriterion("resp_code not in", values, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeBetween(String value1, String value2) {
            addCriterion("resp_code between", value1, value2, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeNotBetween(String value1, String value2) {
            addCriterion("resp_code not between", value1, value2, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespDescIsNull() {
            addCriterion("resp_desc is null");
            return (Criteria) this;
        }

        public Criteria andRespDescIsNotNull() {
            addCriterion("resp_desc is not null");
            return (Criteria) this;
        }

        public Criteria andRespDescEqualTo(String value) {
            addCriterion("resp_desc =", value, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescNotEqualTo(String value) {
            addCriterion("resp_desc <>", value, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescGreaterThan(String value) {
            addCriterion("resp_desc >", value, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescGreaterThanOrEqualTo(String value) {
            addCriterion("resp_desc >=", value, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescLessThan(String value) {
            addCriterion("resp_desc <", value, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescLessThanOrEqualTo(String value) {
            addCriterion("resp_desc <=", value, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescLike(String value) {
            addCriterion("resp_desc like", value, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescNotLike(String value) {
            addCriterion("resp_desc not like", value, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescIn(List<String> values) {
            addCriterion("resp_desc in", values, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescNotIn(List<String> values) {
            addCriterion("resp_desc not in", values, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescBetween(String value1, String value2) {
            addCriterion("resp_desc between", value1, value2, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescNotBetween(String value1, String value2) {
            addCriterion("resp_desc not between", value1, value2, "respDesc");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNull() {
            addCriterion("notify_url is null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNotNull() {
            addCriterion("notify_url is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlEqualTo(String value) {
            addCriterion("notify_url =", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotEqualTo(String value) {
            addCriterion("notify_url <>", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThan(String value) {
            addCriterion("notify_url >", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("notify_url >=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThan(String value) {
            addCriterion("notify_url <", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("notify_url <=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLike(String value) {
            addCriterion("notify_url like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotLike(String value) {
            addCriterion("notify_url not like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIn(List<String> values) {
            addCriterion("notify_url in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotIn(List<String> values) {
            addCriterion("notify_url not in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlBetween(String value1, String value2) {
            addCriterion("notify_url between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("notify_url not between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyContentTypeIsNull() {
            addCriterion("notify_content_type is null");
            return (Criteria) this;
        }

        public Criteria andNotifyContentTypeIsNotNull() {
            addCriterion("notify_content_type is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyContentTypeEqualTo(String value) {
            addCriterion("notify_content_type =", value, "notifyContentType");
            return (Criteria) this;
        }

        public Criteria andNotifyContentTypeNotEqualTo(String value) {
            addCriterion("notify_content_type <>", value, "notifyContentType");
            return (Criteria) this;
        }

        public Criteria andNotifyContentTypeGreaterThan(String value) {
            addCriterion("notify_content_type >", value, "notifyContentType");
            return (Criteria) this;
        }

        public Criteria andNotifyContentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("notify_content_type >=", value, "notifyContentType");
            return (Criteria) this;
        }

        public Criteria andNotifyContentTypeLessThan(String value) {
            addCriterion("notify_content_type <", value, "notifyContentType");
            return (Criteria) this;
        }

        public Criteria andNotifyContentTypeLessThanOrEqualTo(String value) {
            addCriterion("notify_content_type <=", value, "notifyContentType");
            return (Criteria) this;
        }

        public Criteria andNotifyContentTypeLike(String value) {
            addCriterion("notify_content_type like", value, "notifyContentType");
            return (Criteria) this;
        }

        public Criteria andNotifyContentTypeNotLike(String value) {
            addCriterion("notify_content_type not like", value, "notifyContentType");
            return (Criteria) this;
        }

        public Criteria andNotifyContentTypeIn(List<String> values) {
            addCriterion("notify_content_type in", values, "notifyContentType");
            return (Criteria) this;
        }

        public Criteria andNotifyContentTypeNotIn(List<String> values) {
            addCriterion("notify_content_type not in", values, "notifyContentType");
            return (Criteria) this;
        }

        public Criteria andNotifyContentTypeBetween(String value1, String value2) {
            addCriterion("notify_content_type between", value1, value2, "notifyContentType");
            return (Criteria) this;
        }

        public Criteria andNotifyContentTypeNotBetween(String value1, String value2) {
            addCriterion("notify_content_type not between", value1, value2, "notifyContentType");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusIsNull() {
            addCriterion("notify_status is null");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusIsNotNull() {
            addCriterion("notify_status is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusEqualTo(String value) {
            addCriterion("notify_status =", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusNotEqualTo(String value) {
            addCriterion("notify_status <>", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusGreaterThan(String value) {
            addCriterion("notify_status >", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("notify_status >=", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusLessThan(String value) {
            addCriterion("notify_status <", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusLessThanOrEqualTo(String value) {
            addCriterion("notify_status <=", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusLike(String value) {
            addCriterion("notify_status like", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusNotLike(String value) {
            addCriterion("notify_status not like", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusIn(List<String> values) {
            addCriterion("notify_status in", values, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusNotIn(List<String> values) {
            addCriterion("notify_status not in", values, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusBetween(String value1, String value2) {
            addCriterion("notify_status between", value1, value2, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusNotBetween(String value1, String value2) {
            addCriterion("notify_status not between", value1, value2, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andTotalCallIsNull() {
            addCriterion("total_call is null");
            return (Criteria) this;
        }

        public Criteria andTotalCallIsNotNull() {
            addCriterion("total_call is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCallEqualTo(Integer value) {
            addCriterion("total_call =", value, "totalCall");
            return (Criteria) this;
        }

        public Criteria andTotalCallNotEqualTo(Integer value) {
            addCriterion("total_call <>", value, "totalCall");
            return (Criteria) this;
        }

        public Criteria andTotalCallGreaterThan(Integer value) {
            addCriterion("total_call >", value, "totalCall");
            return (Criteria) this;
        }

        public Criteria andTotalCallGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_call >=", value, "totalCall");
            return (Criteria) this;
        }

        public Criteria andTotalCallLessThan(Integer value) {
            addCriterion("total_call <", value, "totalCall");
            return (Criteria) this;
        }

        public Criteria andTotalCallLessThanOrEqualTo(Integer value) {
            addCriterion("total_call <=", value, "totalCall");
            return (Criteria) this;
        }

        public Criteria andTotalCallIn(List<Integer> values) {
            addCriterion("total_call in", values, "totalCall");
            return (Criteria) this;
        }

        public Criteria andTotalCallNotIn(List<Integer> values) {
            addCriterion("total_call not in", values, "totalCall");
            return (Criteria) this;
        }

        public Criteria andTotalCallBetween(Integer value1, Integer value2) {
            addCriterion("total_call between", value1, value2, "totalCall");
            return (Criteria) this;
        }

        public Criteria andTotalCallNotBetween(Integer value1, Integer value2) {
            addCriterion("total_call not between", value1, value2, "totalCall");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeIsNull() {
            addCriterion("last_notify_time is null");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeIsNotNull() {
            addCriterion("last_notify_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeEqualTo(Date value) {
            addCriterion("last_notify_time =", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeNotEqualTo(Date value) {
            addCriterion("last_notify_time <>", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeGreaterThan(Date value) {
            addCriterion("last_notify_time >", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_notify_time >=", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeLessThan(Date value) {
            addCriterion("last_notify_time <", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_notify_time <=", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeIn(List<Date> values) {
            addCriterion("last_notify_time in", values, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeNotIn(List<Date> values) {
            addCriterion("last_notify_time not in", values, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeBetween(Date value1, Date value2) {
            addCriterion("last_notify_time between", value1, value2, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_notify_time not between", value1, value2, "lastNotifyTime");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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