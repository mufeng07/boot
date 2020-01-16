package com.mufeng.test;

import com.mufeng.StartBootTestApplication;
import com.mufeng.config.ImportConfiguration;
import com.mufeng.config.TestPropertySource;
import com.mufeng.config.User1Properties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @description: TODO
 * @author: mufeng
 * @create: 2020/1/14 17:04
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartBootTestApplication.class)
public class TestImport {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ImportConfiguration.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("---------------------------------");
        for(String beanDefinition:beanDefinitionNames){
            System.out.println(beanDefinition);
        }
        System.out.println("------------------------------------");
    }
    @Autowired
    private  TestPropertySource testPropertySource;
    @Test
    public void test2(){
        System.out.println(testPropertySource.getUser());
    }
    @Resource
    private User1Properties user1Properties;
    @Test
    public void test3(){
        System.out.println(user1Properties);
    }
}
