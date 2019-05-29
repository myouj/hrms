package com.lqt.hr.model;



public class Record {
    private Integer id;

    private Integer eId;

    private String name;

    private String idCard;

    private String gender;

    private String state;

    private Integer deptId;

    private String department;

    private String jobTitle;

    private String entryTime;

    private String bank;

    private String account;

    private Integer conId;

    public Record() {
    }

    public Record(Integer id, Integer eId, String name, String idCard, String gender, String state, Integer deptId, String department, String jobTitle, String entryTime, String bank, String account, Integer conId) {
        this.id = id;
        this.eId = eId;
        this.name = name;
        this.idCard = idCard;
        this.gender = gender;
        this.state = state;
        this.deptId = deptId;
        this.department = department;
        this.jobTitle = jobTitle;
        this.entryTime = entryTime;
        this.bank = bank;
        this.account = account;
        this.conId = conId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle == null ? null : jobTitle.trim();
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }
}