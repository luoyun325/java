package com.njwb.exec;

import java.util.Scanner;

public class Exec01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入数据库的成绩：");
        int scoreOfDataBase = input.nextInt();
        System.out.print("请输入Java的成绩：");
        int scoreOfJava = input.nextInt();
        System.out.print("请输入Html的成绩：");
        int scoreOfHtml = input.nextInt();

        System.out.println("----------------------------------");
        System.out.println("database\tjava\tHTML");
        System.out.println(scoreOfDataBase + "\t\t\t" + scoreOfJava + "\t\t" + scoreOfHtml);
        System.out.println("----------------------------------");

        System.out.println("数据库和java的成绩之差:" + (scoreOfDataBase - scoreOfJava));

        //int sum = scoreOfDataBase+scoreOfJava+scoreOfHtml;
        //int avg = sum/3 ;
        System.out.println("三门课的平均分是:" + ((scoreOfDataBase + scoreOfJava + scoreOfHtml) / 3));

    }
}
