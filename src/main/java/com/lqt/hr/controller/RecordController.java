package com.lqt.hr.controller;

import com.lqt.hr.common.utils.RespMessage;
import com.lqt.hr.model.Record;
import com.lqt.hr.service.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("record")
public class RecordController {

    @Autowired
    private IRecordService recordService;

    @GetMapping("records")
    public RespMessage getList(){
        System.out.println("record/records");
        List<Record> records = recordService.getList();
        return RespMessage.success(records);
    }

    @GetMapping("record")
    public RespMessage getRecord(@RequestParam("id")Integer id){
        System.out.println("record/record");
        Record record = recordService.getRecord(id);
        return RespMessage.success(record);
    }


    @GetMapping("insert")
    public RespMessage insert(@RequestParam(value = "eId")Integer eId,
                              @RequestParam(value = "name", required = false)String name,
                              @RequestParam(value = "idCard", required = false)String idCard,
                              @RequestParam(value = "gender", required = false) String gender,
                              @RequestParam(value = "state", required = false)String state,
                              @RequestParam(value = "deptId",required = false)Integer deptId,
                              @RequestParam(value = "department",required = false)String department,
                              @RequestParam(value = "jobTitle",required = false)String jobTitle,
                              @RequestParam(value = "entryTime",required = false)String entryTime,
                              @RequestParam(value = "bank",required = false)String bank,
                              @RequestParam(value = "account",required = false)String account,
                              @RequestParam(value = "conId",required = false)Integer conId){
        System.out.println("record/insert");
        Record record = new Record(null, eId, name, idCard, gender, state, deptId, department, jobTitle,
                new Date(entryTime), bank, account, conId);
        try {
            int id = recordService.insert(record);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id", id);
            return RespMessage.success(map);
        }catch (Exception e){
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }

    @GetMapping("delete")
    public RespMessage delete(@RequestParam("id")Integer id){
        System.out.println("record/delete");
        try {
            recordService.delete(id);
            return RespMessage.SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }

    @GetMapping("update")
    public RespMessage update(@RequestParam("id")Integer id,
                              @RequestParam(value = "eId")Integer eId,
                              @RequestParam(value = "name", required = false)String name,
                              @RequestParam(value = "idCard", required = false)String idCard,
                              @RequestParam(value = "gender", required = false) String gender,
                              @RequestParam(value = "state", required = false)String state,
                              @RequestParam(value = "deptId",required = false)Integer deptId,
                              @RequestParam(value = "department",required = false)String department,
                              @RequestParam(value = "jobTitle",required = false)String jobTitle,
                              @RequestParam(value = "entryTime",required = false)String entryTime,
                              @RequestParam(value = "bank",required = false)String bank,
                              @RequestParam(value = "account",required = false)String account,
                              @RequestParam(value = "conId",required = false)Integer conId){
        System.out.println("record/update");
        Record record = new Record(id, eId, name, idCard, gender, state, deptId, department, jobTitle,
                new Date(entryTime), bank, account, conId);
        try {
            recordService.update(record);
            return RespMessage.SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return RespMessage.fail("error");
        }

    }
}
