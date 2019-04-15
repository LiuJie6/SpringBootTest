package com.example.demo.test.io.charProcess;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
import java.util.UUID;

/**
 * Project Name:SpringBootTest
 * File Name:CharReadAndWriter
 * Package Name:com.example.demo.test.io.charProcess
 * Date:2018/11/20
 * Author:liujie
 * Description:字符流的读取与写入
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class CharReadAndWriter {

    /**
     * 使用FileReader读取文件内容，FileWriter写入
     *
     * @param fromPath 读取的文件地址
     * @param toPath   写入的文件地址
     */
    private static void charRAW(String fromPath, String toPath) throws Exception {
        FileReader fileReader = new FileReader(fromPath);
        char[] buff = new char[16];   //用于存储文件内容的字符数组
        int result = fileReader.read(buff);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(buff);
        System.out.println("文本信息：" + stringBuilder);
        FileWriter fileWriter = new FileWriter(toPath);
        if (result > 0) {
            fileWriter.write(stringBuilder.toString());
        }
        fileWriter.close();
        System.out.println("写入文件成功");
    }

    /**
     * 使用inputStreamReader读取文件，outputStreamReader写入文件
     * 将字节流转换为字符流，防止乱码
     *
     * @param fromPath 读取文件地址
     * @param toPath   写入文件地址
     */
    private static void testStreamReader(String fromPath, String toPath) throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(fromPath), "GBK");
        char[] buff = new char[512];
        StringBuilder stringBuilder = new StringBuilder();
        if (inputStreamReader.read(buff) > 0) {
            stringBuilder.append(buff);
        }
        System.out.println("文本信息：" + stringBuilder.toString());
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(toPath), "GBK");
        outputStreamWriter.write(stringBuilder.toString());
        outputStreamWriter.close();
    }

    public static void main(String[] args) {
        /*try {
            //charRAW("E:\\Test\\SpringBootTest\\read.txt", "E:\\Test\\SpringBootTest\\write.txt");
            testStreamReader("E:\\Test\\SpringBootTest\\read.txt", "E:\\Test\\SpringBootTest\\write.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
        Double[] array = new Double[0];
    }

    /**
     * 1 磁盘I/O优化
     * (1)增加缓存，减少IO访问次数
     * (2)优化磁盘的管理系统，设计最有的磁盘访问策略，以及磁盘寻址策略
     *
     * 2 网络I/O优化
     * (1)减少交互次数
     * (2)减小网络数据传输量的大小
     * (3)尽量减少编码
     * (4)根据应用场景设计合适的交互方式
     */
}
