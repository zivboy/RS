package com.ssm.business.entity;

import java.util.ArrayList;
import java.util.List;

public class TjxxCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TjxxCriteria() {
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

        public Criteria andTjxhIsNull() {
            addCriterion("tjxh is null");
            return (Criteria) this;
        }

        public Criteria andTjxhIsNotNull() {
            addCriterion("tjxh is not null");
            return (Criteria) this;
        }

        public Criteria andTjxhEqualTo(String value) {
            addCriterion("tjxh =", value, "tjxh");
            return (Criteria) this;
        }

        public Criteria andTjxhNotEqualTo(String value) {
            addCriterion("tjxh <>", value, "tjxh");
            return (Criteria) this;
        }

        public Criteria andTjxhGreaterThan(String value) {
            addCriterion("tjxh >", value, "tjxh");
            return (Criteria) this;
        }

        public Criteria andTjxhGreaterThanOrEqualTo(String value) {
            addCriterion("tjxh >=", value, "tjxh");
            return (Criteria) this;
        }

        public Criteria andTjxhLessThan(String value) {
            addCriterion("tjxh <", value, "tjxh");
            return (Criteria) this;
        }

        public Criteria andTjxhLessThanOrEqualTo(String value) {
            addCriterion("tjxh <=", value, "tjxh");
            return (Criteria) this;
        }

        public Criteria andTjxhLike(String value) {
            addCriterion("tjxh like", value, "tjxh");
            return (Criteria) this;
        }

        public Criteria andTjxhNotLike(String value) {
            addCriterion("tjxh not like", value, "tjxh");
            return (Criteria) this;
        }

        public Criteria andTjxhIn(List<String> values) {
            addCriterion("tjxh in", values, "tjxh");
            return (Criteria) this;
        }

        public Criteria andTjxhNotIn(List<String> values) {
            addCriterion("tjxh not in", values, "tjxh");
            return (Criteria) this;
        }

        public Criteria andTjxhBetween(String value1, String value2) {
            addCriterion("tjxh between", value1, value2, "tjxh");
            return (Criteria) this;
        }

        public Criteria andTjxhNotBetween(String value1, String value2) {
            addCriterion("tjxh not between", value1, value2, "tjxh");
            return (Criteria) this;
        }

        public Criteria andJwbsbzIsNull() {
            addCriterion("jwbsbz is null");
            return (Criteria) this;
        }

        public Criteria andJwbsbzIsNotNull() {
            addCriterion("jwbsbz is not null");
            return (Criteria) this;
        }

        public Criteria andJwbsbzEqualTo(String value) {
            addCriterion("jwbsbz =", value, "jwbsbz");
            return (Criteria) this;
        }

        public Criteria andJwbsbzNotEqualTo(String value) {
            addCriterion("jwbsbz <>", value, "jwbsbz");
            return (Criteria) this;
        }

        public Criteria andJwbsbzGreaterThan(String value) {
            addCriterion("jwbsbz >", value, "jwbsbz");
            return (Criteria) this;
        }

        public Criteria andJwbsbzGreaterThanOrEqualTo(String value) {
            addCriterion("jwbsbz >=", value, "jwbsbz");
            return (Criteria) this;
        }

        public Criteria andJwbsbzLessThan(String value) {
            addCriterion("jwbsbz <", value, "jwbsbz");
            return (Criteria) this;
        }

        public Criteria andJwbsbzLessThanOrEqualTo(String value) {
            addCriterion("jwbsbz <=", value, "jwbsbz");
            return (Criteria) this;
        }

        public Criteria andJwbsbzLike(String value) {
            addCriterion("jwbsbz like", value, "jwbsbz");
            return (Criteria) this;
        }

        public Criteria andJwbsbzNotLike(String value) {
            addCriterion("jwbsbz not like", value, "jwbsbz");
            return (Criteria) this;
        }

        public Criteria andJwbsbzIn(List<String> values) {
            addCriterion("jwbsbz in", values, "jwbsbz");
            return (Criteria) this;
        }

        public Criteria andJwbsbzNotIn(List<String> values) {
            addCriterion("jwbsbz not in", values, "jwbsbz");
            return (Criteria) this;
        }

        public Criteria andJwbsbzBetween(String value1, String value2) {
            addCriterion("jwbsbz between", value1, value2, "jwbsbz");
            return (Criteria) this;
        }

        public Criteria andJwbsbzNotBetween(String value1, String value2) {
            addCriterion("jwbsbz not between", value1, value2, "jwbsbz");
            return (Criteria) this;
        }

        public Criteria andJwbsIsNull() {
            addCriterion("jwbs is null");
            return (Criteria) this;
        }

        public Criteria andJwbsIsNotNull() {
            addCriterion("jwbs is not null");
            return (Criteria) this;
        }

