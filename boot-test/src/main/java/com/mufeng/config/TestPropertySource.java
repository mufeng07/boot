package com.mufeng.config;

import com.mufeng.bean.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @description: TODO
 * @author: mufeng
 * @create: 2020/1/16 13:54
 */
@PropertySource(value = {"classpath:/user1.properties"})
@Component
public class TestPropertySource {
    @Value("${user1.name}")
    private String name;
    @Value("${user1.age}")
    private int age;

    public User getUser(){
        User user=new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }
}
