package com.xyb.shop.model.xyb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberRefundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberRefundExample() {
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

        public Criteria andMemberNoIsNull() {
            addCriterion("member_no is null");
            return (Criteria) this;
        }

        public Criteria andMemberNoIsNotNull() {
            addCriterion("member_no is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNoEqualTo(String value) {
            addCriterion("member_no =", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotEqualTo(String value) {
            addCriterion("member_no <>", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoGreaterThan(String value) {
            addCriterion("member_no >", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoGreaterThanOrEqualTo(String value) {
            addCriterion("member_no >=", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoLessThan(String value) {
            addCriterion("member_no <", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoLessThanOrEqualTo(String value) {
            addCriterion("member_no <=", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoLike(String value) {
            addCriterion("member_no like", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotLike(String value) {
            addCriterion("member_no not like", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoIn(List<String> values) {
            addCriterion("member_no in", values, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotIn(List<String> values) {
            addCriterion("member_no not in", values, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoBetween(String value1, String value2) {
            addCriterion("member_no between", value1, value2, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotBetween(String value1, String value2) {
            addCriterion("member_no not between", value1, value2, "memberNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoIsNull() {
            addCriterion("refund_order_no is null");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoIsNotNull() {
            addCriterion("refund_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoEqualTo(String value) {
            addCriterion("refund_order_no =", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoNotEqualTo(String value) {
            addCriterion("refund_order_no <>", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoGreaterThan(String value) {
            addCriterion("refund_order_no >", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("refund_order_no >=", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoLessThan(String value) {
            addCriterion("refund_order_no <", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoLessThanOrEqualTo(String value) {
            addCriterion("refund_order_no <=", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoLike(String value) {
            addCriterion("refund_order_no like", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoNotLike(String value) {
            addCriterion("refund_order_no not like", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoIn(List<String> values) {
            addCriterion("refund_order_no in", values, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoNotIn(List<String> values) {
            addCriterion("refund_order_no not in", values, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoBetween(String value1, String value2) {
            addCriterion("refund_order_no between", value1, value2, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoNotBetween(String value1, String value2) {
            addCriterion("refund_order_no not between", value1, value2, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andConsumeOrderNoIsNull() {
            addCriterion("consume_order_no is null");
            return (Criteria) this;
        }

        public Criteria andConsumeOrderNoIsNotNull() {
            addCriterion("consume_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeOrderNoEqualTo(String value) {
            addCriterion("consume_order_no =", value, "consumeOrderNo");
            return (Criteria) this;
        }

        public Criteria andConsumeOrderNoNotEqualTo(String value) {
            addCriterion("consume_order_no <>", value, "consumeOrderNo");
            return (Criteria) this;
        }

        public Criteria andConsumeOrderNoGreaterThan(String value) {
            addCriterion("consume_order_no >", value, "consumeOrderNo");
            return (Criteria) this;
        }

        public Criteria andConsumeOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("consume_order_no >=", value, "consumeOrderNo");
            return (Criteria) this;
        }

        public Criteria andConsumeOrderNoLessThan(String value) {
            addCriterion("consume_order_no <", value, "consumeOrderNo");
            return (Criteria) this;
        }

        public Criteria andConsumeOrderNoLessThanOrEqualTo(String value) {
            addCriterion("consume_order_no <=", value, "consumeOrderNo");
            return (Criteria) this;
        }

        public Criteria andConsumeOrderNoLike(String value) {
            addCriterion("consume_order_no like", value, "consumeOrderNo");
            return (Criteria) this;
        }

        public Criteria andConsumeOrderNoNotLike(String value) {
            addCriterion("consume_order_no not like", value, "consumeOrderNo");
            return (Criteria) this;
        }

        public Criteria andConsumeOrderNoIn(List<String> values) {
            addCriterion("consume_order_no in", values, "consumeOrderNo");
            return (Criteria) this;
        }

        public Criteria andConsumeOrderNoNotIn(List<String> values) {
            addCriterion("consume_order_no not in", values, "consumeOrderNo");
            return (Criteria) this;
        }

        public Criteria andConsumeOrderNoBetween(String value1, String value2) {
            addCriterion("consume_order_no between", value1, value2, "consumeOrderNo");
            return (Criteria) this;
        }

        public Criteria andConsumeOrderNoNotBetween(String value1, String value2) {
            addCriterion("consume_order_no not between", value1, value2, "consumeOrderNo");
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

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
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

        public Criteria andRefundVoucherPicIsNull() {
            addCriterion("refund_voucher_pic is null");
            return (Criteria) this;
        }

        public Criteria andRefundVoucherPicIsNotNull() {
            addCriterion("refund_voucher_pic is not null");
            return (Criteria) this;
        }

        public Criteria andRefundVoucherPicEqualTo(String value) {
            addCriterion("refund_voucher_pic =", value, "refundVoucherPic");
            return (Criteria) this;
        }

        public Criteria andRefundVoucherPicNotEqualTo(String value) {
            addCriterion("refund_voucher_pic <>", value, "refundVoucherPic");
            return (Criteria) this;
        }

        public Criteria andRefundVoucherPicGreaterThan(String value) {
            addCriterion("refund_voucher_pic >", value, "refundVoucherPic");
            return (Criteria) this;
        }

        public Criteria andRefundVoucherPicGreaterThanOrEqualTo(String value) {
            addCriterion("refund_voucher_pic >=", value, "refundVoucherPic");
            return (Criteria) this;
        }

        public Criteria andRefundVoucherPicLessThan(String value) {
            addCriterion("refund_voucher_pic <", value, "refundVoucherPic");
            return (Criteria) this;
        }

        public Criteria andRefundVoucherPicLessThanOrEqualTo(String value) {
            addCriterion("refund_voucher_pic <=", value, "refundVoucherPic");
            return (Criteria) this;
        }

        public Criteria andRefundVoucherPicLike(String value) {
            addCriterion("refund_voucher_pic like", value, "refundVoucherPic");
            return (Criteria) this;
        }

        public Criteria andRefundVoucherPicNotLike(String value) {
            addCriterion("refund_voucher_pic not like", value, "refundVoucherPic");
            return (Criteria) this;
        }

        public Criteria andRefundVoucherPicIn(List<String> values) {
            addCriterion("refund_voucher_pic in", values, "refundVoucherPic");
            return (Criteria) this;
        }

        public Criteria andRefundVoucherPicNotIn(List<String> values) {
            addCriterion("refund_voucher_pic not in", values, "refundVoucherPic");
            return (Criteria) this;
        }

        public Criteria andRefundVoucherPicBetween(String value1, String value2) {
            addCriterion("refund_voucher_pic between", value1, value2, "refundVoucherPic");
            return (Criteria) this;
        }

        public Criteria andRefundVoucherPicNotBetween(String value1, String value2) {
            addCriterion("refund_voucher_pic not between", value1, value2, "refundVoucherPic");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoIsNull() {
            addCriterion("audit_batch_no is null");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoIsNotNull() {
            addCriterion("audit_batch_no is not null");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoEqualTo(String value) {
            addCriterion("audit_batch_no =", value, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoNotEqualTo(String value) {
            addCriterion("audit_batch_no <>", value, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoGreaterThan(String value) {
            addCriterion("audit_batch_no >", value, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("audit_batch_no >=", value, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoLessThan(String value) {
            addCriterion("audit_batch_no <", value, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoLessThanOrEqualTo(String value) {
            addCriterion("audit_batch_no <=", value, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoLike(String value) {
            addCriterion("audit_batch_no like", value, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoNotLike(String value) {
            addCriterion("audit_batch_no not like", value, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoIn(List<String> values) {
            addCriterion("audit_batch_no in", values, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoNotIn(List<String> values) {
            addCriterion("audit_batch_no not in", values, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoBetween(String value1, String value2) {
            addCriterion("audit_batch_no between", value1, value2, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoNotBetween(String value1, String value2) {
            addCriterion("audit_batch_no not between", value1, value2, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditDescIsNull() {
            addCriterion("audit_desc is null");
            return (Criteria) this;
        }

        public Criteria andAuditDescIsNotNull() {
            addCriterion("audit_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDescEqualTo(String value) {
            addCriterion("audit_desc =", value, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andAuditDescNotEqualTo(String value) {
            addCriterion("audit_desc <>", value, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andAuditDescGreaterThan(String value) {
            addCriterion("audit_desc >", value, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andAuditDescGreaterThanOrEqualTo(String value) {
            addCriterion("audit_desc >=", value, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andAuditDescLessThan(String value) {
            addCriterion("audit_desc <", value, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andAuditDescLessThanOrEqualTo(String value) {
            addCriterion("audit_desc <=", value, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andAuditDescLike(String value) {
            addCriterion("audit_desc like", value, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andAuditDescNotLike(String value) {
            addCriterion("audit_desc not like", value, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andAuditDescIn(List<String> values) {
            addCriterion("audit_desc in", values, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andAuditDescNotIn(List<String> values) {
            addCriterion("audit_desc not in", values, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andAuditDescBetween(String value1, String value2) {
            addCriterion("audit_desc between", value1, value2, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andAuditDescNotBetween(String value1, String value2) {
            addCriterion("audit_desc not between", value1, value2, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescIsNull() {
            addCriterion("refund_desc is null");
            return (Criteria) this;
        }

        public Criteria andRefundDescIsNotNull() {
            addCriterion("refund_desc is not null");
            return (Criteria) this;
        }

        public Criteria andRefundDescEqualTo(String value) {
            addCriterion("refund_desc =", value, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescNotEqualTo(String value) {
            addCriterion("refund_desc <>", value, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescGreaterThan(String value) {
            addCriterion("refund_desc >", value, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescGreaterThanOrEqualTo(String value) {
            addCriterion("refund_desc >=", value, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescLessThan(String value) {
            addCriterion("refund_desc <", value, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescLessThanOrEqualTo(String value) {
            addCriterion("refund_desc <=", value, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescLike(String value) {
            addCriterion("refund_desc like", value, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescNotLike(String value) {
            addCriterion("refund_desc not like", value, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescIn(List<String> values) {
            addCriterion("refund_desc in", values, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescNotIn(List<String> values) {
            addCriterion("refund_desc not in", values, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescBetween(String value1, String value2) {
            addCriterion("refund_desc between", value1, value2, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescNotBetween(String value1, String value2) {
            addCriterion("refund_desc not between", value1, value2, "refundDesc");
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

        public Criteria andRefundTimeIsNull() {
            addCriterion("refund_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNotNull() {
            addCriterion("refund_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeEqualTo(Date value) {
            addCriterion("refund_time =", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotEqualTo(Date value) {
            addCriterion("refund_time <>", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThan(Date value) {
            addCriterion("refund_time >", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_time >=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThan(Date value) {
            addCriterion("refund_time <", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_time <=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIn(List<Date> values) {
            addCriterion("refund_time in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotIn(List<Date> values) {
            addCriterion("refund_time not in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeBetween(Date value1, Date value2) {
            addCriterion("refund_time between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_time not between", value1, value2, "refundTime");
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