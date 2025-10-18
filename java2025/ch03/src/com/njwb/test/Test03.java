package com.njwb.test;

import java.util.*;

public class Test03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        for(int i=2000;i<=2025;i++){
            if((i%4==0&&i%100!=0)||i%400==0){
                System.out.println(i+"年是闰年");
            }
            else{
                System.out.println(i+"年不是闰年");
            }
        }
    }
}