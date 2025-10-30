package com.njwb.test;

import java.util.*;

public class Test01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double a[]=new double[5];
        double all=0;
        System.out.println("请输入会员本月的消费记录");
        for(int i=0;i<a.length;i++){
            System.out.print("请输入第"+(i+1)+"笔购物金额：");
            a[i]=input.nextDouble();
            all+=a[i];
        }
        System.out.println();
        System.out.println("序号\t\t\t金额（元）");
        for(int i=0;i<a.length;i++){
            System.out.println((i+1)+"\t\t\t"+a[i]);
        }
        System.out.println("总金额\t\t"+all);
    }
}