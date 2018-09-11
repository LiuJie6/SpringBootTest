package com.example.demo.util.handle;


import java.sql.Timestamp;

/**
 * Project Name:SpringBootTest
 * File Name:HandleString
 * Package Name:com.example.demo.util.handle
 * Date:2018/7/26
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */

public class HandleString {

    public static long transformTime(String str){
        str = str.replace("T"," ");
        str = str.substring(0,str.length()-1);
        Timestamp timestamp = Timestamp.valueOf(str);
        long time = timestamp.getTime();
        System.out.println("timestamp类型："+timestamp+" "+"long类型："+time);
        return time;
    }

    public static void main(String[] args){
        transformTime("2018-08-09 23:59:59.999");
    }
}
