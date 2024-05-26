package com.example.springmybatis.controller;

import com.example.springmybatis.pojo.User;
import com.example.springmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  UserService userService;

  @RequestMapping("findById")
  public User findById(Integer id) {
    return userService.findById(id);
  }
}
