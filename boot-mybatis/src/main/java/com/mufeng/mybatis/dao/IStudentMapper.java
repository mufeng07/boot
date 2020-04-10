package com.mufeng.mybatis.dao;

import com.mufeng.mybatis.bean.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * @description: TODO
 * @author: mufeng
 * @create: 2020/3/17 16:48
 */
public interface IStudentMapper extends Mapper<Student> {

}
