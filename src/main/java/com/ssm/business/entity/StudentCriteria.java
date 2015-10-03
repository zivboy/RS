package com.ssm.business.entity;

import java.util.ArrayList;
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

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andExamineeNumberIsNull() {
            addCriterion("examinee_number is null");
            return (Criteria) this;
        }

        public Criteria andExamineeNumberIsNotNull() {
            addCriterion("examinee_number is not null");
            return (Criteria) this;
        }

        public Criteria andExamineeNumberEqualTo(String value) {
            addCriterion("examinee_number =", value, "examineeNumber");
            return (Criteria) this;
        }

        public Criteria andExamineeNumberNotEqualTo(String value) {
            addCriterion("examinee_number <>", value, "examineeNumber");
            return (Criteria) this;
        }

        public Criteria andExamineeNumberGreaterThan(String value) {
            addCriterion("examinee_number >", value, "examineeNumber");
            return (Criteria) this;
        }

        public Criteria andExamineeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("examinee_number >=", value, "examineeNumber");
            return (Criteria) this;
        }

        public Criteria andExamineeNumberLessThan(String value) {
            addCriterion("examinee_number <", value, "examineeNumber");
            return (Criteria) this;
        }

        public Criteria andExamineeNumberLessThanOrEqualTo(String value) {
            addCriterion("examinee_number <=", value, "examineeNumber");
            return (Criteria) this;
        }

        public Criteria andExamineeNumberLike(String value) {
            addCriterion("examinee_number like", value, "examineeNumber");
            return (Criteria) this;
        }

        public Criteria andExamineeNumberNotLike(String value) {
            addCriterion("examinee_number not like", value, "examineeNumber");
            return (Criteria) this;
        }

        public Criteria andExamineeNumberIn(List<String> values) {
            addCriterion("examinee_number in", values, "examineeNumber");
            return (Criteria) this;
        }

        public Criteria andExamineeNumberNotIn(List<String> values) {
            addCriterion("examinee_number not in", values, "examineeNumber");
            return (Criteria) this;
        }

        public Criteria andExamineeNumberBetween(String value1, String value2) {
            addCriterion("examinee_number between", value1, value2, "examineeNumber");
            return (Criteria) this;
        }

        public Criteria andExamineeNumberNotBetween(String value1, String value2) {
            addCriterion("examinee_number not between", value1, value2, "examineeNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberIsNull() {
            addCriterion("candidate_number is null");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberIsNotNull() {
            addCriterion("candidate_number is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberEqualTo(String value) {
            addCriterion("candidate_number =", value, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberNotEqualTo(String value) {
            addCriterion("candidate_number <>", value, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberGreaterThan(String value) {
            addCriterion("candidate_number >", value, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("candidate_number >=", value, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberLessThan(String value) {
            addCriterion("candidate_number <", value, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberLessThanOrEqualTo(String value) {
            addCriterion("candidate_number <=", value, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberLike(String value) {
            addCriterion("candidate_number like", value, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberNotLike(String value) {
            addCriterion("candidate_number not like", value, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberIn(List<String> values) {
            addCriterion("candidate_number in", values, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberNotIn(List<String> values) {
            addCriterion("candidate_number not in", values, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberBetween(String value1, String value2) {
            addCriterion("candidate_number between", value1, value2, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberNotBetween(String value1, String value2) {
            addCriterion("candidate_number not between", value1, value2, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andStudentTypeIsNull() {
            addCriterion("student_type is null");
            return (Criteria) this;
        }

        public Criteria andStudentTypeIsNotNull() {
            addCriterion("student_type is not null");
            return (Criteria) this;
        }

        public Criteria andStudentTypeEqualTo(Integer value) {
            addCriterion("student_type =", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeNotEqualTo(Integer value) {
            addCriterion("student_type <>", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeGreaterThan(Integer value) {
            addCriterion("student_type >", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_type >=", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeLessThan(Integer value) {
            addCriterion("student_type <", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("student_type <=", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeIn(List<Integer> values) {
            addCriterion("student_type in", values, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeNotIn(List<Integer> values) {
            addCriterion("student_type not in", values, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeBetween(Integer value1, Integer value2) {
            addCriterion("student_type between", value1, value2, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("student_type not between", value1, value2, "studentType");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNull() {
            addCriterion("college is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNotNull() {
            addCriterion("college is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeEqualTo(String value) {
            addCriterion("college =", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotEqualTo(String value) {
            addCriterion("college <>", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThan(String value) {
            addCriterion("college >", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("college >=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThan(String value) {
            addCriterion("college <", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThanOrEqualTo(String value) {
            addCriterion("college <=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLike(String value) {
            addCriterion("college like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotLike(String value) {
            addCriterion("college not like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeIn(List<String> values) {
            addCriterion("college in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotIn(List<String> values) {
            addCriterion("college not in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeBetween(String value1, String value2) {
            addCriterion("college between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotBetween(String value1, String value2) {
            addCriterion("college not between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andNoticeNumberIsNull() {
            addCriterion("notice_number is null");
            return (Criteria) this;
        }

        public Criteria andNoticeNumberIsNotNull() {
            addCriterion("notice_number is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeNumberEqualTo(String value) {
            addCriterion("notice_number =", value, "noticeNumber");
            return (Criteria) this;
        }

        public Criteria andNoticeNumberNotEqualTo(String value) {
            addCriterion("notice_number <>", value, "noticeNumber");
            return (Criteria) this;
        }

        public Criteria andNoticeNumberGreaterThan(String value) {
            addCriterion("notice_number >", value, "noticeNumber");
            return (Criteria) this;
        }

        public Criteria andNoticeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("notice_number >=", value, "noticeNumber");
            return (Criteria) this;
        }

        public Criteria andNoticeNumberLessThan(String value) {
            addCriterion("notice_number <", value, "noticeNumber");
            return (Criteria) this;
        }

        public Criteria andNoticeNumberLessThanOrEqualTo(String value) {
            addCriterion("notice_number <=", value, "noticeNumber");
            return (Criteria) this;
        }

        public Criteria andNoticeNumberLike(String value) {
            addCriterion("notice_number like", value, "noticeNumber");
            return (Criteria) this;
        }

        public Criteria andNoticeNumberNotLike(String value) {
            addCriterion("notice_number not like", value, "noticeNumber");
            return (Criteria) this;
        }

        public Criteria andNoticeNumberIn(List<String> values) {
            addCriterion("notice_number in", values, "noticeNumber");
            return (Criteria) this;
        }

        public Criteria andNoticeNumberNotIn(List<String> values) {
            addCriterion("notice_number not in", values, "noticeNumber");
            return (Criteria) this;
        }

        public Criteria andNoticeNumberBetween(String value1, String value2) {
            addCriterion("notice_number between", value1, value2, "noticeNumber");
            return (Criteria) this;
        }

        public Criteria andNoticeNumberNotBetween(String value1, String value2) {
            addCriterion("notice_number not between", value1, value2, "noticeNumber");
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