package com.xyb.shop.model.xyb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberCreditApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberCreditApplyExample() {
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

        public Criteria andMemberNoIsNull() {
            addCriterion("member_no is null");
            return (Criteria) this;
        }

        public Criteria andMemberNoIsNotNull() {
            addCriterion("member_no is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNoEqualTo(String value) {
            addCriterion("member_no =", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotEqualTo(String value) {
            addCriterion("member_no <>", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoGreaterThan(String value) {
            addCriterion("member_no >", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoGreaterThanOrEqualTo(String value) {
            addCriterion("member_no >=", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoLessThan(String value) {
            addCriterion("member_no <", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoLessThanOrEqualTo(String value) {
            addCriterion("member_no <=", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoLike(String value) {
            addCriterion("member_no like", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotLike(String value) {
            addCriterion("member_no not like", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoIn(List<String> values) {
            addCriterion("member_no in", values, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotIn(List<String> values) {
            addCriterion("member_no not in", values, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoBetween(String value1, String value2) {
            addCriterion("member_no between", value1, value2, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotBetween(String value1, String value2) {
            addCriterion("member_no not between", value1, value2, "memberNo");
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

        public Criteria andApplyCreditAmountIsNull() {
            addCriterion("apply_credit_amount is null");
            return (Criteria) this;
        }

        public Criteria andApplyCreditAmountIsNotNull() {
            addCriterion("apply_credit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCreditAmountEqualTo(BigDecimal value) {
            addCriterion("apply_credit_amount =", value, "applyCreditAmount");
            return (Criteria) this;
        }

        public Criteria andApplyCreditAmountNotEqualTo(BigDecimal value) {
            addCriterion("apply_credit_amount <>", value, "applyCreditAmount");
            return (Criteria) this;
        }

        public Criteria andApplyCreditAmountGreaterThan(BigDecimal value) {
            addCriterion("apply_credit_amount >", value, "applyCreditAmount");
            return (Criteria) this;
        }

        public Criteria andApplyCreditAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("apply_credit_amount >=", value, "applyCreditAmount");
            return (Criteria) this;
        }

        public Criteria andApplyCreditAmountLessThan(BigDecimal value) {
            addCriterion("apply_credit_amount <", value, "applyCreditAmount");
            return (Criteria) this;
        }

        public Criteria andApplyCreditAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("apply_credit_amount <=", value, "applyCreditAmount");
            return (Criteria) this;
        }

        public Criteria andApplyCreditAmountIn(List<BigDecimal> values) {
            addCriterion("apply_credit_amount in", values, "applyCreditAmount");
            return (Criteria) this;
        }

        public Criteria andApplyCreditAmountNotIn(List<BigDecimal> values) {
            addCriterion("apply_credit_amount not in", values, "applyCreditAmount");
            return (Criteria) this;
        }

        public Criteria andApplyCreditAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apply_credit_amount between", value1, value2, "applyCreditAmount");
            return (Criteria) this;
        }

        public Criteria andApplyCreditAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apply_credit_amount not between", value1, value2, "applyCreditAmount");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoIsNull() {
            addCriterion("audit_batch_no is null");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoIsNotNull() {
            addCriterion("audit_batch_no is not null");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoEqualTo(String value) {
            addCriterion("audit_batch_no =", value, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoNotEqualTo(String value) {
            addCriterion("audit_batch_no <>", value, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoGreaterThan(String value) {
            addCriterion("audit_batch_no >", value, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("audit_batch_no >=", value, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoLessThan(String value) {
            addCriterion("audit_batch_no <", value, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoLessThanOrEqualTo(String value) {
            addCriterion("audit_batch_no <=", value, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoLike(String value) {
            addCriterion("audit_batch_no like", value, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoNotLike(String value) {
            addCriterion("audit_batch_no not like", value, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoIn(List<String> values) {
            addCriterion("audit_batch_no in", values, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoNotIn(List<String> values) {
            addCriterion("audit_batch_no not in", values, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoBetween(String value1, String value2) {
            addCriterion("audit_batch_no between", value1, value2, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andAuditBatchNoNotBetween(String value1, String value2) {
            addCriterion("audit_batch_no not between", value1, value2, "auditBatchNo");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeIsNull() {
            addCriterion("last_audit_time is null");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeIsNotNull() {
            addCriterion("last_audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeEqualTo(Date value) {
            addCriterion("last_audit_time =", value, "lastAuditTime");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeNotEqualTo(Date value) {
            addCriterion("last_audit_time <>", value, "lastAuditTime");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeGreaterThan(Date value) {
            addCriterion("last_audit_time >", value, "lastAuditTime");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_audit_time >=", value, "lastAuditTime");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeLessThan(Date value) {
            addCriterion("last_audit_time <", value, "lastAuditTime");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_audit_time <=", value, "lastAuditTime");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeIn(List<Date> values) {
            addCriterion("last_audit_time in", values, "lastAuditTime");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeNotIn(List<Date> values) {
            addCriterion("last_audit_time not in", values, "lastAuditTime");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeBetween(Date value1, Date value2) {
            addCriterion("last_audit_time between", value1, value2, "lastAuditTime");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_audit_time not between", value1, value2, "lastAuditTime");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
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