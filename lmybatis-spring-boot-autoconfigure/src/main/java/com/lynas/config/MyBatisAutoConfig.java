package com.lynas.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.List;

@AutoConfiguration // 表示这是一个自动配置类
public class MyBatisAutoConfig {

  @Bean
  public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
    SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
    ssfb.setDataSource(dataSource);
    return ssfb;
  }

  @Bean
  public MapperScannerConfigurer mapperScannerConfigurer(BeanFactory beanFactory) {
    MapperScannerConfigurer msc = new MapperScannerConfigurer();
    // 扫描启动类所在的包及其子包
    List<String> strings = AutoConfigurationPackages.get(beanFactory);
    String p = strings.get(0);
    msc.setBasePackage(p);

    // 扫描注解
    msc.setAnnotationClass(Mapper.class);
    return msc;
  }
}
