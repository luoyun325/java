package com.njwb.test;

public class TestDemo07 {
    public static void main(String[] args) {
        //关系运算符会返回一个boolean类型值
//        int a=10,b=10;
//        System.out.println(a>b);
//        System.out.println(a<b);
//        System.out.println(a==b);
//        System.out.println(a!=b);


        int c = 20 ;
        //d=c ;c = c+1
        int d = c++ ;

        System.out.println(c);
        System.out.println(d);


        int e =20 ;
        // e =e +1 ;f=e ;
        int f = ++e ;

        System.out.println(e);
        System.out.println(f);

    }
}
