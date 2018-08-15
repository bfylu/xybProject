package com.xyb.ai.model.xyb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TransPerTotalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransPerTotalExample() {
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

        public Criteria andSubMerCodeIsNull() {
            addCriterion("sub_mer_code is null");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeIsNotNull() {
            addCriterion("sub_mer_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeEqualTo(String value) {
            addCriterion("sub_mer_code =", value, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeNotEqualTo(String value) {
            addCriterion("sub_mer_code <>", value, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeGreaterThan(String value) {
            addCriterion("sub_mer_code >", value, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sub_mer_code >=", value, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeLessThan(String value) {
            addCriterion("sub_mer_code <", value, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeLessThanOrEqualTo(String value) {
            addCriterion("sub_mer_code <=", value, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeLike(String value) {
            addCriterion("sub_mer_code like", value, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeNotLike(String value) {
            addCriterion("sub_mer_code not like", value, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeIn(List<String> values) {
            addCriterion("sub_mer_code in", values, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeNotIn(List<String> values) {
            addCriterion("sub_mer_code not in", values, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeBetween(String value1, String value2) {
            addCriterion("sub_mer_code between", value1, value2, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeNotBetween(String value1, String value2) {
            addCriterion("sub_mer_code not between", value1, value2, "subMerCode");
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

        public Criteria andBizTypeIsNull() {
            addCriterion("biz_type is null");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNotNull() {
            addCriterion("biz_type is not null");
            return (Criteria) this;
        }

        public Criteria andBizTypeEqualTo(String value) {
            addCriterion("biz_type =", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotEqualTo(String value) {
            addCriterion("biz_type <>", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThan(String value) {
            addCriterion("biz_type >", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThanOrEqualTo(String value) {
            addCriterion("biz_type >=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThan(String value) {
            addCriterion("biz_type <", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThanOrEqualTo(String value) {
            addCriterion("biz_type <=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLike(String value) {
            addCriterion("biz_type like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotLike(String value) {
            addCriterion("biz_type not like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeIn(List<String> values) {
            addCriterion("biz_type in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotIn(List<String> values) {
            addCriterion("biz_type not in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeBetween(String value1, String value2) {
            addCriterion("biz_type between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotBetween(String value1, String value2) {
            addCriterion("biz_type not between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeIsNull() {
            addCriterion("biz_subtype is null");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeIsNotNull() {
            addCriterion("biz_subtype is not null");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeEqualTo(String value) {
            addCriterion("biz_subtype =", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeNotEqualTo(String value) {
            addCriterion("biz_subtype <>", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeGreaterThan(String value) {
            addCriterion("biz_subtype >", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeGreaterThanOrEqualTo(String value) {
            addCriterion("biz_subtype >=", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeLessThan(String value) {
            addCriterion("biz_subtype <", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeLessThanOrEqualTo(String value) {
            addCriterion("biz_subtype <=", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeLike(String value) {
            addCriterion("biz_subtype like", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeNotLike(String value) {
            addCriterion("biz_subtype not like", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeIn(List<String> values) {
            addCriterion("biz_subtype in", values, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeNotIn(List<String> values) {
            addCriterion("biz_subtype not in", values, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeBetween(String value1, String value2) {
            addCriterion("biz_subtype between", value1, value2, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeNotBetween(String value1, String value2) {
            addCriterion("biz_subtype not between", value1, value2, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("pay_type like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("pay_type not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andTurnoverIsNull() {
            addCriterion("turnover is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverIsNotNull() {
            addCriterion("turnover is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverEqualTo(BigDecimal value) {
            addCriterion("turnover =", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotEqualTo(BigDecimal value) {
            addCriterion("turnover <>", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverGreaterThan(BigDecimal value) {
            addCriterion("turnover >", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("turnover >=", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverLessThan(BigDecimal value) {
            addCriterion("turnover <", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverLessThanOrEqualTo(BigDecimal value) {
            addCriterion("turnover <=", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverIn(List<BigDecimal> values) {
            addCriterion("turnover in", values, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotIn(List<BigDecimal> values) {
            addCriterion("turnover not in", values, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("turnover between", value1, value2, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("turnover not between", value1, value2, "turnover");
            return (Criteria) this;
        }

        public Criteria andAcquireAmountIsNull() {
            addCriterion("acquire_amount is null");
            return (Criteria) this;
        }

        public Criteria andAcquireAmountIsNotNull() {
            addCriterion("acquire_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAcquireAmountEqualTo(BigDecimal value) {
            addCriterion("acquire_amount =", value, "acquireAmount");
            return (Criteria) this;
        }

        public Criteria andAcquireAmountNotEqualTo(BigDecimal value) {
            addCriterion("acquire_amount <>", value, "acquireAmount");
            return (Criteria) this;
        }

        public Criteria andAcquireAmountGreaterThan(BigDecimal value) {
            addCriterion("acquire_amount >", value, "acquireAmount");
            return (Criteria) this;
        }

        public Criteria andAcquireAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("acquire_amount >=", value, "acquireAmount");
            return (Criteria) this;
        }

        public Criteria andAcquireAmountLessThan(BigDecimal value) {
            addCriterion("acquire_amount <", value, "acquireAmount");
            return (Criteria) this;
        }

        public Criteria andAcquireAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("acquire_amount <=", value, "acquireAmount");
            return (Criteria) this;
        }

        public Criteria andAcquireAmountIn(List<BigDecimal> values) {
            addCriterion("acquire_amount in", values, "acquireAmount");
            return (Criteria) this;
        }

        public Criteria andAcquireAmountNotIn(List<BigDecimal> values) {
            addCriterion("acquire_amount not in", values, "acquireAmount");
            return (Criteria) this;
        }

        public Criteria andAcquireAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("acquire_amount between", value1, value2, "acquireAmount");
            return (Criteria) this;
        }

        public Criteria andAcquireAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("acquire_amount not between", value1, value2, "acquireAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNull() {
            addCriterion("refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(BigDecimal value) {
            addCriterion("refund_amount =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(BigDecimal value) {
            addCriterion("refund_amount <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(BigDecimal value) {
            addCriterion("refund_amount >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_amount >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(BigDecimal value) {
            addCriterion("refund_amount <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_amount <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<BigDecimal> values) {
            addCriterion("refund_amount in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<BigDecimal> values) {
            addCriterion("refund_amount not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_amount between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_amount not between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andPayCountIsNull() {
            addCriterion("pay_count is null");
            return (Criteria) this;
        }

        public Criteria andPayCountIsNotNull() {
            addCriterion("pay_count is not null");
            return (Criteria) this;
        }

        public Criteria andPayCountEqualTo(Integer value) {
            addCriterion("pay_count =", value, "payCount");
            return (Criteria) this;
        }

        public Criteria andPayCountNotEqualTo(Integer value) {
            addCriterion("pay_count <>", value, "payCount");
            return (Criteria) this;
        }

        public Criteria andPayCountGreaterThan(Integer value) {
            addCriterion("pay_count >", value, "payCount");
            return (Criteria) this;
        }

        public Criteria andPayCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_count >=", value, "payCount");
            return (Criteria) this;
        }

        public Criteria andPayCountLessThan(Integer value) {
            addCriterion("pay_count <", value, "payCount");
            return (Criteria) this;
        }

        public Criteria andPayCountLessThanOrEqualTo(Integer value) {
            addCriterion("pay_count <=", value, "payCount");
            return (Criteria) this;
        }

        public Criteria andPayCountIn(List<Integer> values) {
            addCriterion("pay_count in", values, "payCount");
            return (Criteria) this;
        }

        public Criteria andPayCountNotIn(List<Integer> values) {
            addCriterion("pay_count not in", values, "payCount");
            return (Criteria) this;
        }

        public Criteria andPayCountBetween(Integer value1, Integer value2) {
            addCriterion("pay_count between", value1, value2, "payCount");
            return (Criteria) this;
        }

        public Criteria andPayCountNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_count not between", value1, value2, "payCount");
            return (Criteria) this;
        }

        public Criteria andRefundCountIsNull() {
            addCriterion("refund_count is null");
            return (Criteria) this;
        }

        public Criteria andRefundCountIsNotNull() {
            addCriterion("refund_count is not null");
            return (Criteria) this;
        }

        public Criteria andRefundCountEqualTo(Integer value) {
            addCriterion("refund_count =", value, "refundCount");
            return (Criteria) this;
        }

        public Criteria andRefundCountNotEqualTo(Integer value) {
            addCriterion("refund_count <>", value, "refundCount");
            return (Criteria) this;
        }

        public Criteria andRefundCountGreaterThan(Integer value) {
            addCriterion("refund_count >", value, "refundCount");
            return (Criteria) this;
        }

        public Criteria andRefundCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_count >=", value, "refundCount");
            return (Criteria) this;
        }

        public Criteria andRefundCountLessThan(Integer value) {
            addCriterion("refund_count <", value, "refundCount");
            return (Criteria) this;
        }

        public Criteria andRefundCountLessThanOrEqualTo(Integer value) {
            addCriterion("refund_count <=", value, "refundCount");
            return (Criteria) this;
        }

        public Criteria andRefundCountIn(List<Integer> values) {
            addCriterion("refund_count in", values, "refundCount");
            return (Criteria) this;
        }

        public Criteria andRefundCountNotIn(List<Integer> values) {
            addCriterion("refund_count not in", values, "refundCount");
            return (Criteria) this;
        }

        public Criteria andRefundCountBetween(Integer value1, Integer value2) {
            addCriterion("refund_count between", value1, value2, "refundCount");
            return (Criteria) this;
        }

        public Criteria andRefundCountNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_count not between", value1, value2, "refundCount");
            return (Criteria) this;
        }

        public Criteria andTotalDateIsNull() {
            addCriterion("total_date is null");
            return (Criteria) this;
        }

        public Criteria andTotalDateIsNotNull() {
            addCriterion("total_date is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDateEqualTo(Date value) {
            addCriterionForJDBCDate("total_date =", value, "totalDate");
            return (Criteria) this;
        }

        public Criteria andTotalDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("total_date <>", value, "totalDate");
            return (Criteria) this;
        }

        public Criteria andTotalDateGreaterThan(Date value) {
            addCriterionForJDBCDate("total_date >", value, "totalDate");
            return (Criteria) this;
        }

        public Criteria andTotalDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("total_date >=", value, "totalDate");
            return (Criteria) this;
        }

        public Criteria andTotalDateLessThan(Date value) {
            addCriterionForJDBCDate("total_date <", value, "totalDate");
            return (Criteria) this;
        }

        public Criteria andTotalDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("total_date <=", value, "totalDate");
            return (Criteria) this;
        }

        public Criteria andTotalDateIn(List<Date> values) {
            addCriterionForJDBCDate("total_date in", values, "totalDate");
            return (Criteria) this;
        }

        public Criteria andTotalDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("total_date not in", values, "totalDate");
            return (Criteria) this;
        }

        public Criteria andTotalDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("total_date between", value1, value2, "totalDate");
            return (Criteria) this;
        }

        public Criteria andTotalDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("total_date not between", value1, value2, "totalDate");
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