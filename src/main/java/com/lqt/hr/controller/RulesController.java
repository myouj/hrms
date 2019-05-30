package com.lqt.hr.controller;

import com.lqt.hr.common.utils.RespMessage;
import com.lqt.hr.model.Rules;
import com.lqt.hr.service.IRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("rules")
public class RulesController {

    @Autowired
    private IRulesService rulesService;

    @GetMapping("rules")
    public RespMessage getList(){
        System.out.println("rules/rules");
        List<Rules> rules = rulesService.getList();
        return RespMessage.success(rules);
    }


    @GetMapping("insert")
    public RespMessage insert(@RequestParam("title")String title,
                              @RequestParam("item")String item,
                              @RequestParam("type")String type,
                              @RequestParam("publisher")String publisher){
        System.out.println("rules/insert");

        Rules rules = new Rules(null, title, item, type, publisher, null);

        try {
            int id = rulesService.insert(rules);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id", id);
            return RespMessage.success(map);
        }catch (Exception e) {
            e.printStackTrace();
            return RespMessage.fail("error");
        }

    }

    @GetMapping("delete")
    public RespMessage delete(@RequestParam("id")Integer id){
        System.out.println("rules/delete");
        try {
            rulesService.delete(id);
            return RespMessage.SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }
}
