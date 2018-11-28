package com.example.demo.test.dataStructureAndArithmetic.graph;

/**
 * Project Name:SpringBootTest
 * File Name:StackDepth
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.graph
 * Date:2018/11/27
 * Author:liujie
 * Description:用于深度优先搜索的栈
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class StackDepth {
    private int maxSize;
    private int[] array;
    private int top;
    private int realSize;

    public StackDepth(){
        maxSize = 20;
        array = new int[maxSize];
        top = -1;
        realSize = 0;
    }

    public void push(int key){
        if(isFull()){
            System.out.println("已满");
        }else{
            array[++top] = key;
            realSize++;
        }
    }

    public int pop(){
        realSize--;
        return array[top--];
    }

    public int peek(){
        return array[top];
    }

    public boolean isEmpty(){
        return (realSize ==0);
    }

    private boolean isFull(){
        return (realSize == maxSize);
    }

}
