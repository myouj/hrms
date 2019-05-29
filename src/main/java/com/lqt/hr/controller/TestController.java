package com.lqt.hr.controller;

import com.lqt.hr.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private ITestService testService;

    @GetMapping("/get")
    public String get(){
        return "good";
    }

    @GetMapping("/list")
    public List<Test> getList(){
        return testService.getList();
    }
}
