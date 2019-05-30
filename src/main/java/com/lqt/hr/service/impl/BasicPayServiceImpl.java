package com.lqt.hr.service.impl;

import com.lqt.hr.dao.BasicPayMapper;
import com.lqt.hr.model.BasicPay;
import com.lqt.hr.model.BasicPayExample;
import com.lqt.hr.service.IBasicPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicPayServiceImpl implements IBasicPayService {

    @Autowired
    private BasicPayMapper basicPayMapper;


    public List<BasicPay> getList() {
        BasicPayExample basicPayExample = new BasicPayExample();
        List<BasicPay> basicPays = basicPayMapper.selectByExample(basicPayExample);
        return basicPays;
    }

    public BasicPay getById(Integer id) {
        BasicPay basicPay = basicPayMapper.selectByPrimaryKey(id);
        return basicPay;
    }

    public int insert(BasicPay basicPay) {
        basicPayMapper.insert(basicPay);
        return getId(basicPay);

    }


    public int getId(BasicPay basicPay){
        BasicPayExample basicPayExample = new BasicPayExample();
        basicPayExample.createCriteria().andEIdEqualTo(basicPay.geteId()).andENameEqualTo(basicPay.geteName());
        List<BasicPay> basicPays = basicPayMapper.selectByExample(basicPayExample);
        return basicPays.get(0).getId();
    }

    public void update(BasicPay basicPay) {
        basicPayMapper.updateByPrimaryKeySelective(basicPay);

    }

    public void delete(Integer id) {
        basicPayMapper.deleteByPrimaryKey(id);

    }
}
