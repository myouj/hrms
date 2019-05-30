package com.lqt.hr.service;

import com.lqt.hr.model.Salary;

import java.util.List;

public interface ISalaryService {

    List<Salary> getList();

    int insert(Salary salary);

    void update(Salary salary);

    void delete(Integer id);

    List<Salary> getByName(String name);
}
