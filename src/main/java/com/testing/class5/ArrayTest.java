package com.testing.class5;

import com.testing.class4.Dog2;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        //新增数组元素：数组长度固定。不存在新增，其实就是初始化过程。
        //创建一个长度为6的数组
        int[] ia=new int[6];
        System.out.println(ia);
        //直接赋初值的初始化方式
        int[] ib={11,22,15,18,33,29};
        System.out.println(ib);
        String[] sb=new String[4];
        String[] sa={"星期一","星期二","星期3"};
        //构造自定义类型的数组
        Dog2[] da={new Dog2("小花"),new Dog2("小黑")};
        //构造一个长度为3的Dog数组
        Dog2[] db=new Dog2[3];
        System.out.println("da的值："+da);

        //查
        System.out.println("ib中的第3个数字："+ib[2]);
        //1、通过下标遍历。注意下标从0开始
        System.out.println("赋值之前的ia数组内容");
        //for循环遍历数组
        System.out.println("for循环遍历数组");
        for (int index=0;index<ia.length;index++){
            System.out.print(ia[index]);
        }
        System.out.println();

        for (int index=0;index<sb.length;index++){
            System.out.print(sb[index]);
        }

        for (Dog2 d:db){
            System.out.print(d);
        }
        System.out.println("-------------da------------");
        for (Dog2 d:da){
            System.out.println(d);
            System.out.println(d.name);
        }

        //foreach循环遍历数组
        System.out.println("foreach遍历数组");
        for (int a:ib){
            System.out.print(a+" ");
        }
        System.out.println();


        //改
        ia[0]=3;
        ia[1]=5;
        System.out.println("修改赋值之后的ia数组内容");
        for (int i:ia){
            System.out.print(i+" ");
        }

        System.out.println();
        //Arrays类通过静态方法调用内容。
        //调用静态方法fill，为数组全部填充值为4.
        Arrays.fill(ia,4);
        System.out.println("调用fill之后的ia数组内容");
        for (int i:ia){
            System.out.print(i+" ");
        }
        System.out.println();

        //用Arrays.sort来进行排序
        System.out.println("排序之后的ib");
        Arrays.sort(ib);
        for (int i:ib){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
