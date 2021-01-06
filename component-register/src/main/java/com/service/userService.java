package com.service;

import com.dao.UserMapper;
import com.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class userService {
    UserMapper userMapper;
    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
