package com.example.demo.test.dataStructureAndArithmetic.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Project Name:SpringBootTest
 * File Name:MyStack
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.stack
 * Date:2018/11/21
 * Author:liujie
 * Description:自定义的栈
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class MyStack {

    private Object[] elementData;  //存储元素的数组
    private int top;    //指向栈顶的指针
    private int size;   //栈的总容量

    public Object[] getElementData() {
        return elementData;
    }

    public void setElementData(Object[] elementData) {
        this.elementData = elementData;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * 默认构造一个容量为10的栈
     */
    public MyStack() {
        this.elementData = new Object[10];
        this.top = -1;    //添加元素时a[++top]=？，即a[0]=？
        this.size = 10;
    }

    public MyStack(int initCapacity) {
        if (initCapacity < 0) {
            throw new IllegalArgumentException("栈的大小不能为负：" + initCapacity);
        }
        this.elementData = new Object[initCapacity];
        this.top = -1;
        this.size = initCapacity;
    }

    /**
     * push，即添加元素
     *
     * @param item 待加入的元素
     * @return 加入的元素
     */
    public Object push(Object item) {
        isGrow(top + 1);
        this.elementData[++top] = item;
        return item;
    }

    /**
     * 弹出栈顶元素
     *
     * @return 栈顶元素
     */
    public Object pop() {
        Object item = peek();
        remove(top);
        return item;
    }

    /**
     * 获取栈顶元素
     *
     * @return 栈顶元素
     */
    public Object peek() {
        if (top == -1) {
            throw new EmptyStackException();
        } else {
            return this.elementData[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }


    /**
     * 删除栈顶元素
     *
     * @param top 栈顶指针
     */
    private void remove(int top) {
        this.elementData[top] = null;
        this.top--;
    }

    /**
     * 判断是否需要扩容
     *
     * @param minCapacity push时+1后的size
     * @return 判断结果
     */
    private boolean isGrow(int minCapacity) {
        int oldCapacity = size;
        if (minCapacity >= oldCapacity) {
            int newCapacity = 0;
            if ((oldCapacity << 1) - Integer.MAX_VALUE > 0) {   //如果oldCapacity左移后大于int的最大值
                newCapacity = Integer.MAX_VALUE;
            } else {
                newCapacity = oldCapacity << 1;
            }
            this.size = newCapacity;
            this.elementData = Arrays.copyOf(this.elementData,this.size);  //将原有的内容复制并扩容
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack(2);
        myStack.push(13);
        myStack.push("111");
        myStack.push("asf");
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
    }


}
