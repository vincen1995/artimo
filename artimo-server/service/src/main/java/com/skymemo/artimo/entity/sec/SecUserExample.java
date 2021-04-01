package com.skymemo.artimo.entity.sec;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SecUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SecUserExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andUtcAvailableIsNull() {
            addCriterion("utc_available is null");
            return (Criteria) this;
        }

        public Criteria andUtcAvailableIsNotNull() {
            addCriterion("utc_available is not null");
            return (Criteria) this;
        }

        public Criteria andUtcAvailableEqualTo(LocalDateTime value) {
            addCriterion("utc_available =", value, "utcAvailable");
            return (Criteria) this;
        }

        public Criteria andUtcAvailableNotEqualTo(LocalDateTime value) {
            addCriterion("utc_available <>", value, "utcAvailable");
            return (Criteria) this;
        }

        public Criteria andUtcAvailableGreaterThan(LocalDateTime value) {
            addCriterion("utc_available >", value, "utcAvailable");
            return (Criteria) this;
        }

        public Criteria andUtcAvailableGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("utc_available >=", value, "utcAvailable");
            return (Criteria) this;
        }

        public Criteria andUtcAvailableLessThan(LocalDateTime value) {
            addCriterion("utc_available <", value, "utcAvailable");
            return (Criteria) this;
        }

        public Criteria andUtcAvailableLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("utc_available <=", value, "utcAvailable");
            return (Criteria) this;
        }

        public Criteria andUtcAvailableIn(List<LocalDateTime> values) {
            addCriterion("utc_available in", values, "utcAvailable");
            return (Criteria) this;
        }

        public Criteria andUtcAvailableNotIn(List<LocalDateTime> values) {
            addCriterion("utc_available not in", values, "utcAvailable");
            return (Criteria) this;
        }

        public Criteria andUtcAvailableBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("utc_available between", value1, value2, "utcAvailable");
            return (Criteria) this;
        }

        public Criteria andUtcAvailableNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("utc_available not between", value1, value2, "utcAvailable");
            return (Criteria) this;
        }

        public Criteria andSysRemarkIsNull() {
            addCriterion("sys_remark is null");
            return (Criteria) this;
        }

        public Criteria andSysRemarkIsNotNull() {
            addCriterion("sys_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSysRemarkEqualTo(String value) {
            addCriterion("sys_remark =", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkNotEqualTo(String value) {
            addCriterion("sys_remark <>", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkGreaterThan(String value) {
            addCriterion("sys_remark >", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sys_remark >=", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkLessThan(String value) {
            addCriterion("sys_remark <", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkLessThanOrEqualTo(String value) {
            addCriterion("sys_remark <=", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkLike(String value) {
            addCriterion("sys_remark like", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkNotLike(String value) {
            addCriterion("sys_remark not like", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkIn(List<String> values) {
            addCriterion("sys_remark in", values, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkNotIn(List<String> values) {
            addCriterion("sys_remark not in", values, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkBetween(String value1, String value2) {
            addCriterion("sys_remark between", value1, value2, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkNotBetween(String value1, String value2) {
            addCriterion("sys_remark not between", value1, value2, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andUtcCreateIsNull() {
            addCriterion("utc_create is null");
            return (Criteria) this;
        }

        public Criteria andUtcCreateIsNotNull() {
            addCriterion("utc_create is not null");
            return (Criteria) this;
        }

        public Criteria andUtcCreateEqualTo(LocalDateTime value) {
            addCriterion("utc_create =", value, "utcCreate");
            return (Criteria) this;
        }

        public Criteria andUtcCreateNotEqualTo(LocalDateTime value) {
            addCriterion("utc_create <>", value, "utcCreate");
            return (Criteria) this;
        }

        public Criteria andUtcCreateGreaterThan(LocalDateTime value) {
            addCriterion("utc_create >", value, "utcCreate");
            return (Criteria) this;
        }

        public Criteria andUtcCreateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("utc_create >=", value, "utcCreate");
            return (Criteria) this;
        }

        public Criteria andUtcCreateLessThan(LocalDateTime value) {
            addCriterion("utc_create <", value, "utcCreate");
            return (Criteria) this;
        }

        public Criteria andUtcCreateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("utc_create <=", value, "utcCreate");
            return (Criteria) this;
        }

        public Criteria andUtcCreateIn(List<LocalDateTime> values) {
            addCriterion("utc_create in", values, "utcCreate");
            return (Criteria) this;
        }

        public Criteria andUtcCreateNotIn(List<LocalDateTime> values) {
            addCriterion("utc_create not in", values, "utcCreate");
            return (Criteria) this;
        }

        public Criteria andUtcCreateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("utc_create between", value1, value2, "utcCreate");
            return (Criteria) this;
        }

        public Criteria andUtcCreateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("utc_create not between", value1, value2, "utcCreate");
            return (Criteria) this;
        }

        public Criteria andUtcUpdateIsNull() {
            addCriterion("utc_update is null");
            return (Criteria) this;
        }

        public Criteria andUtcUpdateIsNotNull() {
            addCriterion("utc_update is not null");
            return (Criteria) this;
        }

        public Criteria andUtcUpdateEqualTo(LocalDateTime value) {
            addCriterion("utc_update =", value, "utcUpdate");
            return (Criteria) this;
        }

        public Criteria andUtcUpdateNotEqualTo(LocalDateTime value) {
            addCriterion("utc_update <>", value, "utcUpdate");
            return (Criteria) this;
        }

        public Criteria andUtcUpdateGreaterThan(LocalDateTime value) {
            addCriterion("utc_update >", value, "utcUpdate");
            return (Criteria) this;
        }

        public Criteria andUtcUpdateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("utc_update >=", value, "utcUpdate");
            return (Criteria) this;
        }

        public Criteria andUtcUpdateLessThan(LocalDateTime value) {
            addCriterion("utc_update <", value, "utcUpdate");
            return (Criteria) this;
        }

        public Criteria andUtcUpdateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("utc_update <=", value, "utcUpdate");
            return (Criteria) this;
        }

        public Criteria andUtcUpdateIn(List<LocalDateTime> values) {
            addCriterion("utc_update in", values, "utcUpdate");
            return (Criteria) this;
        }

        public Criteria andUtcUpdateNotIn(List<LocalDateTime> values) {
            addCriterion("utc_update not in", values, "utcUpdate");
            return (Criteria) this;
        }

        public Criteria andUtcUpdateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("utc_update between", value1, value2, "utcUpdate");
            return (Criteria) this;
        }

        public Criteria andUtcUpdateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("utc_update not between", value1, value2, "utcUpdate");
            return (Criteria) this;
        }

        public Criteria andEx1IsNull() {
            addCriterion("ex_1 is null");
            return (Criteria) this;
        }

        public Criteria andEx1IsNotNull() {
            addCriterion("ex_1 is not null");
            return (Criteria) this;
        }

        public Criteria andEx1EqualTo(String value) {
            addCriterion("ex_1 =", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1NotEqualTo(String value) {
            addCriterion("ex_1 <>", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1GreaterThan(String value) {
            addCriterion("ex_1 >", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1GreaterThanOrEqualTo(String value) {
            addCriterion("ex_1 >=", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1LessThan(String value) {
            addCriterion("ex_1 <", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1LessThanOrEqualTo(String value) {
            addCriterion("ex_1 <=", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1Like(String value) {
            addCriterion("ex_1 like", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1NotLike(String value) {
            addCriterion("ex_1 not like", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1In(List<String> values) {
            addCriterion("ex_1 in", values, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1NotIn(List<String> values) {
            addCriterion("ex_1 not in", values, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1Between(String value1, String value2) {
            addCriterion("ex_1 between", value1, value2, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1NotBetween(String value1, String value2) {
            addCriterion("ex_1 not between", value1, value2, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx2IsNull() {
            addCriterion("ex_2 is null");
            return (Criteria) this;
        }

        public Criteria andEx2IsNotNull() {
            addCriterion("ex_2 is not null");
            return (Criteria) this;
        }

        public Criteria andEx2EqualTo(String value) {
            addCriterion("ex_2 =", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2NotEqualTo(String value) {
            addCriterion("ex_2 <>", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2GreaterThan(String value) {
            addCriterion("ex_2 >", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2GreaterThanOrEqualTo(String value) {
            addCriterion("ex_2 >=", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2LessThan(String value) {
            addCriterion("ex_2 <", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2LessThanOrEqualTo(String value) {
            addCriterion("ex_2 <=", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2Like(String value) {
            addCriterion("ex_2 like", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2NotLike(String value) {
            addCriterion("ex_2 not like", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2In(List<String> values) {
            addCriterion("ex_2 in", values, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2NotIn(List<String> values) {
            addCriterion("ex_2 not in", values, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2Between(String value1, String value2) {
            addCriterion("ex_2 between", value1, value2, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2NotBetween(String value1, String value2) {
            addCriterion("ex_2 not between", value1, value2, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx3IsNull() {
            addCriterion("ex_3 is null");
            return (Criteria) this;
        }

        public Criteria andEx3IsNotNull() {
            addCriterion("ex_3 is not null");
            return (Criteria) this;
        }

        public Criteria andEx3EqualTo(String value) {
            addCriterion("ex_3 =", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3NotEqualTo(String value) {
            addCriterion("ex_3 <>", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3GreaterThan(String value) {
            addCriterion("ex_3 >", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3GreaterThanOrEqualTo(String value) {
            addCriterion("ex_3 >=", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3LessThan(String value) {
            addCriterion("ex_3 <", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3LessThanOrEqualTo(String value) {
            addCriterion("ex_3 <=", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3Like(String value) {
            addCriterion("ex_3 like", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3NotLike(String value) {
            addCriterion("ex_3 not like", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3In(List<String> values) {
            addCriterion("ex_3 in", values, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3NotIn(List<String> values) {
            addCriterion("ex_3 not in", values, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3Between(String value1, String value2) {
            addCriterion("ex_3 between", value1, value2, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3NotBetween(String value1, String value2) {
            addCriterion("ex_3 not between", value1, value2, "ex3");
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