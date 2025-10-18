package com.njwb.test;

import java.util.*;

public class Exce04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("输入时间");
        int time=input.nextInt();
        if(time<12){
            System.out.println("按时提交");
        }
        else{
            System.out.println("抄代码20遍");
        }
    }
}