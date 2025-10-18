package com.njwb.test;

public class TestDemo02 {
    public static void main(String[] args) {
        //声明一个变量用来保存字符串 [在内存中开辟一块空间]
        String name;
        //为name赋值
        name = "金正恩";
        //定义一个变量保存年龄
        int age ;

        age = 40 ;
        //定义一个变量保存他的独白
        String info;
        info = "我是地表最强80后";

        char sex = '男';

        System.out.println("我的名字叫"+name+",我今年"+age+"岁了,性别："+sex+","+info);

        //布尔类型
        boolean flag = false;

        //小数默认是double类型
        double score = 88.5f;
        System.out.println("考试考了："+score);



        String nameOfUsa = "特朗普";
        int  ageOfUsa = 80;
        String infoOfUsa = "不作死就不会死";
        System.out.println("我的名字叫"+nameOfUsa+"\n我今年"+ageOfUsa+"岁了。\n"+infoOfUsa);



    }
}
