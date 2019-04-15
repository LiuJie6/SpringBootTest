package com.example.demo.timeStamp;

import com.example.demo.util.string.StringUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Project Name:SpringBootTest
 * File Name:DateFormat
 * Package Name:com.example.demo.timeStamp
 * Date:2019/3/25
 * Author:liujie
 * Description:时间格式化
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class DateFormat {

    /** 时间格式(yyyy-MM-dd) */
    public final static String DATE_PATTERN = "yyyy-MM-dd";
    /** 时间格式(yyyy-MM-dd HH:mm:ss) */
    public final static String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static String format(Date date, String pattern) {
        if (date != null) {
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            return df.format(date);
        }
        return null;
    }

    public static Date format(String date, String pattern) {
        if (StringUtil.isNotEmpty(date)) {
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            try {
                return df.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Date d = new Date(0);
        String time = format(d,DATE_TIME_PATTERN);
        System.out.println(time);
    }
}
