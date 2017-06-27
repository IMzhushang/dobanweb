package com.doban.service;

import com.doban.domain.User;
import com.doban.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/6/9.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    public User findUserById(int id) {
        return  userMapper.findUserById(id);
    }

    public void insetUser(User u) {
         userMapper.insertUser(u);
    }


}
