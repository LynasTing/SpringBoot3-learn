package com.example.springmybatis.service.impl;

import com.example.springmybatis.mapper.UserMapper;
import com.example.springmybatis.pojo.User;
import com.example.springmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper userMapper;

  @Override
  public User findById(Integer id) {
    return userMapper.findById(id);
  }
}
