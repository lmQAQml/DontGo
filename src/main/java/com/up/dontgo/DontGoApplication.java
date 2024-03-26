package com.up.dontgo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.up.dontgo.mapper")
public class DontGoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DontGoApplication.class, args);
    }

}
