package com.kaisagroup.boot.dao;

import com.kaisagroup.boot.entity.User;

import java.util.List;


public interface IUserDao {

    int insert(User user);

    List<User> queryList();
}
