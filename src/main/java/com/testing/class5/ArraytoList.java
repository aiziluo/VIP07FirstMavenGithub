package com.testing.class5;

import java.util.ArrayList;
import java.util.List;

public class ArraytoList {
    public static void main(String[] args) {
        //定义一个ia数组
        int[] ia = { 1, 2, 3, 5, 4, 6, 9, 7, 8, 0 };
        //定义一个la链表，用于存储ia的值
        List<Integer> la=new ArrayList<>();
        //用for循环将ia的值，存储到la中
        System.out.println("用for循环给la赋值");
        for (int i=0;i<ia.length;i++){
            la.add(ia[i]);
            System.out.print(la.get(i) +" ");
        }
        System.out.println();
        System.out.println("foreach遍历la的值");
        for (int a:la){
            System.out.print(a+" ");
        }
        System.out.println("");


    }
}
