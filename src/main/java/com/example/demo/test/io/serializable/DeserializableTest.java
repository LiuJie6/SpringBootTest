package com.example.demo.test.io.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 * Project Name:SpringBootTest
 * File Name:DeserializableTest
 * Package Name:com.example.demo.test.io.serializable
 * Date:2018/11/28
 * Author:liujie
 * Description:反序列化（将二进制字符串转为数据对象）
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class DeserializableTest {

    private static void testDeserializable() throws Exception {
        InputStream in = new FileInputStream(new File("E:\\Test\\serializable\\a.txt"));
        ObjectInputStream ois = new ObjectInputStream(in);
        Person p = (Person) ois.readObject();
        System.out.println(p);
        ois.close();
    }

    public static void main(String[] args) throws Exception{
        testDeserializable();
    }
}
