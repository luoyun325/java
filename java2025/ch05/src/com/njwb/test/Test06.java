package com.njwb.test;

import java.util.*;

public class Test06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int scores[]={99,85,82,63,30};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.print("输入一个数：");
        int a=input.nextInt();
        int index=scores.length;

        for(int i=0;i<scores.length;i++){
            if(a<scores[i]){
                index=i;
                break;
            }
        }

        int newScores[]=new int[scores.length+1];

        for(int i=0;i<newScores.length;i++){
            if(i<index){
                newScores[i]=scores[i];
            }
            else if(i==index){
                newScores[i]=a;
            }
            else{
                newScores[i]=scores[i-1];
            }
        }
        System.out.println(Arrays.toString(newScores));
    }
}