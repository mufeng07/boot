package com.mufeng.test;

import org.junit.Test;
import org.springframework.boot.SpringBootExceptionReporter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @description: TODO
 * @author: mufeng
 * @create: 2020/1/7 9:57
 */
public class Test1 {
    @Test
    public void test1(){
        Collection<SpringBootExceptionReporter> exceptionReporters = new ArrayList();
       // Collection exceptionReporters;
        System.out.println(1);
        float f1=10282.20f;
        float f2=9851.75f;
        float f3=5508.50f;
        float f4=2574.71f;
        float f5=8410.03f;
        float f6=13913.71f;
        float f7=13913.72f;
        float f8=13911.86f;
        float f9=13613.00f;
        float f10=13268.74f;
        float f11=13268.73f;
        float f12=13845.50f;
        float sum=f1+f2+f3+f4+f5+f6+f7+f8+f9+f10+f11+f12;
        System.out.println(sum);
        System.out.println(f10*13);
        System.out.println(18000*13);
        System.out.println(25000*13);
        System.out.println(30000*13);
        System.out.println(500000/13);
        System.out.println(38461*13);
    }
    @Test
    public void test2(){
        List<String> list=new ArrayList<>();
        System.out.println(list==null);
        list.add("12");
        list.add("10");
        list.add("13");
        list.add("11");
        list.sort((c1,c2)->{
            return c1.compareTo(c2);
        });
        System.out.println(list);

    }
    @Test
    public void test3(){
        System.out.println("12"+null+null);
        System.out.println("12"+"null"+null);
        String a=null;
        String b=null;
        System.out.println(a==b);
    }
    @Test
    public void test4(){
        whi();
        System.out.println(1234);
    }
    public void whi(){
        while (true){
            while (true){
                System.out.println(12);
                return;
            }
        }
    }
}
