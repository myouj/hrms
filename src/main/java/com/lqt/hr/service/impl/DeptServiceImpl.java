package com.lqt.hr.service.impl;

import com.lqt.hr.dao.DeptMapper;
import com.lqt.hr.model.Dept;
import com.lqt.hr.model.DeptExample;
import com.lqt.hr.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private DeptMapper deptMapper;

    public List<Dept> getList() {
        DeptExample deptExample = new DeptExample();
        return deptMapper.selectByExample(deptExample);
    }

    public int getId(Dept dept){
        DeptExample deptExample = new DeptExample();
        deptExample.createCriteria().andNameEqualTo(dept.getName());
        List<Dept> depts = deptMapper.selectByExample(deptExample);
        return depts.get(0).getId();
    }

    public int insert(Dept dept) {
        deptMapper.insert(dept);
        return getId(dept);
    }

    public void update(Dept dept) {
        deptMapper.updateByPrimaryKeySelective(dept);

    }

    public void delete(Integer id) {
        deptMapper.deleteByPrimaryKey(id);
    }
}
