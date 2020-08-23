package com.testing.class4;

public class People {
    //变量
   static String name="null";    //姓名
    int age=0;    //年龄
    char sex;   //性别
    String skincolor;   //肤色
    static final String TYPE="people";   //种族

    //方法
    //构造方法，带参数，赋值姓名和年龄
    People(String name_new,int age_new){
        name = name_new;
        age = age_new;
    }
    //吃饭方法
    //静态方法中，只能引用静态变量
    static void Eat(){
        System.out.println("本人 "+ name+ " 正在吃饭中……");
    }
    //谈恋爱方法
    //非静态方法中，可以引用静态变量，也可引用非静态变量
    void FallInLove(){
        System.out.println("本人 "+ name + " " + age +" 正在谈恋爱！");
    }
    //返回姓名值
    String getName(){
        return name;
    }

    void setName(String name_new){
        name = name_new;
    }

}
