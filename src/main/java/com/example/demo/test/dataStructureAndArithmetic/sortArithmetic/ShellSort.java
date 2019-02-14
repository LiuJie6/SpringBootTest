package com.example.demo.test.dataStructureAndArithmetic.sortArithmetic;

/**
 * Project Name:SpringBootTest
 * File Name:ShellSort
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.sortArithmetic
 * Date:2018/11/29
 * Author:liujie
 * Description:希尔排序（直接插入排序的优化）
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class ShellSort {

    //(1)设置增量（通常为数组长度的一半），按增量进行插入排序，increment = increment/2
    //(2)重复（1），直到increment为1
    //注意：每次排序都要从数组的头元素开始排
    //shell排序不稳定（直接插入排序是稳定的），因为按增量进行插入排序时，会破坏稳定性
    private static void shellSort(int[] a) {
        int increment = a.length / 2;   //增量初始为数组长度的一半
        while (increment >= 1) {  //增量为0的时候就完成了排序
            for (int i = 0; i < a.length; i++) {
                int m;
                if(increment>1) {
                    for (int j = i + increment; j < a.length - increment; j = j + increment) {
                        m = j;
                        int temp = a[j];   //要插入的值
                        while (m >= increment && temp < a[m - increment]) {
                            a[m] = a[m - increment];
                            m = m - increment;
                        }
                        a[m] = temp;
                    }
                }else{  //当增量为0时，为了取到最后一个元素，要改成“<=”
                    for (int j = i + increment; j <= a.length - increment; j = j + increment) {
                        m = j;
                        int temp = a[j];   //要插入的值
                        while (m > 0 && temp < a[m - increment]) {
                            a[m] = a[m - increment];
                            m = m - increment;
                        }
                        a[m] = temp;
                    }
                }
            }
            increment = increment / 2;
        }
    }

    public static void main(String[] args) {
        int[] a = {32, 43, 23, 13, 11,1,100,0,34};
        shellSort(a);
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
