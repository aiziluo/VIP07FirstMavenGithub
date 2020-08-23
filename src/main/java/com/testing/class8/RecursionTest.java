package com.testing.class8;

public class RecursionTest {
    public static void main(String[] args) {
        System.out.println(jiecheng(5));

    }

    //阶乘 n!=n*(n-1)!  n=1时，结果为1
    public static int jiecheng(int n){
        int result=0;
        if (n==1){
            result=1;
        }else {
            result=n*jiecheng(n-1);
        }
        return result;
    }
}
