package com.testing.class10;

import com.testing.class9.Animal;
import com.testing.class9.Cat;
import com.testing.class9.Rabbit;

import java.util.*;

public class MultiTest {
    public static void main(String[] args) {
        //父类引用    子类对象
        Animal a=new Cat();
        //向上转型
        Animal b=new Rabbit();
        System.out.println("============");
        //同样类型的对象调用同一个方法，产生了不一样的结果
        a.drink();
        System.out.println("------------");
        b.drink();

        //向上转型产生的效果
        //1、调用方法的时候，子类如果完成了重写，那么调用的是子类重写之后的方法
//        a.drink();
//        b.drink();
        //2、进行了向上转型后，子类扩充的方法，将会被隐藏
        //因为这个时候，已不作为一只特别的动物（猫）了，只有动物的属性
//        a.play();

        System.out.println("***************8");
        Human flower=new Human();
        flower.playWithAnimal(a);
        System.out.println("+++++++++++++");
        flower.playWithAnimal(b);

//        flower.playWithCat(a);
        System.out.println("--------猫------------");
        Cat c=new Cat();
        flower.playWithCat(c);
        //父类对象不能直接转换为子类对象
//        flower.playWithCat(a);
//        flower.playWithCat(c);
        //向上转型之后调用，如果方法调用的是子类对象，那么可以通过强制向下转到来调用
        flower.playWithCat((Cat) a);
        System.out.println("33333333333333333");
        //子类对象在进行调用的时候，如果方法使用的是父类对象，那么调用的子类对象可以自动向上转型为父类对象
        flower.playWithAnimal(c);

        //向下转型 将父类对象转换为子类类型
        Cat downCat=(Cat)a;
        //1、向下转型的时候，调用子类重写的方法时，用的是子类重写的方法
        System.out.println("向下转型---------------");
        downCat.drink();
        //2、对象向下转型后，原本隐藏的扩充方法，可以重新使用
        downCat.play();
        //3、只有子类对象通过向上转型而产生的父类对象，才能向下转型为子类对象




        //父类引用    子类对象
        List li=new ArrayList();
        Set set=new HashSet();
        Set tset=new TreeSet();
    }
}
