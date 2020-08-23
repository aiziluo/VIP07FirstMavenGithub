package com.testing.class10_HomeWork;

public class Human extends Animal {
    Human(){
        System.out.println("一个人类出生了");
    }

    public void drink(){
        System.out.println("人类喝开水");
    }

    public void drink(String beverage){
        System.out.println("人类喝"+beverage);
    }

    public void item(){
        System.out.println("人类的特色是会使用工具");
    }


}
