package com.ssm.business.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentCriteria() {
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

        public Criteria andXmIsNull() {
            addCriterion("xm is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("xm is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("xm =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("xm <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("xm >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("xm >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("xm <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("xm <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("xm like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("xm not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("xm in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("xm not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("xm between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("xm not between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andSfzhIsNull() {
            addCriterion("sfzh is null");
            return (Criteria) this;
        }

        public Criteria andSfzhIsNotNull() {
            addCriterion("sfzh is not null");
            return (Criteria) this;
        }

        public Criteria andSfzhEqualTo(String value) {
            addCriterion("sfzh =", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhNotEqualTo(String value) {
            addCriterion("sfzh <>", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhGreaterThan(String value) {
            addCriterion("sfzh >", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhGreaterThanOrEqualTo(String value) {
            addCriterion("sfzh >=", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhLessThan(String value) {
            addCriterion("sfzh <", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhLessThanOrEqualTo(String value) {
            addCriterion("sfzh <=", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhLike(String value) {
            addCriterion("sfzh like", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhNotLike(String value) {
            addCriterion("sfzh not like", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhIn(List<String> values) {
            addCriterion("sfzh in", values, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhNotIn(List<String> values) {
            addCriterion("sfzh not in", values, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhBetween(String value1, String value2) {
            addCriterion("sfzh between", value1, value2, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhNotBetween(String value1, String value2) {
            addCriterion("sfzh not between", value1, value2, "sfzh");
            return (Criteria) this;
        }

        public Criteria andXbIsNull() {
            addCriterion("xb is null");
            return (Criteria) this;
        }

        public Criteria andXbIsNotNull() {
            addCriterion("xb is not null");
            return (Criteria) this;
        }

        public Criteria andXbEqualTo(String value) {
            addCriterion("xb =", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotEqualTo(String value) {
            addCriterion("xb <>", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThan(String value) {
            addCriterion("xb >", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThanOrEqualTo(String value) {
            addCriterion("xb >=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThan(String value) {
            addCriterion("xb <", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThanOrEqualTo(String value) {
            addCriterion("xb <=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLike(String value) {
            addCriterion("xb like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotLike(String value) {
            addCriterion("xb not like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbIn(List<String> values) {
            addCriterion("xb in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotIn(List<String> values) {
            addCriterion("xb not in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbBetween(String value1, String value2) {
            addCriterion("xb between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotBetween(String value1, String value2) {
            addCriterion("xb not between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXbdmIsNull() {
            addCriterion("xbdm is null");
            return (Criteria) this;
        }

        public Criteria andXbdmIsNotNull() {
            addCriterion("xbdm is not null");
            return (Criteria) this;
        }

        public Criteria andXbdmEqualTo(String value) {
            addCriterion("xbdm =", value, "xbdm");
            return (Criteria) this;
        }

        public Criteria andXbdmNotEqualTo(String value) {
            addCriterion("xbdm <>", value, "xbdm");
            return (Criteria) this;
        }

        public Criteria andXbdmGreaterThan(String value) {
            addCriterion("xbdm >", value, "xbdm");
            return (Criteria) this;
        }

        public Criteria andXbdmGreaterThanOrEqualTo(String value) {
            addCriterion("xbdm >=", value, "xbdm");
            return (Criteria) this;
        }

        public Criteria andXbdmLessThan(String value) {
            addCriterion("xbdm <", value, "xbdm");
            return (Criteria) this;
        }

        public Criteria andXbdmLessThanOrEqualTo(String value) {
            addCriterion("xbdm <=", value, "xbdm");
            return (Criteria) this;
        }

        public Criteria andXbdmLike(String value) {
            addCriterion("xbdm like", value, "xbdm");
            return (Criteria) this;
        }

        public Criteria andXbdmNotLike(String value) {
            addCriterion("xbdm not like", value, "xbdm");
            return (Criteria) this;
        }

        public Criteria andXbdmIn(List<String> values) {
            addCriterion("xbdm in", values, "xbdm");
            return (Criteria) this;
        }

        public Criteria andXbdmNotIn(List<String> values) {
            addCriterion("xbdm not in", values, "xbdm");
            return (Criteria) this;
        }

        public Criteria andXbdmBetween(String value1, String value2) {
            addCriterion("xbdm between", value1, value2, "xbdm");
            return (Criteria) this;
        }

        public Criteria andXbdmNotBetween(String value1, String value2) {
            addCriterion("xbdm not between", value1, value2, "xbdm");
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

        public Criteria andSfdmIsNull() {
            addCriterion("sfdm is null");
            return (Criteria) this;
        }

        public Criteria andSfdmIsNotNull() {
            addCriterion("sfdm is not null");
            return (Criteria) this;
        }

        public Criteria andSfdmEqualTo(String value) {
            addCriterion("sfdm =", value, "sfdm");
            return (Criteria) this;
        }

        public Criteria andSfdmNotEqualTo(String value) {
            addCriterion("sfdm <>", value, "sfdm");
            return (Criteria) this;
        }

        public Criteria andSfdmGreaterThan(String value) {
            addCriterion("sfdm >", value, "sfdm");
            return (Criteria) this;
        }

        public Criteria andSfdmGreaterThanOrEqualTo(String value) {
            addCriterion("sfdm >=", value, "sfdm");
            return (Criteria) this;
        }

        public Criteria andSfdmLessThan(String value) {
            addCriterion("sfdm <", value, "sfdm");
            return (Criteria) this;
        }

        public Criteria andSfdmLessThanOrEqualTo(String value) {
            addCriterion("sfdm <=", value, "sfdm");
            return (Criteria) this;
        }

        public Criteria andSfdmLike(String value) {
            addCriterion("sfdm like", value, "sfdm");
            return (Criteria) this;
        }

        public Criteria andSfdmNotLike(String value) {
            addCriterion("sfdm not like", value, "sfdm");
            return (Criteria) this;
        }

        public Criteria andSfdmIn(List<String> values) {
            addCriterion("sfdm in", values, "sfdm");
            return (Criteria) this;
        }

        public Criteria andSfdmNotIn(List<String> values) {
            addCriterion("sfdm not in", values, "sfdm");
            return (Criteria) this;
        }

        public Criteria andSfdmBetween(String value1, String value2) {
            addCriterion("sfdm between", value1, value2, "sfdm");
            return (Criteria) this;
        }

        public Criteria andSfdmNotBetween(String value1, String value2) {
            addCriterion("sfdm not between", value1, value2, "sfdm");
            return (Criteria) this;
        }

        public Criteria andDqmcIsNull() {
            addCriterion("dqmc is null");
            return (Criteria) this;
        }

        public Criteria andDqmcIsNotNull() {
            addCriterion("dqmc is not null");
            return (Criteria) this;
        }

        public Criteria andDqmcEqualTo(String value) {
            addCriterion("dqmc =", value, "dqmc");
            return (Criteria) this;
        }

        public Criteria andDqmcNotEqualTo(String value) {
            addCriterion("dqmc <>", value, "dqmc");
            return (Criteria) this;
        }

        public Criteria andDqmcGreaterThan(String value) {
            addCriterion("dqmc >", value, "dqmc");
            return (Criteria) this;
        }

        public Criteria andDqmcGreaterThanOrEqualTo(String value) {
            addCriterion("dqmc >=", value, "dqmc");
            return (Criteria) this;
        }

        public Criteria andDqmcLessThan(String value) {
            addCriterion("dqmc <", value, "dqmc");
            return (Criteria) this;
        }

        public Criteria andDqmcLessThanOrEqualTo(String value) {
            addCriterion("dqmc <=", value, "dqmc");
            return (Criteria) this;
        }

        public Criteria andDqmcLike(String value) {
            addCriterion("dqmc like", value, "dqmc");
            return (Criteria) this;
        }

        public Criteria andDqmcNotLike(String value) {
            addCriterion("dqmc not like", value, "dqmc");
            return (Criteria) this;
        }

        public Criteria andDqmcIn(List<String> values) {
            addCriterion("dqmc in", values, "dqmc");
            return (Criteria) this;
        }

        public Criteria andDqmcNotIn(List<String> values) {
            addCriterion("dqmc not in", values, "dqmc");
            return (Criteria) this;
        }

        public Criteria andDqmcBetween(String value1, String value2) {
            addCriterion("dqmc between", value1, value2, "dqmc");
            return (Criteria) this;
        }

        public Criteria andDqmcNotBetween(String value1, String value2) {
            addCriterion("dqmc not between", value1, value2, "dqmc");
            return (Criteria) this;
        }

        public Criteria andDqdmIsNull() {
            addCriterion("dqdm is null");
            return (Criteria) this;
        }

        public Criteria andDqdmIsNotNull() {
            addCriterion("dqdm is not null");
            return (Criteria) this;
        }

        public Criteria andDqdmEqualTo(String value) {
            addCriterion("dqdm =", value, "dqdm");
            return (Criteria) this;
        }

        public Criteria andDqdmNotEqualTo(String value) {
            addCriterion("dqdm <>", value, "dqdm");
            return (Criteria) this;
        }

        public Criteria andDqdmGreaterThan(String value) {
            addCriterion("dqdm >", value, "dqdm");
            return (Criteria) this;
        }

        public Criteria andDqdmGreaterThanOrEqualTo(String value) {
            addCriterion("dqdm >=", value, "dqdm");
            return (Criteria) this;
        }

        public Criteria andDqdmLessThan(String value) {
            addCriterion("dqdm <", value, "dqdm");
            return (Criteria) this;
        }

        public Criteria andDqdmLessThanOrEqualTo(String value) {
            addCriterion("dqdm <=", value, "dqdm");
            return (Criteria) this;
        }

        public Criteria andDqdmLike(String value) {
            addCriterion("dqdm like", value, "dqdm");
            return (Criteria) this;
        }

        public Criteria andDqdmNotLike(String value) {
            addCriterion("dqdm not like", value, "dqdm");
            return (Criteria) this;
        }

        public Criteria andDqdmIn(List<String> values) {
            addCriterion("dqdm in", values, "dqdm");
            return (Criteria) this;
        }

        public Criteria andDqdmNotIn(List<String> values) {
            addCriterion("dqdm not in", values, "dqdm");
            return (Criteria) this;
        }

        public Criteria andDqdmBetween(String value1, String value2) {
            addCriterion("dqdm between", value1, value2, "dqdm");
            return (Criteria) this;
        }

        public Criteria andDqdmNotBetween(String value1, String value2) {
            addCriterion("dqdm not between", value1, value2, "dqdm");
            return (Criteria) this;
        }

        public Criteria andMzIsNull() {
            addCriterion("mz is null");
            return (Criteria) this;
        }

        public Criteria andMzIsNotNull() {
            addCriterion("mz is not null");
            return (Criteria) this;
        }

        public Criteria andMzEqualTo(String value) {
            addCriterion("mz =", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotEqualTo(String value) {
            addCriterion("mz <>", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThan(String value) {
            addCriterion("mz >", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThanOrEqualTo(String value) {
            addCriterion("mz >=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThan(String value) {
            addCriterion("mz <", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThanOrEqualTo(String value) {
            addCriterion("mz <=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLike(String value) {
            addCriterion("mz like", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotLike(String value) {
            addCriterion("mz not like", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzIn(List<String> values) {
            addCriterion("mz in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotIn(List<String> values) {
            addCriterion("mz not in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzBetween(String value1, String value2) {
            addCriterion("mz between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotBetween(String value1, String value2) {
            addCriterion("mz not between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andMzdmIsNull() {
            addCriterion("mzdm is null");
            return (Criteria) this;
        }

        public Criteria andMzdmIsNotNull() {
            addCriterion("mzdm is not null");
            return (Criteria) this;
        }

        public Criteria andMzdmEqualTo(String value) {
            addCriterion("mzdm =", value, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmNotEqualTo(String value) {
            addCriterion("mzdm <>", value, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmGreaterThan(String value) {
            addCriterion("mzdm >", value, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmGreaterThanOrEqualTo(String value) {
            addCriterion("mzdm >=", value, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmLessThan(String value) {
            addCriterion("mzdm <", value, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmLessThanOrEqualTo(String value) {
            addCriterion("mzdm <=", value, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmLike(String value) {
            addCriterion("mzdm like", value, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmNotLike(String value) {
            addCriterion("mzdm not like", value, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmIn(List<String> values) {
            addCriterion("mzdm in", values, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmNotIn(List<String> values) {
            addCriterion("mzdm not in", values, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmBetween(String value1, String value2) {
            addCriterion("mzdm between", value1, value2, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmNotBetween(String value1, String value2) {
            addCriterion("mzdm not between", value1, value2, "mzdm");
            return (Criteria) this;
        }

        public Criteria andCsnyIsNull() {
            addCriterion("csny is null");
            return (Criteria) this;
        }

        public Criteria andCsnyIsNotNull() {
            addCriterion("csny is not null");
            return (Criteria) this;
        }

        public Criteria andCsnyEqualTo(Date value) {
            addCriterionForJDBCDate("csny =", value, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyNotEqualTo(Date value) {
            addCriterionForJDBCDate("csny <>", value, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyGreaterThan(Date value) {
            addCriterionForJDBCDate("csny >", value, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("csny >=", value, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyLessThan(Date value) {
            addCriterionForJDBCDate("csny <", value, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("csny <=", value, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyIn(List<Date> values) {
            addCriterionForJDBCDate("csny in", values, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyNotIn(List<Date> values) {
            addCriterionForJDBCDate("csny not in", values, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("csny between", value1, value2, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("csny not between", value1, value2, "csny");
            return (Criteria) this;
        }

        public Criteria andZzmmdmIsNull() {
            addCriterion("zzmmdm is null");
            return (Criteria) this;
        }

        public Criteria andZzmmdmIsNotNull() {
            addCriterion("zzmmdm is not null");
            return (Criteria) this;
        }

        public Criteria andZzmmdmEqualTo(String value) {
            addCriterion("zzmmdm =", value, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmNotEqualTo(String value) {
            addCriterion("zzmmdm <>", value, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmGreaterThan(String value) {
            addCriterion("zzmmdm >", value, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmGreaterThanOrEqualTo(String value) {
            addCriterion("zzmmdm >=", value, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmLessThan(String value) {
            addCriterion("zzmmdm <", value, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmLessThanOrEqualTo(String value) {
            addCriterion("zzmmdm <=", value, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmLike(String value) {
            addCriterion("zzmmdm like", value, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmNotLike(String value) {
            addCriterion("zzmmdm not like", value, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmIn(List<String> values) {
            addCriterion("zzmmdm in", values, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmNotIn(List<String> values) {
            addCriterion("zzmmdm not in", values, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmBetween(String value1, String value2) {
            addCriterion("zzmmdm between", value1, value2, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmNotBetween(String value1, String value2) {
            addCriterion("zzmmdm not between", value1, value2, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNull() {
            addCriterion("zzmm is null");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNotNull() {
            addCriterion("zzmm is not null");
            return (Criteria) this;
        }

        public Criteria andZzmmEqualTo(String value) {
            addCriterion("zzmm =", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotEqualTo(String value) {
            addCriterion("zzmm <>", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThan(String value) {
            addCriterion("zzmm >", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThanOrEqualTo(String value) {
            addCriterion("zzmm >=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThan(String value) {
            addCriterion("zzmm <", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThanOrEqualTo(String value) {
            addCriterion("zzmm <=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLike(String value) {
            addCriterion("zzmm like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotLike(String value) {
            addCriterion("zzmm not like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmIn(List<String> values) {
            addCriterion("zzmm in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotIn(List<String> values) {
            addCriterion("zzmm not in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmBetween(String value1, String value2) {
            addCriterion("zzmm between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotBetween(String value1, String value2) {
            addCriterion("zzmm not between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZxdmIsNull() {
            addCriterion("zxdm is null");
            return (Criteria) this;
        }

        public Criteria andZxdmIsNotNull() {
            addCriterion("zxdm is not null");
            return (Criteria) this;
        }

        public Criteria andZxdmEqualTo(String value) {
            addCriterion("zxdm =", value, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmNotEqualTo(String value) {
            addCriterion("zxdm <>", value, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmGreaterThan(String value) {
            addCriterion("zxdm >", value, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmGreaterThanOrEqualTo(String value) {
            addCriterion("zxdm >=", value, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmLessThan(String value) {
            addCriterion("zxdm <", value, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmLessThanOrEqualTo(String value) {
            addCriterion("zxdm <=", value, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmLike(String value) {
            addCriterion("zxdm like", value, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmNotLike(String value) {
            addCriterion("zxdm not like", value, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmIn(List<String> values) {
            addCriterion("zxdm in", values, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmNotIn(List<String> values) {
            addCriterion("zxdm not in", values, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmBetween(String value1, String value2) {
            addCriterion("zxdm between", value1, value2, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmNotBetween(String value1, String value2) {
            addCriterion("zxdm not between", value1, value2, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxmcIsNull() {
            addCriterion("zxmc is null");
            return (Criteria) this;
        }

        public Criteria andZxmcIsNotNull() {
            addCriterion("zxmc is not null");
            return (Criteria) this;
        }

        public Criteria andZxmcEqualTo(String value) {
            addCriterion("zxmc =", value, "zxmc");
            return (Criteria) this;
        }

        public Criteria andZxmcNotEqualTo(String value) {
            addCriterion("zxmc <>", value, "zxmc");
            return (Criteria) this;
        }

        public Criteria andZxmcGreaterThan(String value) {
            addCriterion("zxmc >", value, "zxmc");
            return (Criteria) this;
        }

        public Criteria andZxmcGreaterThanOrEqualTo(String value) {
            addCriterion("zxmc >=", value, "zxmc");
            return (Criteria) this;
        }

        public Criteria andZxmcLessThan(String value) {
            addCriterion("zxmc <", value, "zxmc");
            return (Criteria) this;
        }

        public Criteria andZxmcLessThanOrEqualTo(String value) {
            addCriterion("zxmc <=", value, "zxmc");
            return (Criteria) this;
        }

        public Criteria andZxmcLike(String value) {
            addCriterion("zxmc like", value, "zxmc");
            return (Criteria) this;
        }

        public Criteria andZxmcNotLike(String value) {
            addCriterion("zxmc not like", value, "zxmc");
            return (Criteria) this;
        }

        public Criteria andZxmcIn(List<String> values) {
            addCriterion("zxmc in", values, "zxmc");
            return (Criteria) this;
        }

        public Criteria andZxmcNotIn(List<String> values) {
            addCriterion("zxmc not in", values, "zxmc");
            return (Criteria) this;
        }

        public Criteria andZxmcBetween(String value1, String value2) {
            addCriterion("zxmc between", value1, value2, "zxmc");
            return (Criteria) this;
        }

        public Criteria andZxmcNotBetween(String value1, String value2) {
            addCriterion("zxmc not between", value1, value2, "zxmc");
            return (Criteria) this;
        }

        public Criteria andBylbdmIsNull() {
            addCriterion("bylbdm is null");
            return (Criteria) this;
        }

        public Criteria andBylbdmIsNotNull() {
            addCriterion("bylbdm is not null");
            return (Criteria) this;
        }

        public Criteria andBylbdmEqualTo(String value) {
            addCriterion("bylbdm =", value, "bylbdm");
            return (Criteria) this;
        }

        public Criteria andBylbdmNotEqualTo(String value) {
            addCriterion("bylbdm <>", value, "bylbdm");
            return (Criteria) this;
        }

        public Criteria andBylbdmGreaterThan(String value) {
            addCriterion("bylbdm >", value, "bylbdm");
            return (Criteria) this;
        }

        public Criteria andBylbdmGreaterThanOrEqualTo(String value) {
            addCriterion("bylbdm >=", value, "bylbdm");
            return (Criteria) this;
        }

        public Criteria andBylbdmLessThan(String value) {
            addCriterion("bylbdm <", value, "bylbdm");
            return (Criteria) this;
        }

        public Criteria andBylbdmLessThanOrEqualTo(String value) {
            addCriterion("bylbdm <=", value, "bylbdm");
            return (Criteria) this;
        }

        public Criteria andBylbdmLike(String value) {
            addCriterion("bylbdm like", value, "bylbdm");
            return (Criteria) this;
        }

        public Criteria andBylbdmNotLike(String value) {
            addCriterion("bylbdm not like", value, "bylbdm");
            return (Criteria) this;
        }

        public Criteria andBylbdmIn(List<String> values) {
            addCriterion("bylbdm in", values, "bylbdm");
            return (Criteria) this;
        }

        public Criteria andBylbdmNotIn(List<String> values) {
            addCriterion("bylbdm not in", values, "bylbdm");
            return (Criteria) this;
        }

        public Criteria andBylbdmBetween(String value1, String value2) {
            addCriterion("bylbdm between", value1, value2, "bylbdm");
            return (Criteria) this;
        }

        public Criteria andBylbdmNotBetween(String value1, String value2) {
            addCriterion("bylbdm not between", value1, value2, "bylbdm");
            return (Criteria) this;
        }

        public Criteria andJtdzIsNull() {
            addCriterion("jtdz is null");
            return (Criteria) this;
        }

        public Criteria andJtdzIsNotNull() {
            addCriterion("jtdz is not null");
            return (Criteria) this;
        }

        public Criteria andJtdzEqualTo(String value) {
            addCriterion("jtdz =", value, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzNotEqualTo(String value) {
            addCriterion("jtdz <>", value, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzGreaterThan(String value) {
            addCriterion("jtdz >", value, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzGreaterThanOrEqualTo(String value) {
            addCriterion("jtdz >=", value, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzLessThan(String value) {
            addCriterion("jtdz <", value, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzLessThanOrEqualTo(String value) {
            addCriterion("jtdz <=", value, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzLike(String value) {
            addCriterion("jtdz like", value, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzNotLike(String value) {
            addCriterion("jtdz not like", value, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzIn(List<String> values) {
            addCriterion("jtdz in", values, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzNotIn(List<String> values) {
            addCriterion("jtdz not in", values, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzBetween(String value1, String value2) {
            addCriterion("jtdz between", value1, value2, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzNotBetween(String value1, String value2) {
            addCriterion("jtdz not between", value1, value2, "jtdz");
            return (Criteria) this;
        }

        public Criteria andYzbmIsNull() {
            addCriterion("yzbm is null");
            return (Criteria) this;
        }

        public Criteria andYzbmIsNotNull() {
            addCriterion("yzbm is not null");
            return (Criteria) this;
        }

        public Criteria andYzbmEqualTo(String value) {
            addCriterion("yzbm =", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotEqualTo(String value) {
            addCriterion("yzbm <>", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmGreaterThan(String value) {
            addCriterion("yzbm >", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmGreaterThanOrEqualTo(String value) {
            addCriterion("yzbm >=", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLessThan(String value) {
            addCriterion("yzbm <", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLessThanOrEqualTo(String value) {
            addCriterion("yzbm <=", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLike(String value) {
            addCriterion("yzbm like", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotLike(String value) {
            addCriterion("yzbm not like", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmIn(List<String> values) {
            addCriterion("yzbm in", values, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotIn(List<String> values) {
            addCriterion("yzbm not in", values, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmBetween(String value1, String value2) {
            addCriterion("yzbm between", value1, value2, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotBetween(String value1, String value2) {
            addCriterion("yzbm not between", value1, value2, "yzbm");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNull() {
            addCriterion("lxdh is null");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNotNull() {
            addCriterion("lxdh is not null");
            return (Criteria) this;
        }

        public Criteria andLxdhEqualTo(String value) {
            addCriterion("lxdh =", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotEqualTo(String value) {
            addCriterion("lxdh <>", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThan(String value) {
            addCriterion("lxdh >", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThanOrEqualTo(String value) {
            addCriterion("lxdh >=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThan(String value) {
            addCriterion("lxdh <", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThanOrEqualTo(String value) {
            addCriterion("lxdh <=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLike(String value) {
            addCriterion("lxdh like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotLike(String value) {
            addCriterion("lxdh not like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhIn(List<String> values) {
            addCriterion("lxdh in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotIn(List<String> values) {
            addCriterion("lxdh not in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhBetween(String value1, String value2) {
            addCriterion("lxdh between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotBetween(String value1, String value2) {
            addCriterion("lxdh not between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andHkkhIsNull() {
            addCriterion("hkkh is null");
            return (Criteria) this;
        }

        public Criteria andHkkhIsNotNull() {
            addCriterion("hkkh is not null");
            return (Criteria) this;
        }

        public Criteria andHkkhEqualTo(String value) {
            addCriterion("hkkh =", value, "hkkh");
            return (Criteria) this;
        }

        public Criteria andHkkhNotEqualTo(String value) {
            addCriterion("hkkh <>", value, "hkkh");
            return (Criteria) this;
        }

        public Criteria andHkkhGreaterThan(String value) {
            addCriterion("hkkh >", value, "hkkh");
            return (Criteria) this;
        }

        public Criteria andHkkhGreaterThanOrEqualTo(String value) {
            addCriterion("hkkh >=", value, "hkkh");
            return (Criteria) this;
        }

        public Criteria andHkkhLessThan(String value) {
            addCriterion("hkkh <", value, "hkkh");
            return (Criteria) this;
        }

        public Criteria andHkkhLessThanOrEqualTo(String value) {
            addCriterion("hkkh <=", value, "hkkh");
            return (Criteria) this;
        }

        public Criteria andHkkhLike(String value) {
            addCriterion("hkkh like", value, "hkkh");
            return (Criteria) this;
        }

        public Criteria andHkkhNotLike(String value) {
            addCriterion("hkkh not like", value, "hkkh");
            return (Criteria) this;
        }

        public Criteria andHkkhIn(List<String> values) {
            addCriterion("hkkh in", values, "hkkh");
            return (Criteria) this;
        }

        public Criteria andHkkhNotIn(List<String> values) {
            addCriterion("hkkh not in", values, "hkkh");
            return (Criteria) this;
        }

        public Criteria andHkkhBetween(String value1, String value2) {
            addCriterion("hkkh between", value1, value2, "hkkh");
            return (Criteria) this;
        }

        public Criteria andHkkhNotBetween(String value1, String value2) {
            addCriterion("hkkh not between", value1, value2, "hkkh");
            return (Criteria) this;
        }

        public Criteria andKstcIsNull() {
            addCriterion("kstc is null");
            return (Criteria) this;
        }

        public Criteria andKstcIsNotNull() {
            addCriterion("kstc is not null");
            return (Criteria) this;
        }

        public Criteria andKstcEqualTo(String value) {
            addCriterion("kstc =", value, "kstc");
            return (Criteria) this;
        }

        public Criteria andKstcNotEqualTo(String value) {
            addCriterion("kstc <>", value, "kstc");
            return (Criteria) this;
        }

        public Criteria andKstcGreaterThan(String value) {
            addCriterion("kstc >", value, "kstc");
            return (Criteria) this;
        }

        public Criteria andKstcGreaterThanOrEqualTo(String value) {
            addCriterion("kstc >=", value, "kstc");
            return (Criteria) this;
        }

        public Criteria andKstcLessThan(String value) {
            addCriterion("kstc <", value, "kstc");
            return (Criteria) this;
        }

        public Criteria andKstcLessThanOrEqualTo(String value) {
            addCriterion("kstc <=", value, "kstc");
            return (Criteria) this;
        }

        public Criteria andKstcLike(String value) {
            addCriterion("kstc like", value, "kstc");
            return (Criteria) this;
        }

        public Criteria andKstcNotLike(String value) {
            addCriterion("kstc not like", value, "kstc");
            return (Criteria) this;
        }

        public Criteria andKstcIn(List<String> values) {
            addCriterion("kstc in", values, "kstc");
            return (Criteria) this;
        }

        public Criteria andKstcNotIn(List<String> values) {
            addCriterion("kstc not in", values, "kstc");
            return (Criteria) this;
        }

        public Criteria andKstcBetween(String value1, String value2) {
            addCriterion("kstc between", value1, value2, "kstc");
            return (Criteria) this;
        }

        public Criteria andKstcNotBetween(String value1, String value2) {
            addCriterion("kstc not between", value1, value2, "kstc");
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

        public Criteria andKsjlhcfIsNull() {
            addCriterion("ksjlhcf is null");
            return (Criteria) this;
        }

        public Criteria andKsjlhcfIsNotNull() {
            addCriterion("ksjlhcf is not null");
            return (Criteria) this;
        }

        public Criteria andKsjlhcfEqualTo(String value) {
            addCriterion("ksjlhcf =", value, "ksjlhcf");
            return (Criteria) this;
        }

        public Criteria andKsjlhcfNotEqualTo(String value) {
            addCriterion("ksjlhcf <>", value, "ksjlhcf");
            return (Criteria) this;
        }

        public Criteria andKsjlhcfGreaterThan(String value) {
            addCriterion("ksjlhcf >", value, "ksjlhcf");
            return (Criteria) this;
        }

        public Criteria andKsjlhcfGreaterThanOrEqualTo(String value) {
            addCriterion("ksjlhcf >=", value, "ksjlhcf");
            return (Criteria) this;
        }

        public Criteria andKsjlhcfLessThan(String value) {
            addCriterion("ksjlhcf <", value, "ksjlhcf");
            return (Criteria) this;
        }

        public Criteria andKsjlhcfLessThanOrEqualTo(String value) {
            addCriterion("ksjlhcf <=", value, "ksjlhcf");
            return (Criteria) this;
        }

        public Criteria andKsjlhcfLike(String value) {
            addCriterion("ksjlhcf like", value, "ksjlhcf");
            return (Criteria) this;
        }

        public Criteria andKsjlhcfNotLike(String value) {
            addCriterion("ksjlhcf not like", value, "ksjlhcf");
            return (Criteria) this;
        }

        public Criteria andKsjlhcfIn(List<String> values) {
            addCriterion("ksjlhcf in", values, "ksjlhcf");
            return (Criteria) this;
        }

        public Criteria andKsjlhcfNotIn(List<String> values) {
            addCriterion("ksjlhcf not in", values, "ksjlhcf");
            return (Criteria) this;
        }

        public Criteria andKsjlhcfBetween(String value1, String value2) {
            addCriterion("ksjlhcf between", value1, value2, "ksjlhcf");
            return (Criteria) this;
        }

        public Criteria andKsjlhcfNotBetween(String value1, String value2) {
            addCriterion("ksjlhcf not between", value1, value2, "ksjlhcf");
            return (Criteria) this;
        }

        public Criteria andZpIsNull() {
            addCriterion("zp is null");
            return (Criteria) this;
        }

        public Criteria andZpIsNotNull() {
            addCriterion("zp is not null");
            return (Criteria) this;
        }

        public Criteria andZpEqualTo(String value) {
            addCriterion("zp =", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpNotEqualTo(String value) {
            addCriterion("zp <>", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpGreaterThan(String value) {
            addCriterion("zp >", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpGreaterThanOrEqualTo(String value) {
            addCriterion("zp >=", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpLessThan(String value) {
            addCriterion("zp <", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpLessThanOrEqualTo(String value) {
            addCriterion("zp <=", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpLike(String value) {
            addCriterion("zp like", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpNotLike(String value) {
            addCriterion("zp not like", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpIn(List<String> values) {
            addCriterion("zp in", values, "zp");
            return (Criteria) this;
        }

        public Criteria andZpNotIn(List<String> values) {
            addCriterion("zp not in", values, "zp");
            return (Criteria) this;
        }

        public Criteria andZpBetween(String value1, String value2) {
            addCriterion("zp between", value1, value2, "zp");
            return (Criteria) this;
        }

        public Criteria andZpNotBetween(String value1, String value2) {
            addCriterion("zp not between", value1, value2, "zp");
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

        public Criteria andZkzhIsNull() {
            addCriterion("zkzh is null");
            return (Criteria) this;
        }

        public Criteria andZkzhIsNotNull() {
            addCriterion("zkzh is not null");
            return (Criteria) this;
        }

        public Criteria andZkzhEqualTo(String value) {
            addCriterion("zkzh =", value, "zkzh");
            return (Criteria) this;
        }

        public Criteria andZkzhNotEqualTo(String value) {
            addCriterion("zkzh <>", value, "zkzh");
            return (Criteria) this;
        }

        public Criteria andZkzhGreaterThan(String value) {
            addCriterion("zkzh >", value, "zkzh");
            return (Criteria) this;
        }

        public Criteria andZkzhGreaterThanOrEqualTo(String value) {
            addCriterion("zkzh >=", value, "zkzh");
            return (Criteria) this;
        }

        public Criteria andZkzhLessThan(String value) {
            addCriterion("zkzh <", value, "zkzh");
            return (Criteria) this;
        }

        public Criteria andZkzhLessThanOrEqualTo(String value) {
            addCriterion("zkzh <=", value, "zkzh");
            return (Criteria) this;
        }

        public Criteria andZkzhLike(String value) {
            addCriterion("zkzh like", value, "zkzh");
            return (Criteria) this;
        }

        public Criteria andZkzhNotLike(String value) {
            addCriterion("zkzh not like", value, "zkzh");
            return (Criteria) this;
        }

        public Criteria andZkzhIn(List<String> values) {
            addCriterion("zkzh in", values, "zkzh");
            return (Criteria) this;
        }

        public Criteria andZkzhNotIn(List<String> values) {
            addCriterion("zkzh not in", values, "zkzh");
            return (Criteria) this;
        }

        public Criteria andZkzhBetween(String value1, String value2) {
            addCriterion("zkzh between", value1, value2, "zkzh");
            return (Criteria) this;
        }

        public Criteria andZkzhNotBetween(String value1, String value2) {
            addCriterion("zkzh not between", value1, value2, "zkzh");
            return (Criteria) this;
        }

        public Criteria andKldmIsNull() {
            addCriterion("kldm is null");
            return (Criteria) this;
        }

        public Criteria andKldmIsNotNull() {
            addCriterion("kldm is not null");
            return (Criteria) this;
        }

        public Criteria andKldmEqualTo(String value) {
            addCriterion("kldm =", value, "kldm");
            return (Criteria) this;
        }

        public Criteria andKldmNotEqualTo(String value) {
            addCriterion("kldm <>", value, "kldm");
            return (Criteria) this;
        }

        public Criteria andKldmGreaterThan(String value) {
            addCriterion("kldm >", value, "kldm");
            return (Criteria) this;
        }

        public Criteria andKldmGreaterThanOrEqualTo(String value) {
            addCriterion("kldm >=", value, "kldm");
            return (Criteria) this;
        }

        public Criteria andKldmLessThan(String value) {
            addCriterion("kldm <", value, "kldm");
            return (Criteria) this;
        }

        public Criteria andKldmLessThanOrEqualTo(String value) {
            addCriterion("kldm <=", value, "kldm");
            return (Criteria) this;
        }

        public Criteria andKldmLike(String value) {
            addCriterion("kldm like", value, "kldm");
            return (Criteria) this;
        }

        public Criteria andKldmNotLike(String value) {
            addCriterion("kldm not like", value, "kldm");
            return (Criteria) this;
        }

        public Criteria andKldmIn(List<String> values) {
            addCriterion("kldm in", values, "kldm");
            return (Criteria) this;
        }

        public Criteria andKldmNotIn(List<String> values) {
            addCriterion("kldm not in", values, "kldm");
            return (Criteria) this;
        }

        public Criteria andKldmBetween(String value1, String value2) {
            addCriterion("kldm between", value1, value2, "kldm");
            return (Criteria) this;
        }

        public Criteria andKldmNotBetween(String value1, String value2) {
            addCriterion("kldm not between", value1, value2, "kldm");
            return (Criteria) this;
        }

        public Criteria andKsklIsNull() {
            addCriterion("kskl is null");
            return (Criteria) this;
        }

        public Criteria andKsklIsNotNull() {
            addCriterion("kskl is not null");
            return (Criteria) this;
        }

        public Criteria andKsklEqualTo(String value) {
            addCriterion("kskl =", value, "kskl");
            return (Criteria) this;
        }

        public Criteria andKsklNotEqualTo(String value) {
            addCriterion("kskl <>", value, "kskl");
            return (Criteria) this;
        }

        public Criteria andKsklGreaterThan(String value) {
            addCriterion("kskl >", value, "kskl");
            return (Criteria) this;
        }

        public Criteria andKsklGreaterThanOrEqualTo(String value) {
            addCriterion("kskl >=", value, "kskl");
            return (Criteria) this;
        }

        public Criteria andKsklLessThan(String value) {
            addCriterion("kskl <", value, "kskl");
            return (Criteria) this;
        }

        public Criteria andKsklLessThanOrEqualTo(String value) {
            addCriterion("kskl <=", value, "kskl");
            return (Criteria) this;
        }

        public Criteria andKsklLike(String value) {
            addCriterion("kskl like", value, "kskl");
            return (Criteria) this;
        }

        public Criteria andKsklNotLike(String value) {
            addCriterion("kskl not like", value, "kskl");
            return (Criteria) this;
        }

        public Criteria andKsklIn(List<String> values) {
            addCriterion("kskl in", values, "kskl");
            return (Criteria) this;
        }

        public Criteria andKsklNotIn(List<String> values) {
            addCriterion("kskl not in", values, "kskl");
            return (Criteria) this;
        }

        public Criteria andKsklBetween(String value1, String value2) {
            addCriterion("kskl between", value1, value2, "kskl");
            return (Criteria) this;
        }

        public Criteria andKsklNotBetween(String value1, String value2) {
            addCriterion("kskl not between", value1, value2, "kskl");
            return (Criteria) this;
        }

        public Criteria andKslbdmIsNull() {
            addCriterion("kslbdm is null");
            return (Criteria) this;
        }

        public Criteria andKslbdmIsNotNull() {
            addCriterion("kslbdm is not null");
            return (Criteria) this;
        }

        public Criteria andKslbdmEqualTo(String value) {
            addCriterion("kslbdm =", value, "kslbdm");
            return (Criteria) this;
        }

        public Criteria andKslbdmNotEqualTo(String value) {
            addCriterion("kslbdm <>", value, "kslbdm");
            return (Criteria) this;
        }

        public Criteria andKslbdmGreaterThan(String value) {
            addCriterion("kslbdm >", value, "kslbdm");
            return (Criteria) this;
        }

        public Criteria andKslbdmGreaterThanOrEqualTo(String value) {
            addCriterion("kslbdm >=", value, "kslbdm");
            return (Criteria) this;
        }

        public Criteria andKslbdmLessThan(String value) {
            addCriterion("kslbdm <", value, "kslbdm");
            return (Criteria) this;
        }

        public Criteria andKslbdmLessThanOrEqualTo(String value) {
            addCriterion("kslbdm <=", value, "kslbdm");
            return (Criteria) this;
        }

        public Criteria andKslbdmLike(String value) {
            addCriterion("kslbdm like", value, "kslbdm");
            return (Criteria) this;
        }

        public Criteria andKslbdmNotLike(String value) {
            addCriterion("kslbdm not like", value, "kslbdm");
            return (Criteria) this;
        }

        public Criteria andKslbdmIn(List<String> values) {
            addCriterion("kslbdm in", values, "kslbdm");
            return (Criteria) this;
        }

        public Criteria andKslbdmNotIn(List<String> values) {
            addCriterion("kslbdm not in", values, "kslbdm");
            return (Criteria) this;
        }

        public Criteria andKslbdmBetween(String value1, String value2) {
            addCriterion("kslbdm between", value1, value2, "kslbdm");
            return (Criteria) this;
        }

        public Criteria andKslbdmNotBetween(String value1, String value2) {
            addCriterion("kslbdm not between", value1, value2, "kslbdm");
            return (Criteria) this;
        }

        public Criteria andKslbIsNull() {
            addCriterion("kslb is null");
            return (Criteria) this;
        }

        public Criteria andKslbIsNotNull() {
            addCriterion("kslb is not null");
            return (Criteria) this;
        }

        public Criteria andKslbEqualTo(String value) {
            addCriterion("kslb =", value, "kslb");
            return (Criteria) this;
        }

        public Criteria andKslbNotEqualTo(String value) {
            addCriterion("kslb <>", value, "kslb");
            return (Criteria) this;
        }

        public Criteria andKslbGreaterThan(String value) {
            addCriterion("kslb >", value, "kslb");
            return (Criteria) this;
        }

        public Criteria andKslbGreaterThanOrEqualTo(String value) {
            addCriterion("kslb >=", value, "kslb");
            return (Criteria) this;
        }

        public Criteria andKslbLessThan(String value) {
            addCriterion("kslb <", value, "kslb");
            return (Criteria) this;
        }

        public Criteria andKslbLessThanOrEqualTo(String value) {
            addCriterion("kslb <=", value, "kslb");
            return (Criteria) this;
        }

        public Criteria andKslbLike(String value) {
            addCriterion("kslb like", value, "kslb");
            return (Criteria) this;
        }

        public Criteria andKslbNotLike(String value) {
            addCriterion("kslb not like", value, "kslb");
            return (Criteria) this;
        }

        public Criteria andKslbIn(List<String> values) {
            addCriterion("kslb in", values, "kslb");
            return (Criteria) this;
        }

        public Criteria andKslbNotIn(List<String> values) {
            addCriterion("kslb not in", values, "kslb");
            return (Criteria) this;
        }

        public Criteria andKslbBetween(String value1, String value2) {
            addCriterion("kslb between", value1, value2, "kslb");
            return (Criteria) this;
        }

        public Criteria andKslbNotBetween(String value1, String value2) {
            addCriterion("kslb not between", value1, value2, "kslb");
            return (Criteria) this;
        }

        public Criteria andKslxdmIsNull() {
            addCriterion("kslxdm is null");
            return (Criteria) this;
        }

        public Criteria andKslxdmIsNotNull() {
            addCriterion("kslxdm is not null");
            return (Criteria) this;
        }

        public Criteria andKslxdmEqualTo(String value) {
            addCriterion("kslxdm =", value, "kslxdm");
            return (Criteria) this;
        }

        public Criteria andKslxdmNotEqualTo(String value) {
            addCriterion("kslxdm <>", value, "kslxdm");
            return (Criteria) this;
        }

        public Criteria andKslxdmGreaterThan(String value) {
            addCriterion("kslxdm >", value, "kslxdm");
            return (Criteria) this;
        }

        public Criteria andKslxdmGreaterThanOrEqualTo(String value) {
            addCriterion("kslxdm >=", value, "kslxdm");
            return (Criteria) this;
        }

        public Criteria andKslxdmLessThan(String value) {
            addCriterion("kslxdm <", value, "kslxdm");
            return (Criteria) this;
        }

        public Criteria andKslxdmLessThanOrEqualTo(String value) {
            addCriterion("kslxdm <=", value, "kslxdm");
            return (Criteria) this;
        }

        public Criteria andKslxdmLike(String value) {
            addCriterion("kslxdm like", value, "kslxdm");
            return (Criteria) this;
        }

        public Criteria andKslxdmNotLike(String value) {
            addCriterion("kslxdm not like", value, "kslxdm");
            return (Criteria) this;
        }

        public Criteria andKslxdmIn(List<String> values) {
            addCriterion("kslxdm in", values, "kslxdm");
            return (Criteria) this;
        }

        public Criteria andKslxdmNotIn(List<String> values) {
            addCriterion("kslxdm not in", values, "kslxdm");
            return (Criteria) this;
        }

        public Criteria andKslxdmBetween(String value1, String value2) {
            addCriterion("kslxdm between", value1, value2, "kslxdm");
            return (Criteria) this;
        }

        public Criteria andKslxdmNotBetween(String value1, String value2) {
            addCriterion("kslxdm not between", value1, value2, "kslxdm");
            return (Criteria) this;
        }

        public Criteria andZhfIsNull() {
            addCriterion("zhf is null");
            return (Criteria) this;
        }

        public Criteria andZhfIsNotNull() {
            addCriterion("zhf is not null");
            return (Criteria) this;
        }

        public Criteria andZhfEqualTo(Double value) {
            addCriterion("zhf =", value, "zhf");
            return (Criteria) this;
        }

        public Criteria andZhfNotEqualTo(Double value) {
            addCriterion("zhf <>", value, "zhf");
            return (Criteria) this;
        }

        public Criteria andZhfGreaterThan(Double value) {
            addCriterion("zhf >", value, "zhf");
            return (Criteria) this;
        }

        public Criteria andZhfGreaterThanOrEqualTo(Double value) {
            addCriterion("zhf >=", value, "zhf");
            return (Criteria) this;
        }

        public Criteria andZhfLessThan(Double value) {
            addCriterion("zhf <", value, "zhf");
            return (Criteria) this;
        }

        public Criteria andZhfLessThanOrEqualTo(Double value) {
            addCriterion("zhf <=", value, "zhf");
            return (Criteria) this;
        }

        public Criteria andZhfIn(List<Double> values) {
            addCriterion("zhf in", values, "zhf");
            return (Criteria) this;
        }

        public Criteria andZhfNotIn(List<Double> values) {
            addCriterion("zhf not in", values, "zhf");
            return (Criteria) this;
        }

        public Criteria andZhfBetween(Double value1, Double value2) {
            addCriterion("zhf between", value1, value2, "zhf");
            return (Criteria) this;
        }

        public Criteria andZhfNotBetween(Double value1, Double value2) {
            addCriterion("zhf not between", value1, value2, "zhf");
            return (Criteria) this;
        }

        public Criteria andZyfIsNull() {
            addCriterion("zyf is null");
            return (Criteria) this;
        }

        public Criteria andZyfIsNotNull() {
            addCriterion("zyf is not null");
            return (Criteria) this;
        }

        public Criteria andZyfEqualTo(Double value) {
            addCriterion("zyf =", value, "zyf");
            return (Criteria) this;
        }

        public Criteria andZyfNotEqualTo(Double value) {
            addCriterion("zyf <>", value, "zyf");
            return (Criteria) this;
        }

        public Criteria andZyfGreaterThan(Double value) {
            addCriterion("zyf >", value, "zyf");
            return (Criteria) this;
        }

        public Criteria andZyfGreaterThanOrEqualTo(Double value) {
            addCriterion("zyf >=", value, "zyf");
            return (Criteria) this;
        }

        public Criteria andZyfLessThan(Double value) {
            addCriterion("zyf <", value, "zyf");
            return (Criteria) this;
        }

        public Criteria andZyfLessThanOrEqualTo(Double value) {
            addCriterion("zyf <=", value, "zyf");
            return (Criteria) this;
        }

        public Criteria andZyfIn(List<Double> values) {
            addCriterion("zyf in", values, "zyf");
            return (Criteria) this;
        }

        public Criteria andZyfNotIn(List<Double> values) {
            addCriterion("zyf not in", values, "zyf");
            return (Criteria) this;
        }

        public Criteria andZyfBetween(Double value1, Double value2) {
            addCriterion("zyf between", value1, value2, "zyf");
            return (Criteria) this;
        }

        public Criteria andZyfNotBetween(Double value1, Double value2) {
            addCriterion("zyf not between", value1, value2, "zyf");
            return (Criteria) this;
        }

        public Criteria andYuwIsNull() {
            addCriterion("yuw is null");
            return (Criteria) this;
        }

        public Criteria andYuwIsNotNull() {
            addCriterion("yuw is not null");
            return (Criteria) this;
        }

        public Criteria andYuwEqualTo(Double value) {
            addCriterion("yuw =", value, "yuw");
            return (Criteria) this;
        }

        public Criteria andYuwNotEqualTo(Double value) {
            addCriterion("yuw <>", value, "yuw");
            return (Criteria) this;
        }

        public Criteria andYuwGreaterThan(Double value) {
            addCriterion("yuw >", value, "yuw");
            return (Criteria) this;
        }

        public Criteria andYuwGreaterThanOrEqualTo(Double value) {
            addCriterion("yuw >=", value, "yuw");
            return (Criteria) this;
        }

        public Criteria andYuwLessThan(Double value) {
            addCriterion("yuw <", value, "yuw");
            return (Criteria) this;
        }

        public Criteria andYuwLessThanOrEqualTo(Double value) {
            addCriterion("yuw <=", value, "yuw");
            return (Criteria) this;
        }

        public Criteria andYuwIn(List<Double> values) {
            addCriterion("yuw in", values, "yuw");
            return (Criteria) this;
        }

        public Criteria andYuwNotIn(List<Double> values) {
            addCriterion("yuw not in", values, "yuw");
            return (Criteria) this;
        }

        public Criteria andYuwBetween(Double value1, Double value2) {
            addCriterion("yuw between", value1, value2, "yuw");
            return (Criteria) this;
        }

        public Criteria andYuwNotBetween(Double value1, Double value2) {
            addCriterion("yuw not between", value1, value2, "yuw");
            return (Criteria) this;
        }

        public Criteria andShuxIsNull() {
            addCriterion("shux is null");
            return (Criteria) this;
        }

        public Criteria andShuxIsNotNull() {
            addCriterion("shux is not null");
            return (Criteria) this;
        }

        public Criteria andShuxEqualTo(Double value) {
            addCriterion("shux =", value, "shux");
            return (Criteria) this;
        }

        public Criteria andShuxNotEqualTo(Double value) {
            addCriterion("shux <>", value, "shux");
            return (Criteria) this;
        }

        public Criteria andShuxGreaterThan(Double value) {
            addCriterion("shux >", value, "shux");
            return (Criteria) this;
        }

        public Criteria andShuxGreaterThanOrEqualTo(Double value) {
            addCriterion("shux >=", value, "shux");
            return (Criteria) this;
        }

        public Criteria andShuxLessThan(Double value) {
            addCriterion("shux <", value, "shux");
            return (Criteria) this;
        }

        public Criteria andShuxLessThanOrEqualTo(Double value) {
            addCriterion("shux <=", value, "shux");
            return (Criteria) this;
        }

        public Criteria andShuxIn(List<Double> values) {
            addCriterion("shux in", values, "shux");
            return (Criteria) this;
        }

        public Criteria andShuxNotIn(List<Double> values) {
            addCriterion("shux not in", values, "shux");
            return (Criteria) this;
        }

        public Criteria andShuxBetween(Double value1, Double value2) {
            addCriterion("shux between", value1, value2, "shux");
            return (Criteria) this;
        }

        public Criteria andShuxNotBetween(Double value1, Double value2) {
            addCriterion("shux not between", value1, value2, "shux");
            return (Criteria) this;
        }

        public Criteria andWaiyIsNull() {
            addCriterion("waiy is null");
            return (Criteria) this;
        }

        public Criteria andWaiyIsNotNull() {
            addCriterion("waiy is not null");
            return (Criteria) this;
        }

        public Criteria andWaiyEqualTo(Double value) {
            addCriterion("waiy =", value, "waiy");
            return (Criteria) this;
        }

        public Criteria andWaiyNotEqualTo(Double value) {
            addCriterion("waiy <>", value, "waiy");
            return (Criteria) this;
        }

        public Criteria andWaiyGreaterThan(Double value) {
            addCriterion("waiy >", value, "waiy");
            return (Criteria) this;
        }

        public Criteria andWaiyGreaterThanOrEqualTo(Double value) {
            addCriterion("waiy >=", value, "waiy");
            return (Criteria) this;
        }

        public Criteria andWaiyLessThan(Double value) {
            addCriterion("waiy <", value, "waiy");
            return (Criteria) this;
        }

        public Criteria andWaiyLessThanOrEqualTo(Double value) {
            addCriterion("waiy <=", value, "waiy");
            return (Criteria) this;
        }

        public Criteria andWaiyIn(List<Double> values) {
            addCriterion("waiy in", values, "waiy");
            return (Criteria) this;
        }

        public Criteria andWaiyNotIn(List<Double> values) {
            addCriterion("waiy not in", values, "waiy");
            return (Criteria) this;
        }

        public Criteria andWaiyBetween(Double value1, Double value2) {
            addCriterion("waiy between", value1, value2, "waiy");
            return (Criteria) this;
        }

        public Criteria andWaiyNotBetween(Double value1, Double value2) {
            addCriterion("waiy not between", value1, value2, "waiy");
            return (Criteria) this;
        }

        public Criteria andWulIsNull() {
            addCriterion("wul is null");
            return (Criteria) this;
        }

        public Criteria andWulIsNotNull() {
            addCriterion("wul is not null");
            return (Criteria) this;
        }

        public Criteria andWulEqualTo(Double value) {
            addCriterion("wul =", value, "wul");
            return (Criteria) this;
        }

        public Criteria andWulNotEqualTo(Double value) {
            addCriterion("wul <>", value, "wul");
            return (Criteria) this;
        }

        public Criteria andWulGreaterThan(Double value) {
            addCriterion("wul >", value, "wul");
            return (Criteria) this;
        }

        public Criteria andWulGreaterThanOrEqualTo(Double value) {
            addCriterion("wul >=", value, "wul");
            return (Criteria) this;
        }

        public Criteria andWulLessThan(Double value) {
            addCriterion("wul <", value, "wul");
            return (Criteria) this;
        }

        public Criteria andWulLessThanOrEqualTo(Double value) {
            addCriterion("wul <=", value, "wul");
            return (Criteria) this;
        }

        public Criteria andWulIn(List<Double> values) {
            addCriterion("wul in", values, "wul");
            return (Criteria) this;
        }

        public Criteria andWulNotIn(List<Double> values) {
            addCriterion("wul not in", values, "wul");
            return (Criteria) this;
        }

        public Criteria andWulBetween(Double value1, Double value2) {
            addCriterion("wul between", value1, value2, "wul");
            return (Criteria) this;
        }

        public Criteria andWulNotBetween(Double value1, Double value2) {
            addCriterion("wul not between", value1, value2, "wul");
            return (Criteria) this;
        }

        public Criteria andHuaxIsNull() {
            addCriterion("huax is null");
            return (Criteria) this;
        }

        public Criteria andHuaxIsNotNull() {
            addCriterion("huax is not null");
            return (Criteria) this;
        }

        public Criteria andHuaxEqualTo(Double value) {
            addCriterion("huax =", value, "huax");
            return (Criteria) this;
        }

        public Criteria andHuaxNotEqualTo(Double value) {
            addCriterion("huax <>", value, "huax");
            return (Criteria) this;
        }

        public Criteria andHuaxGreaterThan(Double value) {
            addCriterion("huax >", value, "huax");
            return (Criteria) this;
        }

        public Criteria andHuaxGreaterThanOrEqualTo(Double value) {
            addCriterion("huax >=", value, "huax");
            return (Criteria) this;
        }

        public Criteria andHuaxLessThan(Double value) {
            addCriterion("huax <", value, "huax");
            return (Criteria) this;
        }

        public Criteria andHuaxLessThanOrEqualTo(Double value) {
            addCriterion("huax <=", value, "huax");
            return (Criteria) this;
        }

        public Criteria andHuaxIn(List<Double> values) {
            addCriterion("huax in", values, "huax");
            return (Criteria) this;
        }

        public Criteria andHuaxNotIn(List<Double> values) {
            addCriterion("huax not in", values, "huax");
            return (Criteria) this;
        }

        public Criteria andHuaxBetween(Double value1, Double value2) {
            addCriterion("huax between", value1, value2, "huax");
            return (Criteria) this;
        }

        public Criteria andHuaxNotBetween(Double value1, Double value2) {
            addCriterion("huax not between", value1, value2, "huax");
            return (Criteria) this;
        }

        public Criteria andShengwIsNull() {
            addCriterion("shengw is null");
            return (Criteria) this;
        }

        public Criteria andShengwIsNotNull() {
            addCriterion("shengw is not null");
            return (Criteria) this;
        }

        public Criteria andShengwEqualTo(Double value) {
            addCriterion("shengw =", value, "shengw");
            return (Criteria) this;
        }

        public Criteria andShengwNotEqualTo(Double value) {
            addCriterion("shengw <>", value, "shengw");
            return (Criteria) this;
        }

        public Criteria andShengwGreaterThan(Double value) {
            addCriterion("shengw >", value, "shengw");
            return (Criteria) this;
        }

        public Criteria andShengwGreaterThanOrEqualTo(Double value) {
            addCriterion("shengw >=", value, "shengw");
            return (Criteria) this;
        }

        public Criteria andShengwLessThan(Double value) {
            addCriterion("shengw <", value, "shengw");
            return (Criteria) this;
        }

        public Criteria andShengwLessThanOrEqualTo(Double value) {
            addCriterion("shengw <=", value, "shengw");
            return (Criteria) this;
        }

        public Criteria andShengwIn(List<Double> values) {
            addCriterion("shengw in", values, "shengw");
            return (Criteria) this;
        }

        public Criteria andShengwNotIn(List<Double> values) {
            addCriterion("shengw not in", values, "shengw");
            return (Criteria) this;
        }

        public Criteria andShengwBetween(Double value1, Double value2) {
            addCriterion("shengw between", value1, value2, "shengw");
            return (Criteria) this;
        }

        public Criteria andShengwNotBetween(Double value1, Double value2) {
            addCriterion("shengw not between", value1, value2, "shengw");
            return (Criteria) this;
        }

        public Criteria andZhengzIsNull() {
            addCriterion("zhengz is null");
            return (Criteria) this;
        }

        public Criteria andZhengzIsNotNull() {
            addCriterion("zhengz is not null");
            return (Criteria) this;
        }

        public Criteria andZhengzEqualTo(Double value) {
            addCriterion("zhengz =", value, "zhengz");
            return (Criteria) this;
        }

        public Criteria andZhengzNotEqualTo(Double value) {
            addCriterion("zhengz <>", value, "zhengz");
            return (Criteria) this;
        }

        public Criteria andZhengzGreaterThan(Double value) {
            addCriterion("zhengz >", value, "zhengz");
            return (Criteria) this;
        }

        public Criteria andZhengzGreaterThanOrEqualTo(Double value) {
            addCriterion("zhengz >=", value, "zhengz");
            return (Criteria) this;
        }

        public Criteria andZhengzLessThan(Double value) {
            addCriterion("zhengz <", value, "zhengz");
            return (Criteria) this;
        }

        public Criteria andZhengzLessThanOrEqualTo(Double value) {
            addCriterion("zhengz <=", value, "zhengz");
            return (Criteria) this;
        }

        public Criteria andZhengzIn(List<Double> values) {
            addCriterion("zhengz in", values, "zhengz");
            return (Criteria) this;
        }

        public Criteria andZhengzNotIn(List<Double> values) {
            addCriterion("zhengz not in", values, "zhengz");
            return (Criteria) this;
        }

        public Criteria andZhengzBetween(Double value1, Double value2) {
            addCriterion("zhengz between", value1, value2, "zhengz");
            return (Criteria) this;
        }

        public Criteria andZhengzNotBetween(Double value1, Double value2) {
            addCriterion("zhengz not between", value1, value2, "zhengz");
            return (Criteria) this;
        }

        public Criteria andLisIsNull() {
            addCriterion("lis is null");
            return (Criteria) this;
        }

        public Criteria andLisIsNotNull() {
            addCriterion("lis is not null");
            return (Criteria) this;
        }

        public Criteria andLisEqualTo(Double value) {
            addCriterion("lis =", value, "lis");
            return (Criteria) this;
        }

        public Criteria andLisNotEqualTo(Double value) {
            addCriterion("lis <>", value, "lis");
            return (Criteria) this;
        }

        public Criteria andLisGreaterThan(Double value) {
            addCriterion("lis >", value, "lis");
            return (Criteria) this;
        }

        public Criteria andLisGreaterThanOrEqualTo(Double value) {
            addCriterion("lis >=", value, "lis");
            return (Criteria) this;
        }

        public Criteria andLisLessThan(Double value) {
            addCriterion("lis <", value, "lis");
            return (Criteria) this;
        }

        public Criteria andLisLessThanOrEqualTo(Double value) {
            addCriterion("lis <=", value, "lis");
            return (Criteria) this;
        }

        public Criteria andLisIn(List<Double> values) {
            addCriterion("lis in", values, "lis");
            return (Criteria) this;
        }

        public Criteria andLisNotIn(List<Double> values) {
            addCriterion("lis not in", values, "lis");
            return (Criteria) this;
        }

        public Criteria andLisBetween(Double value1, Double value2) {
            addCriterion("lis between", value1, value2, "lis");
            return (Criteria) this;
        }

        public Criteria andLisNotBetween(Double value1, Double value2) {
            addCriterion("lis not between", value1, value2, "lis");
            return (Criteria) this;
        }

        public Criteria andDilIsNull() {
            addCriterion("dil is null");
            return (Criteria) this;
        }

        public Criteria andDilIsNotNull() {
            addCriterion("dil is not null");
            return (Criteria) this;
        }

        public Criteria andDilEqualTo(Double value) {
            addCriterion("dil =", value, "dil");
            return (Criteria) this;
        }

        public Criteria andDilNotEqualTo(Double value) {
            addCriterion("dil <>", value, "dil");
            return (Criteria) this;
        }

        public Criteria andDilGreaterThan(Double value) {
            addCriterion("dil >", value, "dil");
            return (Criteria) this;
        }

        public Criteria andDilGreaterThanOrEqualTo(Double value) {
            addCriterion("dil >=", value, "dil");
            return (Criteria) this;
        }

        public Criteria andDilLessThan(Double value) {
            addCriterion("dil <", value, "dil");
            return (Criteria) this;
        }

        public Criteria andDilLessThanOrEqualTo(Double value) {
            addCriterion("dil <=", value, "dil");
            return (Criteria) this;
        }

        public Criteria andDilIn(List<Double> values) {
            addCriterion("dil in", values, "dil");
            return (Criteria) this;
        }

        public Criteria andDilNotIn(List<Double> values) {
            addCriterion("dil not in", values, "dil");
            return (Criteria) this;
        }

        public Criteria andDilBetween(Double value1, Double value2) {
            addCriterion("dil between", value1, value2, "dil");
            return (Criteria) this;
        }

        public Criteria andDilNotBetween(Double value1, Double value2) {
            addCriterion("dil not between", value1, value2, "dil");
            return (Criteria) this;
        }

        public Criteria andZonghlIsNull() {
            addCriterion("zonghl is null");
            return (Criteria) this;
        }

        public Criteria andZonghlIsNotNull() {
            addCriterion("zonghl is not null");
            return (Criteria) this;
        }

        public Criteria andZonghlEqualTo(Double value) {
            addCriterion("zonghl =", value, "zonghl");
            return (Criteria) this;
        }

        public Criteria andZonghlNotEqualTo(Double value) {
            addCriterion("zonghl <>", value, "zonghl");
            return (Criteria) this;
        }

        public Criteria andZonghlGreaterThan(Double value) {
            addCriterion("zonghl >", value, "zonghl");
            return (Criteria) this;
        }

        public Criteria andZonghlGreaterThanOrEqualTo(Double value) {
            addCriterion("zonghl >=", value, "zonghl");
            return (Criteria) this;
        }

        public Criteria andZonghlLessThan(Double value) {
            addCriterion("zonghl <", value, "zonghl");
            return (Criteria) this;
        }

        public Criteria andZonghlLessThanOrEqualTo(Double value) {
            addCriterion("zonghl <=", value, "zonghl");
            return (Criteria) this;
        }

        public Criteria andZonghlIn(List<Double> values) {
            addCriterion("zonghl in", values, "zonghl");
            return (Criteria) this;
        }

        public Criteria andZonghlNotIn(List<Double> values) {
            addCriterion("zonghl not in", values, "zonghl");
            return (Criteria) this;
        }

        public Criteria andZonghlBetween(Double value1, Double value2) {
            addCriterion("zonghl between", value1, value2, "zonghl");
            return (Criteria) this;
        }

        public Criteria andZonghlNotBetween(Double value1, Double value2) {
            addCriterion("zonghl not between", value1, value2, "zonghl");
            return (Criteria) this;
        }

        public Criteria andZonghwIsNull() {
            addCriterion("zonghw is null");
            return (Criteria) this;
        }

        public Criteria andZonghwIsNotNull() {
            addCriterion("zonghw is not null");
            return (Criteria) this;
        }

        public Criteria andZonghwEqualTo(Double value) {
            addCriterion("zonghw =", value, "zonghw");
            return (Criteria) this;
        }

        public Criteria andZonghwNotEqualTo(Double value) {
            addCriterion("zonghw <>", value, "zonghw");
            return (Criteria) this;
        }

        public Criteria andZonghwGreaterThan(Double value) {
            addCriterion("zonghw >", value, "zonghw");
            return (Criteria) this;
        }

        public Criteria andZonghwGreaterThanOrEqualTo(Double value) {
            addCriterion("zonghw >=", value, "zonghw");
            return (Criteria) this;
        }

        public Criteria andZonghwLessThan(Double value) {
            addCriterion("zonghw <", value, "zonghw");
            return (Criteria) this;
        }

        public Criteria andZonghwLessThanOrEqualTo(Double value) {
            addCriterion("zonghw <=", value, "zonghw");
            return (Criteria) this;
        }

        public Criteria andZonghwIn(List<Double> values) {
            addCriterion("zonghw in", values, "zonghw");
            return (Criteria) this;
        }

        public Criteria andZonghwNotIn(List<Double> values) {
            addCriterion("zonghw not in", values, "zonghw");
            return (Criteria) this;
        }

        public Criteria andZonghwBetween(Double value1, Double value2) {
            addCriterion("zonghw between", value1, value2, "zonghw");
            return (Criteria) this;
        }

        public Criteria andZonghwNotBetween(Double value1, Double value2) {
            addCriterion("zonghw not between", value1, value2, "zonghw");
            return (Criteria) this;
        }

        public Criteria andJiafIsNull() {
            addCriterion("jiaf is null");
            return (Criteria) this;
        }

        public Criteria andJiafIsNotNull() {
            addCriterion("jiaf is not null");
            return (Criteria) this;
        }

        public Criteria andJiafEqualTo(Double value) {
            addCriterion("jiaf =", value, "jiaf");
            return (Criteria) this;
        }

        public Criteria andJiafNotEqualTo(Double value) {
            addCriterion("jiaf <>", value, "jiaf");
            return (Criteria) this;
        }

        public Criteria andJiafGreaterThan(Double value) {
            addCriterion("jiaf >", value, "jiaf");
            return (Criteria) this;
        }

        public Criteria andJiafGreaterThanOrEqualTo(Double value) {
            addCriterion("jiaf >=", value, "jiaf");
            return (Criteria) this;
        }

        public Criteria andJiafLessThan(Double value) {
            addCriterion("jiaf <", value, "jiaf");
            return (Criteria) this;
        }

        public Criteria andJiafLessThanOrEqualTo(Double value) {
            addCriterion("jiaf <=", value, "jiaf");
            return (Criteria) this;
        }

        public Criteria andJiafIn(List<Double> values) {
            addCriterion("jiaf in", values, "jiaf");
            return (Criteria) this;
        }

        public Criteria andJiafNotIn(List<Double> values) {
            addCriterion("jiaf not in", values, "jiaf");
            return (Criteria) this;
        }

        public Criteria andJiafBetween(Double value1, Double value2) {
            addCriterion("jiaf between", value1, value2, "jiaf");
            return (Criteria) this;
        }

        public Criteria andJiafNotBetween(Double value1, Double value2) {
            addCriterion("jiaf not between", value1, value2, "jiaf");
            return (Criteria) this;
        }

        public Criteria andZxmkIsNull() {
            addCriterion("zxmk is null");
            return (Criteria) this;
        }

        public Criteria andZxmkIsNotNull() {
            addCriterion("zxmk is not null");
            return (Criteria) this;
        }

        public Criteria andZxmkEqualTo(Double value) {
            addCriterion("zxmk =", value, "zxmk");
            return (Criteria) this;
        }

        public Criteria andZxmkNotEqualTo(Double value) {
            addCriterion("zxmk <>", value, "zxmk");
            return (Criteria) this;
        }

        public Criteria andZxmkGreaterThan(Double value) {
            addCriterion("zxmk >", value, "zxmk");
            return (Criteria) this;
        }

        public Criteria andZxmkGreaterThanOrEqualTo(Double value) {
            addCriterion("zxmk >=", value, "zxmk");
            return (Criteria) this;
        }

        public Criteria andZxmkLessThan(Double value) {
            addCriterion("zxmk <", value, "zxmk");
            return (Criteria) this;
        }

        public Criteria andZxmkLessThanOrEqualTo(Double value) {
            addCriterion("zxmk <=", value, "zxmk");
            return (Criteria) this;
        }

        public Criteria andZxmkIn(List<Double> values) {
            addCriterion("zxmk in", values, "zxmk");
            return (Criteria) this;
        }

        public Criteria andZxmkNotIn(List<Double> values) {
            addCriterion("zxmk not in", values, "zxmk");
            return (Criteria) this;
        }

        public Criteria andZxmkBetween(Double value1, Double value2) {
            addCriterion("zxmk between", value1, value2, "zxmk");
            return (Criteria) this;
        }

        public Criteria andZxmkNotBetween(Double value1, Double value2) {
            addCriterion("zxmk not between", value1, value2, "zxmk");
            return (Criteria) this;
        }

        public Criteria andWyyzdmIsNull() {
            addCriterion("wyyzdm is null");
            return (Criteria) this;
        }

        public Criteria andWyyzdmIsNotNull() {
            addCriterion("wyyzdm is not null");
            return (Criteria) this;
        }

        public Criteria andWyyzdmEqualTo(String value) {
            addCriterion("wyyzdm =", value, "wyyzdm");
            return (Criteria) this;
        }

        public Criteria andWyyzdmNotEqualTo(String value) {
            addCriterion("wyyzdm <>", value, "wyyzdm");
            return (Criteria) this;
        }

        public Criteria andWyyzdmGreaterThan(String value) {
            addCriterion("wyyzdm >", value, "wyyzdm");
            return (Criteria) this;
        }

        public Criteria andWyyzdmGreaterThanOrEqualTo(String value) {
            addCriterion("wyyzdm >=", value, "wyyzdm");
            return (Criteria) this;
        }

        public Criteria andWyyzdmLessThan(String value) {
            addCriterion("wyyzdm <", value, "wyyzdm");
            return (Criteria) this;
        }

        public Criteria andWyyzdmLessThanOrEqualTo(String value) {
            addCriterion("wyyzdm <=", value, "wyyzdm");
            return (Criteria) this;
        }

        public Criteria andWyyzdmLike(String value) {
            addCriterion("wyyzdm like", value, "wyyzdm");
            return (Criteria) this;
        }

        public Criteria andWyyzdmNotLike(String value) {
            addCriterion("wyyzdm not like", value, "wyyzdm");
            return (Criteria) this;
        }

        public Criteria andWyyzdmIn(List<String> values) {
            addCriterion("wyyzdm in", values, "wyyzdm");
            return (Criteria) this;
        }

        public Criteria andWyyzdmNotIn(List<String> values) {
            addCriterion("wyyzdm not in", values, "wyyzdm");
            return (Criteria) this;
        }

        public Criteria andWyyzdmBetween(String value1, String value2) {
            addCriterion("wyyzdm between", value1, value2, "wyyzdm");
            return (Criteria) this;
        }

        public Criteria andWyyzdmNotBetween(String value1, String value2) {
            addCriterion("wyyzdm not between", value1, value2, "wyyzdm");
            return (Criteria) this;
        }

        public Criteria andWyksIsNull() {
            addCriterion("wyks is null");
            return (Criteria) this;
        }

        public Criteria andWyksIsNotNull() {
            addCriterion("wyks is not null");
            return (Criteria) this;
        }

        public Criteria andWyksEqualTo(String value) {
            addCriterion("wyks =", value, "wyks");
            return (Criteria) this;
        }

        public Criteria andWyksNotEqualTo(String value) {
            addCriterion("wyks <>", value, "wyks");
            return (Criteria) this;
        }

        public Criteria andWyksGreaterThan(String value) {
            addCriterion("wyks >", value, "wyks");
            return (Criteria) this;
        }

        public Criteria andWyksGreaterThanOrEqualTo(String value) {
            addCriterion("wyks >=", value, "wyks");
            return (Criteria) this;
        }

        public Criteria andWyksLessThan(String value) {
            addCriterion("wyks <", value, "wyks");
            return (Criteria) this;
        }

        public Criteria andWyksLessThanOrEqualTo(String value) {
            addCriterion("wyks <=", value, "wyks");
            return (Criteria) this;
        }

        public Criteria andWyksLike(String value) {
            addCriterion("wyks like", value, "wyks");
            return (Criteria) this;
        }

        public Criteria andWyksNotLike(String value) {
            addCriterion("wyks not like", value, "wyks");
            return (Criteria) this;
        }

        public Criteria andWyksIn(List<String> values) {
            addCriterion("wyks in", values, "wyks");
            return (Criteria) this;
        }

        public Criteria andWyksNotIn(List<String> values) {
            addCriterion("wyks not in", values, "wyks");
            return (Criteria) this;
        }

        public Criteria andWyksBetween(String value1, String value2) {
            addCriterion("wyks between", value1, value2, "wyks");
            return (Criteria) this;
        }

        public Criteria andWyksNotBetween(String value1, String value2) {
            addCriterion("wyks not between", value1, value2, "wyks");
            return (Criteria) this;
        }

        public Criteria andTotal111IsNull() {
            addCriterion("total111 is null");
            return (Criteria) this;
        }

        public Criteria andTotal111IsNotNull() {
            addCriterion("total111 is not null");
            return (Criteria) this;
        }

        public Criteria andTotal111EqualTo(Double value) {
            addCriterion("total111 =", value, "total111");
            return (Criteria) this;
        }

        public Criteria andTotal111NotEqualTo(Double value) {
            addCriterion("total111 <>", value, "total111");
            return (Criteria) this;
        }

        public Criteria andTotal111GreaterThan(Double value) {
            addCriterion("total111 >", value, "total111");
            return (Criteria) this;
        }

        public Criteria andTotal111GreaterThanOrEqualTo(Double value) {
            addCriterion("total111 >=", value, "total111");
            return (Criteria) this;
        }

        public Criteria andTotal111LessThan(Double value) {
            addCriterion("total111 <", value, "total111");
            return (Criteria) this;
        }

        public Criteria andTotal111LessThanOrEqualTo(Double value) {
            addCriterion("total111 <=", value, "total111");
            return (Criteria) this;
        }

        public Criteria andTotal111In(List<Double> values) {
            addCriterion("total111 in", values, "total111");
            return (Criteria) this;
        }

        public Criteria andTotal111NotIn(List<Double> values) {
            addCriterion("total111 not in", values, "total111");
            return (Criteria) this;
        }

        public Criteria andTotal111Between(Double value1, Double value2) {
            addCriterion("total111 between", value1, value2, "total111");
            return (Criteria) this;
        }

        public Criteria andTotal111NotBetween(Double value1, Double value2) {
            addCriterion("total111 not between", value1, value2, "total111");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Double value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Double value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Double value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Double value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Double value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Double> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Double> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Double value1, Double value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Double value1, Double value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andZsyjIsNull() {
            addCriterion("zsyj is null");
            return (Criteria) this;
        }

        public Criteria andZsyjIsNotNull() {
            addCriterion("zsyj is not null");
            return (Criteria) this;
        }

        public Criteria andZsyjEqualTo(String value) {
            addCriterion("zsyj =", value, "zsyj");
            return (Criteria) this;
        }

        public Criteria andZsyjNotEqualTo(String value) {
            addCriterion("zsyj <>", value, "zsyj");
            return (Criteria) this;
        }

        public Criteria andZsyjGreaterThan(String value) {
            addCriterion("zsyj >", value, "zsyj");
            return (Criteria) this;
        }

        public Criteria andZsyjGreaterThanOrEqualTo(String value) {
            addCriterion("zsyj >=", value, "zsyj");
            return (Criteria) this;
        }

        public Criteria andZsyjLessThan(String value) {
            addCriterion("zsyj <", value, "zsyj");
            return (Criteria) this;
        }

        public Criteria andZsyjLessThanOrEqualTo(String value) {
            addCriterion("zsyj <=", value, "zsyj");
            return (Criteria) this;
        }

        public Criteria andZsyjLike(String value) {
            addCriterion("zsyj like", value, "zsyj");
            return (Criteria) this;
        }

        public Criteria andZsyjNotLike(String value) {
            addCriterion("zsyj not like", value, "zsyj");
            return (Criteria) this;
        }

        public Criteria andZsyjIn(List<String> values) {
            addCriterion("zsyj in", values, "zsyj");
            return (Criteria) this;
        }

        public Criteria andZsyjNotIn(List<String> values) {
            addCriterion("zsyj not in", values, "zsyj");
            return (Criteria) this;
        }

        public Criteria andZsyjBetween(String value1, String value2) {
            addCriterion("zsyj between", value1, value2, "zsyj");
            return (Criteria) this;
        }

        public Criteria andZsyjNotBetween(String value1, String value2) {
            addCriterion("zsyj not between", value1, value2, "zsyj");
            return (Criteria) this;
        }

        public Criteria andCjIsNull() {
            addCriterion("cj is null");
            return (Criteria) this;
        }

        public Criteria andCjIsNotNull() {
            addCriterion("cj is not null");
            return (Criteria) this;
        }

        public Criteria andCjEqualTo(Double value) {
            addCriterion("cj =", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjNotEqualTo(Double value) {
            addCriterion("cj <>", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjGreaterThan(Double value) {
            addCriterion("cj >", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjGreaterThanOrEqualTo(Double value) {
            addCriterion("cj >=", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjLessThan(Double value) {
            addCriterion("cj <", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjLessThanOrEqualTo(Double value) {
            addCriterion("cj <=", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjIn(List<Double> values) {
            addCriterion("cj in", values, "cj");
            return (Criteria) this;
        }

        public Criteria andCjNotIn(List<Double> values) {
            addCriterion("cj not in", values, "cj");
            return (Criteria) this;
        }

        public Criteria andCjBetween(Double value1, Double value2) {
            addCriterion("cj between", value1, value2, "cj");
            return (Criteria) this;
        }

        public Criteria andCjNotBetween(Double value1, Double value2) {
            addCriterion("cj not between", value1, value2, "cj");
            return (Criteria) this;
        }

        public Criteria andTzcjIsNull() {
            addCriterion("tzcj is null");
            return (Criteria) this;
        }

        public Criteria andTzcjIsNotNull() {
            addCriterion("tzcj is not null");
            return (Criteria) this;
        }

        public Criteria andTzcjEqualTo(Double value) {
            addCriterion("tzcj =", value, "tzcj");
            return (Criteria) this;
        }

        public Criteria andTzcjNotEqualTo(Double value) {
            addCriterion("tzcj <>", value, "tzcj");
            return (Criteria) this;
        }

        public Criteria andTzcjGreaterThan(Double value) {
            addCriterion("tzcj >", value, "tzcj");
            return (Criteria) this;
        }

        public Criteria andTzcjGreaterThanOrEqualTo(Double value) {
            addCriterion("tzcj >=", value, "tzcj");
            return (Criteria) this;
        }

        public Criteria andTzcjLessThan(Double value) {
            addCriterion("tzcj <", value, "tzcj");
            return (Criteria) this;
        }

        public Criteria andTzcjLessThanOrEqualTo(Double value) {
            addCriterion("tzcj <=", value, "tzcj");
            return (Criteria) this;
        }

        public Criteria andTzcjIn(List<Double> values) {
            addCriterion("tzcj in", values, "tzcj");
            return (Criteria) this;
        }

        public Criteria andTzcjNotIn(List<Double> values) {
            addCriterion("tzcj not in", values, "tzcj");
            return (Criteria) this;
        }

        public Criteria andTzcjBetween(Double value1, Double value2) {
            addCriterion("tzcj between", value1, value2, "tzcj");
            return (Criteria) this;
        }

        public Criteria andTzcjNotBetween(Double value1, Double value2) {
            addCriterion("tzcj not between", value1, value2, "tzcj");
            return (Criteria) this;
        }

        public Criteria andTdcjIsNull() {
            addCriterion("tdcj is null");
            return (Criteria) this;
        }

        public Criteria andTdcjIsNotNull() {
            addCriterion("tdcj is not null");
            return (Criteria) this;
        }

        public Criteria andTdcjEqualTo(Double value) {
            addCriterion("tdcj =", value, "tdcj");
            return (Criteria) this;
        }

        public Criteria andTdcjNotEqualTo(Double value) {
            addCriterion("tdcj <>", value, "tdcj");
            return (Criteria) this;
        }

        public Criteria andTdcjGreaterThan(Double value) {
            addCriterion("tdcj >", value, "tdcj");
            return (Criteria) this;
        }

        public Criteria andTdcjGreaterThanOrEqualTo(Double value) {
            addCriterion("tdcj >=", value, "tdcj");
            return (Criteria) this;
        }

        public Criteria andTdcjLessThan(Double value) {
            addCriterion("tdcj <", value, "tdcj");
            return (Criteria) this;
        }

        public Criteria andTdcjLessThanOrEqualTo(Double value) {
            addCriterion("tdcj <=", value, "tdcj");
            return (Criteria) this;
        }

        public Criteria andTdcjIn(List<Double> values) {
            addCriterion("tdcj in", values, "tdcj");
            return (Criteria) this;
        }

        public Criteria andTdcjNotIn(List<Double> values) {
            addCriterion("tdcj not in", values, "tdcj");
            return (Criteria) this;
        }

        public Criteria andTdcjBetween(Double value1, Double value2) {
            addCriterion("tdcj between", value1, value2, "tdcj");
            return (Criteria) this;
        }

        public Criteria andTdcjNotBetween(Double value1, Double value2) {
            addCriterion("tdcj not between", value1, value2, "tdcj");
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

        public Criteria andZgfEqualTo(Double value) {
            addCriterion("zgf =", value, "zgf");
            return (Criteria) this;
        }

        public Criteria andZgfNotEqualTo(Double value) {
            addCriterion("zgf <>", value, "zgf");
            return (Criteria) this;
        }

        public Criteria andZgfGreaterThan(Double value) {
            addCriterion("zgf >", value, "zgf");
            return (Criteria) this;
        }

        public Criteria andZgfGreaterThanOrEqualTo(Double value) {
            addCriterion("zgf >=", value, "zgf");
            return (Criteria) this;
        }

        public Criteria andZgfLessThan(Double value) {
            addCriterion("zgf <", value, "zgf");
            return (Criteria) this;
        }

        public Criteria andZgfLessThanOrEqualTo(Double value) {
            addCriterion("zgf <=", value, "zgf");
            return (Criteria) this;
        }

        public Criteria andZgfIn(List<Double> values) {
            addCriterion("zgf in", values, "zgf");
            return (Criteria) this;
        }

        public Criteria andZgfNotIn(List<Double> values) {
            addCriterion("zgf not in", values, "zgf");
            return (Criteria) this;
        }

        public Criteria andZgfBetween(Double value1, Double value2) {
            addCriterion("zgf between", value1, value2, "zgf");
            return (Criteria) this;
        }

        public Criteria andZgfNotBetween(Double value1, Double value2) {
            addCriterion("zgf not between", value1, value2, "zgf");
            return (Criteria) this;
        }

        public Criteria andYxdrcjIsNull() {
            addCriterion("yxdrcj is null");
            return (Criteria) this;
        }

        public Criteria andYxdrcjIsNotNull() {
            addCriterion("yxdrcj is not null");
            return (Criteria) this;
        }

        public Criteria andYxdrcjEqualTo(Double value) {
            addCriterion("yxdrcj =", value, "yxdrcj");
            return (Criteria) this;
        }

        public Criteria andYxdrcjNotEqualTo(Double value) {
            addCriterion("yxdrcj <>", value, "yxdrcj");
            return (Criteria) this;
        }

        public Criteria andYxdrcjGreaterThan(Double value) {
            addCriterion("yxdrcj >", value, "yxdrcj");
            return (Criteria) this;
        }

        public Criteria andYxdrcjGreaterThanOrEqualTo(Double value) {
            addCriterion("yxdrcj >=", value, "yxdrcj");
            return (Criteria) this;
        }

        public Criteria andYxdrcjLessThan(Double value) {
            addCriterion("yxdrcj <", value, "yxdrcj");
            return (Criteria) this;
        }

        public Criteria andYxdrcjLessThanOrEqualTo(Double value) {
            addCriterion("yxdrcj <=", value, "yxdrcj");
            return (Criteria) this;
        }

        public Criteria andYxdrcjIn(List<Double> values) {
            addCriterion("yxdrcj in", values, "yxdrcj");
            return (Criteria) this;
        }

        public Criteria andYxdrcjNotIn(List<Double> values) {
            addCriterion("yxdrcj not in", values, "yxdrcj");
            return (Criteria) this;
        }

        public Criteria andYxdrcjBetween(Double value1, Double value2) {
            addCriterion("yxdrcj between", value1, value2, "yxdrcj");
            return (Criteria) this;
        }

        public Criteria andYxdrcjNotBetween(Double value1, Double value2) {
            addCriterion("yxdrcj not between", value1, value2, "yxdrcj");
            return (Criteria) this;
        }

        public Criteria andZyytjzcjIsNull() {
            addCriterion("zyytjzcj is null");
            return (Criteria) this;
        }

        public Criteria andZyytjzcjIsNotNull() {
            addCriterion("zyytjzcj is not null");
            return (Criteria) this;
        }

        public Criteria andZyytjzcjEqualTo(Double value) {
            addCriterion("zyytjzcj =", value, "zyytjzcj");
            return (Criteria) this;
        }

        public Criteria andZyytjzcjNotEqualTo(Double value) {
            addCriterion("zyytjzcj <>", value, "zyytjzcj");
            return (Criteria) this;
        }

        public Criteria andZyytjzcjGreaterThan(Double value) {
            addCriterion("zyytjzcj >", value, "zyytjzcj");
            return (Criteria) this;
        }

        public Criteria andZyytjzcjGreaterThanOrEqualTo(Double value) {
            addCriterion("zyytjzcj >=", value, "zyytjzcj");
            return (Criteria) this;
        }

        public Criteria andZyytjzcjLessThan(Double value) {
            addCriterion("zyytjzcj <", value, "zyytjzcj");
            return (Criteria) this;
        }

        public Criteria andZyytjzcjLessThanOrEqualTo(Double value) {
            addCriterion("zyytjzcj <=", value, "zyytjzcj");
            return (Criteria) this;
        }

        public Criteria andZyytjzcjIn(List<Double> values) {
            addCriterion("zyytjzcj in", values, "zyytjzcj");
            return (Criteria) this;
        }

        public Criteria andZyytjzcjNotIn(List<Double> values) {
            addCriterion("zyytjzcj not in", values, "zyytjzcj");
            return (Criteria) this;
        }

        public Criteria andZyytjzcjBetween(Double value1, Double value2) {
            addCriterion("zyytjzcj between", value1, value2, "zyytjzcj");
            return (Criteria) this;
        }

        public Criteria andZyytjzcjNotBetween(Double value1, Double value2) {
            addCriterion("zyytjzcj not between", value1, value2, "zyytjzcj");
            return (Criteria) this;
        }

        public Criteria andZyytfjcjIsNull() {
            addCriterion("zyytfjcj is null");
            return (Criteria) this;
        }

        public Criteria andZyytfjcjIsNotNull() {
            addCriterion("zyytfjcj is not null");
            return (Criteria) this;
        }

        public Criteria andZyytfjcjEqualTo(Double value) {
            addCriterion("zyytfjcj =", value, "zyytfjcj");
            return (Criteria) this;
        }

        public Criteria andZyytfjcjNotEqualTo(Double value) {
            addCriterion("zyytfjcj <>", value, "zyytfjcj");
            return (Criteria) this;
        }

        public Criteria andZyytfjcjGreaterThan(Double value) {
            addCriterion("zyytfjcj >", value, "zyytfjcj");
            return (Criteria) this;
        }

        public Criteria andZyytfjcjGreaterThanOrEqualTo(Double value) {
            addCriterion("zyytfjcj >=", value, "zyytfjcj");
            return (Criteria) this;
        }

        public Criteria andZyytfjcjLessThan(Double value) {
            addCriterion("zyytfjcj <", value, "zyytfjcj");
            return (Criteria) this;
        }

        public Criteria andZyytfjcjLessThanOrEqualTo(Double value) {
            addCriterion("zyytfjcj <=", value, "zyytfjcj");
            return (Criteria) this;
        }

        public Criteria andZyytfjcjIn(List<Double> values) {
            addCriterion("zyytfjcj in", values, "zyytfjcj");
            return (Criteria) this;
        }

        public Criteria andZyytfjcjNotIn(List<Double> values) {
            addCriterion("zyytfjcj not in", values, "zyytfjcj");
            return (Criteria) this;
        }

        public Criteria andZyytfjcjBetween(Double value1, Double value2) {
            addCriterion("zyytfjcj between", value1, value2, "zyytfjcj");
            return (Criteria) this;
        }

        public Criteria andZyytfjcjNotBetween(Double value1, Double value2) {
            addCriterion("zyytfjcj not between", value1, value2, "zyytfjcj");
            return (Criteria) this;
        }

        public Criteria andHkdjIsNull() {
            addCriterion("hkdj is null");
            return (Criteria) this;
        }

        public Criteria andHkdjIsNotNull() {
            addCriterion("hkdj is not null");
            return (Criteria) this;
        }

        public Criteria andHkdjEqualTo(String value) {
            addCriterion("hkdj =", value, "hkdj");
            return (Criteria) this;
        }

        public Criteria andHkdjNotEqualTo(String value) {
            addCriterion("hkdj <>", value, "hkdj");
            return (Criteria) this;
        }

        public Criteria andHkdjGreaterThan(String value) {
            addCriterion("hkdj >", value, "hkdj");
            return (Criteria) this;
        }

        public Criteria andHkdjGreaterThanOrEqualTo(String value) {
            addCriterion("hkdj >=", value, "hkdj");
            return (Criteria) this;
        }

        public Criteria andHkdjLessThan(String value) {
            addCriterion("hkdj <", value, "hkdj");
            return (Criteria) this;
        }

        public Criteria andHkdjLessThanOrEqualTo(String value) {
            addCriterion("hkdj <=", value, "hkdj");
            return (Criteria) this;
        }

        public Criteria andHkdjLike(String value) {
            addCriterion("hkdj like", value, "hkdj");
            return (Criteria) this;
        }

        public Criteria andHkdjNotLike(String value) {
            addCriterion("hkdj not like", value, "hkdj");
            return (Criteria) this;
        }

        public Criteria andHkdjIn(List<String> values) {
            addCriterion("hkdj in", values, "hkdj");
            return (Criteria) this;
        }

        public Criteria andHkdjNotIn(List<String> values) {
            addCriterion("hkdj not in", values, "hkdj");
            return (Criteria) this;
        }

        public Criteria andHkdjBetween(String value1, String value2) {
            addCriterion("hkdj between", value1, value2, "hkdj");
            return (Criteria) this;
        }

        public Criteria andHkdjNotBetween(String value1, String value2) {
            addCriterion("hkdj not between", value1, value2, "hkdj");
            return (Criteria) this;
        }

        public Criteria andBmdwIsNull() {
            addCriterion("bmdw is null");
            return (Criteria) this;
        }

        public Criteria andBmdwIsNotNull() {
            addCriterion("bmdw is not null");
            return (Criteria) this;
        }

        public Criteria andBmdwEqualTo(String value) {
            addCriterion("bmdw =", value, "bmdw");
            return (Criteria) this;
        }

        public Criteria andBmdwNotEqualTo(String value) {
            addCriterion("bmdw <>", value, "bmdw");
            return (Criteria) this;
        }

        public Criteria andBmdwGreaterThan(String value) {
            addCriterion("bmdw >", value, "bmdw");
            return (Criteria) this;
        }

        public Criteria andBmdwGreaterThanOrEqualTo(String value) {
            addCriterion("bmdw >=", value, "bmdw");
            return (Criteria) this;
        }

        public Criteria andBmdwLessThan(String value) {
            addCriterion("bmdw <", value, "bmdw");
            return (Criteria) this;
        }

        public Criteria andBmdwLessThanOrEqualTo(String value) {
            addCriterion("bmdw <=", value, "bmdw");
            return (Criteria) this;
        }

        public Criteria andBmdwLike(String value) {
            addCriterion("bmdw like", value, "bmdw");
            return (Criteria) this;
        }

        public Criteria andBmdwNotLike(String value) {
            addCriterion("bmdw not like", value, "bmdw");
            return (Criteria) this;
        }

        public Criteria andBmdwIn(List<String> values) {
            addCriterion("bmdw in", values, "bmdw");
            return (Criteria) this;
        }

        public Criteria andBmdwNotIn(List<String> values) {
            addCriterion("bmdw not in", values, "bmdw");
            return (Criteria) this;
        }

        public Criteria andBmdwBetween(String value1, String value2) {
            addCriterion("bmdw between", value1, value2, "bmdw");
            return (Criteria) this;
        }

        public Criteria andBmdwNotBetween(String value1, String value2) {
            addCriterion("bmdw not between", value1, value2, "bmdw");
            return (Criteria) this;
        }

        public Criteria andKstzIsNull() {
            addCriterion("kstz is null");
            return (Criteria) this;
        }

        public Criteria andKstzIsNotNull() {
            addCriterion("kstz is not null");
            return (Criteria) this;
        }

        public Criteria andKstzEqualTo(String value) {
            addCriterion("kstz =", value, "kstz");
            return (Criteria) this;
        }

        public Criteria andKstzNotEqualTo(String value) {
            addCriterion("kstz <>", value, "kstz");
            return (Criteria) this;
        }

        public Criteria andKstzGreaterThan(String value) {
            addCriterion("kstz >", value, "kstz");
            return (Criteria) this;
        }

        public Criteria andKstzGreaterThanOrEqualTo(String value) {
            addCriterion("kstz >=", value, "kstz");
            return (Criteria) this;
        }

        public Criteria andKstzLessThan(String value) {
            addCriterion("kstz <", value, "kstz");
            return (Criteria) this;
        }

        public Criteria andKstzLessThanOrEqualTo(String value) {
            addCriterion("kstz <=", value, "kstz");
            return (Criteria) this;
        }

        public Criteria andKstzLike(String value) {
            addCriterion("kstz like", value, "kstz");
            return (Criteria) this;
        }

        public Criteria andKstzNotLike(String value) {
            addCriterion("kstz not like", value, "kstz");
            return (Criteria) this;
        }

        public Criteria andKstzIn(List<String> values) {
            addCriterion("kstz in", values, "kstz");
            return (Criteria) this;
        }

        public Criteria andKstzNotIn(List<String> values) {
            addCriterion("kstz not in", values, "kstz");
            return (Criteria) this;
        }

        public Criteria andKstzBetween(String value1, String value2) {
            addCriterion("kstz between", value1, value2, "kstz");
            return (Criteria) this;
        }

        public Criteria andKstzNotBetween(String value1, String value2) {
            addCriterion("kstz not between", value1, value2, "kstz");
            return (Criteria) this;
        }

        public Criteria andXtdwIsNull() {
            addCriterion("xtdw is null");
            return (Criteria) this;
        }

        public Criteria andXtdwIsNotNull() {
            addCriterion("xtdw is not null");
            return (Criteria) this;
        }

        public Criteria andXtdwEqualTo(String value) {
            addCriterion("xtdw =", value, "xtdw");
            return (Criteria) this;
        }

        public Criteria andXtdwNotEqualTo(String value) {
            addCriterion("xtdw <>", value, "xtdw");
            return (Criteria) this;
        }

        public Criteria andXtdwGreaterThan(String value) {
            addCriterion("xtdw >", value, "xtdw");
            return (Criteria) this;
        }

        public Criteria andXtdwGreaterThanOrEqualTo(String value) {
            addCriterion("xtdw >=", value, "xtdw");
            return (Criteria) this;
        }

        public Criteria andXtdwLessThan(String value) {
            addCriterion("xtdw <", value, "xtdw");
            return (Criteria) this;
        }

        public Criteria andXtdwLessThanOrEqualTo(String value) {
            addCriterion("xtdw <=", value, "xtdw");
            return (Criteria) this;
        }

        public Criteria andXtdwLike(String value) {
            addCriterion("xtdw like", value, "xtdw");
            return (Criteria) this;
        }

        public Criteria andXtdwNotLike(String value) {
            addCriterion("xtdw not like", value, "xtdw");
            return (Criteria) this;
        }

        public Criteria andXtdwIn(List<String> values) {
            addCriterion("xtdw in", values, "xtdw");
            return (Criteria) this;
        }

        public Criteria andXtdwNotIn(List<String> values) {
            addCriterion("xtdw not in", values, "xtdw");
            return (Criteria) this;
        }

        public Criteria andXtdwBetween(String value1, String value2) {
            addCriterion("xtdw between", value1, value2, "xtdw");
            return (Criteria) this;
        }

        public Criteria andXtdwNotBetween(String value1, String value2) {
            addCriterion("xtdw not between", value1, value2, "xtdw");
            return (Criteria) this;
        }

        public Criteria andSjrIsNull() {
            addCriterion("sjr is null");
            return (Criteria) this;
        }

        public Criteria andSjrIsNotNull() {
            addCriterion("sjr is not null");
            return (Criteria) this;
        }

        public Criteria andSjrEqualTo(String value) {
            addCriterion("sjr =", value, "sjr");
            return (Criteria) this;
        }

        public Criteria andSjrNotEqualTo(String value) {
            addCriterion("sjr <>", value, "sjr");
            return (Criteria) this;
        }

        public Criteria andSjrGreaterThan(String value) {
            addCriterion("sjr >", value, "sjr");
            return (Criteria) this;
        }

        public Criteria andSjrGreaterThanOrEqualTo(String value) {
            addCriterion("sjr >=", value, "sjr");
            return (Criteria) this;
        }

        public Criteria andSjrLessThan(String value) {
            addCriterion("sjr <", value, "sjr");
            return (Criteria) this;
        }

        public Criteria andSjrLessThanOrEqualTo(String value) {
            addCriterion("sjr <=", value, "sjr");
            return (Criteria) this;
        }

        public Criteria andSjrLike(String value) {
            addCriterion("sjr like", value, "sjr");
            return (Criteria) this;
        }

        public Criteria andSjrNotLike(String value) {
            addCriterion("sjr not like", value, "sjr");
            return (Criteria) this;
        }

        public Criteria andSjrIn(List<String> values) {
            addCriterion("sjr in", values, "sjr");
            return (Criteria) this;
        }

        public Criteria andSjrNotIn(List<String> values) {
            addCriterion("sjr not in", values, "sjr");
            return (Criteria) this;
        }

        public Criteria andSjrBetween(String value1, String value2) {
            addCriterion("sjr between", value1, value2, "sjr");
            return (Criteria) this;
        }

        public Criteria andSjrNotBetween(String value1, String value2) {
            addCriterion("sjr not between", value1, value2, "sjr");
            return (Criteria) this;
        }

        public Criteria andYsjzdmIsNull() {
            addCriterion("ysjzdm is null");
            return (Criteria) this;
        }

        public Criteria andYsjzdmIsNotNull() {
            addCriterion("ysjzdm is not null");
            return (Criteria) this;
        }

        public Criteria andYsjzdmEqualTo(String value) {
            addCriterion("ysjzdm =", value, "ysjzdm");
            return (Criteria) this;
        }

        public Criteria andYsjzdmNotEqualTo(String value) {
            addCriterion("ysjzdm <>", value, "ysjzdm");
            return (Criteria) this;
        }

        public Criteria andYsjzdmGreaterThan(String value) {
            addCriterion("ysjzdm >", value, "ysjzdm");
            return (Criteria) this;
        }

        public Criteria andYsjzdmGreaterThanOrEqualTo(String value) {
            addCriterion("ysjzdm >=", value, "ysjzdm");
            return (Criteria) this;
        }

        public Criteria andYsjzdmLessThan(String value) {
            addCriterion("ysjzdm <", value, "ysjzdm");
            return (Criteria) this;
        }

        public Criteria andYsjzdmLessThanOrEqualTo(String value) {
            addCriterion("ysjzdm <=", value, "ysjzdm");
            return (Criteria) this;
        }

        public Criteria andYsjzdmLike(String value) {
            addCriterion("ysjzdm like", value, "ysjzdm");
            return (Criteria) this;
        }

        public Criteria andYsjzdmNotLike(String value) {
            addCriterion("ysjzdm not like", value, "ysjzdm");
            return (Criteria) this;
        }

        public Criteria andYsjzdmIn(List<String> values) {
            addCriterion("ysjzdm in", values, "ysjzdm");
            return (Criteria) this;
        }

        public Criteria andYsjzdmNotIn(List<String> values) {
            addCriterion("ysjzdm not in", values, "ysjzdm");
            return (Criteria) this;
        }

        public Criteria andYsjzdmBetween(String value1, String value2) {
            addCriterion("ysjzdm between", value1, value2, "ysjzdm");
            return (Criteria) this;
        }

        public Criteria andYsjzdmNotBetween(String value1, String value2) {
            addCriterion("ysjzdm not between", value1, value2, "ysjzdm");
            return (Criteria) this;
        }

        public Criteria andWytlIsNull() {
            addCriterion("wytl is null");
            return (Criteria) this;
        }

        public Criteria andWytlIsNotNull() {
            addCriterion("wytl is not null");
            return (Criteria) this;
        }

        public Criteria andWytlEqualTo(String value) {
            addCriterion("wytl =", value, "wytl");
            return (Criteria) this;
        }

        public Criteria andWytlNotEqualTo(String value) {
            addCriterion("wytl <>", value, "wytl");
            return (Criteria) this;
        }

        public Criteria andWytlGreaterThan(String value) {
            addCriterion("wytl >", value, "wytl");
            return (Criteria) this;
        }

        public Criteria andWytlGreaterThanOrEqualTo(String value) {
            addCriterion("wytl >=", value, "wytl");
            return (Criteria) this;
        }

        public Criteria andWytlLessThan(String value) {
            addCriterion("wytl <", value, "wytl");
            return (Criteria) this;
        }

        public Criteria andWytlLessThanOrEqualTo(String value) {
            addCriterion("wytl <=", value, "wytl");
            return (Criteria) this;
        }

        public Criteria andWytlLike(String value) {
            addCriterion("wytl like", value, "wytl");
            return (Criteria) this;
        }

        public Criteria andWytlNotLike(String value) {
            addCriterion("wytl not like", value, "wytl");
            return (Criteria) this;
        }

        public Criteria andWytlIn(List<String> values) {
            addCriterion("wytl in", values, "wytl");
            return (Criteria) this;
        }

        public Criteria andWytlNotIn(List<String> values) {
            addCriterion("wytl not in", values, "wytl");
            return (Criteria) this;
        }

        public Criteria andWytlBetween(String value1, String value2) {
            addCriterion("wytl between", value1, value2, "wytl");
            return (Criteria) this;
        }

        public Criteria andWytlNotBetween(String value1, String value2) {
            addCriterion("wytl not between", value1, value2, "wytl");
            return (Criteria) this;
        }

        public Criteria andTddwIsNull() {
            addCriterion("tddw is null");
            return (Criteria) this;
        }

        public Criteria andTddwIsNotNull() {
            addCriterion("tddw is not null");
            return (Criteria) this;
        }

        public Criteria andTddwEqualTo(String value) {
            addCriterion("tddw =", value, "tddw");
            return (Criteria) this;
        }

        public Criteria andTddwNotEqualTo(String value) {
            addCriterion("tddw <>", value, "tddw");
            return (Criteria) this;
        }

        public Criteria andTddwGreaterThan(String value) {
            addCriterion("tddw >", value, "tddw");
            return (Criteria) this;
        }

        public Criteria andTddwGreaterThanOrEqualTo(String value) {
            addCriterion("tddw >=", value, "tddw");
            return (Criteria) this;
        }

        public Criteria andTddwLessThan(String value) {
            addCriterion("tddw <", value, "tddw");
            return (Criteria) this;
        }

        public Criteria andTddwLessThanOrEqualTo(String value) {
            addCriterion("tddw <=", value, "tddw");
            return (Criteria) this;
        }

        public Criteria andTddwLike(String value) {
            addCriterion("tddw like", value, "tddw");
            return (Criteria) this;
        }

        public Criteria andTddwNotLike(String value) {
            addCriterion("tddw not like", value, "tddw");
            return (Criteria) this;
        }

        public Criteria andTddwIn(List<String> values) {
            addCriterion("tddw in", values, "tddw");
            return (Criteria) this;
        }

        public Criteria andTddwNotIn(List<String> values) {
            addCriterion("tddw not in", values, "tddw");
            return (Criteria) this;
        }

        public Criteria andTddwBetween(String value1, String value2) {
            addCriterion("tddw between", value1, value2, "tddw");
            return (Criteria) this;
        }

        public Criteria andTddwNotBetween(String value1, String value2) {
            addCriterion("tddw not between", value1, value2, "tddw");
            return (Criteria) this;
        }

        public Criteria andJhxzIsNull() {
            addCriterion("jhxz is null");
            return (Criteria) this;
        }

        public Criteria andJhxzIsNotNull() {
            addCriterion("jhxz is not null");
            return (Criteria) this;
        }

        public Criteria andJhxzEqualTo(String value) {
            addCriterion("jhxz =", value, "jhxz");
            return (Criteria) this;
        }

        public Criteria andJhxzNotEqualTo(String value) {
            addCriterion("jhxz <>", value, "jhxz");
            return (Criteria) this;
        }

        public Criteria andJhxzGreaterThan(String value) {
            addCriterion("jhxz >", value, "jhxz");
            return (Criteria) this;
        }

        public Criteria andJhxzGreaterThanOrEqualTo(String value) {
            addCriterion("jhxz >=", value, "jhxz");
            return (Criteria) this;
        }

        public Criteria andJhxzLessThan(String value) {
            addCriterion("jhxz <", value, "jhxz");
            return (Criteria) this;
        }

        public Criteria andJhxzLessThanOrEqualTo(String value) {
            addCriterion("jhxz <=", value, "jhxz");
            return (Criteria) this;
        }

        public Criteria andJhxzLike(String value) {
            addCriterion("jhxz like", value, "jhxz");
            return (Criteria) this;
        }

        public Criteria andJhxzNotLike(String value) {
            addCriterion("jhxz not like", value, "jhxz");
            return (Criteria) this;
        }

        public Criteria andJhxzIn(List<String> values) {
            addCriterion("jhxz in", values, "jhxz");
            return (Criteria) this;
        }

        public Criteria andJhxzNotIn(List<String> values) {
            addCriterion("jhxz not in", values, "jhxz");
            return (Criteria) this;
        }

        public Criteria andJhxzBetween(String value1, String value2) {
            addCriterion("jhxz between", value1, value2, "jhxz");
            return (Criteria) this;
        }

        public Criteria andJhxzNotBetween(String value1, String value2) {
            addCriterion("jhxz not between", value1, value2, "jhxz");
            return (Criteria) this;
        }

        public Criteria andZslsIsNull() {
            addCriterion("zsls is null");
            return (Criteria) this;
        }

        public Criteria andZslsIsNotNull() {
            addCriterion("zsls is not null");
            return (Criteria) this;
        }

        public Criteria andZslsEqualTo(String value) {
            addCriterion("zsls =", value, "zsls");
            return (Criteria) this;
        }

        public Criteria andZslsNotEqualTo(String value) {
            addCriterion("zsls <>", value, "zsls");
            return (Criteria) this;
        }

        public Criteria andZslsGreaterThan(String value) {
            addCriterion("zsls >", value, "zsls");
            return (Criteria) this;
        }

        public Criteria andZslsGreaterThanOrEqualTo(String value) {
            addCriterion("zsls >=", value, "zsls");
            return (Criteria) this;
        }

        public Criteria andZslsLessThan(String value) {
            addCriterion("zsls <", value, "zsls");
            return (Criteria) this;
        }

        public Criteria andZslsLessThanOrEqualTo(String value) {
            addCriterion("zsls <=", value, "zsls");
            return (Criteria) this;
        }

        public Criteria andZslsLike(String value) {
            addCriterion("zsls like", value, "zsls");
            return (Criteria) this;
        }

        public Criteria andZslsNotLike(String value) {
            addCriterion("zsls not like", value, "zsls");
            return (Criteria) this;
        }

        public Criteria andZslsIn(List<String> values) {
            addCriterion("zsls in", values, "zsls");
            return (Criteria) this;
        }

        public Criteria andZslsNotIn(List<String> values) {
            addCriterion("zsls not in", values, "zsls");
            return (Criteria) this;
        }

        public Criteria andZslsBetween(String value1, String value2) {
            addCriterion("zsls between", value1, value2, "zsls");
            return (Criteria) this;
        }

        public Criteria andZslsNotBetween(String value1, String value2) {
            addCriterion("zsls not between", value1, value2, "zsls");
            return (Criteria) this;
        }

        public Criteria andTdzyIsNull() {
            addCriterion("tdzy is null");
            return (Criteria) this;
        }

        public Criteria andTdzyIsNotNull() {
            addCriterion("tdzy is not null");
            return (Criteria) this;
        }

        public Criteria andTdzyEqualTo(String value) {
            addCriterion("tdzy =", value, "tdzy");
            return (Criteria) this;
        }

        public Criteria andTdzyNotEqualTo(String value) {
            addCriterion("tdzy <>", value, "tdzy");
            return (Criteria) this;
        }

        public Criteria andTdzyGreaterThan(String value) {
            addCriterion("tdzy >", value, "tdzy");
            return (Criteria) this;
        }

        public Criteria andTdzyGreaterThanOrEqualTo(String value) {
            addCriterion("tdzy >=", value, "tdzy");
            return (Criteria) this;
        }

        public Criteria andTdzyLessThan(String value) {
            addCriterion("tdzy <", value, "tdzy");
            return (Criteria) this;
        }

        public Criteria andTdzyLessThanOrEqualTo(String value) {
            addCriterion("tdzy <=", value, "tdzy");
            return (Criteria) this;
        }

        public Criteria andTdzyLike(String value) {
            addCriterion("tdzy like", value, "tdzy");
            return (Criteria) this;
        }

        public Criteria andTdzyNotLike(String value) {
            addCriterion("tdzy not like", value, "tdzy");
            return (Criteria) this;
        }

        public Criteria andTdzyIn(List<String> values) {
            addCriterion("tdzy in", values, "tdzy");
            return (Criteria) this;
        }

        public Criteria andTdzyNotIn(List<String> values) {
            addCriterion("tdzy not in", values, "tdzy");
            return (Criteria) this;
        }

        public Criteria andTdzyBetween(String value1, String value2) {
            addCriterion("tdzy between", value1, value2, "tdzy");
            return (Criteria) this;
        }

        public Criteria andTdzyNotBetween(String value1, String value2) {
            addCriterion("tdzy not between", value1, value2, "tdzy");
            return (Criteria) this;
        }

        public Criteria andDqtddwIsNull() {
            addCriterion("dqtddw is null");
            return (Criteria) this;
        }

        public Criteria andDqtddwIsNotNull() {
            addCriterion("dqtddw is not null");
            return (Criteria) this;
        }

        public Criteria andDqtddwEqualTo(String value) {
            addCriterion("dqtddw =", value, "dqtddw");
            return (Criteria) this;
        }

        public Criteria andDqtddwNotEqualTo(String value) {
            addCriterion("dqtddw <>", value, "dqtddw");
            return (Criteria) this;
        }

        public Criteria andDqtddwGreaterThan(String value) {
            addCriterion("dqtddw >", value, "dqtddw");
            return (Criteria) this;
        }

        public Criteria andDqtddwGreaterThanOrEqualTo(String value) {
            addCriterion("dqtddw >=", value, "dqtddw");
            return (Criteria) this;
        }

        public Criteria andDqtddwLessThan(String value) {
            addCriterion("dqtddw <", value, "dqtddw");
            return (Criteria) this;
        }

        public Criteria andDqtddwLessThanOrEqualTo(String value) {
            addCriterion("dqtddw <=", value, "dqtddw");
            return (Criteria) this;
        }

        public Criteria andDqtddwLike(String value) {
            addCriterion("dqtddw like", value, "dqtddw");
            return (Criteria) this;
        }

        public Criteria andDqtddwNotLike(String value) {
            addCriterion("dqtddw not like", value, "dqtddw");
            return (Criteria) this;
        }

        public Criteria andDqtddwIn(List<String> values) {
            addCriterion("dqtddw in", values, "dqtddw");
            return (Criteria) this;
        }

        public Criteria andDqtddwNotIn(List<String> values) {
            addCriterion("dqtddw not in", values, "dqtddw");
            return (Criteria) this;
        }

        public Criteria andDqtddwBetween(String value1, String value2) {
            addCriterion("dqtddw between", value1, value2, "dqtddw");
            return (Criteria) this;
        }

        public Criteria andDqtddwNotBetween(String value1, String value2) {
            addCriterion("dqtddw not between", value1, value2, "dqtddw");
            return (Criteria) this;
        }

        public Criteria andYtzyIsNull() {
            addCriterion("ytzy is null");
            return (Criteria) this;
        }

        public Criteria andYtzyIsNotNull() {
            addCriterion("ytzy is not null");
            return (Criteria) this;
        }

        public Criteria andYtzyEqualTo(String value) {
            addCriterion("ytzy =", value, "ytzy");
            return (Criteria) this;
        }

        public Criteria andYtzyNotEqualTo(String value) {
            addCriterion("ytzy <>", value, "ytzy");
            return (Criteria) this;
        }

        public Criteria andYtzyGreaterThan(String value) {
            addCriterion("ytzy >", value, "ytzy");
            return (Criteria) this;
        }

        public Criteria andYtzyGreaterThanOrEqualTo(String value) {
            addCriterion("ytzy >=", value, "ytzy");
            return (Criteria) this;
        }

        public Criteria andYtzyLessThan(String value) {
            addCriterion("ytzy <", value, "ytzy");
            return (Criteria) this;
        }

        public Criteria andYtzyLessThanOrEqualTo(String value) {
            addCriterion("ytzy <=", value, "ytzy");
            return (Criteria) this;
        }

        public Criteria andYtzyLike(String value) {
            addCriterion("ytzy like", value, "ytzy");
            return (Criteria) this;
        }

        public Criteria andYtzyNotLike(String value) {
            addCriterion("ytzy not like", value, "ytzy");
            return (Criteria) this;
        }

        public Criteria andYtzyIn(List<String> values) {
            addCriterion("ytzy in", values, "ytzy");
            return (Criteria) this;
        }

        public Criteria andYtzyNotIn(List<String> values) {
            addCriterion("ytzy not in", values, "ytzy");
            return (Criteria) this;
        }

        public Criteria andYtzyBetween(String value1, String value2) {
            addCriterion("ytzy between", value1, value2, "ytzy");
            return (Criteria) this;
        }

        public Criteria andYtzyNotBetween(String value1, String value2) {
            addCriterion("ytzy not between", value1, value2, "ytzy");
            return (Criteria) this;
        }

        public Criteria andLqzyIsNull() {
            addCriterion("lqzy is null");
            return (Criteria) this;
        }

        public Criteria andLqzyIsNotNull() {
            addCriterion("lqzy is not null");
            return (Criteria) this;
        }

        public Criteria andLqzyEqualTo(String value) {
            addCriterion("lqzy =", value, "lqzy");
            return (Criteria) this;
        }

        public Criteria andLqzyNotEqualTo(String value) {
            addCriterion("lqzy <>", value, "lqzy");
            return (Criteria) this;
        }

        public Criteria andLqzyGreaterThan(String value) {
            addCriterion("lqzy >", value, "lqzy");
            return (Criteria) this;
        }

        public Criteria andLqzyGreaterThanOrEqualTo(String value) {
            addCriterion("lqzy >=", value, "lqzy");
            return (Criteria) this;
        }

        public Criteria andLqzyLessThan(String value) {
            addCriterion("lqzy <", value, "lqzy");
            return (Criteria) this;
        }

        public Criteria andLqzyLessThanOrEqualTo(String value) {
            addCriterion("lqzy <=", value, "lqzy");
            return (Criteria) this;
        }

        public Criteria andLqzyLike(String value) {
            addCriterion("lqzy like", value, "lqzy");
            return (Criteria) this;
        }

        public Criteria andLqzyNotLike(String value) {
            addCriterion("lqzy not like", value, "lqzy");
            return (Criteria) this;
        }

        public Criteria andLqzyIn(List<String> values) {
            addCriterion("lqzy in", values, "lqzy");
            return (Criteria) this;
        }

        public Criteria andLqzyNotIn(List<String> values) {
            addCriterion("lqzy not in", values, "lqzy");
            return (Criteria) this;
        }

        public Criteria andLqzyBetween(String value1, String value2) {
            addCriterion("lqzy between", value1, value2, "lqzy");
            return (Criteria) this;
        }

        public Criteria andLqzyNotBetween(String value1, String value2) {
            addCriterion("lqzy not between", value1, value2, "lqzy");
            return (Criteria) this;
        }

        public Criteria andTdyydmIsNull() {
            addCriterion("tdyydm is null");
            return (Criteria) this;
        }

        public Criteria andTdyydmIsNotNull() {
            addCriterion("tdyydm is not null");
            return (Criteria) this;
        }

        public Criteria andTdyydmEqualTo(String value) {
            addCriterion("tdyydm =", value, "tdyydm");
            return (Criteria) this;
        }

        public Criteria andTdyydmNotEqualTo(String value) {
            addCriterion("tdyydm <>", value, "tdyydm");
            return (Criteria) this;
        }

        public Criteria andTdyydmGreaterThan(String value) {
            addCriterion("tdyydm >", value, "tdyydm");
            return (Criteria) this;
        }

        public Criteria andTdyydmGreaterThanOrEqualTo(String value) {
            addCriterion("tdyydm >=", value, "tdyydm");
            return (Criteria) this;
        }

        public Criteria andTdyydmLessThan(String value) {
            addCriterion("tdyydm <", value, "tdyydm");
            return (Criteria) this;
        }

        public Criteria andTdyydmLessThanOrEqualTo(String value) {
            addCriterion("tdyydm <=", value, "tdyydm");
            return (Criteria) this;
        }

        public Criteria andTdyydmLike(String value) {
            addCriterion("tdyydm like", value, "tdyydm");
            return (Criteria) this;
        }

        public Criteria andTdyydmNotLike(String value) {
            addCriterion("tdyydm not like", value, "tdyydm");
            return (Criteria) this;
        }

        public Criteria andTdyydmIn(List<String> values) {
            addCriterion("tdyydm in", values, "tdyydm");
            return (Criteria) this;
        }

        public Criteria andTdyydmNotIn(List<String> values) {
            addCriterion("tdyydm not in", values, "tdyydm");
            return (Criteria) this;
        }

        public Criteria andTdyydmBetween(String value1, String value2) {
            addCriterion("tdyydm between", value1, value2, "tdyydm");
            return (Criteria) this;
        }

        public Criteria andTdyydmNotBetween(String value1, String value2) {
            addCriterion("tdyydm not between", value1, value2, "tdyydm");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("bz is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("bz is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("bz =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("bz <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("bz >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("bz >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("bz <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("bz <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("bz like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("bz not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("bz in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("bz not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("bz between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("bz not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andZyhgIsNull() {
            addCriterion("zyhg is null");
            return (Criteria) this;
        }

        public Criteria andZyhgIsNotNull() {
            addCriterion("zyhg is not null");
            return (Criteria) this;
        }

        public Criteria andZyhgEqualTo(String value) {
            addCriterion("zyhg =", value, "zyhg");
            return (Criteria) this;
        }

        public Criteria andZyhgNotEqualTo(String value) {
            addCriterion("zyhg <>", value, "zyhg");
            return (Criteria) this;
        }

        public Criteria andZyhgGreaterThan(String value) {
            addCriterion("zyhg >", value, "zyhg");
            return (Criteria) this;
        }

        public Criteria andZyhgGreaterThanOrEqualTo(String value) {
            addCriterion("zyhg >=", value, "zyhg");
            return (Criteria) this;
        }

        public Criteria andZyhgLessThan(String value) {
            addCriterion("zyhg <", value, "zyhg");
            return (Criteria) this;
        }

        public Criteria andZyhgLessThanOrEqualTo(String value) {
            addCriterion("zyhg <=", value, "zyhg");
            return (Criteria) this;
        }

        public Criteria andZyhgLike(String value) {
            addCriterion("zyhg like", value, "zyhg");
            return (Criteria) this;
        }

        public Criteria andZyhgNotLike(String value) {
            addCriterion("zyhg not like", value, "zyhg");
            return (Criteria) this;
        }

        public Criteria andZyhgIn(List<String> values) {
            addCriterion("zyhg in", values, "zyhg");
            return (Criteria) this;
        }

        public Criteria andZyhgNotIn(List<String> values) {
            addCriterion("zyhg not in", values, "zyhg");
            return (Criteria) this;
        }

        public Criteria andZyhgBetween(String value1, String value2) {
            addCriterion("zyhg between", value1, value2, "zyhg");
            return (Criteria) this;
        }

        public Criteria andZyhgNotBetween(String value1, String value2) {
            addCriterion("zyhg not between", value1, value2, "zyhg");
            return (Criteria) this;
        }

        public Criteria andTjhgIsNull() {
            addCriterion("tjhg is null");
            return (Criteria) this;
        }

        public Criteria andTjhgIsNotNull() {
            addCriterion("tjhg is not null");
            return (Criteria) this;
        }

        public Criteria andTjhgEqualTo(String value) {
            addCriterion("tjhg =", value, "tjhg");
            return (Criteria) this;
        }

        public Criteria andTjhgNotEqualTo(String value) {
            addCriterion("tjhg <>", value, "tjhg");
            return (Criteria) this;
        }

        public Criteria andTjhgGreaterThan(String value) {
            addCriterion("tjhg >", value, "tjhg");
            return (Criteria) this;
        }

        public Criteria andTjhgGreaterThanOrEqualTo(String value) {
            addCriterion("tjhg >=", value, "tjhg");
            return (Criteria) this;
        }

        public Criteria andTjhgLessThan(String value) {
            addCriterion("tjhg <", value, "tjhg");
            return (Criteria) this;
        }

        public Criteria andTjhgLessThanOrEqualTo(String value) {
            addCriterion("tjhg <=", value, "tjhg");
            return (Criteria) this;
        }

        public Criteria andTjhgLike(String value) {
            addCriterion("tjhg like", value, "tjhg");
            return (Criteria) this;
        }

        public Criteria andTjhgNotLike(String value) {
            addCriterion("tjhg not like", value, "tjhg");
            return (Criteria) this;
        }

        public Criteria andTjhgIn(List<String> values) {
            addCriterion("tjhg in", values, "tjhg");
            return (Criteria) this;
        }

        public Criteria andTjhgNotIn(List<String> values) {
            addCriterion("tjhg not in", values, "tjhg");
            return (Criteria) this;
        }

        public Criteria andTjhgBetween(String value1, String value2) {
            addCriterion("tjhg between", value1, value2, "tjhg");
            return (Criteria) this;
        }

        public Criteria andTjhgNotBetween(String value1, String value2) {
            addCriterion("tjhg not between", value1, value2, "tjhg");
            return (Criteria) this;
        }

        public Criteria andLqfsIsNull() {
            addCriterion("lqfs is null");
            return (Criteria) this;
        }

        public Criteria andLqfsIsNotNull() {
            addCriterion("lqfs is not null");
            return (Criteria) this;
        }

        public Criteria andLqfsEqualTo(String value) {
            addCriterion("lqfs =", value, "lqfs");
            return (Criteria) this;
        }

        public Criteria andLqfsNotEqualTo(String value) {
            addCriterion("lqfs <>", value, "lqfs");
            return (Criteria) this;
        }

        public Criteria andLqfsGreaterThan(String value) {
            addCriterion("lqfs >", value, "lqfs");
            return (Criteria) this;
        }

        public Criteria andLqfsGreaterThanOrEqualTo(String value) {
            addCriterion("lqfs >=", value, "lqfs");
            return (Criteria) this;
        }

        public Criteria andLqfsLessThan(String value) {
            addCriterion("lqfs <", value, "lqfs");
            return (Criteria) this;
        }

        public Criteria andLqfsLessThanOrEqualTo(String value) {
            addCriterion("lqfs <=", value, "lqfs");
            return (Criteria) this;
        }

        public Criteria andLqfsLike(String value) {
            addCriterion("lqfs like", value, "lqfs");
            return (Criteria) this;
        }

        public Criteria andLqfsNotLike(String value) {
            addCriterion("lqfs not like", value, "lqfs");
            return (Criteria) this;
        }

        public Criteria andLqfsIn(List<String> values) {
            addCriterion("lqfs in", values, "lqfs");
            return (Criteria) this;
        }

        public Criteria andLqfsNotIn(List<String> values) {
            addCriterion("lqfs not in", values, "lqfs");
            return (Criteria) this;
        }

        public Criteria andLqfsBetween(String value1, String value2) {
            addCriterion("lqfs between", value1, value2, "lqfs");
            return (Criteria) this;
        }

        public Criteria andLqfsNotBetween(String value1, String value2) {
            addCriterion("lqfs not between", value1, value2, "lqfs");
            return (Criteria) this;
        }

        public Criteria andKsztIsNull() {
            addCriterion("kszt is null");
            return (Criteria) this;
        }

        public Criteria andKsztIsNotNull() {
            addCriterion("kszt is not null");
            return (Criteria) this;
        }

        public Criteria andKsztEqualTo(String value) {
            addCriterion("kszt =", value, "kszt");
            return (Criteria) this;
        }

        public Criteria andKsztNotEqualTo(String value) {
            addCriterion("kszt <>", value, "kszt");
            return (Criteria) this;
        }

        public Criteria andKsztGreaterThan(String value) {
            addCriterion("kszt >", value, "kszt");
            return (Criteria) this;
        }

        public Criteria andKsztGreaterThanOrEqualTo(String value) {
            addCriterion("kszt >=", value, "kszt");
            return (Criteria) this;
        }

        public Criteria andKsztLessThan(String value) {
            addCriterion("kszt <", value, "kszt");
            return (Criteria) this;
        }

        public Criteria andKsztLessThanOrEqualTo(String value) {
            addCriterion("kszt <=", value, "kszt");
            return (Criteria) this;
        }

        public Criteria andKsztLike(String value) {
            addCriterion("kszt like", value, "kszt");
            return (Criteria) this;
        }

        public Criteria andKsztNotLike(String value) {
            addCriterion("kszt not like", value, "kszt");
            return (Criteria) this;
        }

        public Criteria andKsztIn(List<String> values) {
            addCriterion("kszt in", values, "kszt");
            return (Criteria) this;
        }

        public Criteria andKsztNotIn(List<String> values) {
            addCriterion("kszt not in", values, "kszt");
            return (Criteria) this;
        }

        public Criteria andKsztBetween(String value1, String value2) {
            addCriterion("kszt between", value1, value2, "kszt");
            return (Criteria) this;
        }

        public Criteria andKsztNotBetween(String value1, String value2) {
            addCriterion("kszt not between", value1, value2, "kszt");
            return (Criteria) this;
        }

        public Criteria andSdbzIsNull() {
            addCriterion("sdbz is null");
            return (Criteria) this;
        }

        public Criteria andSdbzIsNotNull() {
            addCriterion("sdbz is not null");
            return (Criteria) this;
        }

        public Criteria andSdbzEqualTo(String value) {
            addCriterion("sdbz =", value, "sdbz");
            return (Criteria) this;
        }

        public Criteria andSdbzNotEqualTo(String value) {
            addCriterion("sdbz <>", value, "sdbz");
            return (Criteria) this;
        }

        public Criteria andSdbzGreaterThan(String value) {
            addCriterion("sdbz >", value, "sdbz");
            return (Criteria) this;
        }

        public Criteria andSdbzGreaterThanOrEqualTo(String value) {
            addCriterion("sdbz >=", value, "sdbz");
            return (Criteria) this;
        }

        public Criteria andSdbzLessThan(String value) {
            addCriterion("sdbz <", value, "sdbz");
            return (Criteria) this;
        }

        public Criteria andSdbzLessThanOrEqualTo(String value) {
            addCriterion("sdbz <=", value, "sdbz");
            return (Criteria) this;
        }

        public Criteria andSdbzLike(String value) {
            addCriterion("sdbz like", value, "sdbz");
            return (Criteria) this;
        }

        public Criteria andSdbzNotLike(String value) {
            addCriterion("sdbz not like", value, "sdbz");
            return (Criteria) this;
        }

        public Criteria andSdbzIn(List<String> values) {
            addCriterion("sdbz in", values, "sdbz");
            return (Criteria) this;
        }

        public Criteria andSdbzNotIn(List<String> values) {
            addCriterion("sdbz not in", values, "sdbz");
            return (Criteria) this;
        }

        public Criteria andSdbzBetween(String value1, String value2) {
            addCriterion("sdbz between", value1, value2, "sdbz");
            return (Criteria) this;
        }

        public Criteria andSdbzNotBetween(String value1, String value2) {
            addCriterion("sdbz not between", value1, value2, "sdbz");
            return (Criteria) this;
        }

        public Criteria andTddwdm1IsNull() {
            addCriterion("tddwdm1 is null");
            return (Criteria) this;
        }

        public Criteria andTddwdm1IsNotNull() {
            addCriterion("tddwdm1 is not null");
            return (Criteria) this;
        }

        public Criteria andTddwdm1EqualTo(String value) {
            addCriterion("tddwdm1 =", value, "tddwdm1");
            return (Criteria) this;
        }

        public Criteria andTddwdm1NotEqualTo(String value) {
            addCriterion("tddwdm1 <>", value, "tddwdm1");
            return (Criteria) this;
        }

        public Criteria andTddwdm1GreaterThan(String value) {
            addCriterion("tddwdm1 >", value, "tddwdm1");
            return (Criteria) this;
        }

        public Criteria andTddwdm1GreaterThanOrEqualTo(String value) {
            addCriterion("tddwdm1 >=", value, "tddwdm1");
            return (Criteria) this;
        }

        public Criteria andTddwdm1LessThan(String value) {
            addCriterion("tddwdm1 <", value, "tddwdm1");
            return (Criteria) this;
        }

        public Criteria andTddwdm1LessThanOrEqualTo(String value) {
            addCriterion("tddwdm1 <=", value, "tddwdm1");
            return (Criteria) this;
        }

        public Criteria andTddwdm1Like(String value) {
            addCriterion("tddwdm1 like", value, "tddwdm1");
            return (Criteria) this;
        }

        public Criteria andTddwdm1NotLike(String value) {
            addCriterion("tddwdm1 not like", value, "tddwdm1");
            return (Criteria) this;
        }

        public Criteria andTddwdm1In(List<String> values) {
            addCriterion("tddwdm1 in", values, "tddwdm1");
            return (Criteria) this;
        }

        public Criteria andTddwdm1NotIn(List<String> values) {
            addCriterion("tddwdm1 not in", values, "tddwdm1");
            return (Criteria) this;
        }

        public Criteria andTddwdm1Between(String value1, String value2) {
            addCriterion("tddwdm1 between", value1, value2, "tddwdm1");
            return (Criteria) this;
        }

        public Criteria andTddwdm1NotBetween(String value1, String value2) {
            addCriterion("tddwdm1 not between", value1, value2, "tddwdm1");
            return (Criteria) this;
        }

        public Criteria andZydh1IsNull() {
            addCriterion("zydh1 is null");
            return (Criteria) this;
        }

        public Criteria andZydh1IsNotNull() {
            addCriterion("zydh1 is not null");
            return (Criteria) this;
        }

        public Criteria andZydh1EqualTo(String value) {
            addCriterion("zydh1 =", value, "zydh1");
            return (Criteria) this;
        }

        public Criteria andZydh1NotEqualTo(String value) {
            addCriterion("zydh1 <>", value, "zydh1");
            return (Criteria) this;
        }

        public Criteria andZydh1GreaterThan(String value) {
            addCriterion("zydh1 >", value, "zydh1");
            return (Criteria) this;
        }

        public Criteria andZydh1GreaterThanOrEqualTo(String value) {
            addCriterion("zydh1 >=", value, "zydh1");
            return (Criteria) this;
        }

        public Criteria andZydh1LessThan(String value) {
            addCriterion("zydh1 <", value, "zydh1");
            return (Criteria) this;
        }

        public Criteria andZydh1LessThanOrEqualTo(String value) {
            addCriterion("zydh1 <=", value, "zydh1");
            return (Criteria) this;
        }

        public Criteria andZydh1Like(String value) {
            addCriterion("zydh1 like", value, "zydh1");
            return (Criteria) this;
        }

        public Criteria andZydh1NotLike(String value) {
            addCriterion("zydh1 not like", value, "zydh1");
            return (Criteria) this;
        }

        public Criteria andZydh1In(List<String> values) {
            addCriterion("zydh1 in", values, "zydh1");
            return (Criteria) this;
        }

        public Criteria andZydh1NotIn(List<String> values) {
            addCriterion("zydh1 not in", values, "zydh1");
            return (Criteria) this;
        }

        public Criteria andZydh1Between(String value1, String value2) {
            addCriterion("zydh1 between", value1, value2, "zydh1");
            return (Criteria) this;
        }

        public Criteria andZydh1NotBetween(String value1, String value2) {
            addCriterion("zydh1 not between", value1, value2, "zydh1");
            return (Criteria) this;
        }

        public Criteria andTddwdm2IsNull() {
            addCriterion("tddwdm2 is null");
            return (Criteria) this;
        }

        public Criteria andTddwdm2IsNotNull() {
            addCriterion("tddwdm2 is not null");
            return (Criteria) this;
        }

        public Criteria andTddwdm2EqualTo(String value) {
            addCriterion("tddwdm2 =", value, "tddwdm2");
            return (Criteria) this;
        }

        public Criteria andTddwdm2NotEqualTo(String value) {
            addCriterion("tddwdm2 <>", value, "tddwdm2");
            return (Criteria) this;
        }

        public Criteria andTddwdm2GreaterThan(String value) {
            addCriterion("tddwdm2 >", value, "tddwdm2");
            return (Criteria) this;
        }

        public Criteria andTddwdm2GreaterThanOrEqualTo(String value) {
            addCriterion("tddwdm2 >=", value, "tddwdm2");
            return (Criteria) this;
        }

        public Criteria andTddwdm2LessThan(String value) {
            addCriterion("tddwdm2 <", value, "tddwdm2");
            return (Criteria) this;
        }

        public Criteria andTddwdm2LessThanOrEqualTo(String value) {
            addCriterion("tddwdm2 <=", value, "tddwdm2");
            return (Criteria) this;
        }

        public Criteria andTddwdm2Like(String value) {
            addCriterion("tddwdm2 like", value, "tddwdm2");
            return (Criteria) this;
        }

        public Criteria andTddwdm2NotLike(String value) {
            addCriterion("tddwdm2 not like", value, "tddwdm2");
            return (Criteria) this;
        }

        public Criteria andTddwdm2In(List<String> values) {
            addCriterion("tddwdm2 in", values, "tddwdm2");
            return (Criteria) this;
        }

        public Criteria andTddwdm2NotIn(List<String> values) {
            addCriterion("tddwdm2 not in", values, "tddwdm2");
            return (Criteria) this;
        }

        public Criteria andTddwdm2Between(String value1, String value2) {
            addCriterion("tddwdm2 between", value1, value2, "tddwdm2");
            return (Criteria) this;
        }

        public Criteria andTddwdm2NotBetween(String value1, String value2) {
            addCriterion("tddwdm2 not between", value1, value2, "tddwdm2");
            return (Criteria) this;
        }

        public Criteria andZydh2IsNull() {
            addCriterion("zydh2 is null");
            return (Criteria) this;
        }

        public Criteria andZydh2IsNotNull() {
            addCriterion("zydh2 is not null");
            return (Criteria) this;
        }

        public Criteria andZydh2EqualTo(String value) {
            addCriterion("zydh2 =", value, "zydh2");
            return (Criteria) this;
        }

        public Criteria andZydh2NotEqualTo(String value) {
            addCriterion("zydh2 <>", value, "zydh2");
            return (Criteria) this;
        }

        public Criteria andZydh2GreaterThan(String value) {
            addCriterion("zydh2 >", value, "zydh2");
            return (Criteria) this;
        }

        public Criteria andZydh2GreaterThanOrEqualTo(String value) {
            addCriterion("zydh2 >=", value, "zydh2");
            return (Criteria) this;
        }

        public Criteria andZydh2LessThan(String value) {
            addCriterion("zydh2 <", value, "zydh2");
            return (Criteria) this;
        }

        public Criteria andZydh2LessThanOrEqualTo(String value) {
            addCriterion("zydh2 <=", value, "zydh2");
            return (Criteria) this;
        }

        public Criteria andZydh2Like(String value) {
            addCriterion("zydh2 like", value, "zydh2");
            return (Criteria) this;
        }

        public Criteria andZydh2NotLike(String value) {
            addCriterion("zydh2 not like", value, "zydh2");
            return (Criteria) this;
        }

        public Criteria andZydh2In(List<String> values) {
            addCriterion("zydh2 in", values, "zydh2");
            return (Criteria) this;
        }

        public Criteria andZydh2NotIn(List<String> values) {
            addCriterion("zydh2 not in", values, "zydh2");
            return (Criteria) this;
        }

        public Criteria andZydh2Between(String value1, String value2) {
            addCriterion("zydh2 between", value1, value2, "zydh2");
            return (Criteria) this;
        }

        public Criteria andZydh2NotBetween(String value1, String value2) {
            addCriterion("zydh2 not between", value1, value2, "zydh2");
            return (Criteria) this;
        }

        public Criteria andTddwdm3IsNull() {
            addCriterion("tddwdm3 is null");
            return (Criteria) this;
        }

        public Criteria andTddwdm3IsNotNull() {
            addCriterion("tddwdm3 is not null");
            return (Criteria) this;
        }

        public Criteria andTddwdm3EqualTo(String value) {
            addCriterion("tddwdm3 =", value, "tddwdm3");
            return (Criteria) this;
        }

        public Criteria andTddwdm3NotEqualTo(String value) {
            addCriterion("tddwdm3 <>", value, "tddwdm3");
            return (Criteria) this;
        }

        public Criteria andTddwdm3GreaterThan(String value) {
            addCriterion("tddwdm3 >", value, "tddwdm3");
            return (Criteria) this;
        }

        public Criteria andTddwdm3GreaterThanOrEqualTo(String value) {
            addCriterion("tddwdm3 >=", value, "tddwdm3");
            return (Criteria) this;
        }

        public Criteria andTddwdm3LessThan(String value) {
            addCriterion("tddwdm3 <", value, "tddwdm3");
            return (Criteria) this;
        }

        public Criteria andTddwdm3LessThanOrEqualTo(String value) {
            addCriterion("tddwdm3 <=", value, "tddwdm3");
            return (Criteria) this;
        }

        public Criteria andTddwdm3Like(String value) {
            addCriterion("tddwdm3 like", value, "tddwdm3");
            return (Criteria) this;
        }

        public Criteria andTddwdm3NotLike(String value) {
            addCriterion("tddwdm3 not like", value, "tddwdm3");
            return (Criteria) this;
        }

        public Criteria andTddwdm3In(List<String> values) {
            addCriterion("tddwdm3 in", values, "tddwdm3");
            return (Criteria) this;
        }

        public Criteria andTddwdm3NotIn(List<String> values) {
            addCriterion("tddwdm3 not in", values, "tddwdm3");
            return (Criteria) this;
        }

        public Criteria andTddwdm3Between(String value1, String value2) {
            addCriterion("tddwdm3 between", value1, value2, "tddwdm3");
            return (Criteria) this;
        }

        public Criteria andTddwdm3NotBetween(String value1, String value2) {
            addCriterion("tddwdm3 not between", value1, value2, "tddwdm3");
            return (Criteria) this;
        }

        public Criteria andZydh3IsNull() {
            addCriterion("zydh3 is null");
            return (Criteria) this;
        }

        public Criteria andZydh3IsNotNull() {
            addCriterion("zydh3 is not null");
            return (Criteria) this;
        }

        public Criteria andZydh3EqualTo(String value) {
            addCriterion("zydh3 =", value, "zydh3");
            return (Criteria) this;
        }

        public Criteria andZydh3NotEqualTo(String value) {
            addCriterion("zydh3 <>", value, "zydh3");
            return (Criteria) this;
        }

        public Criteria andZydh3GreaterThan(String value) {
            addCriterion("zydh3 >", value, "zydh3");
            return (Criteria) this;
        }

        public Criteria andZydh3GreaterThanOrEqualTo(String value) {
            addCriterion("zydh3 >=", value, "zydh3");
            return (Criteria) this;
        }

        public Criteria andZydh3LessThan(String value) {
            addCriterion("zydh3 <", value, "zydh3");
            return (Criteria) this;
        }

        public Criteria andZydh3LessThanOrEqualTo(String value) {
            addCriterion("zydh3 <=", value, "zydh3");
            return (Criteria) this;
        }

        public Criteria andZydh3Like(String value) {
            addCriterion("zydh3 like", value, "zydh3");
            return (Criteria) this;
        }

        public Criteria andZydh3NotLike(String value) {
            addCriterion("zydh3 not like", value, "zydh3");
            return (Criteria) this;
        }

        public Criteria andZydh3In(List<String> values) {
            addCriterion("zydh3 in", values, "zydh3");
            return (Criteria) this;
        }

        public Criteria andZydh3NotIn(List<String> values) {
            addCriterion("zydh3 not in", values, "zydh3");
            return (Criteria) this;
        }

        public Criteria andZydh3Between(String value1, String value2) {
            addCriterion("zydh3 between", value1, value2, "zydh3");
            return (Criteria) this;
        }

        public Criteria andZydh3NotBetween(String value1, String value2) {
            addCriterion("zydh3 not between", value1, value2, "zydh3");
            return (Criteria) this;
        }

        public Criteria andTddwdm4IsNull() {
            addCriterion("tddwdm4 is null");
            return (Criteria) this;
        }

        public Criteria andTddwdm4IsNotNull() {
            addCriterion("tddwdm4 is not null");
            return (Criteria) this;
        }

        public Criteria andTddwdm4EqualTo(String value) {
            addCriterion("tddwdm4 =", value, "tddwdm4");
            return (Criteria) this;
        }

        public Criteria andTddwdm4NotEqualTo(String value) {
            addCriterion("tddwdm4 <>", value, "tddwdm4");
            return (Criteria) this;
        }

        public Criteria andTddwdm4GreaterThan(String value) {
            addCriterion("tddwdm4 >", value, "tddwdm4");
            return (Criteria) this;
        }

        public Criteria andTddwdm4GreaterThanOrEqualTo(String value) {
            addCriterion("tddwdm4 >=", value, "tddwdm4");
            return (Criteria) this;
        }

        public Criteria andTddwdm4LessThan(String value) {
            addCriterion("tddwdm4 <", value, "tddwdm4");
            return (Criteria) this;
        }

        public Criteria andTddwdm4LessThanOrEqualTo(String value) {
            addCriterion("tddwdm4 <=", value, "tddwdm4");
            return (Criteria) this;
        }

        public Criteria andTddwdm4Like(String value) {
            addCriterion("tddwdm4 like", value, "tddwdm4");
            return (Criteria) this;
        }

        public Criteria andTddwdm4NotLike(String value) {
            addCriterion("tddwdm4 not like", value, "tddwdm4");
            return (Criteria) this;
        }

        public Criteria andTddwdm4In(List<String> values) {
            addCriterion("tddwdm4 in", values, "tddwdm4");
            return (Criteria) this;
        }

        public Criteria andTddwdm4NotIn(List<String> values) {
            addCriterion("tddwdm4 not in", values, "tddwdm4");
            return (Criteria) this;
        }

        public Criteria andTddwdm4Between(String value1, String value2) {
            addCriterion("tddwdm4 between", value1, value2, "tddwdm4");
            return (Criteria) this;
        }

        public Criteria andTddwdm4NotBetween(String value1, String value2) {
            addCriterion("tddwdm4 not between", value1, value2, "tddwdm4");
            return (Criteria) this;
        }

        public Criteria andZydh4IsNull() {
            addCriterion("zydh4 is null");
            return (Criteria) this;
        }

        public Criteria andZydh4IsNotNull() {
            addCriterion("zydh4 is not null");
            return (Criteria) this;
        }

        public Criteria andZydh4EqualTo(String value) {
            addCriterion("zydh4 =", value, "zydh4");
            return (Criteria) this;
        }

        public Criteria andZydh4NotEqualTo(String value) {
            addCriterion("zydh4 <>", value, "zydh4");
            return (Criteria) this;
        }

        public Criteria andZydh4GreaterThan(String value) {
            addCriterion("zydh4 >", value, "zydh4");
            return (Criteria) this;
        }

        public Criteria andZydh4GreaterThanOrEqualTo(String value) {
            addCriterion("zydh4 >=", value, "zydh4");
            return (Criteria) this;
        }

        public Criteria andZydh4LessThan(String value) {
            addCriterion("zydh4 <", value, "zydh4");
            return (Criteria) this;
        }

        public Criteria andZydh4LessThanOrEqualTo(String value) {
            addCriterion("zydh4 <=", value, "zydh4");
            return (Criteria) this;
        }

        public Criteria andZydh4Like(String value) {
            addCriterion("zydh4 like", value, "zydh4");
            return (Criteria) this;
        }

        public Criteria andZydh4NotLike(String value) {
            addCriterion("zydh4 not like", value, "zydh4");
            return (Criteria) this;
        }

        public Criteria andZydh4In(List<String> values) {
            addCriterion("zydh4 in", values, "zydh4");
            return (Criteria) this;
        }

        public Criteria andZydh4NotIn(List<String> values) {
            addCriterion("zydh4 not in", values, "zydh4");
            return (Criteria) this;
        }

        public Criteria andZydh4Between(String value1, String value2) {
            addCriterion("zydh4 between", value1, value2, "zydh4");
            return (Criteria) this;
        }

        public Criteria andZydh4NotBetween(String value1, String value2) {
            addCriterion("zydh4 not between", value1, value2, "zydh4");
            return (Criteria) this;
        }

        public Criteria andTddwdm5IsNull() {
            addCriterion("tddwdm5 is null");
            return (Criteria) this;
        }

        public Criteria andTddwdm5IsNotNull() {
            addCriterion("tddwdm5 is not null");
            return (Criteria) this;
        }

        public Criteria andTddwdm5EqualTo(String value) {
            addCriterion("tddwdm5 =", value, "tddwdm5");
            return (Criteria) this;
        }

        public Criteria andTddwdm5NotEqualTo(String value) {
            addCriterion("tddwdm5 <>", value, "tddwdm5");
            return (Criteria) this;
        }

        public Criteria andTddwdm5GreaterThan(String value) {
            addCriterion("tddwdm5 >", value, "tddwdm5");
            return (Criteria) this;
        }

        public Criteria andTddwdm5GreaterThanOrEqualTo(String value) {
            addCriterion("tddwdm5 >=", value, "tddwdm5");
            return (Criteria) this;
        }

        public Criteria andTddwdm5LessThan(String value) {
            addCriterion("tddwdm5 <", value, "tddwdm5");
            return (Criteria) this;
        }

        public Criteria andTddwdm5LessThanOrEqualTo(String value) {
            addCriterion("tddwdm5 <=", value, "tddwdm5");
            return (Criteria) this;
        }

        public Criteria andTddwdm5Like(String value) {
            addCriterion("tddwdm5 like", value, "tddwdm5");
            return (Criteria) this;
        }

        public Criteria andTddwdm5NotLike(String value) {
            addCriterion("tddwdm5 not like", value, "tddwdm5");
            return (Criteria) this;
        }

        public Criteria andTddwdm5In(List<String> values) {
            addCriterion("tddwdm5 in", values, "tddwdm5");
            return (Criteria) this;
        }

        public Criteria andTddwdm5NotIn(List<String> values) {
            addCriterion("tddwdm5 not in", values, "tddwdm5");
            return (Criteria) this;
        }

        public Criteria andTddwdm5Between(String value1, String value2) {
            addCriterion("tddwdm5 between", value1, value2, "tddwdm5");
            return (Criteria) this;
        }

        public Criteria andTddwdm5NotBetween(String value1, String value2) {
            addCriterion("tddwdm5 not between", value1, value2, "tddwdm5");
            return (Criteria) this;
        }

        public Criteria andZydh5IsNull() {
            addCriterion("zydh5 is null");
            return (Criteria) this;
        }

        public Criteria andZydh5IsNotNull() {
            addCriterion("zydh5 is not null");
            return (Criteria) this;
        }

        public Criteria andZydh5EqualTo(String value) {
            addCriterion("zydh5 =", value, "zydh5");
            return (Criteria) this;
        }

        public Criteria andZydh5NotEqualTo(String value) {
            addCriterion("zydh5 <>", value, "zydh5");
            return (Criteria) this;
        }

        public Criteria andZydh5GreaterThan(String value) {
            addCriterion("zydh5 >", value, "zydh5");
            return (Criteria) this;
        }

        public Criteria andZydh5GreaterThanOrEqualTo(String value) {
            addCriterion("zydh5 >=", value, "zydh5");
            return (Criteria) this;
        }

        public Criteria andZydh5LessThan(String value) {
            addCriterion("zydh5 <", value, "zydh5");
            return (Criteria) this;
        }

        public Criteria andZydh5LessThanOrEqualTo(String value) {
            addCriterion("zydh5 <=", value, "zydh5");
            return (Criteria) this;
        }

        public Criteria andZydh5Like(String value) {
            addCriterion("zydh5 like", value, "zydh5");
            return (Criteria) this;
        }

        public Criteria andZydh5NotLike(String value) {
            addCriterion("zydh5 not like", value, "zydh5");
            return (Criteria) this;
        }

        public Criteria andZydh5In(List<String> values) {
            addCriterion("zydh5 in", values, "zydh5");
            return (Criteria) this;
        }

        public Criteria andZydh5NotIn(List<String> values) {
            addCriterion("zydh5 not in", values, "zydh5");
            return (Criteria) this;
        }

        public Criteria andZydh5Between(String value1, String value2) {
            addCriterion("zydh5 between", value1, value2, "zydh5");
            return (Criteria) this;
        }

        public Criteria andZydh5NotBetween(String value1, String value2) {
            addCriterion("zydh5 not between", value1, value2, "zydh5");
            return (Criteria) this;
        }

        public Criteria andTddwdm6IsNull() {
            addCriterion("tddwdm6 is null");
            return (Criteria) this;
        }

        public Criteria andTddwdm6IsNotNull() {
            addCriterion("tddwdm6 is not null");
            return (Criteria) this;
        }

        public Criteria andTddwdm6EqualTo(String value) {
            addCriterion("tddwdm6 =", value, "tddwdm6");
            return (Criteria) this;
        }

        public Criteria andTddwdm6NotEqualTo(String value) {
            addCriterion("tddwdm6 <>", value, "tddwdm6");
            return (Criteria) this;
        }

        public Criteria andTddwdm6GreaterThan(String value) {
            addCriterion("tddwdm6 >", value, "tddwdm6");
            return (Criteria) this;
        }

        public Criteria andTddwdm6GreaterThanOrEqualTo(String value) {
            addCriterion("tddwdm6 >=", value, "tddwdm6");
            return (Criteria) this;
        }

        public Criteria andTddwdm6LessThan(String value) {
            addCriterion("tddwdm6 <", value, "tddwdm6");
            return (Criteria) this;
        }

        public Criteria andTddwdm6LessThanOrEqualTo(String value) {
            addCriterion("tddwdm6 <=", value, "tddwdm6");
            return (Criteria) this;
        }

        public Criteria andTddwdm6Like(String value) {
            addCriterion("tddwdm6 like", value, "tddwdm6");
            return (Criteria) this;
        }

        public Criteria andTddwdm6NotLike(String value) {
            addCriterion("tddwdm6 not like", value, "tddwdm6");
            return (Criteria) this;
        }

        public Criteria andTddwdm6In(List<String> values) {
            addCriterion("tddwdm6 in", values, "tddwdm6");
            return (Criteria) this;
        }

        public Criteria andTddwdm6NotIn(List<String> values) {
            addCriterion("tddwdm6 not in", values, "tddwdm6");
            return (Criteria) this;
        }

        public Criteria andTddwdm6Between(String value1, String value2) {
            addCriterion("tddwdm6 between", value1, value2, "tddwdm6");
            return (Criteria) this;
        }

        public Criteria andTddwdm6NotBetween(String value1, String value2) {
            addCriterion("tddwdm6 not between", value1, value2, "tddwdm6");
            return (Criteria) this;
        }

        public Criteria andZydh6IsNull() {
            addCriterion("zydh6 is null");
            return (Criteria) this;
        }

        public Criteria andZydh6IsNotNull() {
            addCriterion("zydh6 is not null");
            return (Criteria) this;
        }

        public Criteria andZydh6EqualTo(String value) {
            addCriterion("zydh6 =", value, "zydh6");
            return (Criteria) this;
        }

        public Criteria andZydh6NotEqualTo(String value) {
            addCriterion("zydh6 <>", value, "zydh6");
            return (Criteria) this;
        }

        public Criteria andZydh6GreaterThan(String value) {
            addCriterion("zydh6 >", value, "zydh6");
            return (Criteria) this;
        }

        public Criteria andZydh6GreaterThanOrEqualTo(String value) {
            addCriterion("zydh6 >=", value, "zydh6");
            return (Criteria) this;
        }

        public Criteria andZydh6LessThan(String value) {
            addCriterion("zydh6 <", value, "zydh6");
            return (Criteria) this;
        }

        public Criteria andZydh6LessThanOrEqualTo(String value) {
            addCriterion("zydh6 <=", value, "zydh6");
            return (Criteria) this;
        }

        public Criteria andZydh6Like(String value) {
            addCriterion("zydh6 like", value, "zydh6");
            return (Criteria) this;
        }

        public Criteria andZydh6NotLike(String value) {
            addCriterion("zydh6 not like", value, "zydh6");
            return (Criteria) this;
        }

        public Criteria andZydh6In(List<String> values) {
            addCriterion("zydh6 in", values, "zydh6");
            return (Criteria) this;
        }

        public Criteria andZydh6NotIn(List<String> values) {
            addCriterion("zydh6 not in", values, "zydh6");
            return (Criteria) this;
        }

        public Criteria andZydh6Between(String value1, String value2) {
            addCriterion("zydh6 between", value1, value2, "zydh6");
            return (Criteria) this;
        }

        public Criteria andZydh6NotBetween(String value1, String value2) {
            addCriterion("zydh6 not between", value1, value2, "zydh6");
            return (Criteria) this;
        }

        public Criteria andZytzIsNull() {
            addCriterion("zytz is null");
            return (Criteria) this;
        }

        public Criteria andZytzIsNotNull() {
            addCriterion("zytz is not null");
            return (Criteria) this;
        }

        public Criteria andZytzEqualTo(String value) {
            addCriterion("zytz =", value, "zytz");
            return (Criteria) this;
        }

        public Criteria andZytzNotEqualTo(String value) {
            addCriterion("zytz <>", value, "zytz");
            return (Criteria) this;
        }

        public Criteria andZytzGreaterThan(String value) {
            addCriterion("zytz >", value, "zytz");
            return (Criteria) this;
        }

        public Criteria andZytzGreaterThanOrEqualTo(String value) {
            addCriterion("zytz >=", value, "zytz");
            return (Criteria) this;
        }

        public Criteria andZytzLessThan(String value) {
            addCriterion("zytz <", value, "zytz");
            return (Criteria) this;
        }

        public Criteria andZytzLessThanOrEqualTo(String value) {
            addCriterion("zytz <=", value, "zytz");
            return (Criteria) this;
        }

        public Criteria andZytzLike(String value) {
            addCriterion("zytz like", value, "zytz");
            return (Criteria) this;
        }

        public Criteria andZytzNotLike(String value) {
            addCriterion("zytz not like", value, "zytz");
            return (Criteria) this;
        }

        public Criteria andZytzIn(List<String> values) {
            addCriterion("zytz in", values, "zytz");
            return (Criteria) this;
        }

        public Criteria andZytzNotIn(List<String> values) {
            addCriterion("zytz not in", values, "zytz");
            return (Criteria) this;
        }

        public Criteria andZytzBetween(String value1, String value2) {
            addCriterion("zytz between", value1, value2, "zytz");
            return (Criteria) this;
        }

        public Criteria andZytzNotBetween(String value1, String value2) {
            addCriterion("zytz not between", value1, value2, "zytz");
            return (Criteria) this;
        }

        public Criteria andZyzytjIsNull() {
            addCriterion("zyzytj is null");
            return (Criteria) this;
        }

        public Criteria andZyzytjIsNotNull() {
            addCriterion("zyzytj is not null");
            return (Criteria) this;
        }

        public Criteria andZyzytjEqualTo(String value) {
            addCriterion("zyzytj =", value, "zyzytj");
            return (Criteria) this;
        }

        public Criteria andZyzytjNotEqualTo(String value) {
            addCriterion("zyzytj <>", value, "zyzytj");
            return (Criteria) this;
        }

        public Criteria andZyzytjGreaterThan(String value) {
            addCriterion("zyzytj >", value, "zyzytj");
            return (Criteria) this;
        }

        public Criteria andZyzytjGreaterThanOrEqualTo(String value) {
            addCriterion("zyzytj >=", value, "zyzytj");
            return (Criteria) this;
        }

        public Criteria andZyzytjLessThan(String value) {
            addCriterion("zyzytj <", value, "zyzytj");
            return (Criteria) this;
        }

        public Criteria andZyzytjLessThanOrEqualTo(String value) {
            addCriterion("zyzytj <=", value, "zyzytj");
            return (Criteria) this;
        }

        public Criteria andZyzytjLike(String value) {
            addCriterion("zyzytj like", value, "zyzytj");
            return (Criteria) this;
        }

        public Criteria andZyzytjNotLike(String value) {
            addCriterion("zyzytj not like", value, "zyzytj");
            return (Criteria) this;
        }

        public Criteria andZyzytjIn(List<String> values) {
            addCriterion("zyzytj in", values, "zyzytj");
            return (Criteria) this;
        }

        public Criteria andZyzytjNotIn(List<String> values) {
            addCriterion("zyzytj not in", values, "zyzytj");
            return (Criteria) this;
        }

        public Criteria andZyzytjBetween(String value1, String value2) {
            addCriterion("zyzytj between", value1, value2, "zyzytj");
            return (Criteria) this;
        }

        public Criteria andZyzytjNotBetween(String value1, String value2) {
            addCriterion("zyzytj not between", value1, value2, "zyzytj");
            return (Criteria) this;
        }

        public Criteria andDxtjIsNull() {
            addCriterion("dxtj is null");
            return (Criteria) this;
        }

        public Criteria andDxtjIsNotNull() {
            addCriterion("dxtj is not null");
            return (Criteria) this;
        }

        public Criteria andDxtjEqualTo(String value) {
            addCriterion("dxtj =", value, "dxtj");
            return (Criteria) this;
        }

        public Criteria andDxtjNotEqualTo(String value) {
            addCriterion("dxtj <>", value, "dxtj");
            return (Criteria) this;
        }

        public Criteria andDxtjGreaterThan(String value) {
            addCriterion("dxtj >", value, "dxtj");
            return (Criteria) this;
        }

        public Criteria andDxtjGreaterThanOrEqualTo(String value) {
            addCriterion("dxtj >=", value, "dxtj");
            return (Criteria) this;
        }

        public Criteria andDxtjLessThan(String value) {
            addCriterion("dxtj <", value, "dxtj");
            return (Criteria) this;
        }

        public Criteria andDxtjLessThanOrEqualTo(String value) {
            addCriterion("dxtj <=", value, "dxtj");
            return (Criteria) this;
        }

        public Criteria andDxtjLike(String value) {
            addCriterion("dxtj like", value, "dxtj");
            return (Criteria) this;
        }

        public Criteria andDxtjNotLike(String value) {
            addCriterion("dxtj not like", value, "dxtj");
            return (Criteria) this;
        }

        public Criteria andDxtjIn(List<String> values) {
            addCriterion("dxtj in", values, "dxtj");
            return (Criteria) this;
        }

        public Criteria andDxtjNotIn(List<String> values) {
            addCriterion("dxtj not in", values, "dxtj");
            return (Criteria) this;
        }

        public Criteria andDxtjBetween(String value1, String value2) {
            addCriterion("dxtj between", value1, value2, "dxtj");
            return (Criteria) this;
        }

        public Criteria andDxtjNotBetween(String value1, String value2) {
            addCriterion("dxtj not between", value1, value2, "dxtj");
            return (Criteria) this;
        }

        public Criteria andZytjfcIsNull() {
            addCriterion("zytjfc is null");
            return (Criteria) this;
        }

        public Criteria andZytjfcIsNotNull() {
            addCriterion("zytjfc is not null");
            return (Criteria) this;
        }

        public Criteria andZytjfcEqualTo(String value) {
            addCriterion("zytjfc =", value, "zytjfc");
            return (Criteria) this;
        }

        public Criteria andZytjfcNotEqualTo(String value) {
            addCriterion("zytjfc <>", value, "zytjfc");
            return (Criteria) this;
        }

        public Criteria andZytjfcGreaterThan(String value) {
            addCriterion("zytjfc >", value, "zytjfc");
            return (Criteria) this;
        }

        public Criteria andZytjfcGreaterThanOrEqualTo(String value) {
            addCriterion("zytjfc >=", value, "zytjfc");
            return (Criteria) this;
        }

        public Criteria andZytjfcLessThan(String value) {
            addCriterion("zytjfc <", value, "zytjfc");
            return (Criteria) this;
        }

        public Criteria andZytjfcLessThanOrEqualTo(String value) {
            addCriterion("zytjfc <=", value, "zytjfc");
            return (Criteria) this;
        }

        public Criteria andZytjfcLike(String value) {
            addCriterion("zytjfc like", value, "zytjfc");
            return (Criteria) this;
        }

        public Criteria andZytjfcNotLike(String value) {
            addCriterion("zytjfc not like", value, "zytjfc");
            return (Criteria) this;
        }

        public Criteria andZytjfcIn(List<String> values) {
            addCriterion("zytjfc in", values, "zytjfc");
            return (Criteria) this;
        }

        public Criteria andZytjfcNotIn(List<String> values) {
            addCriterion("zytjfc not in", values, "zytjfc");
            return (Criteria) this;
        }

        public Criteria andZytjfcBetween(String value1, String value2) {
            addCriterion("zytjfc between", value1, value2, "zytjfc");
            return (Criteria) this;
        }

        public Criteria andZytjfcNotBetween(String value1, String value2) {
            addCriterion("zytjfc not between", value1, value2, "zytjfc");
            return (Criteria) this;
        }

        public Criteria andTjsxbzIsNull() {
            addCriterion("tjsxbz is null");
            return (Criteria) this;
        }

        public Criteria andTjsxbzIsNotNull() {
            addCriterion("tjsxbz is not null");
            return (Criteria) this;
        }

        public Criteria andTjsxbzEqualTo(String value) {
            addCriterion("tjsxbz =", value, "tjsxbz");
            return (Criteria) this;
        }

        public Criteria andTjsxbzNotEqualTo(String value) {
            addCriterion("tjsxbz <>", value, "tjsxbz");
            return (Criteria) this;
        }

        public Criteria andTjsxbzGreaterThan(String value) {
            addCriterion("tjsxbz >", value, "tjsxbz");
            return (Criteria) this;
        }

        public Criteria andTjsxbzGreaterThanOrEqualTo(String value) {
            addCriterion("tjsxbz >=", value, "tjsxbz");
            return (Criteria) this;
        }

        public Criteria andTjsxbzLessThan(String value) {
            addCriterion("tjsxbz <", value, "tjsxbz");
            return (Criteria) this;
        }

        public Criteria andTjsxbzLessThanOrEqualTo(String value) {
            addCriterion("tjsxbz <=", value, "tjsxbz");
            return (Criteria) this;
        }

        public Criteria andTjsxbzLike(String value) {
            addCriterion("tjsxbz like", value, "tjsxbz");
            return (Criteria) this;
        }

        public Criteria andTjsxbzNotLike(String value) {
            addCriterion("tjsxbz not like", value, "tjsxbz");
            return (Criteria) this;
        }

        public Criteria andTjsxbzIn(List<String> values) {
            addCriterion("tjsxbz in", values, "tjsxbz");
            return (Criteria) this;
        }

        public Criteria andTjsxbzNotIn(List<String> values) {
            addCriterion("tjsxbz not in", values, "tjsxbz");
            return (Criteria) this;
        }

        public Criteria andTjsxbzBetween(String value1, String value2) {
            addCriterion("tjsxbz between", value1, value2, "tjsxbz");
            return (Criteria) this;
        }

        public Criteria andTjsxbzNotBetween(String value1, String value2) {
            addCriterion("tjsxbz not between", value1, value2, "tjsxbz");
            return (Criteria) this;
        }

        public Criteria andTjjldmIsNull() {
            addCriterion("tjjldm is null");
            return (Criteria) this;
        }

        public Criteria andTjjldmIsNotNull() {
            addCriterion("tjjldm is not null");
            return (Criteria) this;
        }

        public Criteria andTjjldmEqualTo(String value) {
            addCriterion("tjjldm =", value, "tjjldm");
            return (Criteria) this;
        }

        public Criteria andTjjldmNotEqualTo(String value) {
            addCriterion("tjjldm <>", value, "tjjldm");
            return (Criteria) this;
        }

        public Criteria andTjjldmGreaterThan(String value) {
            addCriterion("tjjldm >", value, "tjjldm");
            return (Criteria) this;
        }

        public Criteria andTjjldmGreaterThanOrEqualTo(String value) {
            addCriterion("tjjldm >=", value, "tjjldm");
            return (Criteria) this;
        }

        public Criteria andTjjldmLessThan(String value) {
            addCriterion("tjjldm <", value, "tjjldm");
            return (Criteria) this;
        }

        public Criteria andTjjldmLessThanOrEqualTo(String value) {
            addCriterion("tjjldm <=", value, "tjjldm");
            return (Criteria) this;
        }

        public Criteria andTjjldmLike(String value) {
            addCriterion("tjjldm like", value, "tjjldm");
            return (Criteria) this;
        }

        public Criteria andTjjldmNotLike(String value) {
            addCriterion("tjjldm not like", value, "tjjldm");
            return (Criteria) this;
        }

        public Criteria andTjjldmIn(List<String> values) {
            addCriterion("tjjldm in", values, "tjjldm");
            return (Criteria) this;
        }

        public Criteria andTjjldmNotIn(List<String> values) {
            addCriterion("tjjldm not in", values, "tjjldm");
            return (Criteria) this;
        }

        public Criteria andTjjldmBetween(String value1, String value2) {
            addCriterion("tjjldm between", value1, value2, "tjjldm");
            return (Criteria) this;
        }

        public Criteria andTjjldmNotBetween(String value1, String value2) {
            addCriterion("tjjldm not between", value1, value2, "tjjldm");
            return (Criteria) this;
        }

        public Criteria andBhIsNull() {
            addCriterion("bh is null");
            return (Criteria) this;
        }

        public Criteria andBhIsNotNull() {
            addCriterion("bh is not null");
            return (Criteria) this;
        }

        public Criteria andBhEqualTo(String value) {
            addCriterion("bh =", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotEqualTo(String value) {
            addCriterion("bh <>", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhGreaterThan(String value) {
            addCriterion("bh >", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhGreaterThanOrEqualTo(String value) {
            addCriterion("bh >=", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLessThan(String value) {
            addCriterion("bh <", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLessThanOrEqualTo(String value) {
            addCriterion("bh <=", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLike(String value) {
            addCriterion("bh like", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotLike(String value) {
            addCriterion("bh not like", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhIn(List<String> values) {
            addCriterion("bh in", values, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotIn(List<String> values) {
            addCriterion("bh not in", values, "bh");
            return (Criteria) this;
        }

        public Criteria andBhBetween(String value1, String value2) {
            addCriterion("bh between", value1, value2, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotBetween(String value1, String value2) {
            addCriterion("bh not between", value1, value2, "bh");
            return (Criteria) this;
        }

        public Criteria andKslsczbzIsNull() {
            addCriterion("kslsczbz is null");
            return (Criteria) this;
        }

        public Criteria andKslsczbzIsNotNull() {
            addCriterion("kslsczbz is not null");
            return (Criteria) this;
        }

        public Criteria andKslsczbzEqualTo(String value) {
            addCriterion("kslsczbz =", value, "kslsczbz");
            return (Criteria) this;
        }

        public Criteria andKslsczbzNotEqualTo(String value) {
            addCriterion("kslsczbz <>", value, "kslsczbz");
            return (Criteria) this;
        }

        public Criteria andKslsczbzGreaterThan(String value) {
            addCriterion("kslsczbz >", value, "kslsczbz");
            return (Criteria) this;
        }

        public Criteria andKslsczbzGreaterThanOrEqualTo(String value) {
            addCriterion("kslsczbz >=", value, "kslsczbz");
            return (Criteria) this;
        }

        public Criteria andKslsczbzLessThan(String value) {
            addCriterion("kslsczbz <", value, "kslsczbz");
            return (Criteria) this;
        }

        public Criteria andKslsczbzLessThanOrEqualTo(String value) {
            addCriterion("kslsczbz <=", value, "kslsczbz");
            return (Criteria) this;
        }

        public Criteria andKslsczbzLike(String value) {
            addCriterion("kslsczbz like", value, "kslsczbz");
            return (Criteria) this;
        }

        public Criteria andKslsczbzNotLike(String value) {
            addCriterion("kslsczbz not like", value, "kslsczbz");
            return (Criteria) this;
        }

        public Criteria andKslsczbzIn(List<String> values) {
            addCriterion("kslsczbz in", values, "kslsczbz");
            return (Criteria) this;
        }

        public Criteria andKslsczbzNotIn(List<String> values) {
            addCriterion("kslsczbz not in", values, "kslsczbz");
            return (Criteria) this;
        }

        public Criteria andKslsczbzBetween(String value1, String value2) {
            addCriterion("kslsczbz between", value1, value2, "kslsczbz");
            return (Criteria) this;
        }

        public Criteria andKslsczbzNotBetween(String value1, String value2) {
            addCriterion("kslsczbz not between", value1, value2, "kslsczbz");
            return (Criteria) this;
        }

        public Criteria andZysxdm1IsNull() {
            addCriterion("zysxdm1 is null");
            return (Criteria) this;
        }

        public Criteria andZysxdm1IsNotNull() {
            addCriterion("zysxdm1 is not null");
            return (Criteria) this;
        }

        public Criteria andZysxdm1EqualTo(String value) {
            addCriterion("zysxdm1 =", value, "zysxdm1");
            return (Criteria) this;
        }

        public Criteria andZysxdm1NotEqualTo(String value) {
            addCriterion("zysxdm1 <>", value, "zysxdm1");
            return (Criteria) this;
        }

        public Criteria andZysxdm1GreaterThan(String value) {
            addCriterion("zysxdm1 >", value, "zysxdm1");
            return (Criteria) this;
        }

        public Criteria andZysxdm1GreaterThanOrEqualTo(String value) {
            addCriterion("zysxdm1 >=", value, "zysxdm1");
            return (Criteria) this;
        }

        public Criteria andZysxdm1LessThan(String value) {
            addCriterion("zysxdm1 <", value, "zysxdm1");
            return (Criteria) this;
        }

        public Criteria andZysxdm1LessThanOrEqualTo(String value) {
            addCriterion("zysxdm1 <=", value, "zysxdm1");
            return (Criteria) this;
        }

        public Criteria andZysxdm1Like(String value) {
            addCriterion("zysxdm1 like", value, "zysxdm1");
            return (Criteria) this;
        }

        public Criteria andZysxdm1NotLike(String value) {
            addCriterion("zysxdm1 not like", value, "zysxdm1");
            return (Criteria) this;
        }

        public Criteria andZysxdm1In(List<String> values) {
            addCriterion("zysxdm1 in", values, "zysxdm1");
            return (Criteria) this;
        }

        public Criteria andZysxdm1NotIn(List<String> values) {
            addCriterion("zysxdm1 not in", values, "zysxdm1");
            return (Criteria) this;
        }

        public Criteria andZysxdm1Between(String value1, String value2) {
            addCriterion("zysxdm1 between", value1, value2, "zysxdm1");
            return (Criteria) this;
        }

        public Criteria andZysxdm1NotBetween(String value1, String value2) {
            addCriterion("zysxdm1 not between", value1, value2, "zysxdm1");
            return (Criteria) this;
        }

        public Criteria andZysxdm2IsNull() {
            addCriterion("zysxdm2 is null");
            return (Criteria) this;
        }

        public Criteria andZysxdm2IsNotNull() {
            addCriterion("zysxdm2 is not null");
            return (Criteria) this;
        }

        public Criteria andZysxdm2EqualTo(String value) {
            addCriterion("zysxdm2 =", value, "zysxdm2");
            return (Criteria) this;
        }

        public Criteria andZysxdm2NotEqualTo(String value) {
            addCriterion("zysxdm2 <>", value, "zysxdm2");
            return (Criteria) this;
        }

        public Criteria andZysxdm2GreaterThan(String value) {
            addCriterion("zysxdm2 >", value, "zysxdm2");
            return (Criteria) this;
        }

        public Criteria andZysxdm2GreaterThanOrEqualTo(String value) {
            addCriterion("zysxdm2 >=", value, "zysxdm2");
            return (Criteria) this;
        }

        public Criteria andZysxdm2LessThan(String value) {
            addCriterion("zysxdm2 <", value, "zysxdm2");
            return (Criteria) this;
        }

        public Criteria andZysxdm2LessThanOrEqualTo(String value) {
            addCriterion("zysxdm2 <=", value, "zysxdm2");
            return (Criteria) this;
        }

        public Criteria andZysxdm2Like(String value) {
            addCriterion("zysxdm2 like", value, "zysxdm2");
            return (Criteria) this;
        }

        public Criteria andZysxdm2NotLike(String value) {
            addCriterion("zysxdm2 not like", value, "zysxdm2");
            return (Criteria) this;
        }

        public Criteria andZysxdm2In(List<String> values) {
            addCriterion("zysxdm2 in", values, "zysxdm2");
            return (Criteria) this;
        }

        public Criteria andZysxdm2NotIn(List<String> values) {
            addCriterion("zysxdm2 not in", values, "zysxdm2");
            return (Criteria) this;
        }

        public Criteria andZysxdm2Between(String value1, String value2) {
            addCriterion("zysxdm2 between", value1, value2, "zysxdm2");
            return (Criteria) this;
        }

        public Criteria andZysxdm2NotBetween(String value1, String value2) {
            addCriterion("zysxdm2 not between", value1, value2, "zysxdm2");
            return (Criteria) this;
        }

        public Criteria andZysxdm3IsNull() {
            addCriterion("zysxdm3 is null");
            return (Criteria) this;
        }

        public Criteria andZysxdm3IsNotNull() {
            addCriterion("zysxdm3 is not null");
            return (Criteria) this;
        }

        public Criteria andZysxdm3EqualTo(String value) {
            addCriterion("zysxdm3 =", value, "zysxdm3");
            return (Criteria) this;
        }

        public Criteria andZysxdm3NotEqualTo(String value) {
            addCriterion("zysxdm3 <>", value, "zysxdm3");
            return (Criteria) this;
        }

        public Criteria andZysxdm3GreaterThan(String value) {
            addCriterion("zysxdm3 >", value, "zysxdm3");
            return (Criteria) this;
        }

        public Criteria andZysxdm3GreaterThanOrEqualTo(String value) {
            addCriterion("zysxdm3 >=", value, "zysxdm3");
            return (Criteria) this;
        }

        public Criteria andZysxdm3LessThan(String value) {
            addCriterion("zysxdm3 <", value, "zysxdm3");
            return (Criteria) this;
        }

        public Criteria andZysxdm3LessThanOrEqualTo(String value) {
            addCriterion("zysxdm3 <=", value, "zysxdm3");
            return (Criteria) this;
        }

        public Criteria andZysxdm3Like(String value) {
            addCriterion("zysxdm3 like", value, "zysxdm3");
            return (Criteria) this;
        }

        public Criteria andZysxdm3NotLike(String value) {
            addCriterion("zysxdm3 not like", value, "zysxdm3");
            return (Criteria) this;
        }

        public Criteria andZysxdm3In(List<String> values) {
            addCriterion("zysxdm3 in", values, "zysxdm3");
            return (Criteria) this;
        }

        public Criteria andZysxdm3NotIn(List<String> values) {
            addCriterion("zysxdm3 not in", values, "zysxdm3");
            return (Criteria) this;
        }

        public Criteria andZysxdm3Between(String value1, String value2) {
            addCriterion("zysxdm3 between", value1, value2, "zysxdm3");
            return (Criteria) this;
        }

        public Criteria andZysxdm3NotBetween(String value1, String value2) {
            addCriterion("zysxdm3 not between", value1, value2, "zysxdm3");
            return (Criteria) this;
        }

        public Criteria andZysxdm4IsNull() {
            addCriterion("zysxdm4 is null");
            return (Criteria) this;
        }

        public Criteria andZysxdm4IsNotNull() {
            addCriterion("zysxdm4 is not null");
            return (Criteria) this;
        }

        public Criteria andZysxdm4EqualTo(String value) {
            addCriterion("zysxdm4 =", value, "zysxdm4");
            return (Criteria) this;
        }

        public Criteria andZysxdm4NotEqualTo(String value) {
            addCriterion("zysxdm4 <>", value, "zysxdm4");
            return (Criteria) this;
        }

        public Criteria andZysxdm4GreaterThan(String value) {
            addCriterion("zysxdm4 >", value, "zysxdm4");
            return (Criteria) this;
        }

        public Criteria andZysxdm4GreaterThanOrEqualTo(String value) {
            addCriterion("zysxdm4 >=", value, "zysxdm4");
            return (Criteria) this;
        }

        public Criteria andZysxdm4LessThan(String value) {
            addCriterion("zysxdm4 <", value, "zysxdm4");
            return (Criteria) this;
        }

        public Criteria andZysxdm4LessThanOrEqualTo(String value) {
            addCriterion("zysxdm4 <=", value, "zysxdm4");
            return (Criteria) this;
        }

        public Criteria andZysxdm4Like(String value) {
            addCriterion("zysxdm4 like", value, "zysxdm4");
            return (Criteria) this;
        }

        public Criteria andZysxdm4NotLike(String value) {
            addCriterion("zysxdm4 not like", value, "zysxdm4");
            return (Criteria) this;
        }

        public Criteria andZysxdm4In(List<String> values) {
            addCriterion("zysxdm4 in", values, "zysxdm4");
            return (Criteria) this;
        }

        public Criteria andZysxdm4NotIn(List<String> values) {
            addCriterion("zysxdm4 not in", values, "zysxdm4");
            return (Criteria) this;
        }

        public Criteria andZysxdm4Between(String value1, String value2) {
            addCriterion("zysxdm4 between", value1, value2, "zysxdm4");
            return (Criteria) this;
        }

        public Criteria andZysxdm4NotBetween(String value1, String value2) {
            addCriterion("zysxdm4 not between", value1, value2, "zysxdm4");
            return (Criteria) this;
        }

        public Criteria andZysxdm5IsNull() {
            addCriterion("zysxdm5 is null");
            return (Criteria) this;
        }

        public Criteria andZysxdm5IsNotNull() {
            addCriterion("zysxdm5 is not null");
            return (Criteria) this;
        }

        public Criteria andZysxdm5EqualTo(String value) {
            addCriterion("zysxdm5 =", value, "zysxdm5");
            return (Criteria) this;
        }

        public Criteria andZysxdm5NotEqualTo(String value) {
            addCriterion("zysxdm5 <>", value, "zysxdm5");
            return (Criteria) this;
        }

        public Criteria andZysxdm5GreaterThan(String value) {
            addCriterion("zysxdm5 >", value, "zysxdm5");
            return (Criteria) this;
        }

        public Criteria andZysxdm5GreaterThanOrEqualTo(String value) {
            addCriterion("zysxdm5 >=", value, "zysxdm5");
            return (Criteria) this;
        }

        public Criteria andZysxdm5LessThan(String value) {
            addCriterion("zysxdm5 <", value, "zysxdm5");
            return (Criteria) this;
        }

        public Criteria andZysxdm5LessThanOrEqualTo(String value) {
            addCriterion("zysxdm5 <=", value, "zysxdm5");
            return (Criteria) this;
        }

        public Criteria andZysxdm5Like(String value) {
            addCriterion("zysxdm5 like", value, "zysxdm5");
            return (Criteria) this;
        }

        public Criteria andZysxdm5NotLike(String value) {
            addCriterion("zysxdm5 not like", value, "zysxdm5");
            return (Criteria) this;
        }

        public Criteria andZysxdm5In(List<String> values) {
            addCriterion("zysxdm5 in", values, "zysxdm5");
            return (Criteria) this;
        }

        public Criteria andZysxdm5NotIn(List<String> values) {
            addCriterion("zysxdm5 not in", values, "zysxdm5");
            return (Criteria) this;
        }

        public Criteria andZysxdm5Between(String value1, String value2) {
            addCriterion("zysxdm5 between", value1, value2, "zysxdm5");
            return (Criteria) this;
        }

        public Criteria andZysxdm5NotBetween(String value1, String value2) {
            addCriterion("zysxdm5 not between", value1, value2, "zysxdm5");
            return (Criteria) this;
        }

        public Criteria andZysxdm6IsNull() {
            addCriterion("zysxdm6 is null");
            return (Criteria) this;
        }

        public Criteria andZysxdm6IsNotNull() {
            addCriterion("zysxdm6 is not null");
            return (Criteria) this;
        }

        public Criteria andZysxdm6EqualTo(String value) {
            addCriterion("zysxdm6 =", value, "zysxdm6");
            return (Criteria) this;
        }

        public Criteria andZysxdm6NotEqualTo(String value) {
            addCriterion("zysxdm6 <>", value, "zysxdm6");
            return (Criteria) this;
        }

        public Criteria andZysxdm6GreaterThan(String value) {
            addCriterion("zysxdm6 >", value, "zysxdm6");
            return (Criteria) this;
        }

        public Criteria andZysxdm6GreaterThanOrEqualTo(String value) {
            addCriterion("zysxdm6 >=", value, "zysxdm6");
            return (Criteria) this;
        }

        public Criteria andZysxdm6LessThan(String value) {
            addCriterion("zysxdm6 <", value, "zysxdm6");
            return (Criteria) this;
        }

        public Criteria andZysxdm6LessThanOrEqualTo(String value) {
            addCriterion("zysxdm6 <=", value, "zysxdm6");
            return (Criteria) this;
        }

        public Criteria andZysxdm6Like(String value) {
            addCriterion("zysxdm6 like", value, "zysxdm6");
            return (Criteria) this;
        }

        public Criteria andZysxdm6NotLike(String value) {
            addCriterion("zysxdm6 not like", value, "zysxdm6");
            return (Criteria) this;
        }

        public Criteria andZysxdm6In(List<String> values) {
            addCriterion("zysxdm6 in", values, "zysxdm6");
            return (Criteria) this;
        }

        public Criteria andZysxdm6NotIn(List<String> values) {
            addCriterion("zysxdm6 not in", values, "zysxdm6");
            return (Criteria) this;
        }

        public Criteria andZysxdm6Between(String value1, String value2) {
            addCriterion("zysxdm6 between", value1, value2, "zysxdm6");
            return (Criteria) this;
        }

        public Criteria andZysxdm6NotBetween(String value1, String value2) {
            addCriterion("zysxdm6 not between", value1, value2, "zysxdm6");
            return (Criteria) this;
        }

        public Criteria andWkSgIsNull() {
            addCriterion("wk_sg is null");
            return (Criteria) this;
        }

        public Criteria andWkSgIsNotNull() {
            addCriterion("wk_sg is not null");
            return (Criteria) this;
        }

        public Criteria andWkSgEqualTo(String value) {
            addCriterion("wk_sg =", value, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkSgNotEqualTo(String value) {
            addCriterion("wk_sg <>", value, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkSgGreaterThan(String value) {
            addCriterion("wk_sg >", value, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkSgGreaterThanOrEqualTo(String value) {
            addCriterion("wk_sg >=", value, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkSgLessThan(String value) {
            addCriterion("wk_sg <", value, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkSgLessThanOrEqualTo(String value) {
            addCriterion("wk_sg <=", value, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkSgLike(String value) {
            addCriterion("wk_sg like", value, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkSgNotLike(String value) {
            addCriterion("wk_sg not like", value, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkSgIn(List<String> values) {
            addCriterion("wk_sg in", values, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkSgNotIn(List<String> values) {
            addCriterion("wk_sg not in", values, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkSgBetween(String value1, String value2) {
            addCriterion("wk_sg between", value1, value2, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkSgNotBetween(String value1, String value2) {
            addCriterion("wk_sg not between", value1, value2, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkTzIsNull() {
            addCriterion("wk_tz is null");
            return (Criteria) this;
        }

        public Criteria andWkTzIsNotNull() {
            addCriterion("wk_tz is not null");
            return (Criteria) this;
        }

        public Criteria andWkTzEqualTo(String value) {
            addCriterion("wk_tz =", value, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkTzNotEqualTo(String value) {
            addCriterion("wk_tz <>", value, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkTzGreaterThan(String value) {
            addCriterion("wk_tz >", value, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkTzGreaterThanOrEqualTo(String value) {
            addCriterion("wk_tz >=", value, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkTzLessThan(String value) {
            addCriterion("wk_tz <", value, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkTzLessThanOrEqualTo(String value) {
            addCriterion("wk_tz <=", value, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkTzLike(String value) {
            addCriterion("wk_tz like", value, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkTzNotLike(String value) {
            addCriterion("wk_tz not like", value, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkTzIn(List<String> values) {
            addCriterion("wk_tz in", values, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkTzNotIn(List<String> values) {
            addCriterion("wk_tz not in", values, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkTzBetween(String value1, String value2) {
            addCriterion("wk_tz between", value1, value2, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkTzNotBetween(String value1, String value2) {
            addCriterion("wk_tz not between", value1, value2, "wkTz");
            return (Criteria) this;
        }

        public Criteria andPcdmIsNull() {
            addCriterion("pcdm is null");
            return (Criteria) this;
        }

        public Criteria andPcdmIsNotNull() {
            addCriterion("pcdm is not null");
            return (Criteria) this;
        }

        public Criteria andPcdmEqualTo(String value) {
            addCriterion("pcdm =", value, "pcdm");
            return (Criteria) this;
        }

        public Criteria andPcdmNotEqualTo(String value) {
            addCriterion("pcdm <>", value, "pcdm");
            return (Criteria) this;
        }

        public Criteria andPcdmGreaterThan(String value) {
            addCriterion("pcdm >", value, "pcdm");
            return (Criteria) this;
        }

        public Criteria andPcdmGreaterThanOrEqualTo(String value) {
            addCriterion("pcdm >=", value, "pcdm");
            return (Criteria) this;
        }

        public Criteria andPcdmLessThan(String value) {
            addCriterion("pcdm <", value, "pcdm");
            return (Criteria) this;
        }

        public Criteria andPcdmLessThanOrEqualTo(String value) {
            addCriterion("pcdm <=", value, "pcdm");
            return (Criteria) this;
        }

        public Criteria andPcdmLike(String value) {
            addCriterion("pcdm like", value, "pcdm");
            return (Criteria) this;
        }

        public Criteria andPcdmNotLike(String value) {
            addCriterion("pcdm not like", value, "pcdm");
            return (Criteria) this;
        }

        public Criteria andPcdmIn(List<String> values) {
            addCriterion("pcdm in", values, "pcdm");
            return (Criteria) this;
        }

        public Criteria andPcdmNotIn(List<String> values) {
            addCriterion("pcdm not in", values, "pcdm");
            return (Criteria) this;
        }

        public Criteria andPcdmBetween(String value1, String value2) {
            addCriterion("pcdm between", value1, value2, "pcdm");
            return (Criteria) this;
        }

        public Criteria andPcdmNotBetween(String value1, String value2) {
            addCriterion("pcdm not between", value1, value2, "pcdm");
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

        public Criteria andPcfsIsNull() {
            addCriterion("pcfs is null");
            return (Criteria) this;
        }

        public Criteria andPcfsIsNotNull() {
            addCriterion("pcfs is not null");
            return (Criteria) this;
        }

        public Criteria andPcfsEqualTo(Double value) {
            addCriterion("pcfs =", value, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcfsNotEqualTo(Double value) {
            addCriterion("pcfs <>", value, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcfsGreaterThan(Double value) {
            addCriterion("pcfs >", value, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcfsGreaterThanOrEqualTo(Double value) {
            addCriterion("pcfs >=", value, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcfsLessThan(Double value) {
            addCriterion("pcfs <", value, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcfsLessThanOrEqualTo(Double value) {
            addCriterion("pcfs <=", value, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcfsIn(List<Double> values) {
            addCriterion("pcfs in", values, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcfsNotIn(List<Double> values) {
            addCriterion("pcfs not in", values, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcfsBetween(Double value1, Double value2) {
            addCriterion("pcfs between", value1, value2, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcfsNotBetween(Double value1, Double value2) {
            addCriterion("pcfs not between", value1, value2, "pcfs");
            return (Criteria) this;
        }

        public Criteria andTzshIsNull() {
            addCriterion("tzsh is null");
            return (Criteria) this;
        }

        public Criteria andTzshIsNotNull() {
            addCriterion("tzsh is not null");
            return (Criteria) this;
        }

        public Criteria andTzshEqualTo(String value) {
            addCriterion("tzsh =", value, "tzsh");
            return (Criteria) this;
        }

        public Criteria andTzshNotEqualTo(String value) {
            addCriterion("tzsh <>", value, "tzsh");
            return (Criteria) this;
        }

        public Criteria andTzshGreaterThan(String value) {
            addCriterion("tzsh >", value, "tzsh");
            return (Criteria) this;
        }

        public Criteria andTzshGreaterThanOrEqualTo(String value) {
            addCriterion("tzsh >=", value, "tzsh");
            return (Criteria) this;
        }

        public Criteria andTzshLessThan(String value) {
            addCriterion("tzsh <", value, "tzsh");
            return (Criteria) this;
        }

        public Criteria andTzshLessThanOrEqualTo(String value) {
            addCriterion("tzsh <=", value, "tzsh");
            return (Criteria) this;
        }

        public Criteria andTzshLike(String value) {
            addCriterion("tzsh like", value, "tzsh");
            return (Criteria) this;
        }

        public Criteria andTzshNotLike(String value) {
            addCriterion("tzsh not like", value, "tzsh");
            return (Criteria) this;
        }

        public Criteria andTzshIn(List<String> values) {
            addCriterion("tzsh in", values, "tzsh");
            return (Criteria) this;
        }

        public Criteria andTzshNotIn(List<String> values) {
            addCriterion("tzsh not in", values, "tzsh");
            return (Criteria) this;
        }

        public Criteria andTzshBetween(String value1, String value2) {
            addCriterion("tzsh between", value1, value2, "tzsh");
            return (Criteria) this;
        }

        public Criteria andTzshNotBetween(String value1, String value2) {
            addCriterion("tzsh not between", value1, value2, "tzsh");
            return (Criteria) this;
        }

        public Criteria andXhIsNull() {
            addCriterion("xh is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("xh is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(String value) {
            addCriterion("xh =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(String value) {
            addCriterion("xh <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(String value) {
            addCriterion("xh >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(String value) {
            addCriterion("xh >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(String value) {
            addCriterion("xh <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(String value) {
            addCriterion("xh <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLike(String value) {
            addCriterion("xh like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotLike(String value) {
            addCriterion("xh not like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<String> values) {
            addCriterion("xh in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<String> values) {
            addCriterion("xh not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(String value1, String value2) {
            addCriterion("xh between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(String value1, String value2) {
            addCriterion("xh not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXslbIsNull() {
            addCriterion("xslb is null");
            return (Criteria) this;
        }

        public Criteria andXslbIsNotNull() {
            addCriterion("xslb is not null");
            return (Criteria) this;
        }

        public Criteria andXslbEqualTo(String value) {
            addCriterion("xslb =", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbNotEqualTo(String value) {
            addCriterion("xslb <>", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbGreaterThan(String value) {
            addCriterion("xslb >", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbGreaterThanOrEqualTo(String value) {
            addCriterion("xslb >=", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbLessThan(String value) {
            addCriterion("xslb <", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbLessThanOrEqualTo(String value) {
            addCriterion("xslb <=", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbLike(String value) {
            addCriterion("xslb like", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbNotLike(String value) {
            addCriterion("xslb not like", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbIn(List<String> values) {
            addCriterion("xslb in", values, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbNotIn(List<String> values) {
            addCriterion("xslb not in", values, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbBetween(String value1, String value2) {
            addCriterion("xslb between", value1, value2, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbNotBetween(String value1, String value2) {
            addCriterion("xslb not between", value1, value2, "xslb");
            return (Criteria) this;
        }

        public Criteria andXqdmIsNull() {
            addCriterion("xqdm is null");
            return (Criteria) this;
        }

        public Criteria andXqdmIsNotNull() {
            addCriterion("xqdm is not null");
            return (Criteria) this;
        }

        public Criteria andXqdmEqualTo(String value) {
            addCriterion("xqdm =", value, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqdmNotEqualTo(String value) {
            addCriterion("xqdm <>", value, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqdmGreaterThan(String value) {
            addCriterion("xqdm >", value, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqdmGreaterThanOrEqualTo(String value) {
            addCriterion("xqdm >=", value, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqdmLessThan(String value) {
            addCriterion("xqdm <", value, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqdmLessThanOrEqualTo(String value) {
            addCriterion("xqdm <=", value, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqdmLike(String value) {
            addCriterion("xqdm like", value, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqdmNotLike(String value) {
            addCriterion("xqdm not like", value, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqdmIn(List<String> values) {
            addCriterion("xqdm in", values, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqdmNotIn(List<String> values) {
            addCriterion("xqdm not in", values, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqdmBetween(String value1, String value2) {
            addCriterion("xqdm between", value1, value2, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqdmNotBetween(String value1, String value2) {
            addCriterion("xqdm not between", value1, value2, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqIsNull() {
            addCriterion("xq is null");
            return (Criteria) this;
        }

        public Criteria andXqIsNotNull() {
            addCriterion("xq is not null");
            return (Criteria) this;
        }

        public Criteria andXqEqualTo(String value) {
            addCriterion("xq =", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqNotEqualTo(String value) {
            addCriterion("xq <>", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqGreaterThan(String value) {
            addCriterion("xq >", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqGreaterThanOrEqualTo(String value) {
            addCriterion("xq >=", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqLessThan(String value) {
            addCriterion("xq <", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqLessThanOrEqualTo(String value) {
            addCriterion("xq <=", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqLike(String value) {
            addCriterion("xq like", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqNotLike(String value) {
            addCriterion("xq not like", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqIn(List<String> values) {
            addCriterion("xq in", values, "xq");
            return (Criteria) this;
        }

        public Criteria andXqNotIn(List<String> values) {
            addCriterion("xq not in", values, "xq");
            return (Criteria) this;
        }

        public Criteria andXqBetween(String value1, String value2) {
            addCriterion("xq between", value1, value2, "xq");
            return (Criteria) this;
        }

        public Criteria andXqNotBetween(String value1, String value2) {
            addCriterion("xq not between", value1, value2, "xq");
            return (Criteria) this;
        }

        public Criteria andXydmIsNull() {
            addCriterion("xydm is null");
            return (Criteria) this;
        }

        public Criteria andXydmIsNotNull() {
            addCriterion("xydm is not null");
            return (Criteria) this;
        }

        public Criteria andXydmEqualTo(String value) {
            addCriterion("xydm =", value, "xydm");
            return (Criteria) this;
        }

        public Criteria andXydmNotEqualTo(String value) {
            addCriterion("xydm <>", value, "xydm");
            return (Criteria) this;
        }

        public Criteria andXydmGreaterThan(String value) {
            addCriterion("xydm >", value, "xydm");
            return (Criteria) this;
        }

        public Criteria andXydmGreaterThanOrEqualTo(String value) {
            addCriterion("xydm >=", value, "xydm");
            return (Criteria) this;
        }

        public Criteria andXydmLessThan(String value) {
            addCriterion("xydm <", value, "xydm");
            return (Criteria) this;
        }

        public Criteria andXydmLessThanOrEqualTo(String value) {
            addCriterion("xydm <=", value, "xydm");
            return (Criteria) this;
        }

        public Criteria andXydmLike(String value) {
            addCriterion("xydm like", value, "xydm");
            return (Criteria) this;
        }

        public Criteria andXydmNotLike(String value) {
            addCriterion("xydm not like", value, "xydm");
            return (Criteria) this;
        }

        public Criteria andXydmIn(List<String> values) {
            addCriterion("xydm in", values, "xydm");
            return (Criteria) this;
        }

        public Criteria andXydmNotIn(List<String> values) {
            addCriterion("xydm not in", values, "xydm");
            return (Criteria) this;
        }

        public Criteria andXydmBetween(String value1, String value2) {
            addCriterion("xydm between", value1, value2, "xydm");
            return (Criteria) this;
        }

        public Criteria andXydmNotBetween(String value1, String value2) {
            addCriterion("xydm not between", value1, value2, "xydm");
            return (Criteria) this;
        }

        public Criteria andXyIsNull() {
            addCriterion("xy is null");
            return (Criteria) this;
        }

        public Criteria andXyIsNotNull() {
            addCriterion("xy is not null");
            return (Criteria) this;
        }

        public Criteria andXyEqualTo(String value) {
            addCriterion("xy =", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyNotEqualTo(String value) {
            addCriterion("xy <>", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyGreaterThan(String value) {
            addCriterion("xy >", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyGreaterThanOrEqualTo(String value) {
            addCriterion("xy >=", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyLessThan(String value) {
            addCriterion("xy <", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyLessThanOrEqualTo(String value) {
            addCriterion("xy <=", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyLike(String value) {
            addCriterion("xy like", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyNotLike(String value) {
            addCriterion("xy not like", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyIn(List<String> values) {
            addCriterion("xy in", values, "xy");
            return (Criteria) this;
        }

        public Criteria andXyNotIn(List<String> values) {
            addCriterion("xy not in", values, "xy");
            return (Criteria) this;
        }

        public Criteria andXyBetween(String value1, String value2) {
            addCriterion("xy between", value1, value2, "xy");
            return (Criteria) this;
        }

        public Criteria andXyNotBetween(String value1, String value2) {
            addCriterion("xy not between", value1, value2, "xy");
            return (Criteria) this;
        }

        public Criteria andXydm1IsNull() {
            addCriterion("xydm1 is null");
            return (Criteria) this;
        }

        public Criteria andXydm1IsNotNull() {
            addCriterion("xydm1 is not null");
            return (Criteria) this;
        }

        public Criteria andXydm1EqualTo(String value) {
            addCriterion("xydm1 =", value, "xydm1");
            return (Criteria) this;
        }

        public Criteria andXydm1NotEqualTo(String value) {
            addCriterion("xydm1 <>", value, "xydm1");
            return (Criteria) this;
        }

        public Criteria andXydm1GreaterThan(String value) {
            addCriterion("xydm1 >", value, "xydm1");
            return (Criteria) this;
        }

        public Criteria andXydm1GreaterThanOrEqualTo(String value) {
            addCriterion("xydm1 >=", value, "xydm1");
            return (Criteria) this;
        }

        public Criteria andXydm1LessThan(String value) {
            addCriterion("xydm1 <", value, "xydm1");
            return (Criteria) this;
        }

        public Criteria andXydm1LessThanOrEqualTo(String value) {
            addCriterion("xydm1 <=", value, "xydm1");
            return (Criteria) this;
        }

        public Criteria andXydm1Like(String value) {
            addCriterion("xydm1 like", value, "xydm1");
            return (Criteria) this;
        }

        public Criteria andXydm1NotLike(String value) {
            addCriterion("xydm1 not like", value, "xydm1");
            return (Criteria) this;
        }

        public Criteria andXydm1In(List<String> values) {
            addCriterion("xydm1 in", values, "xydm1");
            return (Criteria) this;
        }

        public Criteria andXydm1NotIn(List<String> values) {
            addCriterion("xydm1 not in", values, "xydm1");
            return (Criteria) this;
        }

        public Criteria andXydm1Between(String value1, String value2) {
            addCriterion("xydm1 between", value1, value2, "xydm1");
            return (Criteria) this;
        }

        public Criteria andXydm1NotBetween(String value1, String value2) {
            addCriterion("xydm1 not between", value1, value2, "xydm1");
            return (Criteria) this;
        }

        public Criteria andXy1IsNull() {
            addCriterion("xy1 is null");
            return (Criteria) this;
        }

        public Criteria andXy1IsNotNull() {
            addCriterion("xy1 is not null");
            return (Criteria) this;
        }

        public Criteria andXy1EqualTo(String value) {
            addCriterion("xy1 =", value, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1NotEqualTo(String value) {
            addCriterion("xy1 <>", value, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1GreaterThan(String value) {
            addCriterion("xy1 >", value, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1GreaterThanOrEqualTo(String value) {
            addCriterion("xy1 >=", value, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1LessThan(String value) {
            addCriterion("xy1 <", value, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1LessThanOrEqualTo(String value) {
            addCriterion("xy1 <=", value, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1Like(String value) {
            addCriterion("xy1 like", value, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1NotLike(String value) {
            addCriterion("xy1 not like", value, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1In(List<String> values) {
            addCriterion("xy1 in", values, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1NotIn(List<String> values) {
            addCriterion("xy1 not in", values, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1Between(String value1, String value2) {
            addCriterion("xy1 between", value1, value2, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1NotBetween(String value1, String value2) {
            addCriterion("xy1 not between", value1, value2, "xy1");
            return (Criteria) this;
        }

        public Criteria andZydmIsNull() {
            addCriterion("zydm is null");
            return (Criteria) this;
        }

        public Criteria andZydmIsNotNull() {
            addCriterion("zydm is not null");
            return (Criteria) this;
        }

        public Criteria andZydmEqualTo(String value) {
            addCriterion("zydm =", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmNotEqualTo(String value) {
            addCriterion("zydm <>", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmGreaterThan(String value) {
            addCriterion("zydm >", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmGreaterThanOrEqualTo(String value) {
            addCriterion("zydm >=", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmLessThan(String value) {
            addCriterion("zydm <", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmLessThanOrEqualTo(String value) {
            addCriterion("zydm <=", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmLike(String value) {
            addCriterion("zydm like", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmNotLike(String value) {
            addCriterion("zydm not like", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmIn(List<String> values) {
            addCriterion("zydm in", values, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmNotIn(List<String> values) {
            addCriterion("zydm not in", values, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmBetween(String value1, String value2) {
            addCriterion("zydm between", value1, value2, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmNotBetween(String value1, String value2) {
            addCriterion("zydm not between", value1, value2, "zydm");
            return (Criteria) this;
        }

        public Criteria andZyIsNull() {
            addCriterion("zy is null");
            return (Criteria) this;
        }

        public Criteria andZyIsNotNull() {
            addCriterion("zy is not null");
            return (Criteria) this;
        }

        public Criteria andZyEqualTo(String value) {
            addCriterion("zy =", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotEqualTo(String value) {
            addCriterion("zy <>", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyGreaterThan(String value) {
            addCriterion("zy >", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyGreaterThanOrEqualTo(String value) {
            addCriterion("zy >=", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLessThan(String value) {
            addCriterion("zy <", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLessThanOrEqualTo(String value) {
            addCriterion("zy <=", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLike(String value) {
            addCriterion("zy like", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotLike(String value) {
            addCriterion("zy not like", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyIn(List<String> values) {
            addCriterion("zy in", values, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotIn(List<String> values) {
            addCriterion("zy not in", values, "zy");
            return (Criteria) this;
        }

        public Criteria andZyBetween(String value1, String value2) {
            addCriterion("zy between", value1, value2, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotBetween(String value1, String value2) {
            addCriterion("zy not between", value1, value2, "zy");
            return (Criteria) this;
        }

        public Criteria andZydm1IsNull() {
            addCriterion("zydm1 is null");
            return (Criteria) this;
        }

        public Criteria andZydm1IsNotNull() {
            addCriterion("zydm1 is not null");
            return (Criteria) this;
        }

        public Criteria andZydm1EqualTo(String value) {
            addCriterion("zydm1 =", value, "zydm1");
            return (Criteria) this;
        }

        public Criteria andZydm1NotEqualTo(String value) {
            addCriterion("zydm1 <>", value, "zydm1");
            return (Criteria) this;
        }

        public Criteria andZydm1GreaterThan(String value) {
            addCriterion("zydm1 >", value, "zydm1");
            return (Criteria) this;
        }

        public Criteria andZydm1GreaterThanOrEqualTo(String value) {
            addCriterion("zydm1 >=", value, "zydm1");
            return (Criteria) this;
        }

        public Criteria andZydm1LessThan(String value) {
            addCriterion("zydm1 <", value, "zydm1");
            return (Criteria) this;
        }

        public Criteria andZydm1LessThanOrEqualTo(String value) {
            addCriterion("zydm1 <=", value, "zydm1");
            return (Criteria) this;
        }

        public Criteria andZydm1Like(String value) {
            addCriterion("zydm1 like", value, "zydm1");
            return (Criteria) this;
        }

        public Criteria andZydm1NotLike(String value) {
            addCriterion("zydm1 not like", value, "zydm1");
            return (Criteria) this;
        }

        public Criteria andZydm1In(List<String> values) {
            addCriterion("zydm1 in", values, "zydm1");
            return (Criteria) this;
        }

        public Criteria andZydm1NotIn(List<String> values) {
            addCriterion("zydm1 not in", values, "zydm1");
            return (Criteria) this;
        }

        public Criteria andZydm1Between(String value1, String value2) {
            addCriterion("zydm1 between", value1, value2, "zydm1");
            return (Criteria) this;
        }

        public Criteria andZydm1NotBetween(String value1, String value2) {
            addCriterion("zydm1 not between", value1, value2, "zydm1");
            return (Criteria) this;
        }

        public Criteria andZy1IsNull() {
            addCriterion("zy1 is null");
            return (Criteria) this;
        }

        public Criteria andZy1IsNotNull() {
            addCriterion("zy1 is not null");
            return (Criteria) this;
        }

        public Criteria andZy1EqualTo(String value) {
            addCriterion("zy1 =", value, "zy1");
            return (Criteria) this;
        }

        public Criteria andZy1NotEqualTo(String value) {
            addCriterion("zy1 <>", value, "zy1");
            return (Criteria) this;
        }

        public Criteria andZy1GreaterThan(String value) {
            addCriterion("zy1 >", value, "zy1");
            return (Criteria) this;
        }

        public Criteria andZy1GreaterThanOrEqualTo(String value) {
            addCriterion("zy1 >=", value, "zy1");
            return (Criteria) this;
        }

        public Criteria andZy1LessThan(String value) {
            addCriterion("zy1 <", value, "zy1");
            return (Criteria) this;
        }

        public Criteria andZy1LessThanOrEqualTo(String value) {
            addCriterion("zy1 <=", value, "zy1");
            return (Criteria) this;
        }

        public Criteria andZy1Like(String value) {
            addCriterion("zy1 like", value, "zy1");
            return (Criteria) this;
        }

        public Criteria andZy1NotLike(String value) {
            addCriterion("zy1 not like", value, "zy1");
            return (Criteria) this;
        }

        public Criteria andZy1In(List<String> values) {
            addCriterion("zy1 in", values, "zy1");
            return (Criteria) this;
        }

        public Criteria andZy1NotIn(List<String> values) {
            addCriterion("zy1 not in", values, "zy1");
            return (Criteria) this;
        }

        public Criteria andZy1Between(String value1, String value2) {
            addCriterion("zy1 between", value1, value2, "zy1");
            return (Criteria) this;
        }

        public Criteria andZy1NotBetween(String value1, String value2) {
            addCriterion("zy1 not between", value1, value2, "zy1");
            return (Criteria) this;
        }

        public Criteria andXzIsNull() {
            addCriterion("xz is null");
            return (Criteria) this;
        }

        public Criteria andXzIsNotNull() {
            addCriterion("xz is not null");
            return (Criteria) this;
        }

        public Criteria andXzEqualTo(String value) {
            addCriterion("xz =", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotEqualTo(String value) {
            addCriterion("xz <>", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzGreaterThan(String value) {
            addCriterion("xz >", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzGreaterThanOrEqualTo(String value) {
            addCriterion("xz >=", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzLessThan(String value) {
            addCriterion("xz <", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzLessThanOrEqualTo(String value) {
            addCriterion("xz <=", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzLike(String value) {
            addCriterion("xz like", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotLike(String value) {
            addCriterion("xz not like", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzIn(List<String> values) {
            addCriterion("xz in", values, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotIn(List<String> values) {
            addCriterion("xz not in", values, "xz");
            return (Criteria) this;
        }

        public Criteria andXzBetween(String value1, String value2) {
            addCriterion("xz between", value1, value2, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotBetween(String value1, String value2) {
            addCriterion("xz not between", value1, value2, "xz");
            return (Criteria) this;
        }

        public Criteria andZybjIsNull() {
            addCriterion("zybj is null");
            return (Criteria) this;
        }

        public Criteria andZybjIsNotNull() {
            addCriterion("zybj is not null");
            return (Criteria) this;
        }

        public Criteria andZybjEqualTo(String value) {
            addCriterion("zybj =", value, "zybj");
            return (Criteria) this;
        }

        public Criteria andZybjNotEqualTo(String value) {
            addCriterion("zybj <>", value, "zybj");
            return (Criteria) this;
        }

        public Criteria andZybjGreaterThan(String value) {
            addCriterion("zybj >", value, "zybj");
            return (Criteria) this;
        }

        public Criteria andZybjGreaterThanOrEqualTo(String value) {
            addCriterion("zybj >=", value, "zybj");
            return (Criteria) this;
        }

        public Criteria andZybjLessThan(String value) {
            addCriterion("zybj <", value, "zybj");
            return (Criteria) this;
        }

        public Criteria andZybjLessThanOrEqualTo(String value) {
            addCriterion("zybj <=", value, "zybj");
            return (Criteria) this;
        }

        public Criteria andZybjLike(String value) {
            addCriterion("zybj like", value, "zybj");
            return (Criteria) this;
        }

        public Criteria andZybjNotLike(String value) {
            addCriterion("zybj not like", value, "zybj");
            return (Criteria) this;
        }

        public Criteria andZybjIn(List<String> values) {
            addCriterion("zybj in", values, "zybj");
            return (Criteria) this;
        }

        public Criteria andZybjNotIn(List<String> values) {
            addCriterion("zybj not in", values, "zybj");
            return (Criteria) this;
        }

        public Criteria andZybjBetween(String value1, String value2) {
            addCriterion("zybj between", value1, value2, "zybj");
            return (Criteria) this;
        }

        public Criteria andZybjNotBetween(String value1, String value2) {
            addCriterion("zybj not between", value1, value2, "zybj");
            return (Criteria) this;
        }

        public Criteria andQsxxIsNull() {
            addCriterion("qsxx is null");
            return (Criteria) this;
        }

        public Criteria andQsxxIsNotNull() {
            addCriterion("qsxx is not null");
            return (Criteria) this;
        }

        public Criteria andQsxxEqualTo(String value) {
            addCriterion("qsxx =", value, "qsxx");
            return (Criteria) this;
        }

        public Criteria andQsxxNotEqualTo(String value) {
            addCriterion("qsxx <>", value, "qsxx");
            return (Criteria) this;
        }

        public Criteria andQsxxGreaterThan(String value) {
            addCriterion("qsxx >", value, "qsxx");
            return (Criteria) this;
        }

        public Criteria andQsxxGreaterThanOrEqualTo(String value) {
            addCriterion("qsxx >=", value, "qsxx");
            return (Criteria) this;
        }

        public Criteria andQsxxLessThan(String value) {
            addCriterion("qsxx <", value, "qsxx");
            return (Criteria) this;
        }

        public Criteria andQsxxLessThanOrEqualTo(String value) {
            addCriterion("qsxx <=", value, "qsxx");
            return (Criteria) this;
        }

        public Criteria andQsxxLike(String value) {
            addCriterion("qsxx like", value, "qsxx");
            return (Criteria) this;
        }

        public Criteria andQsxxNotLike(String value) {
            addCriterion("qsxx not like", value, "qsxx");
            return (Criteria) this;
        }

        public Criteria andQsxxIn(List<String> values) {
            addCriterion("qsxx in", values, "qsxx");
            return (Criteria) this;
        }

        public Criteria andQsxxNotIn(List<String> values) {
            addCriterion("qsxx not in", values, "qsxx");
            return (Criteria) this;
        }

        public Criteria andQsxxBetween(String value1, String value2) {
            addCriterion("qsxx between", value1, value2, "qsxx");
            return (Criteria) this;
        }

        public Criteria andQsxxNotBetween(String value1, String value2) {
            addCriterion("qsxx not between", value1, value2, "qsxx");
            return (Criteria) this;
        }

        public Criteria andRqIsNull() {
            addCriterion("rq is null");
            return (Criteria) this;
        }

        public Criteria andRqIsNotNull() {
            addCriterion("rq is not null");
            return (Criteria) this;
        }

        public Criteria andRqEqualTo(Date value) {
            addCriterionForJDBCDate("rq =", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqNotEqualTo(Date value) {
            addCriterionForJDBCDate("rq <>", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqGreaterThan(Date value) {
            addCriterionForJDBCDate("rq >", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rq >=", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqLessThan(Date value) {
            addCriterionForJDBCDate("rq <", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rq <=", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqIn(List<Date> values) {
            addCriterionForJDBCDate("rq in", values, "rq");
            return (Criteria) this;
        }

        public Criteria andRqNotIn(List<Date> values) {
            addCriterionForJDBCDate("rq not in", values, "rq");
            return (Criteria) this;
        }

        public Criteria andRqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rq between", value1, value2, "rq");
            return (Criteria) this;
        }

        public Criteria andRqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rq not between", value1, value2, "rq");
            return (Criteria) this;
        }

        public Criteria andYyIsNull() {
            addCriterion("yy is null");
            return (Criteria) this;
        }

        public Criteria andYyIsNotNull() {
            addCriterion("yy is not null");
            return (Criteria) this;
        }

        public Criteria andYyEqualTo(String value) {
            addCriterion("yy =", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyNotEqualTo(String value) {
            addCriterion("yy <>", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyGreaterThan(String value) {
            addCriterion("yy >", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyGreaterThanOrEqualTo(String value) {
            addCriterion("yy >=", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyLessThan(String value) {
            addCriterion("yy <", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyLessThanOrEqualTo(String value) {
            addCriterion("yy <=", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyLike(String value) {
            addCriterion("yy like", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyNotLike(String value) {
            addCriterion("yy not like", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyIn(List<String> values) {
            addCriterion("yy in", values, "yy");
            return (Criteria) this;
        }

        public Criteria andYyNotIn(List<String> values) {
            addCriterion("yy not in", values, "yy");
            return (Criteria) this;
        }

        public Criteria andYyBetween(String value1, String value2) {
            addCriterion("yy between", value1, value2, "yy");
            return (Criteria) this;
        }

        public Criteria andYyNotBetween(String value1, String value2) {
            addCriterion("yy not between", value1, value2, "yy");
            return (Criteria) this;
        }

        public Criteria andNclIsNull() {
            addCriterion("ncl is null");
            return (Criteria) this;
        }

        public Criteria andNclIsNotNull() {
            addCriterion("ncl is not null");
            return (Criteria) this;
        }

        public Criteria andNclEqualTo(String value) {
            addCriterion("ncl =", value, "ncl");
            return (Criteria) this;
        }

        public Criteria andNclNotEqualTo(String value) {
            addCriterion("ncl <>", value, "ncl");
            return (Criteria) this;
        }

        public Criteria andNclGreaterThan(String value) {
            addCriterion("ncl >", value, "ncl");
            return (Criteria) this;
        }

        public Criteria andNclGreaterThanOrEqualTo(String value) {
            addCriterion("ncl >=", value, "ncl");
            return (Criteria) this;
        }

        public Criteria andNclLessThan(String value) {
            addCriterion("ncl <", value, "ncl");
            return (Criteria) this;
        }

        public Criteria andNclLessThanOrEqualTo(String value) {
            addCriterion("ncl <=", value, "ncl");
            return (Criteria) this;
        }

        public Criteria andNclLike(String value) {
            addCriterion("ncl like", value, "ncl");
            return (Criteria) this;
        }

        public Criteria andNclNotLike(String value) {
            addCriterion("ncl not like", value, "ncl");
            return (Criteria) this;
        }

        public Criteria andNclIn(List<String> values) {
            addCriterion("ncl in", values, "ncl");
            return (Criteria) this;
        }

        public Criteria andNclNotIn(List<String> values) {
            addCriterion("ncl not in", values, "ncl");
            return (Criteria) this;
        }

        public Criteria andNclBetween(String value1, String value2) {
            addCriterion("ncl between", value1, value2, "ncl");
            return (Criteria) this;
        }

        public Criteria andNclNotBetween(String value1, String value2) {
            addCriterion("ncl not between", value1, value2, "ncl");
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

        public Criteria andNyEqualTo(Date value) {
            addCriterionForJDBCDate("ny =", value, "ny");
            return (Criteria) this;
        }

        public Criteria andNyNotEqualTo(Date value) {
            addCriterionForJDBCDate("ny <>", value, "ny");
            return (Criteria) this;
        }

        public Criteria andNyGreaterThan(Date value) {
            addCriterionForJDBCDate("ny >", value, "ny");
            return (Criteria) this;
        }

        public Criteria andNyGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ny >=", value, "ny");
            return (Criteria) this;
        }

        public Criteria andNyLessThan(Date value) {
            addCriterionForJDBCDate("ny <", value, "ny");
            return (Criteria) this;
        }

        public Criteria andNyLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ny <=", value, "ny");
            return (Criteria) this;
        }

        public Criteria andNyIn(List<Date> values) {
            addCriterionForJDBCDate("ny in", values, "ny");
            return (Criteria) this;
        }

        public Criteria andNyNotIn(List<Date> values) {
            addCriterionForJDBCDate("ny not in", values, "ny");
            return (Criteria) this;
        }

        public Criteria andNyBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ny between", value1, value2, "ny");
            return (Criteria) this;
        }

        public Criteria andNyNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ny not between", value1, value2, "ny");
            return (Criteria) this;
        }

        public Criteria andDrpcIsNull() {
            addCriterion("drpc is null");
            return (Criteria) this;
        }

        public Criteria andDrpcIsNotNull() {
            addCriterion("drpc is not null");
            return (Criteria) this;
        }

        public Criteria andDrpcEqualTo(Long value) {
            addCriterion("drpc =", value, "drpc");
            return (Criteria) this;
        }

        public Criteria andDrpcNotEqualTo(Long value) {
            addCriterion("drpc <>", value, "drpc");
            return (Criteria) this;
        }

        public Criteria andDrpcGreaterThan(Long value) {
            addCriterion("drpc >", value, "drpc");
            return (Criteria) this;
        }

        public Criteria andDrpcGreaterThanOrEqualTo(Long value) {
            addCriterion("drpc >=", value, "drpc");
            return (Criteria) this;
        }

        public Criteria andDrpcLessThan(Long value) {
            addCriterion("drpc <", value, "drpc");
            return (Criteria) this;
        }

        public Criteria andDrpcLessThanOrEqualTo(Long value) {
            addCriterion("drpc <=", value, "drpc");
            return (Criteria) this;
        }

        public Criteria andDrpcIn(List<Long> values) {
            addCriterion("drpc in", values, "drpc");
            return (Criteria) this;
        }

        public Criteria andDrpcNotIn(List<Long> values) {
            addCriterion("drpc not in", values, "drpc");
            return (Criteria) this;
        }

        public Criteria andDrpcBetween(Long value1, Long value2) {
            addCriterion("drpc between", value1, value2, "drpc");
            return (Criteria) this;
        }

        public Criteria andDrpcNotBetween(Long value1, Long value2) {
            addCriterion("drpc not between", value1, value2, "drpc");
            return (Criteria) this;
        }

        public Criteria andDrridIsNull() {
            addCriterion("drrid is null");
            return (Criteria) this;
        }

        public Criteria andDrridIsNotNull() {
            addCriterion("drrid is not null");
            return (Criteria) this;
        }

        public Criteria andDrridEqualTo(Long value) {
            addCriterion("drrid =", value, "drrid");
            return (Criteria) this;
        }

        public Criteria andDrridNotEqualTo(Long value) {
            addCriterion("drrid <>", value, "drrid");
            return (Criteria) this;
        }

        public Criteria andDrridGreaterThan(Long value) {
            addCriterion("drrid >", value, "drrid");
            return (Criteria) this;
        }

        public Criteria andDrridGreaterThanOrEqualTo(Long value) {
            addCriterion("drrid >=", value, "drrid");
            return (Criteria) this;
        }

        public Criteria andDrridLessThan(Long value) {
            addCriterion("drrid <", value, "drrid");
            return (Criteria) this;
        }

        public Criteria andDrridLessThanOrEqualTo(Long value) {
            addCriterion("drrid <=", value, "drrid");
            return (Criteria) this;
        }

        public Criteria andDrridIn(List<Long> values) {
            addCriterion("drrid in", values, "drrid");
            return (Criteria) this;
        }

        public Criteria andDrridNotIn(List<Long> values) {
            addCriterion("drrid not in", values, "drrid");
            return (Criteria) this;
        }

        public Criteria andDrridBetween(Long value1, Long value2) {
            addCriterion("drrid between", value1, value2, "drrid");
            return (Criteria) this;
        }

        public Criteria andDrridNotBetween(Long value1, Long value2) {
            addCriterion("drrid not between", value1, value2, "drrid");
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