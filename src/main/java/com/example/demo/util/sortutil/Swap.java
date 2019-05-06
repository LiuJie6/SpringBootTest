package com.example.demo.util.sortutil;

/**
 * Project Name:SpringBootTest
 * File Name:Swap
 * Package Name:com.example.demo.util.sortutil
 * Date:2019/4/15
 * Author:liujie
 * Description:数组数据交换
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class Swap {

    public static void swap(int[] a, int m, int n) {
        int temp = a[m];
        a[m] = a[n];
        a[n] = temp;
    }
}
