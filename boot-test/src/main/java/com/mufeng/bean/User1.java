package com.mufeng.bean;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @description: TODO
 * @author: mufeng
 * @create: 2020/1/21 11:28
 */
public class User1 implements BeanNameAware {
    private String id;
    private String name;
    private int age;
    @Override
    public void setBeanName(String s) {
        id=s;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
        return "User1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
