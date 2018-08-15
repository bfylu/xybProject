package com.xyb.ai.model.xyb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppOperatorLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppOperatorLogExample() {
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

        public Criteria andOptTypeIsNull() {
            addCriterion("opt_type is null");
            return (Criteria) this;
        }

        public Criteria andOptTypeIsNotNull() {
            addCriterion("opt_type is not null");
            return (Criteria) this;
        }

        public Criteria andOptTypeEqualTo(Integer value) {
            addCriterion("opt_type =", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeNotEqualTo(Integer value) {
            addCriterion("opt_type <>", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeGreaterThan(Integer value) {
            addCriterion("opt_type >", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("opt_type >=", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeLessThan(Integer value) {
            addCriterion("opt_type <", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeLessThanOrEqualTo(Integer value) {
            addCriterion("opt_type <=", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeIn(List<Integer> values) {
            addCriterion("opt_type in", values, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeNotIn(List<Integer> values) {
            addCriterion("opt_type not in", values, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeBetween(Integer value1, Integer value2) {
            addCriterion("opt_type between", value1, value2, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("opt_type not between", value1, value2, "optType");
            return (Criteria) this;
        }

        public Criteria andOptContentIsNull() {
            addCriterion("opt_content is null");
            return (Criteria) this;
        }

        public Criteria andOptContentIsNotNull() {
            addCriterion("opt_content is not null");
            return (Criteria) this;
        }

        public Criteria andOptContentEqualTo(String value) {
            addCriterion("opt_content =", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentNotEqualTo(String value) {
            addCriterion("opt_content <>", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentGreaterThan(String value) {
            addCriterion("opt_content >", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentGreaterThanOrEqualTo(String value) {
            addCriterion("opt_content >=", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentLessThan(String value) {
            addCriterion("opt_content <", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentLessThanOrEqualTo(String value) {
            addCriterion("opt_content <=", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentLike(String value) {
            addCriterion("opt_content like", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentNotLike(String value) {
            addCriterion("opt_content not like", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentIn(List<String> values) {
            addCriterion("opt_content in", values, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentNotIn(List<String> values) {
            addCriterion("opt_content not in", values, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentBetween(String value1, String value2) {
            addCriterion("opt_content between", value1, value2, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentNotBetween(String value1, String value2) {
            addCriterion("opt_content not between", value1, value2, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptTimeIsNull() {
            addCriterion("opt_time is null");
            return (Criteria) this;
        }

        public Criteria andOptTimeIsNotNull() {
            addCriterion("opt_time is not null");
            return (Criteria) this;
        }

        public Criteria andOptTimeEqualTo(Date value) {
            addCriterion("opt_time =", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeNotEqualTo(Date value) {
            addCriterion("opt_time <>", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeGreaterThan(Date value) {
            addCriterion("opt_time >", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("opt_time >=", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeLessThan(Date value) {
            addCriterion("opt_time <", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeLessThanOrEqualTo(Date value) {
            addCriterion("opt_time <=", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeIn(List<Date> values) {
            addCriterion("opt_time in", values, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeNotIn(List<Date> values) {
            addCriterion("opt_time not in", values, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeBetween(Date value1, Date value2) {
            addCriterion("opt_time between", value1, value2, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeNotBetween(Date value1, Date value2) {
            addCriterion("opt_time not between", value1, value2, "optTime");
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