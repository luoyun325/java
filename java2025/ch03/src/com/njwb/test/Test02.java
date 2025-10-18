package com.njwb.test;

import java.util.*;

public class Test02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num=1;
        double sheshi=10;
        do{
            double huashi=sheshi*9/5.0+32;
            System.out.println(huashi+"华氏度="+sheshi+"摄氏度");
            num++;
            sheshi+=20;
        }while(num<=10&&sheshi<=250);
    }
}