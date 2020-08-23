package com.testing.class10_HomeWork;

public interface lunTai {
    void ganghua();

    void suliao();

    default void xingzhuang(){
        System.out.println("轮胎的形状是圆形的");
    }
}
