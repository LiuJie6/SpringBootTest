package com.example.demo.test.dataStructureAndArithmetic.queue;

/**
 * Project Name:SpringBootTest
 * File Name:MyQueue
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.queue
 * Date:2018/11/21
 * Author:liujie
 * Description:自定义队列
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class MyQueue {

    private Object[] queueArray;   //存储数据的数组
    private int realSize;           //实际元素数量
    private int front;                //队列头指针
    private int tail;                //队列尾指针
    private int maxSize;            //队列总大小

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new Object[maxSize];
        this.realSize = 0;
        this.front = 0;
        this.tail = -1;
    }

    /**
     * 插入元素
     *
     * @param value 待插入的元素
     */
    public void insert(int value) {
        if (isFull()) {
            System.out.println("队列已满");
        } else {
            if (tail == maxSize - 1) {   //tail到了顶部，循环回来（变为-1）
                tail = -1;
            }
            queueArray[++tail] = value;  //队尾指针+1并赋值
            realSize++;    //元素个数+1
        }
    }

    /**
     * 删除元素
     *
     * @return 被删除的元素
     */
    public Object remove() {
        Object removeObject;
        if (isEmpty()) {
            System.out.println("队列为空，无需删除");
            return null;
        } else {
            removeObject = queueArray[front];   //队头元素即为要删除的
            queueArray[front] = null;
            front++;                          //对头指针往上移
            return removeObject;
        }
    }

    /**
     * 查看队头数据
     *
     * @return 对头数据
     */
    public Object getFrontData() {
        if (!isEmpty()) {
            return queueArray[front];
        } else {
            return null;
        }
    }

    /**
     * 判断队列是否已满
     *
     * @return 判断结果
     */
    private boolean isFull() {
        return (realSize == maxSize);
    }

    /**
     * 判断队列是否为空
     *
     * @return 判断结果
     */
    private boolean isEmpty() {
        return (realSize == 0);
    }

    /**
     * 获取队列大小
     *
     * @return 队列大小
     */
    private int getRealSize() {
        return this.realSize;
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(10);
        myQueue.insert(5);
        myQueue.insert(6);
        myQueue.insert(3);
        myQueue.insert(2);
        myQueue.insert(9);
        System.out.println(myQueue.getFrontData());
        myQueue.remove();
        System.out.println(myQueue.getFrontData());
        myQueue.insert(66);
        myQueue.insert(61);
        myQueue.insert(62);
        myQueue.insert(63);
        myQueue.insert(64);
        myQueue.insert(65);
        myQueue.insert(69);
    }

}
