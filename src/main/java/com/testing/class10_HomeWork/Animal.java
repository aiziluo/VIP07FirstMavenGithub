package com.testing.class10_HomeWork;

public class Animal {
    //变量
    final String TYPE="Animal";
    private String mum="动物之祖";

    //构造方法
    public Animal(){
        System.out.println("一只动物出生了");
    }

    //方法
    public void drink(){
        System.out.println("动物都需要喝水");
        System.out.println("人类喝饮用水");
    }

    public void eat(){
        System.out.println("动物都需要吃东西");
    }

    public void getMum(){
        System.out.println("mum:"+mum);
    }

    String putMum(String strMum){
        mum=strMum;
        return mum;
    }

    public static void main(String[] args) {
//        System.out.println(mum);
        Animal flower=new Animal();
        System.out.println(flower.mum);
        System.out.println(flower.putMum("妈咪"));
    }
}
