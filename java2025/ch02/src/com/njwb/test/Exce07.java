package com.njwb.test;

import java.util.*;

public class Exce07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("输入今天星期几：");
        int day=input.nextInt();
        switch (day){
            case 1:
            case 3:
            case 5:
                System.out.println("去学校上课");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("到学校机房上自习");
                break;
            default:
                System.out.println("休息");
                break;
        }
    }
}