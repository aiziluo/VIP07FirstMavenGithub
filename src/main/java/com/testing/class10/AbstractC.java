package com.testing.class10;

public abstract class AbstractC {
    public void sound(){
        String kind="抽象";
        //abstract不能修改变量，只能修改方法和类
//        abstract String like="";
        System.out.println("我是一个抽象类中的具体实现方法");
    }

    //抽象方法不能有方法体
//    public abstract void silent(){}
    public abstract void silent();

}
