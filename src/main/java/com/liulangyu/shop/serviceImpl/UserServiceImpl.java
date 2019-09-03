package com.liulangyu.shop.serviceImpl;

import com.liulangyu.shop.dao.UserDao;
import com.liulangyu.shop.entity.User;
import com.liulangyu.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public User selectUserById(Map<String, Object> map) {
        return userDao.selectUserById(map);
    }
}
