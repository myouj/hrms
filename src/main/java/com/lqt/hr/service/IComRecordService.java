package com.lqt.hr.service;

import com.lqt.hr.model.ComRecord;

import java.util.List;

public interface IComRecordService {

    List<ComRecord> getList();

    ComRecord getById(Integer id);

    void insert(ComRecord comRecord);

    void update(ComRecord comRecord);

    void delete(Integer id);

}
