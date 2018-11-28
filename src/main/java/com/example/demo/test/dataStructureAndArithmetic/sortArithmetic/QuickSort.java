package com.example.demo.test.dataStructureAndArithmetic.sortArithmetic;

/**
 * Project Name:SpringBootTest
 * File Name:QuickSort
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.sortArithmetic
 * Date:2018/11/27
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


/**
 * 存在问题，无法正常排序
 */
public class QuickSort {

    private static void sort(int[] a, int low, int high) {
        if (low > high) {
            return;
        }
        int i = low;
        int j = high;
        int key = a[i];    //设立基准值
        while (i < j) {
            while (i < j && a[i] >= key) {   //向左扫描
                j--;
            }
            if(i<j) {
                int temp = a[j--];
                a[j--] = a[i];
                a[i] = temp;
            }
            while (i < j && a[i] <= key) {   //向右扫描
                i++;
            }
            if(i<j) {
                int temp = a[i++];
                a[i++] = a[j];
                a[j] = temp;
            }
        }
        //a[i] = key;
        sort(a, low, i - 1);
        sort(a, i + 1, high);
    }

    private static void quickSort(int[] a) {
        sort(a, 0, a.length - 1);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {11,14,22,55,66};
        quickSort(a);
    }
}
