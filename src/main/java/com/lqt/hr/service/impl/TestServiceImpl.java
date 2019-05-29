package com.lqt.hr.service.impl;

import com.lqt.hr.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private TestMapper testMapper;


    public List<Test> getList() {
        TestExample testExample = new TestExample();
        return testMapper.selectByExample(testExample);
    }
}
