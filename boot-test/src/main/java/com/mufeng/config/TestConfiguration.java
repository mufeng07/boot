package com.mufeng.config;

import com.mufeng.bean.User;
import com.mufeng.bean.User1;
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
        User user = new User();
        user.setName("zhangsan");
        user.setAge(23);
        return user;
    }
    @Bean
    public User1 user1(){
        User1 user1=new User1();
        user1.setName("lisi");
        user1.setAge(24);
        return user1;
    }
}
