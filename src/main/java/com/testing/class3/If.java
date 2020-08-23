package com.testing.class3;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        System.out.println("-----------查询年份是否为闰年------");
        int i=1;
        while (i == 1){
            System.out.println("是否开始查询：开始输入\'yes\'，结束输入\'no\'");
            Scanner in=new Scanner(System.in);
            String put = in.nextLine();
            if (put.equals("yes")){
                System.out.println("请输入要查询的年份：");
                Scanner sc=new Scanner(System.in);
                int x=sc.nextInt();
                if (x%4==0 && x%100 == 0){
                    System.out.println(x+"为世纪闰年！");
                }else if (x%4==0){
                    System.out.println(x+"是普通闰年！");
                }else {
                    System.out.println(x+"不是闰年！");
                }
            }else {
                System.out.println("-----------查询结束----------");
                i++;
            }
        }
    }
}
