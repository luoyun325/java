package com.njwb.test;

import java.util.Scanner;

public class TestDemo10 {
    public static void main(String[] args) {
        Scanner input=  new Scanner(System.in);
        //需求：从键盘录入两个数字，比较其大小，将最大的值付给c
        System.out.println("请输入第一个数字：");
        int a =input.nextInt() ;
        System.out.println("请输入第二个数字：");
        int b = input.nextInt();


        //三元运算符
        int c = a>b?a:b;
        System.out.println("c的值："+c);



        //||：短路或操作，发生短路：当第一个表达式为true时 ，第二个表达式就不会执行了。 =》然后直接返回true
        //|:普通或操作，不会发生短路，两个表达式都会去执行。
        //boolean c = b>a | a/(b-20)>0;





    }
}
