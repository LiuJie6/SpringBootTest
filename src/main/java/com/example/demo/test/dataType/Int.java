package com.example.demo.test.dataType;

/**
 * Project Name:SpringBootTest
 * File Name:Int
 * Package Name:com.example.demo.test.dataType
 * Date:2018/11/26
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */
public class Int {

    public static void main(String[] args) {
        System.out.println("Integer的最大值："+Integer.MAX_VALUE);
    }

    /**
     * 注意：当取值在[-127,128]时，会存储在缓存中，下一次取值直接从缓存中取
     *       因此：Integer a=9 和 Integer b = 9, a == b返回true
     *       但Integer c = 128,和Integer d = 128,c==d返回false
     *       自动装箱规范要求 byte<= 127、char<=127、
     *       -128<=short <=127、-128<=int <=127都被包装到固定的对象中（缓存）。
     */
}
