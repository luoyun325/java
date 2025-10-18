package com.njwb.test;

import java.util.*;

public class Test01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int year=2012;
        double student=25;
        while (student<100){
            year++;
            student*=1.25;
            System.out.println(year+"年学员人数"+student+"万");
        }

        System.out.println("到"+year+"年培训学员人数将达到100万人");
    }
}