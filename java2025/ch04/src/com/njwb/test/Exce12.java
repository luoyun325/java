package com.njwb.test;

import java.util.*;

public class Exce12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String rightName="ZhangSan";
        String rightPassword="123456";
        for(int i=3;i>0;){
            System.out.print("请输入用户名：");
            String name=input.next();
            System.out.print("请输入密码：");
            String password=input.next();
            if(name.equals(rightName)&&password.equals(rightPassword)){
                while(true){
                    System.out.print("输入取钱金额：");
                    int amount=input.nextInt();
                    if(amount%100==0&&amount>=0&&amount<=1000){
                        System.out.println("成功取出"+amount+"元");
                        System.out.println("交易完成，请取卡");
                        break;
                    }
                    else{
                        System.out.println("请重新输入金额");
                    }
                }
                break;
            }
            else{
                i--;
                System.out.println("输入错误！您还有"+i+"次机会！");
                if(i==0){
                    System.out.println("密码错误，请取卡");
                }
            }
        }

    }
}