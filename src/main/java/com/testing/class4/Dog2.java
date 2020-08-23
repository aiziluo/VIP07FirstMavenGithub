package com.testing.class4;

public class Dog2 {
    //变量
    int age=0;
    public String name="小狗狗";
    static final String LITTLE_DOG="呜呜";
    static final String BIG_DOG="汪汪";
    static final String OLD_DOG="嗷嗷";

    //默认无参构造函数
    Dog2(){
    }

    //在构造狗的时候，给狗取名字
    public Dog2(String name){
        this.name=name;
    }

    //方法
    //长大
    int growUp(int growAge){
        age+=growAge;
        bark();
        return age;
    }

    //重载同名的方法
    int growUp(){
        age++;
        return age;
    }

    //叫
    void bark(){
        int barktimes=3;
        if(age<3 && age>0){
            System.out.println("小"+name+LITTLE_DOG+"叫"+barktimes+"次");
        }else if(age<6){
            System.out.println("大"+name+BIG_DOG+"叫"+barktimes+"次");
        }else {
            System.out.println("老"+name+BIG_DOG+"叫"+barktimes+"次");
        }
    }

    static void showBark(){
        System.out.println("小狗的叫声是"+LITTLE_DOG);
    }



}
