package com.testing.class3_2;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x的值：");
        int x=sc.nextInt();
        if(x > 5 && x<<8-7 >20 || !(x++<15)){
            System.out.println("x的值满足条件");
        }
        System.out.println("IF语句执行完了");

        System.out.println("IF ELSE测试，请输入X的值：");
        x = sc.nextInt();
        if (x==4){
            System.out.println("打麻将去");
        }else {
            System.out.println("打不成不开心");
        }
    }
}
