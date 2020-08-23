package com.testing.class6;
//判断String[] args默认参数大小
public class StringHomeWork {
    public static void main(String[] args) {
        try {
            String s1=args[0];
            String s2=args[1];
            try {
                int i1=Integer.parseInt(s1);
                int i2=Integer.parseInt(s2);
                if (i1>i2){
                    System.out.println("参数1大于参数2！");
                }else if(i1==i2){
                    System.out.println("参数1等于参数2！");
                }else {
                    System.out.println("参数1小于参数2！");
                }
            } catch (NumberFormatException e) {
//                e.printStackTrace();
                System.out.println("请输入两个类型为int的参数！");
            }
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("请输入两个参数！");
        }
    }
}
