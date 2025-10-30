package com.njwb.test;

import java.util.*;

public class Test03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int sum=0;
        int nums[]={8,4,2,1,23,344,12};
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
            sum+=nums[i];
        }

        System.out.println();

        System.out.print("请输入一个数字：");
        int searchNumber = input.nextInt();

        boolean flag = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == searchNumber) {
                flag = true;
                break;
            }
        }

        System.out.println(flag ? "存在" : "不存在");
    }
}