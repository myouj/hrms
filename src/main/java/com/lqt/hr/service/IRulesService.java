package com.lqt.hr.service;


import com.lqt.hr.model.Rules;

import java.util.List;

public interface IRulesService {

    List<Rules> getList();

    int insert(Rules rule);

    void delete(Integer id);
}
