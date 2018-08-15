package com.xyb.ai.model.xyb;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberScoreChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberScoreChangeExample() {
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

        public Criteria andScoreNoIsNull() {
            addCriterion("score_no is null");
            return (Criteria) this;
        }

        public Criteria andScoreNoIsNotNull() {
            addCriterion("score_no is not null");
            return (Criteria) this;
        }

        public Criteria andScoreNoEqualTo(String value) {
            addCriterion("score_no =", value, "scoreNo");
            return (Criteria) this;
        }

        public Criteria andScoreNoNotEqualTo(String value) {
            addCriterion("score_no <>", value, "scoreNo");
            return (Criteria) this;
        }

        public Criteria andScoreNoGreaterThan(String value) {
            addCriterion("score_no >", value, "scoreNo");
            return (Criteria) this;
        }

        public Criteria andScoreNoGreaterThanOrEqualTo(String value) {
            addCriterion("score_no >=", value, "scoreNo");
            return (Criteria) this;
        }

        public Criteria andScoreNoLessThan(String value) {
            addCriterion("score_no <", value, "scoreNo");
            return (Criteria) this;
        }

        public Criteria andScoreNoLessThanOrEqualTo(String value) {
            addCriterion("score_no <=", value, "scoreNo");
            return (Criteria) this;
        }

        public Criteria andScoreNoLike(String value) {
            addCriterion("score_no like", value, "scoreNo");
            return (Criteria) this;
        }

        public Criteria andScoreNoNotLike(String value) {
            addCriterion("score_no not like", value, "scoreNo");
            return (Criteria) this;
        }

        public Criteria andScoreNoIn(List<String> values) {
            addCriterion("score_no in", values, "scoreNo");
            return (Criteria) this;
        }

        public Criteria andScoreNoNotIn(List<String> values) {
            addCriterion("score_no not in", values, "scoreNo");
            return (Criteria) this;
        }

        public Criteria andScoreNoBetween(String value1, String value2) {
            addCriterion("score_no between", value1, value2, "scoreNo");
            return (Criteria) this;
        }

        public Criteria andScoreNoNotBetween(String value1, String value2) {
            addCriterion("score_no not between", value1, value2, "scoreNo");
            return (Criteria) this;
        }

        public Criteria andOldScoreNoIsNull() {
            addCriterion("old_score_no is null");
            return (Criteria) this;
        }

        public Criteria andOldScoreNoIsNotNull() {
            addCriterion("old_score_no is not null");
            return (Criteria) this;
        }

        public Criteria andOldScoreNoEqualTo(String value) {
            addCriterion("old_score_no =", value, "oldScoreNo");
            return (Criteria) this;
        }

        public Criteria andOldScoreNoNotEqualTo(String value) {
            addCriterion("old_score_no <>", value, "oldScoreNo");
            return (Criteria) this;
        }

        public Criteria andOldScoreNoGreaterThan(String value) {
            addCriterion("old_score_no >", value, "oldScoreNo");
            return (Criteria) this;
        }

        public Criteria andOldScoreNoGreaterThanOrEqualTo(String value) {
            addCriterion("old_score_no >=", value, "oldScoreNo");
            return (Criteria) this;
        }

        public Criteria andOldScoreNoLessThan(String value) {
            addCriterion("old_score_no <", value, "oldScoreNo");
            return (Criteria) this;
        }

        public Criteria andOldScoreNoLessThanOrEqualTo(String value) {
            addCriterion("old_score_no <=", value, "oldScoreNo");
            return (Criteria) this;
        }

        public Criteria andOldScoreNoLike(String value) {
            addCriterion("old_score_no like", value, "oldScoreNo");
            return (Criteria) this;
        }

        public Criteria andOldScoreNoNotLike(String value) {
            addCriterion("old_score_no not like", value, "oldScoreNo");
            return (Criteria) this;
        }

        public Criteria andOldScoreNoIn(List<String> values) {
            addCriterion("old_score_no in", values, "oldScoreNo");
            return (Criteria) this;
        }

        public Criteria andOldScoreNoNotIn(List<String> values) {
            addCriterion("old_score_no not in", values, "oldScoreNo");
            return (Criteria) this;
        }

        public Criteria andOldScoreNoBetween(String value1, String value2) {
            addCriterion("old_score_no between", value1, value2, "oldScoreNo");
            return (Criteria) this;
        }

        public Criteria andOldScoreNoNotBetween(String value1, String value2) {
            addCriterion("old_score_no not between", value1, value2, "oldScoreNo");
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

        public Criteria andOpenidSourceIsNull() {
            addCriterion("openid_source is null");
            return (Criteria) this;
        }

        public Criteria andOpenidSourceIsNotNull() {
            addCriterion("openid_source is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidSourceEqualTo(Integer value) {
            addCriterion("openid_source =", value, "openidSource");
            return (Criteria) this;
        }

        public Criteria andOpenidSourceNotEqualTo(Integer value) {
            addCriterion("openid_source <>", value, "openidSource");
            return (Criteria) this;
        }

        public Criteria andOpenidSourceGreaterThan(Integer value) {
            addCriterion("openid_source >", value, "openidSource");
            return (Criteria) this;
        }

        public Criteria andOpenidSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("openid_source >=", value, "openidSource");
            return (Criteria) this;
        }

        public Criteria andOpenidSourceLessThan(Integer value) {
            addCriterion("openid_source <", value, "openidSource");
            return (Criteria) this;
        }

        public Criteria andOpenidSourceLessThanOrEqualTo(Integer value) {
            addCriterion("openid_source <=", value, "openidSource");
            return (Criteria) this;
        }

        public Criteria andOpenidSourceIn(List<Integer> values) {
            addCriterion("openid_source in", values, "openidSource");
            return (Criteria) this;
        }

        public Criteria andOpenidSourceNotIn(List<Integer> values) {
            addCriterion("openid_source not in", values, "openidSource");
            return (Criteria) this;
        }

        public Criteria andOpenidSourceBetween(Integer value1, Integer value2) {
            addCriterion("openid_source between", value1, value2, "openidSource");
            return (Criteria) this;
        }

        public Criteria andOpenidSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("openid_source not between", value1, value2, "openidSource");
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

        public Criteria andBizTypeIsNull() {
            addCriterion("biz_type is null");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNotNull() {
            addCriterion("biz_type is not null");
            return (Criteria) this;
        }

        public Criteria andBizTypeEqualTo(Integer value) {
            addCriterion("biz_type =", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotEqualTo(Integer value) {
            addCriterion("biz_type <>", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThan(Integer value) {
            addCriterion("biz_type >", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("biz_type >=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThan(Integer value) {
            addCriterion("biz_type <", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThanOrEqualTo(Integer value) {
            addCriterion("biz_type <=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeIn(List<Integer> values) {
            addCriterion("biz_type in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotIn(List<Integer> values) {
            addCriterion("biz_type not in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeBetween(Integer value1, Integer value2) {
            addCriterion("biz_type between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("biz_type not between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andScoreStatesIsNull() {
            addCriterion("score_states is null");
            return (Criteria) this;
        }

        public Criteria andScoreStatesIsNotNull() {
            addCriterion("score_states is not null");
            return (Criteria) this;
        }

        public Criteria andScoreStatesEqualTo(Integer value) {
            addCriterion("score_states =", value, "scoreStates");
            return (Criteria) this;
        }

        public Criteria andScoreStatesNotEqualTo(Integer value) {
            addCriterion("score_states <>", value, "scoreStates");
            return (Criteria) this;
        }

        public Criteria andScoreStatesGreaterThan(Integer value) {
            addCriterion("score_states >", value, "scoreStates");
            return (Criteria) this;
        }

        public Criteria andScoreStatesGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_states >=", value, "scoreStates");
            return (Criteria) this;
        }

        public Criteria andScoreStatesLessThan(Integer value) {
            addCriterion("score_states <", value, "scoreStates");
            return (Criteria) this;
        }

        public Criteria andScoreStatesLessThanOrEqualTo(Integer value) {
            addCriterion("score_states <=", value, "scoreStates");
            return (Criteria) this;
        }

        public Criteria andScoreStatesIn(List<Integer> values) {
            addCriterion("score_states in", values, "scoreStates");
            return (Criteria) this;
        }

        public Criteria andScoreStatesNotIn(List<Integer> values) {
            addCriterion("score_states not in", values, "scoreStates");
            return (Criteria) this;
        }

        public Criteria andScoreStatesBetween(Integer value1, Integer value2) {
            addCriterion("score_states between", value1, value2, "scoreStates");
            return (Criteria) this;
        }

        public Criteria andScoreStatesNotBetween(Integer value1, Integer value2) {
            addCriterion("score_states not between", value1, value2, "scoreStates");
            return (Criteria) this;
        }

        public Criteria andTurnoverTypeIsNull() {
            addCriterion("turnover_type is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverTypeIsNotNull() {
            addCriterion("turnover_type is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverTypeEqualTo(Integer value) {
            addCriterion("turnover_type =", value, "turnoverType");
            return (Criteria) this;
        }

        public Criteria andTurnoverTypeNotEqualTo(Integer value) {
            addCriterion("turnover_type <>", value, "turnoverType");
            return (Criteria) this;
        }

        public Criteria andTurnoverTypeGreaterThan(Integer value) {
            addCriterion("turnover_type >", value, "turnoverType");
            return (Criteria) this;
        }

        public Criteria andTurnoverTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("turnover_type >=", value, "turnoverType");
            return (Criteria) this;
        }

        public Criteria andTurnoverTypeLessThan(Integer value) {
            addCriterion("turnover_type <", value, "turnoverType");
            return (Criteria) this;
        }

        public Criteria andTurnoverTypeLessThanOrEqualTo(Integer value) {
            addCriterion("turnover_type <=", value, "turnoverType");
            return (Criteria) this;
        }

        public Criteria andTurnoverTypeIn(List<Integer> values) {
            addCriterion("turnover_type in", values, "turnoverType");
            return (Criteria) this;
        }

        public Criteria andTurnoverTypeNotIn(List<Integer> values) {
            addCriterion("turnover_type not in", values, "turnoverType");
            return (Criteria) this;
        }

        public Criteria andTurnoverTypeBetween(Integer value1, Integer value2) {
            addCriterion("turnover_type between", value1, value2, "turnoverType");
            return (Criteria) this;
        }

        public Criteria andTurnoverTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("turnover_type not between", value1, value2, "turnoverType");
            return (Criteria) this;
        }

        public Criteria andScoreSourceIsNull() {
            addCriterion("score_source is null");
            return (Criteria) this;
        }

        public Criteria andScoreSourceIsNotNull() {
            addCriterion("score_source is not null");
            return (Criteria) this;
        }

        public Criteria andScoreSourceEqualTo(Integer value) {
            addCriterion("score_source =", value, "scoreSource");
            return (Criteria) this;
        }

        public Criteria andScoreSourceNotEqualTo(Integer value) {
            addCriterion("score_source <>", value, "scoreSource");
            return (Criteria) this;
        }

        public Criteria andScoreSourceGreaterThan(Integer value) {
            addCriterion("score_source >", value, "scoreSource");
            return (Criteria) this;
        }

        public Criteria andScoreSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_source >=", value, "scoreSource");
            return (Criteria) this;
        }

        public Criteria andScoreSourceLessThan(Integer value) {
            addCriterion("score_source <", value, "scoreSource");
            return (Criteria) this;
        }

        public Criteria andScoreSourceLessThanOrEqualTo(Integer value) {
            addCriterion("score_source <=", value, "scoreSource");
            return (Criteria) this;
        }

        public Criteria andScoreSourceIn(List<Integer> values) {
            addCriterion("score_source in", values, "scoreSource");
            return (Criteria) this;
        }

        public Criteria andScoreSourceNotIn(List<Integer> values) {
            addCriterion("score_source not in", values, "scoreSource");
            return (Criteria) this;
        }

        public Criteria andScoreSourceBetween(Integer value1, Integer value2) {
            addCriterion("score_source between", value1, value2, "scoreSource");
            return (Criteria) this;
        }

        public Criteria andScoreSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("score_source not between", value1, value2, "scoreSource");
            return (Criteria) this;
        }

        public Criteria andChangeScoreIsNull() {
            addCriterion("change_score is null");
            return (Criteria) this;
        }

        public Criteria andChangeScoreIsNotNull() {
            addCriterion("change_score is not null");
            return (Criteria) this;
        }

        public Criteria andChangeScoreEqualTo(Integer value) {
            addCriterion("change_score =", value, "changeScore");
            return (Criteria) this;
        }

        public Criteria andChangeScoreNotEqualTo(Integer value) {
            addCriterion("change_score <>", value, "changeScore");
            return (Criteria) this;
        }

        public Criteria andChangeScoreGreaterThan(Integer value) {
            addCriterion("change_score >", value, "changeScore");
            return (Criteria) this;
        }

        public Criteria andChangeScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_score >=", value, "changeScore");
            return (Criteria) this;
        }

        public Criteria andChangeScoreLessThan(Integer value) {
            addCriterion("change_score <", value, "changeScore");
            return (Criteria) this;
        }

        public Criteria andChangeScoreLessThanOrEqualTo(Integer value) {
            addCriterion("change_score <=", value, "changeScore");
            return (Criteria) this;
        }

        public Criteria andChangeScoreIn(List<Integer> values) {
            addCriterion("change_score in", values, "changeScore");
            return (Criteria) this;
        }

        public Criteria andChangeScoreNotIn(List<Integer> values) {
            addCriterion("change_score not in", values, "changeScore");
            return (Criteria) this;
        }

        public Criteria andChangeScoreBetween(Integer value1, Integer value2) {
            addCriterion("change_score between", value1, value2, "changeScore");
            return (Criteria) this;
        }

        public Criteria andChangeScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("change_score not between", value1, value2, "changeScore");
            return (Criteria) this;
        }

        public Criteria andBalanceScoreIsNull() {
            addCriterion("balance_score is null");
            return (Criteria) this;
        }

        public Criteria andBalanceScoreIsNotNull() {
            addCriterion("balance_score is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceScoreEqualTo(Integer value) {
            addCriterion("balance_score =", value, "balanceScore");
            return (Criteria) this;
        }

        public Criteria andBalanceScoreNotEqualTo(Integer value) {
            addCriterion("balance_score <>", value, "balanceScore");
            return (Criteria) this;
        }

        public Criteria andBalanceScoreGreaterThan(Integer value) {
            addCriterion("balance_score >", value, "balanceScore");
            return (Criteria) this;
        }

        public Criteria andBalanceScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("balance_score >=", value, "balanceScore");
            return (Criteria) this;
        }

        public Criteria andBalanceScoreLessThan(Integer value) {
            addCriterion("balance_score <", value, "balanceScore");
            return (Criteria) this;
        }

        public Criteria andBalanceScoreLessThanOrEqualTo(Integer value) {
            addCriterion("balance_score <=", value, "balanceScore");
            return (Criteria) this;
        }

        public Criteria andBalanceScoreIn(List<Integer> values) {
            addCriterion("balance_score in", values, "balanceScore");
            return (Criteria) this;
        }

        public Criteria andBalanceScoreNotIn(List<Integer> values) {
            addCriterion("balance_score not in", values, "balanceScore");
            return (Criteria) this;
        }

        public Criteria andBalanceScoreBetween(Integer value1, Integer value2) {
            addCriterion("balance_score between", value1, value2, "balanceScore");
            return (Criteria) this;
        }

        public Criteria andBalanceScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("balance_score not between", value1, value2, "balanceScore");
            return (Criteria) this;
        }

        public Criteria andScoreUseDescIsNull() {
            addCriterion("score_use_desc is null");
            return (Criteria) this;
        }

        public Criteria andScoreUseDescIsNotNull() {
            addCriterion("score_use_desc is not null");
            return (Criteria) this;
        }

        public Criteria andScoreUseDescEqualTo(String value) {
            addCriterion("score_use_desc =", value, "scoreUseDesc");
            return (Criteria) this;
        }

        public Criteria andScoreUseDescNotEqualTo(String value) {
            addCriterion("score_use_desc <>", value, "scoreUseDesc");
            return (Criteria) this;
        }

        public Criteria andScoreUseDescGreaterThan(String value) {
            addCriterion("score_use_desc >", value, "scoreUseDesc");
            return (Criteria) this;
        }

        public Criteria andScoreUseDescGreaterThanOrEqualTo(String value) {
            addCriterion("score_use_desc >=", value, "scoreUseDesc");
            return (Criteria) this;
        }

        public Criteria andScoreUseDescLessThan(String value) {
            addCriterion("score_use_desc <", value, "scoreUseDesc");
            return (Criteria) this;
        }

        public Criteria andScoreUseDescLessThanOrEqualTo(String value) {
            addCriterion("score_use_desc <=", value, "scoreUseDesc");
            return (Criteria) this;
        }

        public Criteria andScoreUseDescLike(String value) {
            addCriterion("score_use_desc like", value, "scoreUseDesc");
            return (Criteria) this;
        }

        public Criteria andScoreUseDescNotLike(String value) {
            addCriterion("score_use_desc not like", value, "scoreUseDesc");
            return (Criteria) this;
        }

        public Criteria andScoreUseDescIn(List<String> values) {
            addCriterion("score_use_desc in", values, "scoreUseDesc");
            return (Criteria) this;
        }

        public Criteria andScoreUseDescNotIn(List<String> values) {
            addCriterion("score_use_desc not in", values, "scoreUseDesc");
            return (Criteria) this;
        }

        public Criteria andScoreUseDescBetween(String value1, String value2) {
            addCriterion("score_use_desc between", value1, value2, "scoreUseDesc");
            return (Criteria) this;
        }

        public Criteria andScoreUseDescNotBetween(String value1, String value2) {
            addCriterion("score_use_desc not between", value1, value2, "scoreUseDesc");
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

        public Criteria andExpiredTimeIsNull() {
            addCriterion("expired_time is null");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeIsNotNull() {
            addCriterion("expired_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeEqualTo(Date value) {
            addCriterion("expired_time =", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeNotEqualTo(Date value) {
            addCriterion("expired_time <>", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeGreaterThan(Date value) {
            addCriterion("expired_time >", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expired_time >=", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeLessThan(Date value) {
            addCriterion("expired_time <", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeLessThanOrEqualTo(Date value) {
            addCriterion("expired_time <=", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeIn(List<Date> values) {
            addCriterion("expired_time in", values, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeNotIn(List<Date> values) {
            addCriterion("expired_time not in", values, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeBetween(Date value1, Date value2) {
            addCriterion("expired_time between", value1, value2, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeNotBetween(Date value1, Date value2) {
            addCriterion("expired_time not between", value1, value2, "expiredTime");
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

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date not between", value1, value2, "createDate");
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