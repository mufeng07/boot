package com.mufeng.service.impl;

import com.mufeng.service.ITestService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @description: TODO
 * @author: mufeng
 * @create: 2020/1/20 16:24
 */
@Service
public class TestServiceImpl implements ITestService {
    @Async("executor")
    @Override
    public void testAsync(String name) {
        int i=2;
        int a=i/0;
        System.out.println(a);
        System.out.println("testAsync:"+name);
    }

}
