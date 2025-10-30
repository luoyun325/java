package com.njwb.test;

import java.util.*;

public class Test02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a[]=new int[4];
        System.out.println("请输入4家店的价格");
        for(int i=0;i<a.length;i++){
            System.out.print("第"+(i+1)+"家点的价格：");
            a[i]=input.nextInt();
        }
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("最低价格是："+min);
    }
}