package com.mufeng.redis.service.impl;

import com.mufeng.redis.bean.Student;
import com.mufeng.redis.mapper.IStudentMapper;
import com.mufeng.redis.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: mufeng
 * @create: 2020/6/12 15:06
 */
@Service
public class StudentServiceImpl implements IStudentService {
    @Resource
    private IStudentMapper studentMapper;
    @Override
    public Student findStudentBySno(String sno){
        return studentMapper.selectByPrimaryKey(sno);
    }
}
