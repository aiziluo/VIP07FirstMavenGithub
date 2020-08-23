package com.testing.class3_2;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        System.out.println("WILL恋爱历险记：");
        System.out.println("请输入要送的礼物：");
        Scanner sc = new Scanner(System.in);
        String gift=sc.nextLine();
        //好感度
        int exp=50;
        switch (gift) {
            case "口红":
                System.out.println("WILL送了一个口红");
                exp += 10;
                break;
            case "包":
                System.out.println("WILL送了一个包");
                exp += 30;
                break;
            case "房子":
                System.out.println("WILL送了一个房子");
                exp += 100;
                break;
            default:
                System.out.println("WILL送了个迷之礼物");
                exp-=10;
        }
        System.out.println("好感度为：" + exp);



    }
}
