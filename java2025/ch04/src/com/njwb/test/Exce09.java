package com.njwb.test;

import java.util.*;

public class Exce09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num=0;
        for(int i=1;i<=5;i++){
            System.out.println("欢迎光临第"+i+"家专卖店");
            for(int j=1;j<=3;j++){
                System.out.print("要离开吗(y/n)？");
                String choice=input.next();
                if(choice.equals("n")){
                    System.out.println("买了一件衣服");
                    num+=1;
                }
                else{
                    System.out.println("离店结账");
                    break;
                }
            }
            System.out.println();
        }
        System.out.println("总共买了"+num+"件衣服");
    }
}