package com.xyb.shop.model.xyb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsAttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsAttributeExample() {
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

        public Criteria andIsSupportByStagesIsNull() {
            addCriterion("is_support_by_stages is null");
            return (Criteria) this;
        }

        public Criteria andIsSupportByStagesIsNotNull() {
            addCriterion("is_support_by_stages is not null");
            return (Criteria) this;
        }

        public Criteria andIsSupportByStagesEqualTo(Integer value) {
            addCriterion("is_support_by_stages =", value, "isSupportByStages");
            return (Criteria) this;
        }

        public Criteria andIsSupportByStagesNotEqualTo(Integer value) {
            addCriterion("is_support_by_stages <>", value, "isSupportByStages");
            return (Criteria) this;
        }

        public Criteria andIsSupportByStagesGreaterThan(Integer value) {
            addCriterion("is_support_by_stages >", value, "isSupportByStages");
            return (Criteria) this;
        }

        public Criteria andIsSupportByStagesGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_support_by_stages >=", value, "isSupportByStages");
            return (Criteria) this;
        }

        public Criteria andIsSupportByStagesLessThan(Integer value) {
            addCriterion("is_support_by_stages <", value, "isSupportByStages");
            return (Criteria) this;
        }

        public Criteria andIsSupportByStagesLessThanOrEqualTo(Integer value) {
            addCriterion("is_support_by_stages <=", value, "isSupportByStages");
            return (Criteria) this;
        }

        public Criteria andIsSupportByStagesIn(List<Integer> values) {
            addCriterion("is_support_by_stages in", values, "isSupportByStages");
            return (Criteria) this;
        }

        public Criteria andIsSupportByStagesNotIn(List<Integer> values) {
            addCriterion("is_support_by_stages not in", values, "isSupportByStages");
            return (Criteria) this;
        }

        public Criteria andIsSupportByStagesBetween(Integer value1, Integer value2) {
            addCriterion("is_support_by_stages between", value1, value2, "isSupportByStages");
            return (Criteria) this;
        }

        public Criteria andIsSupportByStagesNotBetween(Integer value1, Integer value2) {
            addCriterion("is_support_by_stages not between", value1, value2, "isSupportByStages");
            return (Criteria) this;
        }

        public Criteria andIsSupportExchangeIsNull() {
            addCriterion("is_support_exchange is null");
            return (Criteria) this;
        }

        public Criteria andIsSupportExchangeIsNotNull() {
            addCriterion("is_support_exchange is not null");
            return (Criteria) this;
        }

        public Criteria andIsSupportExchangeEqualTo(Integer value) {
            addCriterion("is_support_exchange =", value, "isSupportExchange");
            return (Criteria) this;
        }

        public Criteria andIsSupportExchangeNotEqualTo(Integer value) {
            addCriterion("is_support_exchange <>", value, "isSupportExchange");
            return (Criteria) this;
        }

        public Criteria andIsSupportExchangeGreaterThan(Integer value) {
            addCriterion("is_support_exchange >", value, "isSupportExchange");
            return (Criteria) this;
        }

        public Criteria andIsSupportExchangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_support_exchange >=", value, "isSupportExchange");
            return (Criteria) this;
        }

        public Criteria andIsSupportExchangeLessThan(Integer value) {
            addCriterion("is_support_exchange <", value, "isSupportExchange");
            return (Criteria) this;
        }

        public Criteria andIsSupportExchangeLessThanOrEqualTo(Integer value) {
            addCriterion("is_support_exchange <=", value, "isSupportExchange");
            return (Criteria) this;
        }

        public Criteria andIsSupportExchangeIn(List<Integer> values) {
            addCriterion("is_support_exchange in", values, "isSupportExchange");
            return (Criteria) this;
        }

        public Criteria andIsSupportExchangeNotIn(List<Integer> values) {
            addCriterion("is_support_exchange not in", values, "isSupportExchange");
            return (Criteria) this;
        }

        public Criteria andIsSupportExchangeBetween(Integer value1, Integer value2) {
            addCriterion("is_support_exchange between", value1, value2, "isSupportExchange");
            return (Criteria) this;
        }

        public Criteria andIsSupportExchangeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_support_exchange not between", value1, value2, "isSupportExchange");
            return (Criteria) this;
        }

        public Criteria andExchangePriceIsNull() {
            addCriterion("exchange_price is null");
            return (Criteria) this;
        }

        public Criteria andExchangePriceIsNotNull() {
            addCriterion("exchange_price is not null");
            return (Criteria) this;
        }

        public Criteria andExchangePriceEqualTo(BigDecimal value) {
            addCriterion("exchange_price =", value, "exchangePrice");
            return (Criteria) this;
        }

        public Criteria andExchangePriceNotEqualTo(BigDecimal value) {
            addCriterion("exchange_price <>", value, "exchangePrice");
            return (Criteria) this;
        }

        public Criteria andExchangePriceGreaterThan(BigDecimal value) {
            addCriterion("exchange_price >", value, "exchangePrice");
            return (Criteria) this;
        }

        public Criteria andExchangePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_price >=", value, "exchangePrice");
            return (Criteria) this;
        }

        public Criteria andExchangePriceLessThan(BigDecimal value) {
            addCriterion("exchange_price <", value, "exchangePrice");
            return (Criteria) this;
        }

        public Criteria andExchangePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_price <=", value, "exchangePrice");
            return (Criteria) this;
        }

        public Criteria andExchangePriceIn(List<BigDecimal> values) {
            addCriterion("exchange_price in", values, "exchangePrice");
            return (Criteria) this;
        }

        public Criteria andExchangePriceNotIn(List<BigDecimal> values) {
            addCriterion("exchange_price not in", values, "exchangePrice");
            return (Criteria) this;
        }

        public Criteria andExchangePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_price between", value1, value2, "exchangePrice");
            return (Criteria) this;
        }

        public Criteria andExchangePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_price not between", value1, value2, "exchangePrice");
            return (Criteria) this;
        }

        public Criteria andNeedIntegralNumberIsNull() {
            addCriterion("need_integral_number is null");
            return (Criteria) this;
        }

        public Criteria andNeedIntegralNumberIsNotNull() {
            addCriterion("need_integral_number is not null");
            return (Criteria) this;
        }

        public Criteria andNeedIntegralNumberEqualTo(Integer value) {
            addCriterion("need_integral_number =", value, "needIntegralNumber");
            return (Criteria) this;
        }

        public Criteria andNeedIntegralNumberNotEqualTo(Integer value) {
            addCriterion("need_integral_number <>", value, "needIntegralNumber");
            return (Criteria) this;
        }

        public Criteria andNeedIntegralNumberGreaterThan(Integer value) {
            addCriterion("need_integral_number >", value, "needIntegralNumber");
            return (Criteria) this;
        }

        public Criteria andNeedIntegralNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("need_integral_number >=", value, "needIntegralNumber");
            return (Criteria) this;
        }

        public Criteria andNeedIntegralNumberLessThan(Integer value) {
            addCriterion("need_integral_number <", value, "needIntegralNumber");
            return (Criteria) this;
        }

        public Criteria andNeedIntegralNumberLessThanOrEqualTo(Integer value) {
            addCriterion("need_integral_number <=", value, "needIntegralNumber");
            return (Criteria) this;
        }

        public Criteria andNeedIntegralNumberIn(List<Integer> values) {
            addCriterion("need_integral_number in", values, "needIntegralNumber");
            return (Criteria) this;
        }

        public Criteria andNeedIntegralNumberNotIn(List<Integer> values) {
            addCriterion("need_integral_number not in", values, "needIntegralNumber");
            return (Criteria) this;
        }

        public Criteria andNeedIntegralNumberBetween(Integer value1, Integer value2) {
            addCriterion("need_integral_number between", value1, value2, "needIntegralNumber");
            return (Criteria) this;
        }

        public Criteria andNeedIntegralNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("need_integral_number not between", value1, value2, "needIntegralNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesIsNull() {
            addCriterion("goods_sales is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesIsNotNull() {
            addCriterion("goods_sales is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesEqualTo(Integer value) {
            addCriterion("goods_sales =", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesNotEqualTo(Integer value) {
            addCriterion("goods_sales <>", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesGreaterThan(Integer value) {
            addCriterion("goods_sales >", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_sales >=", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesLessThan(Integer value) {
            addCriterion("goods_sales <", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesLessThanOrEqualTo(Integer value) {
            addCriterion("goods_sales <=", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesIn(List<Integer> values) {
            addCriterion("goods_sales in", values, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesNotIn(List<Integer> values) {
            addCriterion("goods_sales not in", values, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesBetween(Integer value1, Integer value2) {
            addCriterion("goods_sales between", value1, value2, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_sales not between", value1, value2, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsBrowsingVolumeIsNull() {
            addCriterion("goods_browsing_volume is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBrowsingVolumeIsNotNull() {
            addCriterion("goods_browsing_volume is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBrowsingVolumeEqualTo(Integer value) {
            addCriterion("goods_browsing_volume =", value, "goodsBrowsingVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsBrowsingVolumeNotEqualTo(Integer value) {
            addCriterion("goods_browsing_volume <>", value, "goodsBrowsingVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsBrowsingVolumeGreaterThan(Integer value) {
            addCriterion("goods_browsing_volume >", value, "goodsBrowsingVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsBrowsingVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_browsing_volume >=", value, "goodsBrowsingVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsBrowsingVolumeLessThan(Integer value) {
            addCriterion("goods_browsing_volume <", value, "goodsBrowsingVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsBrowsingVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("goods_browsing_volume <=", value, "goodsBrowsingVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsBrowsingVolumeIn(List<Integer> values) {
            addCriterion("goods_browsing_volume in", values, "goodsBrowsingVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsBrowsingVolumeNotIn(List<Integer> values) {
            addCriterion("goods_browsing_volume not in", values, "goodsBrowsingVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsBrowsingVolumeBetween(Integer value1, Integer value2) {
            addCriterion("goods_browsing_volume between", value1, value2, "goodsBrowsingVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsBrowsingVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_browsing_volume not between", value1, value2, "goodsBrowsingVolume");
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

        public Criteria andRuleIdIsNull() {
            addCriterion("rule_id is null");
            return (Criteria) this;
        }

        public Criteria andRuleIdIsNotNull() {
            addCriterion("rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andRuleIdEqualTo(Long value) {
            addCriterion("rule_id =", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotEqualTo(Long value) {
            addCriterion("rule_id <>", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThan(Long value) {
            addCriterion("rule_id >", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("rule_id >=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThan(Long value) {
            addCriterion("rule_id <", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThanOrEqualTo(Long value) {
            addCriterion("rule_id <=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdIn(List<Long> values) {
            addCriterion("rule_id in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotIn(List<Long> values) {
            addCriterion("rule_id not in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdBetween(Long value1, Long value2) {
            addCriterion("rule_id between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotBetween(Long value1, Long value2) {
            addCriterion("rule_id not between", value1, value2, "ruleId");
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