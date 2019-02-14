package com.example.demo.test.io.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

/**
 * Project Name:SpringBootTest
 * File Name:InputStreamTest
 * Package Name:com.example.demo.test.io.Stream
 * Date:2018/11/28
 * Author:liujie
 * Description:输入流（将内容从文件写入程序）
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class InputStreamTest {

    private static void testInputStream() throws Exception {
        //(1)构建File对象
        File src = new File("E:" + File.separator + "Test" + File.separator + "create" + File.separator + "a.txt");
        //(2)构建FileInputStream对象
        FileInputStream inputStream = new FileInputStream(src);
        //(3)具体io操作
        byte[] buffer = new byte[10];  //创建一个容量为10的byte[]，用于缓存数据
        byte[] buffer2 = new byte[10];  //创建一个容量为10的byte[]，用于缓存数据
        /*inputStream.read(buffer);    //获取src中的内容（的前10个字节）,并存储到buffer中
        System.out.println(Arrays.toString(buffer));
        System.out.println(new String(buffer));*/
        try {
            int result = inputStream.read(buffer2, 0, 3); //获取src中从0到3（不包含3）的字节，并存储到buffer2中
            System.out.println("result:"+result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(Arrays.toString(buffer2));
        System.out.println(new String(buffer2) + " ");

        //(4)关闭流
        inputStream.close();
    }

    public static void main(String[] args) throws Exception {
        testInputStream();
    }
}
