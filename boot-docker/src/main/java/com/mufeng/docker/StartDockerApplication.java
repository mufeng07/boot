package com.mufeng.docker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: mufeng
 * @create: 2020/6/9 10:59
 */
@SpringBootApplication
@Slf4j
public class StartDockerApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartDockerApplication.class,args);
        log.info("boot-docker start success...");
    }
}
