package com.example.demo.test.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/**
 * Project Name:SpringBootTest
 * File Name:CalendarTest
 * Package Name:com.example.demo.test.calendar
 * Date:2018/8/2
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class CalendarTest {

    static Calendar calendar = Calendar.getInstance();  //Calendar是一个abstract，无法直接new

    public static void getTest(){
        calendar.setTime(new Date());
        System.out.println("today in this week："+calendar.get(Calendar.DAY_OF_WEEK));  //本周的第几天，周日为第一天
        System.out.println("today in this month:"+calendar.get(Calendar.DAY_OF_MONTH));

        calendar.clear();  //避免继承当前系统的时间
        calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH)+10);
        System.out.println("ten days after today:"+calendar.get(Calendar.DAY_OF_MONTH));
    }

    /**
     * 计算该年中的该月有几天
     * @param year 年份
     * @param month 月份（注意：月份为0-11，即1月为0）
     */
    public static void MaxDays(int year,int month){
        calendar.clear();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month-1);
        int day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月有"+day+"天");
    }

    /**
     * 计算某一天是该年或该月的那个星期
     * @param year 年份
     * @param month 月份
     * @param day 天数
     */
    public static void weekNum(int year,int month,int day){
        calendar.clear();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month-1);
        calendar.set(Calendar.DATE,day);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println(year+"年"+month+"月"+day+"日是这一年的第"+weekOfYear+"星期");

        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日是这一年这个月的第"+weekOfMonth+"星期");
    }

    public static void main(String[] args){
        //getTest();
        //MaxDays(2018,2);
        weekNum(2018,8,2);
    }
}
