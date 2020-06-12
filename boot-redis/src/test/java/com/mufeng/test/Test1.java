package com.mufeng.test;

import com.mufeng.redis.StartRedisApplication;
import com.mufeng.redis.bean.Student;
import com.mufeng.redis.service.IStudentService;
import com.mufeng.redis.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description:
 * @author: mufeng
 * @create: 2020/5/26 16:13
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartRedisApplication.class)
public class Test1 {
    @Autowired
    private IStudentService studentService;

    @Test
    public void test1(){
        RedisUtil redisUtil=new RedisUtil();
        //redisUtil.set("kk","jk");
        System.out.println(redisUtil.get("kk"));
    }
    @Test
    public void test2(){
        Student student=studentService.findStudentBySno("112");
        System.out.println(student);
        Student student1=studentService.findStudentBySno("112");
        System.out.println(student1);
    }
}
