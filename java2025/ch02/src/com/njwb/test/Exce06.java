package com.njwb.test;

import java.util.*;

public class Exce06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("输入总分：");
        int score=input.nextInt();
        System.out.println("输入爱好：");
        String hobby=input.next();

        if(score>500){
            if(hobby.equals("java")){
                System.out.println("进入快班，进行jsp学习");
            }
            else if(hobby.equals("c#")){
                System.out.println("进入快班，进行ASP学习");
            }
        }
        else{
            if(hobby.equals("java")){
                System.out.println("进入慢班，进行SSH学习");
            }
            else if(hobby.equals("c#")){
                System.out.println("进入慢班，进行Net学习");
            }
        }
    }
}