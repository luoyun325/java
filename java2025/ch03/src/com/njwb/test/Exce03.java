package com.njwb.test;

import java.util.*;

public class Exce03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String rightName="Jim";
        String rightPassword="123456";
        for(int i=3;i>0;){
            System.out.print("请输入用户名：");
            String name=input.next();
            System.out.print("请输入密码：");
            String password=input.next();
            if(name.equals(rightName)&&password.equals(rightPassword)){
                System.out.println("欢迎登录MyShopping系统！");
                break;
            }
            else{
                i--;
                System.out.println("输入错误！您还有"+i+"次机会！");
            }
        }
    }
}