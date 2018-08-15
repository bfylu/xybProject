package com.xyb.ai.model.xyb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UserTotalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTotalExample() {
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

        public Criteria andTotalAcquireIsNull() {
            addCriterion("total_acquire is null");
            return (Criteria) this;
        }

        public Criteria andTotalAcquireIsNotNull() {
            addCriterion("total_acquire is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAcquireEqualTo(BigDecimal value) {
            addCriterion("total_acquire =", value, "totalAcquire");
            return (Criteria) this;
        }

        public Criteria andTotalAcquireNotEqualTo(BigDecimal value) {
            addCriterion("total_acquire <>", value, "totalAcquire");
            return (Criteria) this;
        }

        public Criteria andTotalAcquireGreaterThan(BigDecimal value) {
            addCriterion("total_acquire >", value, "totalAcquire");
            return (Criteria) this;
        }

        public Criteria andTotalAcquireGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_acquire >=", value, "totalAcquire");
            return (Criteria) this;
        }

        public Criteria andTotalAcquireLessThan(BigDecimal value) {
            addCriterion("total_acquire <", value, "totalAcquire");
            return (Criteria) this;
        }

        public Criteria andTotalAcquireLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_acquire <=", value, "totalAcquire");
            return (Criteria) this;
        }

        public Criteria andTotalAcquireIn(List<BigDecimal> values) {
            addCriterion("total_acquire in", values, "totalAcquire");
            return (Criteria) this;
        }

        public Criteria andTotalAcquireNotIn(List<BigDecimal> values) {
            addCriterion("total_acquire not in", values, "totalAcquire");
            return (Criteria) this;
        }

        public Criteria andTotalAcquireBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_acquire between", value1, value2, "totalAcquire");
            return (Criteria) this;
        }

        public Criteria andTotalAcquireNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_acquire not between", value1, value2, "totalAcquire");
            return (Criteria) this;
        }

        public Criteria andTotalBonusIsNull() {
            addCriterion("total_bonus is null");
            return (Criteria) this;
        }

        public Criteria andTotalBonusIsNotNull() {
            addCriterion("total_bonus is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBonusEqualTo(BigDecimal value) {
            addCriterion("total_bonus =", value, "totalBonus");
            return (Criteria) this;
        }

        public Criteria andTotalBonusNotEqualTo(BigDecimal value) {
            addCriterion("total_bonus <>", value, "totalBonus");
            return (Criteria) this;
        }

        public Criteria andTotalBonusGreaterThan(BigDecimal value) {
            addCriterion("total_bonus >", value, "totalBonus");
            return (Criteria) this;
        }

        public Criteria andTotalBonusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_bonus >=", value, "totalBonus");
            return (Criteria) this;
        }

        public Criteria andTotalBonusLessThan(BigDecimal value) {
            addCriterion("total_bonus <", value, "totalBonus");
            return (Criteria) this;
        }

        public Criteria andTotalBonusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_bonus <=", value, "totalBonus");
            return (Criteria) this;
        }

        public Criteria andTotalBonusIn(List<BigDecimal> values) {
            addCriterion("total_bonus in", values, "totalBonus");
            return (Criteria) this;
        }

        public Criteria andTotalBonusNotIn(List<BigDecimal> values) {
            addCriterion("total_bonus not in", values, "totalBonus");
            return (Criteria) this;
        }

        public Criteria andTotalBonusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_bonus between", value1, value2, "totalBonus");
            return (Criteria) this;
        }

        public Criteria andTotalBonusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_bonus not between", value1, value2, "totalBonus");
            return (Criteria) this;
        }

        public Criteria andTotalProfitIsNull() {
            addCriterion("total_profit is null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitIsNotNull() {
            addCriterion("total_profit is not null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitEqualTo(BigDecimal value) {
            addCriterion("total_profit =", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotEqualTo(BigDecimal value) {
            addCriterion("total_profit <>", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitGreaterThan(BigDecimal value) {
            addCriterion("total_profit >", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_profit >=", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitLessThan(BigDecimal value) {
            addCriterion("total_profit <", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_profit <=", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitIn(List<BigDecimal> values) {
            addCriterion("total_profit in", values, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotIn(List<BigDecimal> values) {
            addCriterion("total_profit not in", values, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_profit between", value1, value2, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_profit not between", value1, value2, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalAgentGainIsNull() {
            addCriterion("total_agent_gain is null");
            return (Criteria) this;
        }

        public Criteria andTotalAgentGainIsNotNull() {
            addCriterion("total_agent_gain is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAgentGainEqualTo(BigDecimal value) {
            addCriterion("total_agent_gain =", value, "totalAgentGain");
            return (Criteria) this;
        }

        public Criteria andTotalAgentGainNotEqualTo(BigDecimal value) {
            addCriterion("total_agent_gain <>", value, "totalAgentGain");
            return (Criteria) this;
        }

        public Criteria andTotalAgentGainGreaterThan(BigDecimal value) {
            addCriterion("total_agent_gain >", value, "totalAgentGain");
            return (Criteria) this;
        }

        public Criteria andTotalAgentGainGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_agent_gain >=", value, "totalAgentGain");
            return (Criteria) this;
        }

        public Criteria andTotalAgentGainLessThan(BigDecimal value) {
            addCriterion("total_agent_gain <", value, "totalAgentGain");
            return (Criteria) this;
        }

        public Criteria andTotalAgentGainLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_agent_gain <=", value, "totalAgentGain");
            return (Criteria) this;
        }

        public Criteria andTotalAgentGainIn(List<BigDecimal> values) {
            addCriterion("total_agent_gain in", values, "totalAgentGain");
            return (Criteria) this;
        }

        public Criteria andTotalAgentGainNotIn(List<BigDecimal> values) {
            addCriterion("total_agent_gain not in", values, "totalAgentGain");
            return (Criteria) this;
        }

        public Criteria andTotalAgentGainBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_agent_gain between", value1, value2, "totalAgentGain");
            return (Criteria) this;
        }

        public Criteria andTotalAgentGainNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_agent_gain not between", value1, value2, "totalAgentGain");
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