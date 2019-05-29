package com.lqt.hr.model;

public class Role {
    private Integer id;

    private String name;

    private Integer level;

    private String description;

    public Role() {
    }

    public Role(Integer id, String name, Integer level, String description) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.description = description;
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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}