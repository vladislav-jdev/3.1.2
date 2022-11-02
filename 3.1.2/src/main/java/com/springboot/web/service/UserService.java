package com.springboot.web.service;

import com.springboot.web.model.User;

import java.util.List;

public interface UserService {

    User saveOrUpdate(User user);

    List<User> getAllUsers();

    User getUser(Long id);

    void deleteUser(Long id);
}
