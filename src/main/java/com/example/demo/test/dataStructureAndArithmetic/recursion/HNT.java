package com.example.demo.test.dataStructureAndArithmetic.recursion;

/**
 * Project Name:SpringBootTest
 * File Name:HNT
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.recursion
 * Date:2018/11/22
 * Author:liujie
 * Description:汉诺塔问题
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */
public class HNT {

    /**
     *
     * @param dish 盘子总数
     * @param from 初始塔
     * @param temp 中介塔
     * @param to 目标塔
     */
    public void move(int dish,String from ,String temp,String to){
        if(dish == 1){
            System.out.println("第"+dish+"个盘子从"+from+"移到"+to);
        }else{
            move(dish-1,from,to,temp);    //A为初始塔，B为目标塔，C为中介塔
            System.out.println("第"+dish+"个盘子从"+from+"移到"+to);
            move(dish-1,temp,from,to);    //B为初始塔，C为目标塔，A为中介塔
        }
    }

    public static void main(String[] args) {
        HNT hnt = new HNT();
        hnt.move(3,"A","B","C");
    }
}
