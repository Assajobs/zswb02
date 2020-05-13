package com.example.zswb02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.zswb02.dao")
public class Zswb02Application {

    public static void main(String[] args) {
        SpringApplication.run(Zswb02Application.class, args);
    }

}
