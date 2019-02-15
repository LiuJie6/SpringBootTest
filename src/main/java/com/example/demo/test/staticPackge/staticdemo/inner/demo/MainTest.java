package com.example.demo.test.staticPackge.staticdemo.inner.demo;

/**
 * Project Name:SpringBootTest
 * File Name:MainTest
 * Package Name:com.example.demo.test.staticPackge.staticdemo.inner.demo
 * Date:2019/2/15
 * Author:liujie
 * Description:
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class MainTest {

    public static void main(String[] args) {
        Outer.StaticInner staticInner = new Outer.StaticInner();
        //Outer.CommonInner commonInner = new Outer.CommonInner();
        Outer outer = new Outer();
        Outer.CommonInner commonInner = outer.new CommonInner();
    }

}
