package com.example.demo.test.dataStructureAndArithmetic.tree.binaryTree.nodeModel;

/**
 * Project Name:SpringBootTest
 * File Name:Node
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.binaryTree
 * Date:2018/11/20
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class Node {

    private int data;   //节点数据
    private Node leftChild;    //左节点
    private Node rightChild;   //右节点
    private boolean isDeleted;         //标识是否已删除

    public Node(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    /**
     * 打印节点内容
     */
    public void printNode(){
        System.out.println(data);
    }
}
