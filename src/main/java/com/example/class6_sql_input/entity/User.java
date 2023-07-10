package com.example.class6_sql_input.entity;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String UserEmail;
    private String UserName;
    private String UserPwd;
}