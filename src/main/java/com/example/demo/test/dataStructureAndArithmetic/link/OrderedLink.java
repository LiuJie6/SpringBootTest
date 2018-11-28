package com.example.demo.test.dataStructureAndArithmetic.link;

/**
 * Project Name:SpringBootTest
 * File Name:OrderedLink
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.link
 * Date:2018/11/21
 * Author:liujie
 * Description:有序链表
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class OrderedLink {

    private Node head;

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public OrderedLink() {
        this.head = null;
    }

    /**
     * 插入节点并按从小到大的顺序排列
     *
     * @param value 要插入的值
     */
    public void insert(int value) {
        Node node = new Node(value);
        Node pre = null;
        Node current = head;
        while (current != null && current.data < value) {
            pre = current;
            current = current.next;
        }
        if(pre == null){
            head = node;
            head.next = current;
        }else{
            pre.next = node;
            node.next = current;
        }
    }

    /**
     * 删除头节点
     */
    public void delete(){
        head = head.next;
    }

    /**
     * 遍历链表并输出
     */
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        OrderedLink orderedLink = new OrderedLink();
        orderedLink.insert(36);
        orderedLink.insert(6);
        orderedLink.insert(66);
        orderedLink.display();
    }
}
