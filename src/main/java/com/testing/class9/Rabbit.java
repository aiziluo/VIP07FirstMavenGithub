package com.testing.class9;

//Rabbit继承自Animal
//          子类          父类
public class Rabbit extends Animal {
    public String type="兔子";

    public void drink(){
        System.out.println("兔子喝水");
    }

    public String getOriginType(){
        return super.type;
    }
}
