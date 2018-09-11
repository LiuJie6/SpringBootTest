package com.example.demo.test.Bubb;

/**
 * Project Name:SpringBootTest
 * File Name:BubbSort
 * Package Name:com.example.demo.test.Bubb
 * Date:2018/8/20
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class BubbSort {

    public static void Bubb(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=a.length-1;j>i;j--){
                if(a[i]>a[j]){
                    swap(a,i,j);
                }
            }
        }
    }

    public static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {6,2,4,8,1,9};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("*********************");
        Bubb(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
