package com.lynas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloManual {
  @RequestMapping("/hello")
  public String hello() {
    return "Hello, manual";
  }
}
