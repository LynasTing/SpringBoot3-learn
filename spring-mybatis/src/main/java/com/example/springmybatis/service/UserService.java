package com.example.springmybatis.service;

import com.example.springmybatis.pojo.User;

public interface UserService {
  public User findById(Integer id);
}