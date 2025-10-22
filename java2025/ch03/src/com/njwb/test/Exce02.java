package com.njwb.test;

import java.util.*;

public class Exce02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String goodName = null;
        int goodId = 0;
        int goodPrice = 0;
        int number = 0;
        String msg = "";
        double sum = 0;
        double discount = 1;

        do {
            System.out.println("MyShopping管理系统->购物结算");
            System.out.println("=================================================");
            System.out.println("请选择购买商品的编号:");
            System.out.println("1.mp3\t2.mp4\t3.iphone");
            System.out.println("=================================================");

            System.out.println("请输入商品的编号:");
            goodId = input.nextInt();

            System.out.println("请输入商品的数量:");
            number = input.nextInt();

            if (goodId == 1) {
                goodName = "mp3";
                goodPrice = 100;
            } else if (goodId == 2) {
                goodName = "mp4";
                goodPrice = 200;
            } else if (goodId == 3) {
                goodName = "iphone";
                goodPrice = 1000;
            }
            System.out.println(goodName + "¥" + goodPrice + "\t\t数量 " + number + "\t\t合计¥" + (goodPrice * number));

            sum = sum + goodPrice * number;
            System.out.println("是否继续（y/n）");
            msg = input.next();
        } while ("y".equals(msg));

        System.out.println("购物结束，开始计算最终价格。。。");
        System.out.println("本次购物的总金额为:" + sum);

        if (sum >= 5000) {
            discount = 0.6;
        } else if (sum >= 4000) {
            discount = 0.7;
        } else if (sum >= 3000) {
            discount = 0.8;
        } else if (sum >= 2000) {
            discount = 0.9;
        }
        System.out.println("折扣为: " + discount);

        double youPayMoney = sum * discount;
        System.out.println("应付金额为: " + youPayMoney);
        System.out.println("请输入实付金额: ");
        double realMoney = input.nextDouble();

        while (realMoney < youPayMoney) {
            System.out.println("金额不足，请重新输入: ");
            realMoney = input.nextDouble();
        }
        System.out.println("找零:" + (realMoney - youPayMoney));
    }
}