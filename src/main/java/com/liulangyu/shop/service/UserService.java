package com.liulangyu.shop.service;

import com.liulangyu.shop.entity.User;

import java.util.Map;

public interface UserService {

    User selectUserById(Map<String, Object> map);

}
