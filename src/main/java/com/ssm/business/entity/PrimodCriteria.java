package com.ssm.business.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PrimodCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrimodCriteria() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andModIdIsNull() {
            addCriterion("mod_id is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("mod_id is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(Integer value) {
            addCriterion("mod_id =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(Integer value) {
            addCriterion("mod_id <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(Integer value) {
            addCriterion("mod_id >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mod_id >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(Integer value) {
            addCriterion("mod_id <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(Integer value) {
            addCriterion("mod_id <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<Integer> values) {
            addCriterion("mod_id in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<Integer> values) {
            addCriterion("mod_id not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(Integer value1, Integer value2) {
            addCriterion("mod_id between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mod_id not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModNameIsNull() {
            addCriterion("mod_name is null");
            return (Criteria) this;
        }

        public Criteria andModNameIsNotNull() {
            addCriterion("mod_name is not null");
            return (Criteria) this;
        }

        public Criteria andModNameEqualTo(String value) {
            addCriterion("mod_name =", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameNotEqualTo(String value) {
            addCriterion("mod_name <>", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameGreaterThan(String value) {
            addCriterion("mod_name >", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameGreaterThanOrEqualTo(String value) {
            addCriterion("mod_name >=", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameLessThan(String value) {
            addCriterion("mod_name <", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameLessThanOrEqualTo(String value) {
            addCriterion("mod_name <=", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameLike(String value) {
            addCriterion("mod_name like", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameNotLike(String value) {
            addCriterion("mod_name not like", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameIn(List<String> values) {
            addCriterion("mod_name in", values, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameNotIn(List<String> values) {
            addCriterion("mod_name not in", values, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameBetween(String value1, String value2) {
            addCriterion("mod_name between", value1, value2, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameNotBetween(String value1, String value2) {
            addCriterion("mod_name not between", value1, value2, "modName");
            return (Criteria) this;
        }

        public Criteria andModWidthIsNull() {
            addCriterion("mod_width is null");
            return (Criteria) this;
        }

        public Criteria andModWidthIsNotNull() {
            addCriterion("mod_width is not null");
            return (Criteria) this;
        }

        public Criteria andModWidthEqualTo(Integer value) {
            addCriterion("mod_width =", value, "modWidth");
            return (Criteria) this;
        }

        public Criteria andModWidthNotEqualTo(Integer value) {
            addCriterion("mod_width <>", value, "modWidth");
            return (Criteria) this;
        }

        public Criteria andModWidthGreaterThan(Integer value) {
            addCriterion("mod_width >", value, "modWidth");
            return (Criteria) this;
        }

        public Criteria andModWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("mod_width >=", value, "modWidth");
            return (Criteria) this;
        }

        public Criteria andModWidthLessThan(Integer value) {
            addCriterion("mod_width <", value, "modWidth");
            return (Criteria) this;
        }

        public Criteria andModWidthLessThanOrEqualTo(Integer value) {
            addCriterion("mod_width <=", value, "modWidth");
            return (Criteria) this;
        }

        public Criteria andModWidthIn(List<Integer> values) {
            addCriterion("mod_width in", values, "modWidth");
            return (Criteria) this;
        }

        public Criteria andModWidthNotIn(List<Integer> values) {
            addCriterion("mod_width not in", values, "modWidth");
            return (Criteria) this;
        }

        public Criteria andModWidthBetween(Integer value1, Integer value2) {
            addCriterion("mod_width between", value1, value2, "modWidth");
            return (Criteria) this;
        }

        public Criteria andModWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("mod_width not between", value1, value2, "modWidth");
            return (Criteria) this;
        }

        public Criteria andModHeightIsNull() {
            addCriterion("mod_height is null");
            return (Criteria) this;
        }

        public Criteria andModHeightIsNotNull() {
            addCriterion("mod_height is not null");
            return (Criteria) this;
        }

        public Criteria andModHeightEqualTo(Integer value) {
            addCriterion("mod_height =", value, "modHeight");
            return (Criteria) this;
        }

        public Criteria andModHeightNotEqualTo(Integer value) {
            addCriterion("mod_height <>", value, "modHeight");
            return (Criteria) this;
        }

        public Criteria andModHeightGreaterThan(Integer value) {
            addCriterion("mod_height >", value, "modHeight");
            return (Criteria) this;
        }

        public Criteria andModHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("mod_height >=", value, "modHeight");
            return (Criteria) this;
        }

        public Criteria andModHeightLessThan(Integer value) {
            addCriterion("mod_height <", value, "modHeight");
            return (Criteria) this;
        }

        public Criteria andModHeightLessThanOrEqualTo(Integer value) {
            addCriterion("mod_height <=", value, "modHeight");
            return (Criteria) this;
        }

        public Criteria andModHeightIn(List<Integer> values) {
            addCriterion("mod_height in", values, "modHeight");
            return (Criteria) this;
        }

        public Criteria andModHeightNotIn(List<Integer> values) {
            addCriterion("mod_height not in", values, "modHeight");
            return (Criteria) this;
        }

        public Criteria andModHeightBetween(Integer value1, Integer value2) {
            addCriterion("mod_height between", value1, value2, "modHeight");
            return (Criteria) this;
        }

        public Criteria andModHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("mod_height not between", value1, value2, "modHeight");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andStateTimeIsNull() {
            addCriterion("state_time is null");
            return (Criteria) this;
        }

        public Criteria andStateTimeIsNotNull() {
            addCriterion("state_time is not null");
            return (Criteria) this;
        }

        public Criteria andStateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("state_time =", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("state_time <>", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("state_time >", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("state_time >=", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeLessThan(Date value) {
            addCriterionForJDBCDate("state_time <", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("state_time <=", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("state_time in", values, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("state_time not in", values, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("state_time between", value1, value2, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("state_time not between", value1, value2, "stateTime");
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