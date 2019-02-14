package com.example.demo.test.staticPackge.staticInnerClass;

/**
 * Project Name:SpringBootTest
 * File Name:MainTest
 * Package Name:com.example.demo.test.staticPackge.staticInnerClass
 * Date:2019/2/14
 * Author:liujie
 * Description:
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */
public class MainTest {

    public static void main(String[] args) {
        StaticInnerClassDemo test = StaticInnerClassDemo.newBuilder().id(1).name("admin").age(20).build();
        System.out.println(test);
    }
}
