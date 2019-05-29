package com.lqt.hr.service;

import com.lqt.hr.model.Dept;

import java.util.List;

public interface IDeptService {

    List<Dept> getList();

    int insert(Dept dept);

    void update(Dept dept);

    void delete(Integer id);
}
