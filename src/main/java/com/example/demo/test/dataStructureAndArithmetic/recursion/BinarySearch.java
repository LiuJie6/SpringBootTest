package com.example.demo.test.dataStructureAndArithmetic.recursion;

/**
 * Project Name:SpringBootTest
 * File Name:BinarySearch
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.recursion
 * Date:2018/11/22
 * Author:liujie
 * Description:二分查找法（用于有序数组）
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class BinarySearch {

    public int binarySearch(int[] array, int start, int end, int value) {
        int mid = (end - start) / 2 + start;   //防止两者直接相加大于整形最大值
        if (start > end) {
            return -1;
        }
        if (value == array[mid]) {
            return mid;
        }else if (value < array[mid]) {
            return binarySearch(array, start, mid - 1, value);
        } else {
            return binarySearch(array, mid + 1, end, value);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,34,36,46,66,99};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(a,0,a.length-1,36));
    }
}
