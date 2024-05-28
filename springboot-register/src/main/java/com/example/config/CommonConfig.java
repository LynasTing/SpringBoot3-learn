package com.example.config;

import cn.itcast.pojo.Country;
import cn.itcast.pojo.Province;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfig {
  // 对象默认的名字是： 方法名
  @Bean
  // 如果配置文件中配置了指定的信息才注入
  @ConditionalOnProperty(prefix = "country", name = {"name", "system"})
  public Country country(@Value("${country.name}") String name, @Value("${country.system}") String system) {
    Country country = new Country();
    country.setName(name);
    country.setSystem(system);
    return country;
  }

  // 可以改默认名字
  // 如果方法内部需要使用到IOC容器中已存在的的bean对象，只需要在方法上声明即可，spring会自动注入
  @Bean("customerName")
  // 如果传入Bean没有被注入，那么声明Bean就会成功注入，否则不再注入声明Bean
  // @ConditionalOnMissingBean

  // 当前环境存在传入类，才会注入声明Bean
  @ConditionalOnClass(name = "org.springframework.web.servlet.DispatcherServlet")
  public Province province() {
    return new Province();
  }
}
