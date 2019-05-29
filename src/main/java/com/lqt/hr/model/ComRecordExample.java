package com.lqt.hr.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComRecordExample() {
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

        public Criteria andRgNumberIsNull() {
            addCriterion("rg_number is null");
            return (Criteria) this;
        }

        public Criteria andRgNumberIsNotNull() {
            addCriterion("rg_number is not null");
            return (Criteria) this;
        }

        public Criteria andRgNumberEqualTo(Integer value) {
            addCriterion("rg_number =", value, "rgNumber");
            return (Criteria) this;
        }

        public Criteria andRgNumberNotEqualTo(Integer value) {
            addCriterion("rg_number <>", value, "rgNumber");
            return (Criteria) this;
        }

        public Criteria andRgNumberGreaterThan(Integer value) {
            addCriterion("rg_number >", value, "rgNumber");
            return (Criteria) this;
        }

        public Criteria andRgNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("rg_number >=", value, "rgNumber");
            return (Criteria) this;
        }

        public Criteria andRgNumberLessThan(Integer value) {
            addCriterion("rg_number <", value, "rgNumber");
            return (Criteria) this;
        }

        public Criteria andRgNumberLessThanOrEqualTo(Integer value) {
            addCriterion("rg_number <=", value, "rgNumber");
            return (Criteria) this;
        }

        public Criteria andRgNumberIn(List<Integer> values) {
            addCriterion("rg_number in", values, "rgNumber");
            return (Criteria) this;
        }

        public Criteria andRgNumberNotIn(List<Integer> values) {
            addCriterion("rg_number not in", values, "rgNumber");
            return (Criteria) this;
        }

        public Criteria andRgNumberBetween(Integer value1, Integer value2) {
            addCriterion("rg_number between", value1, value2, "rgNumber");
            return (Criteria) this;
        }

        public Criteria andRgNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("rg_number not between", value1, value2, "rgNumber");
            return (Criteria) this;
        }

        public Criteria andRgAddressIsNull() {
            addCriterion("rg_address is null");
            return (Criteria) this;
        }

        public Criteria andRgAddressIsNotNull() {
            addCriterion("rg_address is not null");
            return (Criteria) this;
        }

        public Criteria andRgAddressEqualTo(String value) {
            addCriterion("rg_address =", value, "rgAddress");
            return (Criteria) this;
        }

        public Criteria andRgAddressNotEqualTo(String value) {
            addCriterion("rg_address <>", value, "rgAddress");
            return (Criteria) this;
        }

        public Criteria andRgAddressGreaterThan(String value) {
            addCriterion("rg_address >", value, "rgAddress");
            return (Criteria) this;
        }

        public Criteria andRgAddressGreaterThanOrEqualTo(String value) {
            addCriterion("rg_address >=", value, "rgAddress");
            return (Criteria) this;
        }

        public Criteria andRgAddressLessThan(String value) {
            addCriterion("rg_address <", value, "rgAddress");
            return (Criteria) this;
        }

        public Criteria andRgAddressLessThanOrEqualTo(String value) {
            addCriterion("rg_address <=", value, "rgAddress");
            return (Criteria) this;
        }

        public Criteria andRgAddressLike(String value) {
            addCriterion("rg_address like", value, "rgAddress");
            return (Criteria) this;
        }

        public Criteria andRgAddressNotLike(String value) {
            addCriterion("rg_address not like", value, "rgAddress");
            return (Criteria) this;
        }

        public Criteria andRgAddressIn(List<String> values) {
            addCriterion("rg_address in", values, "rgAddress");
            return (Criteria) this;
        }

        public Criteria andRgAddressNotIn(List<String> values) {
            addCriterion("rg_address not in", values, "rgAddress");
            return (Criteria) this;
        }

        public Criteria andRgAddressBetween(String value1, String value2) {
            addCriterion("rg_address between", value1, value2, "rgAddress");
            return (Criteria) this;
        }

        public Criteria andRgAddressNotBetween(String value1, String value2) {
            addCriterion("rg_address not between", value1, value2, "rgAddress");
            return (Criteria) this;
        }

        public Criteria andRepresentativeIsNull() {
            addCriterion("representative is null");
            return (Criteria) this;
        }

        public Criteria andRepresentativeIsNotNull() {
            addCriterion("representative is not null");
            return (Criteria) this;
        }

        public Criteria andRepresentativeEqualTo(String value) {
            addCriterion("representative =", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNotEqualTo(String value) {
            addCriterion("representative <>", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeGreaterThan(String value) {
            addCriterion("representative >", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeGreaterThanOrEqualTo(String value) {
            addCriterion("representative >=", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeLessThan(String value) {
            addCriterion("representative <", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeLessThanOrEqualTo(String value) {
            addCriterion("representative <=", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeLike(String value) {
            addCriterion("representative like", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNotLike(String value) {
            addCriterion("representative not like", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeIn(List<String> values) {
            addCriterion("representative in", values, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNotIn(List<String> values) {
            addCriterion("representative not in", values, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeBetween(String value1, String value2) {
            addCriterion("representative between", value1, value2, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNotBetween(String value1, String value2) {
            addCriterion("representative not between", value1, value2, "representative");
            return (Criteria) this;
        }

        public Criteria andRangeIsNull() {
            addCriterion("range is null");
            return (Criteria) this;
        }

        public Criteria andRangeIsNotNull() {
            addCriterion("range is not null");
            return (Criteria) this;
        }

        public Criteria andRangeEqualTo(String value) {
            addCriterion("range =", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotEqualTo(String value) {
            addCriterion("range <>", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeGreaterThan(String value) {
            addCriterion("range >", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeGreaterThanOrEqualTo(String value) {
            addCriterion("range >=", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeLessThan(String value) {
            addCriterion("range <", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeLessThanOrEqualTo(String value) {
            addCriterion("range <=", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeLike(String value) {
            addCriterion("range like", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotLike(String value) {
            addCriterion("range not like", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeIn(List<String> values) {
            addCriterion("range in", values, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotIn(List<String> values) {
            addCriterion("range not in", values, "range");
            return (Criteria) this;
        }

        public Criteria andRangeBetween(String value1, String value2) {
            addCriterion("range between", value1, value2, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotBetween(String value1, String value2) {
            addCriterion("range not between", value1, value2, "range");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andRgAssetsIsNull() {
            addCriterion("rg_assets is null");
            return (Criteria) this;
        }

        public Criteria andRgAssetsIsNotNull() {
            addCriterion("rg_assets is not null");
            return (Criteria) this;
        }

        public Criteria andRgAssetsEqualTo(String value) {
            addCriterion("rg_assets =", value, "rgAssets");
            return (Criteria) this;
        }

        public Criteria andRgAssetsNotEqualTo(String value) {
            addCriterion("rg_assets <>", value, "rgAssets");
            return (Criteria) this;
        }

        public Criteria andRgAssetsGreaterThan(String value) {
            addCriterion("rg_assets >", value, "rgAssets");
            return (Criteria) this;
        }

        public Criteria andRgAssetsGreaterThanOrEqualTo(String value) {
            addCriterion("rg_assets >=", value, "rgAssets");
            return (Criteria) this;
        }

        public Criteria andRgAssetsLessThan(String value) {
            addCriterion("rg_assets <", value, "rgAssets");
            return (Criteria) this;
        }

        public Criteria andRgAssetsLessThanOrEqualTo(String value) {
            addCriterion("rg_assets <=", value, "rgAssets");
            return (Criteria) this;
        }

        public Criteria andRgAssetsLike(String value) {
            addCriterion("rg_assets like", value, "rgAssets");
            return (Criteria) this;
        }

        public Criteria andRgAssetsNotLike(String value) {
            addCriterion("rg_assets not like", value, "rgAssets");
            return (Criteria) this;
        }

        public Criteria andRgAssetsIn(List<String> values) {
            addCriterion("rg_assets in", values, "rgAssets");
            return (Criteria) this;
        }

        public Criteria andRgAssetsNotIn(List<String> values) {
            addCriterion("rg_assets not in", values, "rgAssets");
            return (Criteria) this;
        }

        public Criteria andRgAssetsBetween(String value1, String value2) {
            addCriterion("rg_assets between", value1, value2, "rgAssets");
            return (Criteria) this;
        }

        public Criteria andRgAssetsNotBetween(String value1, String value2) {
            addCriterion("rg_assets not between", value1, value2, "rgAssets");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
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