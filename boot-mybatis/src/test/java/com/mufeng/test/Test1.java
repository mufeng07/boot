package com.mufeng.test;

import com.mufeng.mybatis.StartBootMybatisApplication;
import com.mufeng.mybatis.bean.Student;
import com.mufeng.mybatis.service.ITestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @description: TODO
 * @author: mufeng
 * @create: 2020/3/17 16:36
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartBootMybatisApplication.class)
public class Test1 {
    @Autowired
    private ITestService testService;
    @Test
    public void test1(){
        Student student=new Student();
        student.setSno("112");
        student.setSname("小明");
        student.setSsex("男");
        student.setSclass("95032");
        student.setSbirthday(new Date());
        testService.saveUser(student);
    }
}
