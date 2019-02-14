package com.example.demo.timeStamp;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

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

    public static Timestamp getTime() {
        long timeLong = 1548691200000L;
        Timestamp time = new Timestamp(timeLong);
        Date date = new Date(time.getTime());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);
        System.out.println(year + "-" + month + "-" + day);
        return time;
    }

    public static void main(String[] args) {
        System.out.println(getTime());
    }
}
