package com.example.demo.test.Java8.stream;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Project Name:SpringBootTest
 * File Name:StreamTest
 * Package Name:com.example.demo.test
 * Date:2018/7/31
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class StreamTest {

    public static void main(String[] args){
        //testMapAndFlapMap();
        testLambda();
    }

    public static void testMapAndFlapMap(){
        List<String> strs = Arrays.asList("好，好，学","习，天，天","向，上");
        List<String[]> strArray = strs
                .stream()
                .map(str -> str.split(","))
                .collect(Collectors.toList());
        JSONArray jsonArray = (JSONArray) JSON.toJSON(strArray);
        System.out.println("strArray ->"+jsonArray.toString());

        List<String> strList = strs
                .stream()
                .map(str -> str.split(","))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println("strList ->"+strList);
    }

    public static void testLambda(){
        Arrays.asList(3,1,2).sort((e1,e2) ->
        {
            int result = e1.compareTo(e2);
            System.out.println(result);    //-1,1,-1,1  1与3比（-1），2与1比（1），2与3比（-1），2与1比（1）
            return result;
        });
    }

}
