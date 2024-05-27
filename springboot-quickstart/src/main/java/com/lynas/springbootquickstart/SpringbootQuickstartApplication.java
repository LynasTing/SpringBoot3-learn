package com.lynas.springbootquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 启动类
// SpringBootApplication 默认只能扫描到启动类所在的包及其子包。
@SpringBootApplication
public class SpringbootQuickstartApplication {
  public static void main(String[] args) {
    SpringApplication.run(SpringbootQuickstartApplication.class, args);
  }
}
