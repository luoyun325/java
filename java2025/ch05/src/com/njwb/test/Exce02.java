package com.njwb.test;

import java.util.*;

public class Exce02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int yuan=0;
        int fu=0;
        System.out.print("输入一个单词：");
        String word=input.next();
        char[] words=word.toCharArray();
        for(int i=0;i<words.length;i++){
            if(words[i]=='a'||words[i]=='e'||words[i]=='i'||words[i]=='o'||words[i]=='u'){
                yuan+=1;
            }
            else{
                fu+=1;
            }
        }
        System.out.println("元音个数为："+yuan);
        System.out.println("辅音个数为："+fu);
    }
}