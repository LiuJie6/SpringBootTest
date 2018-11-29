package com.example.demo.test.dataStructureAndArithmetic.sortArithmetic;

/**
 * Project Name:SpringBootTest
 * File Name:BucketSort
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.sortArithmetic
 * Date:2018/11/29
 * Author:liujie
 * Description:桶排序（又称基数排序）  时间复杂度为O(log(N)),稳定
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */
public class BucketSort {
    //(1)从低位开始排序(每一位都在[0,9]之间)
    //(2)一位数组int[] order用来存储桶的编号（0-9），
    //   二维数组int[][] bucket用来保存每次排序后的结果，比较的当前位相同的数放入同一个桶里
    //(3)按放入顺序从bucket中取出数组（保证排序稳定性）
    //(4)位数+1，循环，直至最高位
    //(5)时间复杂度为O(log(N))，稳定

    /**
     * 基数排序具体实现
     *
     * @param a 待排序数组
     * @param d 最高位位数(如999为100,99为10)
     */
    private static void bucketSort(int[] a, int d) {
        int n = 1;    //代表位数：1（个），10（十），100（百）...
        int k = 0;    //用于覆盖原数组
        int[][] bucket = new int[10][a.length]; //缓存数组，用于保存每一次的排序结果和下一次的输入
        int[] order = new int[10];   //相当于bucket的横坐标，存储每一位（个、十、百...）上有多少个元素
        while (n < d) {
            for (int num : a) {
                int digit = (num / n) % 10;   //该位上的值
                bucket[digit][order[digit]] = num; //将num放入对应的桶中，初始时order[]全部是0
                order[digit]++;       //该桶中元素个数+1
            }
            for (int i = 0; i < 10; i++) {  //遍历0-9号桶
                if (order[i] > 0) {   //这个桶里有数据
                    for (int j = 0; j < order[i]; j++) {  //遍历这个桶
                        a[k] = bucket[i][j];  //按顺序覆盖原数组
                        k++;
                    }
                }
                order[i] = 0;    //重置order[]
            }
            k = 0; //重置k
            n *= 10;
        }
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 11, 36, 21};
        bucketSort(a, 100);
    }
}
