package com.kaisagroup.boot.service;

import com.kaisagroup.boot.entity.User;

import java.util.List;


public interface IUserService {

    String insert(User user);

    List<User> getList();
}
