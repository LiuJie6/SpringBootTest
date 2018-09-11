package com.example.demo.test.Java8.interfaceTest.api;/**
 * Created by liujie on 2018/7/31.
 */

/**
 * Project Name:SpringBootTest
 * File Name:IJava8
 * Package Name:com.example.demo.test.Java8.interfaceTest.api
 * Date:2018/7/31
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */

public interface IJava8 {

    //java8中可以有默认方法（该方法可以不实现），实现该接口的类可以不用理会该默认方法，也可以对该默认方法进行覆盖
    default String defaultMethod(){     //默认方法
        return "default implementation";
    } ;

    //java8中可以有静态方法(必须实现)，实现该接口的类也可以不理会该静态方法
    static void say(){
        System.out.println("java8");
    }
}
