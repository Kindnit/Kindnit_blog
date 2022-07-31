package com.kindnit.service;

import com.kindnit.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    //登录
    User checkUser(String username);
}
