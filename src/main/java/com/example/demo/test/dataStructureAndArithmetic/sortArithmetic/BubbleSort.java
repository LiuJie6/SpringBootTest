package com.example.demo.test.dataStructureAndArithmetic.sortArithmetic;

/**
 * Project Name:SpringBootTest
 * File Name:BubbleSort
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.sortArithmetic
 * Date:2018/11/21
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class BubbleSort {

    /**
     * 时间复杂度为O(N^2),稳定
     *
     * @param a 要排序的数组
     */
    private static void bubbleSort(int[] a) {
        for (int i = 1; i < a.length; i++) {     //外层循环控制排序趟数，第n次排序就把第n大的元素放在对应的位置
            for (int j = 0; j < a.length - 1; j++) {   //内层循环控制每一趟排序多少次，总是比较相邻的两个元素
                swap(a, j, j + 1);
            }
        }
    }

    private static void swap(int[] a, int m, int n) {
        if (a[m] > a[n]) {
            int temp = a[m];
            a[m] = a[n];
            a[n] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 7, 19, 20, 45, 3};
        bubbleSort(a);
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
