package com.alan.service;

import com.alan.domain.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    User findById(Integer userId);

    void updateUser(User user);
}
