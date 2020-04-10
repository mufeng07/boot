package com.mufeng.test;

import com.mufeng.log4j.BaseLogger;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description: TODO
 * @author: mufeng
 * @create: 2020/4/7 10:26
 */
public class Test1 {
    Logger logger= LoggerFactory.getLogger(Test1.class);
    @Test
    public void test1(){
        BaseLogger.info("12{}","13");
    }
    @Test
    public void test2(){
        logger.info("12{}","13");
    }
}
