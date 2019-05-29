package com.lqt.hr.controller;

import com.lqt.hr.common.utils.RespMessage;
import com.lqt.hr.model.Record;
import com.lqt.hr.service.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        List<Record> records = recordService.getList();
        return RespMessage.success(records);
    }

    @GetMapping("record")
    public RespMessage getRecord(@RequestParam("id")Integer id){
        Record record = recordService.getRecord(id);
        return RespMessage.success(record);
    }

    @PostMapping("insert")
    public RespMessage insert(Record record){
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
        try {
            recordService.delete(id);
            return RespMessage.SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }

    @PostMapping("update")
    public RespMessage update(Record record){
        try {
            recordService.update(record);
            return RespMessage.SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return RespMessage.fail("error");
        }

    }
}
