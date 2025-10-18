package com.njwb.test;

import java.util.*;

public class Test01_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("请输入是否是会员：是（y）/否（n）");
        String vip=input.next();
        System.out.println("请输入购物金额：");
        double money=input.nextDouble();

        if(vip.equals("y")){
            if(money>=200){
                money=money*0.75;
            }
            else{
                money=money*0.8;
            }
        }
        else{
            if(money>=100){
                money=money*0.9;
            }
            else{
                money=money;
            }
        }

        System.out.println("实际支付："+money);
    }
}
