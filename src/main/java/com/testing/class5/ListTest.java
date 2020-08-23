package com.testing.class5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> hualist = new ArrayList<>();
        //按照顺序添加到list的尾部
        hualist.add("红烧牛肉");
        hualist.add("烧烤茄子");
        hualist.add("四川火锅");

        System.out.println("for循环遍历");
        for (String i:hualist){
            System.out.print(i+" ");
        }
        System.out.println();

        //增
        //往指定的位置插入元素内容，注意下标从0开始
        hualist.add(1,"老坛酸菜鱼");
        hualist.add("剁椒鱼头");
        System.out.println("新增后遍历");
        for (String i:hualist){
            System.out.print(i+" ");
        }
        System.out.println();

        //删  删除操作会改变list的长度和下标位置，重新排列的。
        //删除下标为1的元素
        System.out.println("+++++++++++删除操作");
        hualist.remove(1);
        hualist.remove("四川火锅");
        for (String i:hualist){
            System.out.print(i+" ");
        }

        //改，由于list有下标，所以可以根据下标来进行修改
        hualist.set(1,"碳烤生蚝");
        System.out.println("+++++++++++修改操作");
        for (String i:hualist){
            System.out.print(i+" ");
        }
        System.out.println();

        //查  get方法
        //可以直接输出
        System.out.println("+++++++++++查操作");
        System.out.println(hualist);
        //遍历方案：
        //1、有下标可以基于下标遍历
        System.out.println("基于下标遍历：");
        for (int index=0;index<hualist.size();index++){
            System.out.println(hualist.get(index));
        }

        //2、foreach循环
        System.out.println("基于foreach遍历：");
        for (String s:hualist){
            System.out.println(s);
        }

        //3、iterator遍历
        System.out.println("iterator 遍历");
        Iterator hualit =hualist.iterator();
        while (hualit.hasNext()){
            System.out.println(hualit.next());
        }

    }
}
