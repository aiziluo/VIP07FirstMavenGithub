package com.testing.class3;

public class Test {
    public static void main(String[] args) {
        for (int row=1;row<10;row++){
            for (int col=1;col<row+1;col++){
                System.out.print(col + "*" + row + "=" +row*col + "\t");
            }
            System.out.println();
        }

    }
}
