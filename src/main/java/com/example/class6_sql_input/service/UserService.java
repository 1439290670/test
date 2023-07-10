package com.example.class6_sql_input.service;

import com.example.class6_sql_input.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
    @Repository
    public interface UserService {
        void addUser(User user);
    }