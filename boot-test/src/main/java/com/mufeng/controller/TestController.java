package com.mufeng.controller;

import com.mufeng.service.ITest1Service;
import com.mufeng.service.ITestService;
import com.mufeng.service.impl.Test1ServiceImpl;
import com.mufeng.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: TODO
 * @author: mufeng
 * @create: 2020/1/20 16:14
 */
@RestController
@RequestMapping("/test")
public class TestController {
   @Autowired
    private ITestService testService;
   @Autowired
   private ITest1Service test1Service;
   @Autowired
   private Test1ServiceImpl test1ServiceImpl;
   //@Autowired
   //private TestServiceImpl testServiceImpl;
   @RequestMapping("/test1")
   public void test1(String name){
       System.out.println("TestController test1 start...");
       test1Service.hello(name);
       testService.testAsync(name);
       System.out.println("TestController test1 end...");
   }
}
