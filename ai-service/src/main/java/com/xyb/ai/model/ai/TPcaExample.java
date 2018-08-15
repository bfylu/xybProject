package com.xyb.ai.model.ai;

import java.util.ArrayList;
import java.util.List;

public class TPcaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPcaExample() {
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

        public Criteria andPcaCodeIsNull() {
            addCriterion("pca_code is null");
            return (Criteria) this;
        }

        public Criteria andPcaCodeIsNotNull() {
            addCriterion("pca_code is not null");
            return (Criteria) this;
        }

        public Criteria andPcaCodeEqualTo(String value) {
            addCriterion("pca_code =", value, "pcaCode");
            return (Criteria) this;
        }

        public Criteria andPcaCodeNotEqualTo(String value) {
            addCriterion("pca_code <>", value, "pcaCode");
            return (Criteria) this;
        }

        public Criteria andPcaCodeGreaterThan(String value) {
            addCriterion("pca_code >", value, "pcaCode");
            return (Criteria) this;
        }

        public Criteria andPcaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pca_code >=", value, "pcaCode");
            return (Criteria) this;
        }

        public Criteria andPcaCodeLessThan(String value) {
            addCriterion("pca_code <", value, "pcaCode");
            return (Criteria) this;
        }

        public Criteria andPcaCodeLessThanOrEqualTo(String value) {
            addCriterion("pca_code <=", value, "pcaCode");
            return (Criteria) this;
        }

        public Criteria andPcaCodeLike(String value) {
            addCriterion("pca_code like", value, "pcaCode");
            return (Criteria) this;
        }

        public Criteria andPcaCodeNotLike(String value) {
            addCriterion("pca_code not like", value, "pcaCode");
            return (Criteria) this;
        }

        public Criteria andPcaCodeIn(List<String> values) {
            addCriterion("pca_code in", values, "pcaCode");
            return (Criteria) this;
        }

        public Criteria andPcaCodeNotIn(List<String> values) {
            addCriterion("pca_code not in", values, "pcaCode");
            return (Criteria) this;
        }

        public Criteria andPcaCodeBetween(String value1, String value2) {
            addCriterion("pca_code between", value1, value2, "pcaCode");
            return (Criteria) this;
        }

        public Criteria andPcaCodeNotBetween(String value1, String value2) {
            addCriterion("pca_code not between", value1, value2, "pcaCode");
            return (Criteria) this;
        }

        public Criteria andPcaNameIsNull() {
            addCriterion("pca_name is null");
            return (Criteria) this;
        }

        public Criteria andPcaNameIsNotNull() {
            addCriterion("pca_name is not null");
            return (Criteria) this;
        }

        public Criteria andPcaNameEqualTo(String value) {
            addCriterion("pca_name =", value, "pcaName");
            return (Criteria) this;
        }

        public Criteria andPcaNameNotEqualTo(String value) {
            addCriterion("pca_name <>", value, "pcaName");
            return (Criteria) this;
        }

        public Criteria andPcaNameGreaterThan(String value) {
            addCriterion("pca_name >", value, "pcaName");
            return (Criteria) this;
        }

        public Criteria andPcaNameGreaterThanOrEqualTo(String value) {
            addCriterion("pca_name >=", value, "pcaName");
            return (Criteria) this;
        }

        public Criteria andPcaNameLessThan(String value) {
            addCriterion("pca_name <", value, "pcaName");
            return (Criteria) this;
        }

        public Criteria andPcaNameLessThanOrEqualTo(String value) {
            addCriterion("pca_name <=", value, "pcaName");
            return (Criteria) this;
        }

        public Criteria andPcaNameLike(String value) {
            addCriterion("pca_name like", value, "pcaName");
            return (Criteria) this;
        }

        public Criteria andPcaNameNotLike(String value) {
            addCriterion("pca_name not like", value, "pcaName");
            return (Criteria) this;
        }

        public Criteria andPcaNameIn(List<String> values) {
            addCriterion("pca_name in", values, "pcaName");
            return (Criteria) this;
        }

        public Criteria andPcaNameNotIn(List<String> values) {
            addCriterion("pca_name not in", values, "pcaName");
            return (Criteria) this;
        }

        public Criteria andPcaNameBetween(String value1, String value2) {
            addCriterion("pca_name between", value1, value2, "pcaName");
            return (Criteria) this;
        }

        public Criteria andPcaNameNotBetween(String value1, String value2) {
            addCriterion("pca_name not between", value1, value2, "pcaName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPcaDescIsNull() {
            addCriterion("pca_desc is null");
            return (Criteria) this;
        }

        public Criteria andPcaDescIsNotNull() {
            addCriterion("pca_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPcaDescEqualTo(String value) {
            addCriterion("pca_desc =", value, "pcaDesc");
            return (Criteria) this;
        }

        public Criteria andPcaDescNotEqualTo(String value) {
            addCriterion("pca_desc <>", value, "pcaDesc");
            return (Criteria) this;
        }

        public Criteria andPcaDescGreaterThan(String value) {
            addCriterion("pca_desc >", value, "pcaDesc");
            return (Criteria) this;
        }

        public Criteria andPcaDescGreaterThanOrEqualTo(String value) {
            addCriterion("pca_desc >=", value, "pcaDesc");
            return (Criteria) this;
        }

        public Criteria andPcaDescLessThan(String value) {
            addCriterion("pca_desc <", value, "pcaDesc");
            return (Criteria) this;
        }

        public Criteria andPcaDescLessThanOrEqualTo(String value) {
            addCriterion("pca_desc <=", value, "pcaDesc");
            return (Criteria) this;
        }

        public Criteria andPcaDescLike(String value) {
            addCriterion("pca_desc like", value, "pcaDesc");
            return (Criteria) this;
        }

        public Criteria andPcaDescNotLike(String value) {
            addCriterion("pca_desc not like", value, "pcaDesc");
            return (Criteria) this;
        }

        public Criteria andPcaDescIn(List<String> values) {
            addCriterion("pca_desc in", values, "pcaDesc");
            return (Criteria) this;
        }

        public Criteria andPcaDescNotIn(List<String> values) {
            addCriterion("pca_desc not in", values, "pcaDesc");
            return (Criteria) this;
        }

        public Criteria andPcaDescBetween(String value1, String value2) {
            addCriterion("pca_desc between", value1, value2, "pcaDesc");
            return (Criteria) this;
        }

        public Criteria andPcaDescNotBetween(String value1, String value2) {
            addCriterion("pca_desc not between", value1, value2, "pcaDesc");
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