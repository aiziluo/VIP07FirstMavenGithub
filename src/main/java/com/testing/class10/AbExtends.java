package com.testing.class10;

public class AbExtends extends AbstractC {
    @Override
    public void silent() {
        System.out.println("我是实现了抽象方法的子类");
    }

    public void sleep(){
        System.out.println("到时间睡觉了");
    }
}
