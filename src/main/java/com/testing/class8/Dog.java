package com.testing.class8;

public class Dog {
    String hairColor="黑色";
    final String TYPE="中华田园犬";
    int age=0;
    //小狗的叫法
    void Puppy(){
        System.out.println("小狗呜呜叫！");
    }
    //大狗的叫法
    void Toser(){
        System.out.println("大狗汪汪叫！");
    }
    //老狗的叫法
    void OldDog(){
        System.out.println("老狗嗷嗷叫！");
    }

    void Dog(){
    }

    void grow(){
        age++;
    }

    void grow(int ageNew){
        age+=ageNew;
    }

    void grow(float ageNew){
        age+=ageNew;
    }

    void grow(double ageNew){
        age+=ageNew;
    }

    void grow(double ageNew,String hairColorNew){
        age+=ageNew;
        hairColor=hairColorNew;
    }

    //狗叫
    void bark(double age){
        if (age<2 && age >0){
            Puppy();
        }else if(age<10 && age>=2){
            Toser();
        }else {
            OldDog();
        }
    }
}
