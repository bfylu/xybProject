package com.xyb.shop.model.xyb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InstallmentAppletsOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstallmentAppletsOrderExample() {
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

        public Criteria andIssueNoIsNull() {
            addCriterion("issue_no is null");
            return (Criteria) this;
        }

        public Criteria andIssueNoIsNotNull() {
            addCriterion("issue_no is not null");
            return (Criteria) this;
        }

        public Criteria andIssueNoEqualTo(String value) {
            addCriterion("issue_no =", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotEqualTo(String value) {
            addCriterion("issue_no <>", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoGreaterThan(String value) {
            addCriterion("issue_no >", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoGreaterThanOrEqualTo(String value) {
            addCriterion("issue_no >=", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoLessThan(String value) {
            addCriterion("issue_no <", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoLessThanOrEqualTo(String value) {
            addCriterion("issue_no <=", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoLike(String value) {
            addCriterion("issue_no like", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotLike(String value) {
            addCriterion("issue_no not like", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoIn(List<String> values) {
            addCriterion("issue_no in", values, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotIn(List<String> values) {
            addCriterion("issue_no not in", values, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoBetween(String value1, String value2) {
            addCriterion("issue_no between", value1, value2, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotBetween(String value1, String value2) {
            addCriterion("issue_no not between", value1, value2, "issueNo");
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

        public Criteria andAgentInfoIsNull() {
            addCriterion("agent_info is null");
            return (Criteria) this;
        }

        public Criteria andAgentInfoIsNotNull() {
            addCriterion("agent_info is not null");
            return (Criteria) this;
        }

        public Criteria andAgentInfoEqualTo(String value) {
            addCriterion("agent_info =", value, "agentInfo");
            return (Criteria) this;
        }

        public Criteria andAgentInfoNotEqualTo(String value) {
            addCriterion("agent_info <>", value, "agentInfo");
            return (Criteria) this;
        }

        public Criteria andAgentInfoGreaterThan(String value) {
            addCriterion("agent_info >", value, "agentInfo");
            return (Criteria) this;
        }

        public Criteria andAgentInfoGreaterThanOrEqualTo(String value) {
            addCriterion("agent_info >=", value, "agentInfo");
            return (Criteria) this;
        }

        public Criteria andAgentInfoLessThan(String value) {
            addCriterion("agent_info <", value, "agentInfo");
            return (Criteria) this;
        }

        public Criteria andAgentInfoLessThanOrEqualTo(String value) {
            addCriterion("agent_info <=", value, "agentInfo");
            return (Criteria) this;
        }

        public Criteria andAgentInfoLike(String value) {
            addCriterion("agent_info like", value, "agentInfo");
            return (Criteria) this;
        }

        public Criteria andAgentInfoNotLike(String value) {
            addCriterion("agent_info not like", value, "agentInfo");
            return (Criteria) this;
        }

        public Criteria andAgentInfoIn(List<String> values) {
            addCriterion("agent_info in", values, "agentInfo");
            return (Criteria) this;
        }

        public Criteria andAgentInfoNotIn(List<String> values) {
            addCriterion("agent_info not in", values, "agentInfo");
            return (Criteria) this;
        }

        public Criteria andAgentInfoBetween(String value1, String value2) {
            addCriterion("agent_info between", value1, value2, "agentInfo");
            return (Criteria) this;
        }

        public Criteria andAgentInfoNotBetween(String value1, String value2) {
            addCriterion("agent_info not between", value1, value2, "agentInfo");
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

        public Criteria andBizTypeIsNull() {
            addCriterion("biz_type is null");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNotNull() {
            addCriterion("biz_type is not null");
            return (Criteria) this;
        }

        public Criteria andBizTypeEqualTo(Integer value) {
            addCriterion("biz_type =", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotEqualTo(Integer value) {
            addCriterion("biz_type <>", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThan(Integer value) {
            addCriterion("biz_type >", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("biz_type >=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThan(Integer value) {
            addCriterion("biz_type <", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThanOrEqualTo(Integer value) {
            addCriterion("biz_type <=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeIn(List<Integer> values) {
            addCriterion("biz_type in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotIn(List<Integer> values) {
            addCriterion("biz_type not in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeBetween(Integer value1, Integer value2) {
            addCriterion("biz_type between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andBizSubtypeEqualTo(Integer value) {
            addCriterion("biz_subtype =", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeNotEqualTo(Integer value) {
            addCriterion("biz_subtype <>", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeGreaterThan(Integer value) {
            addCriterion("biz_subtype >", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("biz_subtype >=", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeLessThan(Integer value) {
            addCriterion("biz_subtype <", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeLessThanOrEqualTo(Integer value) {
            addCriterion("biz_subtype <=", value, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeIn(List<Integer> values) {
            addCriterion("biz_subtype in", values, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeNotIn(List<Integer> values) {
            addCriterion("biz_subtype not in", values, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeBetween(Integer value1, Integer value2) {
            addCriterion("biz_subtype between", value1, value2, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andBizSubtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("biz_subtype not between", value1, value2, "bizSubtype");
            return (Criteria) this;
        }

        public Criteria andOutCodeIsNull() {
            addCriterion("out_code is null");
            return (Criteria) this;
        }

        public Criteria andOutCodeIsNotNull() {
            addCriterion("out_code is not null");
            return (Criteria) this;
        }

        public Criteria andOutCodeEqualTo(String value) {
            addCriterion("out_code =", value, "outCode");
            return (Criteria) this;
        }

        public Criteria andOutCodeNotEqualTo(String value) {
            addCriterion("out_code <>", value, "outCode");
            return (Criteria) this;
        }

        public Criteria andOutCodeGreaterThan(String value) {
            addCriterion("out_code >", value, "outCode");
            return (Criteria) this;
        }

        public Criteria andOutCodeGreaterThanOrEqualTo(String value) {
            addCriterion("out_code >=", value, "outCode");
            return (Criteria) this;
        }

        public Criteria andOutCodeLessThan(String value) {
            addCriterion("out_code <", value, "outCode");
            return (Criteria) this;
        }

        public Criteria andOutCodeLessThanOrEqualTo(String value) {
            addCriterion("out_code <=", value, "outCode");
            return (Criteria) this;
        }

        public Criteria andOutCodeLike(String value) {
            addCriterion("out_code like", value, "outCode");
            return (Criteria) this;
        }

        public Criteria andOutCodeNotLike(String value) {
            addCriterion("out_code not like", value, "outCode");
            return (Criteria) this;
        }

        public Criteria andOutCodeIn(List<String> values) {
            addCriterion("out_code in", values, "outCode");
            return (Criteria) this;
        }

        public Criteria andOutCodeNotIn(List<String> values) {
            addCriterion("out_code not in", values, "outCode");
            return (Criteria) this;
        }

        public Criteria andOutCodeBetween(String value1, String value2) {
            addCriterion("out_code between", value1, value2, "outCode");
            return (Criteria) this;
        }

        public Criteria andOutCodeNotBetween(String value1, String value2) {
            addCriterion("out_code not between", value1, value2, "outCode");
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

        public Criteria andChargeMethodIsNull() {
            addCriterion("charge_method is null");
            return (Criteria) this;
        }

        public Criteria andChargeMethodIsNotNull() {
            addCriterion("charge_method is not null");
            return (Criteria) this;
        }

        public Criteria andChargeMethodEqualTo(Integer value) {
            addCriterion("charge_method =", value, "chargeMethod");
            return (Criteria) this;
        }

        public Criteria andChargeMethodNotEqualTo(Integer value) {
            addCriterion("charge_method <>", value, "chargeMethod");
            return (Criteria) this;
        }

        public Criteria andChargeMethodGreaterThan(Integer value) {
            addCriterion("charge_method >", value, "chargeMethod");
            return (Criteria) this;
        }

        public Criteria andChargeMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_method >=", value, "chargeMethod");
            return (Criteria) this;
        }

        public Criteria andChargeMethodLessThan(Integer value) {
            addCriterion("charge_method <", value, "chargeMethod");
            return (Criteria) this;
        }

        public Criteria andChargeMethodLessThanOrEqualTo(Integer value) {
            addCriterion("charge_method <=", value, "chargeMethod");
            return (Criteria) this;
        }

        public Criteria andChargeMethodIn(List<Integer> values) {
            addCriterion("charge_method in", values, "chargeMethod");
            return (Criteria) this;
        }

        public Criteria andChargeMethodNotIn(List<Integer> values) {
            addCriterion("charge_method not in", values, "chargeMethod");
            return (Criteria) this;
        }

        public Criteria andChargeMethodBetween(Integer value1, Integer value2) {
            addCriterion("charge_method between", value1, value2, "chargeMethod");
            return (Criteria) this;
        }

        public Criteria andChargeMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_method not between", value1, value2, "chargeMethod");
            return (Criteria) this;
        }

        public Criteria andChargeAmountTotalIsNull() {
            addCriterion("charge_amount_total is null");
            return (Criteria) this;
        }

        public Criteria andChargeAmountTotalIsNotNull() {
            addCriterion("charge_amount_total is not null");
            return (Criteria) this;
        }

        public Criteria andChargeAmountTotalEqualTo(BigDecimal value) {
            addCriterion("charge_amount_total =", value, "chargeAmountTotal");
            return (Criteria) this;
        }

        public Criteria andChargeAmountTotalNotEqualTo(BigDecimal value) {
            addCriterion("charge_amount_total <>", value, "chargeAmountTotal");
            return (Criteria) this;
        }

        public Criteria andChargeAmountTotalGreaterThan(BigDecimal value) {
            addCriterion("charge_amount_total >", value, "chargeAmountTotal");
            return (Criteria) this;
        }

        public Criteria andChargeAmountTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("charge_amount_total >=", value, "chargeAmountTotal");
            return (Criteria) this;
        }

        public Criteria andChargeAmountTotalLessThan(BigDecimal value) {
            addCriterion("charge_amount_total <", value, "chargeAmountTotal");
            return (Criteria) this;
        }

        public Criteria andChargeAmountTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("charge_amount_total <=", value, "chargeAmountTotal");
            return (Criteria) this;
        }

        public Criteria andChargeAmountTotalIn(List<BigDecimal> values) {
            addCriterion("charge_amount_total in", values, "chargeAmountTotal");
            return (Criteria) this;
        }

        public Criteria andChargeAmountTotalNotIn(List<BigDecimal> values) {
            addCriterion("charge_amount_total not in", values, "chargeAmountTotal");
            return (Criteria) this;
        }

        public Criteria andChargeAmountTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("charge_amount_total between", value1, value2, "chargeAmountTotal");
            return (Criteria) this;
        }

        public Criteria andChargeAmountTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("charge_amount_total not between", value1, value2, "chargeAmountTotal");
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

        public Criteria andOrderDescIsNull() {
            addCriterion("order_desc is null");
            return (Criteria) this;
        }

        public Criteria andOrderDescIsNotNull() {
            addCriterion("order_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDescEqualTo(String value) {
            addCriterion("order_desc =", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotEqualTo(String value) {
            addCriterion("order_desc <>", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescGreaterThan(String value) {
            addCriterion("order_desc >", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescGreaterThanOrEqualTo(String value) {
            addCriterion("order_desc >=", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLessThan(String value) {
            addCriterion("order_desc <", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLessThanOrEqualTo(String value) {
            addCriterion("order_desc <=", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLike(String value) {
            addCriterion("order_desc like", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotLike(String value) {
            addCriterion("order_desc not like", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescIn(List<String> values) {
            addCriterion("order_desc in", values, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotIn(List<String> values) {
            addCriterion("order_desc not in", values, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescBetween(String value1, String value2) {
            addCriterion("order_desc between", value1, value2, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotBetween(String value1, String value2) {
            addCriterion("order_desc not between", value1, value2, "orderDesc");
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

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderFlagIsNull() {
            addCriterion("order_flag is null");
            return (Criteria) this;
        }

        public Criteria andOrderFlagIsNotNull() {
            addCriterion("order_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFlagEqualTo(Integer value) {
            addCriterion("order_flag =", value, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagNotEqualTo(Integer value) {
            addCriterion("order_flag <>", value, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagGreaterThan(Integer value) {
            addCriterion("order_flag >", value, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_flag >=", value, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagLessThan(Integer value) {
            addCriterion("order_flag <", value, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagLessThanOrEqualTo(Integer value) {
            addCriterion("order_flag <=", value, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagIn(List<Integer> values) {
            addCriterion("order_flag in", values, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagNotIn(List<Integer> values) {
            addCriterion("order_flag not in", values, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagBetween(Integer value1, Integer value2) {
            addCriterion("order_flag between", value1, value2, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("order_flag not between", value1, value2, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIsNull() {
            addCriterion("type_code is null");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIsNotNull() {
            addCriterion("type_code is not null");
            return (Criteria) this;
        }

        public Criteria andTypeCodeEqualTo(String value) {
            addCriterion("type_code =", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotEqualTo(String value) {
            addCriterion("type_code <>", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeGreaterThan(String value) {
            addCriterion("type_code >", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("type_code >=", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLessThan(String value) {
            addCriterion("type_code <", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("type_code <=", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLike(String value) {
            addCriterion("type_code like", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotLike(String value) {
            addCriterion("type_code not like", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIn(List<String> values) {
            addCriterion("type_code in", values, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotIn(List<String> values) {
            addCriterion("type_code not in", values, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeBetween(String value1, String value2) {
            addCriterion("type_code between", value1, value2, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotBetween(String value1, String value2) {
            addCriterion("type_code not between", value1, value2, "typeCode");
            return (Criteria) this;
        }

        public Criteria andInstallmentTypeIsNull() {
            addCriterion("installment_type is null");
            return (Criteria) this;
        }

        public Criteria andInstallmentTypeIsNotNull() {
            addCriterion("installment_type is not null");
            return (Criteria) this;
        }

        public Criteria andInstallmentTypeEqualTo(Integer value) {
            addCriterion("installment_type =", value, "installmentType");
            return (Criteria) this;
        }

        public Criteria andInstallmentTypeNotEqualTo(Integer value) {
            addCriterion("installment_type <>", value, "installmentType");
            return (Criteria) this;
        }

        public Criteria andInstallmentTypeGreaterThan(Integer value) {
            addCriterion("installment_type >", value, "installmentType");
            return (Criteria) this;
        }

        public Criteria andInstallmentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("installment_type >=", value, "installmentType");
            return (Criteria) this;
        }

        public Criteria andInstallmentTypeLessThan(Integer value) {
            addCriterion("installment_type <", value, "installmentType");
            return (Criteria) this;
        }

        public Criteria andInstallmentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("installment_type <=", value, "installmentType");
            return (Criteria) this;
        }

        public Criteria andInstallmentTypeIn(List<Integer> values) {
            addCriterion("installment_type in", values, "installmentType");
            return (Criteria) this;
        }

        public Criteria andInstallmentTypeNotIn(List<Integer> values) {
            addCriterion("installment_type not in", values, "installmentType");
            return (Criteria) this;
        }

        public Criteria andInstallmentTypeBetween(Integer value1, Integer value2) {
            addCriterion("installment_type between", value1, value2, "installmentType");
            return (Criteria) this;
        }

        public Criteria andInstallmentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("installment_type not between", value1, value2, "installmentType");
            return (Criteria) this;
        }

        public Criteria andInstallmentRateIsNull() {
            addCriterion("installment_rate is null");
            return (Criteria) this;
        }

        public Criteria andInstallmentRateIsNotNull() {
            addCriterion("installment_rate is not null");
            return (Criteria) this;
        }

        public Criteria andInstallmentRateEqualTo(BigDecimal value) {
            addCriterion("installment_rate =", value, "installmentRate");
            return (Criteria) this;
        }

        public Criteria andInstallmentRateNotEqualTo(BigDecimal value) {
            addCriterion("installment_rate <>", value, "installmentRate");
            return (Criteria) this;
        }

        public Criteria andInstallmentRateGreaterThan(BigDecimal value) {
            addCriterion("installment_rate >", value, "installmentRate");
            return (Criteria) this;
        }

        public Criteria andInstallmentRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("installment_rate >=", value, "installmentRate");
            return (Criteria) this;
        }

        public Criteria andInstallmentRateLessThan(BigDecimal value) {
            addCriterion("installment_rate <", value, "installmentRate");
            return (Criteria) this;
        }

        public Criteria andInstallmentRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("installment_rate <=", value, "installmentRate");
            return (Criteria) this;
        }

        public Criteria andInstallmentRateIn(List<BigDecimal> values) {
            addCriterion("installment_rate in", values, "installmentRate");
            return (Criteria) this;
        }

        public Criteria andInstallmentRateNotIn(List<BigDecimal> values) {
            addCriterion("installment_rate not in", values, "installmentRate");
            return (Criteria) this;
        }

        public Criteria andInstallmentRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("installment_rate between", value1, value2, "installmentRate");
            return (Criteria) this;
        }

        public Criteria andInstallmentRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("installment_rate not between", value1, value2, "installmentRate");
            return (Criteria) this;
        }

        public Criteria andInstallmentMonthIsNull() {
            addCriterion("installment_month is null");
            return (Criteria) this;
        }

        public Criteria andInstallmentMonthIsNotNull() {
            addCriterion("installment_month is not null");
            return (Criteria) this;
        }

        public Criteria andInstallmentMonthEqualTo(Integer value) {
            addCriterion("installment_month =", value, "installmentMonth");
            return (Criteria) this;
        }

        public Criteria andInstallmentMonthNotEqualTo(Integer value) {
            addCriterion("installment_month <>", value, "installmentMonth");
            return (Criteria) this;
        }

        public Criteria andInstallmentMonthGreaterThan(Integer value) {
            addCriterion("installment_month >", value, "installmentMonth");
            return (Criteria) this;
        }

        public Criteria andInstallmentMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("installment_month >=", value, "installmentMonth");
            return (Criteria) this;
        }

        public Criteria andInstallmentMonthLessThan(Integer value) {
            addCriterion("installment_month <", value, "installmentMonth");
            return (Criteria) this;
        }

        public Criteria andInstallmentMonthLessThanOrEqualTo(Integer value) {
            addCriterion("installment_month <=", value, "installmentMonth");
            return (Criteria) this;
        }

        public Criteria andInstallmentMonthIn(List<Integer> values) {
            addCriterion("installment_month in", values, "installmentMonth");
            return (Criteria) this;
        }

        public Criteria andInstallmentMonthNotIn(List<Integer> values) {
            addCriterion("installment_month not in", values, "installmentMonth");
            return (Criteria) this;
        }

        public Criteria andInstallmentMonthBetween(Integer value1, Integer value2) {
            addCriterion("installment_month between", value1, value2, "installmentMonth");
            return (Criteria) this;
        }

        public Criteria andInstallmentMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("installment_month not between", value1, value2, "installmentMonth");
            return (Criteria) this;
        }

        public Criteria andInstallmentAmountIsNull() {
            addCriterion("installment_amount is null");
            return (Criteria) this;
        }

        public Criteria andInstallmentAmountIsNotNull() {
            addCriterion("installment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInstallmentAmountEqualTo(BigDecimal value) {
            addCriterion("installment_amount =", value, "installmentAmount");
            return (Criteria) this;
        }

        public Criteria andInstallmentAmountNotEqualTo(BigDecimal value) {
            addCriterion("installment_amount <>", value, "installmentAmount");
            return (Criteria) this;
        }

        public Criteria andInstallmentAmountGreaterThan(BigDecimal value) {
            addCriterion("installment_amount >", value, "installmentAmount");
            return (Criteria) this;
        }

        public Criteria andInstallmentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("installment_amount >=", value, "installmentAmount");
            return (Criteria) this;
        }

        public Criteria andInstallmentAmountLessThan(BigDecimal value) {
            addCriterion("installment_amount <", value, "installmentAmount");
            return (Criteria) this;
        }

        public Criteria andInstallmentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("installment_amount <=", value, "installmentAmount");
            return (Criteria) this;
        }

        public Criteria andInstallmentAmountIn(List<BigDecimal> values) {
            addCriterion("installment_amount in", values, "installmentAmount");
            return (Criteria) this;
        }

        public Criteria andInstallmentAmountNotIn(List<BigDecimal> values) {
            addCriterion("installment_amount not in", values, "installmentAmount");
            return (Criteria) this;
        }

        public Criteria andInstallmentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("installment_amount between", value1, value2, "installmentAmount");
            return (Criteria) this;
        }

        public Criteria andInstallmentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("installment_amount not between", value1, value2, "installmentAmount");
            return (Criteria) this;
        }

        public Criteria andRepayAmountTotalIsNull() {
            addCriterion("repay_amount_total is null");
            return (Criteria) this;
        }

        public Criteria andRepayAmountTotalIsNotNull() {
            addCriterion("repay_amount_total is not null");
            return (Criteria) this;
        }

        public Criteria andRepayAmountTotalEqualTo(BigDecimal value) {
            addCriterion("repay_amount_total =", value, "repayAmountTotal");
            return (Criteria) this;
        }

        public Criteria andRepayAmountTotalNotEqualTo(BigDecimal value) {
            addCriterion("repay_amount_total <>", value, "repayAmountTotal");
            return (Criteria) this;
        }

        public Criteria andRepayAmountTotalGreaterThan(BigDecimal value) {
            addCriterion("repay_amount_total >", value, "repayAmountTotal");
            return (Criteria) this;
        }

        public Criteria andRepayAmountTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_amount_total >=", value, "repayAmountTotal");
            return (Criteria) this;
        }

        public Criteria andRepayAmountTotalLessThan(BigDecimal value) {
            addCriterion("repay_amount_total <", value, "repayAmountTotal");
            return (Criteria) this;
        }

        public Criteria andRepayAmountTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_amount_total <=", value, "repayAmountTotal");
            return (Criteria) this;
        }

        public Criteria andRepayAmountTotalIn(List<BigDecimal> values) {
            addCriterion("repay_amount_total in", values, "repayAmountTotal");
            return (Criteria) this;
        }

        public Criteria andRepayAmountTotalNotIn(List<BigDecimal> values) {
            addCriterion("repay_amount_total not in", values, "repayAmountTotal");
            return (Criteria) this;
        }

        public Criteria andRepayAmountTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_amount_total between", value1, value2, "repayAmountTotal");
            return (Criteria) this;
        }

        public Criteria andRepayAmountTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_amount_total not between", value1, value2, "repayAmountTotal");
            return (Criteria) this;
        }

        public Criteria andDownPaymentIsNull() {
            addCriterion("down_payment is null");
            return (Criteria) this;
        }

        public Criteria andDownPaymentIsNotNull() {
            addCriterion("down_payment is not null");
            return (Criteria) this;
        }

        public Criteria andDownPaymentEqualTo(BigDecimal value) {
            addCriterion("down_payment =", value, "downPayment");
            return (Criteria) this;
        }

        public Criteria andDownPaymentNotEqualTo(BigDecimal value) {
            addCriterion("down_payment <>", value, "downPayment");
            return (Criteria) this;
        }

        public Criteria andDownPaymentGreaterThan(BigDecimal value) {
            addCriterion("down_payment >", value, "downPayment");
            return (Criteria) this;
        }

        public Criteria andDownPaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("down_payment >=", value, "downPayment");
            return (Criteria) this;
        }

        public Criteria andDownPaymentLessThan(BigDecimal value) {
            addCriterion("down_payment <", value, "downPayment");
            return (Criteria) this;
        }

        public Criteria andDownPaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("down_payment <=", value, "downPayment");
            return (Criteria) this;
        }

        public Criteria andDownPaymentIn(List<BigDecimal> values) {
            addCriterion("down_payment in", values, "downPayment");
            return (Criteria) this;
        }

        public Criteria andDownPaymentNotIn(List<BigDecimal> values) {
            addCriterion("down_payment not in", values, "downPayment");
            return (Criteria) this;
        }

        public Criteria andDownPaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("down_payment between", value1, value2, "downPayment");
            return (Criteria) this;
        }

        public Criteria andDownPaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("down_payment not between", value1, value2, "downPayment");
            return (Criteria) this;
        }

        public Criteria andSellerInfoIsNull() {
            addCriterion("seller_info is null");
            return (Criteria) this;
        }

        public Criteria andSellerInfoIsNotNull() {
            addCriterion("seller_info is not null");
            return (Criteria) this;
        }

        public Criteria andSellerInfoEqualTo(String value) {
            addCriterion("seller_info =", value, "sellerInfo");
            return (Criteria) this;
        }

        public Criteria andSellerInfoNotEqualTo(String value) {
            addCriterion("seller_info <>", value, "sellerInfo");
            return (Criteria) this;
        }

        public Criteria andSellerInfoGreaterThan(String value) {
            addCriterion("seller_info >", value, "sellerInfo");
            return (Criteria) this;
        }

        public Criteria andSellerInfoGreaterThanOrEqualTo(String value) {
            addCriterion("seller_info >=", value, "sellerInfo");
            return (Criteria) this;
        }

        public Criteria andSellerInfoLessThan(String value) {
            addCriterion("seller_info <", value, "sellerInfo");
            return (Criteria) this;
        }

        public Criteria andSellerInfoLessThanOrEqualTo(String value) {
            addCriterion("seller_info <=", value, "sellerInfo");
            return (Criteria) this;
        }

        public Criteria andSellerInfoLike(String value) {
            addCriterion("seller_info like", value, "sellerInfo");
            return (Criteria) this;
        }

        public Criteria andSellerInfoNotLike(String value) {
            addCriterion("seller_info not like", value, "sellerInfo");
            return (Criteria) this;
        }

        public Criteria andSellerInfoIn(List<String> values) {
            addCriterion("seller_info in", values, "sellerInfo");
            return (Criteria) this;
        }

        public Criteria andSellerInfoNotIn(List<String> values) {
            addCriterion("seller_info not in", values, "sellerInfo");
            return (Criteria) this;
        }

        public Criteria andSellerInfoBetween(String value1, String value2) {
            addCriterion("seller_info between", value1, value2, "sellerInfo");
            return (Criteria) this;
        }

        public Criteria andSellerInfoNotBetween(String value1, String value2) {
            addCriterion("seller_info not between", value1, value2, "sellerInfo");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameIsNull() {
            addCriterion("seller_username is null");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameIsNotNull() {
            addCriterion("seller_username is not null");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameEqualTo(String value) {
            addCriterion("seller_username =", value, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameNotEqualTo(String value) {
            addCriterion("seller_username <>", value, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameGreaterThan(String value) {
            addCriterion("seller_username >", value, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_username >=", value, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameLessThan(String value) {
            addCriterion("seller_username <", value, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameLessThanOrEqualTo(String value) {
            addCriterion("seller_username <=", value, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameLike(String value) {
            addCriterion("seller_username like", value, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameNotLike(String value) {
            addCriterion("seller_username not like", value, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameIn(List<String> values) {
            addCriterion("seller_username in", values, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameNotIn(List<String> values) {
            addCriterion("seller_username not in", values, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameBetween(String value1, String value2) {
            addCriterion("seller_username between", value1, value2, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameNotBetween(String value1, String value2) {
            addCriterion("seller_username not between", value1, value2, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIsNull() {
            addCriterion("operator_info is null");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIsNotNull() {
            addCriterion("operator_info is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoEqualTo(String value) {
            addCriterion("operator_info =", value, "operatorInfo");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoNotEqualTo(String value) {
            addCriterion("operator_info <>", value, "operatorInfo");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoGreaterThan(String value) {
            addCriterion("operator_info >", value, "operatorInfo");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoGreaterThanOrEqualTo(String value) {
            addCriterion("operator_info >=", value, "operatorInfo");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoLessThan(String value) {
            addCriterion("operator_info <", value, "operatorInfo");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoLessThanOrEqualTo(String value) {
            addCriterion("operator_info <=", value, "operatorInfo");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoLike(String value) {
            addCriterion("operator_info like", value, "operatorInfo");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoNotLike(String value) {
            addCriterion("operator_info not like", value, "operatorInfo");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIn(List<String> values) {
            addCriterion("operator_info in", values, "operatorInfo");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoNotIn(List<String> values) {
            addCriterion("operator_info not in", values, "operatorInfo");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoBetween(String value1, String value2) {
            addCriterion("operator_info between", value1, value2, "operatorInfo");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoNotBetween(String value1, String value2) {
            addCriterion("operator_info not between", value1, value2, "operatorInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerInfoIsNull() {
            addCriterion("buyer_info is null");
            return (Criteria) this;
        }

        public Criteria andBuyerInfoIsNotNull() {
            addCriterion("buyer_info is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerInfoEqualTo(String value) {
            addCriterion("buyer_info =", value, "buyerInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerInfoNotEqualTo(String value) {
            addCriterion("buyer_info <>", value, "buyerInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerInfoGreaterThan(String value) {
            addCriterion("buyer_info >", value, "buyerInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerInfoGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_info >=", value, "buyerInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerInfoLessThan(String value) {
            addCriterion("buyer_info <", value, "buyerInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerInfoLessThanOrEqualTo(String value) {
            addCriterion("buyer_info <=", value, "buyerInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerInfoLike(String value) {
            addCriterion("buyer_info like", value, "buyerInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerInfoNotLike(String value) {
            addCriterion("buyer_info not like", value, "buyerInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerInfoIn(List<String> values) {
            addCriterion("buyer_info in", values, "buyerInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerInfoNotIn(List<String> values) {
            addCriterion("buyer_info not in", values, "buyerInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerInfoBetween(String value1, String value2) {
            addCriterion("buyer_info between", value1, value2, "buyerInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerInfoNotBetween(String value1, String value2) {
            addCriterion("buyer_info not between", value1, value2, "buyerInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameIsNull() {
            addCriterion("buyer_username is null");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameIsNotNull() {
            addCriterion("buyer_username is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameEqualTo(String value) {
            addCriterion("buyer_username =", value, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameNotEqualTo(String value) {
            addCriterion("buyer_username <>", value, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameGreaterThan(String value) {
            addCriterion("buyer_username >", value, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_username >=", value, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameLessThan(String value) {
            addCriterion("buyer_username <", value, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameLessThanOrEqualTo(String value) {
            addCriterion("buyer_username <=", value, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameLike(String value) {
            addCriterion("buyer_username like", value, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameNotLike(String value) {
            addCriterion("buyer_username not like", value, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameIn(List<String> values) {
            addCriterion("buyer_username in", values, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameNotIn(List<String> values) {
            addCriterion("buyer_username not in", values, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameBetween(String value1, String value2) {
            addCriterion("buyer_username between", value1, value2, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameNotBetween(String value1, String value2) {
            addCriterion("buyer_username not between", value1, value2, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIsNull() {
            addCriterion("goods_info is null");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIsNotNull() {
            addCriterion("goods_info is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoEqualTo(String value) {
            addCriterion("goods_info =", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoNotEqualTo(String value) {
            addCriterion("goods_info <>", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoGreaterThan(String value) {
            addCriterion("goods_info >", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoGreaterThanOrEqualTo(String value) {
            addCriterion("goods_info >=", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoLessThan(String value) {
            addCriterion("goods_info <", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoLessThanOrEqualTo(String value) {
            addCriterion("goods_info <=", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoLike(String value) {
            addCriterion("goods_info like", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoNotLike(String value) {
            addCriterion("goods_info not like", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIn(List<String> values) {
            addCriterion("goods_info in", values, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoNotIn(List<String> values) {
            addCriterion("goods_info not in", values, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoBetween(String value1, String value2) {
            addCriterion("goods_info between", value1, value2, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoNotBetween(String value1, String value2) {
            addCriterion("goods_info not between", value1, value2, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsIsNull() {
            addCriterion("goods_snapshot_ids is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsIsNotNull() {
            addCriterion("goods_snapshot_ids is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsEqualTo(String value) {
            addCriterion("goods_snapshot_ids =", value, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsNotEqualTo(String value) {
            addCriterion("goods_snapshot_ids <>", value, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsGreaterThan(String value) {
            addCriterion("goods_snapshot_ids >", value, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsGreaterThanOrEqualTo(String value) {
            addCriterion("goods_snapshot_ids >=", value, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsLessThan(String value) {
            addCriterion("goods_snapshot_ids <", value, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsLessThanOrEqualTo(String value) {
            addCriterion("goods_snapshot_ids <=", value, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsLike(String value) {
            addCriterion("goods_snapshot_ids like", value, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsNotLike(String value) {
            addCriterion("goods_snapshot_ids not like", value, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsIn(List<String> values) {
            addCriterion("goods_snapshot_ids in", values, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsNotIn(List<String> values) {
            addCriterion("goods_snapshot_ids not in", values, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsBetween(String value1, String value2) {
            addCriterion("goods_snapshot_ids between", value1, value2, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotIdsNotBetween(String value1, String value2) {
            addCriterion("goods_snapshot_ids not between", value1, value2, "goodsSnapshotIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotRefNoIsNull() {
            addCriterion("goods_snapshot_ref_no is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotRefNoIsNotNull() {
            addCriterion("goods_snapshot_ref_no is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotRefNoEqualTo(String value) {
            addCriterion("goods_snapshot_ref_no =", value, "goodsSnapshotRefNo");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotRefNoNotEqualTo(String value) {
            addCriterion("goods_snapshot_ref_no <>", value, "goodsSnapshotRefNo");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotRefNoGreaterThan(String value) {
            addCriterion("goods_snapshot_ref_no >", value, "goodsSnapshotRefNo");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotRefNoGreaterThanOrEqualTo(String value) {
            addCriterion("goods_snapshot_ref_no >=", value, "goodsSnapshotRefNo");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotRefNoLessThan(String value) {
            addCriterion("goods_snapshot_ref_no <", value, "goodsSnapshotRefNo");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotRefNoLessThanOrEqualTo(String value) {
            addCriterion("goods_snapshot_ref_no <=", value, "goodsSnapshotRefNo");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotRefNoLike(String value) {
            addCriterion("goods_snapshot_ref_no like", value, "goodsSnapshotRefNo");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotRefNoNotLike(String value) {
            addCriterion("goods_snapshot_ref_no not like", value, "goodsSnapshotRefNo");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotRefNoIn(List<String> values) {
            addCriterion("goods_snapshot_ref_no in", values, "goodsSnapshotRefNo");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotRefNoNotIn(List<String> values) {
            addCriterion("goods_snapshot_ref_no not in", values, "goodsSnapshotRefNo");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotRefNoBetween(String value1, String value2) {
            addCriterion("goods_snapshot_ref_no between", value1, value2, "goodsSnapshotRefNo");
            return (Criteria) this;
        }

        public Criteria andGoodsSnapshotRefNoNotBetween(String value1, String value2) {
            addCriterion("goods_snapshot_ref_no not between", value1, value2, "goodsSnapshotRefNo");
            return (Criteria) this;
        }

        public Criteria andConsumeVoucherPicIsNull() {
            addCriterion("consume_voucher_pic is null");
            return (Criteria) this;
        }

        public Criteria andConsumeVoucherPicIsNotNull() {
            addCriterion("consume_voucher_pic is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeVoucherPicEqualTo(String value) {
            addCriterion("consume_voucher_pic =", value, "consumeVoucherPic");
            return (Criteria) this;
        }

        public Criteria andConsumeVoucherPicNotEqualTo(String value) {
            addCriterion("consume_voucher_pic <>", value, "consumeVoucherPic");
            return (Criteria) this;
        }

        public Criteria andConsumeVoucherPicGreaterThan(String value) {
            addCriterion("consume_voucher_pic >", value, "consumeVoucherPic");
            return (Criteria) this;
        }

        public Criteria andConsumeVoucherPicGreaterThanOrEqualTo(String value) {
            addCriterion("consume_voucher_pic >=", value, "consumeVoucherPic");
            return (Criteria) this;
        }

        public Criteria andConsumeVoucherPicLessThan(String value) {
            addCriterion("consume_voucher_pic <", value, "consumeVoucherPic");
            return (Criteria) this;
        }

        public Criteria andConsumeVoucherPicLessThanOrEqualTo(String value) {
            addCriterion("consume_voucher_pic <=", value, "consumeVoucherPic");
            return (Criteria) this;
        }

        public Criteria andConsumeVoucherPicLike(String value) {
            addCriterion("consume_voucher_pic like", value, "consumeVoucherPic");
            return (Criteria) this;
        }

        public Criteria andConsumeVoucherPicNotLike(String value) {
            addCriterion("consume_voucher_pic not like", value, "consumeVoucherPic");
            return (Criteria) this;
        }

        public Criteria andConsumeVoucherPicIn(List<String> values) {
            addCriterion("consume_voucher_pic in", values, "consumeVoucherPic");
            return (Criteria) this;
        }

        public Criteria andConsumeVoucherPicNotIn(List<String> values) {
            addCriterion("consume_voucher_pic not in", values, "consumeVoucherPic");
            return (Criteria) this;
        }

        public Criteria andConsumeVoucherPicBetween(String value1, String value2) {
            addCriterion("consume_voucher_pic between", value1, value2, "consumeVoucherPic");
            return (Criteria) this;
        }

        public Criteria andConsumeVoucherPicNotBetween(String value1, String value2) {
            addCriterion("consume_voucher_pic not between", value1, value2, "consumeVoucherPic");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoIsNull() {
            addCriterion("bank_card_ref_no is null");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoIsNotNull() {
            addCriterion("bank_card_ref_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoEqualTo(String value) {
            addCriterion("bank_card_ref_no =", value, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoNotEqualTo(String value) {
            addCriterion("bank_card_ref_no <>", value, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoGreaterThan(String value) {
            addCriterion("bank_card_ref_no >", value, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_ref_no >=", value, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoLessThan(String value) {
            addCriterion("bank_card_ref_no <", value, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoLessThanOrEqualTo(String value) {
            addCriterion("bank_card_ref_no <=", value, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoLike(String value) {
            addCriterion("bank_card_ref_no like", value, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoNotLike(String value) {
            addCriterion("bank_card_ref_no not like", value, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoIn(List<String> values) {
            addCriterion("bank_card_ref_no in", values, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoNotIn(List<String> values) {
            addCriterion("bank_card_ref_no not in", values, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoBetween(String value1, String value2) {
            addCriterion("bank_card_ref_no between", value1, value2, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardRefNoNotBetween(String value1, String value2) {
            addCriterion("bank_card_ref_no not between", value1, value2, "bankCardRefNo");
            return (Criteria) this;
        }

        public Criteria andBankCardInfoIsNull() {
            addCriterion("bank_card_info is null");
            return (Criteria) this;
        }

        public Criteria andBankCardInfoIsNotNull() {
            addCriterion("bank_card_info is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardInfoEqualTo(String value) {
            addCriterion("bank_card_info =", value, "bankCardInfo");
            return (Criteria) this;
        }

        public Criteria andBankCardInfoNotEqualTo(String value) {
            addCriterion("bank_card_info <>", value, "bankCardInfo");
            return (Criteria) this;
        }

        public Criteria andBankCardInfoGreaterThan(String value) {
            addCriterion("bank_card_info >", value, "bankCardInfo");
            return (Criteria) this;
        }

        public Criteria andBankCardInfoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_info >=", value, "bankCardInfo");
            return (Criteria) this;
        }

        public Criteria andBankCardInfoLessThan(String value) {
            addCriterion("bank_card_info <", value, "bankCardInfo");
            return (Criteria) this;
        }

        public Criteria andBankCardInfoLessThanOrEqualTo(String value) {
            addCriterion("bank_card_info <=", value, "bankCardInfo");
            return (Criteria) this;
        }

        public Criteria andBankCardInfoLike(String value) {
            addCriterion("bank_card_info like", value, "bankCardInfo");
            return (Criteria) this;
        }

        public Criteria andBankCardInfoNotLike(String value) {
            addCriterion("bank_card_info not like", value, "bankCardInfo");
            return (Criteria) this;
        }

        public Criteria andBankCardInfoIn(List<String> values) {
            addCriterion("bank_card_info in", values, "bankCardInfo");
            return (Criteria) this;
        }

        public Criteria andBankCardInfoNotIn(List<String> values) {
            addCriterion("bank_card_info not in", values, "bankCardInfo");
            return (Criteria) this;
        }

        public Criteria andBankCardInfoBetween(String value1, String value2) {
            addCriterion("bank_card_info between", value1, value2, "bankCardInfo");
            return (Criteria) this;
        }

        public Criteria andBankCardInfoNotBetween(String value1, String value2) {
            addCriterion("bank_card_info not between", value1, value2, "bankCardInfo");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("check_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("check_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(String value) {
            addCriterion("check_status =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(String value) {
            addCriterion("check_status <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(String value) {
            addCriterion("check_status >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(String value) {
            addCriterion("check_status >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(String value) {
            addCriterion("check_status <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(String value) {
            addCriterion("check_status <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLike(String value) {
            addCriterion("check_status like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotLike(String value) {
            addCriterion("check_status not like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<String> values) {
            addCriterion("check_status in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<String> values) {
            addCriterion("check_status not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(String value1, String value2) {
            addCriterion("check_status between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(String value1, String value2) {
            addCriterion("check_status not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNull() {
            addCriterion("data_status is null");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNotNull() {
            addCriterion("data_status is not null");
            return (Criteria) this;
        }

        public Criteria andDataStatusEqualTo(Integer value) {
            addCriterion("data_status =", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotEqualTo(Integer value) {
            addCriterion("data_status <>", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThan(Integer value) {
            addCriterion("data_status >", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_status >=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThan(Integer value) {
            addCriterion("data_status <", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThanOrEqualTo(Integer value) {
            addCriterion("data_status <=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusIn(List<Integer> values) {
            addCriterion("data_status in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotIn(List<Integer> values) {
            addCriterion("data_status not in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusBetween(Integer value1, Integer value2) {
            addCriterion("data_status between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("data_status not between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIsNull() {
            addCriterion("verify_status is null");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIsNotNull() {
            addCriterion("verify_status is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusEqualTo(Integer value) {
            addCriterion("verify_status =", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotEqualTo(Integer value) {
            addCriterion("verify_status <>", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusGreaterThan(Integer value) {
            addCriterion("verify_status >", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("verify_status >=", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLessThan(Integer value) {
            addCriterion("verify_status <", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("verify_status <=", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIn(List<Integer> values) {
            addCriterion("verify_status in", values, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotIn(List<Integer> values) {
            addCriterion("verify_status not in", values, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusBetween(Integer value1, Integer value2) {
            addCriterion("verify_status between", value1, value2, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("verify_status not between", value1, value2, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoIsNull() {
            addCriterion("verify_info is null");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoIsNotNull() {
            addCriterion("verify_info is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoEqualTo(String value) {
            addCriterion("verify_info =", value, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoNotEqualTo(String value) {
            addCriterion("verify_info <>", value, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoGreaterThan(String value) {
            addCriterion("verify_info >", value, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoGreaterThanOrEqualTo(String value) {
            addCriterion("verify_info >=", value, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoLessThan(String value) {
            addCriterion("verify_info <", value, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoLessThanOrEqualTo(String value) {
            addCriterion("verify_info <=", value, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoLike(String value) {
            addCriterion("verify_info like", value, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoNotLike(String value) {
            addCriterion("verify_info not like", value, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoIn(List<String> values) {
            addCriterion("verify_info in", values, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoNotIn(List<String> values) {
            addCriterion("verify_info not in", values, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoBetween(String value1, String value2) {
            addCriterion("verify_info between", value1, value2, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyInfoNotBetween(String value1, String value2) {
            addCriterion("verify_info not between", value1, value2, "verifyInfo");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNull() {
            addCriterion("verify_time is null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNotNull() {
            addCriterion("verify_time is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeEqualTo(Date value) {
            addCriterion("verify_time =", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotEqualTo(Date value) {
            addCriterion("verify_time <>", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThan(Date value) {
            addCriterion("verify_time >", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("verify_time >=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThan(Date value) {
            addCriterion("verify_time <", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("verify_time <=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIn(List<Date> values) {
            addCriterion("verify_time in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotIn(List<Date> values) {
            addCriterion("verify_time not in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeBetween(Date value1, Date value2) {
            addCriterion("verify_time between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("verify_time not between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andProRefNoIsNull() {
            addCriterion("pro_ref_no is null");
            return (Criteria) this;
        }

        public Criteria andProRefNoIsNotNull() {
            addCriterion("pro_ref_no is not null");
            return (Criteria) this;
        }

        public Criteria andProRefNoEqualTo(String value) {
            addCriterion("pro_ref_no =", value, "proRefNo");
            return (Criteria) this;
        }

        public Criteria andProRefNoNotEqualTo(String value) {
            addCriterion("pro_ref_no <>", value, "proRefNo");
            return (Criteria) this;
        }

        public Criteria andProRefNoGreaterThan(String value) {
            addCriterion("pro_ref_no >", value, "proRefNo");
            return (Criteria) this;
        }

        public Criteria andProRefNoGreaterThanOrEqualTo(String value) {
            addCriterion("pro_ref_no >=", value, "proRefNo");
            return (Criteria) this;
        }

        public Criteria andProRefNoLessThan(String value) {
            addCriterion("pro_ref_no <", value, "proRefNo");
            return (Criteria) this;
        }

        public Criteria andProRefNoLessThanOrEqualTo(String value) {
            addCriterion("pro_ref_no <=", value, "proRefNo");
            return (Criteria) this;
        }

        public Criteria andProRefNoLike(String value) {
            addCriterion("pro_ref_no like", value, "proRefNo");
            return (Criteria) this;
        }

        public Criteria andProRefNoNotLike(String value) {
            addCriterion("pro_ref_no not like", value, "proRefNo");
            return (Criteria) this;
        }

        public Criteria andProRefNoIn(List<String> values) {
            addCriterion("pro_ref_no in", values, "proRefNo");
            return (Criteria) this;
        }

        public Criteria andProRefNoNotIn(List<String> values) {
            addCriterion("pro_ref_no not in", values, "proRefNo");
            return (Criteria) this;
        }

        public Criteria andProRefNoBetween(String value1, String value2) {
            addCriterion("pro_ref_no between", value1, value2, "proRefNo");
            return (Criteria) this;
        }

        public Criteria andProRefNoNotBetween(String value1, String value2) {
            addCriterion("pro_ref_no not between", value1, value2, "proRefNo");
            return (Criteria) this;
        }

        public Criteria andRelationPersonIdsIsNull() {
            addCriterion("relation_person_ids is null");
            return (Criteria) this;
        }

        public Criteria andRelationPersonIdsIsNotNull() {
            addCriterion("relation_person_ids is not null");
            return (Criteria) this;
        }

        public Criteria andRelationPersonIdsEqualTo(String value) {
            addCriterion("relation_person_ids =", value, "relationPersonIds");
            return (Criteria) this;
        }

        public Criteria andRelationPersonIdsNotEqualTo(String value) {
            addCriterion("relation_person_ids <>", value, "relationPersonIds");
            return (Criteria) this;
        }

        public Criteria andRelationPersonIdsGreaterThan(String value) {
            addCriterion("relation_person_ids >", value, "relationPersonIds");
            return (Criteria) this;
        }

        public Criteria andRelationPersonIdsGreaterThanOrEqualTo(String value) {
            addCriterion("relation_person_ids >=", value, "relationPersonIds");
            return (Criteria) this;
        }

        public Criteria andRelationPersonIdsLessThan(String value) {
            addCriterion("relation_person_ids <", value, "relationPersonIds");
            return (Criteria) this;
        }

        public Criteria andRelationPersonIdsLessThanOrEqualTo(String value) {
            addCriterion("relation_person_ids <=", value, "relationPersonIds");
            return (Criteria) this;
        }

        public Criteria andRelationPersonIdsLike(String value) {
            addCriterion("relation_person_ids like", value, "relationPersonIds");
            return (Criteria) this;
        }

        public Criteria andRelationPersonIdsNotLike(String value) {
            addCriterion("relation_person_ids not like", value, "relationPersonIds");
            return (Criteria) this;
        }

        public Criteria andRelationPersonIdsIn(List<String> values) {
            addCriterion("relation_person_ids in", values, "relationPersonIds");
            return (Criteria) this;
        }

        public Criteria andRelationPersonIdsNotIn(List<String> values) {
            addCriterion("relation_person_ids not in", values, "relationPersonIds");
            return (Criteria) this;
        }

        public Criteria andRelationPersonIdsBetween(String value1, String value2) {
            addCriterion("relation_person_ids between", value1, value2, "relationPersonIds");
            return (Criteria) this;
        }

        public Criteria andRelationPersonIdsNotBetween(String value1, String value2) {
            addCriterion("relation_person_ids not between", value1, value2, "relationPersonIds");
            return (Criteria) this;
        }

        public Criteria andRelationPersonRefNoIsNull() {
            addCriterion("relation_person_ref_no is null");
            return (Criteria) this;
        }

        public Criteria andRelationPersonRefNoIsNotNull() {
            addCriterion("relation_person_ref_no is not null");
            return (Criteria) this;
        }

        public Criteria andRelationPersonRefNoEqualTo(String value) {
            addCriterion("relation_person_ref_no =", value, "relationPersonRefNo");
            return (Criteria) this;
        }

        public Criteria andRelationPersonRefNoNotEqualTo(String value) {
            addCriterion("relation_person_ref_no <>", value, "relationPersonRefNo");
            return (Criteria) this;
        }

        public Criteria andRelationPersonRefNoGreaterThan(String value) {
            addCriterion("relation_person_ref_no >", value, "relationPersonRefNo");
            return (Criteria) this;
        }

        public Criteria andRelationPersonRefNoGreaterThanOrEqualTo(String value) {
            addCriterion("relation_person_ref_no >=", value, "relationPersonRefNo");
            return (Criteria) this;
        }

        public Criteria andRelationPersonRefNoLessThan(String value) {
            addCriterion("relation_person_ref_no <", value, "relationPersonRefNo");
            return (Criteria) this;
        }

        public Criteria andRelationPersonRefNoLessThanOrEqualTo(String value) {
            addCriterion("relation_person_ref_no <=", value, "relationPersonRefNo");
            return (Criteria) this;
        }

        public Criteria andRelationPersonRefNoLike(String value) {
            addCriterion("relation_person_ref_no like", value, "relationPersonRefNo");
            return (Criteria) this;
        }

        public Criteria andRelationPersonRefNoNotLike(String value) {
            addCriterion("relation_person_ref_no not like", value, "relationPersonRefNo");
            return (Criteria) this;
        }

        public Criteria andRelationPersonRefNoIn(List<String> values) {
            addCriterion("relation_person_ref_no in", values, "relationPersonRefNo");
            return (Criteria) this;
        }

        public Criteria andRelationPersonRefNoNotIn(List<String> values) {
            addCriterion("relation_person_ref_no not in", values, "relationPersonRefNo");
            return (Criteria) this;
        }

        public Criteria andRelationPersonRefNoBetween(String value1, String value2) {
            addCriterion("relation_person_ref_no between", value1, value2, "relationPersonRefNo");
            return (Criteria) this;
        }

        public Criteria andRelationPersonRefNoNotBetween(String value1, String value2) {
            addCriterion("relation_person_ref_no not between", value1, value2, "relationPersonRefNo");
            return (Criteria) this;
        }

        public Criteria andIsRemittanceIsNull() {
            addCriterion("is_remittance is null");
            return (Criteria) this;
        }

        public Criteria andIsRemittanceIsNotNull() {
            addCriterion("is_remittance is not null");
            return (Criteria) this;
        }

        public Criteria andIsRemittanceEqualTo(String value) {
            addCriterion("is_remittance =", value, "isRemittance");
            return (Criteria) this;
        }

        public Criteria andIsRemittanceNotEqualTo(String value) {
            addCriterion("is_remittance <>", value, "isRemittance");
            return (Criteria) this;
        }

        public Criteria andIsRemittanceGreaterThan(String value) {
            addCriterion("is_remittance >", value, "isRemittance");
            return (Criteria) this;
        }

        public Criteria andIsRemittanceGreaterThanOrEqualTo(String value) {
            addCriterion("is_remittance >=", value, "isRemittance");
            return (Criteria) this;
        }

        public Criteria andIsRemittanceLessThan(String value) {
            addCriterion("is_remittance <", value, "isRemittance");
            return (Criteria) this;
        }

        public Criteria andIsRemittanceLessThanOrEqualTo(String value) {
            addCriterion("is_remittance <=", value, "isRemittance");
            return (Criteria) this;
        }

        public Criteria andIsRemittanceLike(String value) {
            addCriterion("is_remittance like", value, "isRemittance");
            return (Criteria) this;
        }

        public Criteria andIsRemittanceNotLike(String value) {
            addCriterion("is_remittance not like", value, "isRemittance");
            return (Criteria) this;
        }

        public Criteria andIsRemittanceIn(List<String> values) {
            addCriterion("is_remittance in", values, "isRemittance");
            return (Criteria) this;
        }

        public Criteria andIsRemittanceNotIn(List<String> values) {
            addCriterion("is_remittance not in", values, "isRemittance");
            return (Criteria) this;
        }

        public Criteria andIsRemittanceBetween(String value1, String value2) {
            addCriterion("is_remittance between", value1, value2, "isRemittance");
            return (Criteria) this;
        }

        public Criteria andIsRemittanceNotBetween(String value1, String value2) {
            addCriterion("is_remittance not between", value1, value2, "isRemittance");
            return (Criteria) this;
        }

        public Criteria andRemittanceTimeIsNull() {
            addCriterion("remittance_time is null");
            return (Criteria) this;
        }

        public Criteria andRemittanceTimeIsNotNull() {
            addCriterion("remittance_time is not null");
            return (Criteria) this;
        }

        public Criteria andRemittanceTimeEqualTo(Date value) {
            addCriterion("remittance_time =", value, "remittanceTime");
            return (Criteria) this;
        }

        public Criteria andRemittanceTimeNotEqualTo(Date value) {
            addCriterion("remittance_time <>", value, "remittanceTime");
            return (Criteria) this;
        }

        public Criteria andRemittanceTimeGreaterThan(Date value) {
            addCriterion("remittance_time >", value, "remittanceTime");
            return (Criteria) this;
        }

        public Criteria andRemittanceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("remittance_time >=", value, "remittanceTime");
            return (Criteria) this;
        }

        public Criteria andRemittanceTimeLessThan(Date value) {
            addCriterion("remittance_time <", value, "remittanceTime");
            return (Criteria) this;
        }

        public Criteria andRemittanceTimeLessThanOrEqualTo(Date value) {
            addCriterion("remittance_time <=", value, "remittanceTime");
            return (Criteria) this;
        }

        public Criteria andRemittanceTimeIn(List<Date> values) {
            addCriterion("remittance_time in", values, "remittanceTime");
            return (Criteria) this;
        }

        public Criteria andRemittanceTimeNotIn(List<Date> values) {
            addCriterion("remittance_time not in", values, "remittanceTime");
            return (Criteria) this;
        }

        public Criteria andRemittanceTimeBetween(Date value1, Date value2) {
            addCriterion("remittance_time between", value1, value2, "remittanceTime");
            return (Criteria) this;
        }

        public Criteria andRemittanceTimeNotBetween(Date value1, Date value2) {
            addCriterion("remittance_time not between", value1, value2, "remittanceTime");
            return (Criteria) this;
        }

        public Criteria andExtInfoIsNull() {
            addCriterion("ext_info is null");
            return (Criteria) this;
        }

        public Criteria andExtInfoIsNotNull() {
            addCriterion("ext_info is not null");
            return (Criteria) this;
        }

        public Criteria andExtInfoEqualTo(String value) {
            addCriterion("ext_info =", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoNotEqualTo(String value) {
            addCriterion("ext_info <>", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoGreaterThan(String value) {
            addCriterion("ext_info >", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoGreaterThanOrEqualTo(String value) {
            addCriterion("ext_info >=", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoLessThan(String value) {
            addCriterion("ext_info <", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoLessThanOrEqualTo(String value) {
            addCriterion("ext_info <=", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoLike(String value) {
            addCriterion("ext_info like", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoNotLike(String value) {
            addCriterion("ext_info not like", value, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoIn(List<String> values) {
            addCriterion("ext_info in", values, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoNotIn(List<String> values) {
            addCriterion("ext_info not in", values, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoBetween(String value1, String value2) {
            addCriterion("ext_info between", value1, value2, "extInfo");
            return (Criteria) this;
        }

        public Criteria andExtInfoNotBetween(String value1, String value2) {
            addCriterion("ext_info not between", value1, value2, "extInfo");
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