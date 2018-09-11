package com.example.demo.test.designMode.Single;

/**
 * Project Name:SpringBootTest
 * File Name:SingleObject
 * Package Name:com.example.demo.test.designMode.Single
 * Date:2018/9/3
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class SingleObject {

    private SingleObject(){}   //私有的构造方法

    private static SingleObject instance = new SingleObject();

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Single");
    }
}
