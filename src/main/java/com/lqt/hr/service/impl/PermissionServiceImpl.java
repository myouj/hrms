package com.lqt.hr.service.impl;

import com.lqt.hr.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private PermissionMapper permissionMapper;


    public List<Permission> getPermissions() {
        PermissionExample permissionExample = new PermissionExample();
        return permissionMapper.selectByExample(permissionExample);
    }

    public Permission getPermission(Integer id) {
        Permission permission = permissionMapper.selectByPrimaryKey(id);
        return permission;
    }

    public void insert(Permission permission) {
        permissionMapper.insert(permission);

    }

    public void update(Permission permission) {
        permissionMapper.updateByPrimaryKeySelective(permission);
    }

    public void delete(Integer id) {
        permissionMapper.deleteByPrimaryKey(id);
    }
}
