package com.njwb.test;

import java.util.*;

public class Test04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Random random=new Random();

        int count=0;
        int playerScore=0;
        int roleScore=0;

        System.out.println("******************");
        System.out.println("*****猜拳，开始*****");
        System.out.println("******************");
        System.out.println("出拳规则：1.剪刀 2.石头 3.布");
        System.out.print("请选择对方角色（1.刘备 2.孙权 3.曹操）:");
        int role=input.nextInt();
        String roleName=(role==1?"刘备":role==2?"孙权":"曹操");

        System.out.print("请输入你的姓名：");
        String player=input.next();

        System.out.println(player+" vs "+roleName);
        System.out.println("要开始吗？（y/n）:");
        String choice=input.next();
        while("y".equals(choice)){
            System.out.println("请出拳：1. 剪刀 2. 石头 3. 布 (输入相应数字) :");
            int playerChoice=input.nextInt();
            System.out.println("你出拳；"+(playerChoice==1?"剪刀":playerChoice==2?"石头":"布"));
            int computerChoice=random.nextInt(3)+1;
            System.out.println(roleName+"出拳；"+(computerChoice==1?"剪刀":computerChoice==2?"石头":"布"));

            if(playerChoice==computerChoice){
                System.out.println("平局");
            }
            else if((playerChoice==1&&computerChoice==3)||(playerChoice==2&&computerChoice==1)||(playerChoice==3&&computerChoice==2)){
                System.out.println("你赢了");
                playerScore++;
            }
            else{
                System.out.println("你输了");
                roleScore++;
            }

            count++;
            System.out.println("是否开始下一轮（y/n）:");
            choice=input.next();
            System.out.println("------------------");
        }

        System.out.println("------------------");
        System.out.println(player+" vs "+roleName);
        System.out.println("对战次数："+count);
        System.out.println(player+"："+playerScore);
        System.out.println(roleName+"："+roleScore);
        if(playerScore==roleScore){
            System.out.println("平局");
        }
        else if(playerScore>roleScore){
            System.out.println("你赢了");
        }
        else{
            System.out.println("你输了");
        }
    }
}