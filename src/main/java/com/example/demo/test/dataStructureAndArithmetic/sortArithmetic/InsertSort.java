package com.example.demo.test.dataStructureAndArithmetic.sortArithmetic;

/**
 * Project Name:SpringBootTest
 * File Name:InsertSort
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.sortArithmetic
 * Date:2018/11/21
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class InsertSort {

    private static void insertSort(int[] a) {
        int j;
        for (int i = 1; i < a.length; i++) {   //下标为0的元素只有1个，默认有序
            j = i;
            int temp = a[i];   //要插入的值
            while (j > 0 && temp > a[j - 1]) { //从已经有序的数组最右边开始，寻找比其小的数
                a[j] = a[j - 1];
                j--;
            }
            a[j] = temp;
        }
    }


    public static void main(String[] args) {
        int[] a = {11, 2, 34, 66, 36, 35, 14};
        insertSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
