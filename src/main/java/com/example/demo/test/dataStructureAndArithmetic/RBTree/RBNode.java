package com.example.demo.test.dataStructureAndArithmetic.RBTree;

/**
 * Project Name:SpringBootTest
 * File Name:RBNode
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.RBTree
 * Date:2018/11/23
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class RBNode<T extends Comparable> {

    private T data;
    private boolean isColor;
    private RBNode leftChild;
    private RBNode rightChild;
    private RBNode parent;

    public RBNode(T data, boolean isColor, RBNode leftChild, RBNode rightChild, RBNode parent) {
        this.data = data;
        this.isColor = isColor;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.parent = parent;
    }

    public T getData(){
        return this.data;
    }

    public String dataToString(){
       return (data+":"+(this.isColor?"Red":"Black"));
    }

    /**
     * 节点x左旋
     * @param x 要旋转的节点
     */
    private void leftRotate(RBNode x){
        //(1)把y的左子节点赋值给x的右子节点，把x赋值给y的左子节点的父节点（如果y的左子节点不为空）
        RBNode y = x.rightChild;
        if(y.leftChild != null){
            x.rightChild = y.leftChild;
            y.leftChild.parent = x;
        }

        //(2)把x的父节点p（如果非空）赋值给y的父节点，并更新p的子节点
        if(x.parent != null){
            y.parent = x.parent;
            if(x == x.parent.leftChild){  //如果x是p的左子节点
                x.parent.leftChild = y;   //将y赋值给p的左子节点
            }else{
                x.parent.rightChild = y;
            }
        }

        //(3)将y的左子节点设为x，将x的父节点设为y
        y.leftChild = x;
        x.parent = y;
    }

    /**
     * 将x右旋
     * @param y 要旋转的节点
     */
    private void rightRotate(RBNode y){
        RBNode x = y.leftChild;
        //(1)将x的右子节点(如果非空)赋值给y的左子节点，并将y赋值给x的右子节点的父节点
        y.leftChild = x.rightChild;  //不管x的右子节点是否为空，这一步都必须执行
        if(x.rightChild != null){
            x.rightChild.parent = y;
        }

        //(2)将y的父节点p（如果非空）赋值给x的父节点，并更新p的子节点
        if(y.parent!= null){
            x.parent = y.parent;
            if(y == y.parent.leftChild){   //如果y是p的左子节点
                x= y.parent.leftChild;
            }else{
                x= y.parent.rightChild;
            }
        }

        //(3)将x赋值给y的父节点，并将y赋值给x的右子节点
        y.parent = x;
        x.rightChild = y;
    }
}
