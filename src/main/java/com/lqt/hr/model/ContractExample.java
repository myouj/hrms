package com.lqt.hr.model;

import java.util.ArrayList;
import java.util.List;

public class ContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractExample() {
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

        public Criteria andIdCardIsNull() {
            addCriterion("ID_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("ID_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("ID_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("ID_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("ID_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("ID_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("ID_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("ID_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("ID_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("ID_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("ID_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("ID_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("ID_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("ID_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andJobContentIsNull() {
            addCriterion("job_content is null");
            return (Criteria) this;
        }

        public Criteria andJobContentIsNotNull() {
            addCriterion("job_content is not null");
            return (Criteria) this;
        }

        public Criteria andJobContentEqualTo(String value) {
            addCriterion("job_content =", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentNotEqualTo(String value) {
            addCriterion("job_content <>", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentGreaterThan(String value) {
            addCriterion("job_content >", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentGreaterThanOrEqualTo(String value) {
            addCriterion("job_content >=", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentLessThan(String value) {
            addCriterion("job_content <", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentLessThanOrEqualTo(String value) {
            addCriterion("job_content <=", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentLike(String value) {
            addCriterion("job_content like", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentNotLike(String value) {
            addCriterion("job_content not like", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentIn(List<String> values) {
            addCriterion("job_content in", values, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentNotIn(List<String> values) {
            addCriterion("job_content not in", values, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentBetween(String value1, String value2) {
            addCriterion("job_content between", value1, value2, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentNotBetween(String value1, String value2) {
            addCriterion("job_content not between", value1, value2, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobAddressIsNull() {
            addCriterion("job_address is null");
            return (Criteria) this;
        }

        public Criteria andJobAddressIsNotNull() {
            addCriterion("job_address is not null");
            return (Criteria) this;
        }

        public Criteria andJobAddressEqualTo(String value) {
            addCriterion("job_address =", value, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressNotEqualTo(String value) {
            addCriterion("job_address <>", value, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressGreaterThan(String value) {
            addCriterion("job_address >", value, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressGreaterThanOrEqualTo(String value) {
            addCriterion("job_address >=", value, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressLessThan(String value) {
            addCriterion("job_address <", value, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressLessThanOrEqualTo(String value) {
            addCriterion("job_address <=", value, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressLike(String value) {
            addCriterion("job_address like", value, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressNotLike(String value) {
            addCriterion("job_address not like", value, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressIn(List<String> values) {
            addCriterion("job_address in", values, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressNotIn(List<String> values) {
            addCriterion("job_address not in", values, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressBetween(String value1, String value2) {
            addCriterion("job_address between", value1, value2, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressNotBetween(String value1, String value2) {
            addCriterion("job_address not between", value1, value2, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andTimeSettingIsNull() {
            addCriterion("time_setting is null");
            return (Criteria) this;
        }

        public Criteria andTimeSettingIsNotNull() {
            addCriterion("time_setting is not null");
            return (Criteria) this;
        }

        public Criteria andTimeSettingEqualTo(String value) {
            addCriterion("time_setting =", value, "timeSetting");
            return (Criteria) this;
        }

        public Criteria andTimeSettingNotEqualTo(String value) {
            addCriterion("time_setting <>", value, "timeSetting");
            return (Criteria) this;
        }

        public Criteria andTimeSettingGreaterThan(String value) {
            addCriterion("time_setting >", value, "timeSetting");
            return (Criteria) this;
        }

        public Criteria andTimeSettingGreaterThanOrEqualTo(String value) {
            addCriterion("time_setting >=", value, "timeSetting");
            return (Criteria) this;
        }

        public Criteria andTimeSettingLessThan(String value) {
            addCriterion("time_setting <", value, "timeSetting");
            return (Criteria) this;
        }

        public Criteria andTimeSettingLessThanOrEqualTo(String value) {
            addCriterion("time_setting <=", value, "timeSetting");
            return (Criteria) this;
        }

        public Criteria andTimeSettingLike(String value) {
            addCriterion("time_setting like", value, "timeSetting");
            return (Criteria) this;
        }

        public Criteria andTimeSettingNotLike(String value) {
            addCriterion("time_setting not like", value, "timeSetting");
            return (Criteria) this;
        }

        public Criteria andTimeSettingIn(List<String> values) {
            addCriterion("time_setting in", values, "timeSetting");
            return (Criteria) this;
        }

        public Criteria andTimeSettingNotIn(List<String> values) {
            addCriterion("time_setting not in", values, "timeSetting");
            return (Criteria) this;
        }

        public Criteria andTimeSettingBetween(String value1, String value2) {
            addCriterion("time_setting between", value1, value2, "timeSetting");
            return (Criteria) this;
        }

        public Criteria andTimeSettingNotBetween(String value1, String value2) {
            addCriterion("time_setting not between", value1, value2, "timeSetting");
            return (Criteria) this;
        }

        public Criteria andProtectionIsNull() {
            addCriterion("protection is null");
            return (Criteria) this;
        }

        public Criteria andProtectionIsNotNull() {
            addCriterion("protection is not null");
            return (Criteria) this;
        }

        public Criteria andProtectionEqualTo(String value) {
            addCriterion("protection =", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionNotEqualTo(String value) {
            addCriterion("protection <>", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionGreaterThan(String value) {
            addCriterion("protection >", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionGreaterThanOrEqualTo(String value) {
            addCriterion("protection >=", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionLessThan(String value) {
            addCriterion("protection <", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionLessThanOrEqualTo(String value) {
            addCriterion("protection <=", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionLike(String value) {
            addCriterion("protection like", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionNotLike(String value) {
            addCriterion("protection not like", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionIn(List<String> values) {
            addCriterion("protection in", values, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionNotIn(List<String> values) {
            addCriterion("protection not in", values, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionBetween(String value1, String value2) {
            addCriterion("protection between", value1, value2, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionNotBetween(String value1, String value2) {
            addCriterion("protection not between", value1, value2, "protection");
            return (Criteria) this;
        }

        public Criteria andRewardIsNull() {
            addCriterion("reward is null");
            return (Criteria) this;
        }

        public Criteria andRewardIsNotNull() {
            addCriterion("reward is not null");
            return (Criteria) this;
        }

        public Criteria andRewardEqualTo(String value) {
            addCriterion("reward =", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotEqualTo(String value) {
            addCriterion("reward <>", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardGreaterThan(String value) {
            addCriterion("reward >", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardGreaterThanOrEqualTo(String value) {
            addCriterion("reward >=", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLessThan(String value) {
            addCriterion("reward <", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLessThanOrEqualTo(String value) {
            addCriterion("reward <=", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLike(String value) {
            addCriterion("reward like", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotLike(String value) {
            addCriterion("reward not like", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardIn(List<String> values) {
            addCriterion("reward in", values, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotIn(List<String> values) {
            addCriterion("reward not in", values, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardBetween(String value1, String value2) {
            addCriterion("reward between", value1, value2, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotBetween(String value1, String value2) {
            addCriterion("reward not between", value1, value2, "reward");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNull() {
            addCriterion("insurance is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNotNull() {
            addCriterion("insurance is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEqualTo(String value) {
            addCriterion("insurance =", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotEqualTo(String value) {
            addCriterion("insurance <>", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThan(String value) {
            addCriterion("insurance >", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("insurance >=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThan(String value) {
            addCriterion("insurance <", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThanOrEqualTo(String value) {
            addCriterion("insurance <=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLike(String value) {
            addCriterion("insurance like", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotLike(String value) {
            addCriterion("insurance not like", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceIn(List<String> values) {
            addCriterion("insurance in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotIn(List<String> values) {
            addCriterion("insurance not in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceBetween(String value1, String value2) {
            addCriterion("insurance between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotBetween(String value1, String value2) {
            addCriterion("insurance not between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andWelfareIsNull() {
            addCriterion("welfare is null");
            return (Criteria) this;
        }

        public Criteria andWelfareIsNotNull() {
            addCriterion("welfare is not null");
            return (Criteria) this;
        }

        public Criteria andWelfareEqualTo(String value) {
            addCriterion("welfare =", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareNotEqualTo(String value) {
            addCriterion("welfare <>", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareGreaterThan(String value) {
            addCriterion("welfare >", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareGreaterThanOrEqualTo(String value) {
            addCriterion("welfare >=", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareLessThan(String value) {
            addCriterion("welfare <", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareLessThanOrEqualTo(String value) {
            addCriterion("welfare <=", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareLike(String value) {
            addCriterion("welfare like", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareNotLike(String value) {
            addCriterion("welfare not like", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareIn(List<String> values) {
            addCriterion("welfare in", values, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareNotIn(List<String> values) {
            addCriterion("welfare not in", values, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareBetween(String value1, String value2) {
            addCriterion("welfare between", value1, value2, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareNotBetween(String value1, String value2) {
            addCriterion("welfare not between", value1, value2, "welfare");
            return (Criteria) this;
        }

        public Criteria andChangeIsNull() {
            addCriterion("change is null");
            return (Criteria) this;
        }

        public Criteria andChangeIsNotNull() {
            addCriterion("change is not null");
            return (Criteria) this;
        }

        public Criteria andChangeEqualTo(String value) {
            addCriterion("change =", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeNotEqualTo(String value) {
            addCriterion("change <>", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeGreaterThan(String value) {
            addCriterion("change >", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeGreaterThanOrEqualTo(String value) {
            addCriterion("change >=", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeLessThan(String value) {
            addCriterion("change <", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeLessThanOrEqualTo(String value) {
            addCriterion("change <=", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeLike(String value) {
            addCriterion("change like", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeNotLike(String value) {
            addCriterion("change not like", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeIn(List<String> values) {
            addCriterion("change in", values, "change");
            return (Criteria) this;
        }

        public Criteria andChangeNotIn(List<String> values) {
            addCriterion("change not in", values, "change");
            return (Criteria) this;
        }

        public Criteria andChangeBetween(String value1, String value2) {
            addCriterion("change between", value1, value2, "change");
            return (Criteria) this;
        }

        public Criteria andChangeNotBetween(String value1, String value2) {
            addCriterion("change not between", value1, value2, "change");
            return (Criteria) this;
        }

        public Criteria andBreachIsNull() {
            addCriterion("breach is null");
            return (Criteria) this;
        }

        public Criteria andBreachIsNotNull() {
            addCriterion("breach is not null");
            return (Criteria) this;
        }

        public Criteria andBreachEqualTo(String value) {
            addCriterion("breach =", value, "breach");
            return (Criteria) this;
        }

        public Criteria andBreachNotEqualTo(String value) {
            addCriterion("breach <>", value, "breach");
            return (Criteria) this;
        }

        public Criteria andBreachGreaterThan(String value) {
            addCriterion("breach >", value, "breach");
            return (Criteria) this;
        }

        public Criteria andBreachGreaterThanOrEqualTo(String value) {
            addCriterion("breach >=", value, "breach");
            return (Criteria) this;
        }

        public Criteria andBreachLessThan(String value) {
            addCriterion("breach <", value, "breach");
            return (Criteria) this;
        }

        public Criteria andBreachLessThanOrEqualTo(String value) {
            addCriterion("breach <=", value, "breach");
            return (Criteria) this;
        }

        public Criteria andBreachLike(String value) {
            addCriterion("breach like", value, "breach");
            return (Criteria) this;
        }

        public Criteria andBreachNotLike(String value) {
            addCriterion("breach not like", value, "breach");
            return (Criteria) this;
        }

        public Criteria andBreachIn(List<String> values) {
            addCriterion("breach in", values, "breach");
            return (Criteria) this;
        }

        public Criteria andBreachNotIn(List<String> values) {
            addCriterion("breach not in", values, "breach");
            return (Criteria) this;
        }

        public Criteria andBreachBetween(String value1, String value2) {
            addCriterion("breach between", value1, value2, "breach");
            return (Criteria) this;
        }

        public Criteria andBreachNotBetween(String value1, String value2) {
            addCriterion("breach not between", value1, value2, "breach");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCpAddressIsNull() {
            addCriterion("cp_address is null");
            return (Criteria) this;
        }

        public Criteria andCpAddressIsNotNull() {
            addCriterion("cp_address is not null");
            return (Criteria) this;
        }

        public Criteria andCpAddressEqualTo(String value) {
            addCriterion("cp_address =", value, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressNotEqualTo(String value) {
            addCriterion("cp_address <>", value, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressGreaterThan(String value) {
            addCriterion("cp_address >", value, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("cp_address >=", value, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressLessThan(String value) {
            addCriterion("cp_address <", value, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressLessThanOrEqualTo(String value) {
            addCriterion("cp_address <=", value, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressLike(String value) {
            addCriterion("cp_address like", value, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressNotLike(String value) {
            addCriterion("cp_address not like", value, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressIn(List<String> values) {
            addCriterion("cp_address in", values, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressNotIn(List<String> values) {
            addCriterion("cp_address not in", values, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressBetween(String value1, String value2) {
            addCriterion("cp_address between", value1, value2, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressNotBetween(String value1, String value2) {
            addCriterion("cp_address not between", value1, value2, "cpAddress");
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

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
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