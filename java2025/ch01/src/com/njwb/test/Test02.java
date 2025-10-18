package com.njwb.test;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.print("STB的成绩是：");
        double STB=input.nextInt();
        System.out.print("Java的成绩是：");
        double Java=input.nextInt();
        System.out.print("SQL的成绩是：");
        double SQL=input.nextInt();

        System.out.println("------------------");

        System.out.println("STB   Java   SQL");
        System.out.println(STB+"\s\s"+Java+"\s\s\s"+SQL);

        System.out.println("------------------");

        System.out.println("Java和SQL的成绩差："+(Java-SQL));
        System.out.println("3门课的平均分是："+((STB+Java+SQL)/3));
    }
}
