package com.example.class6_sql_input.mapper;

import com.example.class6_sql_input.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Mapper
public interface UserMapper {
    @Insert("insert into demo.user values (#{UserEmail}, #{UserName}, #{UserPwd})")
    void addUser(User user);
}