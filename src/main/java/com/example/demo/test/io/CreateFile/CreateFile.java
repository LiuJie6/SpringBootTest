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


/**
 * File类的相关用法
 */
public class CreateFile {

    /**
     * 构造File,此时文件还不存在
     */
    private static void structureFile() {
        File file = new File("E:\\Test\\test.txt"); //这种写法只能在windows下使用
        //File.separator表示文件路径分隔符，通用
        File file2 = new File("E:" + File.separator + "Test" + File.separator + "text.txt");
        System.out.println("文件路径：" + file.getAbsolutePath());
        System.out.println("文件路径：" + file2.getAbsolutePath());
    }

    /**
     * 创建文件
     * 首先判断目录是否存在，不存在则mkdir()或mkdirs()创建目录
     */
    private static void createFile() throws Exception {
        File dir = new File("E:" + File.separator + "Test" + File.separator + "create");
        File file = new File(dir, "b.txt");
        if (!(dir.exists() || dir.isDirectory())) {
            dir.mkdirs();   //创建目录
            file.createNewFile();     //创建文件

        } else {
            file.createNewFile();
        }
        System.out.println(file.getAbsolutePath() + " ");
    }

    /**
     * 打印给定目录下的所有文件
     *
     * @param file 给定的目录
     */
    private static void getFileList(File file) {
        File[] files = file.listFiles();
        if (files != null && files.length > 0) {
            for (File f : files) {
                System.out.println(f.getAbsolutePath());
                if (f.isDirectory()) {
                    getFileList(f);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        //structureFile();
        //createFile();
        getFileList(new File("E:" + File.separator + "Test"));
    }
}
