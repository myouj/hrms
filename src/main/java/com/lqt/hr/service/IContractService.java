package com.lqt.hr.service;

import com.lqt.hr.model.Contract;

import java.util.List;

public interface IContractService {

    List<Contract> getList();

    int insert(Contract contract);

    void update(Contract contract);

    void delete(Integer id);
}
