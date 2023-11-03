package com.example.my_simple_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.example.my_simple_web.mapper")
public class MySimpleWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySimpleWebApplication.class, args);
    }

}
