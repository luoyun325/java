package com.njwb.test;

import java.util.*;

public class Exce08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("请输入三角形的行数：");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}