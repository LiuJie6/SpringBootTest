package com.example.demo.test.Java8.interfaceTest.impl;

import com.example.demo.test.Java8.interfaceTest.api.IJava8;

/**
 * Project Name:SpringBootTest
 * File Name:Java8Impl
 * Package Name:com.example.demo.test.Java8.interfaceTest.impl
 * Date:2018/7/31
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class Java8Impl implements IJava8{

    @Override
    public String defaultMethod(){
        return "override implementation";
    }
}
