package com.njwb.exec;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exce03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String goodName1="mp3",goodName2="mp4",goodName3="md1";
        int price1=100,price2=200,price3=300;
        int goodNum1=2,goodNum2=1,goodNum3=1 ;
        System.out.println("================消费清单==================");
        System.out.println("商品\t\t单价\t\t数量\t\t金额");
        System.out.println(goodName1+"\t\t"+price1+"\t\t"+goodNum1+"\t\t"+(goodNum1*price1));
        System.out.println(goodName2+"\t\t"+price2+"\t\t"+goodNum2+"\t\t"+(goodNum2*price2));
        System.out.println(goodName3+"\t\t"+price3+"\t\t"+goodNum3+"\t\t"+(goodNum3*price3));

        int totalMoney = goodNum1*price1+goodNum2*price2+goodNum3*price3;

        double discount = totalMoney>500?0.7:0.8;

        System.out.println("折扣为："+(int)(discount*10)+"折");

        double lastTotalMoney = totalMoney*discount;

        System.out.println("消费总金额为："+totalMoney+",折扣后的价格为："+lastTotalMoney);

        System.out.println("请输入实际缴费：");

        double realMoney = input.nextDouble() ;

        double result = realMoney-lastTotalMoney ;


        System.out.println("找零："+result);




        System.out.println("本次购物所获得的积分为："+(totalMoney/10));


    }
}
