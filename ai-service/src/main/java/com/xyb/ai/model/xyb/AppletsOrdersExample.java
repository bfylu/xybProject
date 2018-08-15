package com.xyb.ai.model.xyb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppletsOrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppletsOrdersExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
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

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPicIsNull() {
            addCriterion("goods_pic is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPicIsNotNull() {
            addCriterion("goods_pic is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPicEqualTo(String value) {
            addCriterion("goods_pic =", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicNotEqualTo(String value) {
            addCriterion("goods_pic <>", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicGreaterThan(String value) {
            addCriterion("goods_pic >", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicGreaterThanOrEqualTo(String value) {
            addCriterion("goods_pic >=", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicLessThan(String value) {
            addCriterion("goods_pic <", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicLessThanOrEqualTo(String value) {
            addCriterion("goods_pic <=", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicLike(String value) {
            addCriterion("goods_pic like", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicNotLike(String value) {
            addCriterion("goods_pic not like", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicIn(List<String> values) {
            addCriterion("goods_pic in", values, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicNotIn(List<String> values) {
            addCriterion("goods_pic not in", values, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicBetween(String value1, String value2) {
            addCriterion("goods_pic between", value1, value2, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicNotBetween(String value1, String value2) {
            addCriterion("goods_pic not between", value1, value2, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIsNull() {
            addCriterion("goods_count is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIsNotNull() {
            addCriterion("goods_count is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountEqualTo(Integer value) {
            addCriterion("goods_count =", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotEqualTo(Integer value) {
            addCriterion("goods_count <>", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountGreaterThan(Integer value) {
            addCriterion("goods_count >", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_count >=", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountLessThan(Integer value) {
            addCriterion("goods_count <", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountLessThanOrEqualTo(Integer value) {
            addCriterion("goods_count <=", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIn(List<Integer> values) {
            addCriterion("goods_count in", values, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotIn(List<Integer> values) {
            addCriterion("goods_count not in", values, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountBetween(Integer value1, Integer value2) {
            addCriterion("goods_count between", value1, value2, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_count not between", value1, value2, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNull() {
            addCriterion("total_money is null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNotNull() {
            addCriterion("total_money is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyEqualTo(BigDecimal value) {
            addCriterion("total_money =", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotEqualTo(BigDecimal value) {
            addCriterion("total_money <>", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThan(BigDecimal value) {
            addCriterion("total_money >", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_money >=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThan(BigDecimal value) {
            addCriterion("total_money <", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_money <=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIn(List<BigDecimal> values) {
            addCriterion("total_money in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotIn(List<BigDecimal> values) {
            addCriterion("total_money not in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_money between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_money not between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andDeliverMoneyIsNull() {
            addCriterion("deliver_money is null");
            return (Criteria) this;
        }

        public Criteria andDeliverMoneyIsNotNull() {
            addCriterion("deliver_money is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverMoneyEqualTo(BigDecimal value) {
            addCriterion("deliver_money =", value, "deliverMoney");
            return (Criteria) this;
        }

        public Criteria andDeliverMoneyNotEqualTo(BigDecimal value) {
            addCriterion("deliver_money <>", value, "deliverMoney");
            return (Criteria) this;
        }

        public Criteria andDeliverMoneyGreaterThan(BigDecimal value) {
            addCriterion("deliver_money >", value, "deliverMoney");
            return (Criteria) this;
        }

        public Criteria andDeliverMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deliver_money >=", value, "deliverMoney");
            return (Criteria) this;
        }

        public Criteria andDeliverMoneyLessThan(BigDecimal value) {
            addCriterion("deliver_money <", value, "deliverMoney");
            return (Criteria) this;
        }

        public Criteria andDeliverMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deliver_money <=", value, "deliverMoney");
            return (Criteria) this;
        }

        public Criteria andDeliverMoneyIn(List<BigDecimal> values) {
            addCriterion("deliver_money in", values, "deliverMoney");
            return (Criteria) this;
        }

        public Criteria andDeliverMoneyNotIn(List<BigDecimal> values) {
            addCriterion("deliver_money not in", values, "deliverMoney");
            return (Criteria) this;
        }

        public Criteria andDeliverMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deliver_money between", value1, value2, "deliverMoney");
            return (Criteria) this;
        }

        public Criteria andDeliverMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deliver_money not between", value1, value2, "deliverMoney");
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

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNull() {
            addCriterion("is_pay is null");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNotNull() {
            addCriterion("is_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayEqualTo(Integer value) {
            addCriterion("is_pay =", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotEqualTo(Integer value) {
            addCriterion("is_pay <>", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThan(Integer value) {
            addCriterion("is_pay >", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_pay >=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThan(Integer value) {
            addCriterion("is_pay <", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThanOrEqualTo(Integer value) {
            addCriterion("is_pay <=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayIn(List<Integer> values) {
            addCriterion("is_pay in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotIn(List<Integer> values) {
            addCriterion("is_pay not in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayBetween(Integer value1, Integer value2) {
            addCriterion("is_pay between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotBetween(Integer value1, Integer value2) {
            addCriterion("is_pay not between", value1, value2, "isPay");
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

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
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

        public Criteria andOrderRemarksIsNull() {
            addCriterion("order_remarks is null");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksIsNotNull() {
            addCriterion("order_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksEqualTo(String value) {
            addCriterion("order_remarks =", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksNotEqualTo(String value) {
            addCriterion("order_remarks <>", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksGreaterThan(String value) {
            addCriterion("order_remarks >", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("order_remarks >=", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksLessThan(String value) {
            addCriterion("order_remarks <", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksLessThanOrEqualTo(String value) {
            addCriterion("order_remarks <=", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksLike(String value) {
            addCriterion("order_remarks like", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksNotLike(String value) {
            addCriterion("order_remarks not like", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksIn(List<String> values) {
            addCriterion("order_remarks in", values, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksNotIn(List<String> values) {
            addCriterion("order_remarks not in", values, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksBetween(String value1, String value2) {
            addCriterion("order_remarks between", value1, value2, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksNotBetween(String value1, String value2) {
            addCriterion("order_remarks not between", value1, value2, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNull() {
            addCriterion("out_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("out_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(String value) {
            addCriterion("out_trade_no =", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("out_trade_no >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_trade_no >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(String value) {
            addCriterion("out_trade_no <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("out_trade_no <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLike(String value) {
            addCriterion("out_trade_no like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotLike(String value) {
            addCriterion("out_trade_no not like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<String> values) {
            addCriterion("out_trade_no in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<String> values) {
            addCriterion("out_trade_no not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(String value1, String value2) {
            addCriterion("out_trade_no between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("out_trade_no not between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOrderSrcIsNull() {
            addCriterion("order_src is null");
            return (Criteria) this;
        }

        public Criteria andOrderSrcIsNotNull() {
            addCriterion("order_src is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSrcEqualTo(Integer value) {
            addCriterion("order_src =", value, "orderSrc");
            return (Criteria) this;
        }

        public Criteria andOrderSrcNotEqualTo(Integer value) {
            addCriterion("order_src <>", value, "orderSrc");
            return (Criteria) this;
        }

        public Criteria andOrderSrcGreaterThan(Integer value) {
            addCriterion("order_src >", value, "orderSrc");
            return (Criteria) this;
        }

        public Criteria andOrderSrcGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_src >=", value, "orderSrc");
            return (Criteria) this;
        }

        public Criteria andOrderSrcLessThan(Integer value) {
            addCriterion("order_src <", value, "orderSrc");
            return (Criteria) this;
        }

        public Criteria andOrderSrcLessThanOrEqualTo(Integer value) {
            addCriterion("order_src <=", value, "orderSrc");
            return (Criteria) this;
        }

        public Criteria andOrderSrcIn(List<Integer> values) {
            addCriterion("order_src in", values, "orderSrc");
            return (Criteria) this;
        }

        public Criteria andOrderSrcNotIn(List<Integer> values) {
            addCriterion("order_src not in", values, "orderSrc");
            return (Criteria) this;
        }

        public Criteria andOrderSrcBetween(Integer value1, Integer value2) {
            addCriterion("order_src between", value1, value2, "orderSrc");
            return (Criteria) this;
        }

        public Criteria andOrderSrcNotBetween(Integer value1, Integer value2) {
            addCriterion("order_src not between", value1, value2, "orderSrc");
            return (Criteria) this;
        }

        public Criteria andOrderFlagIsNull() {
            addCriterion("order_flag is null");
            return (Criteria) this;
        }

        public Criteria andOrderFlagIsNotNull() {
            addCriterion("order_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFlagEqualTo(Integer value) {
            addCriterion("order_flag =", value, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagNotEqualTo(Integer value) {
            addCriterion("order_flag <>", value, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagGreaterThan(Integer value) {
            addCriterion("order_flag >", value, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_flag >=", value, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagLessThan(Integer value) {
            addCriterion("order_flag <", value, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagLessThanOrEqualTo(Integer value) {
            addCriterion("order_flag <=", value, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagIn(List<Integer> values) {
            addCriterion("order_flag in", values, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagNotIn(List<Integer> values) {
            addCriterion("order_flag not in", values, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagBetween(Integer value1, Integer value2) {
            addCriterion("order_flag between", value1, value2, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("order_flag not between", value1, value2, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNull() {
            addCriterion("transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(String value) {
            addCriterion("transaction_id =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(String value) {
            addCriterion("transaction_id <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(String value) {
            addCriterion("transaction_id >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_id >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(String value) {
            addCriterion("transaction_id <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("transaction_id <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLike(String value) {
            addCriterion("transaction_id like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotLike(String value) {
            addCriterion("transaction_id not like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<String> values) {
            addCriterion("transaction_id in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<String> values) {
            addCriterion("transaction_id not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(String value1, String value2) {
            addCriterion("transaction_id between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(String value1, String value2) {
            addCriterion("transaction_id not between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andPayfRomIsNull() {
            addCriterion("payf_rom is null");
            return (Criteria) this;
        }

        public Criteria andPayfRomIsNotNull() {
            addCriterion("payf_rom is not null");
            return (Criteria) this;
        }

        public Criteria andPayfRomEqualTo(Integer value) {
            addCriterion("payf_rom =", value, "payfRom");
            return (Criteria) this;
        }

        public Criteria andPayfRomNotEqualTo(Integer value) {
            addCriterion("payf_rom <>", value, "payfRom");
            return (Criteria) this;
        }

        public Criteria andPayfRomGreaterThan(Integer value) {
            addCriterion("payf_rom >", value, "payfRom");
            return (Criteria) this;
        }

        public Criteria andPayfRomGreaterThanOrEqualTo(Integer value) {
            addCriterion("payf_rom >=", value, "payfRom");
            return (Criteria) this;
        }

        public Criteria andPayfRomLessThan(Integer value) {
            addCriterion("payf_rom <", value, "payfRom");
            return (Criteria) this;
        }

        public Criteria andPayfRomLessThanOrEqualTo(Integer value) {
            addCriterion("payf_rom <=", value, "payfRom");
            return (Criteria) this;
        }

        public Criteria andPayfRomIn(List<Integer> values) {
            addCriterion("payf_rom in", values, "payfRom");
            return (Criteria) this;
        }

        public Criteria andPayfRomNotIn(List<Integer> values) {
            addCriterion("payf_rom not in", values, "payfRom");
            return (Criteria) this;
        }

        public Criteria andPayfRomBetween(Integer value1, Integer value2) {
            addCriterion("payf_rom between", value1, value2, "payfRom");
            return (Criteria) this;
        }

        public Criteria andPayfRomNotBetween(Integer value1, Integer value2) {
            addCriterion("payf_rom not between", value1, value2, "payfRom");
            return (Criteria) this;
        }

        public Criteria andRealOtalOneyIsNull() {
            addCriterion("real_otal_oney is null");
            return (Criteria) this;
        }

        public Criteria andRealOtalOneyIsNotNull() {
            addCriterion("real_otal_oney is not null");
            return (Criteria) this;
        }

        public Criteria andRealOtalOneyEqualTo(BigDecimal value) {
            addCriterion("real_otal_oney =", value, "realOtalOney");
            return (Criteria) this;
        }

        public Criteria andRealOtalOneyNotEqualTo(BigDecimal value) {
            addCriterion("real_otal_oney <>", value, "realOtalOney");
            return (Criteria) this;
        }

        public Criteria andRealOtalOneyGreaterThan(BigDecimal value) {
            addCriterion("real_otal_oney >", value, "realOtalOney");
            return (Criteria) this;
        }

        public Criteria andRealOtalOneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_otal_oney >=", value, "realOtalOney");
            return (Criteria) this;
        }

        public Criteria andRealOtalOneyLessThan(BigDecimal value) {
            addCriterion("real_otal_oney <", value, "realOtalOney");
            return (Criteria) this;
        }

        public Criteria andRealOtalOneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_otal_oney <=", value, "realOtalOney");
            return (Criteria) this;
        }

        public Criteria andRealOtalOneyIn(List<BigDecimal> values) {
            addCriterion("real_otal_oney in", values, "realOtalOney");
            return (Criteria) this;
        }

        public Criteria andRealOtalOneyNotIn(List<BigDecimal> values) {
            addCriterion("real_otal_oney not in", values, "realOtalOney");
            return (Criteria) this;
        }

        public Criteria andRealOtalOneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_otal_oney between", value1, value2, "realOtalOney");
            return (Criteria) this;
        }

        public Criteria andRealOtalOneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_otal_oney not between", value1, value2, "realOtalOney");
            return (Criteria) this;
        }

        public Criteria andPayTotalMoneyIsNull() {
            addCriterion("pay_total_money is null");
            return (Criteria) this;
        }

        public Criteria andPayTotalMoneyIsNotNull() {
            addCriterion("pay_total_money is not null");
            return (Criteria) this;
        }

        public Criteria andPayTotalMoneyEqualTo(BigDecimal value) {
            addCriterion("pay_total_money =", value, "payTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPayTotalMoneyNotEqualTo(BigDecimal value) {
            addCriterion("pay_total_money <>", value, "payTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPayTotalMoneyGreaterThan(BigDecimal value) {
            addCriterion("pay_total_money >", value, "payTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPayTotalMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_total_money >=", value, "payTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPayTotalMoneyLessThan(BigDecimal value) {
            addCriterion("pay_total_money <", value, "payTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPayTotalMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_total_money <=", value, "payTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPayTotalMoneyIn(List<BigDecimal> values) {
            addCriterion("pay_total_money in", values, "payTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPayTotalMoneyNotIn(List<BigDecimal> values) {
            addCriterion("pay_total_money not in", values, "payTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPayTotalMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_total_money between", value1, value2, "payTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPayTotalMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_total_money not between", value1, value2, "payTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPryTimeIsNull() {
            addCriterion("pry_time is null");
            return (Criteria) this;
        }

        public Criteria andPryTimeIsNotNull() {
            addCriterion("pry_time is not null");
            return (Criteria) this;
        }

        public Criteria andPryTimeEqualTo(Date value) {
            addCriterion("pry_time =", value, "pryTime");
            return (Criteria) this;
        }

        public Criteria andPryTimeNotEqualTo(Date value) {
            addCriterion("pry_time <>", value, "pryTime");
            return (Criteria) this;
        }

        public Criteria andPryTimeGreaterThan(Date value) {
            addCriterion("pry_time >", value, "pryTime");
            return (Criteria) this;
        }

        public Criteria andPryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pry_time >=", value, "pryTime");
            return (Criteria) this;
        }

        public Criteria andPryTimeLessThan(Date value) {
            addCriterion("pry_time <", value, "pryTime");
            return (Criteria) this;
        }

        public Criteria andPryTimeLessThanOrEqualTo(Date value) {
            addCriterion("pry_time <=", value, "pryTime");
            return (Criteria) this;
        }

        public Criteria andPryTimeIn(List<Date> values) {
            addCriterion("pry_time in", values, "pryTime");
            return (Criteria) this;
        }

        public Criteria andPryTimeNotIn(List<Date> values) {
            addCriterion("pry_time not in", values, "pryTime");
            return (Criteria) this;
        }

        public Criteria andPryTimeBetween(Date value1, Date value2) {
            addCriterion("pry_time between", value1, value2, "pryTime");
            return (Criteria) this;
        }

        public Criteria andPryTimeNotBetween(Date value1, Date value2) {
            addCriterion("pry_time not between", value1, value2, "pryTime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeIsNull() {
            addCriterion("order_completion_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeIsNotNull() {
            addCriterion("order_completion_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeEqualTo(Date value) {
            addCriterion("order_completion_time =", value, "orderCompletionTime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeNotEqualTo(Date value) {
            addCriterion("order_completion_time <>", value, "orderCompletionTime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeGreaterThan(Date value) {
            addCriterion("order_completion_time >", value, "orderCompletionTime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_completion_time >=", value, "orderCompletionTime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeLessThan(Date value) {
            addCriterion("order_completion_time <", value, "orderCompletionTime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_completion_time <=", value, "orderCompletionTime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeIn(List<Date> values) {
            addCriterion("order_completion_time in", values, "orderCompletionTime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeNotIn(List<Date> values) {
            addCriterion("order_completion_time not in", values, "orderCompletionTime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeBetween(Date value1, Date value2) {
            addCriterion("order_completion_time between", value1, value2, "orderCompletionTime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_completion_time not between", value1, value2, "orderCompletionTime");
            return (Criteria) this;
        }

        public Criteria andOrdersCancelTimeIsNull() {
            addCriterion("orders_cancel_time is null");
            return (Criteria) this;
        }

        public Criteria andOrdersCancelTimeIsNotNull() {
            addCriterion("orders_cancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersCancelTimeEqualTo(Date value) {
            addCriterion("orders_cancel_time =", value, "ordersCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrdersCancelTimeNotEqualTo(Date value) {
            addCriterion("orders_cancel_time <>", value, "ordersCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrdersCancelTimeGreaterThan(Date value) {
            addCriterion("orders_cancel_time >", value, "ordersCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrdersCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orders_cancel_time >=", value, "ordersCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrdersCancelTimeLessThan(Date value) {
            addCriterion("orders_cancel_time <", value, "ordersCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrdersCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("orders_cancel_time <=", value, "ordersCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrdersCancelTimeIn(List<Date> values) {
            addCriterion("orders_cancel_time in", values, "ordersCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrdersCancelTimeNotIn(List<Date> values) {
            addCriterion("orders_cancel_time not in", values, "ordersCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrdersCancelTimeBetween(Date value1, Date value2) {
            addCriterion("orders_cancel_time between", value1, value2, "ordersCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrdersCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("orders_cancel_time not between", value1, value2, "ordersCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderRefundTimeIsNull() {
            addCriterion("order_refund_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderRefundTimeIsNotNull() {
            addCriterion("order_refund_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRefundTimeEqualTo(Date value) {
            addCriterion("order_refund_time =", value, "orderRefundTime");
            return (Criteria) this;
        }

        public Criteria andOrderRefundTimeNotEqualTo(Date value) {
            addCriterion("order_refund_time <>", value, "orderRefundTime");
            return (Criteria) this;
        }

        public Criteria andOrderRefundTimeGreaterThan(Date value) {
            addCriterion("order_refund_time >", value, "orderRefundTime");
            return (Criteria) this;
        }

        public Criteria andOrderRefundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_refund_time >=", value, "orderRefundTime");
            return (Criteria) this;
        }

        public Criteria andOrderRefundTimeLessThan(Date value) {
            addCriterion("order_refund_time <", value, "orderRefundTime");
            return (Criteria) this;
        }

        public Criteria andOrderRefundTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_refund_time <=", value, "orderRefundTime");
            return (Criteria) this;
        }

        public Criteria andOrderRefundTimeIn(List<Date> values) {
            addCriterion("order_refund_time in", values, "orderRefundTime");
            return (Criteria) this;
        }

        public Criteria andOrderRefundTimeNotIn(List<Date> values) {
            addCriterion("order_refund_time not in", values, "orderRefundTime");
            return (Criteria) this;
        }

        public Criteria andOrderRefundTimeBetween(Date value1, Date value2) {
            addCriterion("order_refund_time between", value1, value2, "orderRefundTime");
            return (Criteria) this;
        }

        public Criteria andOrderRefundTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_refund_time not between", value1, value2, "orderRefundTime");
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