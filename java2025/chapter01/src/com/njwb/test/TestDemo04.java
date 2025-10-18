package com.njwb.test;


/**
 * @version 1.0
 * @author jz
 */
public class TestDemo04 {
    public static void main(String[] args) {
        //定义mp3的信息
        String brand= "爱国者F928";
        double weight=12.5 ;
        String type= "内置锂电池";
        long price = 499l;


        /*
        *   利用字符串的拼接将多个变量结合在一起
        *   然后使用输出语句进行输出操作
        */
        String mp3Info = "品牌："+brand +"\n重量："+weight+"\n电池类型:"+type+"\n价格:"+price;
        System.out.println(mp3Info);

        System.out.println("--------------------------------------------------");
        String heroName = "韩信";
        //变量不可以同名
        double priceOfHero = 13888;
        int skinNumber= 10 ;
        System.out.println("英雄的名字:"+heroName);

        System.out.println("价格:"+priceOfHero);
        System.out.println("皮肤数量:"+skinNumber);

    }
}
