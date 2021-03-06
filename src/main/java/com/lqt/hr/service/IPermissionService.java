package com.lqt.hr.service;

import com.lqt.hr.model.Permission;

import java.util.List;

public interface IPermissionService {

    List<Permission> getPermissions();

    Permission getPermission(Integer id);

    void insert(Permission permission);

    void update(Permission permission);

    void delete(Integer id);
}
