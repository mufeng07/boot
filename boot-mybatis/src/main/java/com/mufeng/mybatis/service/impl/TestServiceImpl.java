package com.mufeng.mybatis.service.impl;

import com.mufeng.mybatis.bean.Student;
import com.mufeng.mybatis.dao.IStudentMapper;
import com.mufeng.mybatis.service.IAsyncService;
import com.mufeng.mybatis.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @description: TODO
 * @author: mufeng
 * @create: 2020/3/17 16:30
 */
@Service
public class TestServiceImpl implements ITestService {
    @Resource
    private IStudentMapper studentMapper;
    @Autowired
    private IAsyncService asyncService;
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveUser(Student student) {
        studentMapper.insert(student);
        asyncService.test(student);
    }
}
