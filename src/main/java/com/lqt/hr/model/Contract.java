package com.lqt.hr.model;

public class Contract {
    private Integer id;

    private String name;

    private String idCard;

    private String jobContent;

    private String jobAddress;

    private String timeSetting;

    private String protection;

    private String reward;

    private String insurance;

    private String welfare;

    private String change;

    private String breach;

    private String company;

    private String cpAddress;

    private String time;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getJobContent() {
        return jobContent;
    }

    public void setJobContent(String jobContent) {
        this.jobContent = jobContent == null ? null : jobContent.trim();
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress == null ? null : jobAddress.trim();
    }

    public String getTimeSetting() {
        return timeSetting;
    }

    public void setTimeSetting(String timeSetting) {
        this.timeSetting = timeSetting == null ? null : timeSetting.trim();
    }

    public String getProtection() {
        return protection;
    }

    public void setProtection(String protection) {
        this.protection = protection == null ? null : protection.trim();
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward == null ? null : reward.trim();
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance == null ? null : insurance.trim();
    }

    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare == null ? null : welfare.trim();
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change == null ? null : change.trim();
    }

    public String getBreach() {
        return breach;
    }

    public void setBreach(String breach) {
        this.breach = breach == null ? null : breach.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getCpAddress() {
        return cpAddress;
    }

    public void setCpAddress(String cpAddress) {
        this.cpAddress = cpAddress == null ? null : cpAddress.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}