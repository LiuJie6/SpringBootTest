package com.example.demo.test.deleteChar;

/**
 * Project Name:SpringBootTest
 * File Name:deleteCharInStr
 * Package Name:com.example.demo.test
 * Date:2018/10/25
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class deleteCharInStr {
    public static void main(String[] args) {
        String str = "<P style=\"TEXT-ALIGN: center\" align=center>重庆深化医药卫生体制改革 争取筹建中医药学院</P>";
        for (int j = 0;j<str.length();j++){
            //去除括号内的内容
            if (str.charAt(j) == '<'){
                int k = 0;
                for(k = j+1; k<str.length(); k++){
                    if (str.charAt(k) == '>'){
                        break;
                    }
                }
                str = str.substring(0,j)+ str.substring(k+1);
            }
        }
        System.out.println(str);
    }
}
