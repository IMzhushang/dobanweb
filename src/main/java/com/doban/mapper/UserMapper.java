package com.doban.mapper;

import com.doban.domain.User;

/**
 * Created by Administrator on 2017/6/9.
 */
public interface UserMapper {
    User findUserById(int id);
    void insertUser(User u);
}
