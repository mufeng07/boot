package com.mufeng.redis.service;

import com.mufeng.redis.bean.Student;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

/**
 * @description:
 * @author: mufeng
 * @create: 2020/6/12 15:06
 */
@CacheConfig(cacheNames = "student")
public interface IStudentService {
    @Cacheable(key = "#p0")
    Student findStudentBySno(String s);
}
