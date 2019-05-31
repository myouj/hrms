package com.lqt.hr.service.impl;

import com.lqt.hr.dao.NoticeMapper;
import com.lqt.hr.model.Notice;
import com.lqt.hr.model.NoticeExample;
import com.lqt.hr.service.INoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements INoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    public List<Notice> getList() {
        NoticeExample noticeExample = new NoticeExample();
        noticeExample.setOrderByClause("time desc");
        return noticeMapper.selectByExample(noticeExample);
    }

    public int insert(Notice notice) {
        noticeMapper.insert(notice);

        return getId();
    }

    public int getId() {
        NoticeExample noticeExample = new NoticeExample();
        noticeExample.setOrderByClause("`time` desc");
        List<Notice> notices = noticeMapper.selectByExample(noticeExample);
        return notices.get(0).getId();
    }

    public void delete(Integer id) {
        noticeMapper.deleteByPrimaryKey(id);
    }
}
