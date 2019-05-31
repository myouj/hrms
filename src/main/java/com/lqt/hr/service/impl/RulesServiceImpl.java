package com.lqt.hr.service.impl;

import com.lqt.hr.dao.RulesMapper;
import com.lqt.hr.model.Rules;
import com.lqt.hr.model.RulesExample;
import com.lqt.hr.service.IRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RulesServiceImpl implements IRulesService {

    @Autowired
    private RulesMapper rulesMapper;

    public List<Rules> getList() {
        RulesExample rulesExample = new RulesExample();
        rulesExample.setOrderByClause("time desc");
        return rulesMapper.selectByExample(rulesExample);
    }

    public int insert(Rules rules) {
        rulesMapper.insert(rules);

        return getId(rules);
    }

    public int getId(Rules rules){
        RulesExample rulesExample = new RulesExample();
        rulesExample.createCriteria().andTitleEqualTo(rules.getTitle())
                .andItemEqualTo(rules.getItem()).andTypeEqualTo(rules.getType())
                .andPublisherEqualTo(rules.getPublisher());
        List<Rules> list = rulesMapper.selectByExample(rulesExample);
        return list.get(0).getId();
    }

    public void delete(Integer id) {
        rulesMapper.deleteByPrimaryKey(id);

    }
}
