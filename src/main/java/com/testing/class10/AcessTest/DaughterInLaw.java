package com.testing.class10.AcessTest;

import com.testing.class10.Tester;

public class DaughterInLaw {
    //这个类是儿媳妇
    public static void main(String[] args) {
        SonOfTester xxSon=new SonOfTester();
        //在儿媳面前没有男子气概
        // protected修饰的方法，只能在不同包的子类中使用
        //子类的对象在同一个包
        // 不在同一个包中，不是子类，不可以使用protected方法
//        xxSon.manSpirit();
//        xxSon.manSpirit();
        Tester xx=new Tester();
//        xx.manSpirit();
    }
}
