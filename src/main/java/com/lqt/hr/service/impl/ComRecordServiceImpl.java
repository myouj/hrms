package com.lqt.hr.service.impl;

import com.lqt.hr.dao.ComRecordMapper;
import com.lqt.hr.model.ComRecord;
import com.lqt.hr.model.ComRecordExample;
import com.lqt.hr.service.IComRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComRecordServiceImpl implements IComRecordService {

    @Autowired
    private ComRecordMapper comRecordMapper;

    public List<ComRecord> getList() {
        ComRecordExample comRecordExample = new ComRecordExample();
        List<ComRecord> comRecords = comRecordMapper.selectByExample(comRecordExample);
        return comRecords;
    }

    public ComRecord getById(Integer id) {
        ComRecord comRecord = comRecordMapper.selectByPrimaryKey(id);
        return comRecord;
    }

    public void insert(ComRecord comRecord) {
        comRecordMapper.insert(comRecord);

    }

    public void update(ComRecord comRecord) {
        comRecordMapper.updateByPrimaryKeySelective(comRecord);

    }

    public void delete(Integer id) {
        comRecordMapper.deleteByPrimaryKey(id);

    }
}
