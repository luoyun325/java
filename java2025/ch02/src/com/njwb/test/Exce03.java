package com.njwb.test;

import java.util.*;

public class Exce03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("输入体温");
        double num=input.nextDouble();
        if(num<38){
            System.out.println("一切正常");
        }
        else{
            System.out.println("去医院挂点滴");
        }
    }
}