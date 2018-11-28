package com.example.demo.test.dataStructureAndArithmetic.graph;

/**
 * Project Name:SpringBootTest
 * File Name:QueueBreadth
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.graph
 * Date:2018/11/27
 * Author:liujie
 * Description:用于广度优先搜索的队列
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class QueueBreadth {

    private int maxSize;
    private int[] array;
    private int realSize;
    private int front;   //队列头部指针
    private int tail;    //队列尾部指针

    public QueueBreadth() {
        maxSize = 20;
        array = new int[maxSize];
        realSize = 0;
        front = 0;
        tail = -1;
    }

    public void insert(int key) {
        if (isFull()) {
            System.out.println("已满，无法插入");
        } else {
            if (tail == maxSize - 1) {   //尾部指针已经在顶部了
                tail = -1;            //循环回来，指向最初的位置
            }
            array[++tail] = key;
            realSize++;
        }
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("为空");
            return -1;
        } else {
            int temp = array[front];   //取出队头元素
            array[front] = -1;
            front++;               //队头指针+1（往上移）
            if (front == maxSize) {   //如果队头指针指向了顶部，循环回来
                front = 0;
            }
            realSize--;
            return temp;
        }
    }

    public boolean isEmpty() {
        return (realSize == 0);
    }

    private boolean isFull() {
        return (realSize == maxSize);
    }

}
