package com.example.demo.test.tryCarch;

/**
 * Project Name:SpringBootTest
 * File Name:TryCatchTest
 * Package Name:com.example.demo.test.tryCarch
 * Date:2018/8/8
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class TryCatchTest {

    public static int tryTest(int a){
        try{
            a = a/0;
        }catch (Exception e){
            return ++a;
        }finally {
            System.out.println(a);
        }
        return 0;
    }

    public static void main(String[] args){
        System.out.println(tryTest(5));
    }

    /**
     *  （1）  当java程序执行try、catch块遇到return语句，会先执行return语句，执行return之后，不会立即返回结束方法，
     * 而是去寻找该异常处理流程中是否包含finally语句块，如果没有，方法终止，返回相应值；如果存在，系统立即执行finally
     * 块，如果finally块中没有return语句，系统才会再次调回前面的return语句结束方法；如果finally中有return语句，则会
     * 直接结束方法，不会再跳回去执行
     * （2）   对于throw new RuntimeException()，在catch中执行throw语句时并不会立即抛出异常，而是立即去寻找是否有
     * finally块；如果没有就立即抛出，如果有就先执行finally语句块，如果finally中没有return，则会跳转回来执行throw，
     * 否则finally直接return，结束方法。
     */
}
