package com.kindnit.service.Impl;

import com.kindnit.dao.UserMapper;
import com.kindnit.pojo.User;
import com.kindnit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public User checkUser(String username) {
        User user = userMapper.getUserByName(username);
        return user;
    }
}
