package com.lqt.hr.service;

import com.lqt.hr.model.EmployeeInfo;

import java.util.List;

public interface IEmployeeInfoService {

    List<EmployeeInfo> getEmployeeInfos();

    EmployeeInfo getEmployeeInfo(Integer id);

    void insert(EmployeeInfo employeeInfo);

    void update(EmployeeInfo employeeInfo);

    void delete(Integer id);
}
