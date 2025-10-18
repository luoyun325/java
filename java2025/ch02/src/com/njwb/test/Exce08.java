package com.njwb.test;

import java.util.*;

public class Exce08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("输入成绩：");
        int score=input.nextInt();
        if(score>=90){
            System.out.println("等级是A");
        }
        else if(score>=80&&score<90){
            System.out.println("等级是B");
        }
        else if(score>=70&&score<80){
            System.out.println("等级是C");
        }
        else if(score>=60&&score<70){
            System.out.println("等级是D");
        }
        else{
            System.out.println("等级是E");
        }
    }
}