package com.njwb.test;

import java.util.*;

public class Exce00 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String gift="无";
        System.out.print("请输入消费金额：");
        double money=input.nextDouble();

        System.out.println("是否参加优惠换购活动：");
        System.out.println("1：满50元，加2元换购百事可乐饮料1瓶");
        System.out.println("2：满100元，加3元换购500ml可乐一瓶");
        System.out.println("3：满100元，加10元换购5公斤面粉");
        System.out.println("4：满200元，加10元可换购1个苏泊尔炒菜锅");
        System.out.println("5：满200元，加20元可换购欧莱雅复肤水一瓶");
        System.out.println("0：不换购");

        System.out.print("请选择：");
        int choice=input.nextInt();

        switch(choice){
            case 1:
                if(money>=50){
                    money+=2;
                    gift="百事可乐饮料1瓶";
                    System.out.println("本次消费总金额："+money);
                    System.out.println("成功换购："+gift);
                }
                else{
                    System.out.println("消费未达50元");
                }
                break;
            case 2:
                if(money>=100){
                    money+=3;
                    gift="500ml可乐一瓶";
                    System.out.println("本次消费总金额："+money);
                    System.out.println("成功换购："+gift);
                }
                else{
                    System.out.println("消费未达100元");
                }
                break;
            case 3:
                if(money>=100){
                    money+=10;
                    gift="5公斤面粉";
                    System.out.println("本次消费总金额："+money);
                    System.out.println("成功换购："+gift);
                }
                else{
                    System.out.println("消费未达100元");
                }
                break;
            case 4:
                if(money>=200){
                    money+=10;
                    gift="1个苏泊尔炒菜锅";
                    System.out.println("本次消费总金额："+money);
                    System.out.println("成功换购："+gift);
                }
                else{
                    System.out.println("消费未达200元");
                }
                break;
            case 5:
                if(money>=200){
                    money+=20;
                    gift="欧莱雅复肤水一瓶";
                    System.out.println("本次消费总金额："+money);
                    System.out.println("成功换购："+gift);
                }
                else{
                    System.out.println("消费未达200元");
                }
                break;
            case 0:
                System.out.println("本次消费总金额："+money);
                break;
            default:
                System.out.println("输入无效");
        }
    }
}