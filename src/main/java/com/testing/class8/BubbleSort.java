package com.testing.class8;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
    int[] input={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
    System.out.println("input原始数据为：");
    for (int i:input){
        System.out.print(i+" ");
    }
    System.out.println();


    input=BubbleSort(input);
    System.out.println("冒泡排序后的结果：");
    for (int i:input){
        System.out.print(i+" ");
    }

    }

    //冒泡排序方法
    public static int[] BubbleSort(int[] a){
        System.out.println("升序排序请输入1，降序排序请输入2！");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        if (x==1) {
            //lun循环，从0-a.length-1次
            for (int lun = 0; lun < a.length - 1; lun++) {
                //每一轮做什么？
                //下标从0开始到a.length-1 -n 的每个数和它后面的数进行比较
                for (int index = 0; index < a.length - 1 - lun; index++) {
                    //如果这个数比后面的数大，则进行交换
                    if (a[index] > a[index + 1]) {
                        int tmp = a[index];
                        a[index] = a[index + 1];
                        a[index + 1] = tmp;
                    }
                }
            }
        }else if(x==2){
            for (int lun=0;lun<a.length-1;lun++){
                for (int index=0;index<a.length-1-lun;index++){
                    if (a[index] < a[index+1]){
                        int tmp = a[index];
                        a[index] = a[index + 1];
                        a[index + 1] = tmp;
                    }
                }
            }

        }else {
            System.out.println("输入数据错误！");
        }
        return a;
    }
}
