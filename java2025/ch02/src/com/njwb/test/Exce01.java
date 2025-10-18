package com.njwb.test;

import java.util.*;

public class Exce01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("输入硬币的正反面：");
        String mian=input.next();
        if(mian.equals("正面")){
            System.out.println("看java书");
        }
        else if(mian.equals("反面")){
            System.out.println("出去爬山");
        }
    }
}