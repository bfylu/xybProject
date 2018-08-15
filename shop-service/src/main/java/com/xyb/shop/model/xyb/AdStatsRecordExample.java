package com.xyb.shop.model.xyb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdStatsRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdStatsRecordExample() {
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

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(Integer value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(Integer value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(Integer value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(Integer value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(Integer value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<Integer> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<Integer> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(Integer value1, Integer value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andClienIpIsNull() {
            addCriterion("clien_ip is null");
            return (Criteria) this;
        }

        public Criteria andClienIpIsNotNull() {
            addCriterion("clien_ip is not null");
            return (Criteria) this;
        }

        public Criteria andClienIpEqualTo(String value) {
            addCriterion("clien_ip =", value, "clienIp");
            return (Criteria) this;
        }

        public Criteria andClienIpNotEqualTo(String value) {
            addCriterion("clien_ip <>", value, "clienIp");
            return (Criteria) this;
        }

        public Criteria andClienIpGreaterThan(String value) {
            addCriterion("clien_ip >", value, "clienIp");
            return (Criteria) this;
        }

        public Criteria andClienIpGreaterThanOrEqualTo(String value) {
            addCriterion("clien_ip >=", value, "clienIp");
            return (Criteria) this;
        }

        public Criteria andClienIpLessThan(String value) {
            addCriterion("clien_ip <", value, "clienIp");
            return (Criteria) this;
        }

        public Criteria andClienIpLessThanOrEqualTo(String value) {
            addCriterion("clien_ip <=", value, "clienIp");
            return (Criteria) this;
        }

        public Criteria andClienIpLike(String value) {
            addCriterion("clien_ip like", value, "clienIp");
            return (Criteria) this;
        }

        public Criteria andClienIpNotLike(String value) {
            addCriterion("clien_ip not like", value, "clienIp");
            return (Criteria) this;
        }

        public Criteria andClienIpIn(List<String> values) {
            addCriterion("clien_ip in", values, "clienIp");
            return (Criteria) this;
        }

        public Criteria andClienIpNotIn(List<String> values) {
            addCriterion("clien_ip not in", values, "clienIp");
            return (Criteria) this;
        }

        public Criteria andClienIpBetween(String value1, String value2) {
            addCriterion("clien_ip between", value1, value2, "clienIp");
            return (Criteria) this;
        }

        public Criteria andClienIpNotBetween(String value1, String value2) {
            addCriterion("clien_ip not between", value1, value2, "clienIp");
            return (Criteria) this;
        }

        public Criteria andClickTimeIsNull() {
            addCriterion("click_time is null");
            return (Criteria) this;
        }

        public Criteria andClickTimeIsNotNull() {
            addCriterion("click_time is not null");
            return (Criteria) this;
        }

        public Criteria andClickTimeEqualTo(Date value) {
            addCriterion("click_time =", value, "clickTime");
            return (Criteria) this;
        }

        public Criteria andClickTimeNotEqualTo(Date value) {
            addCriterion("click_time <>", value, "clickTime");
            return (Criteria) this;
        }

        public Criteria andClickTimeGreaterThan(Date value) {
            addCriterion("click_time >", value, "clickTime");
            return (Criteria) this;
        }

        public Criteria andClickTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("click_time >=", value, "clickTime");
            return (Criteria) this;
        }

        public Criteria andClickTimeLessThan(Date value) {
            addCriterion("click_time <", value, "clickTime");
            return (Criteria) this;
        }

        public Criteria andClickTimeLessThanOrEqualTo(Date value) {
            addCriterion("click_time <=", value, "clickTime");
            return (Criteria) this;
        }

        public Criteria andClickTimeIn(List<Date> values) {
            addCriterion("click_time in", values, "clickTime");
            return (Criteria) this;
        }

        public Criteria andClickTimeNotIn(List<Date> values) {
            addCriterion("click_time not in", values, "clickTime");
            return (Criteria) this;
        }

        public Criteria andClickTimeBetween(Date value1, Date value2) {
            addCriterion("click_time between", value1, value2, "clickTime");
            return (Criteria) this;
        }

        public Criteria andClickTimeNotBetween(Date value1, Date value2) {
            addCriterion("click_time not between", value1, value2, "clickTime");
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