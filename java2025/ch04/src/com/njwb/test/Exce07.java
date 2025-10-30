package com.njwb.test;

import java.util.*;

public class Exce07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("请输入直角三角形的行数：");
        int n=input.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=(2*i-1);j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}