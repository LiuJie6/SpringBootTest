package com.example.demo.test.dataStructureAndArithmetic.sortArithmetic.merger;

/**
 * Project Name:SpringBootTest
 * File Name:MergerSort
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.sortArithmetic.merger
 * Date:2018/11/22
 * Author:liujie
 * Description:归并排序具体实现
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class MergerSort {

    //(1)分治与递归
    //(2)时间复杂度为O(log(N)),稳定
    private void mergerSort(int[] c, int start, int last) {
        if (last > start) {
            int mid = (last - start) / 2 + start;
            mergerSort(c, start, mid);   //左边数组排序
            mergerSort(c, mid + 1, last);   //右边数组排序
            merger(c, start, last, mid);   //合并
        }
    }


    private void merger(int[] c, int start, int last, int mid) {
        int[] temp = new int[last - start + 1];   //用于存储的临时数组
        int j = start;   //左边数组的下标
        int k = mid + 1;  //右边数组的下标
        int i = 0;              //临时数组的下标
        while (j <= mid && k <= last) {
            if (c[j] < c[k]) {
                temp[i++] = c[j++];
            } else {
                temp[i++] = c[k++];
            }
        }
        while (k <= last && j >= mid) {   //“>=”是因为上面的是"<="
            temp[i++] = c[k++];
        }
        while (j <= mid && k >= last) {
            temp[i++] = c[j++];
        }
        System.arraycopy(temp,0,c,start,temp.length);
    }

    public static void main(String[] args) {
        MergerSort mergerSort = new MergerSort();
        int[] c = {1, 11, 34, 56, 35, 2, 33};
        mergerSort.mergerSort(c, 0, c.length - 1);
        for (int cElement : c) {
            System.out.print(cElement + " ");
        }
    }
}
