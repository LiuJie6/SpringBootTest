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
            System.out.println(a);;
        }
        return 0;
    }

    public static void main(String[] args){
        System.out.println(tryTest(5));
    }
}
