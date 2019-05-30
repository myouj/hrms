package com.lqt.hr.service.impl;

import com.lqt.hr.dao.RecordMapper;
import com.lqt.hr.model.Record;
import com.lqt.hr.model.RecordExample;
import com.lqt.hr.service.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements IRecordService {

    @Autowired
    private RecordMapper recordMapper;

    public List<Record> getList() {
        RecordExample recordExample = new RecordExample();

        return recordMapper.selectByExample(recordExample);
    }

    public Record getRecord(Integer id) {
        return recordMapper.selectByPrimaryKey(id);
    }

    public List<Record> getRecordsByName(String name) {
        RecordExample recordExample = new RecordExample();
        recordExample.createCriteria().andNameLike("%" + name + "%");
        List<Record> records = recordMapper.selectByExample(recordExample);
        return records;
    }

    public int insert(Record record) {
        recordMapper.insert(record);
        return getId(record);
    }

    public int getId(Record record){
        RecordExample recordExample = new RecordExample();
        recordExample.createCriteria().andEIdEqualTo(record.geteId());
        List<Record> records = recordMapper.selectByExample(recordExample);
        return records.get(0).getId();
    }

    public void delete(Integer id) {
        recordMapper.deleteByPrimaryKey(id);

    }

    public void update(Record record) {
        recordMapper.updateByPrimaryKeySelective(record);

    }
}
