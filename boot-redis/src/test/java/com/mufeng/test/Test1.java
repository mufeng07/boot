package com.mufeng.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @description:
 * @author: mufeng
 * @create: 2020/5/26 16:13
 */
public class Test1 {

    @Test
    public void test1(){
        Jedis jedis=new Jedis();
        jedis.publish("","");
    }
}
