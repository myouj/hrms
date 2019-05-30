package com.lqt.hr.model;

public class BasicPay {
    private Integer id;

    private Integer eId;

    private String eName;

    private Integer salary;

    public BasicPay() {
    }

    public BasicPay(Integer id, Integer eId, String eName, Integer salary) {
        this.id = id;
        this.eId = eId;
        this.eName = eName;
        this.salary = salary;
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

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName == null ? null : eName.trim();
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}