package com.njwb.test;

import java.util.*;

public class Exce10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int days=0;
        System.out.print("请输入年份：");
        int year=input.nextInt();
        System.out.print("请输入月份：");
        int month=input.nextInt();
        System.out.print("请输入日期：");
        int day=input.nextInt();

        int[] a={31,28,31,30,31,30,31,31,30,31,30,31};
        int[] b={31,29,31,30,31,30,31,31,30,31,30,31};

        if((year%4==0&&year%100!=0)||(year%400==0)){
            for(int i=0;i<month-1;i++){
                days+=b[i];
            }
            days+=day;
            System.out.println(month+"月"+day+"日是"+year+"年的第"+days+"天");
        }
        else{
            for(int i=0;i<month-1;i++){
                days+=a[i];
            }
            days+=day;
            System.out.println(month+"月"+day+"日是"+year+"年的第"+days+"天");
        }
    }
}