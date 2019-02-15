package com.example.demo.test.io.RandomAccessFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;

/**
 * Project Name:SpringBootTest
 * File Name:RandomAccessFileDemo
 * Package Name:com.example.demo.test.io.RandomAccessFile
 * Date:2019/2/14
 * Author:liujie
 * Description:文件随机读写
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class RandomAccessFileDemo {

    //推荐网址：https://www.cnblogs.com/zuochengsi-9/p/6485737.html

    /**
     * 向任意位置插入数据
     *
     * @param fileName      文件地址
     * @param point         插入点
     * @param insertContent 插入内容
     */
    public static void insert(String fileName, int point, String insertContent) {
        try {
            File temp = File.createTempFile("temp", null);   //创建临时文件来保存插入后的数据
            FileOutputStream temOut = new FileOutputStream(temp);  //临时文件输出流
            FileInputStream temIn = new FileInputStream(temp);     //临时文件输入流
            temp.deleteOnExit();     //JVM退出时销毁

            RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
            raf.seek(point);     //raf的指针指向插入点

            byte[] buff = new byte[1024];

            int hasRead = 0;  //用于保存已经读取的字节数
            while ((hasRead = raf.read(buff)) > 0) {   //从指针处开始读？？
                temOut.write(buff, 0, hasRead);  // 将读取的数据写入临时文件中（读取的是插入点之后的数据）（此时指针在移动吗？？）
            }

            raf.seek(point);   //返回原来的插入处

            raf.write(insertContent.getBytes());   //插入数据（把插入点之后的数据覆盖了）

            while ((hasRead = temIn.read(buff)) > 0) {  //从临时文件中读取数据并写入到正式文件
                raf.write(buff, 0, hasRead);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        insert("C:\\Users\\liujie\\Desktop\\testFile\\3\\test.txt", 10, "\nlucene是一个优秀的全文检索库");
    }

}
