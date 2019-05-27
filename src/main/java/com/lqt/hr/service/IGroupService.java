package com.lqt.hr.service;

import com.lqt.hr.model.Group;

import java.util.List;

public interface IGroupService {

    List<Group> getGroups();

    Group getGroup(Integer id);

}
