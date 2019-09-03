package com.liulangyu.shop.dao;

import com.liulangyu.shop.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface UserDao {

    User selectUserById(Map<String,Object> map);

}
