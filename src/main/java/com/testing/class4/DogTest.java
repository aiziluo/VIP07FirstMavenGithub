package com.testing.class4;

import java.util.Scanner;

public class DogTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog d = new Dog();
        //小狗的叫法
        d.Puppy();
        //大狗的叫法
        d.Toser();
        //老狗的叫法
        d.OldDog();
        int i=1;
        //循环查看
        while (i==1) {
            System.out.println("请输入狗的超龄：");
            double age = sc.nextDouble();
            d.bark(age);
            Scanner sc1 = new Scanner(System.in);
            System.out.println("继续请按1，结束请按0");
            i = sc1.nextInt();
        }
    }
}
