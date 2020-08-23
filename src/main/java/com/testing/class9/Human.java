package com.testing.class9;

public class Human extends Animal {
    public String show="哺乳动物";
    public static final String TYPE="人类";

    public final void trait(){
        System.out.println("人类能使用工具");
    }

    public void drink(){
        System.out.println("人类喝开水");
    }

}
