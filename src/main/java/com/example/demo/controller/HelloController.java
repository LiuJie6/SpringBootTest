package com.example.demo.controller;

import com.example.demo.model.StudentProperties;
import com.example.demo.model.TeacherModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project Name:SpringBootTest
 * File Name:HelloController
 * Package Name:com.example.demo
 * Date:2018/7/26
 * Author:liujie
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */

@RestController
public class HelloController {

    @Autowired
    private StudentProperties studentProperties;

    @Autowired
    private TeacherModel teacherModel;

    @RequestMapping(value = "/student",produces = "text/plain;charset=UTF-8")
    public String hello(){
        return (studentProperties.getName()+" "+studentProperties.getAge());
    }

    @RequestMapping(value = "/teacher",produces = "text/plain;charset=UTF-8")
    public String teacher(){
        return (teacherModel.getName()+" "+teacherModel.getAge()+" "+teacherModel.getPost());
    }
}
