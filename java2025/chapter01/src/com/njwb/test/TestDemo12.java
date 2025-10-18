package com.njwb.test;

public class TestDemo12 {
    public static void main(String[] args) {
        int a =10 ;
        //可以将一个数据范围小的变量存储到数据范围大的空间中。
        double b = a ;
        System.out.println(b);
        //不能将一个数据范围大变量存储到了一个数据范围小的空间中
        //可以通过强制类型转换，丢失精度。
        int c = (int)b  ;
        System.out.println(c);

        //a+b这个表达式会自动提升为double类型
        int d = (int)(a+b);

    }
}
