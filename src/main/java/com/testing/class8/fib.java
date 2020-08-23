package com.testing.class8;

public class fib {
    public static void main(String[] args) {
        int[] fibArr=fib1(13);
        System.out.println("用数组方式实现斐波那契数列：");
        for (int i:fibArr){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("用递归方式实现斐波那契数列：");
        System.out.println("第n项的值："+fib(13));

    }
    
    //使用数组实现斐波那契数列数列
    //斐波那契数列数列第n项的值：n-1+n-2的值
    //出口条件是第1个为0，第2个为1
    public static int[] fib1(int num){
        int[] a=new int[num];
        a[0]=0;
        a[1]=1;
        for (int i=2;i<a.length;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a;
    }

    //使用递归实现斐波那契数列数列
    public static int fib(int n){
        int result=0;
        if (n==1){
            result=0;
        }else if (n==2){
            result=1;
        }else {
            result=fib(n-1)+fib(n-2);
        }
        return result;
    }
}
