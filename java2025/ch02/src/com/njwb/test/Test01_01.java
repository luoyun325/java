package com.njwb.test;

import java.util.*;

public class Test01_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("我行我素购物管理系统 > 幸运抽奖");
        System.out.print("请输入4位会员号：");
        int num=input.nextInt();
        int a=num/100%10;
        System.out.println("百位数是："+a);

        Random random=new Random();
        int value=random.nextInt(10);
        System.out.println("随机数字是："+value);

        if(a==value){
            System.out.println(num+"号客户是幸运客户，恭喜！");
        }
        else{
            System.out.println(num+"号客户，谢谢您的支持！");
        }
    }
}
