package com.njwb.test;

import java.util.*;

public class Exce05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}