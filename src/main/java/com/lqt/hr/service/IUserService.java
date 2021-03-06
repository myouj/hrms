package com.lqt.hr.service;

import com.lqt.hr.model.User;

import java.util.List;

public interface IUserService {

    int insert(User user);

    int delete(Integer id);

    int update(User user);

    User select(Integer id);

    List<User> selectList();

    List<User> selectListByName(String name);

    User login(String name, String password);

}
