package com.testing.class4;

public class PeopleTest {
    public static void main(String[] args) {
        //new一个对象hua,并传值姓名和年龄
        People hua = new People("flower",20);
        //引用静态变量
        System.out.println("引用静态变量：" + People.name);
        System.out.println(hua.name);
        //引用非静态变量
        System.out.println("实例引用非静态变量："+hua.age);
        System.out.println(hua.TYPE);
        //final类型常量无法修改
//        hua.TYPE="dog";

        //调用静态方法
        hua.Eat();
        //调用非静态方法
        hua.FallInLove();

        System.out.println("修改姓名前的值："+hua.getName());
        hua.setName("flower_new");

        System.out.println("修改姓名后的值："+hua.getName());
    }
}

