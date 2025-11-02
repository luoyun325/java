package com.njwb.test;

import java.util.*;

public class Exce14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("输入一个4位整数：");
        int n=input.nextInt();
        int a=n%10;
        int b=n/10%10;
        int c=n/100%10;
        int d=n/1000;

        if (a%2==0){
            System.out.println("个位数是偶数");
        }
        else{
            System.out.println("个位数是奇数");
        }
        if (b%2==0){
            System.out.println("十位数是偶数");
        }
        else{
            System.out.println("十位数是奇数");
        }
        if (c%2==0){
            System.out.println("百位数是偶数");
        }
        else{
            System.out.println("百位数是奇数");
        }
        if (d%2==0){
            System.out.println("千位数是偶数");
        }
        else{
            System.out.println("千位数是奇数");
        }

        System.out.println("各位数字的和为"+(a+b+c+d));
    }
}