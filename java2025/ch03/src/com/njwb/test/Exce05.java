package com.njwb.test;

import java.util.*;

public class Exce05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        for(int i=100;i<1000;i++){
            int a=i%10;
            int b=i/10%10;
            int c=i/100%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }
    }
}