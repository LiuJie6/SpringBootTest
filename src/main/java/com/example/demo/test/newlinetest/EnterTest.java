package com.example.demo.test.newlinetest;

/**
 * Project Name:SpringBootTest
 * File Name:EnterTest
 * Package Name:com.example.demo.test.newlinetest
 * Date:2019/4/22
 * Author:liujie
 * Description:
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class EnterTest {

    public static void main(String[] args) {
        String s = "asdasdasdasdasdasdas" +"\n"+
                "adasdasdasda";
        String str = s.replaceAll("\n","");
        System.out.println(str);
    }
}
