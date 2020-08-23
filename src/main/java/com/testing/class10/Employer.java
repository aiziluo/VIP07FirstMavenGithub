package com.testing.class10;

public interface Employer {
    //接口中只允许有public static final修改的常量，所以通常变量名直接大写
    //public static final可以省略
    public String TYPE="苦逼的社畜";

    //接口中只允许存在抽象方法
    //必须是public类型，因为需要被其他类实现，接口都是public修饰
//    public void work(){
//
//    }

    public void work();

    //方法的定义同样可以自由指定，返回类型，方法名，参数列表
    String moyu(int time);

    //通常少用
    //可用默认定义的方法，由default来修改
    public default void jiaban(){
        System.out.println("社畜一般是996");
    }

    //java1.8之后，接口中可以有静态方法，需要方法体
    public static void drink(){
        System.out.println("社畜也需要喝水");
    }



}
