package com.example.demo.test.dataStructureAndArithmetic.sortArithmetic;

/**
 * Project Name:SpringBootTest
 * File Name:SelectSort
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.sortArithmetic
 * Date:2018/11/21
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class SelectSort {

    private static void selectSort(int[] a){
        for(int i =0;i<a.length - 1;i++){
            for(int j = i+1;j<a.length;j++){
                swap(a,i,j);
            }
        }
    }

    private static void swap(int[] a,int m,int n){
        if(a[m] > a[n]){
            int temp = a[m];
            a[m] = a[n];
            a[n] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {11,12,45,3,67,66,36};
        selectSort(a);
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

}
