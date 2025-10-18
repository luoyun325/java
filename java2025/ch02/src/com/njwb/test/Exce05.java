package com.njwb.test;

import java.util.*;

public class Exce05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("输入一个年份：");
        int year=input.nextInt();
        if((year%4==0&&year%100!=0)||year%400==0){
            System.out.println(year+"年是闰年");
        }
        else{
            System.out.println(year+"年不是闰年");
        }
    }
}