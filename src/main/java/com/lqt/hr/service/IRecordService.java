package com.lqt.hr.service;

import com.lqt.hr.model.Record;

import java.util.List;

public interface IRecordService {

    List<Record> getList();

    Record getRecord(Integer id);

    int insert(Record record);

    void delete(Integer id);

    void update(Record record);
}
