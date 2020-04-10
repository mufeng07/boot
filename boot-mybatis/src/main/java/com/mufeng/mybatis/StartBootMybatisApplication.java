package com.mufeng.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @description: TODO
 * @author: mufeng
 * @create: 2020/3/17 16:24
 */
//@EnableDiscoveryClient
@EnableTransactionManagement
@EnableAsync
@SpringBootApplication
@MapperScan("com.mufeng.mybatis.dao")
public class StartBootMybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartBootMybatisApplication.class,args);
    }
}
