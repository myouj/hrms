package com.lqt.hr.service.impl;

import com.lqt.hr.dao.RoleMapper;
import com.lqt.hr.model.Role;
import com.lqt.hr.model.RoleExample;
import com.lqt.hr.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    public List<Role> getRoles() {
        RoleExample roleExample = new RoleExample();
        List<Role> roles = roleMapper.selectByExample(roleExample);
        return roles;
    }

    public Role getRole(Integer id) {
        Role role = roleMapper.selectByPrimaryKey(id);
        return role;
    }

    public void insert(Role role) {
        roleMapper.insert(role);
    }

    public void update(Role role) {
        roleMapper.updateByPrimaryKeySelective(role);
    }

    public void delete(Integer id) {
        roleMapper.deleteByPrimaryKey(id);
    }
}
