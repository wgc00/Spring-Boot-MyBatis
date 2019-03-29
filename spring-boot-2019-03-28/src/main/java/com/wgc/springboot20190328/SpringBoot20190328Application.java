package com.wgc.springboot20190328;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.wgc.springboot20190328.dao")
public class SpringBoot20190328Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot20190328Application.class, args);
    }

}
