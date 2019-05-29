package com.lqt.hr.model;

public class User {
    private Integer id;

    private String name;

    private String password;

    private Integer roleId;

    private String roleName;

    private Integer eId;

    public User(Integer id, String name, String password, Integer roleId, String roleName, Integer eId) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.roleId = roleId;
        this.roleName = roleName;
        this.eId = eId;
    }

    public User() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", eId=" + eId +
                '}';
    }
}