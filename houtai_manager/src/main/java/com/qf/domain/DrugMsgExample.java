package com.qf.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DrugMsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugMsgExample() {
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

        public Criteria andPkDrugidIsNull() {
            addCriterion("pk_drugid is null");
            return (Criteria) this;
        }

        public Criteria andPkDrugidIsNotNull() {
            addCriterion("pk_drugid is not null");
            return (Criteria) this;
        }

        public Criteria andPkDrugidEqualTo(Long value) {
            addCriterion("pk_drugid =", value, "pkDrugid");
            return (Criteria) this;
        }

        public Criteria andPkDrugidNotEqualTo(Long value) {
            addCriterion("pk_drugid <>", value, "pkDrugid");
            return (Criteria) this;
        }

        public Criteria andPkDrugidGreaterThan(Long value) {
            addCriterion("pk_drugid >", value, "pkDrugid");
            return (Criteria) this;
        }

        public Criteria andPkDrugidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_drugid >=", value, "pkDrugid");
            return (Criteria) this;
        }

        public Criteria andPkDrugidLessThan(Long value) {
            addCriterion("pk_drugid <", value, "pkDrugid");
            return (Criteria) this;
        }

        public Criteria andPkDrugidLessThanOrEqualTo(Long value) {
            addCriterion("pk_drugid <=", value, "pkDrugid");
            return (Criteria) this;
        }

        public Criteria andPkDrugidIn(List<Long> values) {
            addCriterion("pk_drugid in", values, "pkDrugid");
            return (Criteria) this;
        }

        public Criteria andPkDrugidNotIn(List<Long> values) {
            addCriterion("pk_drugid not in", values, "pkDrugid");
            return (Criteria) this;
        }

        public Criteria andPkDrugidBetween(Long value1, Long value2) {
            addCriterion("pk_drugid between", value1, value2, "pkDrugid");
            return (Criteria) this;
        }

        public Criteria andPkDrugidNotBetween(Long value1, Long value2) {
            addCriterion("pk_drugid not between", value1, value2, "pkDrugid");
            return (Criteria) this;
        }

        public Criteria andUkPageIsNull() {
            addCriterion("uk_page is null");
            return (Criteria) this;
        }

        public Criteria andUkPageIsNotNull() {
            addCriterion("uk_page is not null");
            return (Criteria) this;
        }

        public Criteria andUkPageEqualTo(Long value) {
            addCriterion("uk_page =", value, "ukPage");
            return (Criteria) this;
        }

        public Criteria andUkPageNotEqualTo(Long value) {
            addCriterion("uk_page <>", value, "ukPage");
            return (Criteria) this;
        }

        public Criteria andUkPageGreaterThan(Long value) {
            addCriterion("uk_page >", value, "ukPage");
            return (Criteria) this;
        }

        public Criteria andUkPageGreaterThanOrEqualTo(Long value) {
            addCriterion("uk_page >=", value, "ukPage");
            return (Criteria) this;
        }

        public Criteria andUkPageLessThan(Long value) {
            addCriterion("uk_page <", value, "ukPage");
            return (Criteria) this;
        }

        public Criteria andUkPageLessThanOrEqualTo(Long value) {
            addCriterion("uk_page <=", value, "ukPage");
            return (Criteria) this;
        }

        public Criteria andUkPageIn(List<Long> values) {
            addCriterion("uk_page in", values, "ukPage");
            return (Criteria) this;
        }

        public Criteria andUkPageNotIn(List<Long> values) {
            addCriterion("uk_page not in", values, "ukPage");
            return (Criteria) this;
        }

        public Criteria andUkPageBetween(Long value1, Long value2) {
            addCriterion("uk_page between", value1, value2, "ukPage");
            return (Criteria) this;
        }

        public Criteria andUkPageNotBetween(Long value1, Long value2) {
            addCriterion("uk_page not between", value1, value2, "ukPage");
            return (Criteria) this;
        }

        public Criteria andDrugNameIsNull() {
            addCriterion("drug_name is null");
            return (Criteria) this;
        }

        public Criteria andDrugNameIsNotNull() {
            addCriterion("drug_name is not null");
            return (Criteria) this;
        }

        public Criteria andDrugNameEqualTo(String value) {
            addCriterion("drug_name =", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotEqualTo(String value) {
            addCriterion("drug_name <>", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameGreaterThan(String value) {
            addCriterion("drug_name >", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameGreaterThanOrEqualTo(String value) {
            addCriterion("drug_name >=", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLessThan(String value) {
            addCriterion("drug_name <", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLessThanOrEqualTo(String value) {
            addCriterion("drug_name <=", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLike(String value) {
            addCriterion("drug_name like", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotLike(String value) {
            addCriterion("drug_name not like", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameIn(List<String> values) {
            addCriterion("drug_name in", values, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotIn(List<String> values) {
            addCriterion("drug_name not in", values, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameBetween(String value1, String value2) {
            addCriterion("drug_name between", value1, value2, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotBetween(String value1, String value2) {
            addCriterion("drug_name not between", value1, value2, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugSyzIsNull() {
            addCriterion("drug_syz is null");
            return (Criteria) this;
        }

        public Criteria andDrugSyzIsNotNull() {
            addCriterion("drug_syz is not null");
            return (Criteria) this;
        }

        public Criteria andDrugSyzEqualTo(String value) {
            addCriterion("drug_syz =", value, "drugSyz");
            return (Criteria) this;
        }

        public Criteria andDrugSyzNotEqualTo(String value) {
            addCriterion("drug_syz <>", value, "drugSyz");
            return (Criteria) this;
        }

        public Criteria andDrugSyzGreaterThan(String value) {
            addCriterion("drug_syz >", value, "drugSyz");
            return (Criteria) this;
        }

        public Criteria andDrugSyzGreaterThanOrEqualTo(String value) {
            addCriterion("drug_syz >=", value, "drugSyz");
            return (Criteria) this;
        }

        public Criteria andDrugSyzLessThan(String value) {
            addCriterion("drug_syz <", value, "drugSyz");
            return (Criteria) this;
        }

        public Criteria andDrugSyzLessThanOrEqualTo(String value) {
            addCriterion("drug_syz <=", value, "drugSyz");
            return (Criteria) this;
        }

        public Criteria andDrugSyzLike(String value) {
            addCriterion("drug_syz like", value, "drugSyz");
            return (Criteria) this;
        }

        public Criteria andDrugSyzNotLike(String value) {
            addCriterion("drug_syz not like", value, "drugSyz");
            return (Criteria) this;
        }

        public Criteria andDrugSyzIn(List<String> values) {
            addCriterion("drug_syz in", values, "drugSyz");
            return (Criteria) this;
        }

        public Criteria andDrugSyzNotIn(List<String> values) {
            addCriterion("drug_syz not in", values, "drugSyz");
            return (Criteria) this;
        }

        public Criteria andDrugSyzBetween(String value1, String value2) {
            addCriterion("drug_syz between", value1, value2, "drugSyz");
            return (Criteria) this;
        }

        public Criteria andDrugSyzNotBetween(String value1, String value2) {
            addCriterion("drug_syz not between", value1, value2, "drugSyz");
            return (Criteria) this;
        }

        public Criteria andDrugManuIsNull() {
            addCriterion("drug_manu is null");
            return (Criteria) this;
        }

        public Criteria andDrugManuIsNotNull() {
            addCriterion("drug_manu is not null");
            return (Criteria) this;
        }

        public Criteria andDrugManuEqualTo(String value) {
            addCriterion("drug_manu =", value, "drugManu");
            return (Criteria) this;
        }

        public Criteria andDrugManuNotEqualTo(String value) {
            addCriterion("drug_manu <>", value, "drugManu");
            return (Criteria) this;
        }

        public Criteria andDrugManuGreaterThan(String value) {
            addCriterion("drug_manu >", value, "drugManu");
            return (Criteria) this;
        }

        public Criteria andDrugManuGreaterThanOrEqualTo(String value) {
            addCriterion("drug_manu >=", value, "drugManu");
            return (Criteria) this;
        }

        public Criteria andDrugManuLessThan(String value) {
            addCriterion("drug_manu <", value, "drugManu");
            return (Criteria) this;
        }

        public Criteria andDrugManuLessThanOrEqualTo(String value) {
            addCriterion("drug_manu <=", value, "drugManu");
            return (Criteria) this;
        }

        public Criteria andDrugManuLike(String value) {
            addCriterion("drug_manu like", value, "drugManu");
            return (Criteria) this;
        }

        public Criteria andDrugManuNotLike(String value) {
            addCriterion("drug_manu not like", value, "drugManu");
            return (Criteria) this;
        }

        public Criteria andDrugManuIn(List<String> values) {
            addCriterion("drug_manu in", values, "drugManu");
            return (Criteria) this;
        }

        public Criteria andDrugManuNotIn(List<String> values) {
            addCriterion("drug_manu not in", values, "drugManu");
            return (Criteria) this;
        }

        public Criteria andDrugManuBetween(String value1, String value2) {
            addCriterion("drug_manu between", value1, value2, "drugManu");
            return (Criteria) this;
        }

        public Criteria andDrugManuNotBetween(String value1, String value2) {
            addCriterion("drug_manu not between", value1, value2, "drugManu");
            return (Criteria) this;
        }

        public Criteria andDrugPriceIsNull() {
            addCriterion("drug_price is null");
            return (Criteria) this;
        }

        public Criteria andDrugPriceIsNotNull() {
            addCriterion("drug_price is not null");
            return (Criteria) this;
        }

        public Criteria andDrugPriceEqualTo(Long value) {
            addCriterion("drug_price =", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceNotEqualTo(Long value) {
            addCriterion("drug_price <>", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceGreaterThan(Long value) {
            addCriterion("drug_price >", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("drug_price >=", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceLessThan(Long value) {
            addCriterion("drug_price <", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceLessThanOrEqualTo(Long value) {
            addCriterion("drug_price <=", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceIn(List<Long> values) {
            addCriterion("drug_price in", values, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceNotIn(List<Long> values) {
            addCriterion("drug_price not in", values, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceBetween(Long value1, Long value2) {
            addCriterion("drug_price between", value1, value2, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceNotBetween(Long value1, Long value2) {
            addCriterion("drug_price not between", value1, value2, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugTypeIsNull() {
            addCriterion("drug_type is null");
            return (Criteria) this;
        }

        public Criteria andDrugTypeIsNotNull() {
            addCriterion("drug_type is not null");
            return (Criteria) this;
        }

        public Criteria andDrugTypeEqualTo(String value) {
            addCriterion("drug_type =", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeNotEqualTo(String value) {
            addCriterion("drug_type <>", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeGreaterThan(String value) {
            addCriterion("drug_type >", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeGreaterThanOrEqualTo(String value) {
            addCriterion("drug_type >=", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeLessThan(String value) {
            addCriterion("drug_type <", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeLessThanOrEqualTo(String value) {
            addCriterion("drug_type <=", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeLike(String value) {
            addCriterion("drug_type like", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeNotLike(String value) {
            addCriterion("drug_type not like", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeIn(List<String> values) {
            addCriterion("drug_type in", values, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeNotIn(List<String> values) {
            addCriterion("drug_type not in", values, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeBetween(String value1, String value2) {
            addCriterion("drug_type between", value1, value2, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeNotBetween(String value1, String value2) {
            addCriterion("drug_type not between", value1, value2, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugGgxhIsNull() {
            addCriterion("drug_ggxh is null");
            return (Criteria) this;
        }

        public Criteria andDrugGgxhIsNotNull() {
            addCriterion("drug_ggxh is not null");
            return (Criteria) this;
        }

        public Criteria andDrugGgxhEqualTo(String value) {
            addCriterion("drug_ggxh =", value, "drugGgxh");
            return (Criteria) this;
        }

        public Criteria andDrugGgxhNotEqualTo(String value) {
            addCriterion("drug_ggxh <>", value, "drugGgxh");
            return (Criteria) this;
        }

        public Criteria andDrugGgxhGreaterThan(String value) {
            addCriterion("drug_ggxh >", value, "drugGgxh");
            return (Criteria) this;
        }

        public Criteria andDrugGgxhGreaterThanOrEqualTo(String value) {
            addCriterion("drug_ggxh >=", value, "drugGgxh");
            return (Criteria) this;
        }

        public Criteria andDrugGgxhLessThan(String value) {
            addCriterion("drug_ggxh <", value, "drugGgxh");
            return (Criteria) this;
        }

        public Criteria andDrugGgxhLessThanOrEqualTo(String value) {
            addCriterion("drug_ggxh <=", value, "drugGgxh");
            return (Criteria) this;
        }

        public Criteria andDrugGgxhLike(String value) {
            addCriterion("drug_ggxh like", value, "drugGgxh");
            return (Criteria) this;
        }

        public Criteria andDrugGgxhNotLike(String value) {
            addCriterion("drug_ggxh not like", value, "drugGgxh");
            return (Criteria) this;
        }

        public Criteria andDrugGgxhIn(List<String> values) {
            addCriterion("drug_ggxh in", values, "drugGgxh");
            return (Criteria) this;
        }

        public Criteria andDrugGgxhNotIn(List<String> values) {
            addCriterion("drug_ggxh not in", values, "drugGgxh");
            return (Criteria) this;
        }

        public Criteria andDrugGgxhBetween(String value1, String value2) {
            addCriterion("drug_ggxh between", value1, value2, "drugGgxh");
            return (Criteria) this;
        }

        public Criteria andDrugGgxhNotBetween(String value1, String value2) {
            addCriterion("drug_ggxh not between", value1, value2, "drugGgxh");
            return (Criteria) this;
        }

        public Criteria andDrugYfylIsNull() {
            addCriterion("drug_yfyl is null");
            return (Criteria) this;
        }

        public Criteria andDrugYfylIsNotNull() {
            addCriterion("drug_yfyl is not null");
            return (Criteria) this;
        }

        public Criteria andDrugYfylEqualTo(String value) {
            addCriterion("drug_yfyl =", value, "drugYfyl");
            return (Criteria) this;
        }

        public Criteria andDrugYfylNotEqualTo(String value) {
            addCriterion("drug_yfyl <>", value, "drugYfyl");
            return (Criteria) this;
        }

        public Criteria andDrugYfylGreaterThan(String value) {
            addCriterion("drug_yfyl >", value, "drugYfyl");
            return (Criteria) this;
        }

        public Criteria andDrugYfylGreaterThanOrEqualTo(String value) {
            addCriterion("drug_yfyl >=", value, "drugYfyl");
            return (Criteria) this;
        }

        public Criteria andDrugYfylLessThan(String value) {
            addCriterion("drug_yfyl <", value, "drugYfyl");
            return (Criteria) this;
        }

        public Criteria andDrugYfylLessThanOrEqualTo(String value) {
            addCriterion("drug_yfyl <=", value, "drugYfyl");
            return (Criteria) this;
        }

        public Criteria andDrugYfylLike(String value) {
            addCriterion("drug_yfyl like", value, "drugYfyl");
            return (Criteria) this;
        }

        public Criteria andDrugYfylNotLike(String value) {
            addCriterion("drug_yfyl not like", value, "drugYfyl");
            return (Criteria) this;
        }

        public Criteria andDrugYfylIn(List<String> values) {
            addCriterion("drug_yfyl in", values, "drugYfyl");
            return (Criteria) this;
        }

        public Criteria andDrugYfylNotIn(List<String> values) {
            addCriterion("drug_yfyl not in", values, "drugYfyl");
            return (Criteria) this;
        }

        public Criteria andDrugYfylBetween(String value1, String value2) {
            addCriterion("drug_yfyl between", value1, value2, "drugYfyl");
            return (Criteria) this;
        }

        public Criteria andDrugYfylNotBetween(String value1, String value2) {
            addCriterion("drug_yfyl not between", value1, value2, "drugYfyl");
            return (Criteria) this;
        }

        public Criteria andDrugPicIsNull() {
            addCriterion("drug_pic is null");
            return (Criteria) this;
        }

        public Criteria andDrugPicIsNotNull() {
            addCriterion("drug_pic is not null");
            return (Criteria) this;
        }

        public Criteria andDrugPicEqualTo(String value) {
            addCriterion("drug_pic =", value, "drugPic");
            return (Criteria) this;
        }

        public Criteria andDrugPicNotEqualTo(String value) {
            addCriterion("drug_pic <>", value, "drugPic");
            return (Criteria) this;
        }

        public Criteria andDrugPicGreaterThan(String value) {
            addCriterion("drug_pic >", value, "drugPic");
            return (Criteria) this;
        }

        public Criteria andDrugPicGreaterThanOrEqualTo(String value) {
            addCriterion("drug_pic >=", value, "drugPic");
            return (Criteria) this;
        }

        public Criteria andDrugPicLessThan(String value) {
            addCriterion("drug_pic <", value, "drugPic");
            return (Criteria) this;
        }

        public Criteria andDrugPicLessThanOrEqualTo(String value) {
            addCriterion("drug_pic <=", value, "drugPic");
            return (Criteria) this;
        }

        public Criteria andDrugPicLike(String value) {
            addCriterion("drug_pic like", value, "drugPic");
            return (Criteria) this;
        }

        public Criteria andDrugPicNotLike(String value) {
            addCriterion("drug_pic not like", value, "drugPic");
            return (Criteria) this;
        }

        public Criteria andDrugPicIn(List<String> values) {
            addCriterion("drug_pic in", values, "drugPic");
            return (Criteria) this;
        }

        public Criteria andDrugPicNotIn(List<String> values) {
            addCriterion("drug_pic not in", values, "drugPic");
            return (Criteria) this;
        }

        public Criteria andDrugPicBetween(String value1, String value2) {
            addCriterion("drug_pic between", value1, value2, "drugPic");
            return (Criteria) this;
        }

        public Criteria andDrugPicNotBetween(String value1, String value2) {
            addCriterion("drug_pic not between", value1, value2, "drugPic");
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