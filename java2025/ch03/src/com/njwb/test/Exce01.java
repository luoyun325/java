package com.njwb.test;

import java.util.*;

public class Exce01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num=0;
        int i=1;
        while(i<=10){
            if(i%2==0){
                num+=i;
            }
            i++;
        }
        System.out.println("1-10之间所有偶数和为"+num);
    }
}