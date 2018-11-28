package com.example.demo.test.dataStructureAndArithmetic.tree.binaryTree.impl;

import com.example.demo.test.dataStructureAndArithmetic.tree.binaryTree.api.Tree;
import com.example.demo.test.dataStructureAndArithmetic.tree.binaryTree.nodeModel.Node;

/**
 * Project Name:SpringBootTest
 * File Name:TreeImpl
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.binaryTree.impl
 * Date:2018/11/20
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class TreeImpl implements Tree {

    private Node root;

    /**
     * 查找节点
     *
     * @param key data
     * @return 相应节点
     */
    @Override
    public Node find(int key) {
        Node current = root;
        if (current == null) {
            return null;
        }
        while (current != null) {
            if (current.getData() > key) {   //当前节点值大于key，寻找左子树
                current = current.getLeftChild();
            } else if (current.getData() < key) {
                current = current.getRightChild();    //当前节点值小于key，寻找右子树
            } else {
                return current;
            }
        }
        return null;
    }

    /**
     * 插入节点
     *
     * @param data 要插入的节点值
     * @return 操作结果
     */
    @Override
    public boolean insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {    //当前节点为空，直接将新节点作为根节点
            root = newNode;
            return true;
        } else {
            Node current = root;
            Node parentNode;
            while (current != null) {
                parentNode = current;
                if (current.getData() > data) {  //插入的值小于当前节点，在左子树中
                    current = current.getLeftChild();
                    if (current == null) {
                        parentNode.setLeftChild(newNode);
                        return true;
                    }
                } else {
                    current = current.getRightChild();
                    if (current == null) {
                        parentNode.setRightChild(newNode);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * 删除节点
     *
     * @param node 要删除的节点
     * @return 操作结果
     */
    @Override
    public boolean delete(Node node) {

        return false;
    }

    /**
     * 中序遍历
     * 左节点-->根节点-->右节点
     *
     * @param current 当前节点
     */
    @Override
    public void infixOrder(Node current) {
        if (current != null) {
            infixOrder(current.getLeftChild());
            System.out.print(current.getData() + " ");
            infixOrder(current.getRightChild());
        }
    }

    /**
     * 前序遍历
     * 根-->左-->右
     *
     * @param current 当前节点
     */
    @Override
    public void preOrder(Node current) {
        if (current != null) {
            System.out.print(current.getData() + " ");
            preOrder(current.getLeftChild());
            preOrder(current.getRightChild());
        }
    }

    /**
     * 后序遍历
     * 左-->右-->根
     *
     * @param current 当前节点
     */
    @Override
    public void nextOrder(Node current) {
        if (current != null) {
            nextOrder(current.getLeftChild());
            nextOrder(current.getRightChild());
            System.out.print(current);
        }
    }

    /**
     * 查找最大值
     *即右下角的节点值
     * @return 最大值
     */
    @Override
    public Node findMax() {
        Node current = root;
        if(root == null){
            return null;
        }
        while(current != null) {
            if (current.getRightChild() == null) {
                return current;
            }else{
                current = current.getRightChild();
            }
        }
        return null;
    }

    /**
     * 查找最小值
     *即左下角的节点值
     * @return 最小值
     */
    @Override
    public Node findMin() {
        Node current =  root;
        if(root == null){
            return null;
        }
        while(current != null){
            if(current.getLeftChild() == null){
                return current;
            }else{
                current = current.getLeftChild();
            }
        }
        return null;
    }
}
