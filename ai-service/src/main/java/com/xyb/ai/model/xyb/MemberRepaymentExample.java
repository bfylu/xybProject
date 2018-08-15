package com.xyb.ai.model.xyb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberRepaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberRepaymentExample() {
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

        public Criteria andRefBillNoIsNull() {
            addCriterion("ref_bill_no is null");
            return (Criteria) this;
        }

        public Criteria andRefBillNoIsNotNull() {
            addCriterion("ref_bill_no is not null");
            return (Criteria) this;
        }

        public Criteria andRefBillNoEqualTo(String value) {
            addCriterion("ref_bill_no =", value, "refBillNo");
            return (Criteria) this;
        }

        public Criteria andRefBillNoNotEqualTo(String value) {
            addCriterion("ref_bill_no <>", value, "refBillNo");
            return (Criteria) this;
        }

        public Criteria andRefBillNoGreaterThan(String value) {
            addCriterion("ref_bill_no >", value, "refBillNo");
            return (Criteria) this;
        }

        public Criteria andRefBillNoGreaterThanOrEqualTo(String value) {
            addCriterion("ref_bill_no >=", value, "refBillNo");
            return (Criteria) this;
        }

        public Criteria andRefBillNoLessThan(String value) {
            addCriterion("ref_bill_no <", value, "refBillNo");
            return (Criteria) this;
        }

        public Criteria andRefBillNoLessThanOrEqualTo(String value) {
            addCriterion("ref_bill_no <=", value, "refBillNo");
            return (Criteria) this;
        }

        public Criteria andRefBillNoLike(String value) {
            addCriterion("ref_bill_no like", value, "refBillNo");
            return (Criteria) this;
        }

        public Criteria andRefBillNoNotLike(String value) {
            addCriterion("ref_bill_no not like", value, "refBillNo");
            return (Criteria) this;
        }

        public Criteria andRefBillNoIn(List<String> values) {
            addCriterion("ref_bill_no in", values, "refBillNo");
            return (Criteria) this;
        }

        public Criteria andRefBillNoNotIn(List<String> values) {
            addCriterion("ref_bill_no not in", values, "refBillNo");
            return (Criteria) this;
        }

        public Criteria andRefBillNoBetween(String value1, String value2) {
            addCriterion("ref_bill_no between", value1, value2, "refBillNo");
            return (Criteria) this;
        }

        public Criteria andRefBillNoNotBetween(String value1, String value2) {
            addCriterion("ref_bill_no not between", value1, value2, "refBillNo");
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

        public Criteria andInstallmentOrderNoIsNull() {
            addCriterion("installment_order_no is null");
            return (Criteria) this;
        }

        public Criteria andInstallmentOrderNoIsNotNull() {
            addCriterion("installment_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andInstallmentOrderNoEqualTo(String value) {
            addCriterion("installment_order_no =", value, "installmentOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallmentOrderNoNotEqualTo(String value) {
            addCriterion("installment_order_no <>", value, "installmentOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallmentOrderNoGreaterThan(String value) {
            addCriterion("installment_order_no >", value, "installmentOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallmentOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("installment_order_no >=", value, "installmentOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallmentOrderNoLessThan(String value) {
            addCriterion("installment_order_no <", value, "installmentOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallmentOrderNoLessThanOrEqualTo(String value) {
            addCriterion("installment_order_no <=", value, "installmentOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallmentOrderNoLike(String value) {
            addCriterion("installment_order_no like", value, "installmentOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallmentOrderNoNotLike(String value) {
            addCriterion("installment_order_no not like", value, "installmentOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallmentOrderNoIn(List<String> values) {
            addCriterion("installment_order_no in", values, "installmentOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallmentOrderNoNotIn(List<String> values) {
            addCriterion("installment_order_no not in", values, "installmentOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallmentOrderNoBetween(String value1, String value2) {
            addCriterion("installment_order_no between", value1, value2, "installmentOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallmentOrderNoNotBetween(String value1, String value2) {
            addCriterion("installment_order_no not between", value1, value2, "installmentOrderNo");
            return (Criteria) this;
        }

        public Criteria andTradeOrderNoIsNull() {
            addCriterion("trade_order_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeOrderNoIsNotNull() {
            addCriterion("trade_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeOrderNoEqualTo(String value) {
            addCriterion("trade_order_no =", value, "tradeOrderNo");
            return (Criteria) this;
        }

        public Criteria andTradeOrderNoNotEqualTo(String value) {
            addCriterion("trade_order_no <>", value, "tradeOrderNo");
            return (Criteria) this;
        }

        public Criteria andTradeOrderNoGreaterThan(String value) {
            addCriterion("trade_order_no >", value, "tradeOrderNo");
            return (Criteria) this;
        }

        public Criteria andTradeOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_order_no >=", value, "tradeOrderNo");
            return (Criteria) this;
        }

        public Criteria andTradeOrderNoLessThan(String value) {
            addCriterion("trade_order_no <", value, "tradeOrderNo");
            return (Criteria) this;
        }

        public Criteria andTradeOrderNoLessThanOrEqualTo(String value) {
            addCriterion("trade_order_no <=", value, "tradeOrderNo");
            return (Criteria) this;
        }

        public Criteria andTradeOrderNoLike(String value) {
            addCriterion("trade_order_no like", value, "tradeOrderNo");
            return (Criteria) this;
        }

        public Criteria andTradeOrderNoNotLike(String value) {
            addCriterion("trade_order_no not like", value, "tradeOrderNo");
            return (Criteria) this;
        }

        public Criteria andTradeOrderNoIn(List<String> values) {
            addCriterion("trade_order_no in", values, "tradeOrderNo");
            return (Criteria) this;
        }

        public Criteria andTradeOrderNoNotIn(List<String> values) {
            addCriterion("trade_order_no not in", values, "tradeOrderNo");
            return (Criteria) this;
        }

        public Criteria andTradeOrderNoBetween(String value1, String value2) {
            addCriterion("trade_order_no between", value1, value2, "tradeOrderNo");
            return (Criteria) this;
        }

        public Criteria andTradeOrderNoNotBetween(String value1, String value2) {
            addCriterion("trade_order_no not between", value1, value2, "tradeOrderNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountIsNull() {
            addCriterion("repayment_amount is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountIsNotNull() {
            addCriterion("repayment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountEqualTo(BigDecimal value) {
            addCriterion("repayment_amount =", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountNotEqualTo(BigDecimal value) {
            addCriterion("repayment_amount <>", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountGreaterThan(BigDecimal value) {
            addCriterion("repayment_amount >", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_amount >=", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountLessThan(BigDecimal value) {
            addCriterion("repayment_amount <", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_amount <=", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountIn(List<BigDecimal> values) {
            addCriterion("repayment_amount in", values, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountNotIn(List<BigDecimal> values) {
            addCriterion("repayment_amount not in", values, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_amount between", value1, value2, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_amount not between", value1, value2, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIsNull() {
            addCriterion("repayment_date is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIsNotNull() {
            addCriterion("repayment_date is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateEqualTo(Date value) {
            addCriterion("repayment_date =", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotEqualTo(Date value) {
            addCriterion("repayment_date <>", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateGreaterThan(Date value) {
            addCriterion("repayment_date >", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("repayment_date >=", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateLessThan(Date value) {
            addCriterion("repayment_date <", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateLessThanOrEqualTo(Date value) {
            addCriterion("repayment_date <=", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIn(List<Date> values) {
            addCriterion("repayment_date in", values, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotIn(List<Date> values) {
            addCriterion("repayment_date not in", values, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateBetween(Date value1, Date value2) {
            addCriterion("repayment_date between", value1, value2, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotBetween(Date value1, Date value2) {
            addCriterion("repayment_date not between", value1, value2, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andIsFinishIsNull() {
            addCriterion("is_finish is null");
            return (Criteria) this;
        }

        public Criteria andIsFinishIsNotNull() {
            addCriterion("is_finish is not null");
            return (Criteria) this;
        }

        public Criteria andIsFinishEqualTo(String value) {
            addCriterion("is_finish =", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotEqualTo(String value) {
            addCriterion("is_finish <>", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishGreaterThan(String value) {
            addCriterion("is_finish >", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishGreaterThanOrEqualTo(String value) {
            addCriterion("is_finish >=", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishLessThan(String value) {
            addCriterion("is_finish <", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishLessThanOrEqualTo(String value) {
            addCriterion("is_finish <=", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishLike(String value) {
            addCriterion("is_finish like", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotLike(String value) {
            addCriterion("is_finish not like", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishIn(List<String> values) {
            addCriterion("is_finish in", values, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotIn(List<String> values) {
            addCriterion("is_finish not in", values, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishBetween(String value1, String value2) {
            addCriterion("is_finish between", value1, value2, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotBetween(String value1, String value2) {
            addCriterion("is_finish not between", value1, value2, "isFinish");
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