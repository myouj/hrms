package com.lqt.hr.controller;

import com.lqt.hr.common.utils.RespMessage;
import com.lqt.hr.model.Salary;
import com.lqt.hr.service.ISalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("salary")
public class SalaryController {

    @Autowired
    private ISalaryService salaryService;

    @GetMapping("salaries")
    public RespMessage getList(){
        System.out.println("salary/salaries");
        List<Salary> salaries = salaryService.getList();
        return RespMessage.success(salaries);
    }

    @GetMapping("insert")
    public RespMessage insert(@RequestParam(value = "month", required = false) Integer month,
                              @RequestParam(value = "eId", required = false) Integer eId,
                              @RequestParam(value = "eName", required = false) String eName,
                              @RequestParam(value = "salaryId", required = false) Integer salaryId,
                              @RequestParam(value = "salary", required = false) Integer salary,
                              @RequestParam(value = "bonus", required = false) Integer bonus,
                              @RequestParam(value = "penalty", required = false) Integer penalty,
                              @RequestParam(value = "remark", required = false) String remark){
        System.out.println("salary/insert");
        Salary sa = new Salary(null, month, eId, eName, salaryId, salary, bonus, penalty, remark);
        try {
            int id = salaryService.insert(sa);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id", id);
            return RespMessage.success(map);
        }catch (Exception e){
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }

    @GetMapping("update")
    public RespMessage update(@RequestParam("id")Integer id,
                              @RequestParam(value = "month", required = false) Integer month,
                              @RequestParam(value = "eId", required = false) Integer eId,
                              @RequestParam(value = "eName", required = false) String eName,
                              @RequestParam(value = "salaryId", required = false) Integer salaryId,
                              @RequestParam(value = "salary", required = false) Integer salary,
                              @RequestParam(value = "bonus", required = false) Integer bonus,
                              @RequestParam(value = "penalty", required = false) Integer penalty,
                              @RequestParam(value = "remark", required = false) String remark){
        System.out.println("salary/update");
        Salary sa = new Salary(id, month, eId, eName, salaryId, salary, bonus, penalty, remark);

        try {
            salaryService.update(sa);
            return RespMessage.SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }

    @GetMapping("delete")
    public RespMessage delete(@RequestParam("id")Integer id){
        System.out.println("salary/delete");
        try {
            salaryService.delete(id);
            return RespMessage.SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }

    @GetMapping("getByName")
    public RespMessage getByName(@RequestParam("name")String name){
        List<Salary> salaries = salaryService.getByName(name);
        return RespMessage.success(salaries);
    }
}
