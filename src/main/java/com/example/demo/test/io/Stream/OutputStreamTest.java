package com.example.demo.test.io.Stream;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Project Name:SpringBootTest
 * File Name:OutputStreamTest
 * Package Name:com.example.demo.test.io.Stream
 * Date:2018/11/28
 * Author:liujie
 * Description:输出流（将内容从程序写到文件中）
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class OutputStreamTest {

    private static void testOutputStream() throws Exception{
        //(1)构建File对象
        File target = new File("E:"+File.separator+"Test"+File.separator+"create"+File.separator+"a.txt");
        //(2)构建FileOutputStream对象,Boolean参数：true表示在后面加，false表示直接覆盖
        FileOutputStream outputStream = new FileOutputStream(target,true);
        //(3)具体IO操作
        outputStream.write(66);  //把B写入文件
        outputStream.write("Aa".getBytes());   //把Aa写入文件
        outputStream.write("ABCDEFG".getBytes(),1,5); //把BCDEF写入文件
        //(4)关闭io流
        outputStream.close();
    }

    public static void main(String[] args) throws Exception{
        testOutputStream();
    }
}
