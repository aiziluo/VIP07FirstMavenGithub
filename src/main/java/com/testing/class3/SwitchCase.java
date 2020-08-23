package com.testing.class3;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("根据排名获得奖励：");
        Scanner sc = new Scanner(System.in);
        int course = sc.nextInt();
        switch (course){
            case 1:
                System.out.println("奖励笔记本电脑一台！");
                break;
            case 2:
                System.out.println("奖励现金3000元！");
                break;
            case 3:
                System.out.println("奖励ipad一台！");
                break;
            case 4:
            case 5:
                System.out.println("奖励现金1000元！");
                break;
            default:
                System.out.println("奖励参与奖100元！");
                break;
        }
    }
}
