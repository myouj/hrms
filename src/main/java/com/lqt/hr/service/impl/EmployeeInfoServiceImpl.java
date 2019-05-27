package com.lqt.hr.service.impl;

import com.lqt.hr.dao.EmployeeInfoMapper;
import com.lqt.hr.model.EmployeeInfo;
import com.lqt.hr.model.EmployeeInfoExample;
import com.lqt.hr.service.IEmployeeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeInfoServiceImpl implements IEmployeeInfoService {

    @Autowired
    private EmployeeInfoMapper employeeInfoMapper;

    public List<EmployeeInfo> getEmployeeInfos() {
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        List<EmployeeInfo> employeeInfos = employeeInfoMapper.selectByExample(employeeInfoExample);
        return employeeInfos;
    }

    public EmployeeInfo getEmployeeInfo(Integer id) {
        EmployeeInfo employeeInfo = employeeInfoMapper.selectByPrimaryKey(id);
        return employeeInfo;
    }

    public void insert(EmployeeInfo employeeInfo) {
        employeeInfoMapper.insert(employeeInfo);

    }

    public void update(EmployeeInfo employeeInfo) {
        employeeInfoMapper.updateByPrimaryKeySelective(employeeInfo);

    }

    public void delete(Integer id) {
        employeeInfoMapper.deleteByPrimaryKey(id);

    }
}
