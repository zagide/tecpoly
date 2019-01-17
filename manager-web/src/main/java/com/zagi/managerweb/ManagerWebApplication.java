package com.zagi.managerweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.zagi.managerweb.mapper")
@SpringBootApplication
public class ManagerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagerWebApplication.class, args);
    }
}
