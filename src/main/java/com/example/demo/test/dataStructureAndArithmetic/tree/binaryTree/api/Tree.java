package com.example.demo.test.dataStructureAndArithmetic.tree.binaryTree.api;/**
 * Created by liujie on 2018/11/20.
 */

import com.example.demo.test.dataStructureAndArithmetic.tree.binaryTree.nodeModel.Node;

/**
 * Project Name:SpringBootTest
 * File Name:Tree
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.binaryTree.api
 * Date:2018/11/20
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public interface Tree {

    /**
     * 查找节点
     *
     * @param key data
     * @return 相应节点
     */
    Node find(int key);

    /**
     * 插入节点
     *
     * @param data 要插入的节点值
     * @return 操作结果
     */
    boolean insert(int data);

    /**
     * 删除节点
     *
     * @param node 要删除的节点
     * @return 操作结果
     */
    boolean delete(Node node);

    /**
     * 中序遍历
     *
     * @param current 当前节点
     */
    void infixOrder(Node current);

    /**
     * 前序遍历
     *
     * @param current 当前节点
     */
    void preOrder(Node current);

    /**
     * 后序遍历
     *
     * @param current 当前节点
     */
    void nextOrder(Node current);

    /**
     * 查找最大值
     * @return 最大值
     */
    Node findMax();

    /**
     * 查找最小值
     * @return 最小值
     */
    Node findMin();
}
