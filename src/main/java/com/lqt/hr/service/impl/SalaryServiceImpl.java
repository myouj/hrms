package com.lqt.hr.service.impl;

import com.lqt.hr.dao.SalaryMapper;
import com.lqt.hr.model.Salary;
import com.lqt.hr.model.SalaryExample;
import com.lqt.hr.service.ISalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements ISalaryService {

    @Autowired
    private SalaryMapper salaryMapper;

    public List<Salary> getList() {
        SalaryExample salaryExample = new SalaryExample();

        return salaryMapper.selectByExample(salaryExample);
    }

    public int insert(Salary salary) {
        salaryMapper.insert(salary);
        return getId(salary);
    }


    public int getId(Salary salary){
        SalaryExample salaryExample = new SalaryExample();
        salaryExample.createCriteria().andMonthEqualTo(salary.getMonth()).andEIdEqualTo(salary.geteId())
                .andENameEqualTo(salary.geteName()).andSalaryIdEqualTo(salary.getSalaryId());
        List<Salary> salaries = salaryMapper.selectByExample(salaryExample);

        return salaries.get(0).getId();
    }

    public void update(Salary salary) {

        salaryMapper.updateByPrimaryKeySelective(salary);

    }

    public void delete(Integer id) {

        salaryMapper.deleteByPrimaryKey(id);

    }
}
