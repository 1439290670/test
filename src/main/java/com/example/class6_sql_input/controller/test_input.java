package com.example.class6_sql_input.controller;

import com.example.class6_sql_input.entity.User;
import com.example.class6_sql_input.mapper.UserMapper;
import com.example.class6_sql_input.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/project")
@RestController
public class test_input {
    @Autowired
     UserService userService;
    @PostMapping ("/addUser")
    public String add1(User user) {
        userService.addUser(user);
        return "ok";
    }
}
