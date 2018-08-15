package com.xyb.shop.model.xyb;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AdStatsClickExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdStatsClickExample() {
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

        public Criteria andAdRefNoIsNull() {
            addCriterion("ad_ref_no is null");
            return (Criteria) this;
        }

        public Criteria andAdRefNoIsNotNull() {
            addCriterion("ad_ref_no is not null");
            return (Criteria) this;
        }

        public Criteria andAdRefNoEqualTo(String value) {
            addCriterion("ad_ref_no =", value, "adRefNo");
            return (Criteria) this;
        }

        public Criteria andAdRefNoNotEqualTo(String value) {
            addCriterion("ad_ref_no <>", value, "adRefNo");
            return (Criteria) this;
        }

        public Criteria andAdRefNoGreaterThan(String value) {
            addCriterion("ad_ref_no >", value, "adRefNo");
            return (Criteria) this;
        }

        public Criteria andAdRefNoGreaterThanOrEqualTo(String value) {
            addCriterion("ad_ref_no >=", value, "adRefNo");
            return (Criteria) this;
        }

        public Criteria andAdRefNoLessThan(String value) {
            addCriterion("ad_ref_no <", value, "adRefNo");
            return (Criteria) this;
        }

        public Criteria andAdRefNoLessThanOrEqualTo(String value) {
            addCriterion("ad_ref_no <=", value, "adRefNo");
            return (Criteria) this;
        }

        public Criteria andAdRefNoLike(String value) {
            addCriterion("ad_ref_no like", value, "adRefNo");
            return (Criteria) this;
        }

        public Criteria andAdRefNoNotLike(String value) {
            addCriterion("ad_ref_no not like", value, "adRefNo");
            return (Criteria) this;
        }

        public Criteria andAdRefNoIn(List<String> values) {
            addCriterion("ad_ref_no in", values, "adRefNo");
            return (Criteria) this;
        }

        public Criteria andAdRefNoNotIn(List<String> values) {
            addCriterion("ad_ref_no not in", values, "adRefNo");
            return (Criteria) this;
        }

        public Criteria andAdRefNoBetween(String value1, String value2) {
            addCriterion("ad_ref_no between", value1, value2, "adRefNo");
            return (Criteria) this;
        }

        public Criteria andAdRefNoNotBetween(String value1, String value2) {
            addCriterion("ad_ref_no not between", value1, value2, "adRefNo");
            return (Criteria) this;
        }

        public Criteria andStatsTypeIsNull() {
            addCriterion("stats_type is null");
            return (Criteria) this;
        }

        public Criteria andStatsTypeIsNotNull() {
            addCriterion("stats_type is not null");
            return (Criteria) this;
        }

        public Criteria andStatsTypeEqualTo(Integer value) {
            addCriterion("stats_type =", value, "statsType");
            return (Criteria) this;
        }

        public Criteria andStatsTypeNotEqualTo(Integer value) {
            addCriterion("stats_type <>", value, "statsType");
            return (Criteria) this;
        }

        public Criteria andStatsTypeGreaterThan(Integer value) {
            addCriterion("stats_type >", value, "statsType");
            return (Criteria) this;
        }

        public Criteria andStatsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stats_type >=", value, "statsType");
            return (Criteria) this;
        }

        public Criteria andStatsTypeLessThan(Integer value) {
            addCriterion("stats_type <", value, "statsType");
            return (Criteria) this;
        }

        public Criteria andStatsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("stats_type <=", value, "statsType");
            return (Criteria) this;
        }

        public Criteria andStatsTypeIn(List<Integer> values) {
            addCriterion("stats_type in", values, "statsType");
            return (Criteria) this;
        }

        public Criteria andStatsTypeNotIn(List<Integer> values) {
            addCriterion("stats_type not in", values, "statsType");
            return (Criteria) this;
        }

        public Criteria andStatsTypeBetween(Integer value1, Integer value2) {
            addCriterion("stats_type between", value1, value2, "statsType");
            return (Criteria) this;
        }

        public Criteria andStatsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("stats_type not between", value1, value2, "statsType");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andStatsDateIsNull() {
            addCriterion("stats_date is null");
            return (Criteria) this;
        }

        public Criteria andStatsDateIsNotNull() {
            addCriterion("stats_date is not null");
            return (Criteria) this;
        }

        public Criteria andStatsDateEqualTo(Date value) {
            addCriterionForJDBCDate("stats_date =", value, "statsDate");
            return (Criteria) this;
        }

        public Criteria andStatsDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("stats_date <>", value, "statsDate");
            return (Criteria) this;
        }

        public Criteria andStatsDateGreaterThan(Date value) {
            addCriterionForJDBCDate("stats_date >", value, "statsDate");
            return (Criteria) this;
        }

        public Criteria andStatsDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stats_date >=", value, "statsDate");
            return (Criteria) this;
        }

        public Criteria andStatsDateLessThan(Date value) {
            addCriterionForJDBCDate("stats_date <", value, "statsDate");
            return (Criteria) this;
        }

        public Criteria andStatsDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stats_date <=", value, "statsDate");
            return (Criteria) this;
        }

        public Criteria andStatsDateIn(List<Date> values) {
            addCriterionForJDBCDate("stats_date in", values, "statsDate");
            return (Criteria) this;
        }

        public Criteria andStatsDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("stats_date not in", values, "statsDate");
            return (Criteria) this;
        }

        public Criteria andStatsDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stats_date between", value1, value2, "statsDate");
            return (Criteria) this;
        }

        public Criteria andStatsDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stats_date not between", value1, value2, "statsDate");
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