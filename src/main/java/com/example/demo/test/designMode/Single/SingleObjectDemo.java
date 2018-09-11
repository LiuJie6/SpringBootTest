package com.example.demo.test.designMode.Single;

/**
 * Project Name:SpringBootTest
 * File Name:SingleObjectDemo
 * Package Name:com.example.demo.test.designMode.Single
 * Date:2018/9/3
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */
public class SingleObjectDemo {

    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
