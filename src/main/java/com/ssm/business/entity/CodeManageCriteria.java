package com.ssm.business.entity;

import java.util.ArrayList;
import java.util.List;

public class CodeManageCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CodeManageCriteria() {
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

        public Criteria andDmTypeIsNull() {
            addCriterion("dm_type is null");
            return (Criteria) this;
        }

        public Criteria andDmTypeIsNotNull() {
            addCriterion("dm_type is not null");
            return (Criteria) this;
        }

        public Criteria andDmTypeEqualTo(String value) {
            addCriterion("dm_type =", value, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmTypeNotEqualTo(String value) {
            addCriterion("dm_type <>", value, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmTypeGreaterThan(String value) {
            addCriterion("dm_type >", value, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dm_type >=", value, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmTypeLessThan(String value) {
            addCriterion("dm_type <", value, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmTypeLessThanOrEqualTo(String value) {
            addCriterion("dm_type <=", value, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmTypeLike(String value) {
            addCriterion("dm_type like", value, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmTypeNotLike(String value) {
            addCriterion("dm_type not like", value, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmTypeIn(List<String> values) {
            addCriterion("dm_type in", values, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmTypeNotIn(List<String> values) {
            addCriterion("dm_type not in", values, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmTypeBetween(String value1, String value2) {
            addCriterion("dm_type between", value1, value2, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmTypeNotBetween(String value1, String value2) {
            addCriterion("dm_type not between", value1, value2, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmIsNull() {
            addCriterion("dm is null");
            return (Criteria) this;
        }

        public Criteria andDmIsNotNull() {
            addCriterion("dm is not null");
            return (Criteria) this;
        }

        public Criteria andDmEqualTo(String value) {
            addCriterion("dm =", value, "dm");
            return (Criteria) this;
        }

        public Criteria andDmNotEqualTo(String value) {
            addCriterion("dm <>", value, "dm");
            return (Criteria) this;
        }

        public Criteria andDmGreaterThan(String value) {
            addCriterion("dm >", value, "dm");
            return (Criteria) this;
        }

        public Criteria andDmGreaterThanOrEqualTo(String value) {
            addCriterion("dm >=", value, "dm");
            return (Criteria) this;
        }

        public Criteria andDmLessThan(String value) {
            addCriterion("dm <", value, "dm");
            return (Criteria) this;
        }

        public Criteria andDmLessThanOrEqualTo(String value) {
            addCriterion("dm <=", value, "dm");
            return (Criteria) this;
        }

        public Criteria andDmLike(String value) {
            addCriterion("dm like", value, "dm");
            return (Criteria) this;
        }

        public Criteria andDmNotLike(String value) {
            addCriterion("dm not like", value, "dm");
            return (Criteria) this;
        }

        public Criteria andDmIn(List<String> values) {
            addCriterion("dm in", values, "dm");
            return (Criteria) this;
        }

        public Criteria andDmNotIn(List<String> values) {
            addCriterion("dm not in", values, "dm");
            return (Criteria) this;
        }

        public Criteria andDmBetween(String value1, String value2) {
            addCriterion("dm between", value1, value2, "dm");
            return (Criteria) this;
        }

        public Criteria andDmNotBetween(String value1, String value2) {
            addCriterion("dm not between", value1, value2, "dm");
            return (Criteria) this;
        }

        public Criteria andMcIsNull() {
            addCriterion("mc is null");
            return (Criteria) this;
        }

        public Criteria andMcIsNotNull() {
            addCriterion("mc is not null");
            return (Criteria) this;
        }

        public Criteria andMcEqualTo(String value) {
            addCriterion("mc =", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotEqualTo(String value) {
            addCriterion("mc <>", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThan(String value) {
            addCriterion("mc >", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThanOrEqualTo(String value) {
            addCriterion("mc >=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThan(String value) {
            addCriterion("mc <", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThanOrEqualTo(String value) {
            addCriterion("mc <=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLike(String value) {
            addCriterion("mc like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotLike(String value) {
            addCriterion("mc not like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcIn(List<String> values) {
            addCriterion("mc in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotIn(List<String> values) {
            addCriterion("mc not in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcBetween(String value1, String value2) {
            addCriterion("mc between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotBetween(String value1, String value2) {
            addCriterion("mc not between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andZgfIsNull() {
            addCriterion("zgf is null");
            return (Criteria) this;
        }

        public Criteria andZgfIsNotNull() {
            addCriterion("zgf is not null");
            return (Criteria) this;
        }

        public Criteria andZgfEqualTo(Float value) {
            addCriterion("zgf =", value, "zgf");
            return (Criteria) this;
        }

        public Criteria andZgfNotEqualTo(Float value) {
            addCriterion("zgf <>", value, "zgf");
            return (Criteria) this;
        }

        public Criteria andZgfGreaterThan(Float value) {
            addCriterion("zgf >", value, "zgf");
            return (Criteria) this;
        }

        public Criteria andZgfGreaterThanOrEqualTo(Float value) {
            addCriterion("zgf >=", value, "zgf");
            return (Criteria) this;
        }

        public Criteria andZgfLessThan(Float value) {
            addCriterion("zgf <", value, "zgf");
            return (Criteria) this;
        }

        public Criteria andZgfLessThanOrEqualTo(Float value) {
            addCriterion("zgf <=", value, "zgf");
            return (Criteria) this;
        }

        public Criteria andZgfIn(List<Float> values) {
            addCriterion("zgf in", values, "zgf");
            return (Criteria) this;
        }

        public Criteria andZgfNotIn(List<Float> values) {
            addCriterion("zgf not in", values, "zgf");
            return (Criteria) this;
        }

        public Criteria andZgfBetween(Float value1, Float value2) {
            addCriterion("zgf between", value1, value2, "zgf");
            return (Criteria) this;
        }

        public Criteria andZgfNotBetween(Float value1, Float value2) {
            addCriterion("zgf not between", value1, value2, "zgf");
            return (Criteria) this;
        }

        public Criteria andXdxIsNull() {
            addCriterion("xdx is null");
            return (Criteria) this;
        }

        public Criteria andXdxIsNotNull() {
            addCriterion("xdx is not null");
            return (Criteria) this;
        }

        public Criteria andXdxEqualTo(String value) {
            addCriterion("xdx =", value, "xdx");
            return (Criteria) this;
        }

        public Criteria andXdxNotEqualTo(String value) {
            addCriterion("xdx <>", value, "xdx");
            return (Criteria) this;
        }

        public Criteria andXdxGreaterThan(String value) {
            addCriterion("xdx >", value, "xdx");
            return (Criteria) this;
        }

        public Criteria andXdxGreaterThanOrEqualTo(String value) {
            addCriterion("xdx >=", value, "xdx");
            return (Criteria) this;
        }

        public Criteria andXdxLessThan(String value) {
            addCriterion("xdx <", value, "xdx");
            return (Criteria) this;
        }

        public Criteria andXdxLessThanOrEqualTo(String value) {
            addCriterion("xdx <=", value, "xdx");
            return (Criteria) this;
        }

        public Criteria andXdxLike(String value) {
            addCriterion("xdx like", value, "xdx");
            return (Criteria) this;
        }

        public Criteria andXdxNotLike(String value) {
            addCriterion("xdx not like", value, "xdx");
            return (Criteria) this;
        }

        public Criteria andXdxIn(List<String> values) {
            addCriterion("xdx in", values, "xdx");
            return (Criteria) this;
        }

        public Criteria andXdxNotIn(List<String> values) {
            addCriterion("xdx not in", values, "xdx");
            return (Criteria) this;
        }

        public Criteria andXdxBetween(String value1, String value2) {
            addCriterion("xdx between", value1, value2, "xdx");
            return (Criteria) this;
        }

        public Criteria andXdxNotBetween(String value1, String value2) {
            addCriterion("xdx not between", value1, value2, "xdx");
            return (Criteria) this;
        }

        public Criteria andNfIsNull() {
            addCriterion("nf is null");
            return (Criteria) this;
        }

        public Criteria andNfIsNotNull() {
            addCriterion("nf is not null");
            return (Criteria) this;
        }

        public Criteria andNfEqualTo(Integer value) {
            addCriterion("nf =", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfNotEqualTo(Integer value) {
            addCriterion("nf <>", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfGreaterThan(Integer value) {
            addCriterion("nf >", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfGreaterThanOrEqualTo(Integer value) {
            addCriterion("nf >=", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfLessThan(Integer value) {
            addCriterion("nf <", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfLessThanOrEqualTo(Integer value) {
            addCriterion("nf <=", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfIn(List<Integer> values) {
            addCriterion("nf in", values, "nf");
            return (Criteria) this;
        }

        public Criteria andNfNotIn(List<Integer> values) {
            addCriterion("nf not in", values, "nf");
            return (Criteria) this;
        }

        public Criteria andNfBetween(Integer value1, Integer value2) {
            addCriterion("nf between", value1, value2, "nf");
            return (Criteria) this;
        }

        public Criteria andNfNotBetween(Integer value1, Integer value2) {
            addCriterion("nf not between", value1, value2, "nf");
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