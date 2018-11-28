package com.example.demo.test.dataStructureAndArithmetic.sortArithmetic.merger;

/**
 * Project Name:SpringBootTest
 * File Name:MergeSortThink
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.sortArithmetic
 * Date:2018/11/22
 * Author:liujie
 * Description:归并算法(对两个有序数组进行排序并合并)
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */
public class MergeSortThink {

    private void mergerSort(int[] a, int[] b) {
        int aNum = 0, bNum = 0, cNum = 0;
        int[] c = new int[a.length + b.length];
        while (aNum < a.length && bNum < b.length) {  //比较数组a和b中元素的大小，将较小的赋值给c
            if (a[aNum] < b[bNum]) {                   //满足条件的数组下标会+1，否则不加
                c[cNum++] = a[aNum++];
            } else {
                c[cNum++] = b[bNum++];
            }
        }
        while (aNum == a.length && bNum < b.length) {  //a数组全部加入了c而b还有剩余，将b剩下的按顺序加入c
            c[cNum++] = b[bNum++];
        }
        while (aNum < a.length && bNum == b.length) {
            c[cNum++] = a[aNum++];
        }
        for(int cElement: c){
            System.out.print(cElement+" ");
        }
    }

    public static void main(String[] args) {
        MergeSortThink mergeSort = new MergeSortThink();
        int[] a = {3,6,7};
        int[] b = {4,5,8,9};
        mergeSort.mergerSort(a,b);
    }
}
