package com.ssm.business.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PriitemsCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PriitemsCriteria() {
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

        public Criteria andPriIdIsNull() {
            addCriterion("pri_id is null");
            return (Criteria) this;
        }

        public Criteria andPriIdIsNotNull() {
            addCriterion("pri_id is not null");
            return (Criteria) this;
        }

        public Criteria andPriIdEqualTo(Integer value) {
            addCriterion("pri_id =", value, "priId");
            return (Criteria) this;
        }

        public Criteria andPriIdNotEqualTo(Integer value) {
            addCriterion("pri_id <>", value, "priId");
            return (Criteria) this;
        }

        public Criteria andPriIdGreaterThan(Integer value) {
            addCriterion("pri_id >", value, "priId");
            return (Criteria) this;
        }

        public Criteria andPriIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pri_id >=", value, "priId");
            return (Criteria) this;
        }

        public Criteria andPriIdLessThan(Integer value) {
            addCriterion("pri_id <", value, "priId");
            return (Criteria) this;
        }

        public Criteria andPriIdLessThanOrEqualTo(Integer value) {
            addCriterion("pri_id <=", value, "priId");
            return (Criteria) this;
        }

        public Criteria andPriIdIn(List<Integer> values) {
            addCriterion("pri_id in", values, "priId");
            return (Criteria) this;
        }

        public Criteria andPriIdNotIn(List<Integer> values) {
            addCriterion("pri_id not in", values, "priId");
            return (Criteria) this;
        }

        public Criteria andPriIdBetween(Integer value1, Integer value2) {
            addCriterion("pri_id between", value1, value2, "priId");
            return (Criteria) this;
        }

        public Criteria andPriIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pri_id not between", value1, value2, "priId");
            return (Criteria) this;
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

        public Criteria andPriCodeIsNull() {
            addCriterion("pri_code is null");
            return (Criteria) this;
        }

        public Criteria andPriCodeIsNotNull() {
            addCriterion("pri_code is not null");
            return (Criteria) this;
        }

        public Criteria andPriCodeEqualTo(String value) {
            addCriterion("pri_code =", value, "priCode");
            return (Criteria) this;
        }

        public Criteria andPriCodeNotEqualTo(String value) {
            addCriterion("pri_code <>", value, "priCode");
            return (Criteria) this;
        }

        public Criteria andPriCodeGreaterThan(String value) {
            addCriterion("pri_code >", value, "priCode");
            return (Criteria) this;
        }

        public Criteria andPriCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pri_code >=", value, "priCode");
            return (Criteria) this;
        }

        public Criteria andPriCodeLessThan(String value) {
            addCriterion("pri_code <", value, "priCode");
            return (Criteria) this;
        }

        public Criteria andPriCodeLessThanOrEqualTo(String value) {
            addCriterion("pri_code <=", value, "priCode");
            return (Criteria) this;
        }

        public Criteria andPriCodeLike(String value) {
            addCriterion("pri_code like", value, "priCode");
            return (Criteria) this;
        }

        public Criteria andPriCodeNotLike(String value) {
            addCriterion("pri_code not like", value, "priCode");
            return (Criteria) this;
        }

        public Criteria andPriCodeIn(List<String> values) {
            addCriterion("pri_code in", values, "priCode");
            return (Criteria) this;
        }

        public Criteria andPriCodeNotIn(List<String> values) {
            addCriterion("pri_code not in", values, "priCode");
            return (Criteria) this;
        }

        public Criteria andPriCodeBetween(String value1, String value2) {
            addCriterion("pri_code between", value1, value2, "priCode");
            return (Criteria) this;
        }

        public Criteria andPriCodeNotBetween(String value1, String value2) {
            addCriterion("pri_code not between", value1, value2, "priCode");
            return (Criteria) this;
        }

        public Criteria andPriValueIsNull() {
            addCriterion("pri_value is null");
            return (Criteria) this;
        }

        public Criteria andPriValueIsNotNull() {
            addCriterion("pri_value is not null");
            return (Criteria) this;
        }

        public Criteria andPriValueEqualTo(String value) {
            addCriterion("pri_value =", value, "priValue");
            return (Criteria) this;
        }

        public Criteria andPriValueNotEqualTo(String value) {
            addCriterion("pri_value <>", value, "priValue");
            return (Criteria) this;
        }

        public Criteria andPriValueGreaterThan(String value) {
            addCriterion("pri_value >", value, "priValue");
            return (Criteria) this;
        }

        public Criteria andPriValueGreaterThanOrEqualTo(String value) {
            addCriterion("pri_value >=", value, "priValue");
            return (Criteria) this;
        }

        public Criteria andPriValueLessThan(String value) {
            addCriterion("pri_value <", value, "priValue");
            return (Criteria) this;
        }

        public Criteria andPriValueLessThanOrEqualTo(String value) {
            addCriterion("pri_value <=", value, "priValue");
            return (Criteria) this;
        }

        public Criteria andPriValueLike(String value) {
            addCriterion("pri_value like", value, "priValue");
            return (Criteria) this;
        }

        public Criteria andPriValueNotLike(String value) {
            addCriterion("pri_value not like", value, "priValue");
            return (Criteria) this;
        }

        public Criteria andPriValueIn(List<String> values) {
            addCriterion("pri_value in", values, "priValue");
            return (Criteria) this;
        }

        public Criteria andPriValueNotIn(List<String> values) {
            addCriterion("pri_value not in", values, "priValue");
            return (Criteria) this;
        }

        public Criteria andPriValueBetween(String value1, String value2) {
            addCriterion("pri_value between", value1, value2, "priValue");
            return (Criteria) this;
        }

        public Criteria andPriValueNotBetween(String value1, String value2) {
            addCriterion("pri_value not between", value1, value2, "priValue");
            return (Criteria) this;
        }

        public Criteria andPriLeftIsNull() {
            addCriterion("pri_left is null");
            return (Criteria) this;
        }

        public Criteria andPriLeftIsNotNull() {
            addCriterion("pri_left is not null");
            return (Criteria) this;
        }

        public Criteria andPriLeftEqualTo(Integer value) {
            addCriterion("pri_left =", value, "priLeft");
            return (Criteria) this;
        }

        public Criteria andPriLeftNotEqualTo(Integer value) {
            addCriterion("pri_left <>", value, "priLeft");
            return (Criteria) this;
        }

        public Criteria andPriLeftGreaterThan(Integer value) {
            addCriterion("pri_left >", value, "priLeft");
            return (Criteria) this;
        }

        public Criteria andPriLeftGreaterThanOrEqualTo(Integer value) {
            addCriterion("pri_left >=", value, "priLeft");
            return (Criteria) this;
        }

        public Criteria andPriLeftLessThan(Integer value) {
            addCriterion("pri_left <", value, "priLeft");
            return (Criteria) this;
        }

        public Criteria andPriLeftLessThanOrEqualTo(Integer value) {
            addCriterion("pri_left <=", value, "priLeft");
            return (Criteria) this;
        }

        public Criteria andPriLeftIn(List<Integer> values) {
            addCriterion("pri_left in", values, "priLeft");
            return (Criteria) this;
        }

        public Criteria andPriLeftNotIn(List<Integer> values) {
            addCriterion("pri_left not in", values, "priLeft");
            return (Criteria) this;
        }

        public Criteria andPriLeftBetween(Integer value1, Integer value2) {
            addCriterion("pri_left between", value1, value2, "priLeft");
            return (Criteria) this;
        }

        public Criteria andPriLeftNotBetween(Integer value1, Integer value2) {
            addCriterion("pri_left not between", value1, value2, "priLeft");
            return (Criteria) this;
        }

        public Criteria andPriTopIsNull() {
            addCriterion("pri_top is null");
            return (Criteria) this;
        }

        public Criteria andPriTopIsNotNull() {
            addCriterion("pri_top is not null");
            return (Criteria) this;
        }

        public Criteria andPriTopEqualTo(Integer value) {
            addCriterion("pri_top =", value, "priTop");
            return (Criteria) this;
        }

        public Criteria andPriTopNotEqualTo(Integer value) {
            addCriterion("pri_top <>", value, "priTop");
            return (Criteria) this;
        }

        public Criteria andPriTopGreaterThan(Integer value) {
            addCriterion("pri_top >", value, "priTop");
            return (Criteria) this;
        }

        public Criteria andPriTopGreaterThanOrEqualTo(Integer value) {
            addCriterion("pri_top >=", value, "priTop");
            return (Criteria) this;
        }

        public Criteria andPriTopLessThan(Integer value) {
            addCriterion("pri_top <", value, "priTop");
            return (Criteria) this;
        }

        public Criteria andPriTopLessThanOrEqualTo(Integer value) {
            addCriterion("pri_top <=", value, "priTop");
            return (Criteria) this;
        }

        public Criteria andPriTopIn(List<Integer> values) {
            addCriterion("pri_top in", values, "priTop");
            return (Criteria) this;
        }

        public Criteria andPriTopNotIn(List<Integer> values) {
            addCriterion("pri_top not in", values, "priTop");
            return (Criteria) this;
        }

        public Criteria andPriTopBetween(Integer value1, Integer value2) {
            addCriterion("pri_top between", value1, value2, "priTop");
            return (Criteria) this;
        }

        public Criteria andPriTopNotBetween(Integer value1, Integer value2) {
            addCriterion("pri_top not between", value1, value2, "priTop");
            return (Criteria) this;
        }

        public Criteria andPriWidthIsNull() {
            addCriterion("pri_width is null");
            return (Criteria) this;
        }

        public Criteria andPriWidthIsNotNull() {
            addCriterion("pri_width is not null");
            return (Criteria) this;
        }

        public Criteria andPriWidthEqualTo(Integer value) {
            addCriterion("pri_width =", value, "priWidth");
            return (Criteria) this;
        }

        public Criteria andPriWidthNotEqualTo(Integer value) {
            addCriterion("pri_width <>", value, "priWidth");
            return (Criteria) this;
        }

        public Criteria andPriWidthGreaterThan(Integer value) {
            addCriterion("pri_width >", value, "priWidth");
            return (Criteria) this;
        }

        public Criteria andPriWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("pri_width >=", value, "priWidth");
            return (Criteria) this;
        }

        public Criteria andPriWidthLessThan(Integer value) {
            addCriterion("pri_width <", value, "priWidth");
            return (Criteria) this;
        }

        public Criteria andPriWidthLessThanOrEqualTo(Integer value) {
            addCriterion("pri_width <=", value, "priWidth");
            return (Criteria) this;
        }

        public Criteria andPriWidthIn(List<Integer> values) {
            addCriterion("pri_width in", values, "priWidth");
            return (Criteria) this;
        }

        public Criteria andPriWidthNotIn(List<Integer> values) {
            addCriterion("pri_width not in", values, "priWidth");
            return (Criteria) this;
        }

        public Criteria andPriWidthBetween(Integer value1, Integer value2) {
            addCriterion("pri_width between", value1, value2, "priWidth");
            return (Criteria) this;
        }

        public Criteria andPriWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("pri_width not between", value1, value2, "priWidth");
            return (Criteria) this;
        }

        public Criteria andPriHeightIsNull() {
            addCriterion("pri_height is null");
            return (Criteria) this;
        }

        public Criteria andPriHeightIsNotNull() {
            addCriterion("pri_height is not null");
            return (Criteria) this;
        }

        public Criteria andPriHeightEqualTo(Integer value) {
            addCriterion("pri_height =", value, "priHeight");
            return (Criteria) this;
        }

        public Criteria andPriHeightNotEqualTo(Integer value) {
            addCriterion("pri_height <>", value, "priHeight");
            return (Criteria) this;
        }

        public Criteria andPriHeightGreaterThan(Integer value) {
            addCriterion("pri_height >", value, "priHeight");
            return (Criteria) this;
        }

        public Criteria andPriHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("pri_height >=", value, "priHeight");
            return (Criteria) this;
        }

        public Criteria andPriHeightLessThan(Integer value) {
            addCriterion("pri_height <", value, "priHeight");
            return (Criteria) this;
        }

        public Criteria andPriHeightLessThanOrEqualTo(Integer value) {
            addCriterion("pri_height <=", value, "priHeight");
            return (Criteria) this;
        }

        public Criteria andPriHeightIn(List<Integer> values) {
            addCriterion("pri_height in", values, "priHeight");
            return (Criteria) this;
        }

        public Criteria andPriHeightNotIn(List<Integer> values) {
            addCriterion("pri_height not in", values, "priHeight");
            return (Criteria) this;
        }

        public Criteria andPriHeightBetween(Integer value1, Integer value2) {
            addCriterion("pri_height between", value1, value2, "priHeight");
            return (Criteria) this;
        }

        public Criteria andPriHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("pri_height not between", value1, value2, "priHeight");
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