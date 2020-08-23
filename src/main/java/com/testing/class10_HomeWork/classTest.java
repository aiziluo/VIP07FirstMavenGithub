package com.testing.class10_HomeWork;

public class classTest {
    public static void main(String[] args) {
        System.out.println("----------人类---------");
        Human flower=new Human();
        flower.drink();
        flower.drink("fruit juice");
        flower.eat();
        flower.item();
//        mum是私有变量，
//        System.out.println(flower.mum);
        flower.getMum();
        System.out.println(flower.putMum("aa"));

        System.out.println("------------sun----------");
        Animal sun=new Human();
        sun.drink();
        sun.eat();
//        sun.item();
        ((Human) sun).item();

//        Animal mood=new Animal();
//        Human moodshine=(Human)mood;

        Human sunshine=(Human) sun;
        sunshine.item();


        System.out.println("-----------狗-----------");
        Dog xx=new Dog();
        xx.drink();
        xx.eat();
//        xx.item();
    }
}
