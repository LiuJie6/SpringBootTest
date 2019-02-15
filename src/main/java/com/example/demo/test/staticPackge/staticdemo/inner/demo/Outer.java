package com.example.demo.test.staticPackge.staticdemo.inner.demo;

/**
 * Project Name:SpringBootTest
 * File Name:Outer
 * Package Name:com.example.demo.test.staticPackge.staticdemo.inner.demo
 * Date:2019/2/15
 * Author:liujie
 * Description:静态内部类的初始化
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class Outer {

    public static class StaticInner{
        public void say(){
            System.out.println("静态内部类");
        }
    }

    public class CommonInner{
        public void say(){
            System.out.println("普通内部类");
        }
    }
}
