package com.testing.class3_2;

public class ForTest {
    public static void main(String[] args) {
//        int result=0;
//        for (int i=0;i<101;i++){
//            result+=i;
//        }
//        System.out.println("result的值：" + result);
//
        //拆解for循环
        //拆解循环控制变量
//        int i=0;
//        int result=0;
//        for (;i<101;i++){
//            result+=i;
//        }
//        System.out.println("result的值：" + result);

        //拆解i++
//        int result=0;
//        for (int i=0;i<101;){
//            result+=i;
//            i++;
//        }
//        System.out.println("result的值：" + result);

        //拆解判断条件
        int result=0;
        for (int i=0;;i++){
            if (i<101){
                result+=i;
            }
            else{
                break;
            }
        }
        System.out.println("result的值：" + result);
    }
}
