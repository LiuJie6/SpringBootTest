package com.example.demo.test.io.CreateFile;

import java.io.File;

/**
 * Project Name:SpringBootTest
 * File Name:CreateFile
 * Package Name:com.example.demo.test.io.CreateFile
 * Date:2018/11/2
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class CreateFile {
    private static void createFile(){
        File file = new File("E:\\Test\\test.txt");
        System.out.println("文件路径："+file.getAbsolutePath());
        System.out.println("文件大小："+file.length());
    }

    public static void main(String[] args) {
        createFile();
    }
}
