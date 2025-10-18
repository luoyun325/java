package com.njwb.test;

import java.util.*;

public class Exce02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("输入打篮球人数：");
        int num=input.nextInt();
        if(num<10){
            System.out.println("打半场");
        }
        else{
            System.out.println("打全场");
        }
    }
}