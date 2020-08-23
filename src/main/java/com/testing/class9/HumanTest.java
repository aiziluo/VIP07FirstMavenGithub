package com.testing.class9;

public class HumanTest {
    public static void main(String[] args) {
        Human flower=new Human();
        //final变量无法修改
        System.out.println(flower.TYPE_ANIMAL);
        flower.drink();

        System.out.println("-------------xx  Man--------");
        Man xx=new Man();
        System.out.println(xx.TYPE_ANIMAL);
        xx.drink();
        xx.getShow();
    }
}
