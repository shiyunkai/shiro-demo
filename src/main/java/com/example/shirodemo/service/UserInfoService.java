package com.example.shirodemo.service;

import com.example.shirodemo.entity.UserInfo;

public interface UserInfoService {

    UserInfo findByUsername(String username);
}
