package com.testing.class10.AcessTest;

import com.testing.class10.Tester;

public class SonOfTester extends Tester {
    void defaultWork(){
        //不能继承父类的default权限方法
//        相当于新写了一个方法
        System.out.println("测试的儿子尝试去重写用测试的方法");
        System.out.println("不同包中的子类不能继承dafault的方法");
    }

     public void caseModule(){
        System.out.println("xx遗留给儿子的测试用例模板");
}

    public static void main(String[] args) {
        Tester xx=new Tester();
//        xx.defaultWork();
        SonOfTester xxSon=new SonOfTester();
        xxSon.defaultWork();
        xxSon.caseModule();
        //在不同包中，子类中的子类对象可以使用父类的protected方法
        xxSon.manSpirit();
//        父类对象在子类中无法使用protected方法
//        即父类对象在自己的包以外不能使用pretected
//        xx.manSpirit();
        //若是静态的protected方法，父类对象可以在子类中可以使用
        xx.manSpirit();
        xxSon.manSpirit();
        Tester.manSpirit();
    }
}
