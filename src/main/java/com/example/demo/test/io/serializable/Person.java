package com.example.demo.test.io.serializable;

import java.io.Serializable;

/**
 * Project Name:SpringBootTest
 * File Name:Person
 * Package Name:com.example.demo.test.io.serializable
 * Date:2018/11/28
 * Author:liujie
 * Description:用于序列化的实体类
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


/**
 * 用于序列化的实体类必须实现Serializable类
 */
public class Person implements Serializable {

    //该字段用来防止项目更新后反序列化失败
    private static final long serialVersionUID = 8656128222714547171L;

    transient private int age;   //添加transient表示该字段不用序列化

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
