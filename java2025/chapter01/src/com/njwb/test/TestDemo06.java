package com.njwb.test;

//导包操作
import java.util.Scanner;

public class TestDemo06 {
    public static void main(String[] args) {


        System.out.println("请从键盘中输入第一个数字：");
        Scanner input =new Scanner(System.in);

        //等待用户的输出，程序处于阻塞状态。
        int num1 = input.nextInt();

        System.out.println("请从键盘中输入第二个数字：");

        int num2 = input.nextInt() ;


        int sumValue= num1+num2 ;
        int subValue = num1-num2;
        int mulValue = num1*num2;
        int deValue = num1/num2;

        System.out.println(num1+"+"+num2+"="+sumValue);
        System.out.println(num1+"-"+num2+"="+subValue);
        System.out.println(num1+"*"+num2+"="+mulValue);
        System.out.println(num1+"/"+num2+"="+deValue);

    }
}
