package com.testing.class9;

public class AnimalTest {
    public static void main(String[] args) {
        Cat happy=new Cat();
//        System.out.println("happy调用父类的变量和方法----------");
        happy.drink();
        //调用父类的变量和方法
//        System.out.println("happy的眼睛："+happy.eyes);
//        System.out.println("happy的眼睛数是："+happy.getEyes());
//        System.out.println("happyt的类型是："+happy.type);
        System.out.println("happy的TYPE_ANIMAL是："+happy.TYPE_ANIMAL);
//        //调用子类扩展的变量和方法
//        System.out.println("happy调用子类自己扩展的play()方法");
//        happy.play();
//        //调用继承自Animal的run方法
        happy.run();
//        //调用Cat定义的新run方法
//        happy.run(5);

        System.out.println("---------------兔子-----------");
        Rabbit bunny=new Rabbit();
        //bunny不可以调用Cat的play()方法
//        bunny.play();
        System.out.println(bunny.type);
        bunny.drink();
        System.out.println(bunny.type);
        System.out.println(bunny.getOriginType());
        bunny.run();
    }






}
