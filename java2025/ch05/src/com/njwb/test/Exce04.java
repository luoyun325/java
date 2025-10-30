package com.njwb.test;

import java.util.*;

public class Exce04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        char a[]={'a','c','u','b','e','p','f','z'};
        System.out.print("原字符序列：");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();
        System.out.print("升序排列后：");
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();
        System.out.print("逆序输出为：");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }

        System.out.println();
        System.out.print("待插入的字符是：");
        char news=input.next().charAt(0);
        System.out.print("插入字符的下标是：");
        int num=input.nextInt();
        System.out.print("插入后的字符序列是：");
        for(int i=a.length-1;i>=num;i--){
            a[i]=a[i-1];
        }
        a[num-1]=news;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}