package com.testing.class3_2;

public class WhileTest {
    public static void main(String[] args) {
        int i=0;
        int result=0;
        while (i<101){
            result+=i;
            i++;
        }
        System.out.println("result="+result);
    }
}
