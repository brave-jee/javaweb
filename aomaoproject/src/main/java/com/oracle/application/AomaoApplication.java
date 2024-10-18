package com.oracle.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan(value = "com.oracle.application.mapper")
public class AomaoApplication {
    public static void main(String[] args) {
        SpringApplication.run(AomaoApplication.class,args);
    }
}
