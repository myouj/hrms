package com.lqt.hr.service.impl;

import com.lqt.hr.dao.ContractMapper;
import com.lqt.hr.model.Contract;
import com.lqt.hr.model.ContractExample;
import com.lqt.hr.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements IContractService {

    @Autowired
    private ContractMapper contractMapper;

    public List<Contract> getList() {
        ContractExample contractExample = new ContractExample();

        return contractMapper.selectByExample(contractExample);
    }

    public List<Contract> getByName(String name) {
        ContractExample contractExample = new ContractExample();
        contractExample.createCriteria().andNameLike("%" + name + "%");

        return contractMapper.selectByExample(contractExample);
    }

    public int insert(Contract contract) {
        contractMapper.insert(contract);
        return getId(contract);
    }

    public int getId(Contract contract){
        ContractExample contractExample = new ContractExample();
        contractExample.createCriteria().andIdCardEqualTo(contract.getIdCard()).andTimeEqualTo(contract.getTime());
        List<Contract> contracts = contractMapper.selectByExample(contractExample);
        return contracts.get(0).getId();
    }

    public void update(Contract contract) {
        contractMapper.updateByPrimaryKeySelective(contract);
    }

    public void delete(Integer id) {
        contractMapper.deleteByPrimaryKey(id);

    }
}
