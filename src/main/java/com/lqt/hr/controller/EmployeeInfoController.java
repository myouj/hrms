package com.lqt.hr.controller;

import com.lqt.hr.common.utils.RespMessage;
import com.lqt.hr.model.EmployeeInfo;
import com.lqt.hr.service.IEmployeeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeInfoController {

    @Autowired
    private IEmployeeInfoService employeeInfoService;

    @GetMapping("employees")
    public RespMessage getEmployees(){
        List<EmployeeInfo> employeeInfos = employeeInfoService.getEmployeeInfos();
        return RespMessage.success(employeeInfos);
    }

    @GetMapping("employee")
    public RespMessage getEmployee(@RequestParam("id")Integer id){
        EmployeeInfo employeeInfo = employeeInfoService.getEmployeeInfo(id);
        return RespMessage.success(employeeInfo);
    }

    @PostMapping("insert")
    public RespMessage insert(EmployeeInfo employeeInfo){
        try {
            employeeInfoService.insert(employeeInfo);
        } catch (Exception e) {
            return RespMessage.fail("插入异常");
        }
        return RespMessage.SUCCESS;
    }

    @PostMapping("update")
    public RespMessage update(EmployeeInfo employeeInfo){
        try {
            employeeInfoService.update(employeeInfo);
        } catch (Exception e) {
            return RespMessage.fail("更新异常");
        }
        return RespMessage.SUCCESS;
    }

    @GetMapping("delete")
    public RespMessage delete(@RequestParam("id")Integer id){
        try {
            employeeInfoService.delete(id);
        } catch (Exception e) {
            return RespMessage.fail("删除异常");
        }
        return RespMessage.SUCCESS;
    }
}
