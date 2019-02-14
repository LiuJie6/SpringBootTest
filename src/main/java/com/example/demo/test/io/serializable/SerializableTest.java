package com.example.demo.test.io.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Project Name:SpringBootTest
 * File Name:SerializableTest
 * Package Name:com.example.demo.test.io.serializable
 * Date:2018/11/28
 * Author:liujie
 * Description:序列化测试（即将数据对象存储到磁盘文件或传输到其他网络节点，即将数据对象转为二进制串）
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class SerializableTest {

    /**
     * 将Person对象序列化
     *
     * @throws Exception 异常
     */
    private static void testSerializable() throws Exception {
        File file = new File("E:\\Test\\serializable\\a.txt");
        OutputStream out = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
        objectOutputStream.writeObject(new Person(16, "张三"));
        objectOutputStream.close();
    }

    public static void main(String[] args) throws Exception{
        testSerializable();
    }
}
