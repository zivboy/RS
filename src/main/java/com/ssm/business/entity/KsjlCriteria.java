package com.ssm.business.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class KsjlCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KsjlCriteria() {
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

        public Criteria andKshIsNull() {
            addCriterion("ksh is null");
            return (Criteria) this;
        }

        public Criteria andKshIsNotNull() {
            addCriterion("ksh is not null");
            return (Criteria) this;
        }

        public Criteria andKshEqualTo(String value) {
            addCriterion("ksh =", value, "ksh");
            return (Criteria) this;
        }

        public Criteria andKshNotEqualTo(String value) {
            addCriterion("ksh <>", value, "ksh");
            return (Criteria) this;
        }

        public Criteria andKshGreaterThan(String value) {
            addCriterion("ksh >", value, "ksh");
            return (Criteria) this;
        }

        public Criteria andKshGreaterThanOrEqualTo(String value) {
            addCriterion("ksh >=", value, "ksh");
            return (Criteria) this;
        }

        public Criteria andKshLessThan(String value) {
            addCriterion("ksh <", value, "ksh");
            return (Criteria) this;
        }

        public Criteria andKshLessThanOrEqualTo(String value) {
            addCriterion("ksh <=", value, "ksh");
            return (Criteria) this;
        }

        public Criteria andKshLike(String value) {
            addCriterion("ksh like", value, "ksh");
            return (Criteria) this;
        }

        public Criteria andKshNotLike(String value) {
            addCriterion("ksh not like", value, "ksh");
            return (Criteria) this;
        }

        public Criteria andKshIn(List<String> values) {
            addCriterion("ksh in", values, "ksh");
            return (Criteria) this;
        }

        public Criteria andKshNotIn(List<String> values) {
            addCriterion("ksh not in", values, "ksh");
            return (Criteria) this;
        }

        public Criteria andKshBetween(String value1, String value2) {
            addCriterion("ksh between", value1, value2, "ksh");
            return (Criteria) this;
        }

        public Criteria andKshNotBetween(String value1, String value2) {
            addCriterion("ksh not between", value1, value2, "ksh");
            return (Criteria) this;
        }

        public Criteria andQsrqIsNull() {
            addCriterion("qsrq is null");
            return (Criteria) this;
        }

        public Criteria andQsrqIsNotNull() {
            addCriterion("qsrq is not null");
            return (Criteria) this;
        }

        public Criteria andQsrqEqualTo(Date value) {
            addCriterionForJDBCDate("qsrq =", value, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("qsrq <>", value, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqGreaterThan(Date value) {
            addCriterionForJDBCDate("qsrq >", value, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qsrq >=", value, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqLessThan(Date value) {
            addCriterionForJDBCDate("qsrq <", value, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qsrq <=", value, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqIn(List<Date> values) {
            addCriterionForJDBCDate("qsrq in", values, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("qsrq not in", values, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qsrq between", value1, value2, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qsrq not between", value1, value2, "qsrq");
            return (Criteria) this;
        }

        public Criteria andZjrqIsNull() {
            addCriterion("zjrq is null");
            return (Criteria) this;
        }

        public Criteria andZjrqIsNotNull() {
            addCriterion("zjrq is not null");
            return (Criteria) this;
        }

        public Criteria andZjrqEqualTo(Date value) {
            addCriterionForJDBCDate("zjrq =", value, "zjrq");
            return (Criteria) this;
        }

        public Criteria andZjrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("zjrq <>", value, "zjrq");
            return (Criteria) this;
        }

        public Criteria andZjrqGreaterThan(Date value) {
            addCriterionForJDBCDate("zjrq >", value, "zjrq");
            return (Criteria) this;
        }

        public Criteria andZjrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zjrq >=", value, "zjrq");
            return (Criteria) this;
        }

        public Criteria andZjrqLessThan(Date value) {
            addCriterionForJDBCDate("zjrq <", value, "zjrq");
            return (Criteria) this;
        }

        public Criteria andZjrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zjrq <=", value, "zjrq");
            return (Criteria) this;
        }

        public Criteria andZjrqIn(List<Date> values) {
            addCriterionForJDBCDate("zjrq in", values, "zjrq");
            return (Criteria) this;
        }

        public Criteria andZjrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("zjrq not in", values, "zjrq");
            return (Criteria) this;
        }

        public Criteria andZjrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zjrq between", value1, value2, "zjrq");
            return (Criteria) this;
        }

        public Criteria andZjrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zjrq not between", value1, value2, "zjrq");
            return (Criteria) this;
        }

        public Criteria andJlIsNull() {
            addCriterion("jl is null");
            return (Criteria) this;
        }

        public Criteria andJlIsNotNull() {
            addCriterion("jl is not null");
            return (Criteria) this;
        }

        public Criteria andJlEqualTo(String value) {
            addCriterion("jl =", value, "jl");
            return (Criteria) this;
        }

        public Criteria andJlNotEqualTo(String value) {
            addCriterion("jl <>", value, "jl");
            return (Criteria) this;
        }

        public Criteria andJlGreaterThan(String value) {
            addCriterion("jl >", value, "jl");
            return (Criteria) this;
        }

        public Criteria andJlGreaterThanOrEqualTo(String value) {
            addCriterion("jl >=", value, "jl");
            return (Criteria) this;
        }

        public Criteria andJlLessThan(String value) {
            addCriterion("jl <", value, "jl");
            return (Criteria) this;
        }

        public Criteria andJlLessThanOrEqualTo(String value) {
            addCriterion("jl <=", value, "jl");
            return (Criteria) this;
        }

        public Criteria andJlLike(String value) {
            addCriterion("jl like", value, "jl");
            return (Criteria) this;
        }

        public Criteria andJlNotLike(String value) {
            addCriterion("jl not like", value, "jl");
            return (Criteria) this;
        }

        public Criteria andJlIn(List<String> values) {
            addCriterion("jl in", values, "jl");
            return (Criteria) this;
        }

        public Criteria andJlNotIn(List<String> values) {
            addCriterion("jl not in", values, "jl");
            return (Criteria) this;
        }

        public Criteria andJlBetween(String value1, String value2) {
            addCriterion("jl between", value1, value2, "jl");
            return (Criteria) this;
        }

        public Criteria andJlNotBetween(String value1, String value2) {
            addCriterion("jl not between", value1, value2, "jl");
            return (Criteria) this;
        }

        public Criteria andRhzwIsNull() {
            addCriterion("rhzw is null");
            return (Criteria) this;
        }

        public Criteria andRhzwIsNotNull() {
            addCriterion("rhzw is not null");
            return (Criteria) this;
        }

        public Criteria andRhzwEqualTo(String value) {
            addCriterion("rhzw =", value, "rhzw");
            return (Criteria) this;
        }

        public Criteria andRhzwNotEqualTo(String value) {
            addCriterion("rhzw <>", value, "rhzw");
            return (Criteria) this;
        }

        public Criteria andRhzwGreaterThan(String value) {
            addCriterion("rhzw >", value, "rhzw");
            return (Criteria) this;
        }

        public Criteria andRhzwGreaterThanOrEqualTo(String value) {
            addCriterion("rhzw >=", value, "rhzw");
            return (Criteria) this;
        }

        public Criteria andRhzwLessThan(String value) {
            addCriterion("rhzw <", value, "rhzw");
            return (Criteria) this;
        }

        public Criteria andRhzwLessThanOrEqualTo(String value) {
            addCriterion("rhzw <=", value, "rhzw");
            return (Criteria) this;
        }

        public Criteria andRhzwLike(String value) {
            addCriterion("rhzw like", value, "rhzw");
            return (Criteria) this;
        }

        public Criteria andRhzwNotLike(String value) {
            addCriterion("rhzw not like", value, "rhzw");
            return (Criteria) this;
        }

        public Criteria andRhzwIn(List<String> values) {
            addCriterion("rhzw in", values, "rhzw");
            return (Criteria) this;
        }

        public Criteria andRhzwNotIn(List<String> values) {
            addCriterion("rhzw not in", values, "rhzw");
            return (Criteria) this;
        }

        public Criteria andRhzwBetween(String value1, String value2) {
            addCriterion("rhzw between", value1, value2, "rhzw");
            return (Criteria) this;
        }

        public Criteria andRhzwNotBetween(String value1, String value2) {
            addCriterion("rhzw not between", value1, value2, "rhzw");
            return (Criteria) this;
        }

        public Criteria andZmrIsNull() {
            addCriterion("zmr is null");
            return (Criteria) this;
        }

        public Criteria andZmrIsNotNull() {
            addCriterion("zmr is not null");
            return (Criteria) this;
        }

        public Criteria andZmrEqualTo(String value) {
            addCriterion("zmr =", value, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrNotEqualTo(String value) {
            addCriterion("zmr <>", value, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrGreaterThan(String value) {
            addCriterion("zmr >", value, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrGreaterThanOrEqualTo(String value) {
            addCriterion("zmr >=", value, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrLessThan(String value) {
            addCriterion("zmr <", value, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrLessThanOrEqualTo(String value) {
            addCriterion("zmr <=", value, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrLike(String value) {
            addCriterion("zmr like", value, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrNotLike(String value) {
            addCriterion("zmr not like", value, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrIn(List<String> values) {
            addCriterion("zmr in", values, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrNotIn(List<String> values) {
            addCriterion("zmr not in", values, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrBetween(String value1, String value2) {
            addCriterion("zmr between", value1, value2, "zmr");
            return (Criteria) this;
        }

        public Criteria andZmrNotBetween(String value1, String value2) {
            addCriterion("zmr not between", value1, value2, "zmr");
            return (Criteria) this;
        }

        public Criteria andSfIsNull() {
            addCriterion("sf is null");
            return (Criteria) this;
        }

        public Criteria andSfIsNotNull() {
            addCriterion("sf is not null");
            return (Criteria) this;
        }

        public Criteria andSfEqualTo(String value) {
            addCriterion("sf =", value, "sf");
            return (Criteria) this;
        }

        public Criteria andSfNotEqualTo(String value) {
            addCriterion("sf <>", value, "sf");
            return (Criteria) this;
        }

        public Criteria andSfGreaterThan(String value) {
            addCriterion("sf >", value, "sf");
            return (Criteria) this;
        }

        public Criteria andSfGreaterThanOrEqualTo(String value) {
            addCriterion("sf >=", value, "sf");
            return (Criteria) this;
        }

        public Criteria andSfLessThan(String value) {
            addCriterion("sf <", value, "sf");
            return (Criteria) this;
        }

        public Criteria andSfLessThanOrEqualTo(String value) {
            addCriterion("sf <=", value, "sf");
            return (Criteria) this;
        }

        public Criteria andSfLike(String value) {
            addCriterion("sf like", value, "sf");
            return (Criteria) this;
        }

        public Criteria andSfNotLike(String value) {
            addCriterion("sf not like", value, "sf");
            return (Criteria) this;
        }

        public Criteria andSfIn(List<String> values) {
            addCriterion("sf in", values, "sf");
            return (Criteria) this;
        }

        public Criteria andSfNotIn(List<String> values) {
            addCriterion("sf not in", values, "sf");
            return (Criteria) this;
        }

        public Criteria andSfBetween(String value1, String value2) {
            addCriterion("sf between", value1, value2, "sf");
            return (Criteria) this;
        }

        public Criteria andSfNotBetween(String value1, String value2) {
            addCriterion("sf not between", value1, value2, "sf");
            return (Criteria) this;
        }

        public Criteria andPcIsNull() {
            addCriterion("pc is null");
            return (Criteria) this;
        }

        public Criteria andPcIsNotNull() {
            addCriterion("pc is not null");
            return (Criteria) this;
        }

        public Criteria andPcEqualTo(String value) {
            addCriterion("pc =", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcNotEqualTo(String value) {
            addCriterion("pc <>", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcGreaterThan(String value) {
            addCriterion("pc >", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcGreaterThanOrEqualTo(String value) {
            addCriterion("pc >=", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcLessThan(String value) {
            addCriterion("pc <", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcLessThanOrEqualTo(String value) {
            addCriterion("pc <=", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcLike(String value) {
            addCriterion("pc like", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcNotLike(String value) {
            addCriterion("pc not like", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcIn(List<String> values) {
            addCriterion("pc in", values, "pc");
            return (Criteria) this;
        }

        public Criteria andPcNotIn(List<String> values) {
            addCriterion("pc not in", values, "pc");
            return (Criteria) this;
        }

        public Criteria andPcBetween(String value1, String value2) {
            addCriterion("pc between", value1, value2, "pc");
            return (Criteria) this;
        }

        public Criteria andPcNotBetween(String value1, String value2) {
            addCriterion("pc not between", value1, value2, "pc");
            return (Criteria) this;
        }

        public Criteria andNyIsNull() {
            addCriterion("ny is null");
            return (Criteria) this;
        }

        public Criteria andNyIsNotNull() {
            addCriterion("ny is not null");
            return (Criteria) this;
        }

        public Criteria andNyEqualTo(Integer value) {
            addCriterion("ny =", value, "ny");
            return (Criteria) this;
        }

        public Criteria andNyNotEqualTo(Integer value) {
            addCriterion("ny <>", value, "ny");
            return (Criteria) this;
        }

        public Criteria andNyGreaterThan(Integer value) {
            addCriterion("ny >", value, "ny");
            return (Criteria) this;
        }

        public Criteria andNyGreaterThanOrEqualTo(Integer value) {
            addCriterion("ny >=", value, "ny");
            return (Criteria) this;
        }

        public Criteria andNyLessThan(Integer value) {
            addCriterion("ny <", value, "ny");
            return (Criteria) this;
        }

        public Criteria andNyLessThanOrEqualTo(Integer value) {
            addCriterion("ny <=", value, "ny");
            return (Criteria) this;
        }

        public Criteria andNyIn(List<Integer> values) {
            addCriterion("ny in", values, "ny");
            return (Criteria) this;
        }

        public Criteria andNyNotIn(List<Integer> values) {
            addCriterion("ny not in", values, "ny");
            return (Criteria) this;
        }

        public Criteria andNyBetween(Integer value1, Integer value2) {
            addCriterion("ny between", value1, value2, "ny");
            return (Criteria) this;
        }

        public Criteria andNyNotBetween(Integer value1, Integer value2) {
            addCriterion("ny not between", value1, value2, "ny");
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