package com.testing.class9;

//Cat继承自Animal
//          子类          父类
public class Cat extends Animal {
    //扩展的变量
    public int claws=4;
    public String voice="喵";

    //修改继承自父类的变量
    public String type="猫";
    public final String TYPE_ANIMAL="猫猫";

    public Cat(){
        System.out.println("一只猫咪睁开了眼");
    }

    //扩展方法
    public void play(){
        System.out.println("猫会玩毛绒球");
    }

    //修改继承自父类的方法
    public void drink(){
        System.out.println("猫咪不爱喝水");
        System.out.println("喝完再用动物的方法再喝一次");
        super.drink();
    }

    //重载方法名，返回类型，参数列表必须与父类一致
//    public String run() {
//        return "";
//    }


    public void run(int speed){
        System.out.println("猫咪跑的速度："+speed);
    }

    //子类不能重写父类的final方法
//    public final void eat(){

//    }
}
