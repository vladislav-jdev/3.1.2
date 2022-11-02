package com.springboot.web.dao;

import com.springboot.web.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> { }







