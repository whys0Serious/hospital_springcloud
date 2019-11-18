package com.qf.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepartmenMsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmenMsgExample() {
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

        public Criteria andPkDepidIsNull() {
            addCriterion("pk_depid is null");
            return (Criteria) this;
        }

        public Criteria andPkDepidIsNotNull() {
            addCriterion("pk_depid is not null");
            return (Criteria) this;
        }

        public Criteria andPkDepidEqualTo(Long value) {
            addCriterion("pk_depid =", value, "pkDepid");
            return (Criteria) this;
        }

        public Criteria andPkDepidNotEqualTo(Long value) {
            addCriterion("pk_depid <>", value, "pkDepid");
            return (Criteria) this;
        }

        public Criteria andPkDepidGreaterThan(Long value) {
            addCriterion("pk_depid >", value, "pkDepid");
            return (Criteria) this;
        }

        public Criteria andPkDepidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_depid >=", value, "pkDepid");
            return (Criteria) this;
        }

        public Criteria andPkDepidLessThan(Long value) {
            addCriterion("pk_depid <", value, "pkDepid");
            return (Criteria) this;
        }

        public Criteria andPkDepidLessThanOrEqualTo(Long value) {
            addCriterion("pk_depid <=", value, "pkDepid");
            return (Criteria) this;
        }

        public Criteria andPkDepidIn(List<Long> values) {
            addCriterion("pk_depid in", values, "pkDepid");
            return (Criteria) this;
        }

        public Criteria andPkDepidNotIn(List<Long> values) {
            addCriterion("pk_depid not in", values, "pkDepid");
            return (Criteria) this;
        }

        public Criteria andPkDepidBetween(Long value1, Long value2) {
            addCriterion("pk_depid between", value1, value2, "pkDepid");
            return (Criteria) this;
        }

        public Criteria andPkDepidNotBetween(Long value1, Long value2) {
            addCriterion("pk_depid not between", value1, value2, "pkDepid");
            return (Criteria) this;
        }

        public Criteria andDepNameIsNull() {
            addCriterion("dep_name is null");
            return (Criteria) this;
        }

        public Criteria andDepNameIsNotNull() {
            addCriterion("dep_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepNameEqualTo(String value) {
            addCriterion("dep_name =", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotEqualTo(String value) {
            addCriterion("dep_name <>", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameGreaterThan(String value) {
            addCriterion("dep_name >", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameGreaterThanOrEqualTo(String value) {
            addCriterion("dep_name >=", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLessThan(String value) {
            addCriterion("dep_name <", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLessThanOrEqualTo(String value) {
            addCriterion("dep_name <=", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLike(String value) {
            addCriterion("dep_name like", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotLike(String value) {
            addCriterion("dep_name not like", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameIn(List<String> values) {
            addCriterion("dep_name in", values, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotIn(List<String> values) {
            addCriterion("dep_name not in", values, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameBetween(String value1, String value2) {
            addCriterion("dep_name between", value1, value2, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotBetween(String value1, String value2) {
            addCriterion("dep_name not between", value1, value2, "depName");
            return (Criteria) this;
        }

        public Criteria andChargeIsNull() {
            addCriterion("charge is null");
            return (Criteria) this;
        }

        public Criteria andChargeIsNotNull() {
            addCriterion("charge is not null");
            return (Criteria) this;
        }

        public Criteria andChargeEqualTo(Long value) {
            addCriterion("charge =", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotEqualTo(Long value) {
            addCriterion("charge <>", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThan(Long value) {
            addCriterion("charge >", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThanOrEqualTo(Long value) {
            addCriterion("charge >=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThan(Long value) {
            addCriterion("charge <", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThanOrEqualTo(Long value) {
            addCriterion("charge <=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeIn(List<Long> values) {
            addCriterion("charge in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotIn(List<Long> values) {
            addCriterion("charge not in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeBetween(Long value1, Long value2) {
            addCriterion("charge between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotBetween(Long value1, Long value2) {
            addCriterion("charge not between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andVisitNumIsNull() {
            addCriterion("visit_num is null");
            return (Criteria) this;
        }

        public Criteria andVisitNumIsNotNull() {
            addCriterion("visit_num is not null");
            return (Criteria) this;
        }

        public Criteria andVisitNumEqualTo(Integer value) {
            addCriterion("visit_num =", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotEqualTo(Integer value) {
            addCriterion("visit_num <>", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumGreaterThan(Integer value) {
            addCriterion("visit_num >", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("visit_num >=", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumLessThan(Integer value) {
            addCriterion("visit_num <", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumLessThanOrEqualTo(Integer value) {
            addCriterion("visit_num <=", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumIn(List<Integer> values) {
            addCriterion("visit_num in", values, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotIn(List<Integer> values) {
            addCriterion("visit_num not in", values, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumBetween(Integer value1, Integer value2) {
            addCriterion("visit_num between", value1, value2, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("visit_num not between", value1, value2, "visitNum");
            return (Criteria) this;
        }

        public Criteria andDepartmentPicIsNull() {
            addCriterion("department_pic is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentPicIsNotNull() {
            addCriterion("department_pic is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentPicEqualTo(String value) {
            addCriterion("department_pic =", value, "departmentPic");
            return (Criteria) this;
        }

        public Criteria andDepartmentPicNotEqualTo(String value) {
            addCriterion("department_pic <>", value, "departmentPic");
            return (Criteria) this;
        }

        public Criteria andDepartmentPicGreaterThan(String value) {
            addCriterion("department_pic >", value, "departmentPic");
            return (Criteria) this;
        }

        public Criteria andDepartmentPicGreaterThanOrEqualTo(String value) {
            addCriterion("department_pic >=", value, "departmentPic");
            return (Criteria) this;
        }

        public Criteria andDepartmentPicLessThan(String value) {
            addCriterion("department_pic <", value, "departmentPic");
            return (Criteria) this;
        }

        public Criteria andDepartmentPicLessThanOrEqualTo(String value) {
            addCriterion("department_pic <=", value, "departmentPic");
            return (Criteria) this;
        }

        public Criteria andDepartmentPicLike(String value) {
            addCriterion("department_pic like", value, "departmentPic");
            return (Criteria) this;
        }

        public Criteria andDepartmentPicNotLike(String value) {
            addCriterion("department_pic not like", value, "departmentPic");
            return (Criteria) this;
        }

        public Criteria andDepartmentPicIn(List<String> values) {
            addCriterion("department_pic in", values, "departmentPic");
            return (Criteria) this;
        }

        public Criteria andDepartmentPicNotIn(List<String> values) {
            addCriterion("department_pic not in", values, "departmentPic");
            return (Criteria) this;
        }

        public Criteria andDepartmentPicBetween(String value1, String value2) {
            addCriterion("department_pic between", value1, value2, "departmentPic");
            return (Criteria) this;
        }

        public Criteria andDepartmentPicNotBetween(String value1, String value2) {
            addCriterion("department_pic not between", value1, value2, "departmentPic");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeIsNull() {
            addCriterion("department_type is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeIsNotNull() {
            addCriterion("department_type is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeEqualTo(String value) {
            addCriterion("department_type =", value, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeNotEqualTo(String value) {
            addCriterion("department_type <>", value, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeGreaterThan(String value) {
            addCriterion("department_type >", value, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("department_type >=", value, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeLessThan(String value) {
            addCriterion("department_type <", value, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeLessThanOrEqualTo(String value) {
            addCriterion("department_type <=", value, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeLike(String value) {
            addCriterion("department_type like", value, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeNotLike(String value) {
            addCriterion("department_type not like", value, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeIn(List<String> values) {
            addCriterion("department_type in", values, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeNotIn(List<String> values) {
            addCriterion("department_type not in", values, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeBetween(String value1, String value2) {
            addCriterion("department_type between", value1, value2, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeNotBetween(String value1, String value2) {
            addCriterion("department_type not between", value1, value2, "departmentType");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
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