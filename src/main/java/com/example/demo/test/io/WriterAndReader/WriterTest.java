package com.example.demo.test.io.WriterAndReader;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/**
 * Project Name:SpringBootTest
 * File Name:WriterTest
 * Package Name:com.example.demo.test.io.WriterAndReader
 * Date:2018/11/28
 * Author:liujie
 * Description:字符输入流
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class WriterTest {

    private static void testWriter() throws Exception{
        //(1)创建目标File对象
        File target = new File("E:\\Test\\WAR\\a.txt");
        //(2)创建writer对象
        Writer out = new FileWriter(target);
        //(3)IO操作
        out.write(65);   //把A写入文件
        out.write("你大爷的".toCharArray(),0,2);  //把“你大”写入文件
        out.write("Aa帅锅".toCharArray());
        out.write("Aa水果");
        //(4)关闭流
        out.close();
    }

    public static void main(String[] args) throws Exception{
        testWriter();
    }
}
