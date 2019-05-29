package com.lqt.hr.service;

import java.util.List;

public interface IUserService {

    int insert(User user);

    int delete(Integer id);

    int update(User user);

    User select(Integer id);

    List<User> selectList();

}
