package com.mufeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @description: springboot启动类
 * @author: mufeng
 * @create: 2019/12/31 16:13
 */
@SpringBootApplication
@EnableAsync
public class StartBootTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplication.class,args);
    }
}
