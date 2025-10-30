package com.njwb.test;

import java.util.*;

public class Exce04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}