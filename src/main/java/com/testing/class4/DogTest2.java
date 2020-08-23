package com.testing.class4;

public class DogTest2 {
    public static void main(String[] args) {
        Dog2 xx = new Dog2();
        System.out.println("不带参的构造函数："+ xx.name);
        Dog2 yy= new Dog2("小花");
        System.out.println("带参的构造函数：" + yy.name);
        int nowAge=xx.growUp();
        System.out.println("xx当前年龄："+nowAge);
        nowAge=yy.growUp(5);
        System.out.println("yy当前年龄："+nowAge);
        Dog2.showBark();
    }
}
