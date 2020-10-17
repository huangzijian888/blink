package com.lamdaer.blink;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lamdaer
 */
@SpringBootApplication
@MapperScan(basePackages = "com.lamdaer.blink.mapper")
public class BlinkApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(BlinkApplication.class, args);
    }
    
}
