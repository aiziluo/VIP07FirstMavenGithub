package com.testing.class5;

import java.util.ArrayList;
import java.util.Arrays;

public class ListToArray {
    public static void main(String[] args) {
        //定义一个ia数组
        Integer[] ia = { 1, 2, 3, 5, 4, 6, 9, 7, 8, 0 };
        //  用Arrays.asList(Array)实现转换
        ArrayList<Integer> lb=new ArrayList<>(Arrays.asList(ia));
        System.out.println("Arrays.asList(Array)实现转换");
        System.out.println("直接显示lb的值："+lb);     //list可以直接显示值
        System.out.println("foreach显示lb的值");
        for (int a:lb){
            System.out.print(a+" ");
        }
        System.out.println();

        Integer[] ib=new Integer[lb.size()];
        lb.toArray(ib);
        System.out.println("toArray实现转换");
        System.out.println(ib);     //数组无法直接显示值
        System.out.println("foreach显示ib的值");
        for (int i:ib){
            System.out.print(i+" ");
        }

    }
}
