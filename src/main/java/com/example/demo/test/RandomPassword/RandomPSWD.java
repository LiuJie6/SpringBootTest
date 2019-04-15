package com.example.demo.test.RandomPassword;

import java.util.Random;

/**
 * Project Name:SpringBootTest
 * File Name:RandomPSWD
 * Package Name:com.example.demo.test.RandomPassword
 * Date:2018/8/29
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */
public class RandomPSWD {

    /**
     * @param passwordType 密码类型
     * @param length       密码长度
     * @return 密码
     */
    private static String GainRandomPSWD(PasswordType passwordType, int length) {

        // （1）Math.random()函数返回值介于[0.0,1.0)之间，注意不要使用(int)Math.random()*3这种形式结果总是0，因为会先执行
        //    强制转换）
        // （2）random .nextInt(n):生成一个随机的int值，介于[0,n)

        String str = "";
        for (int i = 0; i < length; i++) {
            switch (passwordType) {
                case UpCase:
                    str += (char) (Math.random() * 26 + 'A');
                    break;
                case LowerCase:
                    str += (char) (Math.random() * 26 + 'a');
                    break;
                case NumberCase:
                    str += String.valueOf((int) (Math.random() * 10));
                    break;
                case MixCase:
                    Random random = new Random();
                    switch (random.nextInt(3)) {
                        case 0:
                            str += (char) (Math.random() * 26 + 'A');
                            break;
                        case 1:
                            str += (char) (Math.random() * 26 + 'a');
                            break;
                        case 2:
                            str += String.valueOf((int) (Math.random() * 10));
                            break;
                        default:
                            break;
                    }
                default:
                    break;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println("随机输出10位混合密码：" + GainRandomPSWD(PasswordType.MixCase, 36));
    }
}
