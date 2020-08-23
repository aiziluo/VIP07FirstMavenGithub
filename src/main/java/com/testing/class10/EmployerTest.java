package com.testing.class10;

public class EmployerTest {
    public static void main(String[] args) {
        //接口中的静态方法和常量可以直接通过接口名使用
        Employer.drink();
        System.out.println(Employer.TYPE);

//        Employer develop=new Employer() {
//            @Override
//            public void work() {
//
//            }
//
//            @Override
//            public String moyu(int time) {
//                return null;
//            }

        //接口的向上转型
        Employer developer=new Developer();
        System.out.println(developer.moyu(2));
        System.out.println(developer.moyu(3));
        //向上转型后，子类扩展的方法不可用
//        developer.writeBug();
        ((Developer)developer).writeBug();
        developer.work();
        //没有重写过的default方法
        developer.jiaban();

        Employer tester=new Tester();
//        不能使用其他类的私有变量
//        tester.env;
        ((Tester) tester).opEnv();
        //同一个包中可以使用default级别的方法
        ((Tester)tester).dafaultWork();
        tester.moyu(4);
        tester.work();
        //重写过的default方法
        tester.jiaban();



    }
}
