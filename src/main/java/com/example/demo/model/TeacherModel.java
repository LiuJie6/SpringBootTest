package com.example.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Project Name:SpringBootTest
 * File Name:TeacherModel
 * Package Name:com.example.demo.model
 * Date:2018/7/26
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */

@Component
@PropertySource("classpath:config/author.properties")
@ConfigurationProperties(prefix = "teacher")
public class TeacherModel {

    private String name;
    private int age;
    private String post;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
