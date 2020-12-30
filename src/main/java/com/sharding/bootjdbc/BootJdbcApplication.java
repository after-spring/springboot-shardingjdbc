package com.sharding.bootjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.sharding.bootjdbc.mapper")
public class BootJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootJdbcApplication.class, args);
    }

}
