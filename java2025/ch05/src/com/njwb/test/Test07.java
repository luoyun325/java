package com.njwb.test;

import java.util.*;

public class Test07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String information=null;
        int index=-1;
        int choice = 0 ;
        String[] names = new String[5] ;
        String[] phones = new String[5] ;
        String[] address = new String[5];
        names[0] = "张三";
        phones[0] = "13913318752";
        address[0] = "江苏南京";
        names[1] = "李四";
        phones[1] = "17327875126";
        address[1] = "江苏北京";
        do{
            System.out.println("欢迎进入用户数据管理");
            System.out.println("-----------------------------------------------------");
            System.out.println("1、添加用户信息");
            System.out.println("2、查看所有用户信息");
            System.out.println("3、删除某个用户信息");
            System.out.println("4、修改某个用户信息");
            System.out.println("5、退出");
            System.out.println("-----------------------------------------------------");
            System.out.print("请输入：");
            choice = input.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("请输入姓名：");
                    String name=input.next();
                    System.out.print("请输入电话：");
                    String phone=input.next();
                    System.out.print("请输入地址：");
                    String addresses=input.next();
                    for(int i=0;i<names.length;i++){
                        if(names[i]==null){
                            names[i]=name;
                            phones[i]=phone;
                            address[i]=addresses;
                            break;
                        }
                    }
                    System.out.println("添加成功");
                    continue;
                case 2:
                    for(int i=0;i<names.length;i++){
                        System.out.println(names[i]+"\t\t"+phones[i]+"\t\t"+address[i]);
                    }
                    System.out.println();
                    continue;
                case 3:
                    System.out.print("请输入要删除的信息：");
                    information=input.next();
                    for(int i=0;i<names.length;i++){
                        if(information.equals(names[i])||information.equals(phones[i])||information.equals(address[i])){
                            index=i;
                            names[i]=null;
                            phones[i]=null;
                            address[i]=null;
                            System.out.println("删除成功");
                        }
                    }
                    if(index==-1){
                        System.out.println("未找到改信息");
                    }
                    continue;
                case 4:
                    System.out.print("请输入要修改的信息：");
                    information=input.next();
                    for(int i=0;i<names.length;i++){
                        if(information.equals(names[i])){
                            index=i;
                            System.out.print("请输入修改后的姓名：");
                            names[i]=input.next();
                            System.out.println("修改成功");
                        }
                        else if(information.equals(phones[i])){
                            index=i;
                            System.out.print("请输入修改后的电话：");
                            phones[i]=input.next();
                            System.out.println("修改成功");
                        }
                        else if(information.equals(address[i])){
                            index=i;
                            System.out.print("请输入修改后的地址：");
                            address[i]=input.next();
                            System.out.println("修改成功");
                        }
                    }
                    if(index==-1){
                        System.out.println("未找到改信息");
                    }
                    continue;
                default:
                    break;
            }
            break;
        }while(true) ;
        System.out.println("程序结束");
    }
}