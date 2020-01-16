package com.mufeng.config;

import com.mufeng.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO
 * @author: mufeng
 * @create: 2020/1/7 20:02
 */
@Configuration
public class TestConfiguration {
    @Bean
    public User user(){
        return new User();
    }
}
