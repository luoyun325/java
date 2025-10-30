package com.njwb.test;

import java.util.*;

public class Exce03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int c=0;
        int a[]={34,67,12,99,5};
        System.out.print("输入一个数字：");
        int b=input.nextInt();
        for(int i=0;i<a.length;i++){
            if(b==a[i]){
                c+=1;
                System.out.println("数列中包含次数");
                break;
            }
        }
        if(c==0){
            System.out.println("数列中不包含次数");
        }
    }
}