package com.njwb.test;

import java.util.*;

public class Test05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String phones[]={"iphone4","iphone5","ipad","iphone6"};
        String a=null;
        int num=-1;
        for(int i=1;i<phones.length;i++){
            if(phones[i]=="ipad"){
                num=i;
                break;
            }
        }
        phones[num]=a;
        System.out.println(Arrays.toString(phones));
    }
}