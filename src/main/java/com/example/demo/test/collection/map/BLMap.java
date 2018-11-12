package com.example.demo.test.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Project Name:SpringBootTest
 * File Name:BLMap
 * Package Name:com.example.demo.test.collection.map
 * Date:2018/11/5
 * Author:liujie
 * Description:遍历map
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class BLMap {

    /**
     * 使用entrySet遍历，效率最高
     *
     * @param map map集合
     */
    private static void entrySetMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key:" + entry.getKey() + " value:" + entry.getValue());
        }
    }

    /**
     * 二次取值
     *
     * @param map map集合
     */
    private static void getKey(Map<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println("key:" + key + " value:" + map.get(key));
        }
    }

    private static void iteratorMap(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key:" + entry.getKey() + " value:" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "zhangsan");
        map.put("2", "lisi");
        map.put("3", "wangwu");
        entrySetMap(map);
        getKey(map);
    }
}

/**
 * hashMap与hashTable
 * 1、hashMap非线程安全，效率高，多线程中使用ConcurrentHashMap；hashTable是线程安全的，但效率低（已经废弃）
 * 2、haspMap继承自AbstractMap,hashTable继承自Dictionary
 */
