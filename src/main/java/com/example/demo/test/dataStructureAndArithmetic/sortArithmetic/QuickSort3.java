package com.example.demo.test.dataStructureAndArithmetic.sortArithmetic;

import java.util.Arrays;

/**
 * Project Name:SpringBootTest
 * File Name:QuickSort3
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.sortArithmetic
 * Date:2018/11/27
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class QuickSort3 {

    //(1)时间复杂度为O(log(N))
    //(2)不稳定（发生在基准元素与a[left]交换时）
    private static int getMiddle(int[] a, int left, int right) {
        int key = a[left];
        while (left < right) {
            while (left < right && a[right] >= key) {
                right--;
            }
            if (left < right) {
                a[left] = a[right];
            }
            while (left < right && a[left] <= key) {
                left++;
            }
            if (left < right) {
                a[right] = a[left];
            }
        }
        a[left] = key;
        return left;
    }

    private static void quickSort1(int[] a, int left, int right) {
        int middle;
        if (left < right) {
            middle = getMiddle(a, left, right);
            quickSort1(a, left, middle - 1);
            quickSort1(a, middle + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 13, 4, 5, 10, 8, 3, 33, 21};
        System.out.println("排序前：" + Arrays.toString(arr));
        quickSort1(arr, 0, arr.length - 1);
        System.out.println("排序后：" + Arrays.toString(arr));
    }
}
