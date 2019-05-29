package com.lqt.hr.service;

import com.lqt.hr.model.Notice;

import java.util.List;

public interface INoticeService {

    List<Notice> getList();

    int insert(Notice notice);

    void delete(Integer id);

}
