package com.testing.class5;

public class ArrayMultiplication {
    public static void main(String[] args) {
        //定义存储99乘法表的数组
        int[][] mul =new int[9][9];
//        for (int[] a:mul){
//            System.out.println(a);
//        }
        //一维数组的个数
        for (int row=0;row<mul.length;row++){
            int[] a=mul[row];
//            System.out.print(a.length+" ");
            System.out.print((row+1)+"\t");
            for (int col=0;col<a.length;col++) {
                mul[row][col] =(row + 1) * (col + 1);
                System.out.print((row+1)+"*"+(col+1)+"="+(row+1)*(col+1)+"\t");
            }
            System.out.println();
        }

    }
}
