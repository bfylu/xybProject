package com.xyb.ai.model.xyb;

import java.util.ArrayList;
import java.util.List;

public class ShopCategoryGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopCategoryGroupExample() {
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

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andCatIdsIsNull() {
            addCriterion("cat_ids is null");
            return (Criteria) this;
        }

        public Criteria andCatIdsIsNotNull() {
            addCriterion("cat_ids is not null");
            return (Criteria) this;
        }

        public Criteria andCatIdsEqualTo(String value) {
            addCriterion("cat_ids =", value, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsNotEqualTo(String value) {
            addCriterion("cat_ids <>", value, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsGreaterThan(String value) {
            addCriterion("cat_ids >", value, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsGreaterThanOrEqualTo(String value) {
            addCriterion("cat_ids >=", value, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsLessThan(String value) {
            addCriterion("cat_ids <", value, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsLessThanOrEqualTo(String value) {
            addCriterion("cat_ids <=", value, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsLike(String value) {
            addCriterion("cat_ids like", value, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsNotLike(String value) {
            addCriterion("cat_ids not like", value, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsIn(List<String> values) {
            addCriterion("cat_ids in", values, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsNotIn(List<String> values) {
            addCriterion("cat_ids not in", values, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsBetween(String value1, String value2) {
            addCriterion("cat_ids between", value1, value2, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsNotBetween(String value1, String value2) {
            addCriterion("cat_ids not between", value1, value2, "catIds");
            return (Criteria) this;
        }

        public Criteria andShowMethodIsNull() {
            addCriterion("show_method is null");
            return (Criteria) this;
        }

        public Criteria andShowMethodIsNotNull() {
            addCriterion("show_method is not null");
            return (Criteria) this;
        }

        public Criteria andShowMethodEqualTo(Integer value) {
            addCriterion("show_method =", value, "showMethod");
            return (Criteria) this;
        }

        public Criteria andShowMethodNotEqualTo(Integer value) {
            addCriterion("show_method <>", value, "showMethod");
            return (Criteria) this;
        }

        public Criteria andShowMethodGreaterThan(Integer value) {
            addCriterion("show_method >", value, "showMethod");
            return (Criteria) this;
        }

        public Criteria andShowMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_method >=", value, "showMethod");
            return (Criteria) this;
        }

        public Criteria andShowMethodLessThan(Integer value) {
            addCriterion("show_method <", value, "showMethod");
            return (Criteria) this;
        }

        public Criteria andShowMethodLessThanOrEqualTo(Integer value) {
            addCriterion("show_method <=", value, "showMethod");
            return (Criteria) this;
        }

        public Criteria andShowMethodIn(List<Integer> values) {
            addCriterion("show_method in", values, "showMethod");
            return (Criteria) this;
        }

        public Criteria andShowMethodNotIn(List<Integer> values) {
            addCriterion("show_method not in", values, "showMethod");
            return (Criteria) this;
        }

        public Criteria andShowMethodBetween(Integer value1, Integer value2) {
            addCriterion("show_method between", value1, value2, "showMethod");
            return (Criteria) this;
        }

        public Criteria andShowMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("show_method not between", value1, value2, "showMethod");
            return (Criteria) this;
        }

        public Criteria andSeqIndexIsNull() {
            addCriterion("seq_index is null");
            return (Criteria) this;
        }

        public Criteria andSeqIndexIsNotNull() {
            addCriterion("seq_index is not null");
            return (Criteria) this;
        }

        public Criteria andSeqIndexEqualTo(Integer value) {
            addCriterion("seq_index =", value, "seqIndex");
            return (Criteria) this;
        }

        public Criteria andSeqIndexNotEqualTo(Integer value) {
            addCriterion("seq_index <>", value, "seqIndex");
            return (Criteria) this;
        }

        public Criteria andSeqIndexGreaterThan(Integer value) {
            addCriterion("seq_index >", value, "seqIndex");
            return (Criteria) this;
        }

        public Criteria andSeqIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("seq_index >=", value, "seqIndex");
            return (Criteria) this;
        }

        public Criteria andSeqIndexLessThan(Integer value) {
            addCriterion("seq_index <", value, "seqIndex");
            return (Criteria) this;
        }

        public Criteria andSeqIndexLessThanOrEqualTo(Integer value) {
            addCriterion("seq_index <=", value, "seqIndex");
            return (Criteria) this;
        }

        public Criteria andSeqIndexIn(List<Integer> values) {
            addCriterion("seq_index in", values, "seqIndex");
            return (Criteria) this;
        }

        public Criteria andSeqIndexNotIn(List<Integer> values) {
            addCriterion("seq_index not in", values, "seqIndex");
            return (Criteria) this;
        }

        public Criteria andSeqIndexBetween(Integer value1, Integer value2) {
            addCriterion("seq_index between", value1, value2, "seqIndex");
            return (Criteria) this;
        }

        public Criteria andSeqIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("seq_index not between", value1, value2, "seqIndex");
            return (Criteria) this;
        }

        public Criteria andShowLinkIsNull() {
            addCriterion("show_link is null");
            return (Criteria) this;
        }

        public Criteria andShowLinkIsNotNull() {
            addCriterion("show_link is not null");
            return (Criteria) this;
        }

        public Criteria andShowLinkEqualTo(String value) {
            addCriterion("show_link =", value, "showLink");
            return (Criteria) this;
        }

        public Criteria andShowLinkNotEqualTo(String value) {
            addCriterion("show_link <>", value, "showLink");
            return (Criteria) this;
        }

        public Criteria andShowLinkGreaterThan(String value) {
            addCriterion("show_link >", value, "showLink");
            return (Criteria) this;
        }

        public Criteria andShowLinkGreaterThanOrEqualTo(String value) {
            addCriterion("show_link >=", value, "showLink");
            return (Criteria) this;
        }

        public Criteria andShowLinkLessThan(String value) {
            addCriterion("show_link <", value, "showLink");
            return (Criteria) this;
        }

        public Criteria andShowLinkLessThanOrEqualTo(String value) {
            addCriterion("show_link <=", value, "showLink");
            return (Criteria) this;
        }

        public Criteria andShowLinkLike(String value) {
            addCriterion("show_link like", value, "showLink");
            return (Criteria) this;
        }

        public Criteria andShowLinkNotLike(String value) {
            addCriterion("show_link not like", value, "showLink");
            return (Criteria) this;
        }

        public Criteria andShowLinkIn(List<String> values) {
            addCriterion("show_link in", values, "showLink");
            return (Criteria) this;
        }

        public Criteria andShowLinkNotIn(List<String> values) {
            addCriterion("show_link not in", values, "showLink");
            return (Criteria) this;
        }

        public Criteria andShowLinkBetween(String value1, String value2) {
            addCriterion("show_link between", value1, value2, "showLink");
            return (Criteria) this;
        }

        public Criteria andShowLinkNotBetween(String value1, String value2) {
            addCriterion("show_link not between", value1, value2, "showLink");
            return (Criteria) this;
        }

        public Criteria andCatIdIsNull() {
            addCriterion("cat_id is null");
            return (Criteria) this;
        }

        public Criteria andCatIdIsNotNull() {
            addCriterion("cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatIdEqualTo(Long value) {
            addCriterion("cat_id =", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotEqualTo(Long value) {
            addCriterion("cat_id <>", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThan(Long value) {
            addCriterion("cat_id >", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cat_id >=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThan(Long value) {
            addCriterion("cat_id <", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThanOrEqualTo(Long value) {
            addCriterion("cat_id <=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdIn(List<Long> values) {
            addCriterion("cat_id in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotIn(List<Long> values) {
            addCriterion("cat_id not in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdBetween(Long value1, Long value2) {
            addCriterion("cat_id between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotBetween(Long value1, Long value2) {
            addCriterion("cat_id not between", value1, value2, "catId");
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