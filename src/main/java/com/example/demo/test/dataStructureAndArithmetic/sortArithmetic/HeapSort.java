package com.example.demo.test.dataStructureAndArithmetic.sortArithmetic;

/**
 * Project Name:SpringBootTest
 * File Name:HeapSort
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.sortArithmetic
 * Date:2018/11/29
 * Author:liujie
 * Description:堆排序
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class HeapSort {

    /**
     * 构建大根树
     *
     * @param a 数组
     */
    private static int[] buildMaxHeap(int[] a) {
        for (int i = (a.length - 2) / 2; i >= 0; i--) {
            adjust(a, i, a.length);
        }
        return a;
    }

    /**
     * 自上往下调整a[k]，形成新的大根树
     *
     * @param a      数组
     * @param k      初始下标
     * @param length 数组长度
     */
    private static void adjust(int[] a, int k, int length) {
        int temp = a[k];
        for (int i = 2 * k + 1; i < a.length; i = 2 * i + 1) { //i初始值k的左孩子，向下调整
            if (i < length && a[i] < a[i + 1]) {  //取值较大的孩子下标
                i++;          //右>左,取右孩子下标；否则就是i
            }
            if (temp >= a[i]) {   //父节点值大于最大子节点的值，满足大根树，退出
                break;
            } else {            //父节点<子节点中的较大者
                a[k] = a[i];     //将子节点中的较大值赋值给父节点
                k = i;         //修改k值，继续向下调整
            }
        }
        a[k] = temp;      //被调整的节点值放入最终位置
    }

    /**
     * 堆排序的具体实现
     *
     * @param a 待排序的数组
     */
    private static int[] heapSort(int[] a) {
        buildMaxHeap(a);       //构建大根树
        for (int i = a.length - 1; i > 0; i--) {
            int temp = a[0];    //将堆顶元素a[0]（最大值）与堆低元素a[i]进行交换，将当前的最大值放在当前的最后
            a[0] = a[i];
            a[i] = temp;
            adjust(a, 0, i);    //剩余的元素继续整理成堆
        }
        return a;
    }

    public static void main(String[] args) {
        HeapSort hs = new HeapSort();
        int[] a = {123, 1, 24, 66, 36, 4, 56};
        heapSort(a);
        for(int n:a){
            System.out.print(n+" ");
        }
       /* int[] aa = heapSort(a);
        for (int num : aa) {
            System.out.print(num + " ");
        }*/
    }
}
