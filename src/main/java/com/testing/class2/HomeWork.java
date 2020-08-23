package com.testing.class2;

public class HomeWork {
    public static void main(String[] args) {
//        /** 理解自增自减运算（x=1,y=2）
//         *         z = z = x++ * 2 + ++x * 2 + y-- * 2 + --y * 2;
//         *     演算出x，y，z的值，再用代码验证。
//         */
//        int x=1,y=2;
//        //x=1
//        //       1*2 x=2   结果：2
//        //                   3*2  x=3 结果：6
//        //                      y=2  2*2 y=1    结果：4
//        //                                      0*2 y=0 结果：0
//        int  z = x++ * 2 + ++x * 2 + y-- * 2 + --y * 2;
//        System.out.println(z);

        /**
         * 给x赋值，计算如下表达式的结果，以及表达式运算完成后x的值，再通过代码验证。
        * 例如，分别计算 x=4，x=9, x=11时，表达式的结果，与x的值。
	    * x>5&& x<<8-7>20 || !(x++<15)
         */
////        int x=4;
////        //x>5 为false
////        //&& 短路法则，x>5 && x<<8-7>20  结果为false
////        //!(x++<15) 4<15 为true,!为false，x=5
////        // false || false 结果为false
////        System.out.println(x>5 && x<<8-7>20 || !(x++<15));
////        System.out.println(x);
//
//
//
////        int x=9;
////        //x>5  10>5为true
////        //x<<8-7  0000 1010==>0001 0100=20>20为false
////        //&&右边为false，结果为false
////        //!(x++<15) 9<15 为true,!为false，x=10
////        // false || false 结果为false
////
////        System.out.println(x>5&& x<<8-7>20 || !(x++<15));
////        System.out.println(x);
//
//
//
////        int x=11;
////        //x>5  12>5为true
////        //x<<8-7  0000 1100==>0001 1000=24>20为true
////        //true && true 结果为true
////        //||短路法则 结果为true
////        System.out.println(x>5 && x<<8-7>20 || !(x++<15));
////        System.out.println(x);
//
//
//        /**
//         * x=4，x=9, x=11时，下面表达式以及x的结果是什么？
//         * 	x>5||x<<8-7>20 && !(x++<15)
//         */
////        int x=4;
////        //x>5  为false
////        // false || ?  以右为准
////        //x<<8-7>20  0000 0100 ==>0000 1000=8>20  为false
////        //false && ?  为false
////        //false || false 为false
////
////        System.out.println(x>5|x<<8-7>20 && !(x++<15));
//        System.out.println(x);



//        int x=9;
//        //9>5 为true
//        //true || ?  为true
//        System.out.println(x>5||x<<8-7>20 && !(x++<15));
//        System.out.println(x);




        int x=11;
        //x > 5  12>5 ==> true
        //true || ?  为true
        System.out.println(x>5||x<<8-7>20 && !(x++<15));
        System.out.println(x);

    }
}
