package com.lqt.hr.service;

import java.util.List;

public interface IRoleService {

    List<Role> getRoles();

    Role getRole(Integer id);

    void insert(Role role);

    void update(Role role);

    void delete(Integer id);
}
