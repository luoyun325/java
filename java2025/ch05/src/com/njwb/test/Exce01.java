package com.njwb.test;

import java.util.*;

public class Exce01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a[]= {1,5,8,12,25,28,36};
        int num=0;
        int all=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                num+=1;
                all+=a[i];
            }
        }
        System.out.println("a[]中偶数的个数："+num);
        System.out.println("偶数的平均值："+(all/num));
    }
}