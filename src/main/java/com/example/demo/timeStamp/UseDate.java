package com.example.demo.timeStamp;


import net.sf.json.JSONObject;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Project Name:SpringBootTest
 * File Name:UseDate
 * Package Name:com.example.demo.timeStamp
 * Date:2019/3/14
 * Author:liujie
 * Description:
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */
public class UseDate {

    private static void date(){
        long time = System.currentTimeMillis();
        Date date = new Date(time);
        //System.out.println(date);

        Map<String,Object> map = new HashMap<>();
        map.put("isAccess",0);
        map.put("isWarning",1);
        map.put("personType",1);
        String result = map.toString();
        System.out.println(result);
        JSONObject jsonObject = JSONObject.fromObject(result);
        System.out.println(jsonObject);
        long personType = Long.valueOf(jsonObject.get("personType").toString());
        System.out.println(personType);
    }

    public static void main(String[] args) {
        date();
    }
}
