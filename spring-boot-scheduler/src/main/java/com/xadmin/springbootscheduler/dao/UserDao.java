package com.xadmin.springbootscheduler.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xadmin.springbootscheduler.model.User;

public interface UserDao  extends JpaRepository<User, Integer>{

}
