package com.example.bin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Lu
 * @date 2018-05-11 16:05:14
 */
@SpringBootApplication
@MapperScan("com.example.bin.mapper")
public class BinApplication {
    public static void main(String[] args) {
        SpringApplication.run(BinApplication.class, args);
    }
}
