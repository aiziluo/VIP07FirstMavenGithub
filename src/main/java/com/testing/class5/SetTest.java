package com.testing.class5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        //只指定了存储容器是set，存储的类型是String
        Set<String> huaSet=new HashSet<String>();

        //增
        huaSet.add("一");
        huaSet.add("二");
        huaSet.add("三");
        //可以直接输出
        System.out.println("------------");
        System.out.println(huaSet);

        //删
        huaSet.remove("一");

        //改 ，由于set没有下标。set没有修改的方法。

        //查
        //遍历：没有下标，不能用下标遍历，只能foreach
        for (String s:huaSet){
            System.out.print(s+ " ");
        }
        System.out.println();
        System.out.println("+++++++++++++迭代器遍历：");
        //迭代器遍历：
        Iterator huasit = huaSet.iterator();
        //huasit就可以看成是一个抽奖的人
        //先判断是否还有下一个值
        while (huasit.hasNext()){
            System.out.println(huasit.next());
        }


        //set会去掉重复值
        Set<String> ss=new HashSet<>();
        ss.add("你好");
        ss.add("12");
        ss.add("祖国");
        ss.add("520");
        ss.add("520");
        ss.add("中国");
        Iterator i_ss=ss.iterator();
        while (i_ss.hasNext()){
            System.out.println(i_ss.next());
        }


    }
}
