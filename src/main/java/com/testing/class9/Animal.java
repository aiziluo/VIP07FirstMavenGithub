package com.testing.class9;

public class Animal extends Thing{
    //变量
    int eyes=2;
    public String type="动物";
    public final String TYPE_ANIMAL="动物之祖";


    //方法
    public Animal(){
        //调用父类的构造方法及传参
        super("会动的");
        System.out.println("动物出生了");
    }

    public int getEyes(){
        return eyes;
    }

    public void drink(){
        System.out.println("动物都会喝水");
    }

    public void run(){
        System.out.println("动物都会动");

    }

    public final void eat(){
        System.out.println("动物都会吃饭");
    }
}
