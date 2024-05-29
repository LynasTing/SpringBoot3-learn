package com.example.autoconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutoConfigApplication {

  /**
   * springboot自配配置原理
   * 1. 在主启动类上添加 @SpringBootApplication 注解
   * 2. @SpringBootApplication 组合了 @EnableAutoConfiguration(自动配置) 注解
   * 3. @EnableAutoConfiguration 组合了 @Import 注解, @Import 导入了 AutoConfigurationImportSelector 类
   * 4. AutoConfigurationImportSelector 实现了 selectImports 方法
   * 5. selectImports 经过层层调用，最终读取到META-INF目录下的.imports文件(springboot2.7以前的版本读取spring.factories文件)
   * 6. .imports文件或.factories文件 配置了需要自动配置的Bean的全类名
   * 7. 读取到这些全类名后，会解析注册条件(@Conditional 及其衍生注解)
   * 8. 把满足条件的Bean对象自动注入到IOC容器中
   */

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(AutoConfigApplication.class, args);
    System.out.println(context.getBean("province"));
    System.out.println(context.getBean("dispatcherServlet"));
  }

}
