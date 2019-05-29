package com.lqt.hr.controller;

import com.lqt.hr.common.utils.RespMessage;
import com.lqt.hr.model.Dept;
import com.lqt.hr.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private IDeptService deptService;

    @GetMapping("dept")
    public RespMessage getList(){
        System.out.println("dept/dept");
        List<Dept> depts = deptService.getList();
        return RespMessage.success(depts);
    }

    @GetMapping("insert")
    public RespMessage insert(@RequestParam(value = "name")String name,
                              @RequestParam(value = "duty")String duty){
        System.out.println("dept/insert");
        Dept dept = new Dept();
        dept.setDuty(duty);
        dept.setName(name);

        try {
            int id = deptService.insert(dept);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id", id);
            return RespMessage.success(map);
        } catch (Exception e) {
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }

    @GetMapping("delete")
    public RespMessage delete(@RequestParam("id")Integer id){
        System.out.println("dept/delete");
        try {
            deptService.delete(id);
            return RespMessage.SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }

    @GetMapping("update")
    public RespMessage update(@RequestParam("id")Integer id,
                              @RequestParam(value = "name")String name,
                              @RequestParam(value = "duty")String duty){
        System.out.println("dept/update");
        Dept dept = new Dept(id, name, duty);

        try {
            deptService.update(dept);
            return RespMessage.SUCCESS;
        }catch (Exception e) {
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }
}
