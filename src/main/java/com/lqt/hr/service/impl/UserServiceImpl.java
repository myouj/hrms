package com.lqt.hr.service.impl;

import com.lqt.hr.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public int insert(User user) {

        return userMapper.insert(user);
    }

    public int delete(Integer id) {

        return userMapper.deleteByPrimaryKey(id);
    }

    public int update(User user) {

        return userMapper.updateByPrimaryKeySelective(user);
    }

    public User select(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public List<User> selectList() {
        UserExample userExample = new UserExample();
//        UserExample.Criteria criteria = userExample.createCriteria();
        return userMapper.selectByExample(userExample);
    }


}
