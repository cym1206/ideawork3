package com.jk.service.impl;

import com.jk.mapper.UserMapper;
import com.jk.service.UserService;
import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUser() {
        return userMapper.findAll();
    }

    @Override
    public void addUser(User user) {
        userMapper.save(user);
    }

    @Override
    public void delUser(Integer[] ids) {
        User user = new User();
        for(int i=0;i<ids.length;i++ ){
            user.setId(ids[i]);
            userMapper.delete(user);
        }
    }

    @Override
    public User queryUserById(User user) {
        return userMapper.getOne(user.getId());
    }

}
