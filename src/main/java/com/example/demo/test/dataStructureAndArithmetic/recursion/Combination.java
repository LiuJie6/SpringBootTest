package com.example.demo.test.dataStructureAndArithmetic.recursion;

/**
 * Project Name:SpringBootTest
 * File Name:Combination
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.recursion
 * Date:2018/11/22
 * Author:liujie
 * Description:组合
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class Combination {

    private char[] person;  //可选择的人
    private boolean[] selected;   //是否被选中

    public Combination(char[] person) {
        this.person = person;
        this.selected = new boolean[person.length];
    }

    /**
     * 解决方案
     *
     * @param teamNum 剩余的人选数
     * @param index   可选择的下标
     */
    private void resolve(int teamNum, int index) {
        if (teamNum < 0 || teamNum > 0 && index >= person.length){
            return;
        }
        if(teamNum == 0){
            for(int i = 0;i<person.length;i++){
                if(selected[i]){
                    System.out.print(person[i]+",");
                }
            }
            System.out.println();
            return;
        }
        selected[index] = true;
        resolve(teamNum-1,index+1);
        selected[index] = false;
        resolve(teamNum,index+1);
    }

    public static void main(String[] args) {
        char[] person = {'A','B','C','D','E'};
        Combination combination = new Combination(person);
        combination.resolve(3,0);
    }
}
