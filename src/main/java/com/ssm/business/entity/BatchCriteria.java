package com.ssm.business.entity;

import java.util.ArrayList;
import java.util.List;

public class BatchCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BatchCriteria() {
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

        public Criteria andBatchYearIsNull() {
            addCriterion("batch_year is null");
            return (Criteria) this;
        }

        public Criteria andBatchYearIsNotNull() {
            addCriterion("batch_year is not null");
            return (Criteria) this;
        }

        public Criteria andBatchYearEqualTo(Integer value) {
            addCriterion("batch_year =", value, "batchYear");
            return (Criteria) this;
        }

        public Criteria andBatchYearNotEqualTo(Integer value) {
            addCriterion("batch_year <>", value, "batchYear");
            return (Criteria) this;
        }

        public Criteria andBatchYearGreaterThan(Integer value) {
            addCriterion("batch_year >", value, "batchYear");
            return (Criteria) this;
        }

        public Criteria andBatchYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("batch_year >=", value, "batchYear");
            return (Criteria) this;
        }

        public Criteria andBatchYearLessThan(Integer value) {
            addCriterion("batch_year <", value, "batchYear");
            return (Criteria) this;
        }

        public Criteria andBatchYearLessThanOrEqualTo(Integer value) {
            addCriterion("batch_year <=", value, "batchYear");
            return (Criteria) this;
        }

        public Criteria andBatchYearIn(List<Integer> values) {
            addCriterion("batch_year in", values, "batchYear");
            return (Criteria) this;
        }

        public Criteria andBatchYearNotIn(List<Integer> values) {
            addCriterion("batch_year not in", values, "batchYear");
            return (Criteria) this;
        }

        public Criteria andBatchYearBetween(Integer value1, Integer value2) {
            addCriterion("batch_year between", value1, value2, "batchYear");
            return (Criteria) this;
        }

        public Criteria andBatchYearNotBetween(Integer value1, Integer value2) {
            addCriterion("batch_year not between", value1, value2, "batchYear");
            return (Criteria) this;
        }

        public Criteria andBatchNameIsNull() {
            addCriterion("batch_name is null");
            return (Criteria) this;
        }

        public Criteria andBatchNameIsNotNull() {
            addCriterion("batch_name is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNameEqualTo(String value) {
            addCriterion("batch_name =", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotEqualTo(String value) {
            addCriterion("batch_name <>", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameGreaterThan(String value) {
            addCriterion("batch_name >", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameGreaterThanOrEqualTo(String value) {
            addCriterion("batch_name >=", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLessThan(String value) {
            addCriterion("batch_name <", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLessThanOrEqualTo(String value) {
            addCriterion("batch_name <=", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLike(String value) {
            addCriterion("batch_name like", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotLike(String value) {
            addCriterion("batch_name not like", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameIn(List<String> values) {
            addCriterion("batch_name in", values, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotIn(List<String> values) {
            addCriterion("batch_name not in", values, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameBetween(String value1, String value2) {
            addCriterion("batch_name between", value1, value2, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotBetween(String value1, String value2) {
            addCriterion("batch_name not between", value1, value2, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchScoresIsNull() {
            addCriterion("batch_scores is null");
            return (Criteria) this;
        }

        public Criteria andBatchScoresIsNotNull() {
            addCriterion("batch_scores is not null");
            return (Criteria) this;
        }

        public Criteria andBatchScoresEqualTo(String value) {
            addCriterion("batch_scores =", value, "batchScores");
            return (Criteria) this;
        }

        public Criteria andBatchScoresNotEqualTo(String value) {
            addCriterion("batch_scores <>", value, "batchScores");
            return (Criteria) this;
        }

        public Criteria andBatchScoresGreaterThan(String value) {
            addCriterion("batch_scores >", value, "batchScores");
            return (Criteria) this;
        }

        public Criteria andBatchScoresGreaterThanOrEqualTo(String value) {
            addCriterion("batch_scores >=", value, "batchScores");
            return (Criteria) this;
        }

        public Criteria andBatchScoresLessThan(String value) {
            addCriterion("batch_scores <", value, "batchScores");
            return (Criteria) this;
        }

        public Criteria andBatchScoresLessThanOrEqualTo(String value) {
            addCriterion("batch_scores <=", value, "batchScores");
            return (Criteria) this;
        }

        public Criteria andBatchScoresLike(String value) {
            addCriterion("batch_scores like", value, "batchScores");
            return (Criteria) this;
        }

        public Criteria andBatchScoresNotLike(String value) {
            addCriterion("batch_scores not like", value, "batchScores");
            return (Criteria) this;
        }

        public Criteria andBatchScoresIn(List<String> values) {
            addCriterion("batch_scores in", values, "batchScores");
            return (Criteria) this;
        }

        public Criteria andBatchScoresNotIn(List<String> values) {
            addCriterion("batch_scores not in", values, "batchScores");
            return (Criteria) this;
        }

        public Criteria andBatchScoresBetween(String value1, String value2) {
            addCriterion("batch_scores between", value1, value2, "batchScores");
            return (Criteria) this;
        }

        public Criteria andBatchScoresNotBetween(String value1, String value2) {
            addCriterion("batch_scores not between", value1, value2, "batchScores");
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