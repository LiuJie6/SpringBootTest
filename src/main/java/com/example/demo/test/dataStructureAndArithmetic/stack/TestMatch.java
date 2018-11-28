package com.example.demo.test.dataStructureAndArithmetic.stack;

/**
 * Project Name:SpringBootTest
 * File Name:TestMatch
 * Package Name:com.example.demo.test.dataStructureAndArithmetic.stack
 * Date:2018/11/21
 * Author:liujie
 * Description:判断分隔符是否匹配
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class TestMatch {

    private void testMatch(String s) {
        MyStack leftStack = new MyStack(1);
        MyStack rightStack = new MyStack(1);
        MyStack realRightStack = new MyStack();
        int leftSize=0;
        int rightSize=0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            switch (c) {
                case '{':
                case '[':
                case '<':
                    leftStack.push(c);
                    break;
                case '}':
                case ']':
                case '>':
                    rightStack.push(c);
                    break;
                default:
                    break;
            }
        }
        while(!rightStack.isEmpty()){
            realRightStack.push(rightStack.pop());
            rightSize++;
        }
        while(!leftStack.isEmpty()){
            char leftChar = leftStack.pop().toString().toCharArray()[0];
            leftSize++;
            try {
                char rightChar = realRightStack.pop().toString().toCharArray()[0];
                if (leftChar == '{' && rightChar != '}'
                        || leftChar == '[' && rightChar != ']'
                        || leftChar == '<' && rightChar != '>') {
                    System.out.println("左右不匹配：" + leftChar + " ---- " + rightChar);
                    return;
                }
            }catch (Exception e){
                System.out.println("error:"+e.getMessage());
            }
        }
        if(leftSize != rightSize){
            System.out.println("两边数量不等");
        }else{
            System.out.println("匹配成功");
        }
    }

    public static void main(String[] args) {
        TestMatch testMatch = new TestMatch();
        testMatch.testMatch("1231<<a[{s}>]>");
    }
}
