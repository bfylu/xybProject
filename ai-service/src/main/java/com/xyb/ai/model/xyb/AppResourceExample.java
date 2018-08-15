package com.xyb.ai.model.xyb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppResourceExample() {
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

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(Integer value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(Integer value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(Integer value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(Integer value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(Integer value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(Integer value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<Integer> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<Integer> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(Integer value1, Integer value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(Integer value1, Integer value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNull() {
            addCriterion("terminal_type is null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNotNull() {
            addCriterion("terminal_type is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeEqualTo(Integer value) {
            addCriterion("terminal_type =", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotEqualTo(Integer value) {
            addCriterion("terminal_type <>", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThan(Integer value) {
            addCriterion("terminal_type >", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("terminal_type >=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThan(Integer value) {
            addCriterion("terminal_type <", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThanOrEqualTo(Integer value) {
            addCriterion("terminal_type <=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIn(List<Integer> values) {
            addCriterion("terminal_type in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotIn(List<Integer> values) {
            addCriterion("terminal_type not in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeBetween(Integer value1, Integer value2) {
            addCriterion("terminal_type between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("terminal_type not between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNull() {
            addCriterion("res_type is null");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNotNull() {
            addCriterion("res_type is not null");
            return (Criteria) this;
        }

        public Criteria andResTypeEqualTo(Integer value) {
            addCriterion("res_type =", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotEqualTo(Integer value) {
            addCriterion("res_type <>", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThan(Integer value) {
            addCriterion("res_type >", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("res_type >=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThan(Integer value) {
            addCriterion("res_type <", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThanOrEqualTo(Integer value) {
            addCriterion("res_type <=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeIn(List<Integer> values) {
            addCriterion("res_type in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotIn(List<Integer> values) {
            addCriterion("res_type not in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeBetween(Integer value1, Integer value2) {
            addCriterion("res_type between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("res_type not between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andAppVerCodeIsNull() {
            addCriterion("app_ver_code is null");
            return (Criteria) this;
        }

        public Criteria andAppVerCodeIsNotNull() {
            addCriterion("app_ver_code is not null");
            return (Criteria) this;
        }

        public Criteria andAppVerCodeEqualTo(Integer value) {
            addCriterion("app_ver_code =", value, "appVerCode");
            return (Criteria) this;
        }

        public Criteria andAppVerCodeNotEqualTo(Integer value) {
            addCriterion("app_ver_code <>", value, "appVerCode");
            return (Criteria) this;
        }

        public Criteria andAppVerCodeGreaterThan(Integer value) {
            addCriterion("app_ver_code >", value, "appVerCode");
            return (Criteria) this;
        }

        public Criteria andAppVerCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_ver_code >=", value, "appVerCode");
            return (Criteria) this;
        }

        public Criteria andAppVerCodeLessThan(Integer value) {
            addCriterion("app_ver_code <", value, "appVerCode");
            return (Criteria) this;
        }

        public Criteria andAppVerCodeLessThanOrEqualTo(Integer value) {
            addCriterion("app_ver_code <=", value, "appVerCode");
            return (Criteria) this;
        }

        public Criteria andAppVerCodeIn(List<Integer> values) {
            addCriterion("app_ver_code in", values, "appVerCode");
            return (Criteria) this;
        }

        public Criteria andAppVerCodeNotIn(List<Integer> values) {
            addCriterion("app_ver_code not in", values, "appVerCode");
            return (Criteria) this;
        }

        public Criteria andAppVerCodeBetween(Integer value1, Integer value2) {
            addCriterion("app_ver_code between", value1, value2, "appVerCode");
            return (Criteria) this;
        }

        public Criteria andAppVerCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("app_ver_code not between", value1, value2, "appVerCode");
            return (Criteria) this;
        }

        public Criteria andAppVerNameIsNull() {
            addCriterion("app_ver_name is null");
            return (Criteria) this;
        }

        public Criteria andAppVerNameIsNotNull() {
            addCriterion("app_ver_name is not null");
            return (Criteria) this;
        }

        public Criteria andAppVerNameEqualTo(String value) {
            addCriterion("app_ver_name =", value, "appVerName");
            return (Criteria) this;
        }

        public Criteria andAppVerNameNotEqualTo(String value) {
            addCriterion("app_ver_name <>", value, "appVerName");
            return (Criteria) this;
        }

        public Criteria andAppVerNameGreaterThan(String value) {
            addCriterion("app_ver_name >", value, "appVerName");
            return (Criteria) this;
        }

        public Criteria andAppVerNameGreaterThanOrEqualTo(String value) {
            addCriterion("app_ver_name >=", value, "appVerName");
            return (Criteria) this;
        }

        public Criteria andAppVerNameLessThan(String value) {
            addCriterion("app_ver_name <", value, "appVerName");
            return (Criteria) this;
        }

        public Criteria andAppVerNameLessThanOrEqualTo(String value) {
            addCriterion("app_ver_name <=", value, "appVerName");
            return (Criteria) this;
        }

        public Criteria andAppVerNameLike(String value) {
            addCriterion("app_ver_name like", value, "appVerName");
            return (Criteria) this;
        }

        public Criteria andAppVerNameNotLike(String value) {
            addCriterion("app_ver_name not like", value, "appVerName");
            return (Criteria) this;
        }

        public Criteria andAppVerNameIn(List<String> values) {
            addCriterion("app_ver_name in", values, "appVerName");
            return (Criteria) this;
        }

        public Criteria andAppVerNameNotIn(List<String> values) {
            addCriterion("app_ver_name not in", values, "appVerName");
            return (Criteria) this;
        }

        public Criteria andAppVerNameBetween(String value1, String value2) {
            addCriterion("app_ver_name between", value1, value2, "appVerName");
            return (Criteria) this;
        }

        public Criteria andAppVerNameNotBetween(String value1, String value2) {
            addCriterion("app_ver_name not between", value1, value2, "appVerName");
            return (Criteria) this;
        }

        public Criteria andResVerCodeIsNull() {
            addCriterion("res_ver_code is null");
            return (Criteria) this;
        }

        public Criteria andResVerCodeIsNotNull() {
            addCriterion("res_ver_code is not null");
            return (Criteria) this;
        }

        public Criteria andResVerCodeEqualTo(Integer value) {
            addCriterion("res_ver_code =", value, "resVerCode");
            return (Criteria) this;
        }

        public Criteria andResVerCodeNotEqualTo(Integer value) {
            addCriterion("res_ver_code <>", value, "resVerCode");
            return (Criteria) this;
        }

        public Criteria andResVerCodeGreaterThan(Integer value) {
            addCriterion("res_ver_code >", value, "resVerCode");
            return (Criteria) this;
        }

        public Criteria andResVerCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("res_ver_code >=", value, "resVerCode");
            return (Criteria) this;
        }

        public Criteria andResVerCodeLessThan(Integer value) {
            addCriterion("res_ver_code <", value, "resVerCode");
            return (Criteria) this;
        }

        public Criteria andResVerCodeLessThanOrEqualTo(Integer value) {
            addCriterion("res_ver_code <=", value, "resVerCode");
            return (Criteria) this;
        }

        public Criteria andResVerCodeIn(List<Integer> values) {
            addCriterion("res_ver_code in", values, "resVerCode");
            return (Criteria) this;
        }

        public Criteria andResVerCodeNotIn(List<Integer> values) {
            addCriterion("res_ver_code not in", values, "resVerCode");
            return (Criteria) this;
        }

        public Criteria andResVerCodeBetween(Integer value1, Integer value2) {
            addCriterion("res_ver_code between", value1, value2, "resVerCode");
            return (Criteria) this;
        }

        public Criteria andResVerCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("res_ver_code not between", value1, value2, "resVerCode");
            return (Criteria) this;
        }

        public Criteria andResVerNameIsNull() {
            addCriterion("res_ver_name is null");
            return (Criteria) this;
        }

        public Criteria andResVerNameIsNotNull() {
            addCriterion("res_ver_name is not null");
            return (Criteria) this;
        }

        public Criteria andResVerNameEqualTo(String value) {
            addCriterion("res_ver_name =", value, "resVerName");
            return (Criteria) this;
        }

        public Criteria andResVerNameNotEqualTo(String value) {
            addCriterion("res_ver_name <>", value, "resVerName");
            return (Criteria) this;
        }

        public Criteria andResVerNameGreaterThan(String value) {
            addCriterion("res_ver_name >", value, "resVerName");
            return (Criteria) this;
        }

        public Criteria andResVerNameGreaterThanOrEqualTo(String value) {
            addCriterion("res_ver_name >=", value, "resVerName");
            return (Criteria) this;
        }

        public Criteria andResVerNameLessThan(String value) {
            addCriterion("res_ver_name <", value, "resVerName");
            return (Criteria) this;
        }

        public Criteria andResVerNameLessThanOrEqualTo(String value) {
            addCriterion("res_ver_name <=", value, "resVerName");
            return (Criteria) this;
        }

        public Criteria andResVerNameLike(String value) {
            addCriterion("res_ver_name like", value, "resVerName");
            return (Criteria) this;
        }

        public Criteria andResVerNameNotLike(String value) {
            addCriterion("res_ver_name not like", value, "resVerName");
            return (Criteria) this;
        }

        public Criteria andResVerNameIn(List<String> values) {
            addCriterion("res_ver_name in", values, "resVerName");
            return (Criteria) this;
        }

        public Criteria andResVerNameNotIn(List<String> values) {
            addCriterion("res_ver_name not in", values, "resVerName");
            return (Criteria) this;
        }

        public Criteria andResVerNameBetween(String value1, String value2) {
            addCriterion("res_ver_name between", value1, value2, "resVerName");
            return (Criteria) this;
        }

        public Criteria andResVerNameNotBetween(String value1, String value2) {
            addCriterion("res_ver_name not between", value1, value2, "resVerName");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIsNull() {
            addCriterion("download_url is null");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIsNotNull() {
            addCriterion("download_url is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlEqualTo(String value) {
            addCriterion("download_url =", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotEqualTo(String value) {
            addCriterion("download_url <>", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlGreaterThan(String value) {
            addCriterion("download_url >", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("download_url >=", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLessThan(String value) {
            addCriterion("download_url <", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLessThanOrEqualTo(String value) {
            addCriterion("download_url <=", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLike(String value) {
            addCriterion("download_url like", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotLike(String value) {
            addCriterion("download_url not like", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIn(List<String> values) {
            addCriterion("download_url in", values, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotIn(List<String> values) {
            addCriterion("download_url not in", values, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlBetween(String value1, String value2) {
            addCriterion("download_url between", value1, value2, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotBetween(String value1, String value2) {
            addCriterion("download_url not between", value1, value2, "downloadUrl");
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

        public Criteria andReleaseTimeIsNull() {
            addCriterion("release_time is null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNotNull() {
            addCriterion("release_time is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeEqualTo(Date value) {
            addCriterion("release_time =", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotEqualTo(Date value) {
            addCriterion("release_time <>", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThan(Date value) {
            addCriterion("release_time >", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("release_time >=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThan(Date value) {
            addCriterion("release_time <", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("release_time <=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIn(List<Date> values) {
            addCriterion("release_time in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotIn(List<Date> values) {
            addCriterion("release_time not in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeBetween(Date value1, Date value2) {
            addCriterion("release_time between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("release_time not between", value1, value2, "releaseTime");
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