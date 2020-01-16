package com.mufeng.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @description: TODO
 * @author: mufeng
 * @create: 2020/1/16 14:11
 */
@Component
@PropertySource(value = {"classpath:/user1.properties"})
@ConfigurationProperties(prefix = "user1")
public class User1Properties {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User1Properties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
