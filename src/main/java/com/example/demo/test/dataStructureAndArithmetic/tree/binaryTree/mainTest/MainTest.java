package com.example.demo.test.dataStructureAndArithmetic.tree.binaryTree.mainTest;

import com.example.demo.test.dataStructureAndArithmetic.tree.binaryTree.impl.TreeImpl;

/**
 * Project Name:SpringBootTest
 * File Name:MainTest
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.binaryTree.mainTest
 * Date:2018/11/20
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */
public class MainTest {

    public static void main(String[] args) {
        TreeImpl tree = new TreeImpl();
        tree.insert(10);
        tree.insert(2);
        tree.insert(32);
        tree.insert(5);
        tree.insert(51);
        tree.insert(17);
        tree.insert(21);
        tree.insert(31);
        //tree.preOrder(tree.find(10));
        tree.infixOrder(tree.find(10));
    }
}
