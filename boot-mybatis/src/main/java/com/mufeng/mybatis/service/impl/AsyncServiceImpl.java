package com.mufeng.mybatis.service.impl;

import com.mufeng.mybatis.bean.Student;
import com.mufeng.mybatis.service.IAsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @description: TODO
 * @author: mufeng
 * @create: 2020/3/17 16:39
 */
@Service
public class AsyncServiceImpl implements IAsyncService {
    @Async("executor")
    @Override
    public void test(Student student) {
        System.out.println(1/0);
    }
}
