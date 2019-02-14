package com.example.demo.test.staticPackge.staticInnerClass;

/**
 * Project Name:SpringBootTest
 * File Name:StaticInnerClassDemo
 * Package Name:com.example.demo.test.staticPackge
 * Date:2019/2/14
 * Author:liujie
 * Description:静态内部类示例
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class StaticInnerClassDemo {

    private int id;
    private String name;
    private int age;

    private StaticInnerClassDemo(Builder builder){
        setId(builder.id);
        setAge(builder.age);
        setName(builder.name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    //静态内部类
    public static final class Builder{
        private int id;
        private String name;
        private int age;

        public Builder(){
        }

        public Builder id(int val){
            id = val;
            return this;
        }

        public Builder name(String val){
            name = val;
            return this;
        }

        public Builder age(int val){
            age = val;
            return this;
        }

        public StaticInnerClassDemo build(){
            return new StaticInnerClassDemo(this);
        }
    }

    public static Builder newBuilder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "StaticInnerClassDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
