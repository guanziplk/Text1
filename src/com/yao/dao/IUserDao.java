package com.yao.dao;

import com.yao.entity.User;

public interface IUserDao {
    User checkUser(String username, String password);
    Integer addUser(User user);
}