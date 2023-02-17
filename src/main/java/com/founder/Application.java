package com.founder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
* 用来修饰类。标识这个类是一个springboot项目入口类。只能出现一次，并且只能加载入口类中
* */
@SpringBootApplication
@MapperScan("com.founder.dao")
public class Application {

    public static void main(String[] args) {
        //参数一：入口类对象  二：main的参数
        SpringApplication.run(Application.class,args);
    }
}
