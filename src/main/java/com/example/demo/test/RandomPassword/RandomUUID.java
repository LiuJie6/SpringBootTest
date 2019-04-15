package com.example.demo.test.RandomPassword;

import java.util.UUID;

/**
 * Project Name:SpringBootTest
 * File Name:RandomUUID
 * Package Name:com.example.demo.test.RandomPassword
 * Date:2019/4/11
 * Author:liujie
 * Description:
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */
public class RandomUUID {

    private static String generateInvoiceSerialNum() {
        // 20位的发票流水号
        int random = (int) ((Math.random() * 9 + 1) * 1000000);
        return System.currentTimeMillis() + String.valueOf(random);
    }

    public static void main(String[] args) {
        String uuid = generateInvoiceSerialNum();
        //System.out.println(uuid);
        System.out.println(UUID.randomUUID().toString());

    }
}
