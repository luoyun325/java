package com.njwb.exec;

import java.util.Scanner;

public class Exec02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个四位数的会员卡号");
        //键盘录入，模拟数据的来源。
        if(input.hasNextInt()) {
            int cardNum = input.nextInt() ;
            if(cardNum>=1000&&cardNum<=9999) {
                int ge = cardNum%10 ;
                int shi = cardNum/10%10;
                int bai = cardNum/10/10%10 ;
                int qian = cardNum/10/10/10%10 ;
                int sum = ge+shi+bai+qian ;
                System.out.println("会员卡号"+cardNum+"各个位数之和为:"+sum);
                System.out.println("是幸运客户吗?"+(sum>20?"是":"否"));
            }else{
                System.out.println("对不起，你输入数字应该在1000-9999之间");
            }
        }else{
            System.out.println("对不起，请输入数字");
        }







    }
}
