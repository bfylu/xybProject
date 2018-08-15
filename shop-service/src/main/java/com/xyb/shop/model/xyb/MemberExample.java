package com.xyb.shop.model.xyb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        public Criteria andInitCreditAmountIsNull() {
            addCriterion("init_credit_amount is null");
            return (Criteria) this;
        }

        public Criteria andInitCreditAmountIsNotNull() {
            addCriterion("init_credit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInitCreditAmountEqualTo(BigDecimal value) {
            addCriterion("init_credit_amount =", value, "initCreditAmount");
            return (Criteria) this;
        }

        public Criteria andInitCreditAmountNotEqualTo(BigDecimal value) {
            addCriterion("init_credit_amount <>", value, "initCreditAmount");
            return (Criteria) this;
        }

        public Criteria andInitCreditAmountGreaterThan(BigDecimal value) {
            addCriterion("init_credit_amount >", value, "initCreditAmount");
            return (Criteria) this;
        }

        public Criteria andInitCreditAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("init_credit_amount >=", value, "initCreditAmount");
            return (Criteria) this;
        }

        public Criteria andInitCreditAmountLessThan(BigDecimal value) {
            addCriterion("init_credit_amount <", value, "initCreditAmount");
            return (Criteria) this;
        }

        public Criteria andInitCreditAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("init_credit_amount <=", value, "initCreditAmount");
            return (Criteria) this;
        }

        public Criteria andInitCreditAmountIn(List<BigDecimal> values) {
            addCriterion("init_credit_amount in", values, "initCreditAmount");
            return (Criteria) this;
        }

        public Criteria andInitCreditAmountNotIn(List<BigDecimal> values) {
            addCriterion("init_credit_amount not in", values, "initCreditAmount");
            return (Criteria) this;
        }

        public Criteria andInitCreditAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("init_credit_amount between", value1, value2, "initCreditAmount");
            return (Criteria) this;
        }

        public Criteria andInitCreditAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("init_credit_amount not between", value1, value2, "initCreditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIsNull() {
            addCriterion("credit_amount is null");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIsNotNull() {
            addCriterion("credit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCreditAmountEqualTo(BigDecimal value) {
            addCriterion("credit_amount =", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotEqualTo(BigDecimal value) {
            addCriterion("credit_amount <>", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountGreaterThan(BigDecimal value) {
            addCriterion("credit_amount >", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_amount >=", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountLessThan(BigDecimal value) {
            addCriterion("credit_amount <", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_amount <=", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIn(List<BigDecimal> values) {
            addCriterion("credit_amount in", values, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotIn(List<BigDecimal> values) {
            addCriterion("credit_amount not in", values, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_amount between", value1, value2, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_amount not between", value1, value2, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountIsNull() {
            addCriterion("available_amount is null");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountIsNotNull() {
            addCriterion("available_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountEqualTo(BigDecimal value) {
            addCriterion("available_amount =", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountNotEqualTo(BigDecimal value) {
            addCriterion("available_amount <>", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountGreaterThan(BigDecimal value) {
            addCriterion("available_amount >", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("available_amount >=", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountLessThan(BigDecimal value) {
            addCriterion("available_amount <", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("available_amount <=", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountIn(List<BigDecimal> values) {
            addCriterion("available_amount in", values, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountNotIn(List<BigDecimal> values) {
            addCriterion("available_amount not in", values, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_amount between", value1, value2, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_amount not between", value1, value2, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andUsedAmountIsNull() {
            addCriterion("used_amount is null");
            return (Criteria) this;
        }

        public Criteria andUsedAmountIsNotNull() {
            addCriterion("used_amount is not null");
            return (Criteria) this;
        }

        public Criteria andUsedAmountEqualTo(BigDecimal value) {
            addCriterion("used_amount =", value, "usedAmount");
            return (Criteria) this;
        }

        public Criteria andUsedAmountNotEqualTo(BigDecimal value) {
            addCriterion("used_amount <>", value, "usedAmount");
            return (Criteria) this;
        }

        public Criteria andUsedAmountGreaterThan(BigDecimal value) {
            addCriterion("used_amount >", value, "usedAmount");
            return (Criteria) this;
        }

        public Criteria andUsedAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("used_amount >=", value, "usedAmount");
            return (Criteria) this;
        }

        public Criteria andUsedAmountLessThan(BigDecimal value) {
            addCriterion("used_amount <", value, "usedAmount");
            return (Criteria) this;
        }

        public Criteria andUsedAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("used_amount <=", value, "usedAmount");
            return (Criteria) this;
        }

        public Criteria andUsedAmountIn(List<BigDecimal> values) {
            addCriterion("used_amount in", values, "usedAmount");
            return (Criteria) this;
        }

        public Criteria andUsedAmountNotIn(List<BigDecimal> values) {
            addCriterion("used_amount not in", values, "usedAmount");
            return (Criteria) this;
        }

        public Criteria andUsedAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("used_amount between", value1, value2, "usedAmount");
            return (Criteria) this;
        }

        public Criteria andUsedAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("used_amount not between", value1, value2, "usedAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStateIsNull() {
            addCriterion("authorize_state is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStateIsNotNull() {
            addCriterion("authorize_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStateEqualTo(Integer value) {
            addCriterion("authorize_state =", value, "authorizeState");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStateNotEqualTo(Integer value) {
            addCriterion("authorize_state <>", value, "authorizeState");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStateGreaterThan(Integer value) {
            addCriterion("authorize_state >", value, "authorizeState");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("authorize_state >=", value, "authorizeState");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStateLessThan(Integer value) {
            addCriterion("authorize_state <", value, "authorizeState");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStateLessThanOrEqualTo(Integer value) {
            addCriterion("authorize_state <=", value, "authorizeState");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStateIn(List<Integer> values) {
            addCriterion("authorize_state in", values, "authorizeState");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStateNotIn(List<Integer> values) {
            addCriterion("authorize_state not in", values, "authorizeState");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStateBetween(Integer value1, Integer value2) {
            addCriterion("authorize_state between", value1, value2, "authorizeState");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("authorize_state not between", value1, value2, "authorizeState");
            return (Criteria) this;
        }

        public Criteria andCreateBillDayIsNull() {
            addCriterion("create_bill_day is null");
            return (Criteria) this;
        }

        public Criteria andCreateBillDayIsNotNull() {
            addCriterion("create_bill_day is not null");
            return (Criteria) this;
        }

        public Criteria andCreateBillDayEqualTo(Integer value) {
            addCriterion("create_bill_day =", value, "createBillDay");
            return (Criteria) this;
        }

        public Criteria andCreateBillDayNotEqualTo(Integer value) {
            addCriterion("create_bill_day <>", value, "createBillDay");
            return (Criteria) this;
        }

        public Criteria andCreateBillDayGreaterThan(Integer value) {
            addCriterion("create_bill_day >", value, "createBillDay");
            return (Criteria) this;
        }

        public Criteria andCreateBillDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_bill_day >=", value, "createBillDay");
            return (Criteria) this;
        }

        public Criteria andCreateBillDayLessThan(Integer value) {
            addCriterion("create_bill_day <", value, "createBillDay");
            return (Criteria) this;
        }

        public Criteria andCreateBillDayLessThanOrEqualTo(Integer value) {
            addCriterion("create_bill_day <=", value, "createBillDay");
            return (Criteria) this;
        }

        public Criteria andCreateBillDayIn(List<Integer> values) {
            addCriterion("create_bill_day in", values, "createBillDay");
            return (Criteria) this;
        }

        public Criteria andCreateBillDayNotIn(List<Integer> values) {
            addCriterion("create_bill_day not in", values, "createBillDay");
            return (Criteria) this;
        }

        public Criteria andCreateBillDayBetween(Integer value1, Integer value2) {
            addCriterion("create_bill_day between", value1, value2, "createBillDay");
            return (Criteria) this;
        }

        public Criteria andCreateBillDayNotBetween(Integer value1, Integer value2) {
            addCriterion("create_bill_day not between", value1, value2, "createBillDay");
            return (Criteria) this;
        }

        public Criteria andRepaymentDayIsNull() {
            addCriterion("repayment_day is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDayIsNotNull() {
            addCriterion("repayment_day is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDayEqualTo(Integer value) {
            addCriterion("repayment_day =", value, "repaymentDay");
            return (Criteria) this;
        }

        public Criteria andRepaymentDayNotEqualTo(Integer value) {
            addCriterion("repayment_day <>", value, "repaymentDay");
            return (Criteria) this;
        }

        public Criteria andRepaymentDayGreaterThan(Integer value) {
            addCriterion("repayment_day >", value, "repaymentDay");
            return (Criteria) this;
        }

        public Criteria andRepaymentDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("repayment_day >=", value, "repaymentDay");
            return (Criteria) this;
        }

        public Criteria andRepaymentDayLessThan(Integer value) {
            addCriterion("repayment_day <", value, "repaymentDay");
            return (Criteria) this;
        }

        public Criteria andRepaymentDayLessThanOrEqualTo(Integer value) {
            addCriterion("repayment_day <=", value, "repaymentDay");
            return (Criteria) this;
        }

        public Criteria andRepaymentDayIn(List<Integer> values) {
            addCriterion("repayment_day in", values, "repaymentDay");
            return (Criteria) this;
        }

        public Criteria andRepaymentDayNotIn(List<Integer> values) {
            addCriterion("repayment_day not in", values, "repaymentDay");
            return (Criteria) this;
        }

        public Criteria andRepaymentDayBetween(Integer value1, Integer value2) {
            addCriterion("repayment_day between", value1, value2, "repaymentDay");
            return (Criteria) this;
        }

        public Criteria andRepaymentDayNotBetween(Integer value1, Integer value2) {
            addCriterion("repayment_day not between", value1, value2, "repaymentDay");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoIsNull() {
            addCriterion("bank_card_ref_no is null");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoIsNotNull() {
            addCriterion("bank_card_ref_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoEqualTo(String value) {
            addCriterion("bank_card_ref_no =", value, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoNotEqualTo(String value) {
            addCriterion("bank_card_ref_no <>", value, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoGreaterThan(String value) {
            addCriterion("bank_card_ref_no >", value, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_ref_no >=", value, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoLessThan(String value) {
            addCriterion("bank_card_ref_no <", value, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoLessThanOrEqualTo(String value) {
            addCriterion("bank_card_ref_no <=", value, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoLike(String value) {
            addCriterion("bank_card_ref_no like", value, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoNotLike(String value) {
            addCriterion("bank_card_ref_no not like", value, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoIn(List<String> values) {
            addCriterion("bank_card_ref_no in", values, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoNotIn(List<String> values) {
            addCriterion("bank_card_ref_no not in", values, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoBetween(String value1, String value2) {
            addCriterion("bank_card_ref_no between", value1, value2, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoNotBetween(String value1, String value2) {
            addCriterion("bank_card_ref_no not between", value1, value2, "bankCardRefNo");
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

        public Criteria andExtInfoIsNull() {
            addCriterion("ext_info is null");
            return (Criteria) this;
        }

        public Criteria andExtInfoIsNotNull() {
            addCriterion("ext_info is not null");
            return (Criteria) this;
        }

        public Criteria andExtInfoEqualTo(String value) {
            addCriterion("ext_info =", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoNotEqualTo(String value) {
            addCriterion("ext_info <>", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoGreaterThan(String value) {
            addCriterion("ext_info >", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoGreaterThanOrEqualTo(String value) {
            addCriterion("ext_info >=", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoLessThan(String value) {
            addCriterion("ext_info <", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoLessThanOrEqualTo(String value) {
            addCriterion("ext_info <=", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoLike(String value) {
            addCriterion("ext_info like", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoNotLike(String value) {
            addCriterion("ext_info not like", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoIn(List<String> values) {
            addCriterion("ext_info in", values, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoNotIn(List<String> values) {
            addCriterion("ext_info not in", values, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoBetween(String value1, String value2) {
            addCriterion("ext_info between", value1, value2, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoNotBetween(String value1, String value2) {
            addCriterion("ext_info not between", value1, value2, "extInfo");
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