package com.njwb.test;

import java.util.*;

public class Test01_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("请输入会员积分");
        int score=input.nextInt();
        double discount=0;

        if(score<2000){
            discount=0.9;
        }
        else if(score>=2000&&score<4000){
            discount=0.8;
        }
        else if(score>=4000&&score<8000){
            discount=0.7;
        }
        else{
            discount=0.6;
        }

        System.out.println("该会员享受的折扣是："+discount);
    }
}
