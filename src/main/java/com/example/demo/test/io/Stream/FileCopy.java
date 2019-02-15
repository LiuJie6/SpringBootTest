package com.example.demo.test.io.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Project Name:SpringBootTest
 * File Name:FileCopy
 * Package Name:com.example.demo.test.io.Stream
 * Date:2018/11/28
 * Author:liujie
 * Description:用字节流完成文件的复制
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class FileCopy {

    private static void copy() throws Exception {
        //(1)创建源、目标文件对象
        File src = new File("E:" + File.separator + "Test" + File.separator + "create" + File.separator + "a.txt");
        File target = new File("E:\\Test\\create\\b.txt");
        //(2)创建流对象
        FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(target);
        //(3)读取和写入操作
        byte[] buffer = new byte[2];
        int len;   //表示读取了多少字节，-1表示已经读到了末尾
        int i = 0;
        while ((len = in.read()) != -1) {
            //打印读取的数据
            System.out.println(++i);   //如果使用缓存数组（即in.read(buffer)）,每次读取buffer长度的字节数
            //如果不使用缓存数组（即in.read()）,每次都只读取一个字节
            //System.out.println(new String(buffer, 0, len) + " length:" + len);
            //写入数据
            out.write(len);
        }

       /* while ((len = in.read(buffer)) != -1) {
            System.out.println(buffer[0]+" "+buffer[1]);
            //打印读取的数据
            System.out.println(++i);
            System.out.println(new String(buffer, 0, len) + " length:" + len);
            //写入数据
            out.write(buffer, 0, len);
        }*/
        //(4)关闭流
        in.close();
        out.close();
    }

    public static void main(String[] args) throws Exception {
        copy();
    }
}
