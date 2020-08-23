package com.testing.class3;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("--------显示1到100是的质数------");
        int result=0;
        for (int i=2;i<101;i++){
            int j=2;
            for (;j<i+1;j++){
                if (i%j==0) {
                    break;
                }
                //每个j都要判断一次if
//                if (j==i){
//                    System.out.print(i + " ");
//                    result++;
//                }
            }
            //每个i判断一次if
            if (j==i) {
                System.out.print(i+" ");
                result++;
            }
        }
        System.out.println("1-100总共有："+result+" 个质数！");
    }
}
