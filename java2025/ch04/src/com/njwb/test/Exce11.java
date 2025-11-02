package com.njwb.test;

import java.util.*;

public class Exce11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("请输入年份：");
        int year = input.nextInt();
        System.out.println("请输入月份：");
        int month = input.nextInt();
        System.out.println("请输入日：");
        int day = input.nextInt();

        //保存是否是否是闰年
        boolean isLeapYear = false;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            isLeapYear = true;
        }
        //计算总天数
        int allDay = 0;

        for (int i = 1; i < month ; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    allDay += 31;
                    break;
                case 4:
                case 6:
                case 9:
                    allDay += 30;
                    break;
                case 2:
                    allDay += 28;
                    break;
            }
        }
        //针对闰年，并且当前月大于2月份的情况
        if (isLeapYear && month>=3) {
            allDay++ ;
        }
        allDay+=day;

        for(int start=1900;start<year;start++){
            if ((start % 4 == 0 && start % 100 != 0) || start % 400 == 0) {
                allDay+=366;
            }else {
                allDay+=365;
            }
        }

        System.out.println("总天数：" + (allDay));

        int week = allDay%7 ;

        switch (week) {
            case 0:
                System.out.println("周日");
                break;
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
        }
    }
}
