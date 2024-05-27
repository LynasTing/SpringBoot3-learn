package com.example.config;

import cn.itcast.pojo.Country;
import cn.itcast.pojo.Province;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfig {
  // 对象默认的名字是： 方法名
  @Bean
  public Country country() {
    return new Country();
  }

  // 可以改默认名字
  // 如果方法内部需要使用到IOC容器中已存在的的bean对象，只需要在方法上声明即可，spring会自动注入
  @Bean("customerName")
  public Province province(Country country) {
    System.out.println("province:::" + country);
    return new Province();
  }
}
