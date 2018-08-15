package com.xyb.shop.model.xyb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MallSellOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MallSellOrderExample() {
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

        public Criteria andSellerMerCodeIsNull() {
            addCriterion("seller_mer_code is null");
            return (Criteria) this;
        }

        public Criteria andSellerMerCodeIsNotNull() {
            addCriterion("seller_mer_code is not null");
            return (Criteria) this;
        }

        public Criteria andSellerMerCodeEqualTo(String value) {
            addCriterion("seller_mer_code =", value, "sellerMerCode");
            return (Criteria) this;
        }

        public Criteria andSellerMerCodeNotEqualTo(String value) {
            addCriterion("seller_mer_code <>", value, "sellerMerCode");
            return (Criteria) this;
        }

        public Criteria andSellerMerCodeGreaterThan(String value) {
            addCriterion("seller_mer_code >", value, "sellerMerCode");
            return (Criteria) this;
        }

        public Criteria andSellerMerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("seller_mer_code >=", value, "sellerMerCode");
            return (Criteria) this;
        }

        public Criteria andSellerMerCodeLessThan(String value) {
            addCriterion("seller_mer_code <", value, "sellerMerCode");
            return (Criteria) this;
        }

        public Criteria andSellerMerCodeLessThanOrEqualTo(String value) {
            addCriterion("seller_mer_code <=", value, "sellerMerCode");
            return (Criteria) this;
        }

        public Criteria andSellerMerCodeLike(String value) {
            addCriterion("seller_mer_code like", value, "sellerMerCode");
            return (Criteria) this;
        }

        public Criteria andSellerMerCodeNotLike(String value) {
            addCriterion("seller_mer_code not like", value, "sellerMerCode");
            return (Criteria) this;
        }

        public Criteria andSellerMerCodeIn(List<String> values) {
            addCriterion("seller_mer_code in", values, "sellerMerCode");
            return (Criteria) this;
        }

        public Criteria andSellerMerCodeNotIn(List<String> values) {
            addCriterion("seller_mer_code not in", values, "sellerMerCode");
            return (Criteria) this;
        }

        public Criteria andSellerMerCodeBetween(String value1, String value2) {
            addCriterion("seller_mer_code between", value1, value2, "sellerMerCode");
            return (Criteria) this;
        }

        public Criteria andSellerMerCodeNotBetween(String value1, String value2) {
            addCriterion("seller_mer_code not between", value1, value2, "sellerMerCode");
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

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("expire_time is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(Date value) {
            addCriterion("expire_time =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(Date value) {
            addCriterion("expire_time <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(Date value) {
            addCriterion("expire_time >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expire_time >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(Date value) {
            addCriterion("expire_time <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("expire_time <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<Date> values) {
            addCriterion("expire_time in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<Date> values) {
            addCriterion("expire_time not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(Date value1, Date value2) {
            addCriterion("expire_time between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("expire_time not between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andOrderDescIsNull() {
            addCriterion("order_desc is null");
            return (Criteria) this;
        }

        public Criteria andOrderDescIsNotNull() {
            addCriterion("order_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDescEqualTo(String value) {
            addCriterion("order_desc =", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotEqualTo(String value) {
            addCriterion("order_desc <>", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescGreaterThan(String value) {
            addCriterion("order_desc >", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescGreaterThanOrEqualTo(String value) {
            addCriterion("order_desc >=", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLessThan(String value) {
            addCriterion("order_desc <", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLessThanOrEqualTo(String value) {
            addCriterion("order_desc <=", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLike(String value) {
            addCriterion("order_desc like", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotLike(String value) {
            addCriterion("order_desc not like", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescIn(List<String> values) {
            addCriterion("order_desc in", values, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotIn(List<String> values) {
            addCriterion("order_desc not in", values, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescBetween(String value1, String value2) {
            addCriterion("order_desc between", value1, value2, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotBetween(String value1, String value2) {
            addCriterion("order_desc not between", value1, value2, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andSellerOrderStatusIsNull() {
            addCriterion("seller_order_status is null");
            return (Criteria) this;
        }

        public Criteria andSellerOrderStatusIsNotNull() {
            addCriterion("seller_order_status is not null");
            return (Criteria) this;
        }

        public Criteria andSellerOrderStatusEqualTo(Integer value) {
            addCriterion("seller_order_status =", value, "sellerOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSellerOrderStatusNotEqualTo(Integer value) {
            addCriterion("seller_order_status <>", value, "sellerOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSellerOrderStatusGreaterThan(Integer value) {
            addCriterion("seller_order_status >", value, "sellerOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSellerOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_order_status >=", value, "sellerOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSellerOrderStatusLessThan(Integer value) {
            addCriterion("seller_order_status <", value, "sellerOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSellerOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("seller_order_status <=", value, "sellerOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSellerOrderStatusIn(List<Integer> values) {
            addCriterion("seller_order_status in", values, "sellerOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSellerOrderStatusNotIn(List<Integer> values) {
            addCriterion("seller_order_status not in", values, "sellerOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSellerOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("seller_order_status between", value1, value2, "sellerOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSellerOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_order_status not between", value1, value2, "sellerOrderStatus");
            return (Criteria) this;
        }

        public Criteria andTakeMethodIsNull() {
            addCriterion("take_method is null");
            return (Criteria) this;
        }

        public Criteria andTakeMethodIsNotNull() {
            addCriterion("take_method is not null");
            return (Criteria) this;
        }

        public Criteria andTakeMethodEqualTo(Integer value) {
            addCriterion("take_method =", value, "takeMethod");
            return (Criteria) this;
        }

        public Criteria andTakeMethodNotEqualTo(Integer value) {
            addCriterion("take_method <>", value, "takeMethod");
            return (Criteria) this;
        }

        public Criteria andTakeMethodGreaterThan(Integer value) {
            addCriterion("take_method >", value, "takeMethod");
            return (Criteria) this;
        }

        public Criteria andTakeMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("take_method >=", value, "takeMethod");
            return (Criteria) this;
        }

        public Criteria andTakeMethodLessThan(Integer value) {
            addCriterion("take_method <", value, "takeMethod");
            return (Criteria) this;
        }

        public Criteria andTakeMethodLessThanOrEqualTo(Integer value) {
            addCriterion("take_method <=", value, "takeMethod");
            return (Criteria) this;
        }

        public Criteria andTakeMethodIn(List<Integer> values) {
            addCriterion("take_method in", values, "takeMethod");
            return (Criteria) this;
        }

        public Criteria andTakeMethodNotIn(List<Integer> values) {
            addCriterion("take_method not in", values, "takeMethod");
            return (Criteria) this;
        }

        public Criteria andTakeMethodBetween(Integer value1, Integer value2) {
            addCriterion("take_method between", value1, value2, "takeMethod");
            return (Criteria) this;
        }

        public Criteria andTakeMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("take_method not between", value1, value2, "takeMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderNoIsNull() {
            addCriterion("payment_order_no is null");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderNoIsNotNull() {
            addCriterion("payment_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderNoEqualTo(String value) {
            addCriterion("payment_order_no =", value, "paymentOrderNo");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderNoNotEqualTo(String value) {
            addCriterion("payment_order_no <>", value, "paymentOrderNo");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderNoGreaterThan(String value) {
            addCriterion("payment_order_no >", value, "paymentOrderNo");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("payment_order_no >=", value, "paymentOrderNo");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderNoLessThan(String value) {
            addCriterion("payment_order_no <", value, "paymentOrderNo");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderNoLessThanOrEqualTo(String value) {
            addCriterion("payment_order_no <=", value, "paymentOrderNo");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderNoLike(String value) {
            addCriterion("payment_order_no like", value, "paymentOrderNo");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderNoNotLike(String value) {
            addCriterion("payment_order_no not like", value, "paymentOrderNo");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderNoIn(List<String> values) {
            addCriterion("payment_order_no in", values, "paymentOrderNo");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderNoNotIn(List<String> values) {
            addCriterion("payment_order_no not in", values, "paymentOrderNo");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderNoBetween(String value1, String value2) {
            addCriterion("payment_order_no between", value1, value2, "paymentOrderNo");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderNoNotBetween(String value1, String value2) {
            addCriterion("payment_order_no not between", value1, value2, "paymentOrderNo");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNull() {
            addCriterion("payment_amount is null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNotNull() {
            addCriterion("payment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountEqualTo(BigDecimal value) {
            addCriterion("payment_amount =", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotEqualTo(BigDecimal value) {
            addCriterion("payment_amount <>", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThan(BigDecimal value) {
            addCriterion("payment_amount >", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payment_amount >=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThan(BigDecimal value) {
            addCriterion("payment_amount <", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payment_amount <=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIn(List<BigDecimal> values) {
            addCriterion("payment_amount in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotIn(List<BigDecimal> values) {
            addCriterion("payment_amount not in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment_amount between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment_amount not between", value1, value2, "paymentAmount");
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

        public Criteria andGoodsSnapshotIdsIsNull() {
            addCriterion("goods_snapshot_ids is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsIsNotNull() {
            addCriterion("goods_snapshot_ids is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsEqualTo(String value) {
            addCriterion("goods_snapshot_ids =", value, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsNotEqualTo(String value) {
            addCriterion("goods_snapshot_ids <>", value, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsGreaterThan(String value) {
            addCriterion("goods_snapshot_ids >", value, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsGreaterThanOrEqualTo(String value) {
            addCriterion("goods_snapshot_ids >=", value, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsLessThan(String value) {
            addCriterion("goods_snapshot_ids <", value, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsLessThanOrEqualTo(String value) {
            addCriterion("goods_snapshot_ids <=", value, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsLike(String value) {
            addCriterion("goods_snapshot_ids like", value, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsNotLike(String value) {
            addCriterion("goods_snapshot_ids not like", value, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsIn(List<String> values) {
            addCriterion("goods_snapshot_ids in", values, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsNotIn(List<String> values) {
            addCriterion("goods_snapshot_ids not in", values, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsBetween(String value1, String value2) {
            addCriterion("goods_snapshot_ids between", value1, value2, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsNotBetween(String value1, String value2) {
            addCriterion("goods_snapshot_ids not between", value1, value2, "goodsSnapshotIds");
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNull() {
            addCriterion("user_tel is null");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNotNull() {
            addCriterion("user_tel is not null");
            return (Criteria) this;
        }

        public Criteria andUserTelEqualTo(String value) {
            addCriterion("user_tel =", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotEqualTo(String value) {
            addCriterion("user_tel <>", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThan(String value) {
            addCriterion("user_tel >", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThanOrEqualTo(String value) {
            addCriterion("user_tel >=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThan(String value) {
            addCriterion("user_tel <", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThanOrEqualTo(String value) {
            addCriterion("user_tel <=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLike(String value) {
            addCriterion("user_tel like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotLike(String value) {
            addCriterion("user_tel not like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelIn(List<String> values) {
            addCriterion("user_tel in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotIn(List<String> values) {
            addCriterion("user_tel not in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelBetween(String value1, String value2) {
            addCriterion("user_tel between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotBetween(String value1, String value2) {
            addCriterion("user_tel not between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("province_code is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("province_code is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(String value) {
            addCriterion("province_code =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(String value) {
            addCriterion("province_code <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(String value) {
            addCriterion("province_code >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("province_code >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(String value) {
            addCriterion("province_code <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("province_code <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLike(String value) {
            addCriterion("province_code like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotLike(String value) {
            addCriterion("province_code not like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<String> values) {
            addCriterion("province_code in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<String> values) {
            addCriterion("province_code not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(String value1, String value2) {
            addCriterion("province_code between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("province_code not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("area_code is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("area_code is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("area_code =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("area_code <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("area_code >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("area_code >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("area_code <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("area_code <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("area_code like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("area_code not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("area_code in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("area_code not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("area_code between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("area_code not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("post_code is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("post_code is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(Integer value) {
            addCriterion("post_code =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(Integer value) {
            addCriterion("post_code <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(Integer value) {
            addCriterion("post_code >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_code >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(Integer value) {
            addCriterion("post_code <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(Integer value) {
            addCriterion("post_code <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<Integer> values) {
            addCriterion("post_code in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<Integer> values) {
            addCriterion("post_code not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(Integer value1, Integer value2) {
            addCriterion("post_code between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("post_code not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIsNull() {
            addCriterion("is_invoice is null");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIsNotNull() {
            addCriterion("is_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceEqualTo(Integer value) {
            addCriterion("is_invoice =", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotEqualTo(Integer value) {
            addCriterion("is_invoice <>", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceGreaterThan(Integer value) {
            addCriterion("is_invoice >", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_invoice >=", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLessThan(Integer value) {
            addCriterion("is_invoice <", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLessThanOrEqualTo(Integer value) {
            addCriterion("is_invoice <=", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIn(List<Integer> values) {
            addCriterion("is_invoice in", values, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotIn(List<Integer> values) {
            addCriterion("is_invoice not in", values, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceBetween(Integer value1, Integer value2) {
            addCriterion("is_invoice between", value1, value2, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("is_invoice not between", value1, value2, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceClientIsNull() {
            addCriterion("invoice_client is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceClientIsNotNull() {
            addCriterion("invoice_client is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceClientEqualTo(String value) {
            addCriterion("invoice_client =", value, "invoiceClient");
            return (Criteria) this;
        }

        public Criteria andInvoiceClientNotEqualTo(String value) {
            addCriterion("invoice_client <>", value, "invoiceClient");
            return (Criteria) this;
        }

        public Criteria andInvoiceClientGreaterThan(String value) {
            addCriterion("invoice_client >", value, "invoiceClient");
            return (Criteria) this;
        }

        public Criteria andInvoiceClientGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_client >=", value, "invoiceClient");
            return (Criteria) this;
        }

        public Criteria andInvoiceClientLessThan(String value) {
            addCriterion("invoice_client <", value, "invoiceClient");
            return (Criteria) this;
        }

        public Criteria andInvoiceClientLessThanOrEqualTo(String value) {
            addCriterion("invoice_client <=", value, "invoiceClient");
            return (Criteria) this;
        }

        public Criteria andInvoiceClientLike(String value) {
            addCriterion("invoice_client like", value, "invoiceClient");
            return (Criteria) this;
        }

        public Criteria andInvoiceClientNotLike(String value) {
            addCriterion("invoice_client not like", value, "invoiceClient");
            return (Criteria) this;
        }

        public Criteria andInvoiceClientIn(List<String> values) {
            addCriterion("invoice_client in", values, "invoiceClient");
            return (Criteria) this;
        }

        public Criteria andInvoiceClientNotIn(List<String> values) {
            addCriterion("invoice_client not in", values, "invoiceClient");
            return (Criteria) this;
        }

        public Criteria andInvoiceClientBetween(String value1, String value2) {
            addCriterion("invoice_client between", value1, value2, "invoiceClient");
            return (Criteria) this;
        }

        public Criteria andInvoiceClientNotBetween(String value1, String value2) {
            addCriterion("invoice_client not between", value1, value2, "invoiceClient");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNull() {
            addCriterion("isdel is null");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNotNull() {
            addCriterion("isdel is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelEqualTo(Integer value) {
            addCriterion("isdel =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(Integer value) {
            addCriterion("isdel <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(Integer value) {
            addCriterion("isdel >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("isdel >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(Integer value) {
            addCriterion("isdel <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(Integer value) {
            addCriterion("isdel <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<Integer> values) {
            addCriterion("isdel in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<Integer> values) {
            addCriterion("isdel not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(Integer value1, Integer value2) {
            addCriterion("isdel between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(Integer value1, Integer value2) {
            addCriterion("isdel not between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseNoIsNull() {
            addCriterion("seller_close_cause_no is null");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseNoIsNotNull() {
            addCriterion("seller_close_cause_no is not null");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseNoEqualTo(String value) {
            addCriterion("seller_close_cause_no =", value, "sellerCloseCauseNo");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseNoNotEqualTo(String value) {
            addCriterion("seller_close_cause_no <>", value, "sellerCloseCauseNo");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseNoGreaterThan(String value) {
            addCriterion("seller_close_cause_no >", value, "sellerCloseCauseNo");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseNoGreaterThanOrEqualTo(String value) {
            addCriterion("seller_close_cause_no >=", value, "sellerCloseCauseNo");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseNoLessThan(String value) {
            addCriterion("seller_close_cause_no <", value, "sellerCloseCauseNo");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseNoLessThanOrEqualTo(String value) {
            addCriterion("seller_close_cause_no <=", value, "sellerCloseCauseNo");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseNoLike(String value) {
            addCriterion("seller_close_cause_no like", value, "sellerCloseCauseNo");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseNoNotLike(String value) {
            addCriterion("seller_close_cause_no not like", value, "sellerCloseCauseNo");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseNoIn(List<String> values) {
            addCriterion("seller_close_cause_no in", values, "sellerCloseCauseNo");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseNoNotIn(List<String> values) {
            addCriterion("seller_close_cause_no not in", values, "sellerCloseCauseNo");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseNoBetween(String value1, String value2) {
            addCriterion("seller_close_cause_no between", value1, value2, "sellerCloseCauseNo");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseNoNotBetween(String value1, String value2) {
            addCriterion("seller_close_cause_no not between", value1, value2, "sellerCloseCauseNo");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseIsNull() {
            addCriterion("seller_close_cause is null");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseIsNotNull() {
            addCriterion("seller_close_cause is not null");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseEqualTo(String value) {
            addCriterion("seller_close_cause =", value, "sellerCloseCause");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseNotEqualTo(String value) {
            addCriterion("seller_close_cause <>", value, "sellerCloseCause");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseGreaterThan(String value) {
            addCriterion("seller_close_cause >", value, "sellerCloseCause");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseGreaterThanOrEqualTo(String value) {
            addCriterion("seller_close_cause >=", value, "sellerCloseCause");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseLessThan(String value) {
            addCriterion("seller_close_cause <", value, "sellerCloseCause");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseLessThanOrEqualTo(String value) {
            addCriterion("seller_close_cause <=", value, "sellerCloseCause");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseLike(String value) {
            addCriterion("seller_close_cause like", value, "sellerCloseCause");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseNotLike(String value) {
            addCriterion("seller_close_cause not like", value, "sellerCloseCause");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseIn(List<String> values) {
            addCriterion("seller_close_cause in", values, "sellerCloseCause");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseNotIn(List<String> values) {
            addCriterion("seller_close_cause not in", values, "sellerCloseCause");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseBetween(String value1, String value2) {
            addCriterion("seller_close_cause between", value1, value2, "sellerCloseCause");
            return (Criteria) this;
        }

        public Criteria andSellerCloseCauseNotBetween(String value1, String value2) {
            addCriterion("seller_close_cause not between", value1, value2, "sellerCloseCause");
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