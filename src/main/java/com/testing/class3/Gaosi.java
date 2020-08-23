package com.testing.class3;

public class Gaosi {
    public static void main(String[] args) {
        //从1加到100的和
        int sum=0;
        for (int i=1;i<101;i++){
            System.out.println(i);
            sum+=i;
        }
        System.out.println("1-100的和为：" + sum);
    }
}
