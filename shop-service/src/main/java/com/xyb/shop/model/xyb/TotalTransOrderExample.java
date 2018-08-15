package com.xyb.shop.model.xyb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TotalTransOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TotalTransOrderExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSrcDbIsNull() {
            addCriterion("src_db is null");
            return (Criteria) this;
        }

        public Criteria andSrcDbIsNotNull() {
            addCriterion("src_db is not null");
            return (Criteria) this;
        }

        public Criteria andSrcDbEqualTo(String value) {
            addCriterion("src_db =", value, "srcDb");
            return (Criteria) this;
        }

        public Criteria andSrcDbNotEqualTo(String value) {
            addCriterion("src_db <>", value, "srcDb");
            return (Criteria) this;
        }

        public Criteria andSrcDbGreaterThan(String value) {
            addCriterion("src_db >", value, "srcDb");
            return (Criteria) this;
        }

        public Criteria andSrcDbGreaterThanOrEqualTo(String value) {
            addCriterion("src_db >=", value, "srcDb");
            return (Criteria) this;
        }

        public Criteria andSrcDbLessThan(String value) {
            addCriterion("src_db <", value, "srcDb");
            return (Criteria) this;
        }

        public Criteria andSrcDbLessThanOrEqualTo(String value) {
            addCriterion("src_db <=", value, "srcDb");
            return (Criteria) this;
        }

        public Criteria andSrcDbLike(String value) {
            addCriterion("src_db like", value, "srcDb");
            return (Criteria) this;
        }

        public Criteria andSrcDbNotLike(String value) {
            addCriterion("src_db not like", value, "srcDb");
            return (Criteria) this;
        }

        public Criteria andSrcDbIn(List<String> values) {
            addCriterion("src_db in", values, "srcDb");
            return (Criteria) this;
        }

        public Criteria andSrcDbNotIn(List<String> values) {
            addCriterion("src_db not in", values, "srcDb");
            return (Criteria) this;
        }

        public Criteria andSrcDbBetween(String value1, String value2) {
            addCriterion("src_db between", value1, value2, "srcDb");
            return (Criteria) this;
        }

        public Criteria andSrcDbNotBetween(String value1, String value2) {
            addCriterion("src_db not between", value1, value2, "srcDb");
            return (Criteria) this;
        }

        public Criteria andSrcTableIsNull() {
            addCriterion("src_table is null");
            return (Criteria) this;
        }

        public Criteria andSrcTableIsNotNull() {
            addCriterion("src_table is not null");
            return (Criteria) this;
        }

        public Criteria andSrcTableEqualTo(String value) {
            addCriterion("src_table =", value, "srcTable");
            return (Criteria) this;
        }

        public Criteria andSrcTableNotEqualTo(String value) {
            addCriterion("src_table <>", value, "srcTable");
            return (Criteria) this;
        }

        public Criteria andSrcTableGreaterThan(String value) {
            addCriterion("src_table >", value, "srcTable");
            return (Criteria) this;
        }

        public Criteria andSrcTableGreaterThanOrEqualTo(String value) {
            addCriterion("src_table >=", value, "srcTable");
            return (Criteria) this;
        }

        public Criteria andSrcTableLessThan(String value) {
            addCriterion("src_table <", value, "srcTable");
            return (Criteria) this;
        }

        public Criteria andSrcTableLessThanOrEqualTo(String value) {
            addCriterion("src_table <=", value, "srcTable");
            return (Criteria) this;
        }

        public Criteria andSrcTableLike(String value) {
            addCriterion("src_table like", value, "srcTable");
            return (Criteria) this;
        }

        public Criteria andSrcTableNotLike(String value) {
            addCriterion("src_table not like", value, "srcTable");
            return (Criteria) this;
        }

        public Criteria andSrcTableIn(List<String> values) {
            addCriterion("src_table in", values, "srcTable");
            return (Criteria) this;
        }

        public Criteria andSrcTableNotIn(List<String> values) {
            addCriterion("src_table not in", values, "srcTable");
            return (Criteria) this;
        }

        public Criteria andSrcTableBetween(String value1, String value2) {
            addCriterion("src_table between", value1, value2, "srcTable");
            return (Criteria) this;
        }

        public Criteria andSrcTableNotBetween(String value1, String value2) {
            addCriterion("src_table not between", value1, value2, "srcTable");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
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

        public Criteria andSubMerCodeIsNull() {
            addCriterion("sub_mer_code is null");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeIsNotNull() {
            addCriterion("sub_mer_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeEqualTo(String value) {
            addCriterion("sub_mer_code =", value, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeNotEqualTo(String value) {
            addCriterion("sub_mer_code <>", value, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeGreaterThan(String value) {
            addCriterion("sub_mer_code >", value, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sub_mer_code >=", value, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeLessThan(String value) {
            addCriterion("sub_mer_code <", value, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeLessThanOrEqualTo(String value) {
            addCriterion("sub_mer_code <=", value, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeLike(String value) {
            addCriterion("sub_mer_code like", value, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeNotLike(String value) {
            addCriterion("sub_mer_code not like", value, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeIn(List<String> values) {
            addCriterion("sub_mer_code in", values, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeNotIn(List<String> values) {
            addCriterion("sub_mer_code not in", values, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeBetween(String value1, String value2) {
            addCriterion("sub_mer_code between", value1, value2, "subMerCode");
            return (Criteria) this;
        }

        public Criteria andSubMerCodeNotBetween(String value1, String value2) {
            addCriterion("sub_mer_code not between", value1, value2, "subMerCode");
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

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIsNull() {
            addCriterion("function_code is null");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIsNotNull() {
            addCriterion("function_code is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeEqualTo(String value) {
            addCriterion("function_code =", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotEqualTo(String value) {
            addCriterion("function_code <>", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeGreaterThan(String value) {
            addCriterion("function_code >", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("function_code >=", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLessThan(String value) {
            addCriterion("function_code <", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLessThanOrEqualTo(String value) {
            addCriterion("function_code <=", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLike(String value) {
            addCriterion("function_code like", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotLike(String value) {
            addCriterion("function_code not like", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIn(List<String> values) {
            addCriterion("function_code in", values, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotIn(List<String> values) {
            addCriterion("function_code not in", values, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeBetween(String value1, String value2) {
            addCriterion("function_code between", value1, value2, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotBetween(String value1, String value2) {
            addCriterion("function_code not between", value1, value2, "functionCode");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNull() {
            addCriterion("biz_type is null");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNotNull() {
            addCriterion("biz_type is not null");
            return (Criteria) this;
        }

        public Criteria andBizTypeEqualTo(String value) {
            addCriterion("biz_type =", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotEqualTo(String value) {
            addCriterion("biz_type <>", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThan(String value) {
            addCriterion("biz_type >", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThanOrEqualTo(String value) {
            addCriterion("biz_type >=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThan(String value) {
            addCriterion("biz_type <", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThanOrEqualTo(String value) {
            addCriterion("biz_type <=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLike(String value) {
            addCriterion("biz_type like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotLike(String value) {
            addCriterion("biz_type not like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeIn(List<String> values) {
            addCriterion("biz_type in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotIn(List<String> values) {
            addCriterion("biz_type not in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeBetween(String value1, String value2) {
            addCriterion("biz_type between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotBetween(String value1, String value2) {
            addCriterion("biz_type not between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeIsNull() {
            addCriterion("biz_subtype is null");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeIsNotNull() {
            addCriterion("biz_subtype is not null");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeEqualTo(String value) {
            addCriterion("biz_subtype =", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeNotEqualTo(String value) {
            addCriterion("biz_subtype <>", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeGreaterThan(String value) {
            addCriterion("biz_subtype >", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeGreaterThanOrEqualTo(String value) {
            addCriterion("biz_subtype >=", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeLessThan(String value) {
            addCriterion("biz_subtype <", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeLessThanOrEqualTo(String value) {
            addCriterion("biz_subtype <=", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeLike(String value) {
            addCriterion("biz_subtype like", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeNotLike(String value) {
            addCriterion("biz_subtype not like", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeIn(List<String> values) {
            addCriterion("biz_subtype in", values, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeNotIn(List<String> values) {
            addCriterion("biz_subtype not in", values, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeBetween(String value1, String value2) {
            addCriterion("biz_subtype between", value1, value2, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeNotBetween(String value1, String value2) {
            addCriterion("biz_subtype not between", value1, value2, "bizSubtype");
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

        public Criteria andOrigOrderNoIsNull() {
            addCriterion("orig_order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrigOrderNoIsNotNull() {
            addCriterion("orig_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrigOrderNoEqualTo(String value) {
            addCriterion("orig_order_no =", value, "origOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrigOrderNoNotEqualTo(String value) {
            addCriterion("orig_order_no <>", value, "origOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrigOrderNoGreaterThan(String value) {
            addCriterion("orig_order_no >", value, "origOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrigOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("orig_order_no >=", value, "origOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrigOrderNoLessThan(String value) {
            addCriterion("orig_order_no <", value, "origOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrigOrderNoLessThanOrEqualTo(String value) {
            addCriterion("orig_order_no <=", value, "origOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrigOrderNoLike(String value) {
            addCriterion("orig_order_no like", value, "origOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrigOrderNoNotLike(String value) {
            addCriterion("orig_order_no not like", value, "origOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrigOrderNoIn(List<String> values) {
            addCriterion("orig_order_no in", values, "origOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrigOrderNoNotIn(List<String> values) {
            addCriterion("orig_order_no not in", values, "origOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrigOrderNoBetween(String value1, String value2) {
            addCriterion("orig_order_no between", value1, value2, "origOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrigOrderNoNotBetween(String value1, String value2) {
            addCriterion("orig_order_no not between", value1, value2, "origOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountIsNull() {
            addCriterion("free_amount is null");
            return (Criteria) this;
        }

        public Criteria andFreeAmountIsNotNull() {
            addCriterion("free_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFreeAmountEqualTo(BigDecimal value) {
            addCriterion("free_amount =", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountNotEqualTo(BigDecimal value) {
            addCriterion("free_amount <>", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountGreaterThan(BigDecimal value) {
            addCriterion("free_amount >", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("free_amount >=", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountLessThan(BigDecimal value) {
            addCriterion("free_amount <", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("free_amount <=", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountIn(List<BigDecimal> values) {
            addCriterion("free_amount in", values, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountNotIn(List<BigDecimal> values) {
            addCriterion("free_amount not in", values, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("free_amount between", value1, value2, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("free_amount not between", value1, value2, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeMethodIsNull() {
            addCriterion("free_method is null");
            return (Criteria) this;
        }

        public Criteria andFreeMethodIsNotNull() {
            addCriterion("free_method is not null");
            return (Criteria) this;
        }

        public Criteria andFreeMethodEqualTo(BigDecimal value) {
            addCriterion("free_method =", value, "freeMethod");
            return (Criteria) this;
        }

        public Criteria andFreeMethodNotEqualTo(BigDecimal value) {
            addCriterion("free_method <>", value, "freeMethod");
            return (Criteria) this;
        }

        public Criteria andFreeMethodGreaterThan(BigDecimal value) {
            addCriterion("free_method >", value, "freeMethod");
            return (Criteria) this;
        }

        public Criteria andFreeMethodGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("free_method >=", value, "freeMethod");
            return (Criteria) this;
        }

        public Criteria andFreeMethodLessThan(BigDecimal value) {
            addCriterion("free_method <", value, "freeMethod");
            return (Criteria) this;
        }

        public Criteria andFreeMethodLessThanOrEqualTo(BigDecimal value) {
            addCriterion("free_method <=", value, "freeMethod");
            return (Criteria) this;
        }

        public Criteria andFreeMethodIn(List<BigDecimal> values) {
            addCriterion("free_method in", values, "freeMethod");
            return (Criteria) this;
        }

        public Criteria andFreeMethodNotIn(List<BigDecimal> values) {
            addCriterion("free_method not in", values, "freeMethod");
            return (Criteria) this;
        }

        public Criteria andFreeMethodBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("free_method between", value1, value2, "freeMethod");
            return (Criteria) this;
        }

        public Criteria andFreeMethodNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("free_method not between", value1, value2, "freeMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNull() {
            addCriterion("pay_method is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNotNull() {
            addCriterion("pay_method is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodEqualTo(String value) {
            addCriterion("pay_method =", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotEqualTo(String value) {
            addCriterion("pay_method <>", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThan(String value) {
            addCriterion("pay_method >", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThanOrEqualTo(String value) {
            addCriterion("pay_method >=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThan(String value) {
            addCriterion("pay_method <", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThanOrEqualTo(String value) {
            addCriterion("pay_method <=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLike(String value) {
            addCriterion("pay_method like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotLike(String value) {
            addCriterion("pay_method not like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodIn(List<String> values) {
            addCriterion("pay_method in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotIn(List<String> values) {
            addCriterion("pay_method not in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodBetween(String value1, String value2) {
            addCriterion("pay_method between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotBetween(String value1, String value2) {
            addCriterion("pay_method not between", value1, value2, "payMethod");
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

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("pay_type like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("pay_type not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
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

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNull() {
            addCriterion("channel_code is null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNotNull() {
            addCriterion("channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeEqualTo(String value) {
            addCriterion("channel_code =", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotEqualTo(String value) {
            addCriterion("channel_code <>", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThan(String value) {
            addCriterion("channel_code >", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("channel_code >=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThan(String value) {
            addCriterion("channel_code <", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("channel_code <=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLike(String value) {
            addCriterion("channel_code like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotLike(String value) {
            addCriterion("channel_code not like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIn(List<String> values) {
            addCriterion("channel_code in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotIn(List<String> values) {
            addCriterion("channel_code not in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeBetween(String value1, String value2) {
            addCriterion("channel_code between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotBetween(String value1, String value2) {
            addCriterion("channel_code not between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChanProdCodeIsNull() {
            addCriterion("chan_prod_code is null");
            return (Criteria) this;
        }

        public Criteria andChanProdCodeIsNotNull() {
            addCriterion("chan_prod_code is not null");
            return (Criteria) this;
        }

        public Criteria andChanProdCodeEqualTo(String value) {
            addCriterion("chan_prod_code =", value, "chanProdCode");
            return (Criteria) this;
        }

        public Criteria andChanProdCodeNotEqualTo(String value) {
            addCriterion("chan_prod_code <>", value, "chanProdCode");
            return (Criteria) this;
        }

        public Criteria andChanProdCodeGreaterThan(String value) {
            addCriterion("chan_prod_code >", value, "chanProdCode");
            return (Criteria) this;
        }

        public Criteria andChanProdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("chan_prod_code >=", value, "chanProdCode");
            return (Criteria) this;
        }

        public Criteria andChanProdCodeLessThan(String value) {
            addCriterion("chan_prod_code <", value, "chanProdCode");
            return (Criteria) this;
        }

        public Criteria andChanProdCodeLessThanOrEqualTo(String value) {
            addCriterion("chan_prod_code <=", value, "chanProdCode");
            return (Criteria) this;
        }

        public Criteria andChanProdCodeLike(String value) {
            addCriterion("chan_prod_code like", value, "chanProdCode");
            return (Criteria) this;
        }

        public Criteria andChanProdCodeNotLike(String value) {
            addCriterion("chan_prod_code not like", value, "chanProdCode");
            return (Criteria) this;
        }

        public Criteria andChanProdCodeIn(List<String> values) {
            addCriterion("chan_prod_code in", values, "chanProdCode");
            return (Criteria) this;
        }

        public Criteria andChanProdCodeNotIn(List<String> values) {
            addCriterion("chan_prod_code not in", values, "chanProdCode");
            return (Criteria) this;
        }

        public Criteria andChanProdCodeBetween(String value1, String value2) {
            addCriterion("chan_prod_code between", value1, value2, "chanProdCode");
            return (Criteria) this;
        }

        public Criteria andChanProdCodeNotBetween(String value1, String value2) {
            addCriterion("chan_prod_code not between", value1, value2, "chanProdCode");
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