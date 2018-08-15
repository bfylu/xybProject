package com.xyb.shop.model.xyb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberBillDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberBillDetailExample() {
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

        public Criteria andBillNoIsNull() {
            addCriterion("bill_no is null");
            return (Criteria) this;
        }

        public Criteria andBillNoIsNotNull() {
            addCriterion("bill_no is not null");
            return (Criteria) this;
        }

        public Criteria andBillNoEqualTo(String value) {
            addCriterion("bill_no =", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotEqualTo(String value) {
            addCriterion("bill_no <>", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoGreaterThan(String value) {
            addCriterion("bill_no >", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoGreaterThanOrEqualTo(String value) {
            addCriterion("bill_no >=", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLessThan(String value) {
            addCriterion("bill_no <", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLessThanOrEqualTo(String value) {
            addCriterion("bill_no <=", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLike(String value) {
            addCriterion("bill_no like", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotLike(String value) {
            addCriterion("bill_no not like", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoIn(List<String> values) {
            addCriterion("bill_no in", values, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotIn(List<String> values) {
            addCriterion("bill_no not in", values, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoBetween(String value1, String value2) {
            addCriterion("bill_no between", value1, value2, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotBetween(String value1, String value2) {
            addCriterion("bill_no not between", value1, value2, "billNo");
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

        public Criteria andBillDateIsNull() {
            addCriterion("bill_date is null");
            return (Criteria) this;
        }

        public Criteria andBillDateIsNotNull() {
            addCriterion("bill_date is not null");
            return (Criteria) this;
        }

        public Criteria andBillDateEqualTo(Date value) {
            addCriterionForJDBCDate("bill_date =", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("bill_date <>", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateGreaterThan(Date value) {
            addCriterionForJDBCDate("bill_date >", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bill_date >=", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateLessThan(Date value) {
            addCriterionForJDBCDate("bill_date <", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bill_date <=", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateIn(List<Date> values) {
            addCriterionForJDBCDate("bill_date in", values, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("bill_date not in", values, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bill_date between", value1, value2, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bill_date not between", value1, value2, "billDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNull() {
            addCriterion("begin_date is null");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNotNull() {
            addCriterion("begin_date is not null");
            return (Criteria) this;
        }

        public Criteria andBeginDateEqualTo(Date value) {
            addCriterion("begin_date =", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotEqualTo(Date value) {
            addCriterion("begin_date <>", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThan(Date value) {
            addCriterion("begin_date >", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_date >=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThan(Date value) {
            addCriterion("begin_date <", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("begin_date <=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateIn(List<Date> values) {
            addCriterion("begin_date in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotIn(List<Date> values) {
            addCriterion("begin_date not in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateBetween(Date value1, Date value2) {
            addCriterion("begin_date between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("begin_date not between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andBillAmountIsNull() {
            addCriterion("bill_amount is null");
            return (Criteria) this;
        }

        public Criteria andBillAmountIsNotNull() {
            addCriterion("bill_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBillAmountEqualTo(BigDecimal value) {
            addCriterion("bill_amount =", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountNotEqualTo(BigDecimal value) {
            addCriterion("bill_amount <>", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountGreaterThan(BigDecimal value) {
            addCriterion("bill_amount >", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bill_amount >=", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountLessThan(BigDecimal value) {
            addCriterion("bill_amount <", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bill_amount <=", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountIn(List<BigDecimal> values) {
            addCriterion("bill_amount in", values, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountNotIn(List<BigDecimal> values) {
            addCriterion("bill_amount not in", values, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bill_amount between", value1, value2, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bill_amount not between", value1, value2, "billAmount");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountIsNull() {
            addCriterion("total_charge_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountIsNotNull() {
            addCriterion("total_charge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountEqualTo(BigDecimal value) {
            addCriterion("total_charge_amount =", value, "totalChargeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_charge_amount <>", value, "totalChargeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountGreaterThan(BigDecimal value) {
            addCriterion("total_charge_amount >", value, "totalChargeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_charge_amount >=", value, "totalChargeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountLessThan(BigDecimal value) {
            addCriterion("total_charge_amount <", value, "totalChargeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_charge_amount <=", value, "totalChargeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountIn(List<BigDecimal> values) {
            addCriterion("total_charge_amount in", values, "totalChargeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_charge_amount not in", values, "totalChargeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_charge_amount between", value1, value2, "totalChargeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalChargeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_charge_amount not between", value1, value2, "totalChargeAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueDayIsNull() {
            addCriterion("overdue_day is null");
            return (Criteria) this;
        }

        public Criteria andOverdueDayIsNotNull() {
            addCriterion("overdue_day is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueDayEqualTo(Integer value) {
            addCriterion("overdue_day =", value, "overdueDay");
            return (Criteria) this;
        }

        public Criteria andOverdueDayNotEqualTo(Integer value) {
            addCriterion("overdue_day <>", value, "overdueDay");
            return (Criteria) this;
        }

        public Criteria andOverdueDayGreaterThan(Integer value) {
            addCriterion("overdue_day >", value, "overdueDay");
            return (Criteria) this;
        }

        public Criteria andOverdueDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("overdue_day >=", value, "overdueDay");
            return (Criteria) this;
        }

        public Criteria andOverdueDayLessThan(Integer value) {
            addCriterion("overdue_day <", value, "overdueDay");
            return (Criteria) this;
        }

        public Criteria andOverdueDayLessThanOrEqualTo(Integer value) {
            addCriterion("overdue_day <=", value, "overdueDay");
            return (Criteria) this;
        }

        public Criteria andOverdueDayIn(List<Integer> values) {
            addCriterion("overdue_day in", values, "overdueDay");
            return (Criteria) this;
        }

        public Criteria andOverdueDayNotIn(List<Integer> values) {
            addCriterion("overdue_day not in", values, "overdueDay");
            return (Criteria) this;
        }

        public Criteria andOverdueDayBetween(Integer value1, Integer value2) {
            addCriterion("overdue_day between", value1, value2, "overdueDay");
            return (Criteria) this;
        }

        public Criteria andOverdueDayNotBetween(Integer value1, Integer value2) {
            addCriterion("overdue_day not between", value1, value2, "overdueDay");
            return (Criteria) this;
        }

        public Criteria andOverdueChargeAmountIsNull() {
            addCriterion("overdue_charge_amount is null");
            return (Criteria) this;
        }

        public Criteria andOverdueChargeAmountIsNotNull() {
            addCriterion("overdue_charge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueChargeAmountEqualTo(BigDecimal value) {
            addCriterion("overdue_charge_amount =", value, "overdueChargeAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueChargeAmountNotEqualTo(BigDecimal value) {
            addCriterion("overdue_charge_amount <>", value, "overdueChargeAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueChargeAmountGreaterThan(BigDecimal value) {
            addCriterion("overdue_charge_amount >", value, "overdueChargeAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueChargeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_charge_amount >=", value, "overdueChargeAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueChargeAmountLessThan(BigDecimal value) {
            addCriterion("overdue_charge_amount <", value, "overdueChargeAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueChargeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_charge_amount <=", value, "overdueChargeAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueChargeAmountIn(List<BigDecimal> values) {
            addCriterion("overdue_charge_amount in", values, "overdueChargeAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueChargeAmountNotIn(List<BigDecimal> values) {
            addCriterion("overdue_charge_amount not in", values, "overdueChargeAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueChargeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_charge_amount between", value1, value2, "overdueChargeAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueChargeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_charge_amount not between", value1, value2, "overdueChargeAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalAmountIsNull() {
            addCriterion("repayment_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalAmountIsNotNull() {
            addCriterion("repayment_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalAmountEqualTo(BigDecimal value) {
            addCriterion("repayment_total_amount =", value, "repaymentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("repayment_total_amount <>", value, "repaymentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("repayment_total_amount >", value, "repaymentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_total_amount >=", value, "repaymentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalAmountLessThan(BigDecimal value) {
            addCriterion("repayment_total_amount <", value, "repaymentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_total_amount <=", value, "repaymentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalAmountIn(List<BigDecimal> values) {
            addCriterion("repayment_total_amount in", values, "repaymentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("repayment_total_amount not in", values, "repaymentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_total_amount between", value1, value2, "repaymentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_total_amount not between", value1, value2, "repaymentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andHasInstallmentIsNull() {
            addCriterion("has_installment is null");
            return (Criteria) this;
        }

        public Criteria andHasInstallmentIsNotNull() {
            addCriterion("has_installment is not null");
            return (Criteria) this;
        }

        public Criteria andHasInstallmentEqualTo(String value) {
            addCriterion("has_installment =", value, "hasInstallment");
            return (Criteria) this;
        }

        public Criteria andHasInstallmentNotEqualTo(String value) {
            addCriterion("has_installment <>", value, "hasInstallment");
            return (Criteria) this;
        }

        public Criteria andHasInstallmentGreaterThan(String value) {
            addCriterion("has_installment >", value, "hasInstallment");
            return (Criteria) this;
        }

        public Criteria andHasInstallmentGreaterThanOrEqualTo(String value) {
            addCriterion("has_installment >=", value, "hasInstallment");
            return (Criteria) this;
        }

        public Criteria andHasInstallmentLessThan(String value) {
            addCriterion("has_installment <", value, "hasInstallment");
            return (Criteria) this;
        }

        public Criteria andHasInstallmentLessThanOrEqualTo(String value) {
            addCriterion("has_installment <=", value, "hasInstallment");
            return (Criteria) this;
        }

        public Criteria andHasInstallmentLike(String value) {
            addCriterion("has_installment like", value, "hasInstallment");
            return (Criteria) this;
        }

        public Criteria andHasInstallmentNotLike(String value) {
            addCriterion("has_installment not like", value, "hasInstallment");
            return (Criteria) this;
        }

        public Criteria andHasInstallmentIn(List<String> values) {
            addCriterion("has_installment in", values, "hasInstallment");
            return (Criteria) this;
        }

        public Criteria andHasInstallmentNotIn(List<String> values) {
            addCriterion("has_installment not in", values, "hasInstallment");
            return (Criteria) this;
        }

        public Criteria andHasInstallmentBetween(String value1, String value2) {
            addCriterion("has_installment between", value1, value2, "hasInstallment");
            return (Criteria) this;
        }

        public Criteria andHasInstallmentNotBetween(String value1, String value2) {
            addCriterion("has_installment not between", value1, value2, "hasInstallment");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNull() {
            addCriterion("bill_status is null");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNotNull() {
            addCriterion("bill_status is not null");
            return (Criteria) this;
        }

        public Criteria andBillStatusEqualTo(Integer value) {
            addCriterion("bill_status =", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotEqualTo(Integer value) {
            addCriterion("bill_status <>", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThan(Integer value) {
            addCriterion("bill_status >", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_status >=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThan(Integer value) {
            addCriterion("bill_status <", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThanOrEqualTo(Integer value) {
            addCriterion("bill_status <=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusIn(List<Integer> values) {
            addCriterion("bill_status in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotIn(List<Integer> values) {
            addCriterion("bill_status not in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusBetween(Integer value1, Integer value2) {
            addCriterion("bill_status between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_status not between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentDataIsNull() {
            addCriterion("repayment_data is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDataIsNotNull() {
            addCriterion("repayment_data is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDataEqualTo(Date value) {
            addCriterionForJDBCDate("repayment_data =", value, "repaymentData");
            return (Criteria) this;
        }

        public Criteria andRepaymentDataNotEqualTo(Date value) {
            addCriterionForJDBCDate("repayment_data <>", value, "repaymentData");
            return (Criteria) this;
        }

        public Criteria andRepaymentDataGreaterThan(Date value) {
            addCriterionForJDBCDate("repayment_data >", value, "repaymentData");
            return (Criteria) this;
        }

        public Criteria andRepaymentDataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repayment_data >=", value, "repaymentData");
            return (Criteria) this;
        }

        public Criteria andRepaymentDataLessThan(Date value) {
            addCriterionForJDBCDate("repayment_data <", value, "repaymentData");
            return (Criteria) this;
        }

        public Criteria andRepaymentDataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repayment_data <=", value, "repaymentData");
            return (Criteria) this;
        }

        public Criteria andRepaymentDataIn(List<Date> values) {
            addCriterionForJDBCDate("repayment_data in", values, "repaymentData");
            return (Criteria) this;
        }

        public Criteria andRepaymentDataNotIn(List<Date> values) {
            addCriterionForJDBCDate("repayment_data not in", values, "repaymentData");
            return (Criteria) this;
        }

        public Criteria andRepaymentDataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repayment_data between", value1, value2, "repaymentData");
            return (Criteria) this;
        }

        public Criteria andRepaymentDataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repayment_data not between", value1, value2, "repaymentData");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusIsNull() {
            addCriterion("repayment_status is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusIsNotNull() {
            addCriterion("repayment_status is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusEqualTo(Integer value) {
            addCriterion("repayment_status =", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusNotEqualTo(Integer value) {
            addCriterion("repayment_status <>", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusGreaterThan(Integer value) {
            addCriterion("repayment_status >", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("repayment_status >=", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusLessThan(Integer value) {
            addCriterion("repayment_status <", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("repayment_status <=", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusIn(List<Integer> values) {
            addCriterion("repayment_status in", values, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusNotIn(List<Integer> values) {
            addCriterion("repayment_status not in", values, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusBetween(Integer value1, Integer value2) {
            addCriterion("repayment_status between", value1, value2, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("repayment_status not between", value1, value2, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andInstallmentTotalAmountIsNull() {
            addCriterion("installment_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andInstallmentTotalAmountIsNotNull() {
            addCriterion("installment_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInstallmentTotalAmountEqualTo(Long value) {
            addCriterion("installment_total_amount =", value, "installmentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andInstallmentTotalAmountNotEqualTo(Long value) {
            addCriterion("installment_total_amount <>", value, "installmentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andInstallmentTotalAmountGreaterThan(Long value) {
            addCriterion("installment_total_amount >", value, "installmentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andInstallmentTotalAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("installment_total_amount >=", value, "installmentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andInstallmentTotalAmountLessThan(Long value) {
            addCriterion("installment_total_amount <", value, "installmentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andInstallmentTotalAmountLessThanOrEqualTo(Long value) {
            addCriterion("installment_total_amount <=", value, "installmentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andInstallmentTotalAmountIn(List<Long> values) {
            addCriterion("installment_total_amount in", values, "installmentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andInstallmentTotalAmountNotIn(List<Long> values) {
            addCriterion("installment_total_amount not in", values, "installmentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andInstallmentTotalAmountBetween(Long value1, Long value2) {
            addCriterion("installment_total_amount between", value1, value2, "installmentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andInstallmentTotalAmountNotBetween(Long value1, Long value2) {
            addCriterion("installment_total_amount not between", value1, value2, "installmentTotalAmount");
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