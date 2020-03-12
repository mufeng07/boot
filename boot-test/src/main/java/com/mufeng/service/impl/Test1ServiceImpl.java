package com.mufeng.service.impl;

import com.mufeng.service.ITest1Service;
import org.springframework.stereotype.Service;

/**
 * @description: TODO
 * @author: mufeng
 * @create: 2020/3/5 11:45
 */
@Service
public class Test1ServiceImpl implements ITest1Service {
    @Override
    public void hello(String name) {
        System.out.println("hello:"+name);
    }
}
