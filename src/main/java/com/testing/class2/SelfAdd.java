package com.testing.class2;

public class SelfAdd {
    public static void main(String[] args) {
        //自增 ++  自减 --
        int a=3;
        int b=4;
        //后自增，先取值，sout取值时为3，再完成自增a变成4
        System.out.println("后自增过程中的值" + a++);
        //a = 4
        System.out.println("后自增之后的值" + a);
        //前自增，先自增a变成5,后操作
        System.out.println("前自增过程中的值" + ++a);
        //a=6
        System.out.println("前自增之后的值" + a);

        System.out.println("后自减之后的值" + b--);
        System.out.println("前自减之后的值" + --b);

        int x=1;
        //1、x=1
        //2、 ++x  x变成2  算式取值第一个x 为2
        //3、 x=2  ++x  x变成3  算式取值第一个x 为3
        //4、 x=3  ++x  x变成4  算式取值第一个x 为4
        int z = ++x + ++x + ++x;
        //  9    2    3     4
        System.out.println("z的值：" + z);
        System.out.println("x的值：" + x);


        // 1、x=4
        // 2、算式取值4 然后自增 x 变成5
        // 3、算式取值5 然后自增 x 变成6
        // 4、算式取值6 然后自增 x 变成7
        int y = x++ + x++ + x++;
        //  15   4      5    6
        System.out.println("y的值：" + y);
        System.out.println("x的值：" + x);
    }
}
