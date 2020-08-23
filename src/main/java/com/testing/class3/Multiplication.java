package com.testing.class3;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println("9*9显示");
        for (int row=1;row<=9;row++){
            for (int col=1;col<=9;col++){
                System.out.print(col+"×"+row+"="+col*row+"\t");
            }
            System.out.println();
        }

//        System.out.println("左下角显示");
//        for (int row=1;row<=9;row++){
//            for (int col=1;col<=row;col++){
//                System.out.print(col+"×"+row+"="+col*row+"\t");
//            }
//            System.out.println();

//        System.out.println("右下角显示");
//        for (int row=1;row<=9;row++){
//            for (int col=1;col<=9;col++){
//                if (row+col>9){
//                System.out.print(col+"×"+row+"="+col*row+"\t");
//              }else {
//                    System.out.print("      "+"\t");
//                }
//            }
//            System.out.println();

        //去掉两条对角线
        System.out.println("去掉两条对角线");
        for (int row=1;row<=9;row++){
            for (int col=1;col<=9;col++){
//                if(row == col) {
//                    System.out.print("      " + "\t");
//                }
//                else if(row+col==10) {
//                    System.out.print("      " + "\t");
//                }else {
//                    System.out.print(col + "×" + row + "=" + col * row + "\t");
//                }
//        或是
                if(row ==col || row + col ==10){
                    System.out.printf("%6s"," ");
                }else {
//                    %-6s表示右对齐，%6s表示左对齐
//                    System.out.printf("%-6s",col + "×" + row + "=" + col * row + "\t");
                    System.out.printf("%6s",col + "×" + row + "=" + col * row + "\t");
                }

            }
            System.out.println();
        }
        }
}