        public Criteria andJwbsEqualTo(String value) {
            addCriterion("jwbs =", value, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsNotEqualTo(String value) {
            addCriterion("jwbs <>", value, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsGreaterThan(String value) {
            addCriterion("jwbs >", value, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsGreaterThanOrEqualTo(String value) {
            addCriterion("jwbs >=", value, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsLessThan(String value) {
            addCriterion("jwbs <", value, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsLessThanOrEqualTo(String value) {
            addCriterion("jwbs <=", value, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsLike(String value) {
            addCriterion("jwbs like", value, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsNotLike(String value) {
            addCriterion("jwbs not like", value, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsIn(List<String> values) {
            addCriterion("jwbs in", values, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsNotIn(List<String> values) {
            addCriterion("jwbs not in", values, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsBetween(String value1, String value2) {
            addCriterion("jwbs between", value1, value2, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsNotBetween(String value1, String value2) {
            addCriterion("jwbs not between", value1, value2, "jwbs");
            return (Criteria) this;
        }

        public Criteria andYkLyslyIsNull() {
            addCriterion("yk_lysly is null");
            return (Criteria) this;
        }

        public Criteria andYkLyslyIsNotNull() {
            addCriterion("yk_lysly is not null");
            return (Criteria) this;
        }

        public Criteria andYkLyslyEqualTo(Float value) {
            addCriterion("yk_lysly =", value, "ykLysly");
            return (Criteria) this;
        }

        public Criteria andYkLyslyNotEqualTo(Float value) {
            addCriterion("yk_lysly <>", value, "ykLysly");
            return (Criteria) this;
        }

        public Criteria andYkLyslyGreaterThan(Float value) {
            addCriterion("yk_lysly >", value, "ykLysly");
            return (Criteria) this;
        }

        public Criteria andYkLyslyGreaterThanOrEqualTo(Float value) {
            addCriterion("yk_lysly >=", value, "ykLysly");
            return (Criteria) this;
        }

        public Criteria andYkLyslyLessThan(Float value) {
            addCriterion("yk_lysly <", value, "ykLysly");
            return (Criteria) this;
        }

        public Criteria andYkLyslyLessThanOrEqualTo(Float value) {
            addCriterion("yk_lysly <=", value, "ykLysly");
            return (Criteria) this;
        }

        public Criteria andYkLyslyIn(List<Float> values) {
            addCriterion("yk_lysly in", values, "ykLysly");
            return (Criteria) this;
        }

        public Criteria andYkLyslyNotIn(List<Float> values) {
            addCriterion("yk_lysly not in", values, "ykLysly");
            return (Criteria) this;
        }

        public Criteria andYkLyslyBetween(Float value1, Float value2) {
            addCriterion("yk_lysly between", value1, value2, "ykLysly");
            return (Criteria) this;
        }

        public Criteria andYkLyslyNotBetween(Float value1, Float value2) {
            addCriterion("yk_lysly not between", value1, value2, "ykLysly");
            return (Criteria) this;
        }

        public Criteria andYkLyslzIsNull() {
            addCriterion("yk_lyslz is null");
            return (Criteria) this;
        }

        public Criteria andYkLyslzIsNotNull() {
            addCriterion("yk_lyslz is not null");
            return (Criteria) this;
        }

        public Criteria andYkLyslzEqualTo(Float value) {
            addCriterion("yk_lyslz =", value, "ykLyslz");
            return (Criteria) this;
        }

        public Criteria andYkLyslzNotEqualTo(Float value) {
            addCriterion("yk_lyslz <>", value, "ykLyslz");
            return (Criteria) this;
        }

        public Criteria andYkLyslzGreaterThan(Float value) {
            addCriterion("yk_lyslz >", value, "ykLyslz");
            return (Criteria) this;
        }

        public Criteria andYkLyslzGreaterThanOrEqualTo(Float value) {
            addCriterion("yk_lyslz >=", value, "ykLyslz");
            return (Criteria) this;
        }

        public Criteria andYkLyslzLessThan(Float value) {
            addCriterion("yk_lyslz <", value, "ykLyslz");
            return (Criteria) this;
        }

        public Criteria andYkLyslzLessThanOrEqualTo(Float value) {
            addCriterion("yk_lyslz <=", value, "ykLyslz");
            return (Criteria) this;
        }

        public Criteria andYkLyslzIn(List<Float> values) {
            addCriterion("yk_lyslz in", values, "ykLyslz");
            return (Criteria) this;
        }

        public Criteria andYkLyslzNotIn(List<Float> values) {
            addCriterion("yk_lyslz not in", values, "ykLyslz");
            return (Criteria) this;
        }

        public Criteria andYkLyslzBetween(Float value1, Float value2) {
            addCriterion("yk_lyslz between", value1, value2, "ykLyslz");
            return (Criteria) this;
        }

        public Criteria andYkLyslzNotBetween(Float value1, Float value2) {
            addCriterion("yk_lyslz not between", value1, value2, "ykLyslz");
            return (Criteria) this;
        }

        public Criteria andYkJzslyIsNull() {
            addCriterion("yk_jzsly is null");
            return (Criteria) this;
        }

        public Criteria andYkJzslyIsNotNull() {
            addCriterion("yk_jzsly is not null");
            return (Criteria) this;
        }

        public Criteria andYkJzslyEqualTo(Float value) {
            addCriterion("yk_jzsly =", value, "ykJzsly");
            return (Criteria) this;
        }

        public Criteria andYkJzslyNotEqualTo(Float value) {
            addCriterion("yk_jzsly <>", value, "ykJzsly");
            return (Criteria) this;
        }

        public Criteria andYkJzslyGreaterThan(Float value) {
            addCriterion("yk_jzsly >", value, "ykJzsly");
            return (Criteria) this;
        }

        public Criteria andYkJzslyGreaterThanOrEqualTo(Float value) {
            addCriterion("yk_jzsly >=", value, "ykJzsly");
            return (Criteria) this;
        }

        public Criteria andYkJzslyLessThan(Float value) {
            addCriterion("yk_jzsly <", value, "ykJzsly");
            return (Criteria) this;
        }

        public Criteria andYkJzslyLessThanOrEqualTo(Float value) {
            addCriterion("yk_jzsly <=", value, "ykJzsly");
            return (Criteria) this;
        }

        public Criteria andYkJzslyIn(List<Float> values) {
            addCriterion("yk_jzsly in", values, "ykJzsly");
            return (Criteria) this;
        }

        public Criteria andYkJzslyNotIn(List<Float> values) {
            addCriterion("yk_jzsly not in", values, "ykJzsly");
            return (Criteria) this;
        }

        public Criteria andYkJzslyBetween(Float value1, Float value2) {
            addCriterion("yk_jzsly between", value1, value2, "ykJzsly");
            return (Criteria) this;
        }

        public Criteria andYkJzslyNotBetween(Float value1, Float value2) {
            addCriterion("yk_jzsly not between", value1, value2, "ykJzsly");
            return (Criteria) this;
        }

        public Criteria andYkJzslzIsNull() {
            addCriterion("yk_jzslz is null");
            return (Criteria) this;
        }

        public Criteria andYkJzslzIsNotNull() {
            addCriterion("yk_jzslz is not null");
            return (Criteria) this;
        }

        public Criteria andYkJzslzEqualTo(Float value) {
            addCriterion("yk_jzslz =", value, "ykJzslz");
            return (Criteria) this;
        }

        public Criteria andYkJzslzNotEqualTo(Float value) {
            addCriterion("yk_jzslz <>", value, "ykJzslz");
            return (Criteria) this;
        }

        public Criteria andYkJzslzGreaterThan(Float value) {
            addCriterion("yk_jzslz >", value, "ykJzslz");
            return (Criteria) this;
        }

        public Criteria andYkJzslzGreaterThanOrEqualTo(Float value) {
            addCriterion("yk_jzslz >=", value, "ykJzslz");
            return (Criteria) this;
        }

        public Criteria andYkJzslzLessThan(Float value) {
            addCriterion("yk_jzslz <", value, "ykJzslz");
            return (Criteria) this;
        }

        public Criteria andYkJzslzLessThanOrEqualTo(Float value) {
            addCriterion("yk_jzslz <=", value, "ykJzslz");
            return (Criteria) this;
        }

        public Criteria andYkJzslzIn(List<Float> values) {
            addCriterion("yk_jzslz in", values, "ykJzslz");
            return (Criteria) this;
        }

        public Criteria andYkJzslzNotIn(List<Float> values) {
            addCriterion("yk_jzslz not in", values, "ykJzslz");
            return (Criteria) this;
        }

        public Criteria andYkJzslzBetween(Float value1, Float value2) {
            addCriterion("yk_jzslz between", value1, value2, "ykJzslz");
            return (Criteria) this;
        }

        public Criteria andYkJzslzNotBetween(Float value1, Float value2) {
            addCriterion("yk_jzslz not between", value1, value2, "ykJzslz");
            return (Criteria) this;
        }

        public Criteria andYkJzdsyIsNull() {
            addCriterion("yk_jzdsy is null");
            return (Criteria) this;
        }

        public Criteria andYkJzdsyIsNotNull() {
            addCriterion("yk_jzdsy is not null");
            return (Criteria) this;
        }

        public Criteria andYkJzdsyEqualTo(Float value) {
            addCriterion("yk_jzdsy =", value, "ykJzdsy");
            return (Criteria) this;
        }

        public Criteria andYkJzdsyNotEqualTo(Float value) {
            addCriterion("yk_jzdsy <>", value, "ykJzdsy");
            return (Criteria) this;
        }

        public Criteria andYkJzdsyGreaterThan(Float value) {
            addCriterion("yk_jzdsy >", value, "ykJzdsy");
            return (Criteria) this;
        }

        public Criteria andYkJzdsyGreaterThanOrEqualTo(Float value) {
            addCriterion("yk_jzdsy >=", value, "ykJzdsy");
            return (Criteria) this;
        }

        public Criteria andYkJzdsyLessThan(Float value) {
            addCriterion("yk_jzdsy <", value, "ykJzdsy");
            return (Criteria) this;
        }

        public Criteria andYkJzdsyLessThanOrEqualTo(Float value) {
            addCriterion("yk_jzdsy <=", value, "ykJzdsy");
            return (Criteria) this;
        }

        public Criteria andYkJzdsyIn(List<Float> values) {
            addCriterion("yk_jzdsy in", values, "ykJzdsy");
            return (Criteria) this;
        }

        public Criteria andYkJzdsyNotIn(List<Float> values) {
            addCriterion("yk_jzdsy not in", values, "ykJzdsy");
            return (Criteria) this;
        }

        public Criteria andYkJzdsyBetween(Float value1, Float value2) {
            addCriterion("yk_jzdsy between", value1, value2, "ykJzdsy");
            return (Criteria) this;
        }

        public Criteria andYkJzdsyNotBetween(Float value1, Float value2) {
            addCriterion("yk_jzdsy not between", value1, value2, "ykJzdsy");
            return (Criteria) this;
        }

        public Criteria andYkJzdszIsNull() {
            addCriterion("yk_jzdsz is null");
            return (Criteria) this;
        }

        public Criteria andYkJzdszIsNotNull() {
            addCriterion("yk_jzdsz is not null");
            return (Criteria) this;
        }

        public Criteria andYkJzdszEqualTo(Float value) {
            addCriterion("yk_jzdsz =", value, "ykJzdsz");
            return (Criteria) this;
        }

        public Criteria andYkJzdszNotEqualTo(Float value) {
            addCriterion("yk_jzdsz <>", value, "ykJzdsz");
            return (Criteria) this;
        }

        public Criteria andYkJzdszGreaterThan(Float value) {
            addCriterion("yk_jzdsz >", value, "ykJzdsz");
            return (Criteria) this;
        }

        public Criteria andYkJzdszGreaterThanOrEqualTo(Float value) {
            addCriterion("yk_jzdsz >=", value, "ykJzdsz");
            return (Criteria) this;
        }

        public Criteria andYkJzdszLessThan(Float value) {
            addCriterion("yk_jzdsz <", value, "ykJzdsz");
            return (Criteria) this;
        }

        public Criteria andYkJzdszLessThanOrEqualTo(Float value) {
            addCriterion("yk_jzdsz <=", value, "ykJzdsz");
            return (Criteria) this;
        }

        public Criteria andYkJzdszIn(List<Float> values) {
            addCriterion("yk_jzdsz in", values, "ykJzdsz");
            return (Criteria) this;
        }

        public Criteria andYkJzdszNotIn(List<Float> values) {
            addCriterion("yk_jzdsz not in", values, "ykJzdsz");
            return (Criteria) this;
        }

        public Criteria andYkJzdszBetween(Float value1, Float value2) {
            addCriterion("yk_jzdsz between", value1, value2, "ykJzdsz");
            return (Criteria) this;
        }

        public Criteria andYkJzdszNotBetween(Float value1, Float value2) {
            addCriterion("yk_jzdsz not between", value1, value2, "ykJzdsz");
            return (Criteria) this;
        }

        public Criteria andYkSjjcIsNull() {
            addCriterion("yk_sjjc is null");
            return (Criteria) this;
        }

        public Criteria andYkSjjcIsNotNull() {
            addCriterion("yk_sjjc is not null");
            return (Criteria) this;
        }

        public Criteria andYkSjjcEqualTo(String value) {
            addCriterion("yk_sjjc =", value, "ykSjjc");
            return (Criteria) this;
        }

        public Criteria andYkSjjcNotEqualTo(String value) {
            addCriterion("yk_sjjc <>", value, "ykSjjc");
            return (Criteria) this;
        }

        public Criteria andYkSjjcGreaterThan(String value) {
            addCriterion("yk_sjjc >", value, "ykSjjc");
            return (Criteria) this;
        }

        public Criteria andYkSjjcGreaterThanOrEqualTo(String value) {
            addCriterion("yk_sjjc >=", value, "ykSjjc");
            return (Criteria) this;
        }

        public Criteria andYkSjjcLessThan(String value) {
            addCriterion("yk_sjjc <", value, "ykSjjc");
            return (Criteria) this;
        }

        public Criteria andYkSjjcLessThanOrEqualTo(String value) {
            addCriterion("yk_sjjc <=", value, "ykSjjc");
            return (Criteria) this;
        }

        public Criteria andYkSjjcLike(String value) {
            addCriterion("yk_sjjc like", value, "ykSjjc");
            return (Criteria) this;
        }

        public Criteria andYkSjjcNotLike(String value) {
            addCriterion("yk_sjjc not like", value, "ykSjjc");
            return (Criteria) this;
        }

        public Criteria andYkSjjcIn(List<String> values) {
            addCriterion("yk_sjjc in", values, "ykSjjc");
            return (Criteria) this;
        }

        public Criteria andYkSjjcNotIn(List<String> values) {
            addCriterion("yk_sjjc not in", values, "ykSjjc");
            return (Criteria) this;
        }

        public Criteria andYkSjjcBetween(String value1, String value2) {
            addCriterion("yk_sjjc between", value1, value2, "ykSjjc");
            return (Criteria) this;
        }

        public Criteria andYkSjjcNotBetween(String value1, String value2) {
            addCriterion("yk_sjjc not between", value1, value2, "ykSjjc");
            return (Criteria) this;
        }

        public Criteria andYkSjjctIsNull() {
            addCriterion("yk_sjjct is null");
            return (Criteria) this;
        }

        public Criteria andYkSjjctIsNotNull() {
            addCriterion("yk_sjjct is not null");
            return (Criteria) this;
        }

        public Criteria andYkSjjctEqualTo(String value) {
            addCriterion("yk_sjjct =", value, "ykSjjct");
            return (Criteria) this;
        }

        public Criteria andYkSjjctNotEqualTo(String value) {
            addCriterion("yk_sjjct <>", value, "ykSjjct");
            return (Criteria) this;
        }

        public Criteria andYkSjjctGreaterThan(String value) {
            addCriterion("yk_sjjct >", value, "ykSjjct");
            return (Criteria) this;
        }

        public Criteria andYkSjjctGreaterThanOrEqualTo(String value) {
            addCriterion("yk_sjjct >=", value, "ykSjjct");
            return (Criteria) this;
        }

        public Criteria andYkSjjctLessThan(String value) {
            addCriterion("yk_sjjct <", value, "ykSjjct");
            return (Criteria) this;
        }

        public Criteria andYkSjjctLessThanOrEqualTo(String value) {
            addCriterion("yk_sjjct <=", value, "ykSjjct");
            return (Criteria) this;
        }

        public Criteria andYkSjjctLike(String value) {
            addCriterion("yk_sjjct like", value, "ykSjjct");
            return (Criteria) this;
        }

        public Criteria andYkSjjctNotLike(String value) {
            addCriterion("yk_sjjct not like", value, "ykSjjct");
            return (Criteria) this;
        }

        public Criteria andYkSjjctIn(List<String> values) {
            addCriterion("yk_sjjct in", values, "ykSjjct");
            return (Criteria) this;
        }

        public Criteria andYkSjjctNotIn(List<String> values) {
            addCriterion("yk_sjjct not in", values, "ykSjjct");
            return (Criteria) this;
        }

        public Criteria andYkSjjctBetween(String value1, String value2) {
            addCriterion("yk_sjjct between", value1, value2, "ykSjjct");
            return (Criteria) this;
        }

        public Criteria andYkSjjctNotBetween(String value1, String value2) {
            addCriterion("yk_sjjct not between", value1, value2, "ykSjjct");
            return (Criteria) this;
        }

        public Criteria andYkSjds1IsNull() {
            addCriterion("yk_sjds1 is null");
            return (Criteria) this;
        }

        public Criteria andYkSjds1IsNotNull() {
            addCriterion("yk_sjds1 is not null");
            return (Criteria) this;
        }

        public Criteria andYkSjds1EqualTo(String value) {
            addCriterion("yk_sjds1 =", value, "ykSjds1");
            return (Criteria) this;
        }

        public Criteria andYkSjds1NotEqualTo(String value) {
            addCriterion("yk_sjds1 <>", value, "ykSjds1");
            return (Criteria) this;
        }

        public Criteria andYkSjds1GreaterThan(String value) {
            addCriterion("yk_sjds1 >", value, "ykSjds1");
            return (Criteria) this;
        }

        public Criteria andYkSjds1GreaterThanOrEqualTo(String value) {
            addCriterion("yk_sjds1 >=", value, "ykSjds1");
            return (Criteria) this;
        }

        public Criteria andYkSjds1LessThan(String value) {
            addCriterion("yk_sjds1 <", value, "ykSjds1");
            return (Criteria) this;
        }

        public Criteria andYkSjds1LessThanOrEqualTo(String value) {
            addCriterion("yk_sjds1 <=", value, "ykSjds1");
            return (Criteria) this;
        }

        public Criteria andYkSjds1Like(String value) {
            addCriterion("yk_sjds1 like", value, "ykSjds1");
            return (Criteria) this;
        }

        public Criteria andYkSjds1NotLike(String value) {
            addCriterion("yk_sjds1 not like", value, "ykSjds1");
            return (Criteria) this;
        }

        public Criteria andYkSjds1In(List<String> values) {
            addCriterion("yk_sjds1 in", values, "ykSjds1");
            return (Criteria) this;
        }

        public Criteria andYkSjds1NotIn(List<String> values) {
            addCriterion("yk_sjds1 not in", values, "ykSjds1");
            return (Criteria) this;
        }

        public Criteria andYkSjds1Between(String value1, String value2) {
            addCriterion("yk_sjds1 between", value1, value2, "ykSjds1");
            return (Criteria) this;
        }

        public Criteria andYkSjds1NotBetween(String value1, String value2) {
            addCriterion("yk_sjds1 not between", value1, value2, "ykSjds1");
            return (Criteria) this;
        }

        public Criteria andYkSjds2IsNull() {
            addCriterion("yk_sjds2 is null");
            return (Criteria) this;
        }

        public Criteria andYkSjds2IsNotNull() {
            addCriterion("yk_sjds2 is not null");
            return (Criteria) this;
        }

        public Criteria andYkSjds2EqualTo(String value) {
            addCriterion("yk_sjds2 =", value, "ykSjds2");
            return (Criteria) this;
        }

        public Criteria andYkSjds2NotEqualTo(String value) {
            addCriterion("yk_sjds2 <>", value, "ykSjds2");
            return (Criteria) this;
        }

        public Criteria andYkSjds2GreaterThan(String value) {
            addCriterion("yk_sjds2 >", value, "ykSjds2");
            return (Criteria) this;
        }

        public Criteria andYkSjds2GreaterThanOrEqualTo(String value) {
            addCriterion("yk_sjds2 >=", value, "ykSjds2");
            return (Criteria) this;
        }

        public Criteria andYkSjds2LessThan(String value) {
            addCriterion("yk_sjds2 <", value, "ykSjds2");
            return (Criteria) this;
        }

        public Criteria andYkSjds2LessThanOrEqualTo(String value) {
            addCriterion("yk_sjds2 <=", value, "ykSjds2");
            return (Criteria) this;
        }

        public Criteria andYkSjds2Like(String value) {
            addCriterion("yk_sjds2 like", value, "ykSjds2");
            return (Criteria) this;
        }

        public Criteria andYkSjds2NotLike(String value) {
            addCriterion("yk_sjds2 not like", value, "ykSjds2");
            return (Criteria) this;
        }

        public Criteria andYkSjds2In(List<String> values) {
            addCriterion("yk_sjds2 in", values, "ykSjds2");
            return (Criteria) this;
        }

        public Criteria andYkSjds2NotIn(List<String> values) {
            addCriterion("yk_sjds2 not in", values, "ykSjds2");
            return (Criteria) this;
        }

        public Criteria andYkSjds2Between(String value1, String value2) {
            addCriterion("yk_sjds2 between", value1, value2, "ykSjds2");
            return (Criteria) this;
        }

        public Criteria andYkSjds2NotBetween(String value1, String value2) {
            addCriterion("yk_sjds2 not between", value1, value2, "ykSjds2");
            return (Criteria) this;
        }

        public Criteria andYkSjds3IsNull() {
            addCriterion("yk_sjds3 is null");
            return (Criteria) this;
        }

        public Criteria andYkSjds3IsNotNull() {
            addCriterion("yk_sjds3 is not null");
            return (Criteria) this;
        }

        public Criteria andYkSjds3EqualTo(String value) {
            addCriterion("yk_sjds3 =", value, "ykSjds3");
            return (Criteria) this;
        }

        public Criteria andYkSjds3NotEqualTo(String value) {
            addCriterion("yk_sjds3 <>", value, "ykSjds3");
            return (Criteria) this;
        }

        public Criteria andYkSjds3GreaterThan(String value) {
            addCriterion("yk_sjds3 >", value, "ykSjds3");
            return (Criteria) this;
        }

        public Criteria andYkSjds3GreaterThanOrEqualTo(String value) {
            addCriterion("yk_sjds3 >=", value, "ykSjds3");
            return (Criteria) this;
        }

        public Criteria andYkSjds3LessThan(String value) {
            addCriterion("yk_sjds3 <", value, "ykSjds3");
            return (Criteria) this;
        }

        public Criteria andYkSjds3LessThanOrEqualTo(String value) {
            addCriterion("yk_sjds3 <=", value, "ykSjds3");
            return (Criteria) this;
        }

        public Criteria andYkSjds3Like(String value) {
            addCriterion("yk_sjds3 like", value, "ykSjds3");
            return (Criteria) this;
        }

        public Criteria andYkSjds3NotLike(String value) {
            addCriterion("yk_sjds3 not like", value, "ykSjds3");
            return (Criteria) this;
        }

        public Criteria andYkSjds3In(List<String> values) {
            addCriterion("yk_sjds3 in", values, "ykSjds3");
            return (Criteria) this;
        }

        public Criteria andYkSjds3NotIn(List<String> values) {
            addCriterion("yk_sjds3 not in", values, "ykSjds3");
            return (Criteria) this;
        }

        public Criteria andYkSjds3Between(String value1, String value2) {
            addCriterion("yk_sjds3 between", value1, value2, "ykSjds3");
            return (Criteria) this;
        }

        public Criteria andYkSjds3NotBetween(String value1, String value2) {
            addCriterion("yk_sjds3 not between", value1, value2, "ykSjds3");
            return (Criteria) this;
        }

        public Criteria andYkSjds4IsNull() {
            addCriterion("yk_sjds4 is null");
            return (Criteria) this;
        }

        public Criteria andYkSjds4IsNotNull() {
            addCriterion("yk_sjds4 is not null");
            return (Criteria) this;
        }

        public Criteria andYkSjds4EqualTo(String value) {
            addCriterion("yk_sjds4 =", value, "ykSjds4");
            return (Criteria) this;
        }

        public Criteria andYkSjds4NotEqualTo(String value) {
            addCriterion("yk_sjds4 <>", value, "ykSjds4");
            return (Criteria) this;
        }

        public Criteria andYkSjds4GreaterThan(String value) {
            addCriterion("yk_sjds4 >", value, "ykSjds4");
            return (Criteria) this;
        }

        public Criteria andYkSjds4GreaterThanOrEqualTo(String value) {
            addCriterion("yk_sjds4 >=", value, "ykSjds4");
            return (Criteria) this;
        }

        public Criteria andYkSjds4LessThan(String value) {
            addCriterion("yk_sjds4 <", value, "ykSjds4");
            return (Criteria) this;
        }

        public Criteria andYkSjds4LessThanOrEqualTo(String value) {
            addCriterion("yk_sjds4 <=", value, "ykSjds4");
            return (Criteria) this;
        }

        public Criteria andYkSjds4Like(String value) {
            addCriterion("yk_sjds4 like", value, "ykSjds4");
            return (Criteria) this;
        }

        public Criteria andYkSjds4NotLike(String value) {
            addCriterion("yk_sjds4 not like", value, "ykSjds4");
            return (Criteria) this;
        }

        public Criteria andYkSjds4In(List<String> values) {
            addCriterion("yk_sjds4 in", values, "ykSjds4");
            return (Criteria) this;
        }

        public Criteria andYkSjds4NotIn(List<String> values) {
            addCriterion("yk_sjds4 not in", values, "ykSjds4");
            return (Criteria) this;
        }

        public Criteria andYkSjds4Between(String value1, String value2) {
            addCriterion("yk_sjds4 between", value1, value2, "ykSjds4");
            return (Criteria) this;
        }

        public Criteria andYkSjds4NotBetween(String value1, String value2) {
            addCriterion("yk_sjds4 not between", value1, value2, "ykSjds4");
            return (Criteria) this;
        }

        public Criteria andYkSjds5IsNull() {
            addCriterion("yk_sjds5 is null");
            return (Criteria) this;
        }

        public Criteria andYkSjds5IsNotNull() {
            addCriterion("yk_sjds5 is not null");
            return (Criteria) this;
        }

        public Criteria andYkSjds5EqualTo(String value) {
            addCriterion("yk_sjds5 =", value, "ykSjds5");
            return (Criteria) this;
        }

        public Criteria andYkSjds5NotEqualTo(String value) {
            addCriterion("yk_sjds5 <>", value, "ykSjds5");
            return (Criteria) this;
        }

        public Criteria andYkSjds5GreaterThan(String value) {
            addCriterion("yk_sjds5 >", value, "ykSjds5");
            return (Criteria) this;
        }

        public Criteria andYkSjds5GreaterThanOrEqualTo(String value) {
            addCriterion("yk_sjds5 >=", value, "ykSjds5");
            return (Criteria) this;
        }

        public Criteria andYkSjds5LessThan(String value) {
            addCriterion("yk_sjds5 <", value, "ykSjds5");
            return (Criteria) this;
        }

        public Criteria andYkSjds5LessThanOrEqualTo(String value) {
            addCriterion("yk_sjds5 <=", value, "ykSjds5");
            return (Criteria) this;
        }

        public Criteria andYkSjds5Like(String value) {
            addCriterion("yk_sjds5 like", value, "ykSjds5");
            return (Criteria) this;
        }

        public Criteria andYkSjds5NotLike(String value) {
            addCriterion("yk_sjds5 not like", value, "ykSjds5");
            return (Criteria) this;
        }

        public Criteria andYkSjds5In(List<String> values) {
            addCriterion("yk_sjds5 in", values, "ykSjds5");
            return (Criteria) this;
        }

        public Criteria andYkSjds5NotIn(List<String> values) {
            addCriterion("yk_sjds5 not in", values, "ykSjds5");
            return (Criteria) this;
        }

        public Criteria andYkSjds5Between(String value1, String value2) {
            addCriterion("yk_sjds5 between", value1, value2, "ykSjds5");
            return (Criteria) this;
        }

        public Criteria andYkSjds5NotBetween(String value1, String value2) {
            addCriterion("yk_sjds5 not between", value1, value2, "ykSjds5");
            return (Criteria) this;
        }

        public Criteria andYkYsyjIsNull() {
            addCriterion("yk_ysyj is null");
            return (Criteria) this;
        }

        public Criteria andYkYsyjIsNotNull() {
            addCriterion("yk_ysyj is not null");
            return (Criteria) this;
        }

        public Criteria andYkYsyjEqualTo(String value) {
            addCriterion("yk_ysyj =", value, "ykYsyj");
            return (Criteria) this;
        }

        public Criteria andYkYsyjNotEqualTo(String value) {
            addCriterion("yk_ysyj <>", value, "ykYsyj");
            return (Criteria) this;
        }

        public Criteria andYkYsyjGreaterThan(String value) {
            addCriterion("yk_ysyj >", value, "ykYsyj");
            return (Criteria) this;
        }

        public Criteria andYkYsyjGreaterThanOrEqualTo(String value) {
            addCriterion("yk_ysyj >=", value, "ykYsyj");
            return (Criteria) this;
        }

        public Criteria andYkYsyjLessThan(String value) {
            addCriterion("yk_ysyj <", value, "ykYsyj");
            return (Criteria) this;
        }

        public Criteria andYkYsyjLessThanOrEqualTo(String value) {
            addCriterion("yk_ysyj <=", value, "ykYsyj");
            return (Criteria) this;
        }

        public Criteria andYkYsyjLike(String value) {
            addCriterion("yk_ysyj like", value, "ykYsyj");
            return (Criteria) this;
        }

        public Criteria andYkYsyjNotLike(String value) {
            addCriterion("yk_ysyj not like", value, "ykYsyj");
            return (Criteria) this;
        }

        public Criteria andYkYsyjIn(List<String> values) {
            addCriterion("yk_ysyj in", values, "ykYsyj");
            return (Criteria) this;
        }

        public Criteria andYkYsyjNotIn(List<String> values) {
            addCriterion("yk_ysyj not in", values, "ykYsyj");
            return (Criteria) this;
        }

        public Criteria andYkYsyjBetween(String value1, String value2) {
            addCriterion("yk_ysyj between", value1, value2, "ykYsyj");
            return (Criteria) this;
        }

        public Criteria andYkYsyjNotBetween(String value1, String value2) {
            addCriterion("yk_ysyj not between", value1, value2, "ykYsyj");
            return (Criteria) this;
        }

        public Criteria andYkYbIsNull() {
            addCriterion("yk_yb is null");
            return (Criteria) this;
        }

        public Criteria andYkYbIsNotNull() {
            addCriterion("yk_yb is not null");
            return (Criteria) this;
        }

        public Criteria andYkYbEqualTo(String value) {
            addCriterion("yk_yb =", value, "ykYb");
            return (Criteria) this;
        }

        public Criteria andYkYbNotEqualTo(String value) {
            addCriterion("yk_yb <>", value, "ykYb");
            return (Criteria) this;
        }

        public Criteria andYkYbGreaterThan(String value) {
            addCriterion("yk_yb >", value, "ykYb");
            return (Criteria) this;
        }

        public Criteria andYkYbGreaterThanOrEqualTo(String value) {
            addCriterion("yk_yb >=", value, "ykYb");
            return (Criteria) this;
        }

        public Criteria andYkYbLessThan(String value) {
            addCriterion("yk_yb <", value, "ykYb");
            return (Criteria) this;
        }

        public Criteria andYkYbLessThanOrEqualTo(String value) {
            addCriterion("yk_yb <=", value, "ykYb");
            return (Criteria) this;
        }

        public Criteria andYkYbLike(String value) {
            addCriterion("yk_yb like", value, "ykYb");
            return (Criteria) this;
        }

        public Criteria andYkYbNotLike(String value) {
            addCriterion("yk_yb not like", value, "ykYb");
            return (Criteria) this;
        }

        public Criteria andYkYbIn(List<String> values) {
            addCriterion("yk_yb in", values, "ykYb");
            return (Criteria) this;
        }

        public Criteria andYkYbNotIn(List<String> values) {
            addCriterion("yk_yb not in", values, "ykYb");
            return (Criteria) this;
        }

        public Criteria andYkYbBetween(String value1, String value2) {
            addCriterion("yk_yb between", value1, value2, "ykYb");
            return (Criteria) this;
        }

        public Criteria andYkYbNotBetween(String value1, String value2) {
            addCriterion("yk_yb not between", value1, value2, "ykYb");
            return (Criteria) this;
        }

        public Criteria andNkXyssyIsNull() {
            addCriterion("nk_xyssy is null");
            return (Criteria) this;
        }

        public Criteria andNkXyssyIsNotNull() {
            addCriterion("nk_xyssy is not null");
            return (Criteria) this;
        }

        public Criteria andNkXyssyEqualTo(Float value) {
            addCriterion("nk_xyssy =", value, "nkXyssy");
            return (Criteria) this;
        }

        public Criteria andNkXyssyNotEqualTo(Float value) {
            addCriterion("nk_xyssy <>", value, "nkXyssy");
            return (Criteria) this;
        }

        public Criteria andNkXyssyGreaterThan(Float value) {
            addCriterion("nk_xyssy >", value, "nkXyssy");
            return (Criteria) this;
        }

        public Criteria andNkXyssyGreaterThanOrEqualTo(Float value) {
            addCriterion("nk_xyssy >=", value, "nkXyssy");
            return (Criteria) this;
        }

        public Criteria andNkXyssyLessThan(Float value) {
            addCriterion("nk_xyssy <", value, "nkXyssy");
            return (Criteria) this;
        }

        public Criteria andNkXyssyLessThanOrEqualTo(Float value) {
            addCriterion("nk_xyssy <=", value, "nkXyssy");
            return (Criteria) this;
        }

        public Criteria andNkXyssyIn(List<Float> values) {
            addCriterion("nk_xyssy in", values, "nkXyssy");
            return (Criteria) this;
        }

        public Criteria andNkXyssyNotIn(List<Float> values) {
            addCriterion("nk_xyssy not in", values, "nkXyssy");
            return (Criteria) this;
        }

        public Criteria andNkXyssyBetween(Float value1, Float value2) {
            addCriterion("nk_xyssy between", value1, value2, "nkXyssy");
            return (Criteria) this;
        }

        public Criteria andNkXyssyNotBetween(Float value1, Float value2) {
            addCriterion("nk_xyssy not between", value1, value2, "nkXyssy");
            return (Criteria) this;
        }

        public Criteria andNkXyszyIsNull() {
            addCriterion("nk_xyszy is null");
            return (Criteria) this;
        }

        public Criteria andNkXyszyIsNotNull() {
            addCriterion("nk_xyszy is not null");
            return (Criteria) this;
        }

        public Criteria andNkXyszyEqualTo(Float value) {
            addCriterion("nk_xyszy =", value, "nkXyszy");
            return (Criteria) this;
        }

        public Criteria andNkXyszyNotEqualTo(Float value) {
            addCriterion("nk_xyszy <>", value, "nkXyszy");
            return (Criteria) this;
        }

        public Criteria andNkXyszyGreaterThan(Float value) {
            addCriterion("nk_xyszy >", value, "nkXyszy");
            return (Criteria) this;
        }

        public Criteria andNkXyszyGreaterThanOrEqualTo(Float value) {
            addCriterion("nk_xyszy >=", value, "nkXyszy");
            return (Criteria) this;
        }

        public Criteria andNkXyszyLessThan(Float value) {
            addCriterion("nk_xyszy <", value, "nkXyszy");
            return (Criteria) this;
        }

        public Criteria andNkXyszyLessThanOrEqualTo(Float value) {
            addCriterion("nk_xyszy <=", value, "nkXyszy");
            return (Criteria) this;
        }

        public Criteria andNkXyszyIn(List<Float> values) {
            addCriterion("nk_xyszy in", values, "nkXyszy");
            return (Criteria) this;
        }

        public Criteria andNkXyszyNotIn(List<Float> values) {
            addCriterion("nk_xyszy not in", values, "nkXyszy");
            return (Criteria) this;
        }

        public Criteria andNkXyszyBetween(Float value1, Float value2) {
            addCriterion("nk_xyszy between", value1, value2, "nkXyszy");
            return (Criteria) this;
        }

        public Criteria andNkXyszyNotBetween(Float value1, Float value2) {
            addCriterion("nk_xyszy not between", value1, value2, "nkXyszy");
            return (Criteria) this;
        }

        public Criteria andNkFyqkIsNull() {
            addCriterion("nk_fyqk is null");
            return (Criteria) this;
        }

        public Criteria andNkFyqkIsNotNull() {
            addCriterion("nk_fyqk is not null");
            return (Criteria) this;
        }

        public Criteria andNkFyqkEqualTo(String value) {
            addCriterion("nk_fyqk =", value, "nkFyqk");
            return (Criteria) this;
        }

        public Criteria andNkFyqkNotEqualTo(String value) {
            addCriterion("nk_fyqk <>", value, "nkFyqk");
            return (Criteria) this;
        }

        public Criteria andNkFyqkGreaterThan(String value) {
            addCriterion("nk_fyqk >", value, "nkFyqk");
            return (Criteria) this;
        }

        public Criteria andNkFyqkGreaterThanOrEqualTo(String value) {
            addCriterion("nk_fyqk >=", value, "nkFyqk");
            return (Criteria) this;
        }

        public Criteria andNkFyqkLessThan(String value) {
            addCriterion("nk_fyqk <", value, "nkFyqk");
            return (Criteria) this;
        }

        public Criteria andNkFyqkLessThanOrEqualTo(String value) {
            addCriterion("nk_fyqk <=", value, "nkFyqk");
            return (Criteria) this;
        }

        public Criteria andNkFyqkLike(String value) {
            addCriterion("nk_fyqk like", value, "nkFyqk");
            return (Criteria) this;
        }

        public Criteria andNkFyqkNotLike(String value) {
            addCriterion("nk_fyqk not like", value, "nkFyqk");
            return (Criteria) this;
        }

        public Criteria andNkFyqkIn(List<String> values) {
            addCriterion("nk_fyqk in", values, "nkFyqk");
            return (Criteria) this;
        }

        public Criteria andNkFyqkNotIn(List<String> values) {
            addCriterion("nk_fyqk not in", values, "nkFyqk");
            return (Criteria) this;
        }

        public Criteria andNkFyqkBetween(String value1, String value2) {
            addCriterion("nk_fyqk between", value1, value2, "nkFyqk");
            return (Criteria) this;
        }

        public Criteria andNkFyqkNotBetween(String value1, String value2) {
            addCriterion("nk_fyqk not between", value1, value2, "nkFyqk");
            return (Criteria) this;
        }

        public Criteria andNkXzjxgIsNull() {
            addCriterion("nk_xzjxg is null");
            return (Criteria) this;
        }

        public Criteria andNkXzjxgIsNotNull() {
            addCriterion("nk_xzjxg is not null");
            return (Criteria) this;
        }

        public Criteria andNkXzjxgEqualTo(String value) {
            addCriterion("nk_xzjxg =", value, "nkXzjxg");
            return (Criteria) this;
        }

        public Criteria andNkXzjxgNotEqualTo(String value) {
            addCriterion("nk_xzjxg <>", value, "nkXzjxg");
            return (Criteria) this;
        }

        public Criteria andNkXzjxgGreaterThan(String value) {
            addCriterion("nk_xzjxg >", value, "nkXzjxg");
            return (Criteria) this;
        }

        public Criteria andNkXzjxgGreaterThanOrEqualTo(String value) {
            addCriterion("nk_xzjxg >=", value, "nkXzjxg");
            return (Criteria) this;
        }

        public Criteria andNkXzjxgLessThan(String value) {
            addCriterion("nk_xzjxg <", value, "nkXzjxg");
            return (Criteria) this;
        }

        public Criteria andNkXzjxgLessThanOrEqualTo(String value) {
            addCriterion("nk_xzjxg <=", value, "nkXzjxg");
            return (Criteria) this;
        }

        public Criteria andNkXzjxgLike(String value) {
            addCriterion("nk_xzjxg like", value, "nkXzjxg");
            return (Criteria) this;
        }

        public Criteria andNkXzjxgNotLike(String value) {
            addCriterion("nk_xzjxg not like", value, "nkXzjxg");
            return (Criteria) this;
        }

        public Criteria andNkXzjxgIn(List<String> values) {
            addCriterion("nk_xzjxg in", values, "nkXzjxg");
            return (Criteria) this;
        }

        public Criteria andNkXzjxgNotIn(List<String> values) {
            addCriterion("nk_xzjxg not in", values, "nkXzjxg");
            return (Criteria) this;
        }

        public Criteria andNkXzjxgBetween(String value1, String value2) {
            addCriterion("nk_xzjxg between", value1, value2, "nkXzjxg");
            return (Criteria) this;
        }

        public Criteria andNkXzjxgNotBetween(String value1, String value2) {
            addCriterion("nk_xzjxg not between", value1, value2, "nkXzjxg");
            return (Criteria) this;
        }

        public Criteria andNkHxxtIsNull() {
            addCriterion("nk_hxxt is null");
            return (Criteria) this;
        }

        public Criteria andNkHxxtIsNotNull() {
            addCriterion("nk_hxxt is not null");
            return (Criteria) this;
        }

        public Criteria andNkHxxtEqualTo(String value) {
            addCriterion("nk_hxxt =", value, "nkHxxt");
            return (Criteria) this;
        }

        public Criteria andNkHxxtNotEqualTo(String value) {
            addCriterion("nk_hxxt <>", value, "nkHxxt");
            return (Criteria) this;
        }

        public Criteria andNkHxxtGreaterThan(String value) {
            addCriterion("nk_hxxt >", value, "nkHxxt");
            return (Criteria) this;
        }

        public Criteria andNkHxxtGreaterThanOrEqualTo(String value) {
            addCriterion("nk_hxxt >=", value, "nkHxxt");
            return (Criteria) this;
        }

        public Criteria andNkHxxtLessThan(String value) {
            addCriterion("nk_hxxt <", value, "nkHxxt");
            return (Criteria) this;
        }

        public Criteria andNkHxxtLessThanOrEqualTo(String value) {
            addCriterion("nk_hxxt <=", value, "nkHxxt");
            return (Criteria) this;
        }

        public Criteria andNkHxxtLike(String value) {
            addCriterion("nk_hxxt like", value, "nkHxxt");
            return (Criteria) this;
        }

        public Criteria andNkHxxtNotLike(String value) {
            addCriterion("nk_hxxt not like", value, "nkHxxt");
            return (Criteria) this;
        }

        public Criteria andNkHxxtIn(List<String> values) {
            addCriterion("nk_hxxt in", values, "nkHxxt");
            return (Criteria) this;
        }

        public Criteria andNkHxxtNotIn(List<String> values) {
            addCriterion("nk_hxxt not in", values, "nkHxxt");
            return (Criteria) this;
        }

        public Criteria andNkHxxtBetween(String value1, String value2) {
            addCriterion("nk_hxxt between", value1, value2, "nkHxxt");
            return (Criteria) this;
        }

        public Criteria andNkHxxtNotBetween(String value1, String value2) {
            addCriterion("nk_hxxt not between", value1, value2, "nkHxxt");
            return (Criteria) this;
        }

        public Criteria andNkSjxtIsNull() {
            addCriterion("nk_sjxt is null");
            return (Criteria) this;
        }

        public Criteria andNkSjxtIsNotNull() {
            addCriterion("nk_sjxt is not null");
            return (Criteria) this;
        }

        public Criteria andNkSjxtEqualTo(String value) {
            addCriterion("nk_sjxt =", value, "nkSjxt");
            return (Criteria) this;
        }

        public Criteria andNkSjxtNotEqualTo(String value) {
            addCriterion("nk_sjxt <>", value, "nkSjxt");
            return (Criteria) this;
        }

        public Criteria andNkSjxtGreaterThan(String value) {
            addCriterion("nk_sjxt >", value, "nkSjxt");
            return (Criteria) this;
        }

        public Criteria andNkSjxtGreaterThanOrEqualTo(String value) {
            addCriterion("nk_sjxt >=", value, "nkSjxt");
            return (Criteria) this;
        }

        public Criteria andNkSjxtLessThan(String value) {
            addCriterion("nk_sjxt <", value, "nkSjxt");
            return (Criteria) this;
        }

        public Criteria andNkSjxtLessThanOrEqualTo(String value) {
            addCriterion("nk_sjxt <=", value, "nkSjxt");
            return (Criteria) this;
        }

        public Criteria andNkSjxtLike(String value) {
            addCriterion("nk_sjxt like", value, "nkSjxt");
            return (Criteria) this;
        }

        public Criteria andNkSjxtNotLike(String value) {
            addCriterion("nk_sjxt not like", value, "nkSjxt");
            return (Criteria) this;
        }

        public Criteria andNkSjxtIn(List<String> values) {
            addCriterion("nk_sjxt in", values, "nkSjxt");
            return (Criteria) this;
        }

        public Criteria andNkSjxtNotIn(List<String> values) {
            addCriterion("nk_sjxt not in", values, "nkSjxt");
            return (Criteria) this;
        }

        public Criteria andNkSjxtBetween(String value1, String value2) {
            addCriterion("nk_sjxt between", value1, value2, "nkSjxt");
            return (Criteria) this;
        }

        public Criteria andNkSjxtNotBetween(String value1, String value2) {
            addCriterion("nk_sjxt not between", value1, value2, "nkSjxt");
            return (Criteria) this;
        }

        public Criteria andNkGIsNull() {
            addCriterion("nk_g is null");
            return (Criteria) this;
        }

        public Criteria andNkGIsNotNull() {
            addCriterion("nk_g is not null");
            return (Criteria) this;
        }

        public Criteria andNkGEqualTo(Float value) {
            addCriterion("nk_g =", value, "nkG");
            return (Criteria) this;
        }

        public Criteria andNkGNotEqualTo(Float value) {
            addCriterion("nk_g <>", value, "nkG");
            return (Criteria) this;
        }

        public Criteria andNkGGreaterThan(Float value) {
            addCriterion("nk_g >", value, "nkG");
            return (Criteria) this;
        }

        public Criteria andNkGGreaterThanOrEqualTo(Float value) {
            addCriterion("nk_g >=", value, "nkG");
            return (Criteria) this;
        }

        public Criteria andNkGLessThan(Float value) {
            addCriterion("nk_g <", value, "nkG");
            return (Criteria) this;
        }

        public Criteria andNkGLessThanOrEqualTo(Float value) {
            addCriterion("nk_g <=", value, "nkG");
            return (Criteria) this;
        }

        public Criteria andNkGIn(List<Float> values) {
            addCriterion("nk_g in", values, "nkG");
            return (Criteria) this;
        }

        public Criteria andNkGNotIn(List<Float> values) {
            addCriterion("nk_g not in", values, "nkG");
            return (Criteria) this;
        }

        public Criteria andNkGBetween(Float value1, Float value2) {
            addCriterion("nk_g between", value1, value2, "nkG");
            return (Criteria) this;
        }

        public Criteria andNkGNotBetween(Float value1, Float value2) {
            addCriterion("nk_g not between", value1, value2, "nkG");
            return (Criteria) this;
        }

        public Criteria andNkGxzIsNull() {
            addCriterion("nk_gxz is null");
            return (Criteria) this;
        }

        public Criteria andNkGxzIsNotNull() {
            addCriterion("nk_gxz is not null");
            return (Criteria) this;
        }

        public Criteria andNkGxzEqualTo(String value) {
            addCriterion("nk_gxz =", value, "nkGxz");
            return (Criteria) this;
        }

        public Criteria andNkGxzNotEqualTo(String value) {
            addCriterion("nk_gxz <>", value, "nkGxz");
            return (Criteria) this;
        }

        public Criteria andNkGxzGreaterThan(String value) {
            addCriterion("nk_gxz >", value, "nkGxz");
            return (Criteria) this;
        }

        public Criteria andNkGxzGreaterThanOrEqualTo(String value) {
            addCriterion("nk_gxz >=", value, "nkGxz");
            return (Criteria) this;
        }

        public Criteria andNkGxzLessThan(String value) {
            addCriterion("nk_gxz <", value, "nkGxz");
            return (Criteria) this;
        }

        public Criteria andNkGxzLessThanOrEqualTo(String value) {
            addCriterion("nk_gxz <=", value, "nkGxz");
            return (Criteria) this;
        }

        public Criteria andNkGxzLike(String value) {
            addCriterion("nk_gxz like", value, "nkGxz");
            return (Criteria) this;
        }

        public Criteria andNkGxzNotLike(String value) {
            addCriterion("nk_gxz not like", value, "nkGxz");
            return (Criteria) this;
        }

        public Criteria andNkGxzIn(List<String> values) {
            addCriterion("nk_gxz in", values, "nkGxz");
            return (Criteria) this;
        }

        public Criteria andNkGxzNotIn(List<String> values) {
            addCriterion("nk_gxz not in", values, "nkGxz");
            return (Criteria) this;
        }

        public Criteria andNkGxzBetween(String value1, String value2) {
            addCriterion("nk_gxz between", value1, value2, "nkGxz");
            return (Criteria) this;
        }

        public Criteria andNkGxzNotBetween(String value1, String value2) {
            addCriterion("nk_gxz not between", value1, value2, "nkGxz");
            return (Criteria) this;
        }

        public Criteria andNkPIsNull() {
            addCriterion("nk_p is null");
            return (Criteria) this;
        }

        public Criteria andNkPIsNotNull() {
            addCriterion("nk_p is not null");
            return (Criteria) this;
        }

        public Criteria andNkPEqualTo(Float value) {
            addCriterion("nk_p =", value, "nkP");
            return (Criteria) this;
        }

        public Criteria andNkPNotEqualTo(Float value) {
            addCriterion("nk_p <>", value, "nkP");
            return (Criteria) this;
        }

        public Criteria andNkPGreaterThan(Float value) {
            addCriterion("nk_p >", value, "nkP");
            return (Criteria) this;
        }

        public Criteria andNkPGreaterThanOrEqualTo(Float value) {
            addCriterion("nk_p >=", value, "nkP");
            return (Criteria) this;
        }

        public Criteria andNkPLessThan(Float value) {
            addCriterion("nk_p <", value, "nkP");
            return (Criteria) this;
        }

        public Criteria andNkPLessThanOrEqualTo(Float value) {
            addCriterion("nk_p <=", value, "nkP");
            return (Criteria) this;
        }

        public Criteria andNkPIn(List<Float> values) {
            addCriterion("nk_p in", values, "nkP");
            return (Criteria) this;
        }

        public Criteria andNkPNotIn(List<Float> values) {
            addCriterion("nk_p not in", values, "nkP");
            return (Criteria) this;
        }

        public Criteria andNkPBetween(Float value1, Float value2) {
            addCriterion("nk_p between", value1, value2, "nkP");
            return (Criteria) this;
        }

        public Criteria andNkPNotBetween(Float value1, Float value2) {
            addCriterion("nk_p not between", value1, value2, "nkP");
            return (Criteria) this;
        }

        public Criteria andNkPxzIsNull() {
            addCriterion("nk_pxz is null");
            return (Criteria) this;
        }

        public Criteria andNkPxzIsNotNull() {
            addCriterion("nk_pxz is not null");
            return (Criteria) this;
        }

        public Criteria andNkPxzEqualTo(String value) {
            addCriterion("nk_pxz =", value, "nkPxz");
            return (Criteria) this;
        }

        public Criteria andNkPxzNotEqualTo(String value) {
            addCriterion("nk_pxz <>", value, "nkPxz");
            return (Criteria) this;
        }

        public Criteria andNkPxzGreaterThan(String value) {
            addCriterion("nk_pxz >", value, "nkPxz");
            return (Criteria) this;
        }

        public Criteria andNkPxzGreaterThanOrEqualTo(String value) {
            addCriterion("nk_pxz >=", value, "nkPxz");
            return (Criteria) this;
        }

        public Criteria andNkPxzLessThan(String value) {
            addCriterion("nk_pxz <", value, "nkPxz");
            return (Criteria) this;
        }

        public Criteria andNkPxzLessThanOrEqualTo(String value) {
            addCriterion("nk_pxz <=", value, "nkPxz");
            return (Criteria) this;
        }

        public Criteria andNkPxzLike(String value) {
            addCriterion("nk_pxz like", value, "nkPxz");
            return (Criteria) this;
        }

        public Criteria andNkPxzNotLike(String value) {
            addCriterion("nk_pxz not like", value, "nkPxz");
            return (Criteria) this;
        }

        public Criteria andNkPxzIn(List<String> values) {
            addCriterion("nk_pxz in", values, "nkPxz");
            return (Criteria) this;
        }

        public Criteria andNkPxzNotIn(List<String> values) {
            addCriterion("nk_pxz not in", values, "nkPxz");
            return (Criteria) this;
        }

        public Criteria andNkPxzBetween(String value1, String value2) {
            addCriterion("nk_pxz between", value1, value2, "nkPxz");
            return (Criteria) this;
        }

        public Criteria andNkPxzNotBetween(String value1, String value2) {
            addCriterion("nk_pxz not between", value1, value2, "nkPxz");
            return (Criteria) this;
        }

        public Criteria andNkYsyjIsNull() {
            addCriterion("nk_ysyj is null");
            return (Criteria) this;
        }

        public Criteria andNkYsyjIsNotNull() {
            addCriterion("nk_ysyj is not null");
            return (Criteria) this;
        }

        public Criteria andNkYsyjEqualTo(String value) {
            addCriterion("nk_ysyj =", value, "nkYsyj");
            return (Criteria) this;
        }

        public Criteria andNkYsyjNotEqualTo(String value) {
            addCriterion("nk_ysyj <>", value, "nkYsyj");
            return (Criteria) this;
        }

        public Criteria andNkYsyjGreaterThan(String value) {
            addCriterion("nk_ysyj >", value, "nkYsyj");
            return (Criteria) this;
        }

        public Criteria andNkYsyjGreaterThanOrEqualTo(String value) {
            addCriterion("nk_ysyj >=", value, "nkYsyj");
            return (Criteria) this;
        }

        public Criteria andNkYsyjLessThan(String value) {
            addCriterion("nk_ysyj <", value, "nkYsyj");
            return (Criteria) this;
        }

        public Criteria andNkYsyjLessThanOrEqualTo(String value) {
            addCriterion("nk_ysyj <=", value, "nkYsyj");
            return (Criteria) this;
        }

        public Criteria andNkYsyjLike(String value) {
            addCriterion("nk_ysyj like", value, "nkYsyj");
            return (Criteria) this;
        }

        public Criteria andNkYsyjNotLike(String value) {
            addCriterion("nk_ysyj not like", value, "nkYsyj");
            return (Criteria) this;
        }

        public Criteria andNkYsyjIn(List<String> values) {
            addCriterion("nk_ysyj in", values, "nkYsyj");
            return (Criteria) this;
        }

        public Criteria andNkYsyjNotIn(List<String> values) {
            addCriterion("nk_ysyj not in", values, "nkYsyj");
            return (Criteria) this;
        }

        public Criteria andNkYsyjBetween(String value1, String value2) {
            addCriterion("nk_ysyj between", value1, value2, "nkYsyj");
            return (Criteria) this;
        }

        public Criteria andNkYsyjNotBetween(String value1, String value2) {
            addCriterion("nk_ysyj not between", value1, value2, "nkYsyj");
            return (Criteria) this;
        }

        public Criteria andNkQtIsNull() {
            addCriterion("nk_qt is null");
            return (Criteria) this;
        }

        public Criteria andNkQtIsNotNull() {
            addCriterion("nk_qt is not null");
            return (Criteria) this;
        }

        public Criteria andNkQtEqualTo(String value) {
            addCriterion("nk_qt =", value, "nkQt");
            return (Criteria) this;
        }

        public Criteria andNkQtNotEqualTo(String value) {
            addCriterion("nk_qt <>", value, "nkQt");
            return (Criteria) this;
        }

        public Criteria andNkQtGreaterThan(String value) {
            addCriterion("nk_qt >", value, "nkQt");
            return (Criteria) this;
        }

        public Criteria andNkQtGreaterThanOrEqualTo(String value) {
            addCriterion("nk_qt >=", value, "nkQt");
            return (Criteria) this;
        }

        public Criteria andNkQtLessThan(String value) {
            addCriterion("nk_qt <", value, "nkQt");
            return (Criteria) this;
        }

        public Criteria andNkQtLessThanOrEqualTo(String value) {
            addCriterion("nk_qt <=", value, "nkQt");
            return (Criteria) this;
        }

        public Criteria andNkQtLike(String value) {
            addCriterion("nk_qt like", value, "nkQt");
            return (Criteria) this;
        }

        public Criteria andNkQtNotLike(String value) {
            addCriterion("nk_qt not like", value, "nkQt");
            return (Criteria) this;
        }

        public Criteria andNkQtIn(List<String> values) {
            addCriterion("nk_qt in", values, "nkQt");
            return (Criteria) this;
        }

        public Criteria andNkQtNotIn(List<String> values) {
            addCriterion("nk_qt not in", values, "nkQt");
            return (Criteria) this;
        }

        public Criteria andNkQtBetween(String value1, String value2) {
            addCriterion("nk_qt between", value1, value2, "nkQt");
            return (Criteria) this;
        }

        public Criteria andNkQtNotBetween(String value1, String value2) {
            addCriterion("nk_qt not between", value1, value2, "nkQt");
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

        public Criteria andWkSgEqualTo(Float value) {
            addCriterion("wk_sg =", value, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkSgNotEqualTo(Float value) {
            addCriterion("wk_sg <>", value, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkSgGreaterThan(Float value) {
            addCriterion("wk_sg >", value, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkSgGreaterThanOrEqualTo(Float value) {
            addCriterion("wk_sg >=", value, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkSgLessThan(Float value) {
            addCriterion("wk_sg <", value, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkSgLessThanOrEqualTo(Float value) {
            addCriterion("wk_sg <=", value, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkSgIn(List<Float> values) {
            addCriterion("wk_sg in", values, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkSgNotIn(List<Float> values) {
            addCriterion("wk_sg not in", values, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkSgBetween(Float value1, Float value2) {
            addCriterion("wk_sg between", value1, value2, "wkSg");
            return (Criteria) this;
        }

        public Criteria andWkSgNotBetween(Float value1, Float value2) {
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

        public Criteria andWkTzEqualTo(Float value) {
            addCriterion("wk_tz =", value, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkTzNotEqualTo(Float value) {
            addCriterion("wk_tz <>", value, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkTzGreaterThan(Float value) {
            addCriterion("wk_tz >", value, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkTzGreaterThanOrEqualTo(Float value) {
            addCriterion("wk_tz >=", value, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkTzLessThan(Float value) {
            addCriterion("wk_tz <", value, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkTzLessThanOrEqualTo(Float value) {
            addCriterion("wk_tz <=", value, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkTzIn(List<Float> values) {
            addCriterion("wk_tz in", values, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkTzNotIn(List<Float> values) {
            addCriterion("wk_tz not in", values, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkTzBetween(Float value1, Float value2) {
            addCriterion("wk_tz between", value1, value2, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkTzNotBetween(Float value1, Float value2) {
            addCriterion("wk_tz not between", value1, value2, "wkTz");
            return (Criteria) this;
        }

        public Criteria andWkPfIsNull() {
            addCriterion("wk_pf is null");
            return (Criteria) this;
        }

        public Criteria andWkPfIsNotNull() {
            addCriterion("wk_pf is not null");
            return (Criteria) this;
        }

        public Criteria andWkPfEqualTo(String value) {
            addCriterion("wk_pf =", value, "wkPf");
            return (Criteria) this;
        }

        public Criteria andWkPfNotEqualTo(String value) {
            addCriterion("wk_pf <>", value, "wkPf");
            return (Criteria) this;
        }

        public Criteria andWkPfGreaterThan(String value) {
            addCriterion("wk_pf >", value, "wkPf");
            return (Criteria) this;
        }

        public Criteria andWkPfGreaterThanOrEqualTo(String value) {
            addCriterion("wk_pf >=", value, "wkPf");
            return (Criteria) this;
        }

        public Criteria andWkPfLessThan(String value) {
            addCriterion("wk_pf <", value, "wkPf");
            return (Criteria) this;
        }

        public Criteria andWkPfLessThanOrEqualTo(String value) {
            addCriterion("wk_pf <=", value, "wkPf");
            return (Criteria) this;
        }

        public Criteria andWkPfLike(String value) {
            addCriterion("wk_pf like", value, "wkPf");
            return (Criteria) this;
        }

        public Criteria andWkPfNotLike(String value) {
            addCriterion("wk_pf not like", value, "wkPf");
            return (Criteria) this;
        }

        public Criteria andWkPfIn(List<String> values) {
            addCriterion("wk_pf in", values, "wkPf");
            return (Criteria) this;
        }

        public Criteria andWkPfNotIn(List<String> values) {
            addCriterion("wk_pf not in", values, "wkPf");
            return (Criteria) this;
        }

        public Criteria andWkPfBetween(String value1, String value2) {
            addCriterion("wk_pf between", value1, value2, "wkPf");
            return (Criteria) this;
        }

        public Criteria andWkPfNotBetween(String value1, String value2) {
            addCriterion("wk_pf not between", value1, value2, "wkPf");
            return (Criteria) this;
        }

        public Criteria andWkMbIsNull() {
            addCriterion("wk_mb is null");
            return (Criteria) this;
        }

        public Criteria andWkMbIsNotNull() {
            addCriterion("wk_mb is not null");
            return (Criteria) this;
        }

        public Criteria andWkMbEqualTo(String value) {
            addCriterion("wk_mb =", value, "wkMb");
            return (Criteria) this;
        }

        public Criteria andWkMbNotEqualTo(String value) {
            addCriterion("wk_mb <>", value, "wkMb");
            return (Criteria) this;
        }

        public Criteria andWkMbGreaterThan(String value) {
            addCriterion("wk_mb >", value, "wkMb");
            return (Criteria) this;
        }

        public Criteria andWkMbGreaterThanOrEqualTo(String value) {
            addCriterion("wk_mb >=", value, "wkMb");
            return (Criteria) this;
        }

        public Criteria andWkMbLessThan(String value) {
            addCriterion("wk_mb <", value, "wkMb");
            return (Criteria) this;
        }

        public Criteria andWkMbLessThanOrEqualTo(String value) {
            addCriterion("wk_mb <=", value, "wkMb");
            return (Criteria) this;
        }

        public Criteria andWkMbLike(String value) {
            addCriterion("wk_mb like", value, "wkMb");
            return (Criteria) this;
        }

        public Criteria andWkMbNotLike(String value) {
            addCriterion("wk_mb not like", value, "wkMb");
            return (Criteria) this;
        }

        public Criteria andWkMbIn(List<String> values) {
            addCriterion("wk_mb in", values, "wkMb");
            return (Criteria) this;
        }

        public Criteria andWkMbNotIn(List<String> values) {
            addCriterion("wk_mb not in", values, "wkMb");
            return (Criteria) this;
        }

        public Criteria andWkMbBetween(String value1, String value2) {
            addCriterion("wk_mb between", value1, value2, "wkMb");
            return (Criteria) this;
        }

        public Criteria andWkMbNotBetween(String value1, String value2) {
            addCriterion("wk_mb not between", value1, value2, "wkMb");
            return (Criteria) this;
        }

        public Criteria andWkJbIsNull() {
            addCriterion("wk_jb is null");
            return (Criteria) this;
        }

        public Criteria andWkJbIsNotNull() {
            addCriterion("wk_jb is not null");
            return (Criteria) this;
        }

        public Criteria andWkJbEqualTo(String value) {
            addCriterion("wk_jb =", value, "wkJb");
            return (Criteria) this;
        }

        public Criteria andWkJbNotEqualTo(String value) {
            addCriterion("wk_jb <>", value, "wkJb");
            return (Criteria) this;
        }

        public Criteria andWkJbGreaterThan(String value) {
            addCriterion("wk_jb >", value, "wkJb");
            return (Criteria) this;
        }

        public Criteria andWkJbGreaterThanOrEqualTo(String value) {
            addCriterion("wk_jb >=", value, "wkJb");
            return (Criteria) this;
        }

        public Criteria andWkJbLessThan(String value) {
            addCriterion("wk_jb <", value, "wkJb");
            return (Criteria) this;
        }

        public Criteria andWkJbLessThanOrEqualTo(String value) {
            addCriterion("wk_jb <=", value, "wkJb");
            return (Criteria) this;
        }

        public Criteria andWkJbLike(String value) {
            addCriterion("wk_jb like", value, "wkJb");
            return (Criteria) this;
        }

        public Criteria andWkJbNotLike(String value) {
            addCriterion("wk_jb not like", value, "wkJb");
            return (Criteria) this;
        }

        public Criteria andWkJbIn(List<String> values) {
            addCriterion("wk_jb in", values, "wkJb");
            return (Criteria) this;
        }

        public Criteria andWkJbNotIn(List<String> values) {
            addCriterion("wk_jb not in", values, "wkJb");
            return (Criteria) this;
        }

        public Criteria andWkJbBetween(String value1, String value2) {
            addCriterion("wk_jb between", value1, value2, "wkJb");
            return (Criteria) this;
        }

        public Criteria andWkJbNotBetween(String value1, String value2) {
            addCriterion("wk_jb not between", value1, value2, "wkJb");
            return (Criteria) this;
        }

        public Criteria andWkJzIsNull() {
            addCriterion("wk_jz is null");
            return (Criteria) this;
        }

        public Criteria andWkJzIsNotNull() {
            addCriterion("wk_jz is not null");
            return (Criteria) this;
        }

        public Criteria andWkJzEqualTo(String value) {
            addCriterion("wk_jz =", value, "wkJz");
            return (Criteria) this;
        }

        public Criteria andWkJzNotEqualTo(String value) {
            addCriterion("wk_jz <>", value, "wkJz");
            return (Criteria) this;
        }

        public Criteria andWkJzGreaterThan(String value) {
            addCriterion("wk_jz >", value, "wkJz");
            return (Criteria) this;
        }

        public Criteria andWkJzGreaterThanOrEqualTo(String value) {
            addCriterion("wk_jz >=", value, "wkJz");
            return (Criteria) this;
        }

        public Criteria andWkJzLessThan(String value) {
            addCriterion("wk_jz <", value, "wkJz");
            return (Criteria) this;
        }

        public Criteria andWkJzLessThanOrEqualTo(String value) {
            addCriterion("wk_jz <=", value, "wkJz");
            return (Criteria) this;
        }

        public Criteria andWkJzLike(String value) {
            addCriterion("wk_jz like", value, "wkJz");
            return (Criteria) this;
        }

        public Criteria andWkJzNotLike(String value) {
            addCriterion("wk_jz not like", value, "wkJz");
            return (Criteria) this;
        }

        public Criteria andWkJzIn(List<String> values) {
            addCriterion("wk_jz in", values, "wkJz");
            return (Criteria) this;
        }

        public Criteria andWkJzNotIn(List<String> values) {
            addCriterion("wk_jz not in", values, "wkJz");
            return (Criteria) this;
        }

        public Criteria andWkJzBetween(String value1, String value2) {
            addCriterion("wk_jz between", value1, value2, "wkJz");
            return (Criteria) this;
        }

        public Criteria andWkJzNotBetween(String value1, String value2) {
            addCriterion("wk_jz not between", value1, value2, "wkJz");
            return (Criteria) this;
        }

        public Criteria andWkSzIsNull() {
            addCriterion("wk_sz is null");
            return (Criteria) this;
        }

        public Criteria andWkSzIsNotNull() {
            addCriterion("wk_sz is not null");
            return (Criteria) this;
        }

        public Criteria andWkSzEqualTo(String value) {
            addCriterion("wk_sz =", value, "wkSz");
            return (Criteria) this;
        }

        public Criteria andWkSzNotEqualTo(String value) {
            addCriterion("wk_sz <>", value, "wkSz");
            return (Criteria) this;
        }

        public Criteria andWkSzGreaterThan(String value) {
            addCriterion("wk_sz >", value, "wkSz");
            return (Criteria) this;
        }

        public Criteria andWkSzGreaterThanOrEqualTo(String value) {
            addCriterion("wk_sz >=", value, "wkSz");
            return (Criteria) this;
        }

        public Criteria andWkSzLessThan(String value) {
            addCriterion("wk_sz <", value, "wkSz");
            return (Criteria) this;
        }

        public Criteria andWkSzLessThanOrEqualTo(String value) {
            addCriterion("wk_sz <=", value, "wkSz");
            return (Criteria) this;
        }

        public Criteria andWkSzLike(String value) {
            addCriterion("wk_sz like", value, "wkSz");
            return (Criteria) this;
        }

        public Criteria andWkSzNotLike(String value) {
            addCriterion("wk_sz not like", value, "wkSz");
            return (Criteria) this;
        }

        public Criteria andWkSzIn(List<String> values) {
            addCriterion("wk_sz in", values, "wkSz");
            return (Criteria) this;
        }

        public Criteria andWkSzNotIn(List<String> values) {
            addCriterion("wk_sz not in", values, "wkSz");
            return (Criteria) this;
        }

        public Criteria andWkSzBetween(String value1, String value2) {
            addCriterion("wk_sz between", value1, value2, "wkSz");
            return (Criteria) this;
        }

        public Criteria andWkSzNotBetween(String value1, String value2) {
            addCriterion("wk_sz not between", value1, value2, "wkSz");
            return (Criteria) this;
        }

        public Criteria andWkGjIsNull() {
            addCriterion("wk_gj is null");
            return (Criteria) this;
        }

        public Criteria andWkGjIsNotNull() {
            addCriterion("wk_gj is not null");
            return (Criteria) this;
        }

        public Criteria andWkGjEqualTo(String value) {
            addCriterion("wk_gj =", value, "wkGj");
            return (Criteria) this;
        }

        public Criteria andWkGjNotEqualTo(String value) {
            addCriterion("wk_gj <>", value, "wkGj");
            return (Criteria) this;
        }

        public Criteria andWkGjGreaterThan(String value) {
            addCriterion("wk_gj >", value, "wkGj");
            return (Criteria) this;
        }

        public Criteria andWkGjGreaterThanOrEqualTo(String value) {
            addCriterion("wk_gj >=", value, "wkGj");
            return (Criteria) this;
        }

        public Criteria andWkGjLessThan(String value) {
            addCriterion("wk_gj <", value, "wkGj");
            return (Criteria) this;
        }

        public Criteria andWkGjLessThanOrEqualTo(String value) {
            addCriterion("wk_gj <=", value, "wkGj");
            return (Criteria) this;
        }

        public Criteria andWkGjLike(String value) {
            addCriterion("wk_gj like", value, "wkGj");
            return (Criteria) this;
        }

        public Criteria andWkGjNotLike(String value) {
            addCriterion("wk_gj not like", value, "wkGj");
            return (Criteria) this;
        }

        public Criteria andWkGjIn(List<String> values) {
            addCriterion("wk_gj in", values, "wkGj");
            return (Criteria) this;
        }

        public Criteria andWkGjNotIn(List<String> values) {
            addCriterion("wk_gj not in", values, "wkGj");
            return (Criteria) this;
        }

        public Criteria andWkGjBetween(String value1, String value2) {
            addCriterion("wk_gj between", value1, value2, "wkGj");
            return (Criteria) this;
        }

        public Criteria andWkGjNotBetween(String value1, String value2) {
            addCriterion("wk_gj not between", value1, value2, "wkGj");
            return (Criteria) this;
        }

        public Criteria andWkYsyjIsNull() {
            addCriterion("wk_ysyj is null");
            return (Criteria) this;
        }

        public Criteria andWkYsyjIsNotNull() {
            addCriterion("wk_ysyj is not null");
            return (Criteria) this;
        }

        public Criteria andWkYsyjEqualTo(String value) {
            addCriterion("wk_ysyj =", value, "wkYsyj");
            return (Criteria) this;
        }

        public Criteria andWkYsyjNotEqualTo(String value) {
            addCriterion("wk_ysyj <>", value, "wkYsyj");
            return (Criteria) this;
        }

        public Criteria andWkYsyjGreaterThan(String value) {
            addCriterion("wk_ysyj >", value, "wkYsyj");
            return (Criteria) this;
        }

        public Criteria andWkYsyjGreaterThanOrEqualTo(String value) {
            addCriterion("wk_ysyj >=", value, "wkYsyj");
            return (Criteria) this;
        }

        public Criteria andWkYsyjLessThan(String value) {
            addCriterion("wk_ysyj <", value, "wkYsyj");
            return (Criteria) this;
        }

        public Criteria andWkYsyjLessThanOrEqualTo(String value) {
            addCriterion("wk_ysyj <=", value, "wkYsyj");
            return (Criteria) this;
        }

        public Criteria andWkYsyjLike(String value) {
            addCriterion("wk_ysyj like", value, "wkYsyj");
            return (Criteria) this;
        }

        public Criteria andWkYsyjNotLike(String value) {
            addCriterion("wk_ysyj not like", value, "wkYsyj");
            return (Criteria) this;
        }

        public Criteria andWkYsyjIn(List<String> values) {
            addCriterion("wk_ysyj in", values, "wkYsyj");
            return (Criteria) this;
        }

        public Criteria andWkYsyjNotIn(List<String> values) {
            addCriterion("wk_ysyj not in", values, "wkYsyj");
            return (Criteria) this;
        }

        public Criteria andWkYsyjBetween(String value1, String value2) {
            addCriterion("wk_ysyj between", value1, value2, "wkYsyj");
            return (Criteria) this;
        }

        public Criteria andWkYsyjNotBetween(String value1, String value2) {
            addCriterion("wk_ysyj not between", value1, value2, "wkYsyj");
            return (Criteria) this;
        }

        public Criteria andWkQtIsNull() {
            addCriterion("wk_qt is null");
            return (Criteria) this;
        }

        public Criteria andWkQtIsNotNull() {
            addCriterion("wk_qt is not null");
            return (Criteria) this;
        }

        public Criteria andWkQtEqualTo(String value) {
            addCriterion("wk_qt =", value, "wkQt");
            return (Criteria) this;
        }

        public Criteria andWkQtNotEqualTo(String value) {
            addCriterion("wk_qt <>", value, "wkQt");
            return (Criteria) this;
        }

        public Criteria andWkQtGreaterThan(String value) {
            addCriterion("wk_qt >", value, "wkQt");
            return (Criteria) this;
        }

        public Criteria andWkQtGreaterThanOrEqualTo(String value) {
            addCriterion("wk_qt >=", value, "wkQt");
            return (Criteria) this;
        }

        public Criteria andWkQtLessThan(String value) {
            addCriterion("wk_qt <", value, "wkQt");
            return (Criteria) this;
        }

        public Criteria andWkQtLessThanOrEqualTo(String value) {
            addCriterion("wk_qt <=", value, "wkQt");
            return (Criteria) this;
        }

        public Criteria andWkQtLike(String value) {
            addCriterion("wk_qt like", value, "wkQt");
            return (Criteria) this;
        }

        public Criteria andWkQtNotLike(String value) {
            addCriterion("wk_qt not like", value, "wkQt");
            return (Criteria) this;
        }

        public Criteria andWkQtIn(List<String> values) {
            addCriterion("wk_qt in", values, "wkQt");
            return (Criteria) this;
        }

        public Criteria andWkQtNotIn(List<String> values) {
            addCriterion("wk_qt not in", values, "wkQt");
            return (Criteria) this;
        }

        public Criteria andWkQtBetween(String value1, String value2) {
            addCriterion("wk_qt between", value1, value2, "wkQt");
            return (Criteria) this;
        }

        public Criteria andWkQtNotBetween(String value1, String value2) {
            addCriterion("wk_qt not between", value1, value2, "wkQt");
            return (Criteria) this;
        }

        public Criteria andEbZetlIsNull() {
            addCriterion("eb_zetl is null");
            return (Criteria) this;
        }

        public Criteria andEbZetlIsNotNull() {
            addCriterion("eb_zetl is not null");
            return (Criteria) this;
        }

        public Criteria andEbZetlEqualTo(Float value) {
            addCriterion("eb_zetl =", value, "ebZetl");
            return (Criteria) this;
        }

        public Criteria andEbZetlNotEqualTo(Float value) {
            addCriterion("eb_zetl <>", value, "ebZetl");
            return (Criteria) this;
        }

        public Criteria andEbZetlGreaterThan(Float value) {
            addCriterion("eb_zetl >", value, "ebZetl");
            return (Criteria) this;
        }

        public Criteria andEbZetlGreaterThanOrEqualTo(Float value) {
            addCriterion("eb_zetl >=", value, "ebZetl");
            return (Criteria) this;
        }

        public Criteria andEbZetlLessThan(Float value) {
            addCriterion("eb_zetl <", value, "ebZetl");
            return (Criteria) this;
        }

        public Criteria andEbZetlLessThanOrEqualTo(Float value) {
            addCriterion("eb_zetl <=", value, "ebZetl");
            return (Criteria) this;
        }

        public Criteria andEbZetlIn(List<Float> values) {
            addCriterion("eb_zetl in", values, "ebZetl");
            return (Criteria) this;
        }

        public Criteria andEbZetlNotIn(List<Float> values) {
            addCriterion("eb_zetl not in", values, "ebZetl");
            return (Criteria) this;
        }

        public Criteria andEbZetlBetween(Float value1, Float value2) {
            addCriterion("eb_zetl between", value1, value2, "ebZetl");
            return (Criteria) this;
        }

        public Criteria andEbZetlNotBetween(Float value1, Float value2) {
            addCriterion("eb_zetl not between", value1, value2, "ebZetl");
            return (Criteria) this;
        }

        public Criteria andEbYetlIsNull() {
            addCriterion("eb_yetl is null");
            return (Criteria) this;
        }

        public Criteria andEbYetlIsNotNull() {
            addCriterion("eb_yetl is not null");
            return (Criteria) this;
        }

        public Criteria andEbYetlEqualTo(Float value) {
            addCriterion("eb_yetl =", value, "ebYetl");
            return (Criteria) this;
        }

        public Criteria andEbYetlNotEqualTo(Float value) {
            addCriterion("eb_yetl <>", value, "ebYetl");
            return (Criteria) this;
        }

        public Criteria andEbYetlGreaterThan(Float value) {
            addCriterion("eb_yetl >", value, "ebYetl");
            return (Criteria) this;
        }

        public Criteria andEbYetlGreaterThanOrEqualTo(Float value) {
            addCriterion("eb_yetl >=", value, "ebYetl");
            return (Criteria) this;
        }

        public Criteria andEbYetlLessThan(Float value) {
            addCriterion("eb_yetl <", value, "ebYetl");
            return (Criteria) this;
        }

        public Criteria andEbYetlLessThanOrEqualTo(Float value) {
            addCriterion("eb_yetl <=", value, "ebYetl");
            return (Criteria) this;
        }

        public Criteria andEbYetlIn(List<Float> values) {
            addCriterion("eb_yetl in", values, "ebYetl");
            return (Criteria) this;
        }

        public Criteria andEbYetlNotIn(List<Float> values) {
            addCriterion("eb_yetl not in", values, "ebYetl");
            return (Criteria) this;
        }

        public Criteria andEbYetlBetween(Float value1, Float value2) {
            addCriterion("eb_yetl between", value1, value2, "ebYetl");
            return (Criteria) this;
        }

        public Criteria andEbYetlNotBetween(Float value1, Float value2) {
            addCriterion("eb_yetl not between", value1, value2, "ebYetl");
            return (Criteria) this;
        }

        public Criteria andEbXjIsNull() {
            addCriterion("eb_xj is null");
            return (Criteria) this;
        }

        public Criteria andEbXjIsNotNull() {
            addCriterion("eb_xj is not null");
            return (Criteria) this;
        }

        public Criteria andEbXjEqualTo(String value) {
            addCriterion("eb_xj =", value, "ebXj");
            return (Criteria) this;
        }

        public Criteria andEbXjNotEqualTo(String value) {
            addCriterion("eb_xj <>", value, "ebXj");
            return (Criteria) this;
        }

        public Criteria andEbXjGreaterThan(String value) {
            addCriterion("eb_xj >", value, "ebXj");
            return (Criteria) this;
        }

        public Criteria andEbXjGreaterThanOrEqualTo(String value) {
            addCriterion("eb_xj >=", value, "ebXj");
            return (Criteria) this;
        }

        public Criteria andEbXjLessThan(String value) {
            addCriterion("eb_xj <", value, "ebXj");
            return (Criteria) this;
        }

        public Criteria andEbXjLessThanOrEqualTo(String value) {
            addCriterion("eb_xj <=", value, "ebXj");
            return (Criteria) this;
        }

        public Criteria andEbXjLike(String value) {
            addCriterion("eb_xj like", value, "ebXj");
            return (Criteria) this;
        }

        public Criteria andEbXjNotLike(String value) {
            addCriterion("eb_xj not like", value, "ebXj");
            return (Criteria) this;
        }

        public Criteria andEbXjIn(List<String> values) {
            addCriterion("eb_xj in", values, "ebXj");
            return (Criteria) this;
        }

        public Criteria andEbXjNotIn(List<String> values) {
            addCriterion("eb_xj not in", values, "ebXj");
            return (Criteria) this;
        }

        public Criteria andEbXjBetween(String value1, String value2) {
            addCriterion("eb_xj between", value1, value2, "ebXj");
            return (Criteria) this;
        }

        public Criteria andEbXjNotBetween(String value1, String value2) {
            addCriterion("eb_xj not between", value1, value2, "ebXj");
            return (Criteria) this;
        }

        public Criteria andEbYsyjIsNull() {
            addCriterion("eb_ysyj is null");
            return (Criteria) this;
        }

        public Criteria andEbYsyjIsNotNull() {
            addCriterion("eb_ysyj is not null");
            return (Criteria) this;
        }

        public Criteria andEbYsyjEqualTo(String value) {
            addCriterion("eb_ysyj =", value, "ebYsyj");
            return (Criteria) this;
        }

        public Criteria andEbYsyjNotEqualTo(String value) {
            addCriterion("eb_ysyj <>", value, "ebYsyj");
            return (Criteria) this;
        }

        public Criteria andEbYsyjGreaterThan(String value) {
            addCriterion("eb_ysyj >", value, "ebYsyj");
            return (Criteria) this;
        }

        public Criteria andEbYsyjGreaterThanOrEqualTo(String value) {
            addCriterion("eb_ysyj >=", value, "ebYsyj");
            return (Criteria) this;
        }

        public Criteria andEbYsyjLessThan(String value) {
            addCriterion("eb_ysyj <", value, "ebYsyj");
            return (Criteria) this;
        }

        public Criteria andEbYsyjLessThanOrEqualTo(String value) {
            addCriterion("eb_ysyj <=", value, "ebYsyj");
            return (Criteria) this;
        }

        public Criteria andEbYsyjLike(String value) {
            addCriterion("eb_ysyj like", value, "ebYsyj");
            return (Criteria) this;
        }

        public Criteria andEbYsyjNotLike(String value) {
            addCriterion("eb_ysyj not like", value, "ebYsyj");
            return (Criteria) this;
        }

        public Criteria andEbYsyjIn(List<String> values) {
            addCriterion("eb_ysyj in", values, "ebYsyj");
            return (Criteria) this;
        }

        public Criteria andEbYsyjNotIn(List<String> values) {
            addCriterion("eb_ysyj not in", values, "ebYsyj");
            return (Criteria) this;
        }

        public Criteria andEbYsyjBetween(String value1, String value2) {
            addCriterion("eb_ysyj between", value1, value2, "ebYsyj");
            return (Criteria) this;
        }

        public Criteria andEbYsyjNotBetween(String value1, String value2) {
            addCriterion("eb_ysyj not between", value1, value2, "ebYsyj");
            return (Criteria) this;
        }

        public Criteria andEbEbyhIsNull() {
            addCriterion("eb_ebyh is null");
            return (Criteria) this;
        }

        public Criteria andEbEbyhIsNotNull() {
            addCriterion("eb_ebyh is not null");
            return (Criteria) this;
        }

        public Criteria andEbEbyhEqualTo(String value) {
            addCriterion("eb_ebyh =", value, "ebEbyh");
            return (Criteria) this;
        }

        public Criteria andEbEbyhNotEqualTo(String value) {
            addCriterion("eb_ebyh <>", value, "ebEbyh");
            return (Criteria) this;
        }

        public Criteria andEbEbyhGreaterThan(String value) {
            addCriterion("eb_ebyh >", value, "ebEbyh");
            return (Criteria) this;
        }

        public Criteria andEbEbyhGreaterThanOrEqualTo(String value) {
            addCriterion("eb_ebyh >=", value, "ebEbyh");
            return (Criteria) this;
        }

        public Criteria andEbEbyhLessThan(String value) {
            addCriterion("eb_ebyh <", value, "ebEbyh");
            return (Criteria) this;
        }

        public Criteria andEbEbyhLessThanOrEqualTo(String value) {
            addCriterion("eb_ebyh <=", value, "ebEbyh");
            return (Criteria) this;
        }

        public Criteria andEbEbyhLike(String value) {
            addCriterion("eb_ebyh like", value, "ebEbyh");
            return (Criteria) this;
        }

        public Criteria andEbEbyhNotLike(String value) {
            addCriterion("eb_ebyh not like", value, "ebEbyh");
            return (Criteria) this;
        }

        public Criteria andEbEbyhIn(List<String> values) {
            addCriterion("eb_ebyh in", values, "ebEbyh");
            return (Criteria) this;
        }

        public Criteria andEbEbyhNotIn(List<String> values) {
            addCriterion("eb_ebyh not in", values, "ebEbyh");
            return (Criteria) this;
        }

        public Criteria andEbEbyhBetween(String value1, String value2) {
            addCriterion("eb_ebyh between", value1, value2, "ebEbyh");
            return (Criteria) this;
        }

        public Criteria andEbEbyhNotBetween(String value1, String value2) {
            addCriterion("eb_ebyh not between", value1, value2, "ebEbyh");
            return (Criteria) this;
        }

        public Criteria andKqCeIsNull() {
            addCriterion("kq_ce is null");
            return (Criteria) this;
        }

        public Criteria andKqCeIsNotNull() {
            addCriterion("kq_ce is not null");
            return (Criteria) this;
        }

        public Criteria andKqCeEqualTo(String value) {
            addCriterion("kq_ce =", value, "kqCe");
            return (Criteria) this;
        }

        public Criteria andKqCeNotEqualTo(String value) {
            addCriterion("kq_ce <>", value, "kqCe");
            return (Criteria) this;
        }

        public Criteria andKqCeGreaterThan(String value) {
            addCriterion("kq_ce >", value, "kqCe");
            return (Criteria) this;
        }

        public Criteria andKqCeGreaterThanOrEqualTo(String value) {
            addCriterion("kq_ce >=", value, "kqCe");
            return (Criteria) this;
        }

        public Criteria andKqCeLessThan(String value) {
            addCriterion("kq_ce <", value, "kqCe");
            return (Criteria) this;
        }

        public Criteria andKqCeLessThanOrEqualTo(String value) {
            addCriterion("kq_ce <=", value, "kqCe");
            return (Criteria) this;
        }

        public Criteria andKqCeLike(String value) {
            addCriterion("kq_ce like", value, "kqCe");
            return (Criteria) this;
        }

        public Criteria andKqCeNotLike(String value) {
            addCriterion("kq_ce not like", value, "kqCe");
            return (Criteria) this;
        }

        public Criteria andKqCeIn(List<String> values) {
            addCriterion("kq_ce in", values, "kqCe");
            return (Criteria) this;
        }

        public Criteria andKqCeNotIn(List<String> values) {
            addCriterion("kq_ce not in", values, "kqCe");
            return (Criteria) this;
        }

        public Criteria andKqCeBetween(String value1, String value2) {
            addCriterion("kq_ce between", value1, value2, "kqCe");
            return (Criteria) this;
        }

        public Criteria andKqCeNotBetween(String value1, String value2) {
            addCriterion("kq_ce not between", value1, value2, "kqCe");
            return (Criteria) this;
        }

        public Criteria andKqSfkcIsNull() {
            addCriterion("kq_sfkc is null");
            return (Criteria) this;
        }

        public Criteria andKqSfkcIsNotNull() {
            addCriterion("kq_sfkc is not null");
            return (Criteria) this;
        }

        public Criteria andKqSfkcEqualTo(String value) {
            addCriterion("kq_sfkc =", value, "kqSfkc");
            return (Criteria) this;
        }

        public Criteria andKqSfkcNotEqualTo(String value) {
            addCriterion("kq_sfkc <>", value, "kqSfkc");
            return (Criteria) this;
        }

        public Criteria andKqSfkcGreaterThan(String value) {
            addCriterion("kq_sfkc >", value, "kqSfkc");
            return (Criteria) this;
        }

        public Criteria andKqSfkcGreaterThanOrEqualTo(String value) {
            addCriterion("kq_sfkc >=", value, "kqSfkc");
            return (Criteria) this;
        }

        public Criteria andKqSfkcLessThan(String value) {
            addCriterion("kq_sfkc <", value, "kqSfkc");
            return (Criteria) this;
        }

        public Criteria andKqSfkcLessThanOrEqualTo(String value) {
            addCriterion("kq_sfkc <=", value, "kqSfkc");
            return (Criteria) this;
        }

        public Criteria andKqSfkcLike(String value) {
            addCriterion("kq_sfkc like", value, "kqSfkc");
            return (Criteria) this;
        }

        public Criteria andKqSfkcNotLike(String value) {
            addCriterion("kq_sfkc not like", value, "kqSfkc");
            return (Criteria) this;
        }

        public Criteria andKqSfkcIn(List<String> values) {
            addCriterion("kq_sfkc in", values, "kqSfkc");
            return (Criteria) this;
        }

        public Criteria andKqSfkcNotIn(List<String> values) {
            addCriterion("kq_sfkc not in", values, "kqSfkc");
            return (Criteria) this;
        }

        public Criteria andKqSfkcBetween(String value1, String value2) {
            addCriterion("kq_sfkc between", value1, value2, "kqSfkc");
            return (Criteria) this;
        }

        public Criteria andKqSfkcNotBetween(String value1, String value2) {
            addCriterion("kq_sfkc not between", value1, value2, "kqSfkc");
            return (Criteria) this;
        }

        public Criteria andKqYcIsNull() {
            addCriterion("kq_yc is null");
            return (Criteria) this;
        }

        public Criteria andKqYcIsNotNull() {
            addCriterion("kq_yc is not null");
            return (Criteria) this;
        }

        public Criteria andKqYcEqualTo(String value) {
            addCriterion("kq_yc =", value, "kqYc");
            return (Criteria) this;
        }

        public Criteria andKqYcNotEqualTo(String value) {
            addCriterion("kq_yc <>", value, "kqYc");
            return (Criteria) this;
        }

        public Criteria andKqYcGreaterThan(String value) {
            addCriterion("kq_yc >", value, "kqYc");
            return (Criteria) this;
        }

        public Criteria andKqYcGreaterThanOrEqualTo(String value) {
            addCriterion("kq_yc >=", value, "kqYc");
            return (Criteria) this;
        }

        public Criteria andKqYcLessThan(String value) {
            addCriterion("kq_yc <", value, "kqYc");
            return (Criteria) this;
        }

        public Criteria andKqYcLessThanOrEqualTo(String value) {
            addCriterion("kq_yc <=", value, "kqYc");
            return (Criteria) this;
        }

        public Criteria andKqYcLike(String value) {
            addCriterion("kq_yc like", value, "kqYc");
            return (Criteria) this;
        }

        public Criteria andKqYcNotLike(String value) {
            addCriterion("kq_yc not like", value, "kqYc");
            return (Criteria) this;
        }

        public Criteria andKqYcIn(List<String> values) {
            addCriterion("kq_yc in", values, "kqYc");
            return (Criteria) this;
        }

        public Criteria andKqYcNotIn(List<String> values) {
            addCriterion("kq_yc not in", values, "kqYc");
            return (Criteria) this;
        }

        public Criteria andKqYcBetween(String value1, String value2) {
            addCriterion("kq_yc between", value1, value2, "kqYc");
            return (Criteria) this;
        }

        public Criteria andKqYcNotBetween(String value1, String value2) {
            addCriterion("kq_yc not between", value1, value2, "kqYc");
            return (Criteria) this;
        }

        public Criteria andKqYsyjIsNull() {
            addCriterion("kq_ysyj is null");
            return (Criteria) this;
        }

        public Criteria andKqYsyjIsNotNull() {
            addCriterion("kq_ysyj is not null");
            return (Criteria) this;
        }

        public Criteria andKqYsyjEqualTo(String value) {
            addCriterion("kq_ysyj =", value, "kqYsyj");
            return (Criteria) this;
        }

        public Criteria andKqYsyjNotEqualTo(String value) {
            addCriterion("kq_ysyj <>", value, "kqYsyj");
            return (Criteria) this;
        }

        public Criteria andKqYsyjGreaterThan(String value) {
            addCriterion("kq_ysyj >", value, "kqYsyj");
            return (Criteria) this;
        }

        public Criteria andKqYsyjGreaterThanOrEqualTo(String value) {
            addCriterion("kq_ysyj >=", value, "kqYsyj");
            return (Criteria) this;
        }

        public Criteria andKqYsyjLessThan(String value) {
            addCriterion("kq_ysyj <", value, "kqYsyj");
            return (Criteria) this;
        }

        public Criteria andKqYsyjLessThanOrEqualTo(String value) {
            addCriterion("kq_ysyj <=", value, "kqYsyj");
            return (Criteria) this;
        }

        public Criteria andKqYsyjLike(String value) {
            addCriterion("kq_ysyj like", value, "kqYsyj");
            return (Criteria) this;
        }

        public Criteria andKqYsyjNotLike(String value) {
            addCriterion("kq_ysyj not like", value, "kqYsyj");
            return (Criteria) this;
        }

        public Criteria andKqYsyjIn(List<String> values) {
            addCriterion("kq_ysyj in", values, "kqYsyj");
            return (Criteria) this;
        }

        public Criteria andKqYsyjNotIn(List<String> values) {
            addCriterion("kq_ysyj not in", values, "kqYsyj");
            return (Criteria) this;
        }

        public Criteria andKqYsyjBetween(String value1, String value2) {
            addCriterion("kq_ysyj between", value1, value2, "kqYsyj");
            return (Criteria) this;
        }

        public Criteria andKqYsyjNotBetween(String value1, String value2) {
            addCriterion("kq_ysyj not between", value1, value2, "kqYsyj");
            return (Criteria) this;
        }

        public Criteria andKqQtIsNull() {
            addCriterion("kq_qt is null");
            return (Criteria) this;
        }

        public Criteria andKqQtIsNotNull() {
            addCriterion("kq_qt is not null");
            return (Criteria) this;
        }

        public Criteria andKqQtEqualTo(String value) {
            addCriterion("kq_qt =", value, "kqQt");
            return (Criteria) this;
        }

        public Criteria andKqQtNotEqualTo(String value) {
            addCriterion("kq_qt <>", value, "kqQt");
            return (Criteria) this;
        }

        public Criteria andKqQtGreaterThan(String value) {
            addCriterion("kq_qt >", value, "kqQt");
            return (Criteria) this;
        }

        public Criteria andKqQtGreaterThanOrEqualTo(String value) {
            addCriterion("kq_qt >=", value, "kqQt");
            return (Criteria) this;
        }

        public Criteria andKqQtLessThan(String value) {
            addCriterion("kq_qt <", value, "kqQt");
            return (Criteria) this;
        }

        public Criteria andKqQtLessThanOrEqualTo(String value) {
            addCriterion("kq_qt <=", value, "kqQt");
            return (Criteria) this;
        }

        public Criteria andKqQtLike(String value) {
            addCriterion("kq_qt like", value, "kqQt");
            return (Criteria) this;
        }

        public Criteria andKqQtNotLike(String value) {
            addCriterion("kq_qt not like", value, "kqQt");
            return (Criteria) this;
        }

        public Criteria andKqQtIn(List<String> values) {
            addCriterion("kq_qt in", values, "kqQt");
            return (Criteria) this;
        }

        public Criteria andKqQtNotIn(List<String> values) {
            addCriterion("kq_qt not in", values, "kqQt");
            return (Criteria) this;
        }

        public Criteria andKqQtBetween(String value1, String value2) {
            addCriterion("kq_qt between", value1, value2, "kqQt");
            return (Criteria) this;
        }

        public Criteria andKqQtNotBetween(String value1, String value2) {
            addCriterion("kq_qt not between", value1, value2, "kqQt");
            return (Criteria) this;
        }

        public Criteria andXtIsNull() {
            addCriterion("xt is null");
            return (Criteria) this;
        }

        public Criteria andXtIsNotNull() {
            addCriterion("xt is not null");
            return (Criteria) this;
        }

        public Criteria andXtEqualTo(String value) {
            addCriterion("xt =", value, "xt");
            return (Criteria) this;
        }

        public Criteria andXtNotEqualTo(String value) {
            addCriterion("xt <>", value, "xt");
            return (Criteria) this;
        }

        public Criteria andXtGreaterThan(String value) {
            addCriterion("xt >", value, "xt");
            return (Criteria) this;
        }

        public Criteria andXtGreaterThanOrEqualTo(String value) {
            addCriterion("xt >=", value, "xt");
            return (Criteria) this;
        }

        public Criteria andXtLessThan(String value) {
            addCriterion("xt <", value, "xt");
            return (Criteria) this;
        }

        public Criteria andXtLessThanOrEqualTo(String value) {
            addCriterion("xt <=", value, "xt");
            return (Criteria) this;
        }

        public Criteria andXtLike(String value) {
            addCriterion("xt like", value, "xt");
            return (Criteria) this;
        }

        public Criteria andXtNotLike(String value) {
            addCriterion("xt not like", value, "xt");
            return (Criteria) this;
        }

        public Criteria andXtIn(List<String> values) {
            addCriterion("xt in", values, "xt");
            return (Criteria) this;
        }

        public Criteria andXtNotIn(List<String> values) {
            addCriterion("xt not in", values, "xt");
            return (Criteria) this;
        }

        public Criteria andXtBetween(String value1, String value2) {
            addCriterion("xt between", value1, value2, "xt");
            return (Criteria) this;
        }

        public Criteria andXtNotBetween(String value1, String value2) {
            addCriterion("xt not between", value1, value2, "xt");
            return (Criteria) this;
        }

        public Criteria andXtYsyjIsNull() {
            addCriterion("xt_ysyj is null");
            return (Criteria) this;
        }

        public Criteria andXtYsyjIsNotNull() {
            addCriterion("xt_ysyj is not null");
            return (Criteria) this;
        }

        public Criteria andXtYsyjEqualTo(String value) {
            addCriterion("xt_ysyj =", value, "xtYsyj");
            return (Criteria) this;
        }

        public Criteria andXtYsyjNotEqualTo(String value) {
            addCriterion("xt_ysyj <>", value, "xtYsyj");
            return (Criteria) this;
        }

        public Criteria andXtYsyjGreaterThan(String value) {
            addCriterion("xt_ysyj >", value, "xtYsyj");
            return (Criteria) this;
        }

        public Criteria andXtYsyjGreaterThanOrEqualTo(String value) {
            addCriterion("xt_ysyj >=", value, "xtYsyj");
            return (Criteria) this;
        }

        public Criteria andXtYsyjLessThan(String value) {
            addCriterion("xt_ysyj <", value, "xtYsyj");
            return (Criteria) this;
        }

        public Criteria andXtYsyjLessThanOrEqualTo(String value) {
            addCriterion("xt_ysyj <=", value, "xtYsyj");
            return (Criteria) this;
        }

        public Criteria andXtYsyjLike(String value) {
            addCriterion("xt_ysyj like", value, "xtYsyj");
            return (Criteria) this;
        }

        public Criteria andXtYsyjNotLike(String value) {
            addCriterion("xt_ysyj not like", value, "xtYsyj");
            return (Criteria) this;
        }

        public Criteria andXtYsyjIn(List<String> values) {
            addCriterion("xt_ysyj in", values, "xtYsyj");
            return (Criteria) this;
        }

        public Criteria andXtYsyjNotIn(List<String> values) {
            addCriterion("xt_ysyj not in", values, "xtYsyj");
            return (Criteria) this;
        }

        public Criteria andXtYsyjBetween(String value1, String value2) {
            addCriterion("xt_ysyj between", value1, value2, "xtYsyj");
            return (Criteria) this;
        }

        public Criteria andXtYsyjNotBetween(String value1, String value2) {
            addCriterion("xt_ysyj not between", value1, value2, "xtYsyj");
            return (Criteria) this;
        }

        public Criteria andXtQtIsNull() {
            addCriterion("xt_qt is null");
            return (Criteria) this;
        }

        public Criteria andXtQtIsNotNull() {
            addCriterion("xt_qt is not null");
            return (Criteria) this;
        }

        public Criteria andXtQtEqualTo(String value) {
            addCriterion("xt_qt =", value, "xtQt");
            return (Criteria) this;
        }

        public Criteria andXtQtNotEqualTo(String value) {
            addCriterion("xt_qt <>", value, "xtQt");
            return (Criteria) this;
        }

        public Criteria andXtQtGreaterThan(String value) {
            addCriterion("xt_qt >", value, "xtQt");
            return (Criteria) this;
        }

        public Criteria andXtQtGreaterThanOrEqualTo(String value) {
            addCriterion("xt_qt >=", value, "xtQt");
            return (Criteria) this;
        }

        public Criteria andXtQtLessThan(String value) {
            addCriterion("xt_qt <", value, "xtQt");
            return (Criteria) this;
        }

        public Criteria andXtQtLessThanOrEqualTo(String value) {
            addCriterion("xt_qt <=", value, "xtQt");
            return (Criteria) this;
        }

        public Criteria andXtQtLike(String value) {
            addCriterion("xt_qt like", value, "xtQt");
            return (Criteria) this;
        }

        public Criteria andXtQtNotLike(String value) {
            addCriterion("xt_qt not like", value, "xtQt");
            return (Criteria) this;
        }

        public Criteria andXtQtIn(List<String> values) {
            addCriterion("xt_qt in", values, "xtQt");
            return (Criteria) this;
        }

        public Criteria andXtQtNotIn(List<String> values) {
            addCriterion("xt_qt not in", values, "xtQt");
            return (Criteria) this;
        }

        public Criteria andXtQtBetween(String value1, String value2) {
            addCriterion("xt_qt between", value1, value2, "xtQt");
            return (Criteria) this;
        }

        public Criteria andXtQtNotBetween(String value1, String value2) {
            addCriterion("xt_qt not between", value1, value2, "xtQt");
            return (Criteria) this;
        }

        public Criteria andGgZamIsNull() {
            addCriterion("gg_zam is null");
            return (Criteria) this;
        }

        public Criteria andGgZamIsNotNull() {
            addCriterion("gg_zam is not null");
            return (Criteria) this;
        }

        public Criteria andGgZamEqualTo(String value) {
            addCriterion("gg_zam =", value, "ggZam");
            return (Criteria) this;
        }

        public Criteria andGgZamNotEqualTo(String value) {
            addCriterion("gg_zam <>", value, "ggZam");
            return (Criteria) this;
        }

        public Criteria andGgZamGreaterThan(String value) {
            addCriterion("gg_zam >", value, "ggZam");
            return (Criteria) this;
        }

        public Criteria andGgZamGreaterThanOrEqualTo(String value) {
            addCriterion("gg_zam >=", value, "ggZam");
            return (Criteria) this;
        }

        public Criteria andGgZamLessThan(String value) {
            addCriterion("gg_zam <", value, "ggZam");
            return (Criteria) this;
        }

        public Criteria andGgZamLessThanOrEqualTo(String value) {
            addCriterion("gg_zam <=", value, "ggZam");
            return (Criteria) this;
        }

        public Criteria andGgZamLike(String value) {
            addCriterion("gg_zam like", value, "ggZam");
            return (Criteria) this;
        }

        public Criteria andGgZamNotLike(String value) {
            addCriterion("gg_zam not like", value, "ggZam");
            return (Criteria) this;
        }

        public Criteria andGgZamIn(List<String> values) {
            addCriterion("gg_zam in", values, "ggZam");
            return (Criteria) this;
        }

        public Criteria andGgZamNotIn(List<String> values) {
            addCriterion("gg_zam not in", values, "ggZam");
            return (Criteria) this;
        }

        public Criteria andGgZamBetween(String value1, String value2) {
            addCriterion("gg_zam between", value1, value2, "ggZam");
            return (Criteria) this;
        }

        public Criteria andGgZamNotBetween(String value1, String value2) {
            addCriterion("gg_zam not between", value1, value2, "ggZam");
            return (Criteria) this;
        }

        public Criteria andGgYgkyIsNull() {
            addCriterion("gg_ygky is null");
            return (Criteria) this;
        }

        public Criteria andGgYgkyIsNotNull() {
            addCriterion("gg_ygky is not null");
            return (Criteria) this;
        }

        public Criteria andGgYgkyEqualTo(String value) {
            addCriterion("gg_ygky =", value, "ggYgky");
            return (Criteria) this;
        }

        public Criteria andGgYgkyNotEqualTo(String value) {
            addCriterion("gg_ygky <>", value, "ggYgky");
            return (Criteria) this;
        }

        public Criteria andGgYgkyGreaterThan(String value) {
            addCriterion("gg_ygky >", value, "ggYgky");
            return (Criteria) this;
        }

        public Criteria andGgYgkyGreaterThanOrEqualTo(String value) {
            addCriterion("gg_ygky >=", value, "ggYgky");
            return (Criteria) this;
        }

        public Criteria andGgYgkyLessThan(String value) {
            addCriterion("gg_ygky <", value, "ggYgky");
            return (Criteria) this;
        }

        public Criteria andGgYgkyLessThanOrEqualTo(String value) {
            addCriterion("gg_ygky <=", value, "ggYgky");
            return (Criteria) this;
        }

        public Criteria andGgYgkyLike(String value) {
            addCriterion("gg_ygky like", value, "ggYgky");
            return (Criteria) this;
        }

        public Criteria andGgYgkyNotLike(String value) {
            addCriterion("gg_ygky not like", value, "ggYgky");
            return (Criteria) this;
        }

        public Criteria andGgYgkyIn(List<String> values) {
            addCriterion("gg_ygky in", values, "ggYgky");
            return (Criteria) this;
        }

        public Criteria andGgYgkyNotIn(List<String> values) {
            addCriterion("gg_ygky not in", values, "ggYgky");
            return (Criteria) this;
        }

        public Criteria andGgYgkyBetween(String value1, String value2) {
            addCriterion("gg_ygky between", value1, value2, "ggYgky");
            return (Criteria) this;
        }

        public Criteria andGgYgkyNotBetween(String value1, String value2) {
            addCriterion("gg_ygky not between", value1, value2, "ggYgky");
            return (Criteria) this;
        }

        public Criteria andGgYsyjIsNull() {
            addCriterion("gg_ysyj is null");
            return (Criteria) this;
        }

        public Criteria andGgYsyjIsNotNull() {
            addCriterion("gg_ysyj is not null");
            return (Criteria) this;
        }

        public Criteria andGgYsyjEqualTo(String value) {
            addCriterion("gg_ysyj =", value, "ggYsyj");
            return (Criteria) this;
        }

        public Criteria andGgYsyjNotEqualTo(String value) {
            addCriterion("gg_ysyj <>", value, "ggYsyj");
            return (Criteria) this;
        }

        public Criteria andGgYsyjGreaterThan(String value) {
            addCriterion("gg_ysyj >", value, "ggYsyj");
            return (Criteria) this;
        }

        public Criteria andGgYsyjGreaterThanOrEqualTo(String value) {
            addCriterion("gg_ysyj >=", value, "ggYsyj");
            return (Criteria) this;
        }

        public Criteria andGgYsyjLessThan(String value) {
            addCriterion("gg_ysyj <", value, "ggYsyj");
            return (Criteria) this;
        }

        public Criteria andGgYsyjLessThanOrEqualTo(String value) {
            addCriterion("gg_ysyj <=", value, "ggYsyj");
            return (Criteria) this;
        }

        public Criteria andGgYsyjLike(String value) {
            addCriterion("gg_ysyj like", value, "ggYsyj");
            return (Criteria) this;
        }

        public Criteria andGgYsyjNotLike(String value) {
            addCriterion("gg_ysyj not like", value, "ggYsyj");
            return (Criteria) this;
        }

        public Criteria andGgYsyjIn(List<String> values) {
            addCriterion("gg_ysyj in", values, "ggYsyj");
            return (Criteria) this;
        }

        public Criteria andGgYsyjNotIn(List<String> values) {
            addCriterion("gg_ysyj not in", values, "ggYsyj");
            return (Criteria) this;
        }

        public Criteria andGgYsyjBetween(String value1, String value2) {
            addCriterion("gg_ysyj between", value1, value2, "ggYsyj");
            return (Criteria) this;
        }

        public Criteria andGgYsyjNotBetween(String value1, String value2) {
            addCriterion("gg_ysyj not between", value1, value2, "ggYsyj");
            return (Criteria) this;
        }

        public Criteria andGgQtIsNull() {
            addCriterion("gg_qt is null");
            return (Criteria) this;
        }

        public Criteria andGgQtIsNotNull() {
            addCriterion("gg_qt is not null");
            return (Criteria) this;
        }

        public Criteria andGgQtEqualTo(String value) {
            addCriterion("gg_qt =", value, "ggQt");
            return (Criteria) this;
        }

        public Criteria andGgQtNotEqualTo(String value) {
            addCriterion("gg_qt <>", value, "ggQt");
            return (Criteria) this;
        }

        public Criteria andGgQtGreaterThan(String value) {
            addCriterion("gg_qt >", value, "ggQt");
            return (Criteria) this;
        }

        public Criteria andGgQtGreaterThanOrEqualTo(String value) {
            addCriterion("gg_qt >=", value, "ggQt");
            return (Criteria) this;
        }

        public Criteria andGgQtLessThan(String value) {
            addCriterion("gg_qt <", value, "ggQt");
            return (Criteria) this;
        }

        public Criteria andGgQtLessThanOrEqualTo(String value) {
            addCriterion("gg_qt <=", value, "ggQt");
            return (Criteria) this;
        }

        public Criteria andGgQtLike(String value) {
            addCriterion("gg_qt like", value, "ggQt");
            return (Criteria) this;
        }

        public Criteria andGgQtNotLike(String value) {
            addCriterion("gg_qt not like", value, "ggQt");
            return (Criteria) this;
        }

        public Criteria andGgQtIn(List<String> values) {
            addCriterion("gg_qt in", values, "ggQt");
            return (Criteria) this;
        }

        public Criteria andGgQtNotIn(List<String> values) {
            addCriterion("gg_qt not in", values, "ggQt");
            return (Criteria) this;
        }

        public Criteria andGgQtBetween(String value1, String value2) {
            addCriterion("gg_qt between", value1, value2, "ggQt");
            return (Criteria) this;
        }

        public Criteria andGgQtNotBetween(String value1, String value2) {
            addCriterion("gg_qt not between", value1, value2, "ggQt");
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