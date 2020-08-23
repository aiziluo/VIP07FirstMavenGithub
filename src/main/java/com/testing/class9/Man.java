package com.testing.class9;

public class Man extends Human {
    public static final String TYPE="男人";

  //final方法无法重写
//    public final void trait(){
//
//    }
    public void getShow(){
        System.out.println("Animal中show的值："+super.show);
    }

    public void drink(){
        super.drink();
        System.out.println("男人喝运动饮料");
    }
}
