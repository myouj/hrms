package com.lqt.hr.service;

import com.lqt.hr.model.BasicPay;

import java.util.List;

public interface IBasicPayService {

    List<BasicPay> getList();

    BasicPay getById(Integer id);

    int insert(BasicPay basicPay);

    void update(BasicPay basicPay);

    void delete(Integer id);
}
