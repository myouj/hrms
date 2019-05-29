package com.lqt.hr.service.impl;

import com.lqt.hr.dao.UserMapper;
import com.lqt.hr.model.User;
import com.lqt.hr.model.UserExample;
import com.lqt.hr.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public int insert(User user) {
        userMapper.insert(user);

        return getUserId(user);
    }

    public int getUserId(User user){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andNameEqualTo(user.getName()).andPasswordEqualTo(user.getPassword());
        List<User> users = userMapper.selectByExample(userExample);
        return users.get(0).getId();
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

    public List<User> selectListByName(String name) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria().andNameLike("%" + name + "%");
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }
}
