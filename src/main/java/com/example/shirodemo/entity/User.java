package com.example.shirodemo.entity;

import lombok.Data;

/**
 * 用户实体类
 */
@Data
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private UserSexEnum userSex;
    private String nickName;
}
