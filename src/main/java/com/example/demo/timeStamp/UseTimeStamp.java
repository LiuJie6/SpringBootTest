package com.example.demo.timeStamp;

import java.sql.Timestamp;

/**
 * Project Name:SpringBootTest
 * File Name:UseTimeStamp
 * Package Name:com.example.demo.timeStamp
 * Date:2018/8/1
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class UseTimeStamp {

    public static Timestamp getTime(){
        long timeLong = 1535760000000L;
        Timestamp time = new Timestamp(timeLong);
        return  time;
    }

    public static void main(String[] args){
        System.out.println(getTime());
    }
}
