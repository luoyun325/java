package com.njwb.test;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入4位会员卡号：");
        int uid = input.nextInt();
        int a = uid % 10;
        int b = uid / 10 % 10;
        int c = uid / 100 % 10;
        int d = uid / 1000;
        System.out.println("会员卡号" + uid + "各位之和：" + (a + b + c + d));
        System.out.println("是幸运客户吗？" + (a + b + c + d > 20 ? true : false));
    }
}
