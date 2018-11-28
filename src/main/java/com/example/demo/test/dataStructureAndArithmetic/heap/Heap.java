package com.example.demo.test.dataStructureAndArithmetic.heap;

/**
 * Project Name:SpringBootTest
 * File Name:Heap
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.heap
 * Date:2018/11/26
 * Author:liujie
 * Description:堆的实现
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */

/**
 * 堆的要点
 * (1)节点的左子节点索引为2*index+1
 * (2)节点的右子节点索引为2*index+2
 * (3)节点的父节点索引为(index-1)/2     向下取整
 */
public class Heap {

    private Node[] heapArray;

    private int maxSize;

    private int currentSize;

    public Heap(int maxSize) {
        this.maxSize = maxSize;
        this.currentSize = 0;
        this.heapArray = new Node[maxSize];
    }

    /**
     * 向上调整
     *
     * @param index 索引值
     */
    private void trickleUp(int index) {
        int parent = (index - 1) / 2;    //父节点的索引
        Node button = heapArray[index];   //把当前值插入到数据底部
        while (index > 0 && heapArray[parent].getData() < button.getData()) {
            heapArray[parent] = heapArray[index];
            index = parent;
            parent = (parent - 1) / 2;
        }
        heapArray[index] = button;
    }

    /**
     * 向下调整
     *
     * @param index 索引值
     */
    private void trickleDown(int index) {
        Node top = heapArray[index];
        int largeChildIndex;
        while (index < (currentSize / 2)) {    //确保当前节点有至少一个子节点
            int leftChileIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            if (rightChildIndex < currentSize     //是否有右子节点
                    && heapArray[rightChildIndex].getData() > heapArray[leftChileIndex].getData()) {  //右>左
                largeChildIndex = rightChildIndex;
            } else {
                largeChildIndex = leftChileIndex;
            }
            if (top.getData() >= heapArray[largeChildIndex].getData()) {
                break;
            }
            heapArray[index] = heapArray[largeChildIndex];
            index = largeChildIndex;
        }
        heapArray[index] = top;
    }

    private boolean isEmpty() {
        return (currentSize == 0);
    }

    private boolean isFull() {
        return (currentSize == maxSize);
    }

    /**
     * 插入
     *
     * @param key 待插入的节点值
     * @return 操作结果
     */
    public boolean insert(int key) {
        if (isFull()) {
            System.out.println("堆已满，无法插入");
            return false;
        } else {
            Node node = new Node(key);
            heapArray[currentSize] = node;
            trickleUp(currentSize++);
            return true;
        }
    }

    /**
     * 删除根节点
     *
     * @return 操作结果
     */
    public boolean remove() {
        if (isEmpty()) {
            System.out.println("堆为空，无法删除");
            return false;
        } else {
            Node root = heapArray[0];
            heapArray[0] = heapArray[currentSize - 1]; //把最后一个节点赋值给根节点
            trickleDown(0);
            return true;
        }
    }

    /**
     * 根据索引改变堆中的某一元素的值
     *
     * @param index 索引值
     * @param value 新的值
     * @return 操作结果
     */
    public boolean changeNode(int index, int value) {
        if (index < 0 || index > currentSize - 1) {
            return false;
        } else {
            int oldValue = heapArray[index].getData();
            heapArray[index].setData(value);
            if (oldValue < value) {  //value大于原来的值,向上调整
                trickleUp(index);
            } else {
                trickleDown(index);
            }
            return true;
        }
    }

    private void display() {
        System.out.println("heap:");
        for (int i = 0; i < currentSize; i++) {
            if (heapArray[i] != null) {
                System.out.print(heapArray[i].getData() + " ");
            } else {
                System.out.print("--");
            }
        }
    }

    public static void main(String[] args) {
        //当前存在问题，未解决
        Heap heap = new Heap(20);
        heap.insert(70);
        heap.insert(51);
        heap.insert(37);
        heap.insert(10);
        heap.insert(43);
        heap.insert(27);
        heap.insert(63);
        heap.insert(55);
        heap.insert(30);
        heap.insert(34);
        heap.insert(82);
        heap.display();
    }
}
