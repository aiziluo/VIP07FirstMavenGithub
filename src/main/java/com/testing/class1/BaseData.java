package com.testing.class1;

public class BaseData {
    public static void main(String[] args) {
        //声明变量
        byte a;
        short s;
        int i;
        long l;

        //声明变量，同时赋值
        byte fb=1;
        //同时声明多个变量
        int ia,ib;
        //使用时赋值
        ia=1;
        //同时声明并赋值多个变量
        int iia=3,iib=4;

        System.out.println(fb);
        System.out.println(iia);

        //浮点数，默认是double类型
        //单精度float,小数点后7-8位
        float fa=1.4444444444444444f;
        //双精度double，小数点后15-17位
        double da=1.6666666666666666666;
        System.out.println(fa);
        System.out.println(da);

        boolean ba=true;
        boolean bd=false;

        //字符类型，用''引起为字符，用""引起为字符串
        char ca='a';
        char cb='啊';
        //显示'时，用\进行转义
        char cc='\'';
        System.out.println(ca);
        System.out.println(cb);
        System.out.println(cc);

        //字符的存储格式，按一定方式转为整数
        //java中使用unicode编码，格式/u[4位16进制数]
        //字符可以转换为数字，就是它的编码数位
        //unicode前128个就是ASCII码
        int ic=(int)cc;
        System.out.println(cc);
        System.out.println(ic);

    }
}
