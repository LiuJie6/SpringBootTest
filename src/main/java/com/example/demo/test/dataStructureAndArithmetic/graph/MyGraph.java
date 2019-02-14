package com.example.demo.test.dataStructureAndArithmetic.graph;

/**
 * Project Name:SpringBootTest
 * File Name:MyGraph
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.graph
 * Date:2018/11/27
 * Author:liujie
 * Description:图
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class MyGraph {
    private static final int MAX_VERTEX = 20;  //顶点的最大个数
    private Vertex[] verticesList;              //用来表示顶点的数组
    private int[][] adjMat;                     //用邻接矩阵表示边：0表示无连接，1表示有链接
    private int nVertices;                      //顶点个数
    private StackDepth stack;              //深度优先用的栈
    private QueueBreadth queue;          //广度优先用的队列

    /**
     * 顶点类
     */
    class Vertex {
        private char label;
        private boolean isVisited;

        public Vertex(char label) {
            this.label = label;
            isVisited = false;
        }
    }

    public MyGraph() {
        verticesList = new Vertex[MAX_VERTEX];
        adjMat = new int[MAX_VERTEX][MAX_VERTEX];
        nVertices = 0;   //初始化顶点个数为0
        stack = new StackDepth();
        queue = new QueueBreadth();

        //初始化邻接矩阵所有元素都为0，即没有边
        for (int i = 0; i < MAX_VERTEX; i++) {
            for (int j = 0; j < MAX_VERTEX; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    /**
     * 添加顶点，默认为未访问（isVisited = false）
     *
     * @param label 顶点信息
     */
    public void addVertex(char label) {
        Vertex newVertex = new Vertex(label);
        verticesList[nVertices++] = newVertex; //顶点个数+1
    }

    /**
     * 用邻接矩阵表示边（注意：邻接矩阵是对称的）
     *
     * @param start 起始点
     * @param end   终点
     */
    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;   //两部分都要赋值
    }

    /**
     * 打印某个顶点的信息
     *
     * @param index 顶点下标
     */
    public void printVertex(int index) {
        System.out.print(verticesList[index].label+" ");
    }

    /**
     * 深度优先搜索
     * (1)用peek()方法测试栈顶元素
     * (2)用getUnvisitedVertex()方法找到与当前顶点相连且没有被访问的顶点
     * (3)如果第二步返回值不为-1，表示满足条件，将该顶点入栈并设为已访问
     * 如果返回值为-1，表示找不到满足条件的，栈顶元素出栈
     */
    public void depthFirstSearch() {
        if (verticesList.length > 0) {
            verticesList[0].isVisited = true;   //首先访问第一个元素
            printVertex(0);  //打印第一个元素
            stack.push(0);  //第一个元素入栈

            while (!stack.isEmpty()) {
                int v = stack.peek();  //获取栈顶元素(此时元素还没有出栈)
                int i = getUnvisitedVertex(v);  //获取邻接顶点
                if (i == -1) {   //没有满足条件的
                    stack.pop();   //栈顶元素出栈
                } else {
                    verticesList[i].isVisited = true;  //先标记为已访问
                    stack.push(i);    //入栈
                    printVertex(i);
                }
            }
            //搜索完成后，重置访问信息，以便下次使用
            for (int i = 0; i < nVertices; i++) {
                verticesList[i].isVisited = false;
            }
        }
    }

    /**
     * 广度优先搜索
     * (1)用remove()方法测试队列头部元素（该顶点实际上已出列）
     * (2)用getUnvisitedVertex()方法找到与当前顶点邻接且没有被标记的顶点
     * (3)如果第二步返回-1，即没有满足条件的顶点，直接继续循环
     * 如果返回不为-1，则将返回的顶点标记为已访问并放入队列
     */
    public void breadthFirstSearch() {
        verticesList[0].isVisited = true;   //首先访问第一个顶点
        printVertex(0);    //打印第一个顶点
        queue.insert(0);   //插入队列中
        int v2;
        while (!queue.isEmpty()) {
            int v = queue.remove();   //取出队首元素（此时元素已经被移出队列）
            while ((v2 = getUnvisitedVertex(v)) != -1) {  //能找到符合条件的顶点v2
                verticesList[v2].isVisited = true;  //标记为已访问
                printVertex(v2);   //打印
                queue.insert(v2);   //插入队列尾部
            }
        }
        //搜索完成后，重置数组
        for (int i = 0; i < nVertices; i++) {
            verticesList[i].isVisited = false;
        }
    }

    /**
     * 获取与v顶点相连且未被访问的顶点
     *
     * @param v 顶点V
     * @return 满足条件的顶点下标
     */
    private int getUnvisitedVertex(int v) {
        for (int i = 0; i < nVertices; i++) {
            if (adjMat[v][i] == 1 && !verticesList[i].isVisited) {
                return i;  //可能会有多个满足的，这里返回的是最前面那个
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MyGraph myGraph = new MyGraph();
        myGraph.addVertex('A');
        myGraph.addVertex('B');
        myGraph.addVertex('C');
        myGraph.addVertex('D');
        myGraph.addVertex('E');
        myGraph.addVertex('F');
        myGraph.addVertex('G');
        myGraph.addVertex('H');
        myGraph.addVertex('I');
        myGraph.addEdge(0,1);
        myGraph.addEdge(0,2);
        myGraph.addEdge(0,3);
        myGraph.addEdge(0,4);
        myGraph.addEdge(1,5);
        myGraph.addEdge(7,5);
        myGraph.addEdge(3,6);
        myGraph.addEdge(6,8);
        System.out.println("深度优先：");
        myGraph.depthFirstSearch();
        System.out.println();
        System.out.println("---------------------");
        System.out.println("广度优先：");
        myGraph.breadthFirstSearch();
    }
}
