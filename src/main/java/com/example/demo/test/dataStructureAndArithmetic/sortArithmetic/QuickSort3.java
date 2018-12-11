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
    //(3)不用进行两个元素的互换，以{6, 1, 2, 7, 9, 13, 4, 5, 10, 8}为例
    //   初始：key=6,left=0,right=9
    //   发生第一次改变时： key=6,left=0,right=7；变化后：{5,1,2,7,9,13,4,5,10,8}，消失的是基准元素key
    //   第二次：key=6,left=3,right=7;改变后：{5,1,2,7,9,13,4,7,10,8}，原来right标识的值从5被覆盖为7
    //   第三次：key=6,left=3,right=6;改变后：{5,1,2,4,9,13,4,7,10,8}，原来left标识的值从7被覆盖为4
    //   第四次：key=6,left=4,right=6;改变后：{5,1,2,4,9,13,9,7,10,8}，原来right标识的值从4被覆盖为9
    //   第五次：key=6,left=4,right=4,此时left < fight不再满足，跳出while循环，同时left标识的值被key覆盖
    //        改变后:{5,1,2,4,6,13,9,7,10,8} ,key(6)左边的都比它小，右边的都比它大，在进行递归
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

    private static void quickSort(int[] a, int left, int right) {
        int middle;
        if (left < right) {
            middle = getMiddle(a, left, right);
            quickSort(a, left, middle - 1);
            quickSort(a, middle + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 13, 4, 5, 10, 8};
        System.out.println("排序前：" + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("排序后：" + Arrays.toString(arr));
    }
}
