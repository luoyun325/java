package com.njwb.test;

public class TestDemo11 {
    public static void main(String[] args) {
        int a =10 ;
        int b =20 ;
        System.out.println("交换前：a="+a);
        System.out.println("交换前：b="+b);

        int temp =a  ;

        a= b ;
        b = temp;


        System.out.println("交换后：a="+a);
        System.out.println("交换后：b="+b);

    }
}
