package com.lqt.hr.model;

public class Dept {
    private Integer id;

    private String name;

    private String duty;

    public Dept(Integer id, String name, String duty) {
        this.id = id;
        this.name = name;
        this.duty = duty;
    }

    public Dept() {
    }

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

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }
}