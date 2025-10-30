package com.njwb.test;

import java.util.*;

public class Exce02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        for(int i=1;i<=3;i++){
            double all=0;
            System.out.println("请输入第"+i+"个班级的成绩");
            for(int j=1;j<=4;j++){
                System.out.print("第"+j+"个学员的成绩：");
                double score=input.nextDouble();
                all+=score;
            }
            System.out.println("第"+i+"个班级参赛学员的平均分是："+(all/4));
            System.out.println();
        }
    }
}