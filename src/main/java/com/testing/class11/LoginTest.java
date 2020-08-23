package com.testing.class11;

public class LoginTest {
    public static void main(String[] args) {
        LoginSample ls=new LoginSample();
        //1、登录成功
        ls.login("Roy","123456");
        System.out.println(ls.resultMSG);
        //2、用户名长度<3
        //空字符串、空格、null区别
        //空字符串是字符串，长度为1
        // 空格是有分配内存空间，长度为0
        //null是没有分配内存空间
        ls.login(null,"123456");
        ls.login("","123456");
        //3、密码为空
        ls.login("Roy","");
        ls.login("Roy",null);

        //4、用户名长度不是[3,16]
        System.out.println("-------------------用户名长度验证");
        //输入3个空格
        ls.login("   ","123456");
        ls.login("","123456");
        ls.login("ro","123456");
        ls.login("royy","123456");

        //5、密码长度不是[3,16]
        ls.login("Roy","12222222222222222222222222");
        ls.login("Roy","12");
        ls.login("Roy","2");

        //6、用户名密码不正确
        ls.login("royy","123456");

    }
}
