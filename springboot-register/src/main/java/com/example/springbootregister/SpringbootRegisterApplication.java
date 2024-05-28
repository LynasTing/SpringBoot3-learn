package com.example.springbootregister;

import cn.itcast.pojo.Country;
import com.example.anno.EnableCommonConfig;
import com.example.config.CommonConfig;
import com.example.config.CommonImportSelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
// @Import(CommonConfig.class)
// @Import(CommonImportSelector.class)
@EnableCommonConfig
public class SpringbootRegisterApplication {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(SpringbootRegisterApplication.class, args);
    // Country country = context.getBean(Country.class);
    // System.out.println(country);

    System.out.println(context.getBean("customerName"));
  }

  // 注入Country,将方法返回值交给IOC容器管理，成为IOC容器的bean对象
  // 启动类,不建议使用
  // @Bean
  // public Country country() {
  //   return new Country();
  // }

}

