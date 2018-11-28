package com.example.demo.test.dataStructureAndArithmetic.link;

/**
 * Project Name:SpringBootTest
 * File Name:TwoWayLinkList
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.link
 * Date:2018/11/21
 * Author:liujie
 * Description:双向链表
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class TwoWayLinkList {

    private int size;
    private Node head;
    private Node tail;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    private class Node {
        private int data;
        private Node next;
        private Node pre;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * 在链表头部插入元素
     *
     * @param value 待插入的节点值
     */
    public void insertInHead(int value) {
        Node node = new Node(value);
        if (this.size == 0) {
            head = node;
            tail = node;
            size++;
        } else {
            head.pre = node;
            node.next = head;
            head = node;
            size++;
        }
    }

    /**
     * 在链表尾部插入元素
     *
     * @param value 待插入的节点值
     */
    public void insertInTail(int value) {
        Node newNode = new Node(value);
        if (size == 0) {
            head = newNode;
            tail = newNode;
            size++;
        } else {
            tail.next = newNode;
            newNode.pre = tail;
            tail = newNode;
            size++;
        }
    }

    /**
     * 删除链表头
     */
    public void deleteHead() {
        if (size > 0) {
            head = head.next;
            head.pre = null;
            size--;
        }
    }

    /**
     * 删除链表尾
     */
    public void deleteTail() {
        if (size > 0) {
            tail = tail.pre;
            tail.next = null;
            size--;
        }
    }

    /**
     * 打印链表
     */
    public void display(){
        if(size > 0){
            Node node = head;
            int curSize = size;
            if(curSize == 1){  //只有1个元素
                System.out.println("["+node.data+"]");
            }else{
                while(node != null) {
                    if (node.equals(head)) {
                        System.out.print("["+node.data+"-->");
                        node = node.next;
                    }else{
                        System.out.print(node.data);
                        node = node.next;
                        if(node == null){
                            System.out.print("]");
                        }else{
                            System.out.print("-->");
                        }
                    }
                }
            }
        }else{
            System.out.println("[]");
        }
    }

    public static void main(String[] args) {
        TwoWayLinkList TWLL = new TwoWayLinkList();
        TWLL.insertInHead(12);
        TWLL.insertInHead(6);
        TWLL.insertInHead(66);
        TWLL.insertInTail(5);
        TWLL.insertInTail(36);
        TWLL.display();
    }
}
