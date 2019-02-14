package com.example.demo.test.dataStructureAndArithmetic.array;

import java.util.Arrays;

/**
 * Project Name:SpringBootTest
 * File Name:ArrayCopy
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.array
 * Date:2018/11/29
 * Author:liujie
 * Description:数组复制的几种方法及效率比较
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class ArrayCopy {

    public static void testArrayCopy() {
        int n = 100000;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }

        //(1)测量clone()方法耗时
        long time1 = System.nanoTime();   //单位为纳秒  System.currentTimeMillis()单位为毫秒
        int[] b = a.clone();
        System.out.println("clone()耗时：" + (System.nanoTime() - time1));
        System.out.println(b[n - 1]);

        //(2)测量System.arrayCopy()方法耗时
        int[] c = new int[n];
        long time2 = System.nanoTime();
        System.arraycopy(a, 0, c, 0, n); //原数组，原数组开始位置，目标数组，目标数组开始位置，拷贝个数
        System.out.println("System.arrayCopy()耗时：" + (System.nanoTime() - time2));
        System.out.println(c[n - 1]);

        //(3)测量Arrays.copyOf()方法耗时
        long time3 = System.nanoTime();
        int[] d = Arrays.copyOf(a, n);
        System.out.println("Arrays.copyOf()耗时：" + (System.nanoTime() - time3));
        System.out.println(d[n - 1]);

        //(4)测量for循环耗时
        int[] e = new int[n];
        long time4 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            e[i] = a[i];
        }
        System.out.println("for循环耗时：" + (System.nanoTime() - time4));
        System.out.println(e[n - 1]);

        //(5)测量Arrays.copyOfRange()方法（这个不常用）
        long time5 = System.nanoTime();
        int[] f = Arrays.copyOfRange(a, 0, n);
        System.out.println("Arrays.copyOfRange()耗时：" + (System.nanoTime() - time5));
        System.out.println(f[n - 1]);

        //结果表明
        //(1)System.arrayCopy()最快，for循环最慢
        //(2)其他效率上：Arrays.copyOfRange()>Arrays.copyOf()>clone(),但总体上比较接近且排序不确定
    }

    public static void main(String[] args) {
        testArrayCopy();
    }
}
