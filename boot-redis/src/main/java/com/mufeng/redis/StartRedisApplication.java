package com.mufeng.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @description:
 * @author: mufeng
 * @create: 2020/6/12 14:57
 */
@EnableCaching
@SpringBootApplication
@Slf4j
@MapperScan("com.mufeng.redis.mapper")
public class StartRedisApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartRedisApplication.class,args);
        log.info("boot-redis start success....");
    }
}
