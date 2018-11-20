package com.example.demo.test.RandomPassword;

import java.util.Random;

/**
 * Project Name:SpringBootTest
 * File Name:RandomTest
 * Package Name:com.example.demo.test.RandomPassword
 * Date:2018/11/20
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */
public class RandomTest {

    /**
     * 随机返回一个介于[0,n)的整数
     *
     * @param n 最大值
     * @return 结果
     */
    private static int getPositiveInt(int n) {
        Random random = new Random();
        return random.nextInt(n);
    }

    /**
     * 随机获取一个介于[-2^7,2^7-1]的整数
     *
     * @return 结果
     */
    private static int getInt() {
        Random random = new Random();
        return random.nextInt();
    }

    /**
     * 随机返回一个介于[0,1.0)的小数
     *
     * @return 返回结果
     */
    private static double getDouble() {
        Random random = new Random();
        return random.nextDouble();
    }

    /**
     * 随机返回一个介于[0,1.0)的小数
     *
     * @return 结果
     */
    private static double getDouble2() {
        return Math.random();
    }

    /**
     * 返回一个介于[0,5)的整数
     *
     * @return 结果
     */
    private static int getIntMul() {
        Random random = new Random();
        return (int) (random.nextDouble() * 5);
    }


    public static void main(String[] args) {
        System.out.println(getPositiveInt(6));
        System.out.println(getInt());
        System.out.println(getDouble());
        System.out.println(getDouble2());
        System.out.println(getIntMul());
    }

}
