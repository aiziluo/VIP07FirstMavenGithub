package com.testing.class10;

public class AbstractTest {
    public static void main(String[] args) {
        AbstractC ab=new AbstractC() {
            @Override
            public void silent() {
                System.out.println("我是个不会说话的抽象方法");
            }
        };

        ab.silent();
        ab.sound();

        //创建AbExtends后
        //向上转型
        AbstractC cd=new AbExtends();
        //调用的子类重写的方法
        cd.silent();
        cd.sound();
//        cd.sleep();//向上转型后，子类扩充的方法不可用

        //向下转型
        AbExtends ed=(AbExtends) cd;
        ed.sleep();//子类扩充的方法可用
    }
}
