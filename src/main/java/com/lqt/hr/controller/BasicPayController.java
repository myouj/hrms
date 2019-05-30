package com.lqt.hr.controller;

import com.lqt.hr.common.utils.RespMessage;
import com.lqt.hr.model.BasicPay;
import com.lqt.hr.service.IBasicPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("basicPay")
public class BasicPayController {

    @Autowired
    private IBasicPayService basicPayService;

    @GetMapping("basicPays")
    public RespMessage getList(){
        System.out.println("basicPay/basicPays");
        List<BasicPay> list = basicPayService.getList();
        return RespMessage.success(list);
    }

    @GetMapping("insert")
    public RespMessage insert(@RequestParam("eId")Integer eId,
                              @RequestParam("eName")String eName,
                              @RequestParam("salary")Integer salary){
        System.out.println("basicPay/insert");
        BasicPay basicPay = new BasicPay(null, eId, eName, salary);

        try {
            int id = basicPayService.insert(basicPay);
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
                              @RequestParam(value = "eId", required = false)Integer eId,
                              @RequestParam(value = "eName", required = false)String eName,
                              @RequestParam(value = "salary", required = false)Integer salary){
        System.out.println("basicPay/update");
        BasicPay basicPay = new BasicPay(id, eId, eName, salary);

        try {
            basicPayService.update(basicPay);
            return RespMessage.SUCCESS;
        }catch (Exception e ){
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }

    @GetMapping("delete")
    public RespMessage delete(@RequestParam("id")Integer id){
        System.out.println("basicPay/delete");
        try {
            basicPayService.delete(id);
            return RespMessage.SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }

}
