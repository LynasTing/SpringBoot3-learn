package com.example.anno;

import com.example.config.CommonImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 当前的注解可以在类上使用
@Target(ElementType.TYPE)

// 会保留在运行时阶段
@Retention(RetentionPolicy.RUNTIME)

@Import(CommonImportSelector.class)
public @interface EnableCommonConfig {
}
