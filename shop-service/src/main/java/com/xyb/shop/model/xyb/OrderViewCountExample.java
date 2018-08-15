package com.xyb.shop.model.xyb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderViewCountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderViewCountExample() {
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

        public Criteria andWaitPayCountIsNull() {
            addCriterion("wait_pay_count is null");
            return (Criteria) this;
        }

        public Criteria andWaitPayCountIsNotNull() {
            addCriterion("wait_pay_count is not null");
            return (Criteria) this;
        }

        public Criteria andWaitPayCountEqualTo(Integer value) {
            addCriterion("wait_pay_count =", value, "waitPayCount");
            return (Criteria) this;
        }

        public Criteria andWaitPayCountNotEqualTo(Integer value) {
            addCriterion("wait_pay_count <>", value, "waitPayCount");
            return (Criteria) this;
        }

        public Criteria andWaitPayCountGreaterThan(Integer value) {
            addCriterion("wait_pay_count >", value, "waitPayCount");
            return (Criteria) this;
        }

        public Criteria andWaitPayCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("wait_pay_count >=", value, "waitPayCount");
            return (Criteria) this;
        }

        public Criteria andWaitPayCountLessThan(Integer value) {
            addCriterion("wait_pay_count <", value, "waitPayCount");
            return (Criteria) this;
        }

        public Criteria andWaitPayCountLessThanOrEqualTo(Integer value) {
            addCriterion("wait_pay_count <=", value, "waitPayCount");
            return (Criteria) this;
        }

        public Criteria andWaitPayCountIn(List<Integer> values) {
            addCriterion("wait_pay_count in", values, "waitPayCount");
            return (Criteria) this;
        }

        public Criteria andWaitPayCountNotIn(List<Integer> values) {
            addCriterion("wait_pay_count not in", values, "waitPayCount");
            return (Criteria) this;
        }

        public Criteria andWaitPayCountBetween(Integer value1, Integer value2) {
            addCriterion("wait_pay_count between", value1, value2, "waitPayCount");
            return (Criteria) this;
        }

        public Criteria andWaitPayCountNotBetween(Integer value1, Integer value2) {
            addCriterion("wait_pay_count not between", value1, value2, "waitPayCount");
            return (Criteria) this;
        }

        public Criteria andBackCountIsNull() {
            addCriterion("back_count is null");
            return (Criteria) this;
        }

        public Criteria andBackCountIsNotNull() {
            addCriterion("back_count is not null");
            return (Criteria) this;
        }

        public Criteria andBackCountEqualTo(Integer value) {
            addCriterion("back_count =", value, "backCount");
            return (Criteria) this;
        }

        public Criteria andBackCountNotEqualTo(Integer value) {
            addCriterion("back_count <>", value, "backCount");
            return (Criteria) this;
        }

        public Criteria andBackCountGreaterThan(Integer value) {
            addCriterion("back_count >", value, "backCount");
            return (Criteria) this;
        }

        public Criteria andBackCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("back_count >=", value, "backCount");
            return (Criteria) this;
        }

        public Criteria andBackCountLessThan(Integer value) {
            addCriterion("back_count <", value, "backCount");
            return (Criteria) this;
        }

        public Criteria andBackCountLessThanOrEqualTo(Integer value) {
            addCriterion("back_count <=", value, "backCount");
            return (Criteria) this;
        }

        public Criteria andBackCountIn(List<Integer> values) {
            addCriterion("back_count in", values, "backCount");
            return (Criteria) this;
        }

        public Criteria andBackCountNotIn(List<Integer> values) {
            addCriterion("back_count not in", values, "backCount");
            return (Criteria) this;
        }

        public Criteria andBackCountBetween(Integer value1, Integer value2) {
            addCriterion("back_count between", value1, value2, "backCount");
            return (Criteria) this;
        }

        public Criteria andBackCountNotBetween(Integer value1, Integer value2) {
            addCriterion("back_count not between", value1, value2, "backCount");
            return (Criteria) this;
        }

        public Criteria andRecipienCountIsNull() {
            addCriterion("recipien_count is null");
            return (Criteria) this;
        }

        public Criteria andRecipienCountIsNotNull() {
            addCriterion("recipien_count is not null");
            return (Criteria) this;
        }

        public Criteria andRecipienCountEqualTo(Integer value) {
            addCriterion("recipien_count =", value, "recipienCount");
            return (Criteria) this;
        }

        public Criteria andRecipienCountNotEqualTo(Integer value) {
            addCriterion("recipien_count <>", value, "recipienCount");
            return (Criteria) this;
        }

        public Criteria andRecipienCountGreaterThan(Integer value) {
            addCriterion("recipien_count >", value, "recipienCount");
            return (Criteria) this;
        }

        public Criteria andRecipienCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("recipien_count >=", value, "recipienCount");
            return (Criteria) this;
        }

        public Criteria andRecipienCountLessThan(Integer value) {
            addCriterion("recipien_count <", value, "recipienCount");
            return (Criteria) this;
        }

        public Criteria andRecipienCountLessThanOrEqualTo(Integer value) {
            addCriterion("recipien_count <=", value, "recipienCount");
            return (Criteria) this;
        }

        public Criteria andRecipienCountIn(List<Integer> values) {
            addCriterion("recipien_count in", values, "recipienCount");
            return (Criteria) this;
        }

        public Criteria andRecipienCountNotIn(List<Integer> values) {
            addCriterion("recipien_count not in", values, "recipienCount");
            return (Criteria) this;
        }

        public Criteria andRecipienCountBetween(Integer value1, Integer value2) {
            addCriterion("recipien_count between", value1, value2, "recipienCount");
            return (Criteria) this;
        }

        public Criteria andRecipienCountNotBetween(Integer value1, Integer value2) {
            addCriterion("recipien_count not between", value1, value2, "recipienCount");
            return (Criteria) this;
        }

        public Criteria andFinishCountIsNull() {
            addCriterion("finish_count is null");
            return (Criteria) this;
        }

        public Criteria andFinishCountIsNotNull() {
            addCriterion("finish_count is not null");
            return (Criteria) this;
        }

        public Criteria andFinishCountEqualTo(Integer value) {
            addCriterion("finish_count =", value, "finishCount");
            return (Criteria) this;
        }

        public Criteria andFinishCountNotEqualTo(Integer value) {
            addCriterion("finish_count <>", value, "finishCount");
            return (Criteria) this;
        }

        public Criteria andFinishCountGreaterThan(Integer value) {
            addCriterion("finish_count >", value, "finishCount");
            return (Criteria) this;
        }

        public Criteria andFinishCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("finish_count >=", value, "finishCount");
            return (Criteria) this;
        }

        public Criteria andFinishCountLessThan(Integer value) {
            addCriterion("finish_count <", value, "finishCount");
            return (Criteria) this;
        }

        public Criteria andFinishCountLessThanOrEqualTo(Integer value) {
            addCriterion("finish_count <=", value, "finishCount");
            return (Criteria) this;
        }

        public Criteria andFinishCountIn(List<Integer> values) {
            addCriterion("finish_count in", values, "finishCount");
            return (Criteria) this;
        }

        public Criteria andFinishCountNotIn(List<Integer> values) {
            addCriterion("finish_count not in", values, "finishCount");
            return (Criteria) this;
        }

        public Criteria andFinishCountBetween(Integer value1, Integer value2) {
            addCriterion("finish_count between", value1, value2, "finishCount");
            return (Criteria) this;
        }

        public Criteria andFinishCountNotBetween(Integer value1, Integer value2) {
            addCriterion("finish_count not between", value1, value2, "finishCount");
            return (Criteria) this;
        }

        public Criteria andAfterSaleCountIsNull() {
            addCriterion("after_sale_count is null");
            return (Criteria) this;
        }

        public Criteria andAfterSaleCountIsNotNull() {
            addCriterion("after_sale_count is not null");
            return (Criteria) this;
        }

        public Criteria andAfterSaleCountEqualTo(Integer value) {
            addCriterion("after_sale_count =", value, "afterSaleCount");
            return (Criteria) this;
        }

        public Criteria andAfterSaleCountNotEqualTo(Integer value) {
            addCriterion("after_sale_count <>", value, "afterSaleCount");
            return (Criteria) this;
        }

        public Criteria andAfterSaleCountGreaterThan(Integer value) {
            addCriterion("after_sale_count >", value, "afterSaleCount");
            return (Criteria) this;
        }

        public Criteria andAfterSaleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("after_sale_count >=", value, "afterSaleCount");
            return (Criteria) this;
        }

        public Criteria andAfterSaleCountLessThan(Integer value) {
            addCriterion("after_sale_count <", value, "afterSaleCount");
            return (Criteria) this;
        }

        public Criteria andAfterSaleCountLessThanOrEqualTo(Integer value) {
            addCriterion("after_sale_count <=", value, "afterSaleCount");
            return (Criteria) this;
        }

        public Criteria andAfterSaleCountIn(List<Integer> values) {
            addCriterion("after_sale_count in", values, "afterSaleCount");
            return (Criteria) this;
        }

        public Criteria andAfterSaleCountNotIn(List<Integer> values) {
            addCriterion("after_sale_count not in", values, "afterSaleCount");
            return (Criteria) this;
        }

        public Criteria andAfterSaleCountBetween(Integer value1, Integer value2) {
            addCriterion("after_sale_count between", value1, value2, "afterSaleCount");
            return (Criteria) this;
        }

        public Criteria andAfterSaleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("after_sale_count not between", value1, value2, "afterSaleCount");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("creat_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("creat_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("creat_time >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creat_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("creat_time <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("creat_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("creat_time in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("creat_time not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("creat_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("creat_time not between", value1, value2, "creatTime");
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