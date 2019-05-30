package com.lqt.hr.model;

public class Salary {
    private Integer id;

    private Integer month;

    private Integer eId;

    private String eName;

    private Integer salaryId;

    private Integer salary;

    private Integer bonus;

    private Integer penalty;

    private String remark;

    public Salary() {
    }

    public Salary(Integer id, Integer month, Integer eId, String eName, Integer salaryId, Integer salary, Integer bonus, Integer penalty, String remark) {
        this.id = id;
        this.month = month;
        this.eId = eId;
        this.eName = eName;
        this.salaryId = salaryId;
        this.salary = salary;
        this.bonus = bonus;
        this.penalty = penalty;
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
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

    public Integer getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(Integer salaryId) {
        this.salaryId = salaryId;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public Integer getPenalty() {
        return penalty;
    }

    public void setPenalty(Integer penalty) {
        this.penalty = penalty;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}