package com.example.demo.test.dataStructureAndArithmetic.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Project Name:SpringBootTest
 * File Name:BLMap
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.map
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
 * 2、haspMap继承自AbstractMap；hashTable继承自Dictionary（已废弃）
 * 3、haspMap允许key为null（此时value存储在table[0]的位置），同时允许value为null；hashTable的key和value都不允许为null
 * 4、初始容量大小和每次扩充容量大小不同
 *    （1）hashMap的初始大小为16，每次扩充时变为原来的2倍；hashTable的初始大小为11，每次扩充时变为原来的2n+1
 *    （2）由（1）可知，hashMap中hash表的大小为2的幂；hashTable中hash表的大小为素数、奇数
 *    （3）hashMap的侧重点时hash的计算效率，但哈希冲突更严重；hashTable的侧重点是哈希的结果更加均匀，但效率更低
 * 5、计算hash值的方式不同
 *    （1）hashMap在取模时不用做除法运算（哈希表的大小为2的幂），只需要位运算；而hashTable直接使用对象的hashCode，
 *         需要进行除法运算（除法运算效率低）
 */
