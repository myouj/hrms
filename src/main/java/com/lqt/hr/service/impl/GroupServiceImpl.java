package com.lqt.hr.service.impl;

import com.lqt.hr.dao.GroupMapper;
import com.lqt.hr.model.Group;
import com.lqt.hr.model.GroupExample;
import com.lqt.hr.service.IGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements IGroupService {

    @Autowired
    private GroupMapper groupMapper;

    public List<Group> getGroups() {
        GroupExample groupExample = new GroupExample();
        return groupMapper.selectByExample(groupExample);
    }

    public Group getGroup(Integer id) {
        return groupMapper.selectByPrimaryKey(id);
    }
}
