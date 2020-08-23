package com.testing.class7;

public class RegexTest {
    public static void main(String[] args) {
        String s="[1, 2, 5, 3, 4, 6, 9, 7, 8, 0]";
//        s=s.replace("1","x");
//        s=s.replace("2","x");
//        for (int i=0;i<5;i++){
//            s=s.replace(i+"","x");
//        }

//        for(int i=1;i<6;i++){
//            s=s.replace(i+"","x");
//        }
        // 正则表达式替换
//        String regex="[1-5]";
//        s=s.replaceAll(regex,"x");
//        System.out.println(s);

//        String FirstRepl=s.replaceFirst(regex,"x");
//        System.out.println(FirstRepl);

//       String[] st= s.split("[,]");
//        String[] st= s.split("[, ]");
//        String[] st= s.split("[\\[,\\]]");
        //或|操作
        String[] st= s.split("[,| \\[ | \\]]");
       for (String stno:st) {
           System.out.println(stno);
       }
    }
}
