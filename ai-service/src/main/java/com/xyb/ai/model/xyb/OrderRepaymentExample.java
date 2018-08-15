package com.xyb.ai.model.xyb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderRepaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderRepaymentExample() {
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

        public Criteria andRepaymentNoIsNull() {
            addCriterion("repayment_no is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoIsNotNull() {
            addCriterion("repayment_no is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoEqualTo(String value) {
            addCriterion("repayment_no =", value, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoNotEqualTo(String value) {
            addCriterion("repayment_no <>", value, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoGreaterThan(String value) {
            addCriterion("repayment_no >", value, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_no >=", value, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoLessThan(String value) {
            addCriterion("repayment_no <", value, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoLessThanOrEqualTo(String value) {
            addCriterion("repayment_no <=", value, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoLike(String value) {
            addCriterion("repayment_no like", value, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoNotLike(String value) {
            addCriterion("repayment_no not like", value, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoIn(List<String> values) {
            addCriterion("repayment_no in", values, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoNotIn(List<String> values) {
            addCriterion("repayment_no not in", values, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoBetween(String value1, String value2) {
            addCriterion("repayment_no between", value1, value2, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoNotBetween(String value1, String value2) {
            addCriterion("repayment_no not between", value1, value2, "repaymentNo");
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

        public Criteria andRepaymentTimeIsNull() {
            addCriterion("repayment_time is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeIsNotNull() {
            addCriterion("repayment_time is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeEqualTo(Date value) {
            addCriterion("repayment_time =", value, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeNotEqualTo(Date value) {
            addCriterion("repayment_time <>", value, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeGreaterThan(Date value) {
            addCriterion("repayment_time >", value, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("repayment_time >=", value, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeLessThan(Date value) {
            addCriterion("repayment_time <", value, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("repayment_time <=", value, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeIn(List<Date> values) {
            addCriterion("repayment_time in", values, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeNotIn(List<Date> values) {
            addCriterion("repayment_time not in", values, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeBetween(Date value1, Date value2) {
            addCriterion("repayment_time between", value1, value2, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("repayment_time not between", value1, value2, "repaymentTime");
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