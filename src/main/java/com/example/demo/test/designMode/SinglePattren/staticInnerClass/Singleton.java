package com.example.demo.test.designMode.SinglePattren.staticInnerClass;

/**
 * Project Name:SpringBootTest
 * File Name:Singleton
 * Package Name:com.example.demo.test.designMode.SinglePattren.staticInnerClass
 * Date:2019/2/14
 * Author:liujie
 * Description:
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */
public class Singleton {

    private Singleton(){};

    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static  Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }

    public void say(){
        System.out.println("使用静态内部类构建");
    }
}
