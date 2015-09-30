package com.ssm.business.entity;

/**
 * Created by  moxz
 * User: 224911261@qq.com
 * 2015/9/27-20:31
 * RecruitSystem.com.ssm.business.entity
 */

import java.util.ArrayList;
import java.util.List;

public class ItemCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemCriteria() {
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Integer value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Integer value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Integer value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Integer value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Integer value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Integer> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Integer> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Integer value1, Integer value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andSourceTabelIsNull() {
            addCriterion("source_tabel is null");
            return (Criteria) this;
        }

        public Criteria andSourceTabelIsNotNull() {
            addCriterion("source_tabel is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTabelEqualTo(String value) {
            addCriterion("source_tabel =", value, "sourceTabel");
            return (Criteria) this;
        }

        public Criteria andSourceTabelNotEqualTo(String value) {
            addCriterion("source_tabel <>", value, "sourceTabel");
            return (Criteria) this;
        }

        public Criteria andSourceTabelGreaterThan(String value) {
            addCriterion("source_tabel >", value, "sourceTabel");
            return (Criteria) this;
        }

        public Criteria andSourceTabelGreaterThanOrEqualTo(String value) {
            addCriterion("source_tabel >=", value, "sourceTabel");
            return (Criteria) this;
        }

        public Criteria andSourceTabelLessThan(String value) {
            addCriterion("source_tabel <", value, "sourceTabel");
            return (Criteria) this;
        }

        public Criteria andSourceTabelLessThanOrEqualTo(String value) {
            addCriterion("source_tabel <=", value, "sourceTabel");
            return (Criteria) this;
        }

        public Criteria andSourceTabelLike(String value) {
            addCriterion("source_tabel like", value, "sourceTabel");
            return (Criteria) this;
        }

        public Criteria andSourceTabelNotLike(String value) {
            addCriterion("source_tabel not like", value, "sourceTabel");
            return (Criteria) this;
        }

        public Criteria andSourceTabelIn(List<String> values) {
            addCriterion("source_tabel in", values, "sourceTabel");
            return (Criteria) this;
        }

        public Criteria andSourceTabelNotIn(List<String> values) {
            addCriterion("source_tabel not in", values, "sourceTabel");
            return (Criteria) this;
        }

        public Criteria andSourceTabelBetween(String value1, String value2) {
            addCriterion("source_tabel between", value1, value2, "sourceTabel");
            return (Criteria) this;
        }

        public Criteria andSourceTabelNotBetween(String value1, String value2) {
            addCriterion("source_tabel not between", value1, value2, "sourceTabel");
            return (Criteria) this;
        }

        public Criteria andSourceFieldIsNull() {
            addCriterion("source_field is null");
            return (Criteria) this;
        }

        public Criteria andSourceFieldIsNotNull() {
            addCriterion("source_field is not null");
            return (Criteria) this;
        }

        public Criteria andSourceFieldEqualTo(String value) {
            addCriterion("source_field =", value, "sourceField");
            return (Criteria) this;
        }

        public Criteria andSourceFieldNotEqualTo(String value) {
            addCriterion("source_field <>", value, "sourceField");
            return (Criteria) this;
        }

        public Criteria andSourceFieldGreaterThan(String value) {
            addCriterion("source_field >", value, "sourceField");
            return (Criteria) this;
        }

        public Criteria andSourceFieldGreaterThanOrEqualTo(String value) {
            addCriterion("source_field >=", value, "sourceField");
            return (Criteria) this;
        }

        public Criteria andSourceFieldLessThan(String value) {
            addCriterion("source_field <", value, "sourceField");
            return (Criteria) this;
        }

        public Criteria andSourceFieldLessThanOrEqualTo(String value) {
            addCriterion("source_field <=", value, "sourceField");
            return (Criteria) this;
        }

        public Criteria andSourceFieldLike(String value) {
            addCriterion("source_field like", value, "sourceField");
            return (Criteria) this;
        }

        public Criteria andSourceFieldNotLike(String value) {
            addCriterion("source_field not like", value, "sourceField");
            return (Criteria) this;
        }

        public Criteria andSourceFieldIn(List<String> values) {
            addCriterion("source_field in", values, "sourceField");
            return (Criteria) this;
        }

        public Criteria andSourceFieldNotIn(List<String> values) {
            addCriterion("source_field not in", values, "sourceField");
            return (Criteria) this;
        }

        public Criteria andSourceFieldBetween(String value1, String value2) {
            addCriterion("source_field between", value1, value2, "sourceField");
            return (Criteria) this;
        }

        public Criteria andSourceFieldNotBetween(String value1, String value2) {
            addCriterion("source_field not between", value1, value2, "sourceField");
            return (Criteria) this;
        }

        public Criteria andTargetTableIsNull() {
            addCriterion("target_table is null");
            return (Criteria) this;
        }

        public Criteria andTargetTableIsNotNull() {
            addCriterion("target_table is not null");
            return (Criteria) this;
        }

        public Criteria andTargetTableEqualTo(String value) {
            addCriterion("target_table =", value, "targetTable");
            return (Criteria) this;
        }

        public Criteria andTargetTableNotEqualTo(String value) {
            addCriterion("target_table <>", value, "targetTable");
            return (Criteria) this;
        }

        public Criteria andTargetTableGreaterThan(String value) {
            addCriterion("target_table >", value, "targetTable");
            return (Criteria) this;
        }

        public Criteria andTargetTableGreaterThanOrEqualTo(String value) {
            addCriterion("target_table >=", value, "targetTable");
            return (Criteria) this;
        }

        public Criteria andTargetTableLessThan(String value) {
            addCriterion("target_table <", value, "targetTable");
            return (Criteria) this;
        }

        public Criteria andTargetTableLessThanOrEqualTo(String value) {
            addCriterion("target_table <=", value, "targetTable");
            return (Criteria) this;
        }

        public Criteria andTargetTableLike(String value) {
            addCriterion("target_table like", value, "targetTable");
            return (Criteria) this;
        }

        public Criteria andTargetTableNotLike(String value) {
            addCriterion("target_table not like", value, "targetTable");
            return (Criteria) this;
        }

        public Criteria andTargetTableIn(List<String> values) {
            addCriterion("target_table in", values, "targetTable");
            return (Criteria) this;
        }

        public Criteria andTargetTableNotIn(List<String> values) {
            addCriterion("target_table not in", values, "targetTable");
            return (Criteria) this;
        }

        public Criteria andTargetTableBetween(String value1, String value2) {
            addCriterion("target_table between", value1, value2, "targetTable");
            return (Criteria) this;
        }

        public Criteria andTargetTableNotBetween(String value1, String value2) {
            addCriterion("target_table not between", value1, value2, "targetTable");
            return (Criteria) this;
        }

        public Criteria andTargetFieldIsNull() {
            addCriterion("target_field is null");
            return (Criteria) this;
        }

        public Criteria andTargetFieldIsNotNull() {
            addCriterion("target_field is not null");
            return (Criteria) this;
        }

        public Criteria andTargetFieldEqualTo(String value) {
            addCriterion("target_field =", value, "targetField");
            return (Criteria) this;
        }

        public Criteria andTargetFieldNotEqualTo(String value) {
            addCriterion("target_field <>", value, "targetField");
            return (Criteria) this;
        }

        public Criteria andTargetFieldGreaterThan(String value) {
            addCriterion("target_field >", value, "targetField");
            return (Criteria) this;
        }

        public Criteria andTargetFieldGreaterThanOrEqualTo(String value) {
            addCriterion("target_field >=", value, "targetField");
            return (Criteria) this;
        }

        public Criteria andTargetFieldLessThan(String value) {
            addCriterion("target_field <", value, "targetField");
            return (Criteria) this;
        }

        public Criteria andTargetFieldLessThanOrEqualTo(String value) {
            addCriterion("target_field <=", value, "targetField");
            return (Criteria) this;
        }

        public Criteria andTargetFieldLike(String value) {
            addCriterion("target_field like", value, "targetField");
            return (Criteria) this;
        }

        public Criteria andTargetFieldNotLike(String value) {
            addCriterion("target_field not like", value, "targetField");
            return (Criteria) this;
        }

        public Criteria andTargetFieldIn(List<String> values) {
            addCriterion("target_field in", values, "targetField");
            return (Criteria) this;
        }

        public Criteria andTargetFieldNotIn(List<String> values) {
            addCriterion("target_field not in", values, "targetField");
            return (Criteria) this;
        }

        public Criteria andTargetFieldBetween(String value1, String value2) {
            addCriterion("target_field between", value1, value2, "targetField");
            return (Criteria) this;
        }

        public Criteria andTargetFieldNotBetween(String value1, String value2) {
            addCriterion("target_field not between", value1, value2, "targetField");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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