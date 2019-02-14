package com.example.demo.test.dataStructureAndArithmetic.recursion;

/**
 * Project Name:SpringBootTest
 * File Name:PackProblem
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.recursion
 * Date:2018/11/22
 * Author:liujie
 * Description:背包问题
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class PackProblem {

    private int[] weights;  //可供选择的重量
    private boolean[] selected;   //是否被选择
    private boolean isFind = false;

    private PackProblem(int[] weights) {
        this.weights = weights;
        selected = new boolean[weights.length];
    }

    /**
     * 解决方案
     *
     * @param total 要放入的总重量
     * @param index 可选择的下标
     */
    private void resolve(int total, int index) {
        if (total < 0) {
            return;
        }
        if (total > 0 && index >= weights.length) {
            return;
        }
        if (total == 0) {
            isFind = true;
            for (int i = 0; i < weights.length; i++) {
                if (selected[i]) {
                    System.out.print(weights[i] + " ");
                }
            }
            System.out.println();
            return;
        }
        selected[index] = true;  //假定这个值被选中
        resolve(total - weights[index], index + 1);   //寻找total-对应的重量后，剩余的值是否满足条件
        /*if(!isFind) {  //加上这个判断就只会找出第一组符合条件的
            selected[index] = false;  //上面那条不满足，即该index对应的值无效，取消选中
            resolve(total, index + 1); //index+1后面的值是否可以组合成total
        }*/
        selected[index] = false;  //上面那条不满足，即该index对应的值无效，取消选中
        resolve(total, index + 1); //index+1后面的值是否可以组合成total
    }

    public static void main(String[] args) {
        int[] weights = {26, 19, 7, 8, 35, 5, 11, 9};
        PackProblem packProblem = new PackProblem(weights);
        packProblem.resolve(20, 0);
    }

}
