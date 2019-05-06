package com.example.demo.util.sortutil.quick;

/**
 * Project Name:SpringBootTest
 * File Name:QuickSort
 * Package Name:com.example.demo.util.sortutil.quick
 * Date:2019/4/15
 * Author:liujie
 * Description:快速排序
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class QuickSort {

    public static void quickSort(int[] a) {
        if (a.length > 0)
            sort(a, 0, a.length - 1);
    }


    private static void sort(int[] a, int low, int high) {
        if (low < high) {
            int middle = getMiddle(a, low, high);
            sort(a, low, middle - 1);
            sort(a, middle + 1, high);
        }
    }

    /**
     * 获取下一次排序的中间值
     *
     * @param a    数组
     * @param low  开始点
     * @param high 结束点
     * @return 中间值
     */
    private static int getMiddle(int[] a, int low, int high) {
        int base = a[low];
        while (low < high) {
            if (low < high && a[high] > base) {
                high--;
            }
            a[low] = a[high];
            if (low < high && a[low] < base) {
                low++;
            }
            a[high] = a[low];
        }
        a[low] = base;
        return low;
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 2, 3, 56, 14, 25};
        quickSort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
