package com.example.class6_sql_input.service.impl;

import com.example.class6_sql_input.entity.User;
import com.example.class6_sql_input.mapper.UserMapper;
import com.example.class6_sql_input.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements UserService {
    @Autowired
    private UserMapper usermapper;
    @Override
    public void addUser(User user) {
        usermapper.addUser(user);
    }
}