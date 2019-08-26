package com.tx.springboot.service;

import com.tx.springboot.entity.User;
import com.tx.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private UserMapper userMapper;

    public User sel(int id) {
        return userMapper.sel(id);
    }

    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

}
