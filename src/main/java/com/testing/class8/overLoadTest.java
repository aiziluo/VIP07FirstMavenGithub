package com.testing.class8;

public class overLoadTest {
    public static void main(String[] args) {
        Dog Eric=new Dog();
        System.out.println("未调用方法前age的值："+Eric.age);
        Eric.grow();
        System.out.println("调用grow()方法后age的值："+Eric.age);
        Eric.grow(3);
        System.out.println("调用grow(int)方法后age的值："+Eric.age);
        Eric.grow(4.1);
        System.out.println("调用grow(float)方法后age的值："+Eric.age);
        Eric.grow(1.46);
        System.out.println("调用grow(double)方法后age的值："+Eric.age);
        Eric.grow(1.46,"黄色");
        System.out.println("调用grow(double,string)方法后age的值："+Eric.age);
        System.out.println("调用grow(double,string)方法后hairColor的值："+Eric.hairColor);




    }
}
