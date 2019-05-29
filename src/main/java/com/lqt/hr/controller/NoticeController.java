package com.lqt.hr.controller;

import com.lqt.hr.common.utils.RespMessage;
import com.lqt.hr.model.Notice;
import com.lqt.hr.service.INoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("notice")
public class NoticeController {

    @Autowired
    private INoticeService noticeService;

    @GetMapping("notices")
    public RespMessage getList(){
        System.out.println("notice/notices");
        List<Notice> notices = noticeService.getList();
        return RespMessage.success(notices);
    }

    @GetMapping("insert")
    public RespMessage insert(@RequestParam(value = "title")String title,
                              @RequestParam(value = "content")String content,
                              @RequestParam(value = "publisher")String publisher){
        System.out.println("notice/insert");
        Notice notice = new Notice(null, title, content, publisher, null);
        try {
            int id = noticeService.insert(notice);
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
        System.out.println("notice/delete");
        try {
            noticeService.delete(id);
            return RespMessage.SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }
}
