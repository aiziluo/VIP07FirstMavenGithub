package com.testing.class7;

public class RegexLearn {
    public static void main(String[] args) {
        String java="Java编程";
        String jtest="JJJJ编程";
        String python="python编程";
        String c="c编程";

        //定义正则表达式，也是字符串，表示xx编程
//        String programmingRegex="....编程";

       //正则表达式，以”编程“结束的字符串
//        String programmingRegex=".*编程";

        //正则，4-6个字符
//        String programmingRegex=".{4,6}编程";

        //正则，前面只能出现指定字符才符合条件，
        // []表示一个字符
//        String programmingRegex="[Javpythonc]编程";
        String programmingRegex="[Javpythonc]{4,6}编程";

        //只选出Java而不要JJJJ
        String javaRegex="(Java)编程";
        //（）对组合生效，[]对一个字符生效
        String javaJAVARegex="(Java){4}编程";
        String javatest="JavaJavaJavaJava编程";

        System.out.println(java.matches(javaJAVARegex));
        System.out.println(javatest.matches(javaJAVARegex));


        System.out.println(java.matches(javaRegex));
        System.out.println(jtest.matches(javaRegex));


        System.out.println(java.matches(programmingRegex));
        System.out.println(jtest.matches(programmingRegex));
        System.out.println(python.matches(programmingRegex));
        System.out.println(c.matches(programmingRegex));

    }
}
