package com.njwb.test;

import java.util.*;

public class Exce01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int i=1;
        while(i<=100){
            if(i%7==0||i%13==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}